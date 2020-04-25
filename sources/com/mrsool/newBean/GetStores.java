package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import com.mrsool.bean.MostActiveShops;

public class GetStores {
    @C5862c("code")
    private Integer code;
    @C5862c("data")
    private MostActiveShops data;
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public MostActiveShops getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }
}
