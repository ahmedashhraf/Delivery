package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "AuthAccountResultCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zab extends AbstractSafeParcelable implements C4246q {
    public static final Creator<zab> CREATOR = new C5531b();
    @C0195i0
    @C4394c(getter = "getRawAuthResolutionIntent", mo18384id = 3)

    /* renamed from: N */
    private Intent f15837N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f15838a;
    @C4394c(getter = "getConnectionResultCode", mo18384id = 2)

    /* renamed from: b */
    private int f15839b;

    @C4393b
    zab(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) @C0195i0 Intent intent) {
        this.f15838a = i;
        this.f15839b = i2;
        this.f15837N = intent;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        if (this.f15839b == 0) {
            return Status.f12780P;
        }
        return Status.f12784T;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f15838a);
        C4399a.m18964a(parcel, 2, this.f15839b);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f15837N, i, false);
        C4399a.m18959a(parcel, a);
    }

    public zab() {
        this(0, null);
    }

    private zab(int i, @C0195i0 Intent intent) {
        this(2, 0, null);
    }
}
