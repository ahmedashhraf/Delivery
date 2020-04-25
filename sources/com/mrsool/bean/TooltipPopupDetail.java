package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class TooltipPopupDetail implements Serializable {
    @C5862c("accept_button")
    private String acceptButton;
    @C5862c("cancel_button")
    private String cancelButton;
    @C5862c("description")
    private String description;
    @C5862c("title")
    private String title;

    public String getAcceptButton() {
        return this.acceptButton;
    }

    public String getCancelButton() {
        return this.cancelButton;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }
}
