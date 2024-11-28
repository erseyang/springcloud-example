package com.yzkj.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    @RequestMapping(value = "get/{name}", method = RequestMethod.GET)
    public String getConfigValue() {
        return "";
    }
}
