package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.api.internal.C4145j;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.common.util.C4492k;
import com.google.android.gms.internal.measurement.C4896o1;
import com.google.android.gms.internal.measurement.zzv;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public class C5359p4 implements C5349o5 {

    /* renamed from: G */
    private static volatile C5359p4 f15370G;

    /* renamed from: A */
    private volatile Boolean f15371A;
    @C4476d0

    /* renamed from: B */
    private Boolean f15372B;
    @C4476d0

    /* renamed from: C */
    private Boolean f15373C;

    /* renamed from: D */
    private int f15374D;

    /* renamed from: E */
    private AtomicInteger f15375E = new AtomicInteger(0);

    /* renamed from: F */
    private final long f15376F;

    /* renamed from: a */
    private final Context f15377a;

    /* renamed from: b */
    private final String f15378b;

    /* renamed from: c */
    private final String f15379c;

    /* renamed from: d */
    private final String f15380d;

    /* renamed from: e */
    private final boolean f15381e;

    /* renamed from: f */
    private final C5342n9 f15382f;

    /* renamed from: g */
    private final C5386r9 f15383g;

    /* renamed from: h */
    private final C5446x3 f15384h;

    /* renamed from: i */
    private final C5303k3 f15385i;

    /* renamed from: j */
    private final C5326m4 f15386j;

    /* renamed from: k */
    private final C5330m8 f15387k;

    /* renamed from: l */
    private final C5254f9 f15388l;

    /* renamed from: m */
    private final C5281i3 f15389m;

    /* renamed from: n */
    private final C4484g f15390n;

    /* renamed from: o */
    private final C5241e7 f15391o;

    /* renamed from: p */
    private final C5437w5 f15392p;

    /* renamed from: q */
    private final C5463z f15393q;

    /* renamed from: r */
    private final C5427v6 f15394r;

    /* renamed from: s */
    private C5259g3 f15395s;

    /* renamed from: t */
    private C5252f7 f15396t;

    /* renamed from: u */
    private C5244f f15397u;

    /* renamed from: v */
    private C5270h3 f15398v;

    /* renamed from: w */
    private C5238e4 f15399w;

    /* renamed from: x */
    private boolean f15400x = false;

    /* renamed from: y */
    private Boolean f15401y;

    /* renamed from: z */
    private long f15402z;

    private C5359p4(C5448x5 x5Var) {
        boolean z = false;
        C4300a0.m18620a(x5Var);
        this.f15382f = new C5342n9(x5Var.f15594a);
        C5310l.m23128a(this.f15382f);
        this.f15377a = x5Var.f15594a;
        this.f15378b = x5Var.f15595b;
        this.f15379c = x5Var.f15596c;
        this.f15380d = x5Var.f15597d;
        this.f15381e = x5Var.f15601h;
        this.f15371A = x5Var.f15598e;
        zzv zzv = x5Var.f15600g;
        if (zzv != null) {
            Bundle bundle = zzv.f14577R;
            if (bundle != null) {
                Object obj = bundle.get("measurementEnabled");
                if (obj instanceof Boolean) {
                    this.f15372B = (Boolean) obj;
                }
                Object obj2 = zzv.f14577R.get("measurementDeactivated");
                if (obj2 instanceof Boolean) {
                    this.f15373C = (Boolean) obj2;
                }
            }
        }
        C4896o1.m20856a(this.f15377a);
        this.f15390n = C4492k.m19370e();
        this.f15376F = this.f15390n.mo18569a();
        this.f15383g = new C5386r9(this);
        C5446x3 x3Var = new C5446x3(this);
        x3Var.mo21614p();
        this.f15384h = x3Var;
        C5303k3 k3Var = new C5303k3(this);
        k3Var.mo21614p();
        this.f15385i = k3Var;
        C5254f9 f9Var = new C5254f9(this);
        f9Var.mo21614p();
        this.f15388l = f9Var;
        C5281i3 i3Var = new C5281i3(this);
        i3Var.mo21614p();
        this.f15389m = i3Var;
        this.f15393q = new C5463z(this);
        C5241e7 e7Var = new C5241e7(this);
        e7Var.mo21181x();
        this.f15391o = e7Var;
        C5437w5 w5Var = new C5437w5(this);
        w5Var.mo21181x();
        this.f15392p = w5Var;
        C5330m8 m8Var = new C5330m8(this);
        m8Var.mo21181x();
        this.f15387k = m8Var;
        C5427v6 v6Var = new C5427v6(this);
        v6Var.mo21614p();
        this.f15394r = v6Var;
        C5326m4 m4Var = new C5326m4(this);
        m4Var.mo21614p();
        this.f15386j = m4Var;
        zzv zzv2 = x5Var.f15600g;
        if (!(zzv2 == null || zzv2.f14579b == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f15377a.getApplicationContext() instanceof Application) {
            C5437w5 t = mo21606t();
            if (t.mo21206e().getApplicationContext() instanceof Application) {
                Application application = (Application) t.mo21206e().getApplicationContext();
                if (t.f15548c == null) {
                    t.f15548c = new C5416u6(t, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(t.f15548c);
                    application.registerActivityLifecycleCallbacks(t.f15548c);
                    t.mo21205d().mo21528C().mo21549a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo21205d().mo21536w().mo21549a("Application context is not an Application");
        }
        this.f15386j.mo21555a((Runnable) new C5381r4(this, x5Var));
    }

    /* renamed from: I */
    private final C5427v6 m23332I() {
        m23340b((C5360p5) this.f15394r);
        return this.f15394r;
    }

    /* renamed from: J */
    private final void m23333J() {
        if (!this.f15400x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public final void m23338a(C5448x5 x5Var) {
        String str;
        C5325m3 m3Var;
        mo21203c().mo21209h();
        C5386r9.m23407w();
        C5244f fVar = new C5244f(this);
        fVar.mo21614p();
        this.f15397u = fVar;
        C5270h3 h3Var = new C5270h3(this, x5Var.f15599f);
        h3Var.mo21181x();
        this.f15398v = h3Var;
        C5259g3 g3Var = new C5259g3(this);
        g3Var.mo21181x();
        this.f15395s = g3Var;
        C5252f7 f7Var = new C5252f7(this);
        f7Var.mo21181x();
        this.f15396t = f7Var;
        this.f15388l.mo21615q();
        this.f15384h.mo21615q();
        this.f15399w = new C5238e4(this);
        this.f15398v.mo21182y();
        mo21205d().mo21539z().mo21550a("App measurement is starting up, version", Long.valueOf(this.f15383g.mo21652n()));
        mo21205d().mo21539z().mo21549a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String A = h3Var.mo21410A();
        if (TextUtils.isEmpty(this.f15378b)) {
            if (mo21607u().mo21386d(A)) {
                m3Var = mo21205d().mo21539z();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                m3Var = mo21205d().mo21539z();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(A);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            m3Var.mo21549a(str);
        }
        mo21205d().mo21527A().mo21549a("Debug-level message logging enabled");
        if (this.f15374D != this.f15375E.get()) {
            mo21205d().mo21533t().mo21551a("Not all components initialized", Integer.valueOf(this.f15374D), Integer.valueOf(this.f15375E.get()));
        }
        this.f15400x = true;
    }

    /* renamed from: b */
    private static void m23340b(C5360p5 p5Var) {
        if (p5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!p5Var.mo21616s()) {
            String valueOf = String.valueOf(p5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final String mo21580A() {
        return this.f15380d;
    }

    /* renamed from: B */
    public final C5342n9 mo21189B() {
        return this.f15382f;
    }

    /* renamed from: C */
    public final boolean mo21581C() {
        return this.f15381e;
    }

    /* renamed from: D */
    public final C5241e7 mo21582D() {
        m23339b((C5215c3) this.f15391o);
        return this.f15391o;
    }

    /* renamed from: E */
    public final C5252f7 mo21583E() {
        m23339b((C5215c3) this.f15396t);
        return this.f15396t;
    }

    /* renamed from: F */
    public final C5244f mo21584F() {
        m23340b((C5360p5) this.f15397u);
        return this.f15397u;
    }

    /* renamed from: G */
    public final C5270h3 mo21585G() {
        m23339b((C5215c3) this.f15398v);
        return this.f15398v;
    }

    /* renamed from: H */
    public final C5463z mo21586H() {
        C5463z zVar = this.f15393q;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: c */
    public final C5326m4 mo21203c() {
        m23340b((C5360p5) this.f15386j);
        return this.f15386j;
    }

    /* renamed from: d */
    public final C5303k3 mo21205d() {
        m23340b((C5360p5) this.f15385i);
        return this.f15385i;
    }

    /* renamed from: e */
    public final Context mo21206e() {
        return this.f15377a;
    }

    @C0226w0
    /* renamed from: f */
    public final boolean mo21593f() {
        boolean z;
        mo21203c().mo21209h();
        m23333J();
        if (this.f15383g.mo21635a(C5310l.f15248k0)) {
            if (this.f15383g.mo21656p()) {
                return false;
            }
            Boolean bool = this.f15373C;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean x = mo21601o().mo21817x();
            if (x != null) {
                return x.booleanValue();
            }
            Boolean q = this.f15383g.mo21658q();
            if (q != null) {
                return q.booleanValue();
            }
            Boolean bool2 = this.f15372B;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (C4145j.m17959d()) {
                return false;
            }
            if (!this.f15383g.mo21635a(C5310l.f15238f0) || this.f15371A == null) {
                return true;
            }
            return this.f15371A.booleanValue();
        } else if (this.f15383g.mo21656p()) {
            return false;
        } else {
            Boolean q2 = this.f15383g.mo21658q();
            if (q2 != null) {
                z = q2.booleanValue();
            } else {
                z = !C4145j.m17959d();
                if (z && this.f15371A != null && ((Boolean) C5310l.f15238f0.mo21225a(null)).booleanValue()) {
                    z = this.f15371A.booleanValue();
                }
            }
            return mo21601o().mo21810c(z);
        }
    }

    /* renamed from: g */
    public final C4484g mo21208g() {
        return this.f15390n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final long mo21594h() {
        Long valueOf = Long.valueOf(mo21601o().f15575j.mo21825a());
        if (valueOf.longValue() == 0) {
            return this.f15376F;
        }
        return Math.min(this.f15376F, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo21595i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo21596j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo21597k() {
        this.f15375E.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: l */
    public final boolean mo21598l() {
        m23333J();
        mo21203c().mo21209h();
        Boolean bool = this.f15401y;
        if (bool == null || this.f15402z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f15390n.mo18572d() - this.f15402z) > 1000)) {
            this.f15402z = this.f15390n.mo18572d();
            boolean z = true;
            this.f15401y = Boolean.valueOf(mo21607u().mo21384c("android.permission.INTERNET") && mo21607u().mo21384c("android.permission.ACCESS_NETWORK_STATE") && (C4439c.m19110a(this.f15377a).mo18448a() || this.f15383g.mo21662u() || (C5249f4.m22764a(this.f15377a) && C5254f9.m22829a(this.f15377a, false))));
            if (this.f15401y.booleanValue()) {
                if (!mo21607u().mo21385c(mo21585G().mo21411C(), mo21585G().mo21412D()) && TextUtils.isEmpty(mo21585G().mo21412D())) {
                    z = false;
                }
                this.f15401y = Boolean.valueOf(z);
            }
        }
        return this.f15401y.booleanValue();
    }

    @C0226w0
    /* renamed from: m */
    public final void mo21599m() {
        mo21203c().mo21209h();
        m23340b((C5360p5) m23332I());
        String A = mo21585G().mo21410A();
        Pair a = mo21601o().mo21804a(A);
        if (!this.f15383g.mo21659r().booleanValue() || ((Boolean) a.second).booleanValue() || TextUtils.isEmpty((CharSequence) a.first)) {
            mo21205d().mo21527A().mo21549a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m23332I().mo21736t()) {
            mo21205d().mo21536w().mo21549a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C5254f9 u = mo21607u();
            URL a2 = u.mo21365a(mo21585G().mo21214m().mo21652n(), A, (String) a.first, mo21601o().f15567A.mo21825a() - 1);
            C5427v6 I = m23332I();
            C5392s4 s4Var = new C5392s4(this);
            I.mo21209h();
            I.mo21613o();
            C4300a0.m18620a(a2);
            C4300a0.m18620a(s4Var);
            C5326m4 c = I.mo21203c();
            C5449x6 x6Var = new C5449x6(I, A, a2, null, null, s4Var);
            c.mo21557b((Runnable) x6Var);
        }
    }

    /* renamed from: n */
    public final C5386r9 mo21600n() {
        return this.f15383g;
    }

    /* renamed from: o */
    public final C5446x3 mo21601o() {
        m23336a((C5327m5) this.f15384h);
        return this.f15384h;
    }

    /* renamed from: p */
    public final C5303k3 mo21602p() {
        C5303k3 k3Var = this.f15385i;
        if (k3Var == null || !k3Var.mo21616s()) {
            return null;
        }
        return this.f15385i;
    }

    /* renamed from: q */
    public final C5330m8 mo21603q() {
        m23339b((C5215c3) this.f15387k);
        return this.f15387k;
    }

    /* renamed from: r */
    public final C5238e4 mo21604r() {
        return this.f15399w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final C5326m4 mo21605s() {
        return this.f15386j;
    }

    /* renamed from: t */
    public final C5437w5 mo21606t() {
        m23339b((C5215c3) this.f15392p);
        return this.f15392p;
    }

    /* renamed from: u */
    public final C5254f9 mo21607u() {
        m23336a((C5327m5) this.f15388l);
        return this.f15388l;
    }

    /* renamed from: v */
    public final C5281i3 mo21608v() {
        m23336a((C5327m5) this.f15389m);
        return this.f15389m;
    }

    /* renamed from: w */
    public final C5259g3 mo21609w() {
        m23339b((C5215c3) this.f15395s);
        return this.f15395s;
    }

    /* renamed from: x */
    public final boolean mo21610x() {
        return TextUtils.isEmpty(this.f15378b);
    }

    /* renamed from: y */
    public final String mo21611y() {
        return this.f15378b;
    }

    /* renamed from: z */
    public final String mo21612z() {
        return this.f15379c;
    }

    /* renamed from: b */
    private static void m23339b(C5215c3 c3Var) {
        if (c3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c3Var.mo21179v()) {
            String valueOf = String.valueOf(c3Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    @C0226w0
    /* renamed from: b */
    public final boolean mo21592b() {
        return this.f15371A != null && this.f15371A.booleanValue();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21587a() {
        mo21203c().mo21209h();
        if (mo21601o().f15570e.mo21825a() == 0) {
            mo21601o().f15570e.mo21826a(this.f15390n.mo18569a());
        }
        if (Long.valueOf(mo21601o().f15575j.mo21825a()).longValue() == 0) {
            mo21205d().mo21528C().mo21550a("Persisting first open", Long.valueOf(this.f15376F));
            mo21601o().f15575j.mo21826a(this.f15376F);
        }
        if (mo21598l()) {
            if (!TextUtils.isEmpty(mo21585G().mo21411C()) || !TextUtils.isEmpty(mo21585G().mo21412D())) {
                mo21607u();
                if (C5254f9.m22834a(mo21585G().mo21411C(), mo21601o().mo21813t(), mo21585G().mo21412D(), mo21601o().mo21814u())) {
                    mo21205d().mo21539z().mo21549a("Rechecking which service to use due to a GMP App Id change");
                    mo21601o().mo21816w();
                    mo21609w().mo21396A();
                    this.f15396t.mo21341H();
                    this.f15396t.mo21339F();
                    mo21601o().f15575j.mo21826a(this.f15376F);
                    mo21601o().f15577l.mo21143a(null);
                }
                mo21601o().mo21809c(mo21585G().mo21411C());
                mo21601o().mo21811d(mo21585G().mo21412D());
            }
            mo21606t().mo21762a(mo21601o().f15577l.mo21142a());
            if (!TextUtils.isEmpty(mo21585G().mo21411C()) || !TextUtils.isEmpty(mo21585G().mo21412D())) {
                boolean f = mo21593f();
                if (!mo21601o().mo21803A() && !this.f15383g.mo21656p()) {
                    mo21601o().mo21812d(!f);
                }
                if (f) {
                    mo21606t().mo21749I();
                }
                mo21583E().mo21352a(new AtomicReference<>());
            }
        } else if (mo21593f()) {
            if (!mo21607u().mo21384c("android.permission.INTERNET")) {
                mo21205d().mo21533t().mo21549a("App is missing INTERNET permission");
            }
            if (!mo21607u().mo21384c("android.permission.ACCESS_NETWORK_STATE")) {
                mo21205d().mo21533t().mo21549a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C4439c.m19110a(this.f15377a).mo18448a() && !this.f15383g.mo21662u()) {
                if (!C5249f4.m22764a(this.f15377a)) {
                    mo21205d().mo21533t().mo21549a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C5254f9.m22829a(this.f15377a, false)) {
                    mo21205d().mo21533t().mo21549a("AppMeasurementService not registered/enabled");
                }
            }
            mo21205d().mo21533t().mo21549a("Uploading is not possible. App measurement disabled");
        }
        mo21601o().f15585t.mo21869a(this.f15383g.mo21635a(C5310l.f15260q0));
        mo21601o().f15586u.mo21869a(this.f15383g.mo21635a(C5310l.f15262r0));
    }

    @C4476d0
    /* renamed from: a */
    public static C5359p4 m23335a(Context context, String str, String str2, Bundle bundle) {
        zzv zzv = new zzv(0, 0, true, null, null, null, bundle);
        return m23334a(context, zzv);
    }

    /* renamed from: a */
    public static C5359p4 m23334a(Context context, zzv zzv) {
        if (zzv != null && (zzv.f14575P == null || zzv.f14576Q == null)) {
            zzv zzv2 = new zzv(zzv.f14578a, zzv.f14579b, zzv.f14573N, zzv.f14574O, null, null, zzv.f14577R);
            zzv = zzv2;
        }
        C4300a0.m18620a(context);
        C4300a0.m18620a(context.getApplicationContext());
        if (f15370G == null) {
            synchronized (C5359p4.class) {
                if (f15370G == null) {
                    f15370G = new C5359p4(new C5448x5(context, zzv));
                }
            }
        } else if (zzv != null) {
            Bundle bundle = zzv.f14577R;
            if (bundle != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
                f15370G.mo21591a(zzv.f14577R.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        return f15370G;
    }

    /* renamed from: a */
    private static void m23336a(C5327m5 m5Var) {
        if (m5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21591a(boolean z) {
        this.f15371A = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21589a(C5360p5 p5Var) {
        this.f15374D++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21588a(C5215c3 c3Var) {
        this.f15374D++;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[Catch:{ JSONException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ JSONException -> 0x00ce }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo21590a(java.lang.String r5, int r6, java.lang.Throwable r7, byte[] r8, java.util.Map r9) {
        /*
            r4 = this;
            java.lang.String r5 = "gclid"
            java.lang.String r9 = ""
            r0 = 1
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 == r2) goto L_0x0012
            r2 = 204(0xcc, float:2.86E-43)
            if (r6 == r2) goto L_0x0012
            r2 = 304(0x130, float:4.26E-43)
            if (r6 != r2) goto L_0x0016
        L_0x0012:
            if (r7 != 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "Network Request for Deferred Deep Link failed. response, exception"
            r5.mo21551a(r8, r6, r7)
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.x3 r6 = r4.mo21601o()
            com.google.android.gms.measurement.internal.z3 r6 = r6.f15591z
            r6.mo21869a(r0)
            int r6 = r8.length
            if (r6 != 0) goto L_0x0045
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo21205d()
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21527A()
            java.lang.String r6 = "Deferred Deep Link response empty."
            r5.mo21549a(r6)
            return
        L_0x0045:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ce }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r6 = "deeplink"
            java.lang.String r6 = r7.optString(r6, r9)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = r7.optString(r5, r9)     // Catch:{ JSONException -> 0x00ce }
            com.google.android.gms.measurement.internal.f9 r8 = r4.mo21607u()     // Catch:{ JSONException -> 0x00ce }
            r8.mo21201b()     // Catch:{ JSONException -> 0x00ce }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x00ce }
            if (r9 != 0) goto L_0x0086
            android.content.Context r8 = r8.mo21206e()     // Catch:{ JSONException -> 0x00ce }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ JSONException -> 0x00ce }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r6)     // Catch:{ JSONException -> 0x00ce }
            r9.<init>(r2, r3)     // Catch:{ JSONException -> 0x00ce }
            java.util.List r8 = r8.queryIntentActivities(r9, r1)     // Catch:{ JSONException -> 0x00ce }
            if (r8 == 0) goto L_0x0086
            boolean r8 = r8.isEmpty()     // Catch:{ JSONException -> 0x00ce }
            if (r8 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            if (r0 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo21205d()     // Catch:{ JSONException -> 0x00ce }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21536w()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r8 = "Deferred Deep Link validation failed. gclid, deep link"
            r5.mo21551a(r8, r7, r6)     // Catch:{ JSONException -> 0x00ce }
            return
        L_0x0097:
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ JSONException -> 0x00ce }
            r8.<init>()     // Catch:{ JSONException -> 0x00ce }
            r8.putString(r5, r7)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r5 = "_cis"
            java.lang.String r7 = "ddp"
            r8.putString(r5, r7)     // Catch:{ JSONException -> 0x00ce }
            com.google.android.gms.measurement.internal.w5 r5 = r4.f15392p     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = "auto"
            java.lang.String r9 = "_cmp"
            r5.mo21764a(r7, r9, r8)     // Catch:{ JSONException -> 0x00ce }
            com.google.android.gms.measurement.internal.f9 r5 = r4.mo21607u()     // Catch:{ JSONException -> 0x00ce }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x00ce }
            if (r7 != 0) goto L_0x00cd
            boolean r6 = r5.mo21387e(r6)     // Catch:{ JSONException -> 0x00ce }
            if (r6 == 0) goto L_0x00cd
            android.content.Intent r6 = new android.content.Intent     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = "android.google.analytics.action.DEEPLINK_ACTION"
            r6.<init>(r7)     // Catch:{ JSONException -> 0x00ce }
            android.content.Context r5 = r5.mo21206e()     // Catch:{ JSONException -> 0x00ce }
            r5.sendBroadcast(r6)     // Catch:{ JSONException -> 0x00ce }
        L_0x00cd:
            return
        L_0x00ce:
            r5 = move-exception
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo21205d()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21533t()
            java.lang.String r7 = "Failed to parse the Deferred Deep Link response. exception"
            r6.mo21550a(r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5359p4.mo21590a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
