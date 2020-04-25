package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class CallOptionsMainBean {
    @C5862c("call_options")
    private List<CallOptionsBean> call_options;
    @C5862c("code")
    private Integer code;
    @C5862c("message")
    private String message;

    public List<CallOptionsBean> getCall_options() {
        return this.call_options;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
