AUI.add(
	'liferay-ddm-form-builder-render-rule',
	function(A) {
		var CSS_CAN_REMOVE_ITEM = A.getClassName('can', 'remove', 'item');

		var SoyTemplateUtil = Liferay.DDM.SoyTemplateUtil;

		var FormBuilderRenderRule = A.Component.create(
			{
				ATTRS: {
					builder: {
						value: {}
					},

					fields: {
						value: []
					},

					getDataProviders: {
						value: []
					},

					logicOperator: {
						value: 'or'
					},

					pages: {
						value: 0
					},

					roles: {
						value: []
					},

					ruleStored: {
						value: false
					},

					strings: {
						value: {
							actions: Liferay.Language.get('actions'),
							and: Liferay.Language.get('and'),
							autofill: Liferay.Language.get('autofill'),
							calculate: Liferay.Language.get('calculate'),
							cancel: Liferay.Language.get('cancel'),
							condition: Liferay.Language.get('condition'),
							description: Liferay.Language.get('define-condition-and-action-to-change-fields-and-elements-on-the-form'),
							do: Liferay.Language.get('do'),
							enable: Liferay.Language.get('enable'),
							if: Liferay.Language.get('if'),
							jumpToPage: Liferay.Language.get('jump-to-page'),
							or: Liferay.Language.get('or'),
							otherField: Liferay.Language.get('other-field'),
							require: Liferay.Language.get('require'),
							save: Liferay.Language.get('save'),
							show: Liferay.Language.get('show'),
							the: Liferay.Language.get('the'),
							title: Liferay.Language.get('rule'),
							value: Liferay.Language.get('value')
						}
					}
				},

				AUGMENTS: [
					Liferay.DDM.FormBuilderRenderRuleCondition
				],

				NAME: 'liferay-ddm-form-builder-render-rule',

				prototype: {
					initializer: function() {
						var instance = this;

						instance._actions = {};

						instance._conditions = {};

						var builder = instance.get('builder');

						instance._actionFactory = new Liferay.DDM.FormBuilderActionFactory(
							{
								bubbleTargets: [instance],
								builder: builder,
								fields: instance.get('fields'),
								getDataProviders: instance.get('getDataProviders'),
								pages: instance.get('pages')
							}
						);

						instance._validator = new Liferay.DDM.FormBuilderRuleValidator();
					},

					bindUI: function() {
						var instance = this;

						var boundingBox = instance.get('boundingBox');

						boundingBox.delegate('click', A.bind(instance._handleAddActionClick, instance), '.form-builder-rule-add-action');
						boundingBox.delegate('click', A.bind(instance._handleCancelClick, instance), '.form-builder-rule-settings-cancel');
						boundingBox.delegate('click', A.bind(instance._handleDeleteActionClick, instance), '.action-card-delete');
						boundingBox.delegate('click', A.bind(instance._handleSaveClick, instance), '.form-builder-rule-settings-save');

						A.one('body').delegate('click', A.bind(instance._handleFormBuilderClick, instance), '#' + Liferay.DDM.Settings.portletNamespace + 'showForm');

						instance.after(instance._toggleDeleteActionButton, instance, '_addAction');
						instance.after(instance._validateRule, instance, '_addCondition');

						instance.after('fieldsChange', A.bind(instance._afterFieldsChange, instance));
						instance.after('pagesChange', A.bind(instance._afterPagesChange, instance));

						instance.after('*:valueChange', A.bind(instance._afterValueChange, instance));

						instance.on('*:valueChange', A.bind(instance._handleActionChange, instance));
						instance.on('*:valueChange', A.bind(instance._handleActionUpdates, instance));
					},

					createSelectField: function(context) {
						var instance = this;

						var config = A.merge(
							context,
							{
								bubbleTargets: [instance],
								context: A.clone(context)
							}
						);

						return new Liferay.DDM.Field.Select(config);
					},

					createTextField: function(context) {
						var instance = this;

						var config = A.merge(
							context,
							{
								bubbleTargets: [instance],
								context: A.clone(context)
							}
						);

						return new Liferay.DDM.Field.Text(config);
					},

					render: function(rule) {
						var instance = this;

						var contentBox = instance.get('contentBox');

						if (!rule) {
							rule = {
								actions: [],
								conditions: []
							};
						}

						instance.set('logicOperator', rule['logical-operator'] || instance.get('logicOperator'));

						contentBox.setHTML(instance._getRuleContainerTemplate(rule));

						instance._conditionsIndexes = [];
						instance._actionsIndexes = [];

						instance._renderConditions(rule.conditions);
						instance._renderActions(rule.actions);

						instance._validateRule();

						instance.set('ruleStored', false);

						instance._updateLogicOperatorEnableState();

						return FormBuilderRenderRule.superclass.render.apply(instance, []);
					},

					_addAction: function(index, action) {
						var instance = this;

						var contentBox = instance.get('contentBox');

						instance._createActionSelect(index, action, contentBox.one('.action-' + index));

						instance._actionsIndexes.push(A.Lang.toInt(index, 10));
					},

					_afterFieldsChange: function(event) {
						var instance = this;

						instance._actionFactory.set('fields', event.newVal);
					},

					_afterPagesChange: function(event) {
						var instance = this;

						instance._actionFactory.set('pages', event.newVal);
					},

					_afterValueChange: function() {
						var instance = this;

						instance._validateRule();
					},

					_canDeleteCondition: function() {
						var instance = this;

						return instance._conditionsIndexes.length > 1;
					},

					_createActionSelect: function(index, action, container) {
						var instance = this;

						var value = [];

						if (action && action.action) {
							value = [action.action];
						}

						var field = instance.createSelectField(
							{
								fieldName: index + '-target',
								options: instance._getActionOptions(),
								showLabel: false,
								value: value,
								visible: true
							}
						);

						field.render(container);

						if (value.length) {
							instance._createTargetSelect(index, value[0], action);
						}

						instance._actions[index + '-target'] = field;
					},

					_createTargetSelect: function(index, type, action) {
						var instance = this;

						var contentBox = instance.get('contentBox');

						var container = contentBox.one('.form-builder-rule-action-container-' + index);

						container.one('.target-' + index).empty();

						container.one('.additional-info-' + index).empty();

						var target = instance._actionFactory.createAction(type, index, action, container);

						target.render(container);

						target.conditionChange(instance._getConditionSelectedFieldsPage());

						if (action && action.target) {
							target.set('value', action.target);
						}

						instance._actions[index + '-action'] = target;
					},

					_getActionOptions: function() {
						var instance = this;

						var actions = [];
						var pages = instance.get('pages');
						var strings = instance.get('strings');

						actions.push(
							{
								label: strings.show,
								value: 'show'
							}
						);

						actions.push(
							{
								label: strings.enable,
								value: 'enable'
							}
						);

						actions.push(
							{
								label: strings.require,
								value: 'require'
							}
						);

						actions.push(
							{
								label: strings.autofill,
								value: 'auto-fill'
							}
						);

						if (pages.length > 2) {
							actions.push(
								{
									label: strings.jumpToPage,
									value: 'jump-to-page'
								}
							);
						}

						actions.push(
							{
								label: strings.calculate,
								value: 'calculate'
							}
						);

						return actions;
					},

					_getActions: function() {
						var instance = this;

						var actions = [];

						var indexes = instance._actionsIndexes;

						for (var i = indexes.length - 1; i >= 0; i--) {
							var currentIndex = indexes[i];

							var targetAction = instance._actions[currentIndex + '-action'];

							actions.push(
								A.merge(
									{
										action: instance._actions[currentIndex + '-target'].getValue()[0] || ''
									},
									targetAction ? targetAction.getValue() : undefined
								)
							);
						}

						return actions;
					},

					_getConditionSelectedFieldsPage: function() {
						var instance = this;

						var pages = [];

						for (var conditionKey in instance._conditions) {
							if (!!conditionKey.match('-condition-second-operand-select') || !!conditionKey.match('-condition-first-operand')) {
								var fieldName = instance._getSelectFieldFirstValue(instance._conditions[conditionKey]);

								if (fieldName && fieldName != 'user') {
									pages.push(instance._getFieldPageIndex(fieldName));
								}
							}
						}

						return pages;
					},

					_getFieldDataType: function(fieldName) {
						var instance = this;

						var field = instance.get('fields').find(
							function(field) {
								return field.value === fieldName;
							}
						);

						if (field) {
							return field.dataType;
						}

						return fieldName.toLowerCase();
					},

					_getFieldPageIndex: function(fieldName) {
						var instance = this;

						var field = instance.get('fields').find(
							function(field) {
								return field.value === fieldName;
							}
						);

						return field.pageIndex;
					},

					_getOptionsLabel: function(field, optionValue) {
						var instance = this;

						var option = field.get('options').find(
							function(currentOption) {
								return currentOption.value === optionValue;
							}
						);

						return option && option.label;
					},

					_getRuleContainerTemplate: function(rule) {
						var instance = this;

						var settingsTemplateRenderer = SoyTemplateUtil.getTemplateRenderer('DDMRule.render');

						var container = document.createDocumentFragment();

						new settingsTemplateRenderer(
							{
								actions: rule ? rule.actions : [],
								conditions: rule ? rule.conditions : [],
								deleteIcon: Liferay.Util.getLexiconIconTpl('trash', 'icon-monospaced'),
								invalid: !instance._isValidRule(rule),
								logicalOperator: instance.get('logicOperator').toLowerCase(),
								plusIcon: Liferay.Util.getLexiconIconTpl('plus', 'icon-monospaced'),
								showLabel: false,
								strings: instance.get('strings')
							},
							container
						);

						return container.firstChild.outerHTML;
					},

					_getSelectFieldFirstValue: function(selectField) {
						var instance = this;

						var value = selectField.getValue();

						return value[0] || '';
					},

					_handleActionChange: function(event) {
						var instance = this;

						var field = event.target;

						var fieldName = field.get('fieldName');

						if (fieldName && fieldName.match('-target')) {
							var index = fieldName.split('-')[0];

							instance._createTargetSelect(index, event.newVal[0]);
						}
					},

					_handleActionUpdates: function(event) {
						var instance = this;

						var field = event.target;

						var fieldName = field.get('fieldName');

						if (field.getValue() && fieldName &&
							(fieldName.match('-condition-first-operand') ||
							fieldName.match('-condition-second-operand-select'))) {
							for (var key in instance._actions) {
								var action = instance._actions[key];

								if (key.match('-action') && action.get('type') === 'jump-to-page') {
									action.conditionChange(instance._getConditionSelectedFieldsPage());
								}
							}
						}
					},

					_handleAddActionClick: function() {
						var instance = this;

						var actionListNode = instance.get('boundingBox').one('.liferay-ddm-form-builder-rule-action-list');

						var index = instance._actionsIndexes[instance._actionsIndexes.length - 1] + 1;

						var strings = instance.get('strings');

						var actionTemplateRenderer = SoyTemplateUtil.getTemplateRenderer('DDMRule.action');

						var container = document.createDocumentFragment();

						new actionTemplateRenderer(
							{
								deleteIcon: Liferay.Util.getLexiconIconTpl('trash', 'icon-monospaced'),
								do: strings.do,
								index: index
							},
							container
						);

						actionListNode.append(container.firstChild.outerHTML);

						instance._addAction(index);

						instance._validateRule();
					},

					_handleCancelClick: function() {
						var instance = this;

						instance.fire(
							'cancelRule'
						);

						instance.set('ruleStored', true);
					},

					_handleDeleteActionClick: function(event) {
						var instance = this;

						var index = event.currentTarget.getData('card-id');

						if (instance._actionsIndexes.length > 1) {
							var action = instance._actions[index + '-action'];

							if (action) {
								instance._actions[index + '-action'].destroy();
							}
							else {
								instance._actions[index + '-target'].destroy();

								instance.get('boundingBox').one('.form-builder-rule-action-container-' + index).remove(true);
							}

							delete instance._actions[index + '-action'];
							delete instance._actions[index + '-target'];

							var actionIndex = instance._actionsIndexes.indexOf(Number(index));

							if (actionIndex > -1) {
								instance._actionsIndexes.splice(actionIndex, 1);
							}
						}

						instance._toggleDeleteActionButton();

						instance._validateRule();
					},

					_handleFormBuilderClick: function() {
						var instance = this;

						var actions = {};
						var conditions = {};
						var logicalOperator = '';

						if (!instance.get('ruleStored')) {
							actions = instance._getActions();
							conditions = instance._getConditions();
							logicalOperator = instance.get('logicOperator');
						}

						instance.fire(
							'saveRuleDraft',
							{
								actions: actions,
								conditions: conditions,
								'logical-operator': logicalOperator
							}
						);
					},

					_handleSaveClick: function() {
						var instance = this;

						if (!instance._isButtonEnabled()) {
							return;
						}

						instance.fire(
							'saveRule',
							{
								actions: instance._getActions(),
								conditions: instance._getConditions(),
								'logical-operator': instance.get('logicOperator')
							}
						);

						instance.set('ruleStored', true);
					},

					_isButtonEnabled: function() {
						var instance = this;

						var contentBox = instance.get('contentBox');

						var saveButton = contentBox.one('.form-builder-rule-settings-save');

						return !saveButton.hasAttribute('disabled');
					},

					_isValidRule: function(rule) {
						var instance = this;

						var validator = instance._validator;

						return validator.isValidRule(rule);
					},

					_renderActions: function(actions) {
						var instance = this;

						var actionsLength = actions.length;

						for (var i = 0; i < actionsLength; i++) {
							instance._addAction(i, actions[i]);
						}

						if (instance._actionsIndexes.length === 0) {
							instance._addAction(0);
						}
					},

					_toggleDeleteActionButton: function() {
						var instance = this;

						var contentBox = instance.get('contentBox');

						var actionList = contentBox.one('.liferay-ddm-form-builder-rule-action-list');

						var actionItems = actionList.all('.timeline-item');

						actionList.toggleClass(CSS_CAN_REMOVE_ITEM, actionItems.size() > 2);
					},

					_validateRule: function() {
						var instance = this;

						var contentBox = instance.get('contentBox');

						var saveButton = contentBox.one('.form-builder-rule-settings-save');

						var rule = {
							actions: instance._getActions(),
							conditions: instance._getConditions(),
							'logical-operator': instance.get('logicOperator')
						};

						if (instance._isValidRule(rule)) {
							saveButton.removeAttribute('disabled');
						}
						else {
							saveButton.setAttribute('disabled', '');
						}
					}
				}
			}
		);

		Liferay.namespace('DDM').FormBuilderRenderRule = FormBuilderRenderRule;
	},
	'',
	{
		requires: ['liferay-ddm-form-builder-render-rule-condition', 'liferay-ddm-form-renderer-field']
	}
);