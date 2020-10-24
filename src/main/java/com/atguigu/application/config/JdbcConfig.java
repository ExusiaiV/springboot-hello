package com.atguigu.application.config;

import com.atguigu.application.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration //声明配置类
public class JdbcConfig {

    /**
     * jdbc配置文件是一个4属性+1属性的复合配置
     * spring.jdbc.datasource的4条属性不能和下面的type属性一起注入,需要先把4条属性整合注入成单独一个类,再和type一起注入
     * 这个方法相当于创建新的bean对象并注入
     */
    @Bean //声明一个bean对象
    @ConfigurationProperties("spring.jdbc.datasource") //批量注入
    public DataSourceProperties3 createDataSource3(){
        return new DataSourceProperties3();
    }
}
