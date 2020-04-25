package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.fc */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4768fc implements Creator<zzv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 2:
                    j2 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 3:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 5:
                    str2 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 6:
                    str3 = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m18935g(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        zzv zzv = new zzv(j, j2, z, str, str2, str3, bundle);
        return zzv;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzv[i];
    }
}
