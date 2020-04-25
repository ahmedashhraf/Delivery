package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.j */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5288j implements Creator<zzak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        zzaf zzaf = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 == 3) {
                zzaf = (zzaf) SafeParcelReader.m18921a(parcel, a, zzaf.CREATOR);
            } else if (a2 == 4) {
                str2 = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                j = SafeParcelReader.m18914V(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzak zzak = new zzak(str, zzaf, str2, j);
        return zzak;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
