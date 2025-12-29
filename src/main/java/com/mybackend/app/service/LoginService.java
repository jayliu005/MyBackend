package com.mybackend.app.service;

import com.mybackend.app.dao.entity.User;

public interface LoginService {

    String helloWorld();

    User gerUserById(Long id);
}
