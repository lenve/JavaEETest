package org.sang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 16-12-12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.add1();
        annotationService.add2();
        annotationService.add3();
        MethodService methodService = context.getBean(MethodService.class);
        methodService.add();
        context.close();
    }
}
