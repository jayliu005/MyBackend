package com.mybackend.app.service.impl;

import com.mybackend.app.dao.entity.User;
import com.mybackend.app.dao.mapper.UserMapper;
import com.mybackend.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String helloWorld() {
        return "Hello World";
    }

    @Override
    public User gerUserById(Long userId) {
        if (userId == null) {
            return null;
        }
        return userMapper.selectById(userId);
    }
}
