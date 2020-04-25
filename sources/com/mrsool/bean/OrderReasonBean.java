package com.mrsool.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class OrderReasonBean implements Parcelable {
    public static final Creator<OrderReasonBean> CREATOR = new Creator<OrderReasonBean>() {
        public OrderReasonBean createFromParcel(Parcel parcel) {
            return new OrderReasonBean(parcel);
        }

        public OrderReasonBean[] newArray(int i) {
            return new OrderReasonBean[i];
        }
    };
    private int isForCancelWithdrawOrCourier;
    private String message;
    private String negativeBtnText;
    private String positiveBtnText;
    private Integer positiveColorRes = Integer.valueOf(0);
    private Integer selectedPos = Integer.valueOf(-1);
    private List<CancelReasonBean> spinnerList;
    private String title;

    public OrderReasonBean(List<CancelReasonBean> list, int i, String str, String str2, String str3, String str4) {
        this.spinnerList = list;
        this.isForCancelWithdrawOrCourier = i;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.negativeBtnText = str4;
    }

    public int describeContents() {
        return 0;
    }

    public int getIsForCancelWithdrawOrCourier() {
        return this.isForCancelWithdrawOrCourier;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public Integer getPositiveColorRes() {
        return this.positiveColorRes;
    }

    public Integer getSelectedPos() {
        return this.selectedPos;
    }

    public List<CancelReasonBean> getSpinnerList() {
        return this.spinnerList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSelectedPos(Integer num) {
        this.selectedPos = num;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isForCancelWithdrawOrCourier);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.positiveBtnText);
        parcel.writeString(this.negativeBtnText);
        parcel.writeInt(this.positiveColorRes.intValue());
        parcel.writeInt(this.selectedPos.intValue());
    }

    public OrderReasonBean(List<CancelReasonBean> list, int i, String str, String str2, String str3, String str4, int i2) {
        this.spinnerList = list;
        this.isForCancelWithdrawOrCourier = i;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.negativeBtnText = str4;
        this.positiveColorRes = Integer.valueOf(i2);
    }

    protected OrderReasonBean(Parcel parcel) {
        this.isForCancelWithdrawOrCourier = parcel.readInt();
        this.title = parcel.readString();
        this.message = parcel.readString();
        this.positiveBtnText = parcel.readString();
        this.negativeBtnText = parcel.readString();
        this.positiveColorRes = Integer.valueOf(parcel.readInt());
        this.selectedPos = Integer.valueOf(parcel.readInt());
    }
}
