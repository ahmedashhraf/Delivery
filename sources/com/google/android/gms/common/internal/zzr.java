package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C4384q1();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13546a;

    @C4393b
    zzr(@C4396e(mo18387id = 1) int i) {
        this.f13546a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13546a);
        C4399a.m18959a(parcel, a);
    }
}
