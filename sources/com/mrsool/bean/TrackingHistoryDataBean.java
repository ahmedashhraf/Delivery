package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.util.List;

public class TrackingHistoryDataBean {
    @C5860a
    @C5862c("channel")
    private String channel;
    @C5860a
    @C5862c("courier_id")
    private String courier_id;
    @C5860a
    @C5862c("location_array")
    private List<TrackingCoOrdinateBean> location_array;

    public List<TrackingCoOrdinateBean> getLocation_array() {
        return this.location_array;
    }
}
