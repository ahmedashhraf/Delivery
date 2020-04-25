package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.stats.C4462a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C5027vb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5252f7 extends C5215c3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5460y7 f15028c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5204b3 f15029d;

    /* renamed from: e */
    private volatile Boolean f15030e;

    /* renamed from: f */
    private final C5222d f15031f;

    /* renamed from: g */
    private final C5385r8 f15032g;

    /* renamed from: h */
    private final List<Runnable> f15033h = new ArrayList();

    /* renamed from: i */
    private final C5222d f15034i;

    protected C5252f7(C5359p4 p4Var) {
        super(p4Var);
        this.f15032g = new C5385r8(p4Var.mo21208g());
        this.f15028c = new C5460y7(this);
        this.f15031f = new C5296j7(this, p4Var);
        this.f15034i = new C5373q7(this, p4Var);
    }

    /* renamed from: I */
    private final boolean m22766I() {
        mo21189B();
        return true;
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: J */
    public final void m22767J() {
        mo21209h();
        this.f15032g.mo21629a();
        this.f15031f.mo21222a(((Long) C5310l.f15210N.mo21225a(null)).longValue());
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: K */
    public final void m22768K() {
        mo21209h();
        if (mo21335A()) {
            mo21205d().mo21528C().mo21549a("Inactivity, disconnecting from the service");
            mo21341H();
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: L */
    public final void m22769L() {
        mo21209h();
        mo21205d().mo21528C().mo21550a("Processing queued up service tasks", Integer.valueOf(this.f15033h.size()));
        for (Runnable run : this.f15033h) {
            try {
                run.run();
            } catch (Exception e) {
                mo21205d().mo21533t().mo21550a("Task exception while flushing queue", e);
            }
        }
        this.f15033h.clear();
        this.f15034i.mo21224c();
    }

    @C0226w0
    /* renamed from: A */
    public final boolean mo21335A() {
        mo21209h();
        mo21180w();
        return this.f15029d != null;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: C */
    public final void mo21336C() {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5406t7(this, m22772a(true)));
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: D */
    public final void mo21337D() {
        mo21209h();
        mo21201b();
        mo21180w();
        zzm a = m22772a(false);
        if (m22766I()) {
            mo21232s().mo21396A();
        }
        m22775a((Runnable) new C5307k7(this, a));
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: E */
    public final void mo21338E() {
        mo21209h();
        mo21180w();
        zzm a = m22772a(true);
        boolean a2 = mo21214m().mo21635a(C5310l.f15189C0);
        if (a2) {
            mo21232s().mo21397C();
        }
        m22775a((Runnable) new C5362p7(this, a, a2));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    @androidx.annotation.C0226w0
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21339F() {
        /*
            r6 = this;
            r6.mo21209h()
            r6.mo21180w()
            boolean r0 = r6.mo21335A()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f15030e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x011a
            r6.mo21209h()
            r6.mo21180w()
            com.google.android.gms.measurement.internal.x3 r0 = r6.mo21213l()
            java.lang.Boolean r0 = r0.mo21815v()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x0114
        L_0x002c:
            r6.mo21189B()
            com.google.android.gms.measurement.internal.h3 r0 = r6.mo21229p()
            int r0 = r0.mo21414F()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00f1
        L_0x003d:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()
            java.lang.String r3 = "Checking service availability"
            r0.mo21549a(r3)
            com.google.android.gms.measurement.internal.f9 r0 = r6.mo21212k()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo21357a(r3)
            if (r0 == 0) goto L_0x00e2
            if (r0 == r2) goto L_0x00d2
            r3 = 2
            if (r0 == r3) goto L_0x00a6
            r3 = 3
            if (r0 == r3) goto L_0x0098
            r3 = 9
            if (r0 == r3) goto L_0x008a
            r3 = 18
            if (r0 == r3) goto L_0x007c
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.mo21550a(r4, r0)
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3 = 0
            goto L_0x00f1
        L_0x007c:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()
            java.lang.String r3 = "Service updating"
            r0.mo21549a(r3)
            goto L_0x0039
        L_0x008a:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()
            java.lang.String r3 = "Service invalid"
            r0.mo21549a(r3)
            goto L_0x0078
        L_0x0098:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()
            java.lang.String r3 = "Service disabled"
            r0.mo21549a(r3)
            goto L_0x0078
        L_0x00a6:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21527A()
            java.lang.String r3 = "Service container out of date"
            r0.mo21549a(r3)
            com.google.android.gms.measurement.internal.f9 r0 = r6.mo21212k()
            int r0 = r0.mo21391v()
            r3 = 17443(0x4423, float:2.4443E-41)
            if (r0 >= r3) goto L_0x00c0
            goto L_0x00df
        L_0x00c0:
            com.google.android.gms.measurement.internal.x3 r0 = r6.mo21213l()
            java.lang.Boolean r0 = r0.mo21815v()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0078
        L_0x00d0:
            r0 = 1
            goto L_0x0079
        L_0x00d2:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()
            java.lang.String r3 = "Service missing"
            r0.mo21549a(r3)
        L_0x00df:
            r0 = 0
            goto L_0x003a
        L_0x00e2:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()
            java.lang.String r3 = "Service available"
            r0.mo21549a(r3)
            goto L_0x0039
        L_0x00f1:
            if (r0 != 0) goto L_0x010b
            com.google.android.gms.measurement.internal.r9 r4 = r6.mo21214m()
            boolean r4 = r4.mo21662u()
            if (r4 == 0) goto L_0x010b
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo21549a(r4)
            r3 = 0
        L_0x010b:
            if (r3 == 0) goto L_0x0114
            com.google.android.gms.measurement.internal.x3 r3 = r6.mo21213l()
            r3.mo21805a(r0)
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f15030e = r0
        L_0x011a:
            java.lang.Boolean r0 = r6.f15030e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0128
            com.google.android.gms.measurement.internal.y7 r0 = r6.f15028c
            r0.mo21831b()
            return
        L_0x0128:
            com.google.android.gms.measurement.internal.r9 r0 = r6.mo21214m()
            boolean r0 = r0.mo21662u()
            if (r0 != 0) goto L_0x0186
            r6.mo21189B()
            android.content.Context r0 = r6.mo21206e()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo21206e()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x015b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015b
            r1 = 1
        L_0x015b:
            if (r1 == 0) goto L_0x0179
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo21206e()
            r6.mo21189B()
            r1.<init>(r2, r5)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.y7 r1 = r6.f15028c
            r1.mo21830a(r0)
            return
        L_0x0179:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo21549a(r1)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5252f7.mo21339F():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final Boolean mo21340G() {
        return this.f15030e;
    }

    @C0226w0
    /* renamed from: H */
    public final void mo21341H() {
        mo21209h();
        mo21180w();
        this.f15028c.mo21829a();
        try {
            C4462a.m19276a().mo18550a(mo21206e(), this.f15028c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f15029d = null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    @androidx.annotation.C0226w0
    @com.google.android.gms.common.util.C4476d0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21347a(com.google.android.gms.measurement.internal.C5204b3 r12, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r13, com.google.android.gms.measurement.internal.zzm r14) {
        /*
            r11 = this;
            r11.mo21209h()
            r11.mo21201b()
            r11.mo21180w()
            boolean r0 = r11.m22766I()
            r1 = 0
            r2 = 100
            r3 = 0
            r4 = 100
        L_0x0013:
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r5) goto L_0x00a7
            if (r4 != r2) goto L_0x00a7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.g3 r5 = r11.mo21232s()
            java.util.List r5 = r5.mo21399a(r2)
            if (r5 == 0) goto L_0x0032
            r4.addAll(r5)
            int r5 = r5.size()
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r13 == 0) goto L_0x003a
            if (r5 >= r2) goto L_0x003a
            r4.add(r13)
        L_0x003a:
            int r6 = r4.size()
            r7 = 0
        L_0x003f:
            if (r7 >= r6) goto L_0x00a2
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r8 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r8
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzak
            if (r9 == 0) goto L_0x0062
            com.google.android.gms.measurement.internal.zzak r8 = (com.google.android.gms.measurement.internal.zzak) r8     // Catch:{ RemoteException -> 0x0053 }
            r12.mo21161a(r8, r14)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x003f
        L_0x0053:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21533t()
            java.lang.String r10 = "Failed to send event to the service"
            r9.mo21550a(r10, r8)
            goto L_0x003f
        L_0x0062:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzjx
            if (r9 == 0) goto L_0x007b
            com.google.android.gms.measurement.internal.zzjx r8 = (com.google.android.gms.measurement.internal.zzjx) r8     // Catch:{ RemoteException -> 0x006c }
            r12.mo21163a(r8, r14)     // Catch:{ RemoteException -> 0x006c }
            goto L_0x003f
        L_0x006c:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21533t()
            java.lang.String r10 = "Failed to send attribute to the service"
            r9.mo21550a(r10, r8)
            goto L_0x003f
        L_0x007b:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzs
            if (r9 == 0) goto L_0x0094
            com.google.android.gms.measurement.internal.zzs r8 = (com.google.android.gms.measurement.internal.zzs) r8     // Catch:{ RemoteException -> 0x0085 }
            r12.mo21166a(r8, r14)     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x003f
        L_0x0085:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21533t()
            java.lang.String r10 = "Failed to send conditional property to the service"
            r9.mo21550a(r10, r8)
            goto L_0x003f
        L_0x0094:
            com.google.android.gms.measurement.internal.k3 r8 = r11.mo21205d()
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21533t()
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r8.mo21549a(r9)
            goto L_0x003f
        L_0x00a2:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0013
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5252f7.mo21347a(com.google.android.gms.measurement.internal.b3, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
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

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21349a(zzak zzak, String str) {
        C4300a0.m18620a(zzak);
        mo21209h();
        mo21180w();
        boolean I = m22766I();
        C5395s7 s7Var = new C5395s7(this, I, I && mo21232s().mo21400a(zzak), zzak, m22772a(true), str);
        m22775a((Runnable) s7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21351a(zzs zzs) {
        C4300a0.m18620a(zzs);
        mo21209h();
        mo21180w();
        mo21189B();
        C5428v7 v7Var = new C5428v7(this, true, mo21232s().mo21402a(zzs), new zzs(zzs), m22772a(true), zzs);
        m22775a((Runnable) v7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21353a(AtomicReference<List<zzs>> atomicReference, String str, String str2, String str3) {
        mo21209h();
        mo21180w();
        C5417u7 u7Var = new C5417u7(this, atomicReference, str, str2, str3, m22772a(false));
        m22775a((Runnable) u7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21344a(C5027vb vbVar, String str, String str2) {
        mo21209h();
        mo21180w();
        C5450x7 x7Var = new C5450x7(this, str, str2, m22772a(false), vbVar);
        m22775a((Runnable) x7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21354a(AtomicReference<List<zzjx>> atomicReference, String str, String str2, String str3, boolean z) {
        mo21209h();
        mo21180w();
        C5439w7 w7Var = new C5439w7(this, atomicReference, str, str2, str3, z, m22772a(false));
        m22775a((Runnable) w7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21345a(C5027vb vbVar, String str, String str2, boolean z) {
        mo21209h();
        mo21180w();
        C5471z7 z7Var = new C5471z7(this, str, str2, z, m22772a(false), vbVar);
        m22775a((Runnable) z7Var);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21350a(zzjx zzjx) {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5285i7(this, m22766I() && mo21232s().mo21401a(zzjx), zzjx, m22772a(true)));
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21355a(AtomicReference<List<zzjx>> atomicReference, boolean z) {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5318l7(this, atomicReference, m22772a(false), z));
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21352a(AtomicReference<String> atomicReference) {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5340n7(this, atomicReference, m22772a(false)));
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21342a(C5027vb vbVar) {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5329m7(this, m22772a(false), vbVar));
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21348a(C5208b7 b7Var) {
        mo21209h();
        mo21180w();
        m22775a((Runnable) new C5351o7(this, b7Var));
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @C4476d0
    /* renamed from: a */
    public final void mo21346a(C5204b3 b3Var) {
        mo21209h();
        C4300a0.m18620a(b3Var);
        this.f15029d = b3Var;
        m22767J();
        m22769L();
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public final void m22773a(ComponentName componentName) {
        mo21209h();
        if (this.f15029d != null) {
            this.f15029d = null;
            mo21205d().mo21528C().mo21550a("Disconnected from device MeasurementService", componentName);
            mo21209h();
            mo21339F();
        }
    }

    @C0226w0
    /* renamed from: a */
    private final void m22775a(Runnable runnable) throws IllegalStateException {
        mo21209h();
        if (mo21335A()) {
            runnable.run();
        } else if (((long) this.f15033h.size()) >= 1000) {
            mo21205d().mo21533t().mo21549a("Discarding data. Max runnable queue size reached");
        } else {
            this.f15033h.add(runnable);
            this.f15034i.mo21222a(60000);
            mo21339F();
        }
    }

    @C0226w0
    @C0195i0
    /* renamed from: a */
    private final zzm m22772a(boolean z) {
        mo21189B();
        return mo21229p().mo21416a(z ? mo21205d().mo21529D() : null);
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21343a(C5027vb vbVar, zzak zzak, String str) {
        mo21209h();
        mo21180w();
        if (mo21212k().mo21357a((int) C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            mo21205d().mo21536w().mo21549a("Not bundling data. Service unavailable or out of date");
            mo21212k().mo21375a(vbVar, new byte[0]);
            return;
        }
        m22775a((Runnable) new C5384r7(this, zzak, str, vbVar));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
