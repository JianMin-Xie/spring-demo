package com.xjm.service;

/**
 * 需要增加一个日志功能，怎么实现？
 */

//抽象角色：增删改查业务
public interface UserService {
   void add();
   void delete();
   void update();
   void query();
}