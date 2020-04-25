package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "SignInRequestCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Creator<zai> CREATOR = new C5537h();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f15840a;
    @C4394c(getter = "getResolveAccountRequest", mo18384id = 2)

    /* renamed from: b */
    private final ResolveAccountRequest f15841b;

    @C4393b
    zai(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f15840a = i;
        this.f15841b = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f15840a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f15841b, i, false);
        C4399a.m18959a(parcel, a);
    }

    public zai(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}
