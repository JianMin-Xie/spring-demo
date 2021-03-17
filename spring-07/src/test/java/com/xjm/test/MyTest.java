package com.xjm.test;

import com.xjm.pojo.Host;
import com.xjm.pojo.ProxyInvocationHandler;
import com.xjm.pojo.Rent;
import org.junit.Test;

/**
 * @author Panda
 * @create 2021-03-15 22:53
 */
public class MyTest {

    @Test
    public void test(){
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host); //将真实角色放置进去！
        Rent proxy = (Rent)pih.getProxy(); //动态生成对应的代理类！
        proxy.rent();
    }


}
