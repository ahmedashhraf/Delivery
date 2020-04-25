package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuErrorAddonsOptionsBean {
    @C5862c("error_message")
    private String errorMessage;
    @C5862c("id")

    /* renamed from: id */
    private String f31655id;
    @C5862c("disable_status")
    private String status = Enabled.ELEMENT;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getId() {
        return this.f31655id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setId(String str) {
        this.f31655id = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
