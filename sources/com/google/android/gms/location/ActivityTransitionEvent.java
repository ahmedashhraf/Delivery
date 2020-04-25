package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "ActivityTransitionEventCreator")
@C4397f({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionEvent> CREATOR = new C5131g0();
    @C4394c(getter = "getElapsedRealTimeNanos", mo18384id = 3)

    /* renamed from: N */
    private final long f14687N;
    @C4394c(getter = "getActivityType", mo18384id = 1)

    /* renamed from: a */
    private final int f14688a;
    @C4394c(getter = "getTransitionType", mo18384id = 2)

    /* renamed from: b */
    private final int f14689b;

    @C4393b
    public ActivityTransitionEvent(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) long j) {
        DetectedActivity.m22299e(i);
        ActivityTransition.m22286a(i2);
        this.f14688a = i;
        this.f14689b = i2;
        this.f14687N = j;
    }

    /* renamed from: N */
    public int mo19986N() {
        return this.f14688a;
    }

    /* renamed from: O */
    public long mo19987O() {
        return this.f14687N;
    }

    /* renamed from: P */
    public int mo19988P() {
        return this.f14689b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f14688a == activityTransitionEvent.f14688a && this.f14689b == activityTransitionEvent.f14689b && this.f14687N == activityTransitionEvent.f14687N;
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14688a), Integer.valueOf(this.f14689b), Long.valueOf(this.f14687N));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f14688a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        String str = C3868i.f12248b;
        sb.append(str);
        int i2 = this.f14689b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(str);
        long j = this.f14687N;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, mo19986N());
        C4399a.m18964a(parcel, 2, mo19988P());
        C4399a.m18965a(parcel, 3, mo19987O());
        C4399a.m18959a(parcel, a);
    }
}
