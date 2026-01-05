package com.mybackend.app.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybackend.app.dao.entity.UserProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserProfileMapper extends BaseMapper<UserProfile> {
}
