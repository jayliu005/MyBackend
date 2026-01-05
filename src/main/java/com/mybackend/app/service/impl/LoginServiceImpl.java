package com.mybackend.app.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mybackend.app.dao.entity.User;
import com.mybackend.app.dao.entity.UserProfile;
import com.mybackend.app.dao.mapper.UserMapper;
import com.mybackend.app.dao.mapper.UserProfileMapper;
import com.mybackend.app.dao.vo.UserProfileVO;
import com.mybackend.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserProfileMapper userProfileMapper;

    @Override
    public String helloWorld() {
        return "Hello World";
    }

    @Override
    public UserProfileVO gerUserById(Long userId) {
        if (userId == null) {
            return null;
        }
        User user = userMapper.selectById(userId);
        if (user == null) {
            return null;
        }

        UserProfile userProfile = userProfileMapper.selectOne(
                Wrappers.<UserProfile>lambdaQuery()
                        .eq(UserProfile::getUserId, userId)
        );

        UserProfileVO vo = new UserProfileVO();
        vo.setId(user.getId());
        vo.setAccount(user.getAccount());
        vo.setStatus(user.getStatus());
        if (userProfile != null) {
            vo.setName(userProfile.getName());
            vo.setBirthday(userProfile.getBirthday());
            vo.setGender(userProfile.getGender());
            vo.setPhone(userProfile.getPhone());
            vo.setAddress(userProfile.getAddress());
        }
        return vo;
    }
}
