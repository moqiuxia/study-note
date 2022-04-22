package com.mqx.service.impl;

import com.mqx.dao.UserDao;
import com.mqx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

   /* //set方法
    public void setUserDao1(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public void save() {
        /*2、ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();*/


        userDao.save();
    }
}
