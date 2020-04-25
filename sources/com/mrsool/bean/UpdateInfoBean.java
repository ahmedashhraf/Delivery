package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class UpdateInfoBean {
    @C5862c("app_update_alert_text")
    private String app_update_alert_text;
    @C5862c("app_update_required")
    private boolean app_update_required;
    @C5862c("code")
    private int code;
    @C5862c("current_terms_version")
    private int current_terms_version;
    @C5862c("is_courier")
    private boolean isCourier;
    @C5862c("message")
    private String message;
    @C5862c("messages")
    private String messages;
    @C5862c("terms_accepted")
    private boolean terms_accepted;
    @C5862c("track_user")
    private boolean trackUser;
    @C5862c("xmpp_details")
    private XmppDetails xmppDetails;

    public String getApp_update_alert_text() {
        return this.app_update_alert_text;
    }

    public int getCode() {
        return this.code;
    }

    public int getCurrent_terms_version() {
        return this.current_terms_version;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessages() {
        return this.messages;
    }

    public XmppDetails getXmppDetails() {
        return this.xmppDetails;
    }

    public boolean isApp_update_required() {
        return this.app_update_required;
    }

    public boolean isCourier() {
        return this.isCourier;
    }

    public boolean isTerms_accepted() {
        return this.terms_accepted;
    }

    public boolean isTrackUser() {
        return this.trackUser;
    }

    public void setXmppDetails(XmppDetails xmppDetails2) {
        this.xmppDetails = xmppDetails2;
    }
}
