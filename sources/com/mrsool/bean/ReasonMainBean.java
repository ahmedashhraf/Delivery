package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class ReasonMainBean {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("reasons")
    private List<ReasonBean> reasons;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<ReasonBean> getReasons() {
        return this.reasons;
    }
}
