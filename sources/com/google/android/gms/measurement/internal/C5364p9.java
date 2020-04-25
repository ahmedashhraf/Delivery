package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5364p9 implements Creator<zzs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzjx zzjx = null;
        String str3 = null;
        zzak zzak = null;
        zzak zzak2 = null;
        zzak zzak3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    str = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 4:
                    zzjx = (zzjx) SafeParcelReader.m18921a(parcel2, a, zzjx.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 6:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 8:
                    zzak = (zzak) SafeParcelReader.m18921a(parcel2, a, zzak.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 10:
                    zzak2 = (zzak) SafeParcelReader.m18921a(parcel2, a, zzak.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 12:
                    zzak3 = (zzak) SafeParcelReader.m18921a(parcel2, a, zzak.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzs zzs = new zzs(str, str2, zzjx, j, z, str3, zzak, j2, zzak2, j3, zzak3);
        return zzs;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
