package com.mrsool.newBean;

public class WayPoint {
    private String address;
    private String distance;
    private double latitude;
    private double longitude;
    private WayPointType type;

    public enum WayPointType {
        PICK_UP,
        DROP_OFF
    }

    public String getAddress() {
        return this.address;
    }

    public String getDistance() {
        return this.distance;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public WayPointType getType() {
        return this.type;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setType(WayPointType wayPointType) {
        this.type = wayPointType;
    }
}
