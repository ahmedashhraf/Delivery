package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "InitializationParamsCreator")
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class zzv extends AbstractSafeParcelable {
    public static final Creator<zzv> CREATOR = new C4768fc();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    public final boolean f14573N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    public final String f14574O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    public final String f14575P;
    @C4394c(mo18384id = 6)

    /* renamed from: Q */
    public final String f14576Q;
    @C4394c(mo18384id = 7)

    /* renamed from: R */
    public final Bundle f14577R;
    @C4394c(mo18384id = 1)

    /* renamed from: a */
    public final long f14578a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    public final long f14579b;

    @C4393b
    public zzv(@C4396e(mo18387id = 1) long j, @C4396e(mo18387id = 2) long j2, @C4396e(mo18387id = 3) boolean z, @C4396e(mo18387id = 4) String str, @C4396e(mo18387id = 5) String str2, @C4396e(mo18387id = 6) String str3, @C4396e(mo18387id = 7) Bundle bundle) {
        this.f14578a = j;
        this.f14579b = j2;
        this.f14573N = z;
        this.f14574O = str;
        this.f14575P = str2;
        this.f14576Q = str3;
        this.f14577R = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18965a(parcel, 1, this.f14578a);
        C4399a.m18965a(parcel, 2, this.f14579b);
        C4399a.m18984a(parcel, 3, this.f14573N);
        C4399a.m18979a(parcel, 4, this.f14574O, false);
        C4399a.m18979a(parcel, 5, this.f14575P, false);
        C4399a.m18979a(parcel, 6, this.f14576Q, false);
        C4399a.m18966a(parcel, 7, this.f14577R, false);
        C4399a.m18959a(parcel, a);
    }
}
