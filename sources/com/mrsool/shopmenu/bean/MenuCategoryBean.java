package com.mrsool.shopmenu.bean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class MenuCategoryBean {
    @C5862c("menu_items")
    private ArrayList<MenuItemBean> arrayListMenuItems;
    private ArrayList<MenuItemBean> arrayListUsersMenuItems = new ArrayList<>();
    @C5862c("category_id")
    private String categoryId;
    @C5862c("category_name")
    private String categoryName;

    public ArrayList<MenuItemBean> getArrayListMenuItems() {
        return this.arrayListMenuItems;
    }

    public ArrayList<MenuItemBean> getArrayListUsersMenuItems() {
        return this.arrayListUsersMenuItems;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getChildOrderCount(int i) {
        if (this.arrayListUsersMenuItems == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.arrayListUsersMenuItems.size(); i3++) {
            if (((MenuItemBean) this.arrayListUsersMenuItems.get(i3)).getChildPosition() == i) {
                i2 += ((MenuItemBean) this.arrayListUsersMenuItems.get(i3)).getOrderCount();
            }
        }
        return i2;
    }

    public int getOrderCount() {
        if (this.arrayListUsersMenuItems == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.arrayListUsersMenuItems.size(); i2++) {
            i += ((MenuItemBean) this.arrayListUsersMenuItems.get(i2)).getOrderCount();
        }
        return i;
    }

    public void setArrayListMenuItems(ArrayList<MenuItemBean> arrayList) {
        this.arrayListMenuItems = arrayList;
    }

    public void setArrayListUsersMenuItems(ArrayList<MenuItemBean> arrayList) {
        this.arrayListUsersMenuItems = arrayList;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }
}
