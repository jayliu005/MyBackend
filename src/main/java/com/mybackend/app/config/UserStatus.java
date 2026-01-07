package com.mybackend.app.config;

import lombok.Getter;

@Getter
public enum UserStatus {
    DISABLE(0),
    ENABLE(1);

    private final int status;

    UserStatus(int status) {
        this.status = status;
    }
}
