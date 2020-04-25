package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5241e7 extends C5215c3 {
    @C4476d0

    /* renamed from: c */
    protected C5208b7 f15005c;

    /* renamed from: d */
    private volatile C5208b7 f15006d;

    /* renamed from: e */
    private C5208b7 f15007e;

    /* renamed from: f */
    private final Map<Activity, C5208b7> f15008f = new C0635a();

    /* renamed from: g */
    private C5208b7 f15009g;

    /* renamed from: h */
    private String f15010h;

    public C5241e7(C5359p4 p4Var) {
        super(p4Var);
    }

    @C0187e0
    /* renamed from: d */
    private final C5208b7 m22696d(@C0193h0 Activity activity) {
        C4300a0.m18620a(activity);
        C5208b7 b7Var = (C5208b7) this.f15008f.get(activity);
        if (b7Var != null) {
            return b7Var;
        }
        C5208b7 b7Var2 = new C5208b7(null, m22691a(activity.getClass().getCanonicalName()), mo21212k().mo21389t());
        this.f15008f.put(activity, b7Var2);
        return b7Var2;
    }

    @C0226w0
    /* renamed from: A */
    public final C5208b7 mo21305A() {
        mo21180w();
        mo21209h();
        return this.f15005c;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: C */
    public final C5208b7 mo21306C() {
        mo21201b();
        return this.f15006d;
    }

    /* renamed from: a */
    public final void mo21309a(@C0193h0 Activity activity, @C0210o0(max = 36, min = 1) @C0195i0 String str, @C0210o0(max = 36, min = 1) @C0195i0 String str2) {
        if (this.f15006d == null) {
            mo21205d().mo21538y().mo21549a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f15008f.get(activity) == null) {
            mo21205d().mo21538y().mo21549a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m22691a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f15006d.f14911b.equals(str2);
            boolean d = C5254f9.m22842d(this.f15006d.f14910a, str);
            if (equals && d) {
                mo21205d().mo21538y().mo21549a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo21205d().mo21538y().mo21550a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo21205d().mo21528C().mo21551a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C5208b7 b7Var = new C5208b7(str, str2, mo21212k().mo21389t());
                this.f15008f.put(activity, b7Var);
                m22692a(activity, b7Var, true);
            } else {
                mo21205d().mo21538y().mo21550a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    @C0187e0
    /* renamed from: b */
    public final void mo21311b(Activity activity) {
        C5208b7 d = m22696d(activity);
        this.f15007e = this.f15006d;
        this.f15006d = null;
        mo21203c().mo21555a((Runnable) new C5274h7(this, d));
    }

    @C0187e0
    /* renamed from: c */
    public final void mo21313c(Activity activity) {
        this.f15008f.remove(activity);
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

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    @C0187e0
    /* renamed from: b */
    public final void mo21312b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            C5208b7 b7Var = (C5208b7) this.f15008f.get(activity);
            if (b7Var != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", b7Var.f14912c);
                bundle2.putString("name", b7Var.f14910a);
                bundle2.putString("referrer_name", b7Var.f14911b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    @C0187e0
    /* renamed from: a */
    private final void m22692a(Activity activity, C5208b7 b7Var, boolean z) {
        C5208b7 b7Var2 = this.f15006d == null ? this.f15007e : this.f15006d;
        if (b7Var.f14911b == null) {
            b7Var = new C5208b7(b7Var.f14910a, m22691a(activity.getClass().getCanonicalName()), b7Var.f14912c);
        }
        this.f15007e = this.f15006d;
        this.f15006d = b7Var;
        mo21203c().mo21555a((Runnable) new C5230d7(this, z, b7Var2, b7Var));
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public final void m22694a(@C0193h0 C5208b7 b7Var, boolean z) {
        mo21227n().mo21866a(mo21208g().mo18572d());
        if (mo21233t().mo21565a(b7Var.f14913d, z)) {
            b7Var.f14913d = false;
        }
    }

    /* renamed from: a */
    public static void m22693a(C5208b7 b7Var, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || b7Var == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && b7Var == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        String str4 = b7Var.f14910a;
        if (str4 != null) {
            bundle.putString(str2, str4);
        } else {
            bundle.remove(str2);
        }
        bundle.putString(str3, b7Var.f14911b);
        bundle.putLong(str, b7Var.f14912c);
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21310a(String str, C5208b7 b7Var) {
        mo21209h();
        synchronized (this) {
            if (this.f15010h == null || this.f15010h.equals(str) || b7Var != null) {
                this.f15010h = str;
                this.f15009g = b7Var;
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    private static String m22691a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    @C0187e0
    /* renamed from: a */
    public final void mo21308a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f15008f.put(activity, new C5208b7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    @C0187e0
    /* renamed from: a */
    public final void mo21307a(Activity activity) {
        m22692a(activity, m22696d(activity), false);
        C5463z n = mo21227n();
        n.mo21203c().mo21555a((Runnable) new C5191a1(n, n.mo21208g().mo18572d()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
