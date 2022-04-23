package com.mqx.web;

import com.mqx.config.SpringConfiguration;
import com.mqx.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Userservice userservice = app.getBean(Userservice.class);
        userservice.save();
    }
}
