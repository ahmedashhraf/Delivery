package com.mrsool.bean;

import com.google.gson.p193w.C5862c;
import com.mrsool.newBean.BranchBean;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    @C5862c("bIsDropoffAvailable")
    private Integer bIsDropoffAvailable;
    @C5862c("bIsDropoffFixed")
    private int bIsDropoffFixed;
    @C5862c("bIsPickupAvailable")
    private Integer bIsPickupAvailable;
    @C5862c("bIsPickupFixed")
    private int bIsPickupFixed;
    private ArrayList<BranchBean> branch_locations = new ArrayList<>();
    @C5862c("categories")
    private String categories;
    @C5862c("count")
    private String count;
    @C5862c("disable_order_now")
    private boolean disableOrderNow = false;
    @C5862c("discount_label")
    private String discountLabel;
    @C5862c("discount_short_label")
    private String discountShortLabel;
    @C5862c("distance")
    private Double distance;
    @C5862c("distance_courier_shop")
    private double distance_courier_shop;
    @C5862c("dlatitude")
    private Double dlatitude;
    @C5862c("dlongitude")
    private Double dlongitude;
    @C5862c("has_discount")
    private boolean hasDiscount;
    @C5862c("has_multiple_branches")
    private Boolean hasMultipleBranches;
    @C5862c("highlight_shop")
    private boolean highlightShop = false;
    @C5862c("is_boms_linked")
    private boolean isBomsLinked = false;
    private boolean isManualBranchSelect = false;
    @C5862c("mrsool_service")
    private boolean isMrsoolService = false;
    @C5862c("is_rateable")
    private boolean isRateable = true;
    @C5862c("item_description_text")
    private String itemDescriptionText;
    @C5862c("latitude")
    private Double latitude;
    @C5862c("longitude")
    private Double longitude;
    @C5862c("nearby_branch_count")
    private Integer nearbyBranchCount;
    @C5862c("new_version")
    private Boolean newVersion;
    @C5862c("new_version_msg")
    private String newVersionMsg;
    @C5862c("opening_hours")
    private List<WorkingHoursBean> opening_hours;
    @C5862c("order_description_text")
    private String order_description_text;
    @C5862c("platitude")
    private Double platitude;
    @C5862c("plongitude")
    private Double plongitude;
    @C5862c("promotion_type")
    private String promotionType;
    @C5862c("rating")
    private float rating;
    @C5862c("service_shop_open")
    private boolean serviceShopOpen = true;
    @C5862c("shop_not_open_warning")
    private String shopNotOpenWarning;
    @C5862c("shop_menu")
    private ShopMenuBean shop_menu;
    @C5862c("show_item_list")
    private boolean showItemList = false;
    @C5862c("todays_working_hours")
    private String todaysWorkingHours;
    @C5862c("todays_timings")
    private String todays_timings;
    @C5862c("total_reviews")
    private String totalReviews;
    @C5862c("type")
    private String type;
    @C5862c("vAddress")
    private String vAddress;
    @C5862c("vDataSource")
    private String vDataSource;
    @C5862c("vDescription")
    private String vDescription;
    @C5862c("vDropoffAddress")
    private String vDropoffAddress;
    @C5862c("vEnName")
    private String vEnName;
    @C5862c("vIcon")
    private String vIcon;
    @C5862c("vImage")
    private String vImage;
    @C5862c("vImage_type")
    private String vImageType;
    @C5862c("vName")
    private String vName;
    @C5862c("vPhone")
    private String vPhone;
    @C5862c("vPickupAddress")
    private String vPickupAddress;
    @C5862c("vShopId")
    private String vShopId;
    @C5862c("vShopPic")
    private String vShopPic;
    @C5862c("vSubTitle")
    private String vSubTitle;
    @C5862c("vSubTitle2")
    private String vSubTitle2;
    @C5862c("vTitle")
    private String vTitle;
    @C5862c("vType")
    private String vType;

    public ArrayList<BranchBean> getBranchList() {
        return this.branch_locations;
    }

    public String getCategories() {
        return this.categories;
    }

    public String getCount() {
        return this.count;
    }

    public String getDiscountLabel() {
        return this.discountLabel;
    }

    public String getDiscountShortLabel() {
        return this.discountShortLabel;
    }

    public Double getDistance() {
        return this.distance;
    }

    public double getDistance_courier_shop() {
        return this.distance_courier_shop;
    }

    public Double getDlatitude() {
        return this.dlatitude;
    }

    public Double getDlongitude() {
        return this.dlongitude;
    }

    public Boolean getHasMultipleBranches() {
        return this.hasMultipleBranches;
    }

    public String getItemDescriptionText() {
        return this.itemDescriptionText;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public boolean getMrsoolService() {
        return this.isMrsoolService;
    }

    public List<WorkingHoursBean> getOpening_hours() {
        return this.opening_hours;
    }

    public String getOrder_description_text() {
        return this.order_description_text;
    }

    public Double getPlatitude() {
        return this.platitude;
    }

    public Double getPlongitude() {
        return this.plongitude;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public float getRating() {
        return this.rating;
    }

    public String getShopNotOpenWarning() {
        return this.shopNotOpenWarning;
    }

    public ShopMenuBean getShop_menu() {
        return this.shop_menu;
    }

    public String getTodaysWorkingHours() {
        return this.todaysWorkingHours;
    }

    public String getTodays_timings() {
        return this.todays_timings;
    }

    public String getTotalReviews() {
        return this.totalReviews;
    }

    public String getVAddress() {
        return this.vAddress;
    }

    public String getVName() {
        return this.vName;
    }

    public String getVShopId() {
        return this.vShopId;
    }

    public String getVShopPic() {
        return this.vShopPic;
    }

    public String getVType() {
        return this.vType;
    }

    public Integer getbIsDropoffAvailable() {
        return this.bIsDropoffAvailable;
    }

    public Integer getbIsPickupAvailable() {
        return this.bIsPickupAvailable;
    }

    public String getvDataSource() {
        return this.vDataSource;
    }

    public String getvDescription() {
        return this.vDescription;
    }

    public String getvDropoffAddress() {
        return this.vDropoffAddress;
    }

    public String getvEnName() {
        return this.vEnName;
    }

    public String getvIcon() {
        return this.vIcon;
    }

    public String getvImage() {
        return this.vImage;
    }

    public String getvImageType() {
        return this.vImageType;
    }

    public String getvPhone() {
        return this.vPhone;
    }

    public String getvPickupAddress() {
        return this.vPickupAddress;
    }

    public String getvSubTitle() {
        return this.vSubTitle;
    }

    public String getvTitle() {
        return this.vTitle;
    }

    public boolean isBOMSLinked() {
        return this.isBomsLinked;
    }

    public boolean isDisableOrderNow() {
        return this.disableOrderNow;
    }

    public boolean isHasDiscount() {
        return this.hasDiscount;
    }

    public boolean isHighlightShop() {
        return this.highlightShop;
    }

    public boolean isManualBranchSelect() {
        return this.isManualBranchSelect;
    }

    public boolean isRateable() {
        return this.isRateable;
    }

    public boolean isServiceShopOpen() {
        return this.serviceShopOpen;
    }

    public boolean isShowItemList() {
        return this.showItemList;
    }

    public int isbIsDropoffFixed() {
        return this.bIsDropoffFixed;
    }

    public int isbIsPickupFixed() {
        return this.bIsPickupFixed;
    }

    public void setBranchList(ArrayList<BranchBean> arrayList) {
        this.branch_locations = arrayList;
    }

    public void setDisableOrderNow(boolean z) {
        this.disableOrderNow = z;
    }

    public void setDlatitude(Double d) {
        this.dlatitude = d;
    }

    public void setDlongitude(Double d) {
        this.dlongitude = d;
    }

    public void setManualBranchSelect(boolean z) {
        this.isManualBranchSelect = z;
    }

    public void setPlatitude(Double d) {
        this.platitude = d;
    }

    public void setPlongitude(Double d) {
        this.plongitude = d;
    }

    public void setPromotionType(String str) {
        this.promotionType = str;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setTotalReviews(String str) {
        this.totalReviews = str;
    }

    public void setvDropoffAddress(String str) {
        this.vDropoffAddress = str;
    }

    public void setvEnName(String str) {
        this.vEnName = str;
    }

    public void setvPickupAddress(String str) {
        this.vPickupAddress = str;
    }
}
