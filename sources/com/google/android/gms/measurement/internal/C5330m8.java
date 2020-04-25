package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C4764f8;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5330m8 extends C5215c3 {

    /* renamed from: c */
    private Handler f15319c;
    @C4476d0

    /* renamed from: d */
    private long f15320d = mo21208g().mo18572d();
    @C4476d0

    /* renamed from: e */
    private long f15321e = this.f15320d;

    /* renamed from: f */
    private final C5222d f15322f = new C5319l8(this, this.f15309a);

    /* renamed from: g */
    private final C5222d f15323g = new C5352o8(this, this.f15309a);

    /* renamed from: h */
    private final Runnable f15324h = new C5341n8(this);

    C5330m8(C5359p4 p4Var) {
        super(p4Var);
    }

    @C0226w0
    /* renamed from: E */
    private final void m23254E() {
        mo21209h();
        if (this.f15319c == null) {
            this.f15319c = new C4764f8(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: F */
    public final void m23255F() {
        mo21209h();
        mo21565a(false, false);
        mo21227n().mo21866a(mo21208g().mo18572d());
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public final void m23256a(long j) {
        mo21209h();
        m23254E();
        if (mo21214m().mo21635a(C5310l.f15205K0)) {
            this.f15319c.removeCallbacks(this.f15324h);
        }
        if (mo21214m().mo21643e(mo21229p().mo21410A(), C5310l.f15232c0)) {
            mo21213l().f15590y.mo21869a(false);
        }
        mo21205d().mo21528C().mo21550a("Activity resumed, time", Long.valueOf(j));
        this.f15320d = j;
        this.f15321e = this.f15320d;
        if (this.f15309a.mo21593f()) {
            if (mo21214m().mo21653n(mo21229p().mo21410A())) {
                mo21564a(mo21208g().mo18569a(), false);
                return;
            }
            this.f15322f.mo21224c();
            this.f15323g.mo21224c();
            if (mo21213l().mo21806a(mo21208g().mo18569a())) {
                mo21213l().f15583r.mo21869a(true);
                mo21213l().f15588w.mo21826a(0);
            }
            if (mo21213l().f15583r.mo21870a()) {
                this.f15322f.mo21222a(Math.max(0, mo21213l().f15581p.mo21825a() - mo21213l().f15588w.mo21825a()));
            } else {
                this.f15323g.mo21222a(Math.max(0, 3600000 - mo21213l().f15588w.mo21825a()));
            }
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: b */
    public final void m23259b(long j) {
        mo21209h();
        m23254E();
        if (mo21214m().mo21643e(mo21229p().mo21410A(), C5310l.f15232c0)) {
            mo21213l().f15590y.mo21869a(true);
        }
        this.f15322f.mo21224c();
        this.f15323g.mo21224c();
        mo21205d().mo21528C().mo21550a("Activity paused, time", Long.valueOf(j));
        if (this.f15320d != 0) {
            mo21213l().f15588w.mo21826a(mo21213l().f15588w.mo21825a() + (j - this.f15320d));
        }
        if (mo21214m().mo21635a(C5310l.f15205K0)) {
            this.f15319c.postDelayed(this.f15324h, 2000);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: A */
    public final void mo21561A() {
        mo21209h();
        this.f15322f.mo21224c();
        this.f15323g.mo21224c();
        this.f15320d = 0;
        this.f15321e = this.f15320d;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @C4476d0
    /* renamed from: C */
    public final void mo21562C() {
        mo21209h();
        m23260b(mo21208g().mo18569a(), false);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    @C4476d0
    /* renamed from: D */
    public final long mo21563D() {
        long d = mo21208g().mo18572d();
        long j = d - this.f15321e;
        this.f15321e = d;
        return j;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5463z mo21227n() {
        return super.mo21227n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5437w5 mo21228o() {
        return super.mo21228o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5270h3 mo21229p() {
        return super.mo21229p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C5252f7 mo21230q() {
        return super.mo21230q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C5241e7 mo21231r() {
        return super.mo21231r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C5259g3 mo21232s() {
        return super.mo21232s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C5330m8 mo21233t() {
        return super.mo21233t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo21183z() {
        return false;
    }

    @C0226w0
    /* renamed from: b */
    private final void m23260b(long j, boolean z) {
        mo21209h();
        mo21205d().mo21528C().mo21550a("Session started, time", Long.valueOf(mo21208g().mo18572d()));
        Long valueOf = mo21214m().mo21650l(mo21229p().mo21410A()) ? Long.valueOf(j / 1000) : null;
        mo21228o().mo21767a("auto", "_sid", (Object) valueOf, j);
        mo21213l().f15583r.mo21869a(false);
        Bundle bundle = new Bundle();
        if (mo21214m().mo21650l(mo21229p().mo21410A())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        if (mo21214m().mo21635a(C5310l.f15207L0) && z) {
            bundle.putLong("_aib", 1);
        }
        mo21228o().mo21763a("auto", "_s", j, bundle);
        mo21213l().f15587v.mo21826a(j);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21564a(long j, boolean z) {
        mo21209h();
        m23254E();
        this.f15322f.mo21224c();
        this.f15323g.mo21224c();
        if (mo21213l().mo21806a(j)) {
            mo21213l().f15583r.mo21869a(true);
            mo21213l().f15588w.mo21826a(0);
        }
        if (z && mo21214m().mo21655o(mo21229p().mo21410A())) {
            mo21213l().f15587v.mo21826a(j);
        }
        if (mo21213l().f15583r.mo21870a()) {
            m23260b(j, z);
        } else {
            this.f15323g.mo21222a(Math.max(0, 3600000 - mo21213l().f15588w.mo21825a()));
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    @C0226w0
    /* renamed from: a */
    public final boolean mo21565a(boolean z, boolean z2) {
        mo21209h();
        mo21180w();
        long d = mo21208g().mo18572d();
        mo21213l().f15587v.mo21826a(mo21208g().mo18569a());
        long j = d - this.f15320d;
        if (z || j >= 1000) {
            mo21213l().f15588w.mo21826a(j);
            mo21205d().mo21528C().mo21550a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C5241e7.m22693a(mo21231r().mo21305A(), bundle, true);
            if (mo21214m().mo21657p(mo21229p().mo21410A())) {
                if (mo21214m().mo21643e(mo21229p().mo21410A(), C5310l.f15242h0)) {
                    if (!z2) {
                        mo21563D();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo21563D();
                }
            }
            if (!mo21214m().mo21643e(mo21229p().mo21410A(), C5310l.f15242h0) || !z2) {
                mo21228o().mo21764a("auto", "_e", bundle);
            }
            this.f15320d = d;
            this.f15323g.mo21224c();
            this.f15323g.mo21222a(Math.max(0, 3600000 - mo21213l().f15588w.mo21825a()));
            return true;
        }
        mo21205d().mo21528C().mo21550a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
