package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.common.util.C4505x;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5386r9 extends C5327m5 {

    /* renamed from: b */
    private Boolean f15439b;
    @C0193h0

    /* renamed from: c */
    private C5408t9 f15440c = C5375q9.f15424a;

    /* renamed from: d */
    private Boolean f15441d;

    C5386r9(C5359p4 p4Var) {
        super(p4Var);
        C5310l.m23129a(p4Var);
    }

    @C0195i0
    @C4476d0
    /* renamed from: v */
    private final Bundle m23406v() {
        try {
            if (mo21206e().getPackageManager() == null) {
                mo21205d().mo21533t().mo21549a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C4439c.m19110a(mo21206e()).mo18446a(mo21206e().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo21205d().mo21533t().mo21549a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (NameNotFoundException e) {
            mo21205d().mo21533t().mo21550a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: w */
    static String m23407w() {
        return (String) C5310l.f15241h.mo21225a(null);
    }

    /* renamed from: x */
    public static long m23408x() {
        return ((Long) C5310l.f15204K.mo21225a(null)).longValue();
    }

    /* renamed from: y */
    public static long m23409y() {
        return ((Long) C5310l.f15247k.mo21225a(null)).longValue();
    }

    /* renamed from: z */
    public static boolean m23410z() {
        return ((Boolean) C5310l.f15239g.mo21225a(null)).booleanValue();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21634a(@C0193h0 C5408t9 t9Var) {
        this.f15440c = t9Var;
    }

    @C0226w0
    /* renamed from: b */
    public final int mo21636b(String str, @C0193h0 C5226d3<Integer> d3Var) {
        if (str == null) {
            return ((Integer) d3Var.mo21225a(null)).intValue();
        }
        String a = this.f15440c.mo21505a(str, d3Var.mo21226a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) d3Var.mo21225a(null)).intValue();
        }
        try {
            return ((Integer) d3Var.mo21225a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d3Var.mo21225a(null)).intValue();
        }
    }

    @C0226w0
    /* renamed from: c */
    public final double mo21638c(String str, @C0193h0 C5226d3<Double> d3Var) {
        if (str == null) {
            return ((Double) d3Var.mo21225a(null)).doubleValue();
        }
        String a = this.f15440c.mo21505a(str, d3Var.mo21226a());
        if (TextUtils.isEmpty(a)) {
            return ((Double) d3Var.mo21225a(null)).doubleValue();
        }
        try {
            return ((Double) d3Var.mo21225a(Double.valueOf(Double.parseDouble(a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d3Var.mo21225a(null)).doubleValue();
        }
    }

    @C0226w0
    /* renamed from: d */
    public final boolean mo21641d(String str, @C0193h0 C5226d3<Boolean> d3Var) {
        if (str == null) {
            return ((Boolean) d3Var.mo21225a(null)).booleanValue();
        }
        String a = this.f15440c.mo21505a(str, d3Var.mo21226a());
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) d3Var.mo21225a(null)).booleanValue();
        }
        return ((Boolean) d3Var.mo21225a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo21643e(String str, C5226d3<Boolean> d3Var) {
        return mo21641d(str, d3Var);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: f */
    public final boolean mo21644f(String str) {
        return mo21641d(str, C5310l.f15221U);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: g */
    public final boolean mo21645g(String str) {
        return mo21641d(str, C5310l.f15212O);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: h */
    public final String mo21646h(String str) {
        C5226d3<String> d3Var = C5310l.f15214P;
        if (str == null) {
            return (String) d3Var.mo21225a(null);
        }
        return (String) d3Var.mo21225a(this.f15440c.mo21505a(str, d3Var.mo21226a()));
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: i */
    public final boolean mo21647i(String str) {
        return mo21641d(str, C5310l.f15222V);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: j */
    public final boolean mo21648j(String str) {
        return mo21641d(str, C5310l.f15224X);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: k */
    public final boolean mo21649k(String str) {
        return mo21641d(str, C5310l.f15223W);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: l */
    public final boolean mo21650l(String str) {
        return mo21641d(str, C5310l.f15225Y);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: m */
    public final boolean mo21651m(String str) {
        return mo21641d(str, C5310l.f15226Z);
    }

    /* renamed from: n */
    public final long mo21652n() {
        mo21189B();
        return 18102;
    }

    /* renamed from: o */
    public final boolean mo21654o() {
        if (this.f15441d == null) {
            synchronized (this) {
                if (this.f15441d == null) {
                    ApplicationInfo applicationInfo = mo21206e().getApplicationInfo();
                    String a = C4505x.m19424a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f15441d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f15441d == null) {
                        this.f15441d = Boolean.TRUE;
                        mo21205d().mo21533t().mo21549a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15441d.booleanValue();
    }

    /* renamed from: p */
    public final boolean mo21656p() {
        mo21189B();
        Boolean b = mo21637b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: q */
    public final Boolean mo21658q() {
        mo21189B();
        return mo21637b("firebase_analytics_collection_enabled");
    }

    /* renamed from: r */
    public final Boolean mo21659r() {
        mo21201b();
        Boolean b = mo21637b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b == null || b.booleanValue());
    }

    /* renamed from: s */
    public final String mo21660s() {
        return m23405a("debug.firebase.analytics.app", "");
    }

    /* renamed from: t */
    public final String mo21661t() {
        return m23405a("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: u */
    public final boolean mo21662u() {
        if (this.f15439b == null) {
            this.f15439b = mo21637b("app_measurement_lite");
            if (this.f15439b == null) {
                this.f15439b = Boolean.valueOf(false);
            }
        }
        if (this.f15439b.booleanValue() || !this.f15309a.mo21581C()) {
            return true;
        }
        return false;
    }

    @C0226w0
    /* renamed from: a */
    public final int mo21632a(@C0210o0(min = 1) String str) {
        return mo21636b(str, C5310l.f15269v);
    }

    /* renamed from: e */
    public final boolean mo21642e(String str) {
        return "1".equals(this.f15440c.mo21505a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
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

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: n */
    public final boolean mo21653n(String str) {
        return mo21641d(str, C5310l.f15228a0);
    }

    @C0226w0
    /* renamed from: a */
    public final long mo21633a(String str, @C0193h0 C5226d3<Long> d3Var) {
        if (str == null) {
            return ((Long) d3Var.mo21225a(null)).longValue();
        }
        String a = this.f15440c.mo21505a(str, d3Var.mo21226a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) d3Var.mo21225a(null)).longValue();
        }
        try {
            return ((Long) d3Var.mo21225a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d3Var.mo21225a(null)).longValue();
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: p */
    public final boolean mo21657p(String str) {
        return mo21641d(str, C5310l.f15240g0);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: d */
    public final boolean mo21640d(String str) {
        return "1".equals(this.f15440c.mo21505a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    @C4476d0
    /* renamed from: b */
    public final Boolean mo21637b(@C0210o0(min = 1) String str) {
        C4300a0.m18630b(str);
        Bundle v = m23406v();
        if (v == null) {
            mo21205d().mo21533t().mo21549a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!v.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(v.getBoolean(str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    @androidx.annotation.C0195i0
    @com.google.android.gms.common.util.C4476d0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo21639c(@androidx.annotation.C0210o0(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C4300a0.m18630b(r4)
            android.os.Bundle r0 = r3.m23406v()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.k3 r4 = r3.mo21205d()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo21549a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.mo21206e()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.k3 r0 = r3.mo21205d()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo21550a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5386r9.mo21639c(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo21635a(C5226d3<Boolean> d3Var) {
        return mo21641d(null, d3Var);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: o */
    public final boolean mo21655o(String str) {
        return mo21641d(str, C5310l.f15230b0);
    }

    /* renamed from: a */
    private final String m23405a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            mo21205d().mo21533t().mo21550a("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            mo21205d().mo21533t().mo21550a("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            mo21205d().mo21533t().mo21550a("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            mo21205d().mo21533t().mo21550a("SystemProperties.get() threw an exception", e4);
            return str2;
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

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
