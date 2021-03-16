package com.xjm.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Panda
 * @create 2021-03-17 2:01
 */
public class User2 {
    /**
     * @Autowired
     * 1. 是按类型自动转配的，不支持id匹配。
     * 2. 需要导入 spring-aop的包！
     * 3. @Autowired(required=false)  说明：false，对象可以为null；true，对象必须存对象，不能为null。
     */
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String str;

    public Cat getCat() {
        return cat;
    }
    public Dog getDog() {
        return dog;
    }
    public String getStr() {
        return str;
    }
}
