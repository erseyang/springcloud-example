package com.yzkj.example.controller;

import com.yzkj.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "hello dept";
    }

    @RequestMapping(value = "username", method = RequestMethod.GET)
    public String userName() {
        return deptService.getName();
    }
}
