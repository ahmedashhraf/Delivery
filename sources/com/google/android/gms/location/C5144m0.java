package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.m0 */
public final class C5144m0 implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m18903K(parcel2, a);
            } else if (a2 == 2) {
                j = SafeParcelReader.m18914V(parcel2, a);
            } else if (a2 == 3) {
                f = SafeParcelReader.m18909Q(parcel2, a);
            } else if (a2 == 4) {
                j2 = SafeParcelReader.m18914V(parcel2, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel2, a);
            } else {
                i = SafeParcelReader.m18912T(parcel2, a);
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzj zzj = new zzj(z, j, f, j2, i);
        return zzj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
