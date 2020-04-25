package com.google.android.gms.common.api.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4236k;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.C4247r;
import com.google.android.gms.common.api.C4249t;
import com.google.android.gms.common.api.C4250u;
import java.util.concurrent.TimeUnit;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.q */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4185q<R extends C4246q> extends C4236k<R> {

    /* renamed from: a */
    private final BasePendingResult<R> f13120a;

    public C4185q(C4237l<R> lVar) {
        this.f13120a = (BasePendingResult) lVar;
    }

    /* renamed from: a */
    public final R mo17739a() {
        return this.f13120a.mo17739a();
    }

    /* renamed from: b */
    public final void mo17653b() {
        this.f13120a.mo17653b();
    }

    /* renamed from: c */
    public final boolean mo17749c() {
        return this.f13120a.mo17749c();
    }

    /* renamed from: d */
    public final Integer mo17750d() {
        return this.f13120a.mo17750d();
    }

    /* renamed from: e */
    public final R mo17949e() {
        if (mo17950f()) {
            return mo17740a(0, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    /* renamed from: f */
    public final boolean mo17950f() {
        return this.f13120a.mo17751e();
    }

    /* renamed from: a */
    public final R mo17740a(long j, TimeUnit timeUnit) {
        return this.f13120a.mo17740a(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo17745a(C4247r<? super R> rVar) {
        this.f13120a.mo17745a(rVar);
    }

    /* renamed from: a */
    public final void mo17746a(C4247r<? super R> rVar, long j, TimeUnit timeUnit) {
        this.f13120a.mo17746a(rVar, j, timeUnit);
    }

    /* renamed from: a */
    public final void mo17743a(C4238a aVar) {
        this.f13120a.mo17743a(aVar);
    }

    @C0193h0
    /* renamed from: a */
    public final <S extends C4246q> C4250u<S> mo17741a(@C0193h0 C4249t<? super R, ? extends S> tVar) {
        return this.f13120a.mo17741a(tVar);
    }
}
