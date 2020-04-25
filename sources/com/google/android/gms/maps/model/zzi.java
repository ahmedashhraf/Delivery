package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Creator<PatternItem> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                f = SafeParcelReader.m18910R(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new PatternItem(i, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PatternItem[i];
    }
}
