package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;

public class WriteRatingReviewBean {
    private boolean isEdit;
    @C5862c("rating")
    private float rating;
    @C5862c("review")
    private String review;
    @C5862c("vShopId")
    private String shopId;
    @C5862c("icon")
    private String shopPic;
    @C5862c("review_header")
    private String title;

    public float getRating() {
        return this.rating;
    }

    public String getReview() {
        return this.review;
    }

    public String getShopId() {
        return this.shopId;
    }

    public String getShopPic() {
        return this.shopPic;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isEdit() {
        return this.isEdit;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setReview(String str) {
        this.review = str;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }

    public void setShopPic(String str) {
        this.shopPic = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
