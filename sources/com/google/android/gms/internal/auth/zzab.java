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

@C4392a(creator = "NotifyCompletionRequestCreator")
public final class zzab extends AbstractSafeParcelable {
    public static final Creator<zzab> CREATOR = new C4576c();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final int f13859N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13860a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final String f13861b;

    public zzab(String str, int i) {
        this(1, str, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13860a);
        C4399a.m18979a(parcel, 2, this.f13861b, false);
        C4399a.m18964a(parcel, 3, this.f13859N);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzab(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) int i2) {
        this.f13860a = 1;
        this.f13861b = (String) C4300a0.m18620a(str);
        this.f13859N = i2;
    }
}
