package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzb.C15805zzb;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.y */
public final class C5107y implements Creator<C15805zzb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            int i4 = 1;
            if (a2 != 1) {
                i4 = 2;
                if (a2 != 2) {
                    i4 = 3;
                    if (a2 != 3) {
                        i4 = 4;
                        if (a2 != 4) {
                            SafeParcelReader.m18918Z(parcel, a);
                        } else {
                            i3 = SafeParcelReader.m18912T(parcel, a);
                        }
                    } else {
                        str = SafeParcelReader.m18898F(parcel, a);
                    }
                } else {
                    i2 = SafeParcelReader.m18912T(parcel, a);
                }
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
            hashSet.add(Integer.valueOf(i4));
        }
        if (parcel.dataPosition() == b) {
            C15805zzb zzb = new C15805zzb(hashSet, i, i2, str, i3);
            return zzb;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C15805zzb[i];
    }
}
