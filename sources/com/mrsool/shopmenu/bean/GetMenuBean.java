package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;

public class GetMenuBean {
    @C5862c("code")
    private int code;
    @C5862c("error")
    private String error;
    @C5862c("data")
    public MenuBean menuBean;

    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public MenuBean getMenuBean() {
        return this.menuBean;
    }
}
