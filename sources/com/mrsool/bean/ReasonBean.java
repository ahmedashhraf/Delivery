package com.mrsool.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class ReasonBean implements Parcelable {
    public static final Creator<ReasonBean> CREATOR = new Creator<ReasonBean>() {
        public ReasonBean createFromParcel(Parcel parcel) {
            return new ReasonBean(parcel);
        }

        public ReasonBean[] newArray(int i) {
            return new ReasonBean[i];
        }
    };
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("reason")
    private String vReason;

    public ReasonBean(Integer num, String str) {
        this.code = num;
        this.vReason = str;
    }

    public int describeContents() {
        return 0;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getvReason() {
        return this.vReason;
    }

    public void setvReason(String str) {
        this.vReason = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.code);
        parcel.writeString(this.vReason);
    }

    protected ReasonBean(Parcel parcel) {
        this.code = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.vReason = parcel.readString();
    }
}
