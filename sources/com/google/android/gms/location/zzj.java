package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "DeviceOrientationRequestCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C5144m0();
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", mo18384id = 3)

    /* renamed from: N */
    private float f14812N;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", mo18384id = 4)

    /* renamed from: O */
    private long f14813O;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", mo18384id = 5)

    /* renamed from: P */
    private int f14814P;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", mo18384id = 1)

    /* renamed from: a */
    private boolean f14815a;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", mo18384id = 2)

    /* renamed from: b */
    private long f14816b;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @C4393b
    zzj(@C4396e(mo18387id = 1) boolean z, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 3) float f, @C4396e(mo18387id = 4) long j2, @C4396e(mo18387id = 5) int i) {
        this.f14815a = z;
        this.f14816b = j;
        this.f14812N = f;
        this.f14813O = j2;
        this.f14814P = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f14815a == zzj.f14815a && this.f14816b == zzj.f14816b && Float.compare(this.f14812N, zzj.f14812N) == 0 && this.f14813O == zzj.f14813O && this.f14814P == zzj.f14814P;
    }

    public final int hashCode() {
        return C4413y.m19051a(Boolean.valueOf(this.f14815a), Long.valueOf(this.f14816b), Float.valueOf(this.f14812N), Long.valueOf(this.f14813O), Integer.valueOf(this.f14814P));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f14815a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f14816b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f14812N);
        long j = this.f14813O;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f14814P != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f14814P);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18984a(parcel, 1, this.f14815a);
        C4399a.m18965a(parcel, 2, this.f14816b);
        C4399a.m18963a(parcel, 3, this.f14812N);
        C4399a.m18965a(parcel, 4, this.f14813O);
        C4399a.m18964a(parcel, 5, this.f14814P);
        C4399a.m18959a(parcel, a);
    }
}
