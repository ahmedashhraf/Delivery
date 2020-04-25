package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class ComplaintDetailMainBean {
    @C5862c("code")
    private Integer code;
    @C5862c("complaint")
    private List<ComplaintListBean> complaint;
    @C5862c("message")
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public List<ComplaintListBean> getComplaint() {
        return this.complaint;
    }

    public String getMessage() {
        return this.message;
    }
}
