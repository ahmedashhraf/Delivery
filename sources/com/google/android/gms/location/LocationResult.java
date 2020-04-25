package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@C4392a(creator = "LocationResultCreator")
@C4397f({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationResult> CREATOR = new C5164w();

    /* renamed from: b */
    static final List<Location> f14735b = Collections.emptyList();
    @C4394c(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", mo18384id = 1)

    /* renamed from: a */
    private final List<Location> f14736a;

    @C4393b
    LocationResult(@C4396e(mo18387id = 1) List<Location> list) {
        this.f14736a = list;
    }

    /* renamed from: a */
    public static LocationResult m22329a(Intent intent) {
        if (!m22331b(intent)) {
            return null;
        }
        return (LocationResult) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: a */
    public static LocationResult m22330a(List<Location> list) {
        if (list == null) {
            list = f14735b;
        }
        return new LocationResult(list);
    }

    /* renamed from: b */
    public static boolean m22331b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: N */
    public final Location mo20041N() {
        int size = this.f14736a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f14736a.get(size - 1);
    }

    @C0193h0
    /* renamed from: O */
    public final List<Location> mo20042O() {
        return this.f14736a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f14736a.size() != this.f14736a.size()) {
            return false;
        }
        Iterator it = this.f14736a.iterator();
        for (Location time : locationResult.f14736a) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f14736a) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14736a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, mo20042O(), false);
        C4399a.m18959a(parcel, a);
    }
}
