package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Arrays;

@C4392a(creator = "LocationAvailabilityCreator")
@C4397f({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new C5160u();
    @C4394c(defaultValueUnchecked = "0", mo18384id = 3)

    /* renamed from: N */
    private long f14718N;
    @C4394c(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", mo18384id = 4)

    /* renamed from: O */
    private int f14719O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    private zzaj[] f14720P;
    @Deprecated
    @C4394c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo18384id = 1)

    /* renamed from: a */
    private int f14721a;
    @Deprecated
    @C4394c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo18384id = 2)

    /* renamed from: b */
    private int f14722b;

    @C4393b
    LocationAvailability(@C4396e(mo18387id = 4) int i, @C4396e(mo18387id = 1) int i2, @C4396e(mo18387id = 2) int i3, @C4396e(mo18387id = 3) long j, @C4396e(mo18387id = 5) zzaj[] zzajArr) {
        this.f14719O = i;
        this.f14721a = i2;
        this.f14722b = i3;
        this.f14718N = j;
        this.f14720P = zzajArr;
    }

    /* renamed from: a */
    public static LocationAvailability m22308a(Intent intent) {
        if (!m22309b(intent)) {
            return null;
        }
        return (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: b */
    public static boolean m22309b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: N */
    public final boolean mo20016N() {
        return this.f14719O < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f14721a == locationAvailability.f14721a && this.f14722b == locationAvailability.f14722b && this.f14718N == locationAvailability.f14718N && this.f14719O == locationAvailability.f14719O && Arrays.equals(this.f14720P, locationAvailability.f14720P);
        }
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14719O), Integer.valueOf(this.f14721a), Integer.valueOf(this.f14722b), Long.valueOf(this.f14718N), this.f14720P);
    }

    public final String toString() {
        boolean N = mo20016N();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(N);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f14721a);
        C4399a.m18964a(parcel, 2, this.f14722b);
        C4399a.m18965a(parcel, 3, this.f14718N);
        C4399a.m18964a(parcel, 4, this.f14719O);
        C4399a.m18993a(parcel, 5, (T[]) this.f14720P, i, false);
        C4399a.m18959a(parcel, a);
    }
}
