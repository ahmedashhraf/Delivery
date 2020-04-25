package com.google.android.gms.internal.plus;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.internal.plus.f */
public class C5088f {

    /* renamed from: a */
    private static final ClassLoader f14583a = C5088f.class.getClassLoader();

    private C5088f() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m22086a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m22087a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
