package org.sang;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sang on 16-12-20.
 */
@Configuration
//@EnableWebMvc//无需使用该注解，否则会覆盖掉SpringBoot的默认配置值
public class WebMVCConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("/hello");
    }

}
