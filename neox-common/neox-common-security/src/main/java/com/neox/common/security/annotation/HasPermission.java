package com.neox.common.security.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 * 权限注解：用于方法级别的权限控制
 *
 * @author lengleng
 * @date 2025/05/31
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("@pms.hasPermission('{value}'.split(','))")
public @interface HasPermission {

	/**
	 * 权限字符串
	 * @return {@link String[] }
	 */
	String[] value();

}
