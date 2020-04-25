package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.List;

@C4392a(creator = "WakeLockEventCreator")
public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C4466e();
    @C4394c(getter = "getEventType", mo18384id = 11)

    /* renamed from: N */
    private int f13672N;
    @C4394c(getter = "getWakeLockName", mo18384id = 4)

    /* renamed from: O */
    private final String f13673O;
    @C4394c(getter = "getSecondaryWakeLockName", mo18384id = 10)

    /* renamed from: P */
    private final String f13674P;
    @C4394c(getter = "getCodePackage", mo18384id = 17)

    /* renamed from: Q */
    private final String f13675Q;
    @C4394c(getter = "getWakeLockType", mo18384id = 5)

    /* renamed from: R */
    private final int f13676R;
    @C4394c(getter = "getCallingPackages", mo18384id = 6)

    /* renamed from: S */
    private final List<String> f13677S;
    @C4394c(getter = "getEventKey", mo18384id = 12)

    /* renamed from: T */
    private final String f13678T;
    @C4394c(getter = "getElapsedRealtime", mo18384id = 8)

    /* renamed from: U */
    private final long f13679U;
    @C4394c(getter = "getDeviceState", mo18384id = 14)

    /* renamed from: V */
    private int f13680V;
    @C4394c(getter = "getHostPackage", mo18384id = 13)

    /* renamed from: W */
    private final String f13681W;
    @C4394c(getter = "getBeginPowerPercentage", mo18384id = 15)

    /* renamed from: X */
    private final float f13682X;
    @C4394c(getter = "getTimeout", mo18384id = 16)

    /* renamed from: Y */
    private final long f13683Y;
    @C4394c(getter = "getAcquiredWithTimeout", mo18384id = 18)

    /* renamed from: Z */
    private final boolean f13684Z;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13685a;

    /* renamed from: a0 */
    private long f13686a0;
    @C4394c(getter = "getTimeMillis", mo18384id = 2)

    /* renamed from: b */
    private final long f13687b;

    @C4393b
    WakeLockEvent(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 11) int i2, @C4396e(mo18387id = 4) String str, @C4396e(mo18387id = 5) int i3, @C4396e(mo18387id = 6) List<String> list, @C4396e(mo18387id = 12) String str2, @C4396e(mo18387id = 8) long j2, @C4396e(mo18387id = 14) int i4, @C4396e(mo18387id = 10) String str3, @C4396e(mo18387id = 13) String str4, @C4396e(mo18387id = 15) float f, @C4396e(mo18387id = 16) long j3, @C4396e(mo18387id = 17) String str5, @C4396e(mo18387id = 18) boolean z) {
        this.f13685a = i;
        this.f13687b = j;
        this.f13672N = i2;
        this.f13673O = str;
        this.f13674P = str3;
        this.f13675Q = str5;
        this.f13676R = i3;
        this.f13686a0 = -1;
        this.f13677S = list;
        this.f13678T = str2;
        this.f13679U = j2;
        this.f13680V = i4;
        this.f13681W = str4;
        this.f13682X = f;
        this.f13683Y = j3;
        this.f13684Z = z;
    }

    /* renamed from: N */
    public final int mo18544N() {
        return this.f13672N;
    }

    /* renamed from: O */
    public final long mo18545O() {
        return this.f13687b;
    }

    /* renamed from: P */
    public final long mo18546P() {
        return this.f13686a0;
    }

    /* renamed from: Q */
    public final String mo18547Q() {
        String str;
        String str2 = this.f13673O;
        int i = this.f13676R;
        List<String> list = this.f13677S;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f13680V;
        String str4 = this.f13674P;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f13681W;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f13682X;
        String str6 = this.f13675Q;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f13684Z;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        String str7 = "\t";
        sb.append(str7);
        sb.append(str2);
        sb.append(str7);
        sb.append(i);
        sb.append(str7);
        sb.append(str);
        sb.append(str7);
        sb.append(i2);
        sb.append(str7);
        sb.append(str4);
        sb.append(str7);
        sb.append(str5);
        sb.append(str7);
        sb.append(f);
        sb.append(str7);
        sb.append(str3);
        sb.append(str7);
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13685a);
        C4399a.m18965a(parcel, 2, mo18545O());
        C4399a.m18979a(parcel, 4, this.f13673O, false);
        C4399a.m18964a(parcel, 5, this.f13676R);
        C4399a.m19016i(parcel, 6, this.f13677S, false);
        C4399a.m18965a(parcel, 8, this.f13679U);
        C4399a.m18979a(parcel, 10, this.f13674P, false);
        C4399a.m18964a(parcel, 11, mo18544N());
        C4399a.m18979a(parcel, 12, this.f13678T, false);
        C4399a.m18979a(parcel, 13, this.f13681W, false);
        C4399a.m18964a(parcel, 14, this.f13680V);
        C4399a.m18963a(parcel, 15, this.f13682X);
        C4399a.m18965a(parcel, 16, this.f13683Y);
        C4399a.m18979a(parcel, 17, this.f13675Q, false);
        C4399a.m18984a(parcel, 18, this.f13684Z);
        C4399a.m18959a(parcel, a);
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }
}
