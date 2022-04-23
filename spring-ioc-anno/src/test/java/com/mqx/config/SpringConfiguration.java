package com.mqx.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置文件
//     <context:component-scan base-package="com.mqx"/>
@Configuration  //卧槽这个可以取代那个spring的xml配置文件了
@ComponentScan("com.mqx")
@Import(DataSourseConfiguration.class)  //加载其他分散的类配置文件
public class SpringConfiguration {


}
