package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.c0 */
public final class C5121c0 implements Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                j2 = SafeParcelReader.m18914V(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzaj zzaj = new zzaj(i, i2, j, j2);
        return zzaj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
