package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuAddonsOptionsBean implements Cloneable {
    @C5862c("calories")
    private String calories;
    private String description = "Medium Lorem ipsum dolor sit amet";
    private String errorMessage;
    @C5862c("id")

    /* renamed from: id */
    private String f31653id;
    private boolean isSelected;
    @C5862c("menu_addon_option_id")
    private String menuAddonOptionId;
    @C5862c("name")
    private String name;
    @C5862c("price")
    private Double price;
    @C5862c("disable_status")
    private String status = Enabled.ELEMENT;

    public Object clone() throws CloneNotSupportedException {
        try {
            return (MenuAddonsOptionsBean) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCalories() {
        return this.calories;
    }

    public String getDescription() {
        return this.description;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getId() {
        return this.f31653id;
    }

    public String getMenuAddonOptionId() {
        return this.menuAddonOptionId;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCalories(String str) {
        this.calories = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setId(String str) {
        this.f31653id = str;
    }

    public void setMenuAddonOptionId(String str) {
        this.menuAddonOptionId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
