package com.atguigu.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration(是springboot提供的) 等价于 Configuration(是spring提供的)
 *                          用于声明配置类
 * @ComponentScan springboot框架默认的包扫描,默认扫描主程序(带有SpringApplication.run的类)所在包及子包
 *                在其他包 需要额外注释
 * @EnableAutoConfiguration 启动自动配置.
 *                 会自动加载配置类(这些配置类都是框架与第三方集成的配置,框架都提供好了)
 *                      从META-INF/spring.factories(引入的jar包中)中加载
 *                 找 key=org.springframework.boot.autoconfigure.EnableAutoConfiguration=\ 的值 共124个
 *                      springboot2.2.2框架提供了124个自动配置类.
 *                 以Configuration结尾的配置类代表一个xml配置文件  @HttpEncodingAutoConfiguration
 *                      每一个配置类对应一个XxxProperties属性类 HttpProperties  用来封装框架默认配置
 *                      需要修改就用过特定属性名称进行配置  @ConfigurationProperties(prefix = "spring.http")
 *                  124个配置类根据条件注解进行判断: 根据配置的启动器判断哪些注解起作用
 *                      框架提供了很多以@ConditionalOnXxx注解
 * @SpringBootApplication
 * springboot四个核心注释
 */
//默认扫描启动器包及子包
// SpringBoot项目通过main函数启动,这是启动类. 其他类必须和启动类同级包及其子包, 放其他位置需要包扫描( @ComponentScan )
@SpringBootApplication //声明这是一个springboot工程
public class Application {
    public static void main(String[] args) {
        System.out.println("git分支测试");
        SpringApplication.run(Application.class, args);
    }

}
