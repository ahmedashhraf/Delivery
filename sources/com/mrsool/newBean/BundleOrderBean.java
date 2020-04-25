package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;

public class BundleOrderBean {
    @C5862c("dist_from_previous_loc")
    private Double distFromPreviousLoc;
    @C5862c("dropoff_address")
    private String dropoffAddress;
    private int icon;
    private String title;

    public Double getDistFromPreviousLoc() {
        return this.distFromPreviousLoc;
    }

    public String getDropoffAddress() {
        return this.dropoffAddress;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDistFromPreviousLoc(Double d) {
        this.distFromPreviousLoc = d;
    }

    public void setDropoffAddress(String str) {
        this.dropoffAddress = str;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
