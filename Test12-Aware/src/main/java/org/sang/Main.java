package org.sang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 16-12-14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.output();
        context.close();
    }
}
