package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.t */
public final class C3942t implements Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
                hashSet.add(Integer.valueOf(1));
            } else if (a2 == 2) {
                zzt = (zzt) SafeParcelReader.m18921a(parcel, a, zzt.CREATOR);
                hashSet.add(Integer.valueOf(2));
            } else if (a2 == 3) {
                str = SafeParcelReader.m18898F(parcel, a);
                hashSet.add(Integer.valueOf(3));
            } else if (a2 == 4) {
                str2 = SafeParcelReader.m18898F(parcel, a);
                hashSet.add(Integer.valueOf(4));
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                str3 = SafeParcelReader.m18898F(parcel, a);
                hashSet.add(Integer.valueOf(5));
            }
        }
        if (parcel.dataPosition() == b) {
            zzr zzr = new zzr(hashSet, i, zzt, str, str2, str3);
            return zzr;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
