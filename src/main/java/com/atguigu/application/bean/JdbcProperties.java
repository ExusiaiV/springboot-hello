package com.atguigu.application.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//jdbc配置文件中spring.jdbc.datasource的4条属性整合注入后,和单独的type属性一起注入
@Component
@ConfigurationProperties("spring.jdbc")
public class JdbcProperties {

    private DataSourceProperties3 dataSource ;
    private String type ;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "dataSource=" + dataSource +
                ", type='" + type + '\'' +
                '}';
    }

    public DataSourceProperties3 getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSourceProperties3 dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
