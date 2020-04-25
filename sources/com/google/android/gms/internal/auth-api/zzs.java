package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "DeleteRequestCreator")
@C4397f({1000})
public final class zzs extends AbstractSafeParcelable {
    public static final Creator<zzs> CREATOR = new C4566q();
    @C4394c(getter = "getCredential", mo18384id = 1)

    /* renamed from: a */
    private final Credential f13834a;

    @C4393b
    public zzs(@C4396e(mo18387id = 1) Credential credential) {
        this.f13834a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) this.f13834a, i, false);
        C4399a.m18959a(parcel, a);
    }
}
