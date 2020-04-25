package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import java.util.List;

public class TrackingHistoryMainBean implements Serializable {
    @C5862c("code")
    private int code;
    @C5862c("data")
    private List<TrackingHistoryDataBean> data;
    @C5862c("message")
    private String message;
    @C5862c("service_manual")
    private SearviceManualCommonBean serviceManual;

    public Integer getCode() {
        return Integer.valueOf(this.code);
    }

    public List<TrackingHistoryDataBean> getData() {
        return this.data;
    }
}
