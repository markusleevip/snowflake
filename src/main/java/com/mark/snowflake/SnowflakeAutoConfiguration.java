package com.mark.snowflake;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author: Mark
 */
@Configuration
@EnableConfigurationProperties(SnowflakeProperties.class)
public class SnowflakeAutoConfiguration implements DisposableBean {

    @Resource
    private SnowflakeProperties snowflakeProperties;

    @Bean
    @ConditionalOnMissingBean
    public SnowflakeManager snowflakeManager() {
        return new SnowflakeManager(this.snowflakeProperties.getMachineId(), this.snowflakeProperties.getDataCenterId());
    }

    @Override
    public void destroy() {

    }
}
