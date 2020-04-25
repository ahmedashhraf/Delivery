package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5331m9 implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        List list = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 5:
                    str4 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 6:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 7:
                    j2 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 8:
                    str5 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 9:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 10:
                    z2 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 11:
                    j6 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 12:
                    str6 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 13:
                    j3 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 14:
                    j4 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 15:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 16:
                    z3 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 17:
                    z4 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 18:
                    z5 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 19:
                    str7 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 21:
                    bool = SafeParcelReader.m18904L(parcel2, a);
                    break;
                case 22:
                    j5 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 23:
                    list = SafeParcelReader.m18900H(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzm zzm = new zzm(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, list);
        return zzm;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
