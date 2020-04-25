package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class OrderTrackBean implements Serializable {
    @C5860a
    @C5862c("buyer_show_track_bar")
    private Boolean buyer_show_track_bar;
    @C5860a
    @C5862c("courier_autostart_tracking")
    private Boolean courier_autostart_tracking;
    @C5860a
    @C5862c("courier_autostop_tracking")
    private Boolean courier_autostop_tracking;
    @C5860a
    @C5862c("courier_base_lat")
    private Double courier_base_lat;
    @C5860a
    @C5862c("courier_base_lng")
    private Double courier_base_lng;
    @C5860a
    @C5862c("courier_show_start_tracking")
    private Boolean courier_show_start_tracking;
    @C5860a
    @C5862c("courier_show_stop_tracking")
    private Boolean courier_show_stop_tracking;
    @C5860a
    @C5862c("pusher_cluster")
    private String pusher_cluster;
    @C5860a
    @C5862c("pusher_key")
    private String pusher_key;
    @C5860a
    @C5862c("track_channel_name")
    private String track_channel_name;
    @C5860a
    @C5862c("track_order")
    private Boolean track_order;

    public Boolean getBuyer_show_track_bar() {
        return this.buyer_show_track_bar;
    }

    public Boolean getCourier_autostart_tracking() {
        return this.courier_autostart_tracking;
    }

    public Boolean getCourier_autostop_tracking() {
        return this.courier_autostop_tracking;
    }

    public Double getCourier_base_lat() {
        return this.courier_base_lat;
    }

    public Double getCourier_base_lng() {
        return this.courier_base_lng;
    }

    public Boolean getCourier_show_start_tracking() {
        return this.courier_show_start_tracking;
    }

    public Boolean getCourier_show_stop_tracking() {
        return this.courier_show_stop_tracking;
    }

    public String getPusher_cluster() {
        return this.pusher_cluster;
    }

    public String getPusher_key() {
        return this.pusher_key;
    }

    public String getTrack_channel_name() {
        return this.track_channel_name;
    }

    public Boolean getTrack_order() {
        return this.track_order;
    }

    public void setCourier_base_lat(Double d) {
        this.courier_base_lat = d;
    }

    public void setCourier_base_lng(Double d) {
        this.courier_base_lng = d;
    }
}
