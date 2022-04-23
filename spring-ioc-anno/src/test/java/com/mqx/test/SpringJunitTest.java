package com.mqx.test;

import com.mqx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring的一个内核去跑
@ContextConfiguration("classpath:applicationContext.xml")//配置文件位置

public class SpringJunitTest {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        System.out.println(dataSource);
        userService.save();
    }
}
