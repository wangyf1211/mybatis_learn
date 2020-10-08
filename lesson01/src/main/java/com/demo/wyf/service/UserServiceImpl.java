package com.demo.wyf.service;


import com.demo.wyf.dao.UserDao;

public class UserServiceImpl implements UserService {
    // 组合
    private UserDao userDao;

    public  void setUserDao(final UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        this.userDao.getUser();
    }
}