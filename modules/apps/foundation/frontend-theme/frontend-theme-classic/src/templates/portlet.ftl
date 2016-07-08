<#assign portlet_content_css_class = "portlet-content">

<#assign portlet_id = htmlUtil.escapeAttribute(portletDisplay.getId())>

<section class="portlet" id="portlet_${portlet_id}">
	<#if portletDisplay.isPortletDecorate() && !portletDisplay.isStateMax() && portletDisplay.getPortletConfigurationIconMenu()?? && portletDisplay.getPortletToolbar()??>
		<#assign portlet_display_root_portlet_id = htmlUtil.escapeAttribute(portletDisplay.getRootPortletId())>

		<#assign portlet_configuration_icons = portletDisplay.getPortletConfigurationIconMenu().getPortletConfigurationIcons(portlet_display_root_portlet_id, renderRequest, renderResponse)>

		<#assign portlet_title_menus = portletDisplay.getPortletToolbar().getPortletTitleMenus(portlet_display_root_portlet_id, renderRequest, renderResponse)>

		<#if (portlet_configuration_icons?has_content || portlet_title_menus?has_content)>
			<header class="portlet-topper">
				<div class="portlet-title-default">
					<span class="portlet-name-text">${htmlUtil.escape(portletDisplay.getPortletDisplayName())}</span>
				</div>

				<#foreach portletTitleMenu in portlet_title_menus>
					<menu class="portlet-topper-toolbar" id="portlet-title-menu_${portlet_id}_${portletTitleMenu_index}" type="toolbar">
						<@liferay_ui["menu"] menu=portletTitleMenu />
					</menu>
				</#foreach>

				<#if portlet_configuration_icons?has_content>
					<menu class="portlet-topper-toolbar" id="portlet-topper-toolbar_${portlet_id}" type="toolbar">
						<@liferay_portlet["icon-options"] portletConfigurationIcons=portlet_configuration_icons />
					</menu>
				</#if>
			</header>

			<#assign portlet_content_css_class = portlet_content_css_class + " portlet-content-editable">
		</#if>
	</#if>

	<div class="${portlet_content_css_class}">
		<#if portletDisplay.isShowBackIcon()>
			<a class="icon-monospaced portlet-icon-back text-default" href="${htmlUtil.escapeHREF(portletDisplay.getURLBack())}" title="<@liferay.language key="return-to-full-page" />">
				<span class="icon-angle-left"></span>
			</a>
		</#if>

		<#if portletDisplay.getPortletDecoratorId() != "barebone">
			<h2 class="portlet-title-text">${htmlUtil.escape(portletDisplay.getTitle())}</h2>
		</#if>

		${portletDisplay.writeContent(writer)}
	</div>
</section>