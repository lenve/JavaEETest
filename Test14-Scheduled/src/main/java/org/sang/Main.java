package org.sang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sang on 16-12-14.
 */
public class Main {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
        System.out.println("当前时间:"+FORMAT.format(new Date()));
    }
}
