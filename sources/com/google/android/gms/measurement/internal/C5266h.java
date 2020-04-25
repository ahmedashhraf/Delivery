package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5266h implements Creator<zzaf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            if (SafeParcelReader.m18919a(a) != 2) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                bundle = SafeParcelReader.m18935g(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zzaf(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}
