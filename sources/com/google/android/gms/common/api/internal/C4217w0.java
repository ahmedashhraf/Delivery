package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4217w0 implements C4124f1 {

    /* renamed from: a */
    private final C4142i1 f13170a;

    public C4217w0(C4142i1 i1Var) {
        this.f13170a = i1Var;
    }

    /* renamed from: a */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17821a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo17822a(ConnectionResult connectionResult, C4059a<?> aVar, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo17823a() {
        return true;
    }

    /* renamed from: b */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17824b(T t) {
        this.f13170a.f13004Y.f13204l.add(t);
        return t;
    }

    /* renamed from: c */
    public final void mo17826c() {
        for (C4071f a : this.f13170a.f12996Q.values()) {
            a.mo17633a();
        }
        this.f13170a.f13004Y.f13212t = Collections.emptySet();
    }

    /* renamed from: i */
    public final void mo17827i(Bundle bundle) {
    }

    /* renamed from: n */
    public final void mo17828n(int i) {
    }

    /* renamed from: b */
    public final void mo17825b() {
        this.f13170a.mo17899g();
    }
}
