import dom from 'metal-dom';
import {ClayToast} from 'clay-alert';

/**
 * Function that implements the Toast pattern, which allows to present feedback
 * to user actions as a toast message in the lower left corner of the page
 *
 * @param {string} message The message to show in the toast notification
 * @param {string} title The title associated with the message
 * @param {string} type The type of notification to show. It can be one of the
 * following: 'danger', 'info', 'success', 'warning'
 * @return {ClayToast} The Alert toast created
 * @review
 */

function openToast(
	{
		message = '',
		title = Liferay.Language.get('success'),
		type = 'success'
	}
) {
	var alertContainer = document.getElementById('alertContainer');

	if (!alertContainer) {
		alertContainer = document.createElement('div');
		alertContainer.id = 'alertContainer';

		dom.addClasses(alertContainer, 'alert-notifications alert-notifications-fixed');
		dom.enterDocument(alertContainer);
	}
	else {
		dom.removeChildren(alertContainer);
	}

	const clayToast = new ClayToast(
		{
			autoClose: true,
			destroyOnHide: true,
			events: {
				'disposed': function(event) {
					if (!alertContainer.hasChildNodes()) {
						dom.exitDocument(alertContainer);
					}
				}
			},
			message: message,
			spritemap: themeDisplay.getPathThemeImages() + '/lexicon/icons.svg',
			style: type,
			title: title
		},
		alertContainer
	);

	dom.removeClasses(clayToast.element, 'show');

	requestAnimationFrame(
		function() {
			dom.addClasses(clayToast.element, 'show');
		}
	);

	return clayToast;
}

export {openToast};
export default openToast;