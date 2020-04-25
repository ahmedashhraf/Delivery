package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0190g;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.C5533d;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2682c;
import p076c.p112d.p113a.p114a.p128h.C2683d;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4148j2 extends C5533d implements C4088b, C4089c {

    /* renamed from: T */
    private static C4060a<? extends C2683d, C2679a> f13017T = C2682c.f9773c;

    /* renamed from: N */
    private final Handler f13018N;

    /* renamed from: O */
    private final C4060a<? extends C2683d, C2679a> f13019O;

    /* renamed from: P */
    private Set<Scope> f13020P;

    /* renamed from: Q */
    private C4329f f13021Q;

    /* renamed from: R */
    private C2683d f13022R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C4155k2 f13023S;

    /* renamed from: b */
    private final Context f13024b;

    @C0226w0
    public C4148j2(Context context, Handler handler, @C0193h0 C4329f fVar) {
        this(context, handler, fVar, f13017T);
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: b */
    public final void m17982b(zak zak) {
        ConnectionResult N = zak.mo21968N();
        if (N.mo17580R()) {
            ResolveAccountResponse O = zak.mo21969O();
            ConnectionResult O2 = O.mo18206O();
            if (!O2.mo17580R()) {
                String valueOf = String.valueOf(O2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                sb.toString();
                new Exception();
                this.f13023S.mo17879b(O2);
                this.f13022R.mo17633a();
                return;
            }
            this.f13023S.mo17878a(O.mo18205N(), this.f13020P);
        } else {
            this.f13023S.mo17879b(N);
        }
        this.f13022R.mo17633a();
    }

    /* renamed from: G0 */
    public final C2683d mo17905G0() {
        return this.f13022R;
    }

    /* renamed from: H0 */
    public final void mo17906H0() {
        C2683d dVar = this.f13022R;
        if (dVar != null) {
            dVar.mo17633a();
        }
    }

    @C0226w0
    /* renamed from: a */
    public final void mo17907a(C4155k2 k2Var) {
        C2683d dVar = this.f13022R;
        if (dVar != null) {
            dVar.mo17633a();
        }
        this.f13021Q.mo18294a(Integer.valueOf(System.identityHashCode(this)));
        C4060a<? extends C2683d, C2679a> aVar = this.f13019O;
        Context context = this.f13024b;
        Looper looper = this.f13018N.getLooper();
        C4329f fVar = this.f13021Q;
        this.f13022R = (C2683d) aVar.mo10343a(context, looper, fVar, fVar.mo18304k(), (C4088b) this, (C4089c) this);
        this.f13023S = k2Var;
        Set<Scope> set = this.f13020P;
        if (set == null || set.isEmpty()) {
            this.f13018N.post(new C4143i2(this));
        } else {
            this.f13022R.mo10346b();
        }
    }

    @C0226w0
    /* renamed from: i */
    public final void mo17777i(@C0195i0 Bundle bundle) {
        this.f13022R.mo10345a(this);
    }

    @C0226w0
    /* renamed from: n */
    public final void mo17778n(int i) {
        this.f13022R.mo17633a();
    }

    @C0226w0
    public C4148j2(Context context, Handler handler, @C0193h0 C4329f fVar, C4060a<? extends C2683d, C2679a> aVar) {
        this.f13024b = context;
        this.f13018N = handler;
        this.f13021Q = (C4329f) C4300a0.m18621a(fVar, (Object) "ClientSettings must not be null");
        this.f13020P = fVar.mo18303j();
        this.f13019O = aVar;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo17767a(@C0193h0 ConnectionResult connectionResult) {
        this.f13023S.mo17879b(connectionResult);
    }

    @C0190g
    /* renamed from: a */
    public final void mo17908a(zak zak) {
        this.f13018N.post(new C4160l2(this, zak));
    }
}
