package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CheckoutCardBrandsDisplayMode implements Parcelable {
    SEPARATE,
    GROUPED;
    
    public static final Creator<CheckoutCardBrandsDisplayMode> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode$a */
    static class C11933a implements Creator<CheckoutCardBrandsDisplayMode> {
        C11933a() {
        }

        /* renamed from: a */
        public CheckoutCardBrandsDisplayMode createFromParcel(Parcel parcel) {
            return CheckoutCardBrandsDisplayMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutCardBrandsDisplayMode[] newArray(int i) {
            return new CheckoutCardBrandsDisplayMode[i];
        }
    }

    static {
        CREATOR = new C11933a();
    }

    /* renamed from: c */
    public static CheckoutCardBrandsDisplayMode m53645c(String str) {
        CheckoutCardBrandsDisplayMode[] values;
        for (CheckoutCardBrandsDisplayMode checkoutCardBrandsDisplayMode : values()) {
            if (checkoutCardBrandsDisplayMode.name().equalsIgnoreCase(str)) {
                return checkoutCardBrandsDisplayMode;
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
