package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

/* compiled from: CourierBadgeBean */
class CourierUserBean {
    @C5862c("badge_date")
    LabelValueBean badgeDate;
    @C5862c("badge_footer")
    String badgeFooter;
    @C5862c("badge_header")
    String badgeHeader;
    @C5862c("national_id")
    LabelValueBean courierId;
    @C5862c("full_name")
    String fullName;
    @C5862c("no_of_orders")
    String ordersNumber;
    @C5862c("profile_picture")
    String profilePictureUrl;
    @C5862c("rating")
    String rating;
    @C5862c("sponser")
    CourierSponsorDetailsBean sponsor;
    @C5862c("status")
    LabelValueBean status;
    @C5862c("valid_to_date")
    CourierSponsorDetailsBean validUntil;

    CourierUserBean() {
    }
}
