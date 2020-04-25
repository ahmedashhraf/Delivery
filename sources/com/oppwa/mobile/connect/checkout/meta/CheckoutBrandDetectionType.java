package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CheckoutBrandDetectionType implements Parcelable {
    REGEX,
    BINLIST;
    
    public static final Creator<CheckoutBrandDetectionType> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType$a */
    static class C11932a implements Creator<CheckoutBrandDetectionType> {
        C11932a() {
        }

        /* renamed from: a */
        public CheckoutBrandDetectionType createFromParcel(Parcel parcel) {
            return CheckoutBrandDetectionType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutBrandDetectionType[] newArray(int i) {
            return new CheckoutBrandDetectionType[i];
        }
    }

    static {
        CREATOR = new C11932a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
