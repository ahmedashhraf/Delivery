package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.plus.internal.l */
public final class C5525l implements Creator<PlusCommonExtras> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 == 2) {
                str2 = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new PlusCommonExtras(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlusCommonExtras[i];
    }
}
