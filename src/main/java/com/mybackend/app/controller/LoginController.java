package com.mybackend.app.controller;

import com.mybackend.app.dao.dto.RegisterDTO;
import com.mybackend.app.dao.vo.UserProfileVO;
import com.mybackend.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return loginService.helloWorld();
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterDTO dto) {
        loginService.register(dto);
    }

    @GetMapping("/userById/{userId}")
    public UserProfileVO gerNameById(@PathVariable Long userId) {
        return loginService.gerUserById(userId);
    }

}
