package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.api.internal.j3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4149j3 implements C4088b, C4089c {

    /* renamed from: N */
    private C4161l3 f13025N;

    /* renamed from: a */
    public final C4059a<?> f13026a;

    /* renamed from: b */
    private final boolean f13027b;

    public C4149j3(C4059a<?> aVar, boolean z) {
        this.f13026a = aVar;
        this.f13027b = z;
    }

    /* renamed from: a */
    public final void mo17767a(@C0193h0 ConnectionResult connectionResult) {
        m17990a();
        this.f13025N.mo17860a(connectionResult, this.f13026a, this.f13027b);
    }

    /* renamed from: i */
    public final void mo17777i(@C0195i0 Bundle bundle) {
        m17990a();
        this.f13025N.mo17777i(bundle);
    }

    /* renamed from: n */
    public final void mo17778n(int i) {
        m17990a();
        this.f13025N.mo17778n(i);
    }

    /* renamed from: a */
    public final void mo17909a(C4161l3 l3Var) {
        this.f13025N = l3Var;
    }

    /* renamed from: a */
    private final void m17990a() {
        C4300a0.m18621a(this.f13025N, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
