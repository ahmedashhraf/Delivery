package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class Feedback {
    @C5862c("fRating")
    private Float fRating;
    @C5862c("iRaterName")
    private String iRaterName;
    @C5862c("txReview")
    private String txReview;
    @C5862c("vRaterPic")
    private String vRaterPic;

    public Float getFRating() {
        return this.fRating;
    }

    public String getIRaterName() {
        return this.iRaterName;
    }

    public String getTxReview() {
        return this.txReview;
    }

    public String getvRaterPic() {
        return this.vRaterPic;
    }
}
