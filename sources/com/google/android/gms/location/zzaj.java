package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "NetworkLocationStatusCreator")
public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new C5121c0();
    @C4394c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo18384id = 3)

    /* renamed from: N */
    private final long f14805N;
    @C4394c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo18384id = 4)

    /* renamed from: O */
    private final long f14806O;
    @C4394c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo18384id = 1)

    /* renamed from: a */
    private final int f14807a;
    @C4394c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo18384id = 2)

    /* renamed from: b */
    private final int f14808b;

    @C4393b
    zzaj(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) long j, @C4396e(mo18387id = 4) long j2) {
        this.f14807a = i;
        this.f14808b = i2;
        this.f14805N = j;
        this.f14806O = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f14807a == zzaj.f14807a && this.f14808b == zzaj.f14808b && this.f14805N == zzaj.f14805N && this.f14806O == zzaj.f14806O;
        }
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14808b), Integer.valueOf(this.f14807a), Long.valueOf(this.f14806O), Long.valueOf(this.f14805N));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f14807a);
        sb.append(" Cell status: ");
        sb.append(this.f14808b);
        sb.append(" elapsed time NS: ");
        sb.append(this.f14806O);
        sb.append(" system time ms: ");
        sb.append(this.f14805N);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f14807a);
        C4399a.m18964a(parcel, 2, this.f14808b);
        C4399a.m18965a(parcel, 3, this.f14805N);
        C4399a.m18965a(parcel, 4, this.f14806O);
        C4399a.m18959a(parcel, a);
    }
}
