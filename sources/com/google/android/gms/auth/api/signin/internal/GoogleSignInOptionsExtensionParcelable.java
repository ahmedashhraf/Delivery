package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.C3989d;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "GoogleSignInOptionsExtensionCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C3998c();
    @C4394c(getter = "getBundle", mo18384id = 3)

    /* renamed from: N */
    private Bundle f12670N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12671a;
    @C4394c(getter = "getType", mo18384id = 2)

    /* renamed from: b */
    private int f12672b;

    @C4393b
    GoogleSignInOptionsExtensionParcelable(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) Bundle bundle) {
        this.f12671a = i;
        this.f12672b = i2;
        this.f12670N = bundle;
    }

    @C4056a
    /* renamed from: N */
    public int mo17509N() {
        return this.f12672b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12671a);
        C4399a.m18964a(parcel, 2, mo17509N());
        C4399a.m18966a(parcel, 3, this.f12670N, false);
        C4399a.m18959a(parcel, a);
    }

    public GoogleSignInOptionsExtensionParcelable(C3989d dVar) {
        this(1, dVar.mo17500b(), dVar.mo17499a());
    }
}
