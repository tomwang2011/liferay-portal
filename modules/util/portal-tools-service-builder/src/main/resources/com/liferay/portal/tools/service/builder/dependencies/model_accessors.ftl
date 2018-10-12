package ${packagePath}.model.impl.hibernate;

import ${apiPackagePath}.model.${entity.name};

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author ${author}
 * @generated
 */
public class ${entity.name}ModelAccessors {

	<#list entity.entityColumns as entityColumn>
		<#if !entityColumn.isCollection() && !entityColumn.entityName?? && (!stringUtil.equals(entityColumn.type, "Blob") || (stringUtil.equals(entityColumn.type, "Blob") && !entityColumn.lazy)) && !stringUtil.equals(entityColumn.name, "mvccVersion")>
			<#assign objType = serviceBuilder.getPrimitiveObj("${entityColumn.type}") />

			public static class ${entityColumn.methodName}Accessor extends ModelPropertyAccessor {

				public ${entityColumn.methodName}Accessor() {
					super(
						new Function<${entity.name}, ${objType}>() {

							@Override
							public ${objType} apply(${entity.name} ${entity.varName}) {
								return ${entity.varName}.get${entityColumn.methodName}();
							}

						},
						new BiConsumer<${entity.name}, ${objType}>() {

							@Override
							public void accept(${entity.name} ${entity.varName}, ${objType} ${entityColumn.name}) {
								${entity.varName}.set${entityColumn.methodName}(${entityColumn.name});
							}

						});
				}

			}
		</#if>
	</#list>

	private ${entity.name}ModelAccessors() {
	}

}