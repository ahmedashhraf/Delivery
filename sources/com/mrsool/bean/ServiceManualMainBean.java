package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class ServiceManualMainBean {
    private int code;
    @C5860a
    @C5862c("manual_data")
    private List<manualDataBean> manualData;
    private String message;
    @C5860a
    @C5862c("trigger_type")
    private String triggerType;

    public int getCode() {
        return this.code;
    }

    public List<manualDataBean> getManualData() {
        return this.manualData;
    }
}
