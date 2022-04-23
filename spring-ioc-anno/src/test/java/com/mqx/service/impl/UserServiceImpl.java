package com.mqx.service.impl;

import com.mqx.dao.UserDao;
import com.mqx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/*
<bean id="userService" class="com.mqx.service.impl.UserServiceImpl">
<property name="userDao" ref="userDao"></property>
</bean>
*/
//@component("userService")
@Service("userService")
public class UserServiceImpl implements UserService{

    //容器中已经加载了jdbc.properties文件
    @Value("${jdbc.driver}")
    private String driver;

    // <property name="userDao" ref="userDao"></property>
    @Autowired // 按照数据类型在容器中匹配
    @Qualifier("userDao") //根据容器中的id去匹配的
    private UserDao userDao;

    //用了注解之后有没有这一行都可以
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println(driver);
        userDao.save();
    }
}
