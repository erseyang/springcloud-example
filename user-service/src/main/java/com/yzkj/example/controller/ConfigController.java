package com.yzkj.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${spring.redis.name:This is a default value}")
    private String babyName;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String getConfigValue() {
        babyName = environment.getProperty("spring.redis.name");
        return babyName;
    }

}
