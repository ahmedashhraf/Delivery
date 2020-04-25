package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;

public class ReviewBean {
    @C5862c("downvote")
    private String downvote;
    @C5862c("id")

    /* renamed from: id */
    private String f30125id;
    private boolean isClicked = false;
    @C5862c("is_featured")
    private boolean isFeatured = false;
    @C5862c("is_owner")
    private boolean isOwner;
    @C5862c("rater_name")
    private String raterName;
    @C5862c("rater_pic")
    private String raterPic;
    @C5862c("rater_reviews")
    private int raterReviews;
    @C5862c("rating")
    private float rating;
    @C5862c("review")
    private String review;
    @C5862c("review_header")
    private String reviewHeader;
    @C5862c("service_name")
    private String serviceName;
    @C5862c("service_pic")
    private String servicePic;
    @C5862c("vShopId")
    private String shopId;
    @C5862c("created_at")
    private String time;
    @C5862c("upvote")
    private String upvote;
    @C5862c("user_action")
    private String userAction;

    public String getDownvote() {
        return this.downvote;
    }

    public String getId() {
        return this.f30125id;
    }

    public String getRaterName() {
        return this.raterName;
    }

    public String getRaterPic() {
        return this.raterPic;
    }

    public int getRaterReviews() {
        return this.raterReviews;
    }

    public float getRating() {
        return this.rating;
    }

    public String getReview() {
        return this.review;
    }

    public String getReviewHeader() {
        return this.reviewHeader;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServicePic() {
        return this.servicePic;
    }

    public String getShopId() {
        return this.shopId;
    }

    public String getTime() {
        return this.time;
    }

    public String getUpvote() {
        return this.upvote;
    }

    public String getUserAction() {
        return this.userAction;
    }

    public boolean isClicked() {
        return this.isClicked;
    }

    public boolean isFeatured() {
        return this.isFeatured;
    }

    public boolean isOwner() {
        return this.isOwner;
    }

    public void setClicked(boolean z) {
        this.isClicked = z;
    }

    public void setDownvote(String str) {
        this.downvote = str;
    }

    public void setFeatured(boolean z) {
        this.isFeatured = z;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setReview(String str) {
        this.review = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setUpvote(String str) {
        this.upvote = str;
    }

    public void setUserAction(String str) {
        this.userAction = str;
    }
}
