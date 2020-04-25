package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4192r1<O extends C4063d> extends C4146j0 {

    /* renamed from: f */
    private final C4083h<O> f13129f;

    public C4192r1(C4083h<O> hVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f13129f = hVar;
    }

    /* renamed from: a */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17696a(@C0193h0 T t) {
        return this.f13129f.mo17677b(t);
    }

    /* renamed from: a */
    public final void mo17700a(C4183p2 p2Var) {
    }

    /* renamed from: b */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17705b(@C0193h0 T t) {
        return this.f13129f.mo17680c(t);
    }

    /* renamed from: b */
    public final void mo17709b(C4183p2 p2Var) {
    }

    /* renamed from: e */
    public final Context mo17716e() {
        return this.f13129f.mo17686h();
    }

    /* renamed from: f */
    public final Looper mo17717f() {
        return this.f13129f.mo17688j();
    }
}
