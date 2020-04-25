package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.d0 */
public final class C4261d0 implements Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 == 2) {
                iBinder = SafeParcelReader.m18911S(parcel, a);
            } else if (a2 == 3) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                z2 = SafeParcelReader.m18903K(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zzk(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
