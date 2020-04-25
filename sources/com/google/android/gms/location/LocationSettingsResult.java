package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "LocationSettingsResultCreator")
@C4397f({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements C4246q {
    public static final Creator<LocationSettingsResult> CREATOR = new C5115a0();
    @C4394c(getter = "getStatus", mo18384id = 1)

    /* renamed from: a */
    private final Status f14745a;
    @C4394c(getter = "getLocationSettingsStates", mo18384id = 2)

    /* renamed from: b */
    private final LocationSettingsStates f14746b;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    @C4393b
    public LocationSettingsResult(@C4396e(mo18387id = 1) Status status, @C4396e(mo18387id = 2) LocationSettingsStates locationSettingsStates) {
        this.f14745a = status;
        this.f14746b = locationSettingsStates;
    }

    /* renamed from: N */
    public final LocationSettingsStates mo20053N() {
        return this.f14746b;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f14745a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) mo17504f(), i, false);
        C4399a.m18969a(parcel, 2, (Parcelable) mo20053N(), i, false);
        C4399a.m18959a(parcel, a);
    }
}
