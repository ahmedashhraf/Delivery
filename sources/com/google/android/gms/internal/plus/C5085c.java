package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzg;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.plus.c */
public final class C5085c implements Creator<zzg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            int i4 = 1;
            if (a2 != 1) {
                i4 = 3;
                if (a2 != 3) {
                    i4 = 4;
                    if (a2 != 4) {
                        i4 = 5;
                        if (a2 != 5) {
                            i4 = 6;
                            if (a2 != 6) {
                                SafeParcelReader.m18918Z(parcel, a);
                            } else {
                                i2 = SafeParcelReader.m18912T(parcel, a);
                            }
                        } else {
                            str = SafeParcelReader.m18898F(parcel, a);
                        }
                    } else {
                        str2 = SafeParcelReader.m18898F(parcel, a);
                    }
                } else {
                    i3 = SafeParcelReader.m18912T(parcel, a);
                }
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
            hashSet.add(Integer.valueOf(i4));
        }
        if (parcel.dataPosition() == b) {
            zzg zzg = new zzg(hashSet, i, str, i2, str2, i3);
            return zzg;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
