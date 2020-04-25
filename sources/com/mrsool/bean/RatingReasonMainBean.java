package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class RatingReasonMainBean {
    @C5862c("code")
    private Integer code;
    @C5862c("message")
    private String message;
    @C5862c("reasons")
    private List<RatingReasonBean> reasons;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<RatingReasonBean> getReasons() {
        return this.reasons;
    }
}
