package com.mrsool.bean;

import java.io.Serializable;

public class ListViewHeightBean implements Serializable {
    private double childHeight;
    private double parentHeight;

    public double getCollapseHeight() {
        return this.parentHeight;
    }

    public double getExpandHeight() {
        return this.parentHeight + this.childHeight;
    }

    public void setChildHeight(double d) {
        this.childHeight = d;
    }

    public void setParentHeight(double d) {
        this.parentHeight = d;
    }
}
