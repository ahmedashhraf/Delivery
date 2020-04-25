package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class ShopReviewBean implements Serializable {
    @C5862c("rating")
    private float rating;
    @C5862c("total_reviews")
    private String totalReviews;

    public float getRating() {
        return this.rating;
    }

    public String getTotalReviews() {
        return this.totalReviews;
    }
}
