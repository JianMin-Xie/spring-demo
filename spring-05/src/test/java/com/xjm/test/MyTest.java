package com.xjm.test;

import com.xjm.pojo.User;
import com.xjm.pojo.User2;
import com.xjm.pojo.User3;
import com.xjm.pojo.User4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Panda
 * @create 2021-03-15 22:53
 */
public class MyTest {

    @Test
    public void testMethodAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getStr());
        user.getCat().shout();
        user.getDog().shout();
    }

    @Test
    public void testMethodAutowire2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.getStr());
        user.getCat().shout();
        user.getDog().shout();
    }

    @Test
    public void testMethodAutowire3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user2 = (User2) context.getBean("user3");
        System.out.println(user2);
    }

    @Test
    public void testMethodAutowire4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User3 user3 = (User3) context.getBean("user4");
        System.out.println(user3);
    }
    @Test
    public void testMethodAutowire5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User4 user4 = (User4) context.getBean("user5");
        System.out.println(user4);
    }

}
