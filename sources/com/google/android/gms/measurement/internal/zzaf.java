package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Iterator;

@C4392a(creator = "EventParamsCreator")
@C4397f({1})
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class zzaf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzaf> CREATOR = new C5266h();
    /* access modifiers changed from: private */
    @C4394c(getter = "z", mo18384id = 2)

    /* renamed from: a */
    public final Bundle f15683a;

    @C4393b
    zzaf(@C4396e(mo18387id = 2) Bundle bundle) {
        this.f15683a = bundle;
    }

    /* renamed from: a */
    public final int mo21875a() {
        return this.f15683a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo21876c(String str) {
        return this.f15683a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Long mo21877d(String str) {
        return Long.valueOf(this.f15683a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Double mo21878e(String str) {
        return Double.valueOf(this.f15683a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo21879f(String str) {
        return this.f15683a.getString(str);
    }

    /* renamed from: i */
    public final Bundle mo21880i() {
        return new Bundle(this.f15683a);
    }

    public final Iterator<String> iterator() {
        return new C5277i(this);
    }

    public final String toString() {
        return this.f15683a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18966a(parcel, 2, mo21880i(), false);
        C4399a.m18959a(parcel, a);
    }
}
