package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class GetSuggestions {
    @C5862c("rating_reviews")
    private ArrayList<ReviewBean> arrayListReview;
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;

    public ArrayList<ReviewBean> getArrayListReview() {
        return this.arrayListReview;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
