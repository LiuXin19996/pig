package com.neox.common.seata.config;

import com.neox.common.core.factory.YamlPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Seata 自动配置类
 *
 * @author lengleng
 * @date 2025/05/31
 */
@PropertySource(value = "classpath:seata-config.yml", factory = YamlPropertySourceFactory.class)
@Configuration(proxyBeanMethods = false)
public class SeataAutoConfiguration {

}
