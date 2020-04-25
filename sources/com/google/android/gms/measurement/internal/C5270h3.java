package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5270h3 extends C5215c3 {

    /* renamed from: c */
    private String f15078c;

    /* renamed from: d */
    private String f15079d;

    /* renamed from: e */
    private int f15080e;

    /* renamed from: f */
    private String f15081f;

    /* renamed from: g */
    private String f15082g;

    /* renamed from: h */
    private long f15083h;

    /* renamed from: i */
    private long f15084i;

    /* renamed from: j */
    private long f15085j;

    /* renamed from: k */
    private List<String> f15086k;

    /* renamed from: l */
    private int f15087l;

    /* renamed from: m */
    private String f15088m;

    /* renamed from: n */
    private String f15089n;

    C5270h3(C5359p4 p4Var, long j) {
        super(p4Var);
        this.f15085j = j;
    }

    @C0226w0
    @C4476d0
    /* renamed from: H */
    private final String m22941H() {
        try {
            Class loadClass = mo21206e().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo21206e()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo21205d().mo21538y().mo21549a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo21205d().mo21537x().mo21549a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final String mo21410A() {
        mo21180w();
        return this.f15078c;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public final String mo21411C() {
        mo21180w();
        return this.f15088m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final String mo21412D() {
        mo21180w();
        return this.f15089n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final int mo21413E() {
        mo21180w();
        return this.f15080e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final int mo21414F() {
        mo21180w();
        return this.f15087l;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: G */
    public final List<String> mo21415G() {
        return this.f15086k;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0122  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzm mo21416a(java.lang.String r34) {
        /*
            r33 = this;
            r0 = r33
            r33.mo21209h()
            r33.mo21201b()
            com.google.android.gms.measurement.internal.zzm r29 = new com.google.android.gms.measurement.internal.zzm
            java.lang.String r2 = r33.mo21410A()
            java.lang.String r3 = r33.mo21411C()
            r33.mo21180w()
            java.lang.String r4 = r0.f15079d
            int r1 = r33.mo21413E()
            long r5 = (long) r1
            r33.mo21180w()
            java.lang.String r7 = r0.f15081f
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            long r8 = r1.mo21652n()
            r33.mo21180w()
            r33.mo21209h()
            long r10 = r0.f15083h
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x004f
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15309a
            com.google.android.gms.measurement.internal.f9 r1 = r1.mo21607u()
            android.content.Context r10 = r33.mo21206e()
            android.content.Context r11 = r33.mo21206e()
            java.lang.String r11 = r11.getPackageName()
            long r10 = r1.mo21359a(r10, r11)
            r0.f15083h = r10
        L_0x004f:
            long r10 = r0.f15083h
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15309a
            boolean r13 = r1.mo21593f()
            com.google.android.gms.measurement.internal.x3 r1 = r33.mo21213l()
            boolean r1 = r1.f15589x
            r12 = 1
            r14 = r1 ^ 1
            r33.mo21209h()
            r33.mo21201b()
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15309a
            boolean r1 = r1.mo21593f()
            if (r1 != 0) goto L_0x0070
        L_0x006e:
            r15 = 0
            goto L_0x0092
        L_0x0070:
            com.google.android.gms.internal.measurement.C4840kb.m20520b()
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C5310l.f15209M0
            boolean r1 = r1.mo21635a(r15)
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.k3 r1 = r33.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r15 = "Disabled IID for tests."
            r1.mo21549a(r15)
            goto L_0x006e
        L_0x008d:
            java.lang.String r1 = r33.m22941H()
            r15 = r1
        L_0x0092:
            r33.mo21180w()
            r17 = r13
            long r12 = r0.f15084i
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15309a
            long r19 = r1.mo21594h()
            int r21 = r33.mo21414F()
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            java.lang.Boolean r1 = r1.mo21659r()
            boolean r22 = r1.booleanValue()
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            r1.mo21201b()
            r23 = r12
            java.lang.String r12 = "google_analytics_ssaid_collection_enabled"
            java.lang.Boolean r1 = r1.mo21637b(r12)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r12 = 0
            goto L_0x00ca
        L_0x00c9:
            r12 = 1
        L_0x00ca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            boolean r25 = r1.booleanValue()
            com.google.android.gms.measurement.internal.x3 r1 = r33.mo21213l()
            boolean r26 = r1.mo21819z()
            java.lang.String r27 = r33.mo21412D()
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            java.lang.String r12 = r33.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C5310l.f15244i0
            boolean r1 = r1.mo21643e(r12, r13)
            if (r1 == 0) goto L_0x0107
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r1 = r1.mo21637b(r12)
            if (r1 == 0) goto L_0x0107
            boolean r1 = r1.booleanValue()
            r12 = 1
            r1 = r1 ^ r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r28 = r1
            goto L_0x0109
        L_0x0107:
            r28 = 0
        L_0x0109:
            long r12 = r0.f15085j
            com.google.android.gms.measurement.internal.r9 r1 = r33.mo21214m()
            r30 = r12
            java.lang.String r12 = r33.mo21410A()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C5310l.f15266t0
            boolean r1 = r1.mo21643e(r12, r13)
            if (r1 == 0) goto L_0x0122
            java.util.List<java.lang.String> r1 = r0.f15086k
            r32 = r1
            goto L_0x0124
        L_0x0122:
            r32 = 0
        L_0x0124:
            r1 = r29
            r12 = r34
            r13 = r17
            r16 = r23
            r18 = r19
            r20 = r21
            r21 = r22
            r22 = r25
            r23 = r26
            r24 = r27
            r25 = r28
            r26 = r30
            r28 = r32
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5270h3.mo21416a(java.lang.String):com.google.android.gms.measurement.internal.zzm");
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
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a7 A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ba A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023a  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21178u() {
        /*
            r13 = this;
            android.content.Context r0 = r13.mo21206e()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r13.mo21206e()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.k3 r7 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21533t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo21550a(r9, r8)
        L_0x002c:
            r8 = r2
            goto L_0x008e
        L_0x002e:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.k3 r7 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21533t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo21550a(r9, r8)
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = "manual_install"
            goto L_0x0052
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0052
            r5 = r3
        L_0x0052:
            android.content.Context r7 = r13.mo21206e()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r9 != 0) goto L_0x0071
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            goto L_0x0072
        L_0x0071:
            r8 = r2
        L_0x0072:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x008e
        L_0x0077:
            r7 = r2
            r2 = r8
            goto L_0x007b
        L_0x007a:
            r7 = r2
        L_0x007b:
            com.google.android.gms.measurement.internal.k3 r8 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21533t()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo21551a(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x008e:
            r13.f15078c = r0
            r13.f15081f = r5
            r13.f15079d = r2
            r13.f15080e = r6
            r13.f15082g = r8
            r5 = 0
            r13.f15083h = r5
            r13.mo21189B()
            android.content.Context r2 = r13.mo21206e()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C4145j.m17953a(r2)
            r7 = 1
            if (r2 == 0) goto L_0x00b2
            boolean r8 = r2.mo17617T()
            if (r8 == 0) goto L_0x00b2
            r8 = 1
            goto L_0x00b3
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            com.google.android.gms.measurement.internal.p4 r9 = r13.f15309a
            java.lang.String r9 = r9.mo21611y()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r10 = "am"
            if (r9 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.p4 r9 = r13.f15309a
            java.lang.String r9 = r9.mo21612z()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00cf
            r9 = 1
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            r8 = r8 | r9
            if (r8 != 0) goto L_0x00fc
            if (r2 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()
            java.lang.String r9 = "GoogleService failed to initialize (no status)"
            r2.mo21549a(r9)
            goto L_0x00fc
        L_0x00e3:
            com.google.android.gms.measurement.internal.k3 r9 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21533t()
            int r11 = r2.mo17612O()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r2 = r2.mo17613P()
            java.lang.String r12 = "GoogleService failed to initialize, status"
            r9.mo21551a(r12, r11, r2)
        L_0x00fc:
            if (r8 == 0) goto L_0x0169
            com.google.android.gms.measurement.internal.r9 r2 = r13.mo21214m()
            java.lang.Boolean r2 = r2.mo21658q()
            com.google.android.gms.measurement.internal.r9 r8 = r13.mo21214m()
            boolean r8 = r8.mo21656p()
            if (r8 == 0) goto L_0x0126
            com.google.android.gms.measurement.internal.p4 r2 = r13.f15309a
            boolean r2 = r2.mo21610x()
            if (r2 == 0) goto L_0x0169
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21539z()
            java.lang.String r8 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo21549a(r8)
            goto L_0x0169
        L_0x0126:
            if (r2 == 0) goto L_0x0144
            boolean r8 = r2.booleanValue()
            if (r8 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.p4 r2 = r13.f15309a
            boolean r2 = r2.mo21610x()
            if (r2 == 0) goto L_0x0169
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21539z()
            java.lang.String r8 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo21549a(r8)
            goto L_0x0169
        L_0x0144:
            if (r2 != 0) goto L_0x015a
            boolean r2 = com.google.android.gms.common.api.internal.C4145j.m17959d()
            if (r2 == 0) goto L_0x015a
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21539z()
            java.lang.String r8 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo21549a(r8)
            goto L_0x0169
        L_0x015a:
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21528C()
            java.lang.String r8 = "Collection enabled"
            r2.mo21549a(r8)
            r2 = 1
            goto L_0x016a
        L_0x0169:
            r2 = 0
        L_0x016a:
            r13.f15088m = r3
            r13.f15089n = r3
            r13.f15084i = r5
            r13.mo21189B()
            com.google.android.gms.measurement.internal.p4 r5 = r13.f15309a
            java.lang.String r5 = r5.mo21611y()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.p4 r5 = r13.f15309a
            java.lang.String r5 = r5.mo21612z()
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0193
            com.google.android.gms.measurement.internal.p4 r5 = r13.f15309a
            java.lang.String r5 = r5.mo21611y()
            r13.f15089n = r5
        L_0x0193:
            java.lang.String r5 = com.google.android.gms.common.api.internal.C4145j.m17957b()     // Catch:{ IllegalStateException -> 0x01cc }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x01cc }
            if (r6 == 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = r5
        L_0x019f:
            r13.f15088m = r3     // Catch:{ IllegalStateException -> 0x01cc }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x01cc }
            if (r3 != 0) goto L_0x01b8
            com.google.android.gms.common.internal.h0 r3 = new com.google.android.gms.common.internal.h0     // Catch:{ IllegalStateException -> 0x01cc }
            android.content.Context r5 = r13.mo21206e()     // Catch:{ IllegalStateException -> 0x01cc }
            r3.<init>(r5)     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r5 = "admob_app_id"
            java.lang.String r3 = r3.mo18323a(r5)     // Catch:{ IllegalStateException -> 0x01cc }
            r13.f15089n = r3     // Catch:{ IllegalStateException -> 0x01cc }
        L_0x01b8:
            if (r2 == 0) goto L_0x01de
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()     // Catch:{ IllegalStateException -> 0x01cc }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21528C()     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r3 = "App package, google app id"
            java.lang.String r5 = r13.f15078c     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r6 = r13.f15088m     // Catch:{ IllegalStateException -> 0x01cc }
            r2.mo21551a(r3, r5, r6)     // Catch:{ IllegalStateException -> 0x01cc }
            goto L_0x01de
        L_0x01cc:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k3 r3 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r0)
            java.lang.String r5 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r3.mo21551a(r5, r0, r2)
        L_0x01de:
            r0 = 0
            r13.f15086k = r0
            com.google.android.gms.measurement.internal.r9 r0 = r13.mo21214m()
            java.lang.String r2 = r13.f15078c
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5310l.f15266t0
            boolean r0 = r0.mo21643e(r2, r3)
            if (r0 == 0) goto L_0x0234
            r13.mo21189B()
            com.google.android.gms.measurement.internal.r9 r0 = r13.mo21214m()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo21639c(r2)
            if (r0 == 0) goto L_0x0230
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0213
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21536w()
            java.lang.String r3 = "Safelisted event list cannot be empty. Ignoring"
            r2.mo21549a(r3)
        L_0x0211:
            r7 = 0
            goto L_0x0230
        L_0x0213:
            java.util.Iterator r2 = r0.iterator()
        L_0x0217:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0230
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.f9 r5 = r13.mo21212k()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r5.mo21382b(r6, r3)
            if (r3 != 0) goto L_0x0217
            goto L_0x0211
        L_0x0230:
            if (r7 == 0) goto L_0x0234
            r13.f15086k = r0
        L_0x0234:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x024a
            if (r1 == 0) goto L_0x0247
            android.content.Context r0 = r13.mo21206e()
            boolean r0 = com.google.android.gms.common.p172q.C4437a.m19100a(r0)
            r13.f15087l = r0
            return
        L_0x0247:
            r13.f15087l = r4
            return
        L_0x024a:
            r13.f15087l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5270h3.mo21178u():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo21183z() {
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
