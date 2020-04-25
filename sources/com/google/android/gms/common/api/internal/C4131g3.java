package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.api.internal.g3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4131g3 {

    /* renamed from: a */
    private final int f12943a;

    /* renamed from: b */
    private final ConnectionResult f12944b;

    C4131g3(ConnectionResult connectionResult, int i) {
        C4300a0.m18620a(connectionResult);
        this.f12944b = connectionResult;
        this.f12943a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ConnectionResult mo17836a() {
        return this.f12944b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo17837b() {
        return this.f12943a;
    }
}
