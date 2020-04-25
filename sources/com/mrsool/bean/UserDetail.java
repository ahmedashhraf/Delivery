package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class UserDetail {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("user")
    private User user;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public User getUser() {
        return this.user;
    }
}
