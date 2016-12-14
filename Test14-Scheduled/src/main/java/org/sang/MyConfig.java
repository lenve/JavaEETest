package org.sang;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by sang on 16-12-14.
 */
@Configuration
@ComponentScan("org.sang")
@EnableScheduling//开启对计划任务的支持
public class MyConfig {
}
