package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;

public class VoteReview {
    @C5862c("code")
    private int code;
    @C5862c("message")
    private String message;
    @C5862c("rating_review")
    private RateReviewBean rateReviewBean;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public RateReviewBean getRateReviewBean() {
        return this.rateReviewBean;
    }
}
