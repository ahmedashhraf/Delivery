package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5243e9 implements Creator<zzjx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 4:
                    l = SafeParcelReader.m18915W(parcel2, a);
                    break;
                case 5:
                    f = SafeParcelReader.m18910R(parcel2, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 8:
                    d = SafeParcelReader.m18908P(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzjx zzjx = new zzjx(i, str, j, l, f, str2, str3, d);
        return zzjx;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjx[i];
    }
}
