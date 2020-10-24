package com.atguigu.application.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//表示是个组件类
//@ConfigurationProperties 批量注入 括号内的值为配置文件中统一的前缀
//前缀和属性名称和配置文件中的key必须要保持一致才可以注入成功
//默认读取application.properties属性文件
//@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperties2 {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperties2{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
