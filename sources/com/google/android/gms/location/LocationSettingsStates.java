package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "LocationSettingsStatesCreator")
@C4397f({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsStates> CREATOR = new C5118b0();
    @C4394c(getter = "isBleUsable", mo18384id = 3)

    /* renamed from: N */
    private final boolean f14747N;
    @C4394c(getter = "isGpsPresent", mo18384id = 4)

    /* renamed from: O */
    private final boolean f14748O;
    @C4394c(getter = "isNetworkLocationPresent", mo18384id = 5)

    /* renamed from: P */
    private final boolean f14749P;
    @C4394c(getter = "isBlePresent", mo18384id = 6)

    /* renamed from: Q */
    private final boolean f14750Q;
    @C4394c(getter = "isGpsUsable", mo18384id = 1)

    /* renamed from: a */
    private final boolean f14751a;
    @C4394c(getter = "isNetworkLocationUsable", mo18384id = 2)

    /* renamed from: b */
    private final boolean f14752b;

    @C4393b
    public LocationSettingsStates(@C4396e(mo18387id = 1) boolean z, @C4396e(mo18387id = 2) boolean z2, @C4396e(mo18387id = 3) boolean z3, @C4396e(mo18387id = 4) boolean z4, @C4396e(mo18387id = 5) boolean z5, @C4396e(mo18387id = 6) boolean z6) {
        this.f14751a = z;
        this.f14752b = z2;
        this.f14747N = z3;
        this.f14748O = z4;
        this.f14749P = z5;
        this.f14750Q = z6;
    }

    /* renamed from: a */
    public static LocationSettingsStates m22341a(Intent intent) {
        return (LocationSettingsStates) C4400b.m19018a(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    /* renamed from: N */
    public final boolean mo20055N() {
        return this.f14750Q;
    }

    /* renamed from: O */
    public final boolean mo20056O() {
        return this.f14747N;
    }

    /* renamed from: P */
    public final boolean mo20057P() {
        return this.f14748O;
    }

    /* renamed from: Q */
    public final boolean mo20058Q() {
        return this.f14751a;
    }

    /* renamed from: R */
    public final boolean mo20059R() {
        return this.f14748O || this.f14749P;
    }

    /* renamed from: S */
    public final boolean mo20060S() {
        return this.f14751a || this.f14752b;
    }

    /* renamed from: T */
    public final boolean mo20061T() {
        return this.f14749P;
    }

    /* renamed from: U */
    public final boolean mo20062U() {
        return this.f14752b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18984a(parcel, 1, mo20058Q());
        C4399a.m18984a(parcel, 2, mo20062U());
        C4399a.m18984a(parcel, 3, mo20056O());
        C4399a.m18984a(parcel, 4, mo20057P());
        C4399a.m18984a(parcel, 5, mo20061T());
        C4399a.m18984a(parcel, 6, mo20055N());
        C4399a.m18959a(parcel, a);
    }
}
