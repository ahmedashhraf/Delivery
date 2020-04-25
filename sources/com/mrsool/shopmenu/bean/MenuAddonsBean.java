package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuAddonsBean implements Cloneable {
    @C5862c("calories")
    private String calories;
    private String description = "Medium Lorem ipsum dolor sit amet";
    private String errorMessage;
    @C5862c("id")

    /* renamed from: id */
    private String f31652id;
    private boolean isSelected;
    private boolean isValidationError;
    private ArrayList<MenuVarietyBean> mVarietiesArray;
    @C5862c("max_allowed_option")
    private int maxAllowedOption = 0;
    @C5862c("menu_addon_id")
    private String menuAddonId;
    @C5862c("menu_addon_options")
    private ArrayList<MenuAddonsOptionsBean> menuAddonOptions = new ArrayList<>();
    @C5862c("min_allowed_option")
    private int minAllowedOption = 0;
    @C5862c("name")
    private String name;
    @C5862c("price")
    private Double price;
    @C5862c("disable_status")
    private String status = Enabled.ELEMENT;
    private String title;
    private int type = 1;

    public Object clone() throws CloneNotSupportedException {
        try {
            return (MenuAddonsBean) super.clone();
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
        return this.f31652id;
    }

    public int getMaxAllowedOption() {
        return this.maxAllowedOption;
    }

    public String getMenuAddonId() {
        return this.menuAddonId;
    }

    public ArrayList<MenuAddonsOptionsBean> getMenuAddonOptions() {
        return this.menuAddonOptions;
    }

    public int getMinAllowedOption() {
        return this.minAllowedOption;
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

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public ArrayList<MenuVarietyBean> getmVarietiesArray() {
        return this.mVarietiesArray;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isValidationError() {
        return this.isValidationError;
    }

    public void setCalories(String str) {
        this.calories = str;
    }

    public String setDescription(String str) {
        return str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setId(String str) {
        this.f31652id = str;
    }

    public void setMaxAllowedOption(int i) {
        this.maxAllowedOption = i;
    }

    public void setMenuAddonId(String str) {
        this.menuAddonId = str;
    }

    public void setMenuAddonOptions(ArrayList<MenuAddonsOptionsBean> arrayList) {
        this.menuAddonOptions = arrayList;
    }

    public void setMinAllowedOption(int i) {
        this.minAllowedOption = i;
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

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValidationError(boolean z) {
        this.isValidationError = z;
    }

    public void setmVarietiesArray(ArrayList<MenuVarietyBean> arrayList) {
        this.mVarietiesArray = arrayList;
    }
}
