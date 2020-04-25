package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.List;

public class BookmarkMainBean {
    @C5862c("delivery")
    private List<BookmarkPlaceBean> delivery;
    @C5862c("dropoff")
    private List<BookmarkPlaceBean> dropoff;
    @C5862c("pickup")
    private List<BookmarkPlaceBean> pickup;

    public List<BookmarkPlaceBean> getDelivery() {
        return this.delivery;
    }

    public List<BookmarkPlaceBean> getDropoff() {
        return this.dropoff;
    }

    public List<BookmarkPlaceBean> getPickup() {
        return this.pickup;
    }

    public void setDelivery(List<BookmarkPlaceBean> list) {
        this.delivery = list;
    }

    public void setDropoff(List<BookmarkPlaceBean> list) {
        this.dropoff = list;
    }

    public void setPickup(List<BookmarkPlaceBean> list) {
        this.pickup = list;
    }
}
