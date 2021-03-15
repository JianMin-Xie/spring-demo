package com.xjm.test;

import com.xjm.dao.UserDaoMySqlImpl;
import com.xjm.pojo.Hello;
import com.xjm.service.UserService;
import com.xjm.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Panda
 * @create 2021-03-15 22:53
 */
public class MyTest {

    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

    /**
     * 以前所有东西都是由程序去进行控制创建 , 而现在是由我们自行控制创建对象 ,
     * 把主动权交给了调用者 . 程序不用去管怎么创建,怎么实现了 . 它只负责提供一个接口 .
     */
    @Test
    public void test2(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
//        service.setUserDao( new UserDaoOracleImpl() );
//        service.getUser();
    }

    @Test
    public void test3(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }
}
