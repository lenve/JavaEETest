package org.sang;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sang on 17-2-19.
 */
public class Main {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.add();
//        User user2 = (User) context.getBean("user");
//        System.out.println(user2);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user = (User2) context.getBean("user2");
        user.add();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User3 user = (User3) context.getBean("user3");
        user.add();
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User4 user = (User4) context.getBean("user4");
        System.out.println(user);
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User5 user = (User5) context.getBean("user5");
        System.out.println(user);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user = (UserService) context.getBean("userService");
        user.getData();
    }

    @Test
    public void test7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User6 user = (User6) context.getBean("user6");
        user.test();
    }

    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User7 user = (User7) context.getBean("user7");
        user.test();
    }
}
