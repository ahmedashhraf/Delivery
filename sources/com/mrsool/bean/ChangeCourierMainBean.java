package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class ChangeCourierMainBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;
    @C5860a
    @C5862c("offers")
    private List<ChangeCourierBean> offers;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<ChangeCourierBean> getOffers() {
        return this.offers;
    }
}
