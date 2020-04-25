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

@C4392a(creator = "SendDataRequestCreator")
public final class zzaf extends AbstractSafeParcelable {
    public static final Creator<zzaf> CREATOR = new C4580e();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final byte[] f13864N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13865a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final String f13866b;

    public zzaf(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13865a);
        C4399a.m18979a(parcel, 2, this.f13866b, false);
        C4399a.m18985a(parcel, 3, this.f13864N, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzaf(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) byte[] bArr) {
        this.f13865a = 1;
        this.f13866b = (String) C4300a0.m18620a(str);
        this.f13864N = (byte[]) C4300a0.m18620a(bArr);
    }
}
