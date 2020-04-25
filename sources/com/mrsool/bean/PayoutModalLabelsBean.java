package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class PayoutModalLabelsBean implements Serializable {
    @C5862c("body1")
    private String body1;
    @C5862c("body2")
    private String body2;
    @C5862c("cancel_btn")
    private String cancelBtn;
    @C5862c("register_now_btn")
    private String registerNowBtn;
    @C5862c("title")
    private String title;

    public String getBody1() {
        return this.body1;
    }

    public String getBody2() {
        return this.body2;
    }

    public String getCancelBtn() {
        return this.cancelBtn;
    }

    public String getRegisterNowBtn() {
        return this.registerNowBtn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBody1(String str) {
        this.body1 = str;
    }

    public void setBody2(String str) {
        this.body2 = str;
    }

    public void setCancelBtn(String str) {
        this.cancelBtn = str;
    }

    public void setRegisterNowBtn(String str) {
        this.registerNowBtn = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
