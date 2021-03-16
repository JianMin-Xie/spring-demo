package com.xjm.test;

import com.xjm.pojo.Student;
import com.xjm.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Panda
 * @create 2021-03-15 22:53
 */
public class MyTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());

    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
