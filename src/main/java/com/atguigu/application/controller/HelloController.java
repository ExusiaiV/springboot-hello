package com.atguigu.application.controller;

import com.atguigu.application.bean.DataSourceProperties;
import com.atguigu.application.bean.DataSourceProperties2;
import com.atguigu.application.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RestController //组合注解 相当于Controller + ResponseBody
public class HelloController {


    @RequestMapping("hello1")
    public String hello1(){
        return "hello11111";
    }

    @Autowired
    private DataSourceProperties dataSourceProperties;
    @RequestMapping("hello2")
    public String hello2(){
        System.out.println("dataSourceProperties = " + dataSourceProperties);
        return "hello2222";
    }

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;
    @RequestMapping("hello3")
    public String hello3(){
        System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
        return "hello3333";
    }

    @Autowired
    private JdbcProperties jdbcProperties;
    @RequestMapping("hello4")
    public String hell4(){
        System.out.println("jdbcProperties = " + jdbcProperties);
        return "hello44444";
    }

//    @Autowired
    @Resource
    private DataSource dataSource;
    @RequestMapping("hello5")
    public String hell5(){
        System.out.println("dataSource = " + dataSource.getClass().getName());
        return "hello5555";
    }
}
