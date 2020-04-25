package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class ComplaintListMainBean {
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("complaints")
    private ArrayList<ComplaintListBean> complaints;
    @C5860a
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public ArrayList<ComplaintListBean> getComplaints() {
        return this.complaints;
    }

    public String getMessage() {
        return this.message;
    }
}
