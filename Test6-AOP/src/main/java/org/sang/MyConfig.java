package org.sang;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by sang on 16-12-12.
 */
@Configuration
@ComponentScan("org.sang")
@EnableAspectJAutoProxy
public class MyConfig {

}
