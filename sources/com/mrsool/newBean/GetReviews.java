package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class GetReviews {
    @C5862c("rating_reviews")
    private ArrayList<ReviewBean> arrayListReview;
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("pagination")
    private PageBean pageBean;

    public ArrayList<ReviewBean> getArrayListReview() {
        return this.arrayListReview;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public PageBean getPageBean() {
        return this.pageBean;
    }
}
