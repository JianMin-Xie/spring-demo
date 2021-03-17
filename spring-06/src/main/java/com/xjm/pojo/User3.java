package com.xjm.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


/**
 * @Component三个衍生注解
 *
 * 为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。
 *
 * @Controller：web层
 *
 * @Service：service层
 *
 * @Repository：dao层
 */
@Controller("user")
@Scope("prototype")
public class User3 {
   @Value("谢健民")
   public String name;
}