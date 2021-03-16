package com.xjm.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author Panda
 * @create 2021-03-17 2:01
 */
public class User4 {
    /**
     * @Resource
     * 1. @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
     * 2. 其次再进行默认的byName方式进行装配；
     * 3. 如果以上都不成功，则按byType的方式自动装配。
     * 4. 都不成功，则报异常。
     */
    @Resource(name = "cat2")
    private Cat cat;
    @Resource
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
