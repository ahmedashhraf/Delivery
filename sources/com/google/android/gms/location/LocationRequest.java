package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.common.util.C4476d0;

@C4392a(creator = "LocationRequestCreator")
@C4397f({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new C5162v();

    /* renamed from: T */
    public static final int f14723T = 100;

    /* renamed from: U */
    public static final int f14724U = 102;

    /* renamed from: V */
    public static final int f14725V = 104;

    /* renamed from: W */
    public static final int f14726W = 105;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", mo18384id = 3)

    /* renamed from: N */
    private long f14727N;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", mo18384id = 4)

    /* renamed from: O */
    private boolean f14728O;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", mo18384id = 5)

    /* renamed from: P */
    private long f14729P;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", mo18384id = 6)

    /* renamed from: Q */
    private int f14730Q;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", mo18384id = 7)

    /* renamed from: R */
    private float f14731R;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", mo18384id = 8)

    /* renamed from: S */
    private long f14732S;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", mo18384id = 1)

    /* renamed from: a */
    private int f14733a;
    @C4394c(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", mo18384id = 2)

    /* renamed from: b */
    private long f14734b;

    public LocationRequest() {
        this.f14733a = 102;
        this.f14734b = 3600000;
        this.f14727N = 600000;
        this.f14728O = false;
        this.f14729P = Long.MAX_VALUE;
        this.f14730Q = Integer.MAX_VALUE;
        this.f14731R = 0.0f;
        this.f14732S = 0;
    }

    @C4393b
    LocationRequest(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 3) long j2, @C4396e(mo18387id = 4) boolean z, @C4396e(mo18387id = 5) long j3, @C4396e(mo18387id = 6) int i2, @C4396e(mo18387id = 7) float f, @C4396e(mo18387id = 8) long j4) {
        this.f14733a = i;
        this.f14734b = j;
        this.f14727N = j2;
        this.f14728O = z;
        this.f14729P = j3;
        this.f14730Q = i2;
        this.f14731R = f;
        this.f14732S = j4;
    }

    @C4476d0
    /* renamed from: V */
    public static LocationRequest m22311V() {
        return new LocationRequest();
    }

    /* renamed from: a */
    private static void m22312a(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: N */
    public final long mo20021N() {
        return this.f14729P;
    }

    /* renamed from: O */
    public final long mo20022O() {
        return this.f14727N;
    }

    /* renamed from: P */
    public final long mo20023P() {
        return this.f14734b;
    }

    /* renamed from: Q */
    public final long mo20024Q() {
        long j = this.f14732S;
        long j2 = this.f14734b;
        return j < j2 ? j2 : j;
    }

    /* renamed from: R */
    public final int mo20025R() {
        return this.f14730Q;
    }

    /* renamed from: S */
    public final int mo20026S() {
        return this.f14733a;
    }

    /* renamed from: T */
    public final float mo20027T() {
        return this.f14731R;
    }

    /* renamed from: U */
    public final boolean mo20028U() {
        return this.f14728O;
    }

    @C4476d0
    /* renamed from: a */
    public final LocationRequest mo20029a(float f) {
        if (f >= 0.0f) {
            this.f14731R = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final LocationRequest mo20030b(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.f14729P = Long.MAX_VALUE;
        } else {
            this.f14729P = j + elapsedRealtime;
        }
        if (this.f14729P < 0) {
            this.f14729P = 0;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f14733a == locationRequest.f14733a && this.f14734b == locationRequest.f14734b && this.f14727N == locationRequest.f14727N && this.f14728O == locationRequest.f14728O && this.f14729P == locationRequest.f14729P && this.f14730Q == locationRequest.f14730Q && this.f14731R == locationRequest.f14731R && mo20024Q() == locationRequest.mo20024Q();
    }

    @C4476d0
    /* renamed from: g */
    public final LocationRequest mo20032g(int i) {
        if (i > 0) {
            this.f14730Q = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @C4476d0
    /* renamed from: h */
    public final LocationRequest mo20033h(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f14733a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14733a), Long.valueOf(this.f14734b), Float.valueOf(this.f14731R), Long.valueOf(this.f14732S));
    }

    @C4476d0
    /* renamed from: l */
    public final LocationRequest mo20035l(long j) {
        this.f14729P = j;
        if (this.f14729P < 0) {
            this.f14729P = 0;
        }
        return this;
    }

    /* renamed from: m */
    public final LocationRequest mo20036m(long j) {
        m22312a(j);
        this.f14728O = true;
        this.f14727N = j;
        return this;
    }

    /* renamed from: n */
    public final LocationRequest mo20037n(long j) {
        m22312a(j);
        this.f14734b = j;
        if (!this.f14728O) {
            double d = (double) this.f14734b;
            Double.isNaN(d);
            this.f14727N = (long) (d / 6.0d);
        }
        return this;
    }

    @C4476d0
    /* renamed from: o */
    public final LocationRequest mo20038o(long j) {
        m22312a(j);
        this.f14732S = j;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f14733a;
        String str = i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY";
        sb.append(str);
        String str2 = "ms";
        if (this.f14733a != 105) {
            sb.append(" requested=");
            sb.append(this.f14734b);
            sb.append(str2);
        }
        sb.append(" fastest=");
        sb.append(this.f14727N);
        sb.append(str2);
        if (this.f14732S > this.f14734b) {
            sb.append(" maxWait=");
            sb.append(this.f14732S);
            sb.append(str2);
        }
        if (this.f14731R > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f14731R);
            sb.append("m");
        }
        long j = this.f14729P;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append(str2);
        }
        if (this.f14730Q != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f14730Q);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f14733a);
        C4399a.m18965a(parcel, 2, this.f14734b);
        C4399a.m18965a(parcel, 3, this.f14727N);
        C4399a.m18984a(parcel, 4, this.f14728O);
        C4399a.m18965a(parcel, 5, this.f14729P);
        C4399a.m18964a(parcel, 6, this.f14730Q);
        C4399a.m18963a(parcel, 7, this.f14731R);
        C4399a.m18965a(parcel, 8, this.f14732S);
        C4399a.m18959a(parcel, a);
    }
}
