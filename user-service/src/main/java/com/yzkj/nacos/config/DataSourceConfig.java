package com.yzkj.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.url}")
    private String url;

    private String user;

    private String password;

    private String driverClassName;


}
