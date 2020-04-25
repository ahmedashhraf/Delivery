package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class CancelReasonMainBean {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("reasons")
    private List<CancelReasonBean> reasons;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<CancelReasonBean> getReasons() {
        return this.reasons;
    }
}
