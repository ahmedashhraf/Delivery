package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "FusedLocationProviderResultCreator")
@C4397f({1000})
public final class zzad extends AbstractSafeParcelable implements C4246q {
    public static final Creator<zzad> CREATOR = new C4630e();

    /* renamed from: b */
    private static final zzad f13923b = new zzad(Status.f12780P);
    @C4394c(getter = "getStatus", mo18384id = 1)

    /* renamed from: a */
    private final Status f13924a;

    @C4393b
    public zzad(@C4396e(mo18387id = 1) Status status) {
        this.f13924a = status;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f13924a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) mo17504f(), i, false);
        C4399a.m18959a(parcel, a);
    }
}
