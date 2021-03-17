package com.xjm.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Component("user")
public class User {
   private String name= "谢健民";
}