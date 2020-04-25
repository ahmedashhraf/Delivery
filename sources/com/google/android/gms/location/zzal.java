package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "RemoveGeofencingRequestCreator")
@C4397f({1000})
public final class zzal extends AbstractSafeParcelable {
    public static final Creator<zzal> CREATOR = new C5123d0();
    @C4394c(defaultValue = "", getter = "getTag", mo18384id = 3)

    /* renamed from: N */
    private final String f14809N;
    @C4394c(getter = "getGeofenceIds", mo18384id = 1)

    /* renamed from: a */
    private final List<String> f14810a;
    @C4394c(getter = "getPendingIntent", mo18384id = 2)

    /* renamed from: b */
    private final PendingIntent f14811b;

    @C4393b
    zzal(@C4396e(mo18387id = 1) @C0195i0 List<String> list, @C4396e(mo18387id = 2) @C0195i0 PendingIntent pendingIntent, @C4396e(mo18387id = 3) String str) {
        this.f14810a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f14811b = pendingIntent;
        this.f14809N = str;
    }

    /* renamed from: a */
    public static zzal m22440a(PendingIntent pendingIntent) {
        C4300a0.m18621a(pendingIntent, (Object) "PendingIntent can not be null.");
        return new zzal(null, pendingIntent, "");
    }

    public static zzal zza(List<String> list) {
        C4300a0.m18621a(list, (Object) "geofence can't be null.");
        C4300a0.m18628a(!list.isEmpty(), (Object) "Geofences must contains at least one id.");
        return new zzal(list, null, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19016i(parcel, 1, this.f14810a, false);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f14811b, i, false);
        C4399a.m18979a(parcel, 3, this.f14809N, false);
        C4399a.m18959a(parcel, a);
    }
}
