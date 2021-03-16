package com.xjm.test;

import com.xjm.pojo.User;
import com.xjm.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Panda
 * @create 2021-03-15 22:53
 */
public class MyTest {

    /**
     * IOC创建对象方式:
     *  1.通过无参构造方法来创建
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }

    /**
     * 2.通过有参构造方法来创建
     */
    @Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT) context.getBean("userT");
        user.show();
    }
}
