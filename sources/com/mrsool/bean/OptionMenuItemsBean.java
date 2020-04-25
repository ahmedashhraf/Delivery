package com.mrsool.bean;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mrsool.C10232R;
import java.util.ArrayList;

public class OptionMenuItemsBean implements Parcelable {
    public static final Creator<OptionMenuItemsBean> CREATOR = new Creator<OptionMenuItemsBean>() {
        public OptionMenuItemsBean createFromParcel(Parcel parcel) {
            return new OptionMenuItemsBean(parcel);
        }

        public OptionMenuItemsBean[] newArray(int i) {
            return new OptionMenuItemsBean[i];
        }
    };
    private String disableMessage;
    private int drawableRes = 0;

    /* renamed from: id */
    private int f27624id;
    private boolean isEnable = true;
    private boolean isVisible = false;
    private String title;

    public OptionMenuItemsBean(int i, String str) {
        String str2 = "";
        this.title = str2;
        this.disableMessage = str2;
        this.f27624id = i;
        this.title = str;
    }

    public static ArrayList<OptionMenuItemsBean> getMenu(boolean z, Context context) {
        ArrayList<OptionMenuItemsBean> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_Choose_Photo, context.getString(C10232R.string.menu_choose_photo)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_cancel_order, context.getString(C10232R.string.menu_cancel_order)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_change_courier, context.getString(C10232R.string.menu_change_courier)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_share_location, context.getString(C10232R.string.menu_share_location)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_rate_the_courier, context.getString(C10232R.string.menu_rate_the_Courier)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_file_a_compaint, context.getString(C10232R.string.title_file_a_compaint)));
        } else {
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_start_tracking, context.getString(C10232R.string.menu_start_tracking)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_withdraw_order, context.getString(C10232R.string.menu_withdraw_order)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_issue_bill, context.getString(C10232R.string.title_issue_bill)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_goods_delivered, context.getString(C10232R.string.menu_goods_delivered)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_package_pickedup, context.getString(C10232R.string.menu_package_pickedup)));
            arrayList.add(new OptionMenuItemsBean(C10232R.C10236id.action_file_a_compaint, context.getString(C10232R.string.title_file_a_compaint)));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public String getDisableMessage() {
        return this.disableMessage;
    }

    public int getDrawableRes() {
        return this.drawableRes;
    }

    public int getId() {
        return this.f27624id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setDisableMessage(String str) {
        this.disableMessage = str;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27624id);
        parcel.writeString(this.title);
        parcel.writeInt(this.drawableRes);
        parcel.writeByte(this.isVisible ? (byte) 1 : 0);
        parcel.writeByte(this.isEnable ? (byte) 1 : 0);
        parcel.writeString(this.disableMessage);
    }

    public OptionMenuItemsBean(int i, String str, int i2, boolean z) {
        String str2 = "";
        this.title = str2;
        this.disableMessage = str2;
        this.f27624id = i;
        this.title = str;
        this.drawableRes = i2;
        this.isVisible = z;
    }

    protected OptionMenuItemsBean(Parcel parcel) {
        String str = "";
        this.title = str;
        boolean z = false;
        this.disableMessage = str;
        this.f27624id = parcel.readInt();
        this.title = parcel.readString();
        this.drawableRes = parcel.readInt();
        this.isVisible = parcel.readByte() != 0;
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.isEnable = z;
        this.disableMessage = parcel.readString();
    }
}
