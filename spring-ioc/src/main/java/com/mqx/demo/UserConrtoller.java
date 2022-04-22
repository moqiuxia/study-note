package com.mqx.demo;

import com.mqx.service.UserService;
import com.mqx.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserConrtoller {
    public static void main(String[] args) {
        /*1、UserService userService = new UserServiceImpl();
        userService.save();*/


        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
