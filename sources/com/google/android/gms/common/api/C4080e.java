package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;

@C4056a
/* renamed from: com.google.android.gms.common.api.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4080e implements C4246q {

    /* renamed from: a */
    private final Status f12810a;

    /* renamed from: b */
    private final boolean f12811b;

    @C4056a
    @C4312d0
    public C4080e(Status status, boolean z) {
        this.f12810a = (Status) C4300a0.m18621a(status, (Object) "Status must not be null");
        this.f12811b = z;
    }

    @C4056a
    /* renamed from: a */
    public boolean mo17657a() {
        return this.f12811b;
    }

    @C4056a
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4080e)) {
            return false;
        }
        C4080e eVar = (C4080e) obj;
        return this.f12810a.equals(eVar.f12810a) && this.f12811b == eVar.f12811b;
    }

    @C4056a
    /* renamed from: f */
    public Status mo17504f() {
        return this.f12810a;
    }

    @C4056a
    public final int hashCode() {
        return ((this.f12810a.hashCode() + 527) * 31) + (this.f12811b ? 1 : 0);
    }
}
