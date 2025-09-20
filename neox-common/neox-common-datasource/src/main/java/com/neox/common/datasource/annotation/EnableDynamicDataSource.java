package com.neox.common.datasource.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.neox.common.datasource.DynamicDataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 开启动态数据源注解
 * <p>
 * 用于启用动态数据源自动配置功能
 *
 * @author lengleng
 * @date 2025/07/14
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(DynamicDataSourceAutoConfiguration.class)
public @interface EnableDynamicDataSource {

}
