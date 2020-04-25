package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class AnnouncementBean implements Serializable {
    @C5862c("action_button_name")
    private String action_button_name;
    @C5862c("action_button_type")
    private int action_button_type;
    @C5862c("action_button_value")
    private String action_button_value;
    @C5862c("description")
    private String description;
    @C5862c("id")

    /* renamed from: id */
    private String f27619id;
    @C5862c("image")
    private String image;
    @C5862c("title")
    private String title;

    public String getAction_button_name() {
        return this.action_button_name;
    }

    public int getAction_button_type() {
        return this.action_button_type;
    }

    public String getAction_button_value() {
        return this.action_button_value;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f27619id;
    }

    public String getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }
}
