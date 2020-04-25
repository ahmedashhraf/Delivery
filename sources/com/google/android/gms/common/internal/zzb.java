package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "ConnectionInfoCreator")
public final class zzb extends AbstractSafeParcelable {
    public static final Creator<zzb> CREATOR = new C4304b1();
    @C4394c(mo18384id = 1)

    /* renamed from: a */
    Bundle f13544a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    Feature[] f13545b;

    @C4393b
    zzb(@C4396e(mo18387id = 1) Bundle bundle, @C4396e(mo18387id = 2) Feature[] featureArr) {
        this.f13544a = bundle;
        this.f13545b = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18966a(parcel, 1, this.f13544a, false);
        C4399a.m18993a(parcel, 2, (T[]) this.f13545b, i, false);
        C4399a.m18959a(parcel, a);
    }

    public zzb() {
    }
}
