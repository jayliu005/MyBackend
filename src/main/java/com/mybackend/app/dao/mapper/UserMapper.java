package com.mybackend.app.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybackend.app.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
