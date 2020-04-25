package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class BeanCourierState {
    @C5862c("code")
    private int code;
    @C5862c("is_online")
    private boolean isOnline;
    @C5862c("message")
    private String message;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isOnline() {
        return this.isOnline;
    }
}
