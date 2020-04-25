package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "LocationSettingsConfigurationCreator")
@C4397f({3, 4, 1000})
public final class zzae extends AbstractSafeParcelable {
    public static final Creator<zzae> CREATOR = new C5168y();
    @C4394c(defaultValue = "", getter = "getTitleText", mo18384id = 5)

    /* renamed from: N */
    private final String f14802N;
    @C4394c(defaultValue = "", getter = "getJustificationText", mo18384id = 1)

    /* renamed from: a */
    private final String f14803a;
    @C4394c(defaultValue = "", getter = "getExperimentId", mo18384id = 2)

    /* renamed from: b */
    private final String f14804b;

    @C4393b
    zzae(@C4396e(mo18387id = 5) String str, @C4396e(mo18387id = 1) String str2, @C4396e(mo18387id = 2) String str3) {
        this.f14802N = str;
        this.f14803a = str2;
        this.f14804b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, this.f14803a, false);
        C4399a.m18979a(parcel, 2, this.f14804b, false);
        C4399a.m18979a(parcel, 5, this.f14802N, false);
        C4399a.m18959a(parcel, a);
    }
}
