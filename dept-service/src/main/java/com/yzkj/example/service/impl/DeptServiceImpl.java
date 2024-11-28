package com.yzkj.example.service.impl;

import com.yzkj.example.api.UserClient;
import com.yzkj.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private UserClient userClient;
    @Override
    public String getName() {
        return userClient.queryName();
    }
}
