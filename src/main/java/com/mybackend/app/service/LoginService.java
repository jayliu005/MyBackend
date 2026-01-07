package com.mybackend.app.service;

import com.mybackend.app.dao.dto.RegisterDTO;
import com.mybackend.app.dao.vo.UserProfileVO;

public interface LoginService {

    String helloWorld();

    void register(RegisterDTO dto);

    UserProfileVO gerUserById(Long id);
}
