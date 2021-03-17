package com.xjm.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 属性注入
 */

// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Component("user2")
public class User2 {
   // 相当于配置文件中 <property name="name" value="谢健民"/>
   // @Value("谢健民")
   private String name;

   //如果提供了set方法，在set方法上添加@value("值");
   @Value("谢健民")
   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
}