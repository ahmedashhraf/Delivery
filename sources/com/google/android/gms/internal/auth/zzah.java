package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "UserChallengeRequestCreator")
public final class zzah extends AbstractSafeParcelable {
    public static final Creator<zzah> CREATOR = new C4582f();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final PendingIntent f13867N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13868a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final String f13869b;

    public zzah(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13868a);
        C4399a.m18979a(parcel, 2, this.f13869b, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f13867N, i, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzah(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) PendingIntent pendingIntent) {
        this.f13868a = 1;
        this.f13869b = (String) C4300a0.m18620a(str);
        this.f13867N = (PendingIntent) C4300a0.m18620a(pendingIntent);
    }
}
