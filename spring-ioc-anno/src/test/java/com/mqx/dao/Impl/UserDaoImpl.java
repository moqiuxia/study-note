package com.mqx.dao.Impl;

import com.mqx.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//     <bean id="userDao" class="com.mqx.dao.Impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running");
    }
}
