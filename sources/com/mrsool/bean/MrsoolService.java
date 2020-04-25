package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class MrsoolService {
    @C5862c("categories")
    private String categories;
    @C5860a
    @C5862c("discount_label")
    private String discountLabel;
    @C5862c("distance")
    private String distance;
    @C5860a
    @C5862c("has_discount")
    private boolean hasDiscount;
    private boolean isBoms = false;
    @C5860a
    @C5862c("mrsool_service")
    private boolean mrsoolService;
    private int paletteColor = 0;
    @C5860a
    @C5862c("vDescription")
    private String vDescription;
    @C5860a
    @C5862c("vEnName")
    private String vEnName;
    @C5860a
    @C5862c("vShopPic")
    private String vIcon;
    @C5860a
    @C5862c("vShopId")
    private String vShopId;
    @C5860a
    @C5862c("vShortDescription")
    private String vShortDescription;
    @C5860a
    @C5862c("vName")
    private String vTitle;

    public String getCategories() {
        return this.categories;
    }

    public String getDiscountLabel() {
        return this.discountLabel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getPaletteColor() {
        return this.paletteColor;
    }

    public String getVIcon() {
        return this.vIcon;
    }

    public String getVShopId() {
        return this.vShopId;
    }

    public String getVTitle() {
        return this.vTitle;
    }

    public String getvDescription() {
        return this.vDescription;
    }

    public String getvEnName() {
        return this.vEnName;
    }

    public boolean isBoms() {
        return this.isBoms;
    }

    public boolean isHasDiscount() {
        return this.hasDiscount;
    }

    public boolean isMrsoolService() {
        return this.mrsoolService;
    }

    public void setDiscountLabel(String str) {
        this.discountLabel = str;
    }

    public void setHasDiscount(boolean z) {
        this.hasDiscount = z;
    }

    public void setPaletteColor(int i) {
        this.paletteColor = i;
    }
}
