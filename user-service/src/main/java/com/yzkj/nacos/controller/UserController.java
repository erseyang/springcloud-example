package com.yzkj.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "user")
public class UserController {


    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "hello";
    }

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public String name() {
        return "I am from user";
    }

}
