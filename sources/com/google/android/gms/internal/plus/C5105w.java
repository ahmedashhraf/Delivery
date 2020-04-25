package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzb;
import com.google.android.gms.internal.plus.zzr.zzb.C15805zzb;
import com.google.android.gms.internal.plus.zzr.zzb.zza;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.w */
public final class C5105w implements Creator<zzb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zza zza = null;
        C15805zzb zzb = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            int i3 = 1;
            if (a2 != 1) {
                i3 = 2;
                if (a2 != 2) {
                    i3 = 3;
                    if (a2 != 3) {
                        i3 = 4;
                        if (a2 != 4) {
                            SafeParcelReader.m18918Z(parcel, a);
                        } else {
                            i2 = SafeParcelReader.m18912T(parcel, a);
                        }
                    } else {
                        zzb = (C15805zzb) SafeParcelReader.m18921a(parcel, a, C15805zzb.CREATOR);
                    }
                } else {
                    zza = (zza) SafeParcelReader.m18921a(parcel, a, zza.CREATOR);
                }
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == b) {
            zzb zzb2 = new zzb(hashSet, i, zza, zzb, i2);
            return zzb2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
