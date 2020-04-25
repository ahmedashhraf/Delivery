package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4056a
@C4392a(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C4254y();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12778a;
    @C4394c(getter = "getScopeUri", mo18384id = 2)

    /* renamed from: b */
    private final String f12779b;

    @C4393b
    Scope(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str) {
        C4300a0.m18622a(str, (Object) "scopeUri must not be null or empty");
        this.f12778a = i;
        this.f12779b = str;
    }

    @C4056a
    /* renamed from: N */
    public final String mo17606N() {
        return this.f12779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f12779b.equals(((Scope) obj).f12779b);
    }

    public final int hashCode() {
        return this.f12779b.hashCode();
    }

    public final String toString() {
        return this.f12779b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12778a);
        C4399a.m18979a(parcel, 2, mo17606N(), false);
        C4399a.m18959a(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
