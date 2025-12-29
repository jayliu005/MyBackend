package com.mybackend.app.controller;

import com.mybackend.app.dao.entity.User;
import com.mybackend.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return loginService.helloWorld();
    }

    @GetMapping("/userById/{userId}")
    public User gerNameById(@PathVariable Long userId) {
        return loginService.gerUserById(userId);
    }

}
