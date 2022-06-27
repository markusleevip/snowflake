package com.mark.snowflake;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: Mark
 */
@Data
@ConfigurationProperties(prefix = "mark.snowflake")
public class SnowflakeProperties {

    private Long machineId;
    private Long dataCenterId;
}
