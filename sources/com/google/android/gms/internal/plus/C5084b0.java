package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zze;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.b0 */
public final class C5084b0 implements Creator<zze> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i2 = SafeParcelReader.m18912T(parcel, a);
                    i = 1;
                    break;
                case 2:
                    str = SafeParcelReader.m18898F(parcel, a);
                    i = 2;
                    break;
                case 3:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    i = 3;
                    break;
                case 4:
                    str3 = SafeParcelReader.m18898F(parcel, a);
                    i = 4;
                    break;
                case 5:
                    str4 = SafeParcelReader.m18898F(parcel, a);
                    i = 5;
                    break;
                case 6:
                    str5 = SafeParcelReader.m18898F(parcel, a);
                    i = 6;
                    break;
                case 7:
                    z = SafeParcelReader.m18903K(parcel, a);
                    i = 7;
                    break;
                case 8:
                    str6 = SafeParcelReader.m18898F(parcel, a);
                    i = 8;
                    break;
                case 9:
                    str7 = SafeParcelReader.m18898F(parcel, a);
                    i = 9;
                    break;
                case 10:
                    i3 = SafeParcelReader.m18912T(parcel, a);
                    i = 10;
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == b) {
            zze zze = new zze(hashSet, i2, str, str2, str3, str4, str5, z, str6, str7, i3);
            return zze;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
