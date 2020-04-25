package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "UserAttributeParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class zzjx extends AbstractSafeParcelable {
    public static final Creator<zzjx> CREATOR = new C5243e9();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    public final long f15688N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    public final Long f15689O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    private final Float f15690P;
    @C4394c(mo18384id = 6)

    /* renamed from: Q */
    public final String f15691Q;
    @C4394c(mo18384id = 7)

    /* renamed from: R */
    public final String f15692R;
    @C4394c(mo18384id = 8)

    /* renamed from: S */
    public final Double f15693S;
    @C4394c(mo18384id = 1)

    /* renamed from: a */
    private final int f15694a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    public final String f15695b;

    zzjx(C5265g9 g9Var) {
        this(g9Var.f15072c, g9Var.f15073d, g9Var.f15074e, g9Var.f15071b);
    }

    /* renamed from: a */
    public final Object mo21886a() {
        Long l = this.f15689O;
        if (l != null) {
            return l;
        }
        Double d = this.f15693S;
        if (d != null) {
            return d;
        }
        String str = this.f15691Q;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f15694a);
        C4399a.m18979a(parcel, 2, this.f15695b, false);
        C4399a.m18965a(parcel, 3, this.f15688N);
        C4399a.m18978a(parcel, 4, this.f15689O, false);
        C4399a.m18976a(parcel, 5, (Float) null, false);
        C4399a.m18979a(parcel, 6, this.f15691Q, false);
        C4399a.m18979a(parcel, 7, this.f15692R, false);
        C4399a.m18975a(parcel, 8, this.f15693S, false);
        C4399a.m18959a(parcel, a);
    }

    zzjx(String str, long j, Object obj, String str2) {
        C4300a0.m18630b(str);
        this.f15694a = 2;
        this.f15695b = str;
        this.f15688N = j;
        this.f15692R = str2;
        if (obj == null) {
            this.f15689O = null;
            this.f15690P = null;
            this.f15693S = null;
            this.f15691Q = null;
        } else if (obj instanceof Long) {
            this.f15689O = (Long) obj;
            this.f15690P = null;
            this.f15693S = null;
            this.f15691Q = null;
        } else if (obj instanceof String) {
            this.f15689O = null;
            this.f15690P = null;
            this.f15693S = null;
            this.f15691Q = (String) obj;
        } else if (obj instanceof Double) {
            this.f15689O = null;
            this.f15690P = null;
            this.f15693S = (Double) obj;
            this.f15691Q = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzjx(String str, long j, String str2) {
        C4300a0.m18630b(str);
        this.f15694a = 2;
        this.f15695b = str;
        this.f15688N = 0;
        this.f15689O = null;
        this.f15690P = null;
        this.f15693S = null;
        this.f15691Q = null;
        this.f15692R = null;
    }

    @C4393b
    zzjx(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) long j, @C4396e(mo18387id = 4) Long l, @C4396e(mo18387id = 5) Float f, @C4396e(mo18387id = 6) String str2, @C4396e(mo18387id = 7) String str3, @C4396e(mo18387id = 8) Double d) {
        this.f15694a = i;
        this.f15695b = str;
        this.f15688N = j;
        this.f15689O = l;
        Double d2 = null;
        this.f15690P = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.f15693S = d2;
        } else {
            this.f15693S = d;
        }
        this.f15691Q = str2;
        this.f15692R = str3;
    }
}
