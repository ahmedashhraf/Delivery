package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum CVVMode implements Parcelable {
    NONE,
    REQUIRED,
    OPTIONAL;
    
    public static final Creator<CVVMode> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.payment.CVVMode$a */
    static class C11944a implements Creator<CVVMode> {
        C11944a() {
        }

        /* renamed from: a */
        public CVVMode createFromParcel(Parcel parcel) {
            return CVVMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CVVMode[] newArray(int i) {
            return new CVVMode[i];
        }
    }

    static {
        CREATOR = new C11944a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
