package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CheckoutStorePaymentDetailsMode implements Parcelable {
    ALWAYS,
    PROMPT,
    NEVER;
    
    public static final Creator<CheckoutStorePaymentDetailsMode> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode$a */
    static class C11938a implements Creator<CheckoutStorePaymentDetailsMode> {
        C11938a() {
        }

        /* renamed from: a */
        public CheckoutStorePaymentDetailsMode createFromParcel(Parcel parcel) {
            return CheckoutStorePaymentDetailsMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutStorePaymentDetailsMode[] newArray(int i) {
            return new CheckoutStorePaymentDetailsMode[i];
        }
    }

    static {
        CREATOR = new C11938a();
    }

    /* renamed from: c */
    public static CheckoutStorePaymentDetailsMode m53741c(String str) {
        CheckoutStorePaymentDetailsMode[] values;
        for (CheckoutStorePaymentDetailsMode checkoutStorePaymentDetailsMode : values()) {
            if (checkoutStorePaymentDetailsMode.name().equals(str)) {
                return checkoutStorePaymentDetailsMode;
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
