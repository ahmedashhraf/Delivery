package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CheckoutSecurityPolicyMode implements Parcelable {
    DEVICE_AUTH_REQUIRED,
    DEVICE_AUTH_REQUIRED_IF_AVAILABLE,
    DEVICE_AUTH_NOT_REQUIRED;
    
    public static final Creator<CheckoutSecurityPolicyMode> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode$a */
    static class C11935a implements Creator<CheckoutSecurityPolicyMode> {
        C11935a() {
        }

        /* renamed from: a */
        public CheckoutSecurityPolicyMode createFromParcel(Parcel parcel) {
            return CheckoutSecurityPolicyMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutSecurityPolicyMode[] newArray(int i) {
            return new CheckoutSecurityPolicyMode[i];
        }
    }

    static {
        CREATOR = new C11935a();
    }

    /* renamed from: c */
    public static CheckoutSecurityPolicyMode m53658c(String str) {
        CheckoutSecurityPolicyMode[] values;
        for (CheckoutSecurityPolicyMode checkoutSecurityPolicyMode : values()) {
            if (checkoutSecurityPolicyMode.name().equalsIgnoreCase(str)) {
                return checkoutSecurityPolicyMode;
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
