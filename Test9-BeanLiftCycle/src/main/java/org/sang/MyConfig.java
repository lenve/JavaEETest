package org.sang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sang on 16-12-13.
 */
@Configuration
public class MyConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
