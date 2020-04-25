package com.oppwa.mobile.connect.provider;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum TransactionType implements Parcelable {
    SYNC,
    ASYNC;
    
    public static final Creator<TransactionType> CREATOR = null;

    /* renamed from: com.oppwa.mobile.connect.provider.TransactionType$a */
    static class C11976a implements Creator<TransactionType> {
        C11976a() {
        }

        /* renamed from: a */
        public TransactionType createFromParcel(Parcel parcel) {
            return TransactionType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public TransactionType[] newArray(int i) {
            return new TransactionType[i];
        }
    }

    static {
        CREATOR = new C11976a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
