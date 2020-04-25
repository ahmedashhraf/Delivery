package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.p */
public final class C3938p implements Creator<zzl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzo = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
                hashSet.add(Integer.valueOf(1));
            } else if (a2 == 2) {
                arrayList = SafeParcelReader.m18930c(parcel, a, zzr.CREATOR);
                hashSet.add(Integer.valueOf(2));
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m18912T(parcel, a);
                hashSet.add(Integer.valueOf(3));
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                zzo = (zzo) SafeParcelReader.m18921a(parcel, a, zzo.CREATOR);
                hashSet.add(Integer.valueOf(4));
            }
        }
        if (parcel.dataPosition() == b) {
            zzl zzl = new zzl(hashSet, i, arrayList, i2, zzo);
            return zzl;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
