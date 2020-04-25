package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "RetrieveDataRequestCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Creator<zzad> CREATOR = new C4578d();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13862a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final String f13863b;

    public zzad(String str) {
        this(1, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13862a);
        C4399a.m18979a(parcel, 2, this.f13863b, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzad(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str) {
        this.f13862a = 1;
        this.f13863b = (String) C4300a0.m18620a(str);
    }
}
