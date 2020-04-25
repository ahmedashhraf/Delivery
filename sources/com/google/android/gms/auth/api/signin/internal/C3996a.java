package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C3996a {
    @C4476d0

    /* renamed from: b */
    private static int f12682b = 31;

    /* renamed from: a */
    private int f12683a = 1;

    @C4056a
    /* renamed from: a */
    public C3996a mo17517a(Object obj) {
        this.f12683a = (f12682b * this.f12683a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C3996a mo17518a(boolean z) {
        this.f12683a = (f12682b * this.f12683a) + (z ? 1 : 0);
        return this;
    }

    @C4056a
    /* renamed from: a */
    public int mo17516a() {
        return this.f12683a;
    }
}
