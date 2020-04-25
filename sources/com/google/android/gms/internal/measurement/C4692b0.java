package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.b0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class C4692b0 {

    /* renamed from: a */
    private static final ClassLoader f13992a = C4692b0.class.getClassLoader();

    private C4692b0() {
    }

    /* renamed from: a */
    public static boolean m19947a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static HashMap m19948b(Parcel parcel) {
        return parcel.readHashMap(f13992a);
    }

    /* renamed from: a */
    public static void m19946a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m19943a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m19945a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m19944a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
