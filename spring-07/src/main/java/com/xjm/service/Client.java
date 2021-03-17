package com.xjm.service;

public class Client {
   public static void main(String[] args) {
       /**
        * 在不改变原来的代码的情况下，实现了对原有功能的增强，这是AOP中最核心的思想！！！
        */
//       //真实业务
//       UserServiceImpl userService = new UserServiceImpl();
//       //代理类
//       UserServiceProxy proxy = new UserServiceProxy();
//       //使用代理类实现日志功能！
//       proxy.setUserService(userService);
//
//       proxy.add();

       test2();


   }

   public static void test2(){
       //真实对象
       UserServiceImpl userService = new UserServiceImpl();
       //代理对象的调用处理程序
       ProxyInvocationHandler pih = new ProxyInvocationHandler();
       pih.setTarget(userService); //设置要代理的对象
       UserService proxy = (UserService)pih.getProxy(); //动态生成代理类！
       proxy.delete();
   }


}