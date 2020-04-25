package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuErrorItemBean {
    @C5862c("menu_addons")
    private ArrayList<MenuErrorAddonsBean> arrayListAddons = new ArrayList<>();
    private ArrayList<String> arrayListErrorModule = new ArrayList<>();
    @C5862c("menu_varities")
    private ArrayList<MenuErrorVarietiesBean> arrayListVariety = new ArrayList<>();
    @C5862c("error_message")
    private String errorMessage;
    @C5862c("id")

    /* renamed from: id */
    private String f31656id;
    @C5862c("item_index")
    private int itemIndex;
    @C5862c("remove_item")
    private boolean removeItems;
    @C5862c("disable_status")
    private String status = Enabled.ELEMENT;

    public ArrayList<MenuErrorAddonsBean> getArrayListAddons() {
        return this.arrayListAddons;
    }

    public ArrayList<String> getArrayListErrorModule() {
        return this.arrayListErrorModule;
    }

    public ArrayList<MenuErrorVarietiesBean> getArrayListVariety() {
        return this.arrayListVariety;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getId() {
        return this.f31656id;
    }

    public int getItemIndex() {
        return this.itemIndex;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isRemoveItems() {
        return this.removeItems;
    }

    public void setArrayListAddons(ArrayList<MenuErrorAddonsBean> arrayList) {
        this.arrayListAddons = arrayList;
    }

    public void setArrayListErrorModule(ArrayList<String> arrayList) {
        this.arrayListErrorModule = arrayList;
    }

    public void setArrayListVariety(ArrayList<MenuErrorVarietiesBean> arrayList) {
        this.arrayListVariety = arrayList;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setId(String str) {
        this.f31656id = str;
    }

    public void setItemIndex(int i) {
        this.itemIndex = i;
    }

    public void setRemoveItems(boolean z) {
        this.removeItems = z;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
