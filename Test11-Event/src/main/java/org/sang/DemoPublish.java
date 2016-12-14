package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by sang on 16-12-13.
 */
@Component
public class DemoPublish{
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
