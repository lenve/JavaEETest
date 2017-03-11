package org.sang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by sang on 17-3-10.
 */
@Configuration
@Component
@PropertySource(value = "classpath:jdbc.properties",encoding = "UTF-8")
public class DBConfig {
    @Value("${db.driverClass}")
    public String driver;
    @Value("${db.url}")
    public String url;
    @Value("${db.username}")
    public String username;
    @Value("${db.password}")
    public String password;
    @Value("${db.initialSize}")
    public int initialSize;
    @Value("${db.maxActive}")
    public int maxActive;
    @Value("${db.maxIdle}")
    public int maxIdle;
    @Value("${db.minIdle}")
    public int minIdle;
    @Value("${db.maxWait}")
    public int maxWait;
}
