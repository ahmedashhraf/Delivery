package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;

public class MenuErrorAddonsBean {
    @C5862c("menu_addon_options")
    private ArrayList<MenuErrorAddonsOptionsBean> arrayListAddonsOptions = new ArrayList<>();
    @C5862c("error_message")
    private String errorMessage;
    @C5862c("id")

    /* renamed from: id */
    private String f31654id;
    @C5862c("disable_status")
    private String status = Enabled.ELEMENT;

    public ArrayList<MenuErrorAddonsOptionsBean> getArrayListAddonsOptions() {
        return this.arrayListAddonsOptions;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getId() {
        return this.f31654id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setArrayListAddonsOptions(ArrayList<MenuErrorAddonsOptionsBean> arrayList) {
        this.arrayListAddonsOptions = arrayList;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setId(String str) {
        this.f31654id = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
