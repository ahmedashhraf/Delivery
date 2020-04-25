package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.g0 */
public final class C4637g0 implements Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    str = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 3:
                    s = SafeParcelReader.m18916X(parcel2, a);
                    break;
                case 4:
                    d = SafeParcelReader.m18907O(parcel2, a);
                    break;
                case 5:
                    d2 = SafeParcelReader.m18907O(parcel2, a);
                    break;
                case 6:
                    f = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 7:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 8:
                    i2 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 9:
                    i3 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzbh zzbh = new zzbh(str, i, s, d, d2, f, j, i2, i3);
        return zzbh;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
