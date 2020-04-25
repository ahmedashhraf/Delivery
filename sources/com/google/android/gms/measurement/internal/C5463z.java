package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4484g;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5463z extends C5227d4 {

    /* renamed from: b */
    private final Map<String, Long> f15661b = new C0635a();

    /* renamed from: c */
    private final Map<String, Integer> f15662c = new C0635a();

    /* renamed from: d */
    private long f15663d;

    public C5463z(C5359p4 p4Var) {
        super(p4Var);
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: c */
    public final void m23841c(String str, long j) {
        mo21201b();
        mo21209h();
        C4300a0.m18630b(str);
        if (this.f15662c.isEmpty()) {
            this.f15663d = j;
        }
        Integer num = (Integer) this.f15662c.get(str);
        if (num != null) {
            this.f15662c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f15662c.size() >= 100) {
            mo21205d().mo21536w().mo21549a("Too many ads visible");
        } else {
            this.f15662c.put(str, Integer.valueOf(1));
            this.f15661b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: d */
    public final void m23842d(String str, long j) {
        mo21201b();
        mo21209h();
        C4300a0.m18630b(str);
        Integer num = (Integer) this.f15662c.get(str);
        if (num != null) {
            C5208b7 A = mo21231r().mo21305A();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f15662c.remove(str);
                Long l = (Long) this.f15661b.get(str);
                if (l == null) {
                    mo21205d().mo21533t().mo21549a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f15661b.remove(str);
                    m23838a(str, longValue, A);
                }
                if (this.f15662c.isEmpty()) {
                    long j2 = this.f15663d;
                    if (j2 == 0) {
                        mo21205d().mo21533t().mo21549a("First ad exposure time was never set");
                        return;
                    } else {
                        m23835a(j - j2, A);
                        this.f15663d = 0;
                    }
                }
                return;
            }
            this.f15662c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo21205d().mo21533t().mo21550a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: a */
    public final void mo21867a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo21205d().mo21533t().mo21549a("Ad unit id must be a non-empty string");
        } else {
            mo21203c().mo21555a((Runnable) new C5189a(this, str, j));
        }
    }

    /* renamed from: b */
    public final void mo21868b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo21205d().mo21533t().mo21549a("Ad unit id must be a non-empty string");
        } else {
            mo21203c().mo21555a((Runnable) new C5203b2(this, str, j));
        }
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

    @C0226w0
    /* renamed from: a */
    private final void m23835a(long j, C5208b7 b7Var) {
        if (b7Var == null) {
            mo21205d().mo21528C().mo21549a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo21205d().mo21528C().mo21550a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C5241e7.m22693a(b7Var, bundle, true);
            mo21228o().mo21764a("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: b */
    public final void m23839b(long j) {
        for (String put : this.f15661b.keySet()) {
            this.f15661b.put(put, Long.valueOf(j));
        }
        if (!this.f15661b.isEmpty()) {
            this.f15663d = j;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    @C0226w0
    /* renamed from: a */
    private final void m23838a(String str, long j, C5208b7 b7Var) {
        if (b7Var == null) {
            mo21205d().mo21528C().mo21549a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo21205d().mo21528C().mo21550a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C5241e7.m22693a(b7Var, bundle, true);
            mo21228o().mo21764a("am", "_xu", bundle);
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21866a(long j) {
        C5208b7 A = mo21231r().mo21305A();
        for (String str : this.f15661b.keySet()) {
            m23838a(str, j - ((Long) this.f15661b.get(str)).longValue(), A);
        }
        if (!this.f15661b.isEmpty()) {
            m23835a(j - this.f15663d, A);
        }
        m23839b(j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
