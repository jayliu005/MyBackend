package com.mybackend.app.service;

import com.mybackend.app.dao.entity.User;
import com.mybackend.app.dao.vo.UserProfileVO;

public interface LoginService {

    String helloWorld();

    UserProfileVO gerUserById(Long id);
}
