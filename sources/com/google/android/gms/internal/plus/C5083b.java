package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzf;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.b */
public final class C5083b implements Creator<zzf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            int i2 = 1;
            if (a2 != 1) {
                i2 = 2;
                if (a2 != 2) {
                    i2 = 3;
                    if (a2 != 3) {
                        SafeParcelReader.m18918Z(parcel, a);
                    } else {
                        str = SafeParcelReader.m18898F(parcel, a);
                    }
                } else {
                    z = SafeParcelReader.m18903K(parcel, a);
                }
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
            hashSet.add(Integer.valueOf(i2));
        }
        if (parcel.dataPosition() == b) {
            return new zzf(hashSet, i, z, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
