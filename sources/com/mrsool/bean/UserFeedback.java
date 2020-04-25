package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import java.util.List;

public class UserFeedback {
    @C5862c("code")
    private int code;
    @C5862c("feedbacks")
    private List<Feedback> feedbacks = new ArrayList();
    @C5862c("message")
    private String message;

    public int getCode() {
        return this.code;
    }

    public List<Feedback> getFeedbacks() {
        return this.feedbacks;
    }

    public String getMessage() {
        return this.message;
    }
}
