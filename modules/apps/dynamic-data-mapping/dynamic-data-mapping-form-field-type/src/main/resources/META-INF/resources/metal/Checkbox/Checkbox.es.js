import './CheckboxRegister.soy.js';
import 'clay-checkbox';
import 'dynamic-data-mapping-form-field-type/metal/FieldBase/index.es';
import {Config} from 'metal-state';
import Component from 'metal-component';
import Soy from 'metal-soy';

import templates from './Checkbox.soy.js';

/**
 * Checkbox.
 * @extends Component
 */

class Checkbox extends Component {
	static STATE = {

		/**
		 * @default false
		 * @instance
		 * @memberof Checkbox
		 * @type {?bool}
		 */

		editable: Config.bool().value(false),

		/**
		 * @default undefined
		 * @instance
		 * @memberof FieldBase
		 * @type {?(string|undefined)}
		 */

		helpText: Config.string(),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Checkbox
		 * @type {?(string|undefined)}
		 */

		id: Config.string(),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Checkbox
		 * @type {?(string|undefined)}
		 */

		label: Config.string(),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Select
		 * @type {?string}
		 */

		predefinedValue: Config.string().value('Option 1'),

		/**
		 * @default false
		 * @instance
		 * @memberof Checkbox
		 * @type {?bool}
		 */

		required: Config.bool().value(false),

		/**
		 * @default true
		 * @instance
		 * @memberof Checkbox
		 * @type {?bool}
		 */

		showAsSwitcher: Config.bool().value(true),

		/**
		 * @default true
		 * @instance
		 * @memberof Checkbox
		 * @type {?bool}
		 */

		showLabel: Config.bool().value(false),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Checkbox
		 * @type {?(string|undefined)}
		 */

		spritemap: Config.string(),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Checkbox
		 * @type {?(bool)}
		 */

		value: Config.bool().value(true),

		/**
		 * @default undefined
		 * @instance
		 * @memberof Checkbox
		 * @type {?(string|undefined)}
		 */

		key: Config.string()
	};

	_handleToggleChanged(event) {
		const {key} = this;

		this.emit(
			'fieldEdited',
			{
				key,
				originalEvent: event,
				value: event.delegateTarget.checked
			}
		);
	}
}

Soy.register(Checkbox, templates);

export default Checkbox;