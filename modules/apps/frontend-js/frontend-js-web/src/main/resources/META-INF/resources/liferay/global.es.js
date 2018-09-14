import portlet from './portlet/portlet.es';
import navigate from './util/navigate.es';
import objectToFormData from './util/object_to_form_data.es';
import unescape from './util/unescape.es';

Liferay.Util.navigate = navigate;
Liferay.Util.objectToFormData = objectToFormData;
Liferay.Util.unescape = unescape;

export {portlet};