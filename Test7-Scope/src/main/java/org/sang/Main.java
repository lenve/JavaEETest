package org.sang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 16-12-13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ScopeTest bean1 = context.getBean(ScopeTest.class);
        ScopeTest bean2 = context.getBean(ScopeTest.class);
        System.out.println(bean1.equals(bean2));
        context.close();
    }
}
