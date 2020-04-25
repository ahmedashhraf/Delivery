package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class NextQuickActionBean implements Serializable {
    @C5860a
    @C5862c("action_name")
    private String actionName;
    @C5860a
    @C5862c("action_value")
    private String actionValue;
    @C5860a
    @C5862c("description_label")
    private String descriptionLabel;

    public String getActionName() {
        return this.actionName;
    }

    public String getActionValue() {
        return this.actionValue;
    }

    public String getDescriptionLabel() {
        return this.descriptionLabel;
    }
}
