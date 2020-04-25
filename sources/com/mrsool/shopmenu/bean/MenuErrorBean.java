package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class MenuErrorBean {
    @C5862c(alternate = {"status"}, value = "code")
    private int code;
    @C5862c("data")
    private MenuObjectBean menuObjectBean;
    @C5862c(alternate = {"error"}, value = "message")
    private String message;

    public class MenuObjectBean {
        @C5862c("menu_items")
        private ArrayList<MenuItemBean> arrayListMenuItems;
        @C5862c("item_error")
        private ArrayList<MenuErrorItemBean> menuErrorItemList;

        public MenuObjectBean() {
        }

        public ArrayList<MenuItemBean> getArrayListMenuItems() {
            return this.arrayListMenuItems;
        }

        public ArrayList<MenuErrorItemBean> getMenuErrorItemList() {
            return this.menuErrorItemList;
        }
    }

    public int getCode() {
        return this.code;
    }

    public MenuObjectBean getMenuObjectBean() {
        return this.menuObjectBean;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
