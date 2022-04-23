package com.mqx.dao.impl;

import com.mqx.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(username+":save() running"+age);
    }
}
