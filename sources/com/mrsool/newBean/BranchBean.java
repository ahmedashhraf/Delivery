package com.mrsool.newBean;

import android.text.TextUtils;
import com.google.android.gms.maps.model.Marker;
import com.google.gson.p193w.C5862c;

public class BranchBean implements Cloneable {
    @C5862c("branch_id")
    private String branchId;
    @C5862c("distance")
    private Double distance;
    @C5862c("is_selected")
    private int isSelected;
    @C5862c("latitude")
    private Double latitude;
    @C5862c("longitude")
    private Double longitude;
    private Marker marker;
    @C5862c("type")
    private String type;
    @C5862c("vAddress")
    private String vAddress;
    @C5862c("vName")
    private String vName;

    public String getBranchId() {
        return this.branchId;
    }

    public Double getDistance() {
        return this.distance;
    }

    public int getIsSelected() {
        return this.isSelected;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Marker getMarker() {
        return this.marker;
    }

    public String getTitle() {
        if (!this.vName.equals("")) {
            return this.vName;
        }
        return this.vAddress;
    }

    public String getvAddress() {
        if (TextUtils.isEmpty(this.vAddress)) {
            return this.vName;
        }
        return this.vAddress;
    }

    public void setDistance(Double d) {
        this.distance = d;
    }

    public void setIsSelected(int i) {
        this.isSelected = i;
    }

    public void setMarker(Marker marker2) {
        this.marker = marker2;
    }

    public void setvName(String str) {
        this.vName = str;
    }

    public BranchBean clone() throws CloneNotSupportedException {
        try {
            return (BranchBean) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
