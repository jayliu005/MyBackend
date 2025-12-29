package com.mybackend.app.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("user_profile")
public class UserProfile {
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    @TableField("name")
    private String name;

    @TableField("birthday")
    private LocalDate birthday;

    @TableField("gender")
    private Integer gender;

    @TableField("phone")
    private String phone;

    @TableField("address")
    private String address;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
