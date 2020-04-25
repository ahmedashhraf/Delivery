package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.location.C5127f;
import java.util.Locale;

@C4392a(creator = "ParcelableGeofenceCreator")
@C4397f({1000})
@C4476d0
public final class zzbh extends AbstractSafeParcelable implements C5127f {
    public static final Creator<zzbh> CREATOR = new C4637g0();
    @C4394c(getter = "getType", mo18384id = 3)

    /* renamed from: N */
    private final short f13940N;
    @C4394c(getter = "getLatitude", mo18384id = 4)

    /* renamed from: O */
    private final double f13941O;
    @C4394c(getter = "getLongitude", mo18384id = 5)

    /* renamed from: P */
    private final double f13942P;
    @C4394c(getter = "getRadius", mo18384id = 6)

    /* renamed from: Q */
    private final float f13943Q;
    @C4394c(getter = "getTransitionTypes", mo18384id = 7)

    /* renamed from: R */
    private final int f13944R;
    @C4394c(defaultValue = "0", getter = "getNotificationResponsiveness", mo18384id = 8)

    /* renamed from: S */
    private final int f13945S;
    @C4394c(defaultValue = "-1", getter = "getLoiteringDelay", mo18384id = 9)

    /* renamed from: T */
    private final int f13946T;
    @C4394c(getter = "getRequestId", mo18384id = 1)

    /* renamed from: a */
    private final String f13947a;
    @C4394c(getter = "getExpirationTime", mo18384id = 2)

    /* renamed from: b */
    private final long f13948b;

    @C4393b
    public zzbh(@C4396e(mo18387id = 1) String str, @C4396e(mo18387id = 7) int i, @C4396e(mo18387id = 3) short s, @C4396e(mo18387id = 4) double d, @C4396e(mo18387id = 5) double d2, @C4396e(mo18387id = 6) float f, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 8) int i2, @C4396e(mo18387id = 9) int i3) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f13940N = s;
                this.f13947a = str;
                this.f13941O = d;
                this.f13942P = d2;
                this.f13943Q = f;
                this.f13948b = j;
                this.f13944R = i4;
                this.f13945S = i2;
                this.f13946T = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public static zzbh m19894a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzbh zzbh = (zzbh) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzbh;
    }

    /* renamed from: M */
    public final String mo18810M() {
        return this.f13947a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f13943Q == zzbh.f13943Q && this.f13941O == zzbh.f13941O && this.f13942P == zzbh.f13942P && this.f13940N == zzbh.f13940N;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f13941O);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f13942P);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f13943Q)) * 31) + this.f13940N) * 31) + this.f13944R;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f13940N != 1 ? null : "CIRCLE";
        objArr[1] = this.f13947a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f13944R);
        objArr[3] = Double.valueOf(this.f13941O);
        objArr[4] = Double.valueOf(this.f13942P);
        objArr[5] = Float.valueOf(this.f13943Q);
        objArr[6] = Integer.valueOf(this.f13945S / 1000);
        objArr[7] = Integer.valueOf(this.f13946T);
        objArr[8] = Long.valueOf(this.f13948b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, mo18810M(), false);
        C4399a.m18965a(parcel, 2, this.f13948b);
        C4399a.m18983a(parcel, 3, this.f13940N);
        C4399a.m18962a(parcel, 4, this.f13941O);
        C4399a.m18962a(parcel, 5, this.f13942P);
        C4399a.m18963a(parcel, 6, this.f13943Q);
        C4399a.m18964a(parcel, 7, this.f13944R);
        C4399a.m18964a(parcel, 8, this.f13945S);
        C4399a.m18964a(parcel, 9, this.f13946T);
        C4399a.m18959a(parcel, a);
    }
}
