package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4375p.C4376a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "ResolveAccountResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C4415y0();
    @C4394c(getter = "getConnectionResult", mo18384id = 3)

    /* renamed from: N */
    private ConnectionResult f13372N;
    @C4394c(getter = "getSaveDefaultAccount", mo18384id = 4)

    /* renamed from: O */
    private boolean f13373O;
    @C4394c(getter = "isFromCrossClientAuth", mo18384id = 5)

    /* renamed from: P */
    private boolean f13374P;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13375a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private IBinder f13376b;

    @C4393b
    ResolveAccountResponse(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) IBinder iBinder, @C4396e(mo18387id = 3) ConnectionResult connectionResult, @C4396e(mo18387id = 4) boolean z, @C4396e(mo18387id = 5) boolean z2) {
        this.f13375a = i;
        this.f13376b = iBinder;
        this.f13372N = connectionResult;
        this.f13373O = z;
        this.f13374P = z2;
    }

    /* renamed from: N */
    public C4375p mo18205N() {
        return C4376a.m18877a(this.f13376b);
    }

    /* renamed from: O */
    public ConnectionResult mo18206O() {
        return this.f13372N;
    }

    /* renamed from: P */
    public boolean mo18207P() {
        return this.f13373O;
    }

    /* renamed from: Q */
    public boolean mo18208Q() {
        return this.f13374P;
    }

    /* renamed from: a */
    public ResolveAccountResponse mo18209a(C4375p pVar) {
        this.f13376b = pVar == null ? null : pVar.asBinder();
        return this;
    }

    /* renamed from: b */
    public ResolveAccountResponse mo18211b(boolean z) {
        this.f13373O = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f13372N.equals(resolveAccountResponse.f13372N) && mo18205N().equals(resolveAccountResponse.mo18205N());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13375a);
        C4399a.m18967a(parcel, 2, this.f13376b, false);
        C4399a.m18969a(parcel, 3, (Parcelable) mo18206O(), i, false);
        C4399a.m18984a(parcel, 4, mo18207P());
        C4399a.m18984a(parcel, 5, mo18208Q());
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: a */
    public ResolveAccountResponse mo18210a(boolean z) {
        this.f13374P = z;
        return this;
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, null));
    }
}
