package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zza;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.v */
public final class C5104v implements Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
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
                        SafeParcelReader.m18918Z(parcel, a);
                    } else {
                        i3 = SafeParcelReader.m18912T(parcel, a);
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
            return new zza(hashSet, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
