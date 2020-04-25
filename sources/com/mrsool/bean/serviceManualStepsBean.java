package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class serviceManualStepsBean {
    private String description;
    @C5860a
    @C5862c("icon_url")
    private String iconUrl;
    private boolean isRead;
    private String title;

    public String getDescription() {
        return this.description;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public void setRead(boolean z) {
        this.isRead = z;
    }
}
