package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "DeviceMetaDataCreator")
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Creator<DeviceMetaData> CREATOR = new C3944v();
    @C4394c(getter = "getMinAgeOfLockScreen", mo18384id = 3)

    /* renamed from: N */
    private long f12428N;
    @C4394c(getter = "isChallengeAllowed", mo18384id = 4)

    /* renamed from: O */
    private final boolean f12429O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12430a;
    @C4394c(getter = "isLockScreenSolved", mo18384id = 2)

    /* renamed from: b */
    private boolean f12431b;

    @C4393b
    DeviceMetaData(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) boolean z, @C4396e(mo18387id = 3) long j, @C4396e(mo18387id = 4) boolean z2) {
        this.f12430a = i;
        this.f12431b = z;
        this.f12428N = j;
        this.f12429O = z2;
    }

    /* renamed from: N */
    public long mo17299N() {
        return this.f12428N;
    }

    /* renamed from: O */
    public boolean mo17300O() {
        return this.f12429O;
    }

    /* renamed from: P */
    public boolean mo17301P() {
        return this.f12431b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12430a);
        C4399a.m18984a(parcel, 2, mo17301P());
        C4399a.m18965a(parcel, 3, mo17299N());
        C4399a.m18984a(parcel, 4, mo17300O());
        C4399a.m18959a(parcel, a);
    }
}
