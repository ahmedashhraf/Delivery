package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.u */
public final class C5160u implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        zzaj[] zzajArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                i3 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 == 4) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                zzajArr = (zzaj[]) SafeParcelReader.m18927b(parcel, a, zzaj.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        LocationAvailability locationAvailability = new LocationAvailability(i, i2, i3, j, zzajArr);
        return locationAvailability;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
