package com.xjm.service;

import com.xjm.dao.UserDao;
import com.xjm.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}