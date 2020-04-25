package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.api.internal.C4145j;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.measurement.p174b.C5179a.C5180a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5437w5 extends C5215c3 {
    @C4476d0

    /* renamed from: c */
    protected C5416u6 f15548c;

    /* renamed from: d */
    private C5426v5 f15549d;

    /* renamed from: e */
    private final Set<C5415u5> f15550e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f15551f;

    /* renamed from: g */
    private final AtomicReference<String> f15552g = new AtomicReference<>();
    @C4476d0

    /* renamed from: h */
    protected boolean f15553h = true;

    protected C5437w5(C5359p4 p4Var) {
        super(p4Var);
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: M */
    public final void m23620M() {
        if (mo21214m().mo21643e(mo21229p().mo21410A(), C5310l.f15246j0)) {
            mo21209h();
            String a = mo21213l().f15584s.mo21142a();
            if (a != null) {
                if ("unset".equals(a)) {
                    mo21767a(C14330v.f42313b, "_npa", (Object) null, mo21208g().mo18569a());
                } else {
                    mo21767a(C14330v.f42313b, "_npa", (Object) Long.valueOf(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(a) ? 1 : 0), mo21208g().mo18569a());
                }
            }
        }
        if (!this.f15309a.mo21593f() || !this.f15553h) {
            mo21205d().mo21527A().mo21549a("Updating Scion state (FE)");
            mo21230q().mo21336C();
            return;
        }
        mo21205d().mo21527A().mo21549a("Recording app launch after enabling measurement for the first time (FE)");
        mo21749I();
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: d */
    public final void m23635d(boolean z) {
        mo21209h();
        mo21201b();
        mo21180w();
        mo21205d().mo21527A().mo21550a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo21213l().mo21808b(z);
        m23620M();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        mo21205d().mo21536w().mo21549a("Interrupted waiting for app instance id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    @androidx.annotation.C0195i0
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m23636e(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.m4 r1 = r3.mo21203c()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.c6 r2 = new com.google.android.gms.measurement.internal.c6     // Catch:{ all -> 0x002d }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002d }
            r1.mo21555a(r2)     // Catch:{ all -> 0x002d }
            r0.wait(r4)     // Catch:{ InterruptedException -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r0.get()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x001d:
            com.google.android.gms.measurement.internal.k3 r4 = r3.mo21205d()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()     // Catch:{ all -> 0x002d }
            java.lang.String r5 = "Interrupted waiting for app instance id"
            r4.mo21549a(r5)     // Catch:{ all -> 0x002d }
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5437w5.m23636e(long):java.lang.String");
    }

    /* renamed from: A */
    public final void mo21742A() {
        if (mo21206e().getApplicationContext() instanceof Application) {
            ((Application) mo21206e().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f15548c);
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: C */
    public final Boolean mo21743C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo21203c().mo21553a(atomicReference, 15000, "boolean test flag value", new C5458y5(this, atomicReference));
    }

    /* renamed from: D */
    public final String mo21744D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo21203c().mo21553a(atomicReference, 15000, "String test flag value", new C5295j6(this, atomicReference));
    }

    /* renamed from: E */
    public final Long mo21745E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo21203c().mo21553a(atomicReference, 15000, "long test flag value", new C5317l6(this, atomicReference));
    }

    /* renamed from: F */
    public final Integer mo21746F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo21203c().mo21553a(atomicReference, 15000, "int test flag value", new C5350o6(this, atomicReference));
    }

    /* renamed from: G */
    public final Double mo21747G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo21203c().mo21553a(atomicReference, 15000, "double test flag value", new C5339n6(this, atomicReference));
    }

    @C0195i0
    /* renamed from: H */
    public final String mo21748H() {
        mo21201b();
        return (String) this.f15552g.get();
    }

    @C0226w0
    /* renamed from: I */
    public final void mo21749I() {
        mo21209h();
        mo21201b();
        mo21180w();
        if (this.f15309a.mo21598l()) {
            if (mo21214m().mo21643e(this.f15309a.mo21585G().mo21410A(), C5310l.f15187B0)) {
                C5386r9 m = mo21214m();
                m.mo21189B();
                Boolean b = m.mo21637b("google_analytics_deferred_deep_link_enabled");
                if (b != null && b.booleanValue()) {
                    mo21205d().mo21527A().mo21549a("Deferred Deep Link feature enabled.");
                    mo21203c().mo21555a((Runnable) new C5469z5(this));
                }
            }
            mo21230q().mo21338E();
            this.f15553h = false;
            String y = mo21213l().mo21818y();
            if (!TextUtils.isEmpty(y)) {
                mo21210i().mo21613o();
                if (!y.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", y);
                    mo21764a("auto", "_ou", bundle);
                }
            }
        }
    }

    @C0195i0
    /* renamed from: J */
    public final String mo21750J() {
        C5208b7 C = this.f15309a.mo21582D().mo21306C();
        if (C != null) {
            return C.f14910a;
        }
        return null;
    }

    @C0195i0
    /* renamed from: K */
    public final String mo21751K() {
        C5208b7 C = this.f15309a.mo21582D().mo21306C();
        if (C != null) {
            return C.f14911b;
        }
        return null;
    }

    @C0195i0
    /* renamed from: L */
    public final String mo21752L() {
        if (this.f15309a.mo21611y() != null) {
            return this.f15309a.mo21611y();
        }
        try {
            return C4145j.m17957b();
        } catch (IllegalStateException e) {
            this.f15309a.mo21205d().mo21533t().mo21550a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo21771a(boolean z) {
        mo21180w();
        mo21201b();
        mo21203c().mo21555a((Runnable) new C5372q6(this, z));
    }

    /* renamed from: b */
    public final void mo21776b(boolean z) {
        mo21180w();
        mo21201b();
        mo21203c().mo21555a((Runnable) new C5361p6(this, z));
    }

    /* renamed from: c */
    public final List<zzjx> mo21778c(boolean z) {
        mo21201b();
        mo21180w();
        mo21205d().mo21527A().mo21549a("Fetching user attributes (FE)");
        if (mo21203c().mo21558t()) {
            mo21205d().mo21533t().mo21549a("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C5342n9.m23293a()) {
            mo21205d().mo21533t().mo21549a("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.f15309a.mo21203c().mo21555a((Runnable) new C5229d6(this, atomicReference, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo21205d().mo21536w().mo21550a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjx> list = (List) atomicReference.get();
            if (list == null) {
                mo21205d().mo21536w().mo21549a("Timed out waiting for get user properties");
                list = Collections.emptyList();
            }
            return list;
        }
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

    /* renamed from: a */
    public final void mo21757a(long j) {
        mo21201b();
        mo21203c().mo21555a((Runnable) new C5394s6(this, j));
    }

    /* renamed from: b */
    public final void mo21772b(long j) {
        mo21201b();
        mo21203c().mo21555a((Runnable) new C5383r6(this, j));
    }

    /* renamed from: d */
    public final void mo21780d(long j) {
        mo21762a((String) null);
        mo21203c().mo21555a((Runnable) new C5262g6(this, j));
    }

    /* renamed from: a */
    public final void mo21765a(String str, String str2, Bundle bundle, boolean z) {
        mo21766a(str, str2, bundle, false, true, mo21208g().mo18569a());
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final void mo21775b(String str, String str2, Bundle bundle) {
        mo21201b();
        mo21209h();
        mo21763a(str, str2, mo21208g().mo18569a(), bundle);
    }

    /* renamed from: a */
    public final void mo21764a(String str, String str2, Bundle bundle) {
        mo21766a(str, str2, bundle, true, true, mo21208g().mo18569a());
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: d */
    public final void m23634d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = C5180a.f14847m;
        String str2 = "origin";
        String str3 = "app_id";
        mo21209h();
        mo21180w();
        C4300a0.m18620a(bundle);
        String str4 = "name";
        C4300a0.m18630b(bundle2.getString(str4));
        if (!this.f15309a.mo21593f()) {
            mo21205d().mo21527A().mo21549a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzjx zzjx = new zzjx(bundle2.getString(str4), 0, null, null);
        try {
            zzak a = mo21212k().mo21363a(bundle2.getString(str3), bundle2.getString(C5180a.f14845k), bundle2.getBundle(C5180a.f14846l), bundle2.getString(str2), bundle2.getLong(str), true, false);
            zzjx zzjx2 = zzjx;
            zzs zzs = new zzs(bundle2.getString(str3), bundle2.getString(str2), zzjx2, bundle2.getLong(str), bundle2.getBoolean("active"), bundle2.getString(C5180a.f14838d), null, bundle2.getLong(C5180a.f14839e), null, bundle2.getLong(C5180a.f14844j), a);
            mo21230q().mo21351a(zzs);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21763a(String str, String str2, long j, Bundle bundle) {
        mo21201b();
        mo21209h();
        m23625a(str, str2, j, bundle, true, this.f15549d == null || C5254f9.m22844g(str2), false, null);
    }

    /* renamed from: b */
    private final void m23631b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C5254f9.m22838b(bundle);
        C5326m4 c = mo21203c();
        C5207b6 b6Var = new C5207b6(this, str, str2, j, b, z, z2, z3, str3);
        c.mo21555a((Runnable) b6Var);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m23625a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            r11 = r36
            com.google.android.gms.common.internal.C4300a0.m18630b(r28)
            com.google.android.gms.common.internal.C4300a0.m18620a(r32)
            r27.mo21209h()
            r27.mo21180w()
            com.google.android.gms.measurement.internal.p4 r0 = r7.f15309a
            boolean r0 = r0.mo21593f()
            if (r0 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.k3 r0 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo21549a(r1)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.r9 r0 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r1 = r27.mo21229p()
            java.lang.String r1 = r1.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15266t0
            boolean r0 = r0.mo21643e(r1, r2)
            if (r0 == 0) goto L_0x0060
            com.google.android.gms.measurement.internal.h3 r0 = r27.mo21229p()
            java.util.List r0 = r0.mo21415G()
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.k3 r0 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo21551a(r1, r15, r8)
            return
        L_0x0060:
            boolean r0 = r7.f15551f
            r10 = 0
            r16 = 0
            r9 = 1
            if (r0 != 0) goto L_0x00bb
            r7.f15551f = r9
            com.google.android.gms.measurement.internal.p4 r0 = r7.f15309a     // Catch:{ ClassNotFoundException -> 0x00ae }
            boolean r0 = r0.mo21581C()     // Catch:{ ClassNotFoundException -> 0x00ae }
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            android.content.Context r1 = r27.mo21206e()     // Catch:{ ClassNotFoundException -> 0x00ae }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ae }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x00ae }
            goto L_0x0087
        L_0x0081:
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00ae }
        L_0x0087:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x009f }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r16] = r3     // Catch:{ Exception -> 0x009f }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x009f }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x009f }
            android.content.Context r2 = r27.mo21206e()     // Catch:{ Exception -> 0x009f }
            r1[r16] = r2     // Catch:{ Exception -> 0x009f }
            r0.invoke(r10, r1)     // Catch:{ Exception -> 0x009f }
            goto L_0x00bb
        L_0x009f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()     // Catch:{ ClassNotFoundException -> 0x00ae }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21536w()     // Catch:{ ClassNotFoundException -> 0x00ae }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo21550a(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00ae }
            goto L_0x00bb
        L_0x00ae:
            com.google.android.gms.measurement.internal.k3 r0 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21539z()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo21549a(r1)
        L_0x00bb:
            com.google.android.gms.measurement.internal.r9 r0 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r1 = r27.mo21229p()
            java.lang.String r1 = r1.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15191D0
            boolean r0 = r0.mo21643e(r1, r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00f4
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.g r0 = r27.mo21208g()
            long r5 = r0.mo18569a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.mo21767a(r2, r3, r4, r5)
        L_0x00f4:
            r0 = 40
            r1 = 2
            if (r35 == 0) goto L_0x015d
            r27.mo21189B()
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x015d
            com.google.android.gms.measurement.internal.p4 r2 = r7.f15309a
            com.google.android.gms.measurement.internal.f9 r2 = r2.mo21607u()
            java.lang.String r3 = "event"
            boolean r4 = r2.mo21378a(r3, r15)
            if (r4 != 0) goto L_0x0114
        L_0x0112:
            r2 = 2
            goto L_0x0127
        L_0x0114:
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C5371q5.f15418a
            boolean r4 = r2.mo21379a(r3, r4, r15)
            if (r4 != 0) goto L_0x011f
            r2 = 13
            goto L_0x0127
        L_0x011f:
            boolean r2 = r2.mo21377a(r3, r0, r15)
            if (r2 != 0) goto L_0x0126
            goto L_0x0112
        L_0x0126:
            r2 = 0
        L_0x0127:
            if (r2 == 0) goto L_0x015d
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21535v()
            com.google.android.gms.measurement.internal.i3 r3 = r27.mo21211j()
            java.lang.String r3 = r3.mo21429a(r15)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo21550a(r4, r3)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f15309a
            r1.mo21607u()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C5254f9.m22827a(r15, r0, r9)
            if (r15 == 0) goto L_0x0150
            int r16 = r29.length()
            r1 = r16
            goto L_0x0151
        L_0x0150:
            r1 = 0
        L_0x0151:
            com.google.android.gms.measurement.internal.p4 r3 = r7.f15309a
            com.google.android.gms.measurement.internal.f9 r3 = r3.mo21607u()
            java.lang.String r4 = "_ev"
            r3.mo21366a(r2, r4, r0, r1)
            return
        L_0x015d:
            r27.mo21189B()
            com.google.android.gms.measurement.internal.e7 r2 = r27.mo21231r()
            com.google.android.gms.measurement.internal.b7 r2 = r2.mo21305A()
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L_0x0174
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0174
            r2.f14913d = r9
        L_0x0174:
            if (r33 == 0) goto L_0x017a
            if (r35 == 0) goto L_0x017a
            r4 = 1
            goto L_0x017b
        L_0x017a:
            r4 = 0
        L_0x017b:
            com.google.android.gms.measurement.internal.C5241e7.m22693a(r2, r12, r4)
            java.lang.String r4 = "am"
            boolean r17 = r4.equals(r8)
            boolean r4 = com.google.android.gms.measurement.internal.C5254f9.m22844g(r29)
            if (r33 == 0) goto L_0x01bd
            com.google.android.gms.measurement.internal.v5 r5 = r7.f15549d
            if (r5 == 0) goto L_0x01bd
            if (r4 != 0) goto L_0x01bd
            if (r17 != 0) goto L_0x01bd
            com.google.android.gms.measurement.internal.k3 r0 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()
            com.google.android.gms.measurement.internal.i3 r1 = r27.mo21211j()
            java.lang.String r1 = r1.mo21429a(r15)
            com.google.android.gms.measurement.internal.i3 r2 = r27.mo21211j()
            java.lang.String r2 = r2.mo21426a(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo21551a(r3, r1, r2)
            com.google.android.gms.measurement.internal.v5 r1 = r7.f15549d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.mo21089a(r2, r3, r4, r5)
            return
        L_0x01bd:
            com.google.android.gms.measurement.internal.p4 r4 = r7.f15309a
            boolean r4 = r4.mo21598l()
            if (r4 != 0) goto L_0x01c6
            return
        L_0x01c6:
            com.google.android.gms.measurement.internal.f9 r4 = r27.mo21212k()
            int r4 = r4.mo21358a(r15)
            if (r4 == 0) goto L_0x020c
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21535v()
            com.google.android.gms.measurement.internal.i3 r2 = r27.mo21211j()
            java.lang.String r2 = r2.mo21429a(r15)
            java.lang.String r3 = "Invalid event name. Event will not be logged (FE)"
            r1.mo21550a(r3, r2)
            r27.mo21212k()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C5254f9.m22827a(r15, r0, r9)
            if (r15 == 0) goto L_0x01f4
            int r1 = r29.length()
            r16 = r1
        L_0x01f4:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f15309a
            com.google.android.gms.measurement.internal.f9 r1 = r1.mo21607u()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r4
            r31 = r2
            r32 = r0
            r33 = r16
            r28.mo21376a(r29, r30, r31, r32, r33)
            return
        L_0x020c:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r5 = "_o"
            r0[r16] = r5
            java.lang.String r4 = "_sn"
            r0[r9] = r4
            r0[r1] = r3
            r1 = 3
            java.lang.String r6 = "_si"
            r0[r1] = r6
            java.util.List r0 = com.google.android.gms.common.util.C4486h.m19353a((T[]) r0)
            com.google.android.gms.measurement.internal.f9 r1 = r27.mo21212k()
            r18 = 1
            r9 = r1
            r1 = r10
            r10 = r36
            r11 = r29
            r12 = r32
            r7 = r13
            r13 = r0
            r14 = r35
            r33 = r5
            r5 = r15
            r15 = r18
            android.os.Bundle r15 = r9.mo21362a(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0266
            boolean r9 = r15.containsKey(r3)
            if (r9 == 0) goto L_0x0266
            boolean r9 = r15.containsKey(r6)
            if (r9 != 0) goto L_0x024c
            goto L_0x0266
        L_0x024c:
            java.lang.String r1 = r15.getString(r4)
            java.lang.String r3 = r15.getString(r3)
            long r9 = r15.getLong(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.b7 r10 = new com.google.android.gms.measurement.internal.b7
            long r11 = r4.longValue()
            r10.<init>(r1, r3, r11)
            goto L_0x0267
        L_0x0266:
            r10 = r1
        L_0x0267:
            if (r10 != 0) goto L_0x026b
            r14 = r2
            goto L_0x026c
        L_0x026b:
            r14 = r10
        L_0x026c:
            com.google.android.gms.measurement.internal.r9 r1 = r27.mo21214m()
            r13 = r36
            boolean r1 = r1.mo21657p(r13)
            java.lang.String r12 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02a2
            r27.mo21189B()
            com.google.android.gms.measurement.internal.e7 r1 = r27.mo21231r()
            com.google.android.gms.measurement.internal.b7 r1 = r1.mo21305A()
            if (r1 == 0) goto L_0x02a2
            boolean r1 = r12.equals(r5)
            if (r1 == 0) goto L_0x02a2
            com.google.android.gms.measurement.internal.m8 r1 = r27.mo21233t()
            long r1 = r1.mo21563D()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02a2
            com.google.android.gms.measurement.internal.f9 r3 = r27.mo21212k()
            r3.mo21367a(r15, r1)
        L_0x02a2:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            com.google.android.gms.measurement.internal.f9 r1 = r27.mo21212k()
            java.security.SecureRandom r1 = r1.mo21390u()
            long r3 = r1.nextLong()
            com.google.android.gms.measurement.internal.r9 r1 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r2 = r27.mo21229p()
            java.lang.String r2 = r2.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C5310l.f15232c0
            boolean r1 = r1.mo21643e(r2, r6)
            if (r1 == 0) goto L_0x0356
            com.google.android.gms.measurement.internal.x3 r1 = r27.mo21213l()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f15587v
            long r1 = r1.mo21825a()
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0356
            com.google.android.gms.measurement.internal.x3 r1 = r27.mo21213l()
            boolean r1 = r1.mo21806a(r7)
            if (r1 == 0) goto L_0x0356
            com.google.android.gms.measurement.internal.x3 r1 = r27.mo21213l()
            com.google.android.gms.measurement.internal.z3 r1 = r1.f15590y
            boolean r1 = r1.mo21870a()
            if (r1 == 0) goto L_0x0356
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r2 = "Current session is expired, remove the session number and Id"
            r1.mo21549a(r2)
            com.google.android.gms.measurement.internal.r9 r1 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r2 = r27.mo21229p()
            java.lang.String r2 = r2.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C5310l.f15225Y
            boolean r1 = r1.mo21643e(r2, r6)
            if (r1 == 0) goto L_0x032b
            r6 = 0
            com.google.android.gms.common.util.g r1 = r27.mo21208g()
            long r19 = r1.mo18569a()
            java.lang.String r2 = "auto"
            java.lang.String r18 = "_sid"
            r1 = r27
            r21 = r3
            r3 = r18
            r4 = r6
            r23 = r33
            r5 = r19
            r1.mo21767a(r2, r3, r4, r5)
            goto L_0x032f
        L_0x032b:
            r23 = r33
            r21 = r3
        L_0x032f:
            com.google.android.gms.measurement.internal.r9 r1 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r2 = r27.mo21229p()
            java.lang.String r2 = r2.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5310l.f15226Z
            boolean r1 = r1.mo21643e(r2, r3)
            if (r1 == 0) goto L_0x035a
            r4 = 0
            com.google.android.gms.common.util.g r1 = r27.mo21208g()
            long r5 = r1.mo18569a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.mo21767a(r2, r3, r4, r5)
            goto L_0x035a
        L_0x0356:
            r23 = r33
            r21 = r3
        L_0x035a:
            com.google.android.gms.measurement.internal.r9 r1 = r27.mo21214m()
            com.google.android.gms.measurement.internal.h3 r2 = r27.mo21229p()
            java.lang.String r2 = r2.mo21410A()
            boolean r1 = r1.mo21655o(r2)
            if (r1 == 0) goto L_0x0393
            java.lang.String r1 = "extend_session"
            long r1 = r15.getLong(r1, r9)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0393
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo21549a(r2)
            r5 = r7
            r7 = r27
            com.google.android.gms.measurement.internal.p4 r1 = r7.f15309a
            com.google.android.gms.measurement.internal.m8 r1 = r1.mo21603q()
            r8 = 1
            r1.mo21564a(r5, r8)
            goto L_0x0397
        L_0x0393:
            r5 = r7
            r8 = 1
            r7 = r27
        L_0x0397:
            java.util.Set r1 = r15.keySet()
            int r2 = r32.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x03ad:
            java.lang.String r10 = "_eid"
            if (r3 >= r2) goto L_0x045e
            r9 = r1[r3]
            java.lang.Object r18 = r15.get(r9)
            r27.mo21212k()
            android.os.Bundle[] r8 = com.google.android.gms.measurement.internal.C5254f9.m22837a(r18)
            if (r8 == 0) goto L_0x0437
            r32 = r1
            int r1 = r8.length
            r15.putInt(r9, r1)
            r18 = r2
            r1 = 0
        L_0x03c9:
            int r2 = r8.length
            if (r1 >= r2) goto L_0x0427
            r2 = r8[r1]
            r5 = 1
            com.google.android.gms.measurement.internal.C5241e7.m22693a(r14, r2, r5)
            com.google.android.gms.measurement.internal.f9 r5 = r27.mo21212k()
            r6 = 0
            java.lang.String r19 = "_ep"
            r24 = r9
            r9 = r5
            r5 = r10
            r10 = r36
            r25 = r11
            r11 = r19
            r26 = r12
            r12 = r2
            r2 = r13
            r13 = r0
            r19 = r14
            r14 = r35
            r33 = r0
            r0 = r15
            r15 = r6
            android.os.Bundle r6 = r9.mo21362a(r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "_en"
            r10 = r29
            r6.putString(r9, r10)
            r11 = r21
            r6.putLong(r5, r11)
            java.lang.String r9 = "_gn"
            r13 = r24
            r6.putString(r9, r13)
            int r9 = r8.length
            java.lang.String r14 = "_ll"
            r6.putInt(r14, r9)
            java.lang.String r9 = "_i"
            r6.putInt(r9, r1)
            r9 = r25
            r9.add(r6)
            int r1 = r1 + 1
            r15 = r0
            r10 = r5
            r14 = r19
            r12 = r26
            r5 = r30
            r0 = r33
            r11 = r9
            r9 = r13
            r13 = r2
            goto L_0x03c9
        L_0x0427:
            r10 = r29
            r33 = r0
            r9 = r11
            r26 = r12
            r2 = r13
            r19 = r14
            r0 = r15
            r11 = r21
            int r1 = r8.length
            int r4 = r4 + r1
            goto L_0x0448
        L_0x0437:
            r10 = r29
            r33 = r0
            r32 = r1
            r18 = r2
            r9 = r11
            r26 = r12
            r2 = r13
            r19 = r14
            r0 = r15
            r11 = r21
        L_0x0448:
            int r3 = r3 + 1
            r5 = r30
            r1 = r32
            r15 = r0
            r13 = r2
            r21 = r11
            r2 = r18
            r14 = r19
            r12 = r26
            r8 = 1
            r0 = r33
            r11 = r9
            goto L_0x03ad
        L_0x045e:
            r5 = r10
            r9 = r11
            r26 = r12
            r2 = r13
            r0 = r15
            r11 = r21
            r10 = r29
            if (r4 == 0) goto L_0x0472
            r0.putLong(r5, r11)
            java.lang.String r1 = "_epc"
            r0.putInt(r1, r4)
        L_0x0472:
            r0 = 0
        L_0x0473:
            int r1 = r9.size()
            if (r0 >= r1) goto L_0x04fe
            java.lang.Object r1 = r9.get(r0)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r0 == 0) goto L_0x0483
            r3 = 1
            goto L_0x0484
        L_0x0483:
            r3 = 0
        L_0x0484:
            if (r3 == 0) goto L_0x048b
            java.lang.String r3 = "_ep"
            r8 = r28
            goto L_0x048e
        L_0x048b:
            r8 = r28
            r3 = r10
        L_0x048e:
            r11 = r23
            r1.putString(r11, r8)
            if (r34 == 0) goto L_0x049d
            com.google.android.gms.measurement.internal.f9 r4 = r27.mo21212k()
            android.os.Bundle r1 = r4.mo21361a(r1)
        L_0x049d:
            r12 = r1
            com.google.android.gms.measurement.internal.k3 r1 = r27.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21527A()
            com.google.android.gms.measurement.internal.i3 r4 = r27.mo21211j()
            java.lang.String r4 = r4.mo21429a(r10)
            com.google.android.gms.measurement.internal.i3 r5 = r27.mo21211j()
            java.lang.String r5 = r5.mo21426a(r12)
            java.lang.String r6 = "Logging event (FE)"
            r1.mo21551a(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzak r13 = new com.google.android.gms.measurement.internal.zzak
            com.google.android.gms.measurement.internal.zzaf r4 = new com.google.android.gms.measurement.internal.zzaf
            r4.<init>(r12)
            r1 = r13
            r14 = r2
            r2 = r3
            r3 = r4
            r4 = r28
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.f7 r1 = r27.mo21230q()
            r1.mo21349a(r13, r14)
            if (r17 != 0) goto L_0x04f7
            java.util.Set<com.google.android.gms.measurement.internal.u5> r1 = r7.f15550e
            java.util.Iterator r13 = r1.iterator()
        L_0x04dc:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x04f7
            java.lang.Object r1 = r13.next()
            com.google.android.gms.measurement.internal.u5 r1 = (com.google.android.gms.measurement.internal.C5415u5) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.onEvent(r2, r3, r4, r5)
            goto L_0x04dc
        L_0x04f7:
            int r0 = r0 + 1
            r23 = r11
            r2 = r14
            goto L_0x0473
        L_0x04fe:
            r27.mo21189B()
            com.google.android.gms.measurement.internal.e7 r0 = r27.mo21231r()
            com.google.android.gms.measurement.internal.b7 r0 = r0.mo21305A()
            if (r0 == 0) goto L_0x051b
            r0 = r26
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x051b
            com.google.android.gms.measurement.internal.m8 r0 = r27.mo21233t()
            r1 = 1
            r0.mo21565a(r1, r1)
        L_0x051b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5437w5.m23625a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo21774b(C5415u5 u5Var) {
        mo21201b();
        mo21180w();
        C4300a0.m18620a(u5Var);
        if (!this.f15550e.remove(u5Var)) {
            mo21205d().mo21536w().mo21549a("OnEventListener had not been registered");
        }
    }

    /* renamed from: b */
    public final void mo21773b(Bundle bundle) {
        C4300a0.m18620a(bundle);
        C4300a0.m18630b(bundle.getString("app_id"));
        mo21196a();
        m23629b(new Bundle(bundle), mo21208g().mo18569a());
    }

    @C0195i0
    /* renamed from: c */
    public final String mo21777c(long j) {
        if (mo21203c().mo21558t()) {
            mo21205d().mo21533t().mo21549a("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (C5342n9.m23293a()) {
            mo21205d().mo21533t().mo21549a("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            long d = mo21208g().mo18572d();
            String e = m23636e(120000);
            long d2 = mo21208g().mo18572d() - d;
            if (e == null && d2 < 120000) {
                e = m23636e(120000 - d2);
            }
            return e;
        }
    }

    /* renamed from: b */
    private final void m23629b(Bundle bundle, long j) {
        C4300a0.m18620a(bundle);
        C5382r5.m23400a(bundle, "app_id", String.class, null);
        String str = "origin";
        C5382r5.m23400a(bundle, str, String.class, null);
        String str2 = "name";
        C5382r5.m23400a(bundle, str2, String.class, null);
        String str3 = "value";
        C5382r5.m23400a(bundle, str3, Object.class, null);
        String str4 = C5180a.f14838d;
        C5382r5.m23400a(bundle, str4, String.class, null);
        Long valueOf = Long.valueOf(0);
        String str5 = C5180a.f14839e;
        C5382r5.m23400a(bundle, str5, Long.class, valueOf);
        C5382r5.m23400a(bundle, C5180a.f14840f, String.class, null);
        C5382r5.m23400a(bundle, C5180a.f14841g, Bundle.class, null);
        C5382r5.m23400a(bundle, C5180a.f14842h, String.class, null);
        C5382r5.m23400a(bundle, C5180a.f14843i, Bundle.class, null);
        String str6 = C5180a.f14844j;
        C5382r5.m23400a(bundle, str6, Long.class, valueOf);
        C5382r5.m23400a(bundle, C5180a.f14845k, String.class, null);
        C5382r5.m23400a(bundle, C5180a.f14846l, Bundle.class, null);
        C4300a0.m18630b(bundle.getString(str2));
        C4300a0.m18630b(bundle.getString(str));
        C4300a0.m18620a(bundle.get(str3));
        bundle.putLong(C5180a.f14847m, j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (mo21212k().mo21380b(string) != 0) {
            mo21205d().mo21533t().mo21550a("Invalid conditional user property name", mo21211j().mo21431c(string));
        } else if (mo21212k().mo21381b(string, obj) != 0) {
            mo21205d().mo21533t().mo21551a("Invalid conditional user property value", mo21211j().mo21431c(string), obj);
        } else {
            Object c = mo21212k().mo21383c(string, obj);
            if (c == null) {
                mo21205d().mo21533t().mo21551a("Unable to normalize conditional user property value", mo21211j().mo21431c(string), obj);
                return;
            }
            C5382r5.m23401a(bundle, c);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(str6);
                if (j3 > 15552000000L || j3 < 1) {
                    mo21205d().mo21533t().mo21551a("Invalid conditional user property time to live", mo21211j().mo21431c(string), Long.valueOf(j3));
                    return;
                }
                mo21203c().mo21555a((Runnable) new C5284i6(this, bundle));
                return;
            }
            mo21205d().mo21533t().mo21551a("Invalid conditional user property timeout", mo21211j().mo21431c(string), Long.valueOf(j2));
        }
    }

    /* renamed from: c */
    public final void mo21779c(String str, String str2, Bundle bundle) {
        mo21201b();
        m23632b((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: c */
    public final void m23633c(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "app_id";
        mo21209h();
        mo21180w();
        C4300a0.m18620a(bundle);
        String str2 = "name";
        C4300a0.m18630b(bundle2.getString(str2));
        String str3 = "origin";
        C4300a0.m18630b(bundle2.getString(str3));
        String str4 = "value";
        C4300a0.m18620a(bundle2.get(str4));
        if (!this.f15309a.mo21593f()) {
            mo21205d().mo21527A().mo21549a("Conditional property not sent since collection is disabled");
            return;
        }
        zzjx zzjx = new zzjx(bundle2.getString(str2), bundle2.getLong(C5180a.f14849o), bundle2.get(str4), bundle2.getString(str3));
        try {
            zzak a = mo21212k().mo21363a(bundle2.getString(str), bundle2.getString(C5180a.f14842h), bundle2.getBundle(C5180a.f14843i), bundle2.getString(str3), 0, true, false);
            zzs zzs = new zzs(bundle2.getString(str), bundle2.getString(str3), zzjx, bundle2.getLong(C5180a.f14847m), false, bundle2.getString(C5180a.f14838d), mo21212k().mo21363a(bundle2.getString(str), bundle2.getString(C5180a.f14840f), bundle2.getBundle(C5180a.f14841g), bundle2.getString(str3), 0, true, false), bundle2.getLong(C5180a.f14839e), a, bundle2.getLong(C5180a.f14844j), mo21212k().mo21363a(bundle2.getString(str), bundle2.getString(C5180a.f14845k), bundle2.getBundle(C5180a.f14846l), bundle2.getString(str3), 0, true, false));
            mo21230q().mo21351a(zzs);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: b */
    private final void m23632b(String str, String str2, String str3, Bundle bundle) {
        long a = mo21208g().mo18569a();
        C4300a0.m18630b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong(C5180a.f14847m, a);
        if (str3 != null) {
            bundle2.putString(C5180a.f14845k, str3);
            bundle2.putBundle(C5180a.f14846l, bundle);
        }
        mo21203c().mo21555a((Runnable) new C5273h6(this, bundle2));
    }

    @C4476d0
    /* renamed from: b */
    private final ArrayList<Bundle> m23627b(String str, String str2, String str3) {
        if (mo21203c().mo21558t()) {
            mo21205d().mo21533t().mo21549a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C5342n9.m23293a()) {
            mo21205d().mo21533t().mo21549a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C5326m4 c = this.f15309a.mo21203c();
                C5306k6 k6Var = new C5306k6(this, atomicReference, str, str2, str3);
                c.mo21555a((Runnable) k6Var);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo21205d().mo21536w().mo21551a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return C5254f9.m22839b(list);
            }
            mo21205d().mo21536w().mo21550a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    @C4476d0
    /* renamed from: b */
    private final Map<String, Object> m23628b(String str, String str2, String str3, boolean z) {
        if (mo21203c().mo21558t()) {
            mo21205d().mo21533t().mo21549a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C5342n9.m23293a()) {
            mo21205d().mo21533t().mo21549a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C5326m4 c = this.f15309a.mo21203c();
                C5328m6 m6Var = new C5328m6(this, atomicReference, str, str2, str3, z);
                c.mo21555a((Runnable) m6Var);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo21205d().mo21536w().mo21550a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjx> list = (List) atomicReference.get();
            if (list == null) {
                mo21205d().mo21536w().mo21549a("Timed out waiting for handle get user properties");
                return Collections.emptyMap();
            }
            C0635a aVar = new C0635a(list.size());
            for (zzjx zzjx : list) {
                aVar.put(zzjx.f15695b, zzjx.mo21886a());
            }
            return aVar;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: a */
    public final void mo21766a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo21201b();
        m23631b(str == null ? C14330v.f42313b : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f15549d == null || C5254f9.m22844g(str2), !z, null);
    }

    /* renamed from: a */
    public final void mo21768a(String str, String str2, Object obj, boolean z) {
        mo21769a(str, str2, obj, z, mo21208g().mo18569a());
    }

    /* renamed from: a */
    public final void mo21769a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = C14330v.f42313b;
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo21212k().mo21380b(str2);
        } else {
            C5254f9 k = mo21212k();
            String str4 = "user property";
            if (k.mo21378a(str4, str2)) {
                if (!k.mo21379a(str4, C5393s5.f15453a, str2)) {
                    i = 15;
                } else if (k.mo21377a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            mo21212k();
            String a = C5254f9.m22827a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f15309a.mo21607u().mo21366a(i, str5, a, i2);
        } else if (obj != null) {
            int b = mo21212k().mo21381b(str2, obj);
            if (b != 0) {
                mo21212k();
                String a2 = C5254f9.m22827a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f15309a.mo21607u().mo21366a(b, str5, a2, i2);
                return;
            }
            Object c = mo21212k().mo21383c(str2, obj);
            if (c != null) {
                m23626a(str3, str2, j, c);
            }
        } else {
            m23626a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m23626a(String str, String str2, long j, Object obj) {
        C5326m4 c = mo21203c();
        C5196a6 a6Var = new C5196a6(this, str, str2, obj, j);
        c.mo21555a((Runnable) a6Var);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=null, for r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Unknown variable types count: 5 */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21767a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C4300a0.m18630b(r9)
            com.google.android.gms.common.internal.C4300a0.m18630b(r10)
            r8.mo21209h()
            r8.mo21201b()
            r8.mo21180w()
            com.google.android.gms.measurement.internal.r9 r0 = r8.mo21214m()
            com.google.android.gms.measurement.internal.h3 r1 = r8.mo21229p()
            java.lang.String r1 = r1.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15246j0
            boolean r0 = r0.mo21643e(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0077
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0067
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0067
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x004c
            r4 = r2
            goto L_0x004e
        L_0x004c:
            r4 = 0
        L_0x004e:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.x3 r0 = r8.mo21213l()
            com.google.android.gms.measurement.internal.a4 r0 = r0.f15584s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            java.lang.String r11 = "true"
        L_0x0062:
            r0.mo21143a(r11)
            r6 = r10
            goto L_0x0075
        L_0x0067:
            if (r11 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.x3 r10 = r8.mo21213l()
            com.google.android.gms.measurement.internal.a4 r10 = r10.f15584s
            java.lang.String r0 = "unset"
            r10.mo21143a(r0)
            r6 = r11
        L_0x0075:
            r3 = r1
            goto L_0x0079
        L_0x0077:
            r3 = r10
            r6 = r11
        L_0x0079:
            com.google.android.gms.measurement.internal.p4 r10 = r8.f15309a
            boolean r10 = r10.mo21593f()
            if (r10 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.k3 r9 = r8.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21527A()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo21549a(r10)
            return
        L_0x008f:
            com.google.android.gms.measurement.internal.p4 r10 = r8.f15309a
            boolean r10 = r10.mo21598l()
            if (r10 != 0) goto L_0x0098
            return
        L_0x0098:
            com.google.android.gms.measurement.internal.k3 r10 = r8.mo21205d()
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo21527A()
            com.google.android.gms.measurement.internal.i3 r11 = r8.mo21211j()
            java.lang.String r11 = r11.mo21429a(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.mo21551a(r0, r11, r6)
            com.google.android.gms.measurement.internal.zzjx r10 = new com.google.android.gms.measurement.internal.zzjx
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.f7 r9 = r8.mo21230q()
            r9.mo21350a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5437w5.mo21767a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21762a(@C0195i0 String str) {
        this.f15552g.set(str);
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21761a(C5426v5 v5Var) {
        mo21209h();
        mo21201b();
        mo21180w();
        if (v5Var != null) {
            C5426v5 v5Var2 = this.f15549d;
            if (v5Var != v5Var2) {
                C4300a0.m18632b(v5Var2 == null, "EventInterceptor already set.");
            }
        }
        this.f15549d = v5Var;
    }

    /* renamed from: a */
    public final void mo21760a(C5415u5 u5Var) {
        mo21201b();
        mo21180w();
        C4300a0.m18620a(u5Var);
        if (!this.f15550e.add(u5Var)) {
            mo21205d().mo21536w().mo21549a("OnEventListener already registered");
        }
    }

    /* renamed from: a */
    public final void mo21758a(Bundle bundle) {
        mo21759a(bundle, mo21208g().mo18569a());
    }

    /* renamed from: a */
    public final void mo21759a(Bundle bundle, long j) {
        C4300a0.m18620a(bundle);
        mo21201b();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            mo21205d().mo21536w().mo21549a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        m23629b(bundle2, j);
    }

    /* renamed from: a */
    public final void mo21770a(String str, String str2, String str3, Bundle bundle) {
        C4300a0.m18630b(str);
        mo21196a();
        m23632b(str, str2, str3, bundle);
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo21753a(String str, String str2) {
        mo21201b();
        return m23627b((String) null, str, str2);
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo21754a(String str, String str2, String str3) {
        C4300a0.m18630b(str);
        mo21196a();
        return m23627b(str, str2, str3);
    }

    /* renamed from: a */
    public final Map<String, Object> mo21756a(String str, String str2, boolean z) {
        mo21201b();
        return m23628b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo21755a(String str, String str2, String str3, boolean z) {
        C4300a0.m18630b(str);
        mo21196a();
        return m23628b(str, str2, str3, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
