package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "SignInResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Creator<zak> CREATOR = new C5538i();
    @C0195i0
    @C4394c(getter = "getResolveAccountResponse", mo18384id = 3)

    /* renamed from: N */
    private final ResolveAccountResponse f15842N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f15843a;
    @C4394c(getter = "getConnectionResult", mo18384id = 2)

    /* renamed from: b */
    private final ConnectionResult f15844b;

    @C4393b
    zak(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ConnectionResult connectionResult, @C4396e(mo18387id = 3) @C0195i0 ResolveAccountResponse resolveAccountResponse) {
        this.f15843a = i;
        this.f15844b = connectionResult;
        this.f15842N = resolveAccountResponse;
    }

    /* renamed from: N */
    public final ConnectionResult mo21968N() {
        return this.f15844b;
    }

    @C0195i0
    /* renamed from: O */
    public final ResolveAccountResponse mo21969O() {
        return this.f15842N;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f15843a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f15844b, i, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f15842N, i, false);
        C4399a.m18959a(parcel, a);
    }

    public zak(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zak(ConnectionResult connectionResult, @C0195i0 ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }
}
