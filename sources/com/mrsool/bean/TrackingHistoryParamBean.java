package com.mrsool.bean;

public class TrackingHistoryParamBean {
    private String channel;
    private String courier_id;
    private String courier_ids;
    private String current_user_id;
    private String token;

    public TrackingHistoryParamBean(String str, String str2, String str3, String str4) {
        this.channel = str;
        this.token = str2;
        this.courier_ids = str3;
        this.current_user_id = str4;
    }
}
