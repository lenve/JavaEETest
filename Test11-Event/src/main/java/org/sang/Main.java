package org.sang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 16-12-13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoPublish demoPublish = context.getBean(DemoPublish.class);
        demoPublish.publish("Hello sang !");
        context.close();
    }
}
