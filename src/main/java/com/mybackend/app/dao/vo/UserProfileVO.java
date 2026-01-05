package com.mybackend.app.dao.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserProfileVO {

    private Long id;

    private String account;

    private Integer status;

    private String name;

    private LocalDate birthday;

    private Integer gender;

    private String phone;

    private String address;
}
