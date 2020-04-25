package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CheckoutSkipCVVMode implements Parcelable {
    NEVER,
    ALWAYS,
    FOR_STORED_CARDS;
    
    public static final Creator<CheckoutSkipCVVMode> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode$a */
    static class C11937a implements Creator<CheckoutSkipCVVMode> {
        C11937a() {
        }

        /* renamed from: a */
        public CheckoutSkipCVVMode createFromParcel(Parcel parcel) {
            return CheckoutSkipCVVMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutSkipCVVMode[] newArray(int i) {
            return new CheckoutSkipCVVMode[i];
        }
    }

    static {
        CREATOR = new C11937a();
    }

    /* renamed from: c */
    public static CheckoutSkipCVVMode m53738c(String str) {
        CheckoutSkipCVVMode[] values;
        for (CheckoutSkipCVVMode checkoutSkipCVVMode : values()) {
            if (checkoutSkipCVVMode.name().equalsIgnoreCase(str)) {
                return checkoutSkipCVVMode;
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
