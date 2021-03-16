package com.xjm.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Panda
 * @create 2021-03-17 2:01
 */
public class User3 {
    /**
     * @Autowired+@Qualifier （二者都要！！！）
     * 1. @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
     * 2. 不能单独使用。
     */
    @Autowired
    @Qualifier(value = "cat2")
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog2")
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
