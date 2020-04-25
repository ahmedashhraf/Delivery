package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C4392a(creator = "ActivityTransitionCreator")
@C4397f({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Creator<ActivityTransition> CREATOR = new C5129f0();

    /* renamed from: N */
    public static final int f14681N = 0;

    /* renamed from: O */
    public static final int f14682O = 1;
    @C4394c(getter = "getActivityType", mo18384id = 1)

    /* renamed from: a */
    private final int f14683a;
    @C4394c(getter = "getTransitionType", mo18384id = 2)

    /* renamed from: b */
    private final int f14684b;

    /* renamed from: com.google.android.gms.location.ActivityTransition$a */
    public static class C5109a {

        /* renamed from: a */
        private int f14685a = -1;

        /* renamed from: b */
        private int f14686b = -1;

        /* renamed from: a */
        public C5109a mo19983a(int i) {
            ActivityTransition.m22286a(i);
            this.f14686b = i;
            return this;
        }

        /* renamed from: a */
        public ActivityTransition mo19984a() {
            boolean z = true;
            C4300a0.m18632b(this.f14685a != -1, "Activity type not set.");
            if (this.f14686b == -1) {
                z = false;
            }
            C4300a0.m18632b(z, "Activity transition type not set.");
            return new ActivityTransition(this.f14685a, this.f14686b);
        }

        /* renamed from: b */
        public C5109a mo19985b(int i) {
            DetectedActivity.m22299e(i);
            this.f14685a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.location.ActivityTransition$b */
    public @interface C5110b {
    }

    @C4393b
    ActivityTransition(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2) {
        this.f14683a = i;
        this.f14684b = i2;
    }

    /* renamed from: a */
    public static void m22286a(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C4300a0.m18628a(z, (Object) sb.toString());
    }

    /* renamed from: N */
    public int mo19977N() {
        return this.f14683a;
    }

    /* renamed from: O */
    public int mo19978O() {
        return this.f14684b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f14683a == activityTransition.f14683a && this.f14684b == activityTransition.f14684b;
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14683a), Integer.valueOf(this.f14684b));
    }

    public String toString() {
        int i = this.f14683a;
        int i2 = this.f14684b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, mo19977N());
        C4399a.m18964a(parcel, 2, mo19978O());
        C4399a.m18959a(parcel, a);
    }
}
