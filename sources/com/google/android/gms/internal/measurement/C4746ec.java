package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.C0193h0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.api.internal.C4145j;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.common.util.C4492k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C4533a;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C5415u5;
import com.google.android.gms.measurement.internal.C5426v5;
import com.google.android.gms.measurement.p174b.C5179a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.ec */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
public class C4746ec {

    /* renamed from: j */
    private static volatile C4746ec f14063j = null;

    /* renamed from: k */
    private static Boolean f14064k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static Boolean f14065l = null;

    /* renamed from: m */
    private static boolean f14066m = false;

    /* renamed from: n */
    private static Boolean f14067n = null;
    @C4476d0

    /* renamed from: o */
    private static String f14068o = "use_dynamite_api";
    @C4476d0

    /* renamed from: p */
    private static String f14069p = "allow_remote_dynamite";

    /* renamed from: q */
    private static boolean f14070q = false;

    /* renamed from: r */
    private static boolean f14071r = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14072a;

    /* renamed from: b */
    protected final C4484g f14073b;

    /* renamed from: c */
    private final ExecutorService f14074c;

    /* renamed from: d */
    private final C5179a f14075d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<Pair<C5415u5, C4748b>> f14076e;

    /* renamed from: f */
    private int f14077f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f14078g;

    /* renamed from: h */
    private String f14079h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4813ib f14080i;

    /* renamed from: com.google.android.gms.internal.measurement.ec$a */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    abstract class C4747a implements Runnable {

        /* renamed from: N */
        private final boolean f14081N;

        /* renamed from: a */
        final long f14083a;

        /* renamed from: b */
        final long f14084b;

        C4747a(C4746ec ecVar) {
            this(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo18823a() throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo18903b() {
        }

        public void run() {
            if (C4746ec.this.f14078g) {
                mo18903b();
                return;
            }
            try {
                mo18823a();
            } catch (Exception e) {
                C4746ec.this.m20065a(e, false, this.f14081N);
                mo18903b();
            }
        }

        C4747a(boolean z) {
            this.f14083a = C4746ec.this.f14073b.mo18569a();
            this.f14084b = C4746ec.this.f14073b.mo18572d();
            this.f14081N = z;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ec$b */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    static class C4748b extends C5079zb {

        /* renamed from: b */
        private final C5415u5 f14085b;

        C4748b(C5415u5 u5Var) {
            this.f14085b = u5Var;
        }

        /* renamed from: a */
        public final void mo18859a(String str, String str2, Bundle bundle, long j) {
            this.f14085b.onEvent(str, str2, bundle, j);
        }

        /* renamed from: a */
        public final int mo18858a() {
            return System.identityHashCode(this.f14085b);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ec$c */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    static class C4749c extends C5079zb {

        /* renamed from: b */
        private final C5426v5 f14086b;

        C4749c(C5426v5 v5Var) {
            this.f14086b = v5Var;
        }

        /* renamed from: a */
        public final void mo18859a(String str, String str2, Bundle bundle, long j) {
            this.f14086b.mo21089a(str, str2, bundle, j);
        }

        /* renamed from: a */
        public final int mo18858a() {
            return System.identityHashCode(this.f14086b);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ec$d */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    class C4750d implements ActivityLifecycleCallbacks {
        C4750d() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C4746ec.this.m20062a((C4747a) new C4734e0(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            C4746ec.this.m20062a((C4747a) new C4815j0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C4746ec.this.m20062a((C4747a) new C4797i0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C4746ec.this.m20062a((C4747a) new C4752f0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4779g9 g9Var = new C4779g9();
            C4746ec.this.m20062a((C4747a) new C4828k0(this, activity, g9Var));
            Bundle e = g9Var.mo19018e(50);
            if (e != null) {
                bundle.putAll(e);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C4746ec.this.m20062a((C4747a) new C4770g0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C4746ec.this.m20062a((C4747a) new C4784h0(this, activity));
        }
    }

    private C4746ec(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m20075c(str2, str3)) {
            this.f14072a = "FA";
        } else {
            this.f14072a = str;
        }
        this.f14073b = C4492k.m19370e();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f14074c = threadPoolExecutor;
        this.f14075d = new C5179a(this);
        boolean z = false;
        if (!(!m20079f(context) || m20084k())) {
            this.f14079h = null;
            this.f14078g = true;
            return;
        }
        if (!m20075c(str2, str3)) {
            this.f14079h = "fa";
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                boolean z3 = z2 ^ z;
            } else {
                this.f14078g = true;
                return;
            }
        } else {
            this.f14079h = str2;
        }
        C4691b bVar = new C4691b(this, str2, str3, context, bundle);
        m20062a((C4747a) bVar);
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C4750d());
        }
    }

    /* renamed from: a */
    public static C4746ec m20058a(@C0193h0 Context context) {
        return m20059a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m20075c(String str, String str2) {
        return (str2 == null || str == null || m20084k()) ? false : true;
    }

    /* renamed from: f */
    private static boolean m20079f(Context context) {
        try {
            C4145j.m17953a(context);
            if (C4145j.m17957b() != null) {
                return true;
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m20080g(Context context) {
        return DynamiteModule.m19548b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m20081h(Context context) {
        return DynamiteModule.m19542a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: k */
    private static boolean m20084k() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo18958b(C5415u5 u5Var) {
        C4300a0.m18620a(u5Var);
        m20062a((C4747a) new C5054y(this, u5Var));
    }

    /* renamed from: d */
    public final String mo18965d() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4868m(this, g9Var));
        return g9Var.mo19017d(50);
    }

    /* renamed from: e */
    public final long mo18966e() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4907p(this, g9Var));
        Long l = (Long) C4779g9.m20242a(g9Var.mo19018e(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f14073b.mo18569a()).nextLong();
        int i = this.f14077f + 1;
        this.f14077f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: i */
    public final String mo18970i() {
        return this.f14079h;
    }

    /* renamed from: a */
    public static C4746ec m20059a(Context context, String str, String str2, String str3, Bundle bundle) {
        C4300a0.m18620a(context);
        if (f14063j == null) {
            synchronized (C4746ec.class) {
                if (f14063j == null) {
                    C4746ec ecVar = new C4746ec(context, str, str2, str3, bundle);
                    f14063j = ecVar;
                }
            }
        }
        return f14063j;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20082i(android.content.Context r3) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.ec> r0 = com.google.android.gms.internal.measurement.C4746ec.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Boolean r2 = f14064k     // Catch:{ Exception -> 0x0056 }
            if (r2 == 0) goto L_0x000e
            java.lang.Boolean r2 = f14065l     // Catch:{ Exception -> 0x0056 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x000e:
            java.lang.String r2 = "app_measurement_internal_disable_startup_flags"
            boolean r2 = m20068a(r3, r2)     // Catch:{ Exception -> 0x0056 }
            if (r2 == 0) goto L_0x0024
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0056 }
            f14064k = r3     // Catch:{ Exception -> 0x0056 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0056 }
            f14065l = r3     // Catch:{ Exception -> 0x0056 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0024:
            java.lang.String r2 = "com.google.android.gms.measurement.prefs"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r2, r1)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = f14068o     // Catch:{ Exception -> 0x0056 }
            boolean r2 = r3.getBoolean(r2, r1)     // Catch:{ Exception -> 0x0056 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0056 }
            f14064k = r2     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = f14069p     // Catch:{ Exception -> 0x0056 }
            boolean r2 = r3.getBoolean(r2, r1)     // Catch:{ Exception -> 0x0056 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0056 }
            f14065l = r2     // Catch:{ Exception -> 0x0056 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = f14068o     // Catch:{ Exception -> 0x0056 }
            r3.remove(r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = f14069p     // Catch:{ Exception -> 0x0056 }
            r3.remove(r2)     // Catch:{ Exception -> 0x0056 }
            r3.apply()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0062
        L_0x0054:
            r3 = move-exception
            goto L_0x0064
        L_0x0056:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0054 }
            f14064k = r3     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0054 }
            f14065l = r3     // Catch:{ all -> 0x0054 }
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4746ec.m20082i(android.content.Context):void");
    }

    /* renamed from: c */
    public final void mo18963c(String str) {
        m20062a((C4747a) new C4841l(this, str));
    }

    /* renamed from: g */
    public final String mo18968g() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4939r(this, g9Var));
        return g9Var.mo19017d(500);
    }

    @C0226w0
    /* renamed from: h */
    public final String mo18969h() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C5001u(this, g9Var));
        return g9Var.mo19017d(120000);
    }

    /* renamed from: b */
    public final void mo18960b(String str, String str2, Bundle bundle) {
        m20062a((C4747a) new C4782gc(this, str, str2, bundle));
    }

    /* renamed from: c */
    public final String mo18962c() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4881n(this, g9Var));
        return g9Var.mo19017d(500);
    }

    /* renamed from: f */
    public final String mo18967f() {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4894o(this, g9Var));
        return g9Var.mo19017d(500);
    }

    /* renamed from: b */
    public final List<Bundle> mo18955b(String str, String str2) {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4719d(this, str, str2, g9Var));
        List<Bundle> list = (List) C4779g9.m20242a(g9Var.mo19018e(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: d */
    public final int mo18964d(String str) {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C5015v(this, str, g9Var));
        Integer num = (Integer) C4779g9.m20242a(g9Var.mo19018e(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final void mo18956b() {
        m20062a((C4747a) new C4783h(this));
    }

    /* renamed from: a */
    public final C5179a mo18939a() {
        return this.f14075d;
    }

    /* renamed from: b */
    public final void mo18957b(long j) {
        m20062a((C4747a) new C4814j(this, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20062a(C4747a aVar) {
        this.f14074c.execute(aVar);
    }

    /* renamed from: b */
    public final void mo18959b(String str) {
        m20062a((C4747a) new C4796i(this, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4813ib mo18938a(Context context, boolean z) {
        C4533a aVar;
        if (z) {
            try {
                aVar = DynamiteModule.f13813m;
            } catch (LoadingException e) {
                m20065a((Exception) e, true, false);
                return null;
            }
        } else {
            aVar = DynamiteModule.f13810j;
        }
        return C4794ha.asInterface(DynamiteModule.m19544a(context, aVar, ModuleDescriptor.MODULE_ID).mo18636a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* renamed from: b */
    public final void mo18961b(boolean z) {
        m20062a((C4747a) new C5067z(this, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        f14067n = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        f14066m = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20072b(android.content.Context r8) {
        /*
            m20082i(r8)
            java.lang.Class<com.google.android.gms.internal.measurement.ec> r8 = com.google.android.gms.internal.measurement.C4746ec.class
            monitor-enter(r8)
            boolean r0 = f14066m     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x006e }
            goto L_0x0060
        L_0x000c:
            java.lang.String r0 = "android.os.SystemProperties"
            r1 = 0
            r2 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x005b }
            java.lang.String r3 = "get"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x005b }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x005b }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch:{ Exception -> 0x005b }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch:{ Exception -> 0x005b }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x005b }
            java.lang.String r4 = "measurement.dynamite.enabled"
            r3[r7] = r4     // Catch:{ Exception -> 0x005b }
            java.lang.String r4 = ""
            r3[r2] = r4     // Catch:{ Exception -> 0x005b }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ Exception -> 0x005b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005b }
            java.lang.String r3 = "true"
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x005b }
            if (r3 == 0) goto L_0x0045
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x005b }
            f14067n = r0     // Catch:{ Exception -> 0x005b }
            goto L_0x0056
        L_0x0045:
            java.lang.String r3 = "false"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0054
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x005b }
            f14067n = r0     // Catch:{ Exception -> 0x005b }
            goto L_0x0056
        L_0x0054:
            f14067n = r1     // Catch:{ Exception -> 0x005b }
        L_0x0056:
            f14066m = r2     // Catch:{ all -> 0x006e }
            goto L_0x005f
        L_0x0059:
            r0 = move-exception
            goto L_0x006b
        L_0x005b:
            f14067n = r1     // Catch:{ all -> 0x0059 }
            f14066m = r2     // Catch:{ all -> 0x006e }
        L_0x005f:
            monitor-exit(r8)     // Catch:{ all -> 0x006e }
        L_0x0060:
            java.lang.Boolean r8 = f14067n
            if (r8 != 0) goto L_0x0066
            java.lang.Boolean r8 = f14064k
        L_0x0066:
            boolean r8 = r8.booleanValue()
            return r8
        L_0x006b:
            f14066m = r2     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4746ec.m20072b(android.content.Context):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20065a(Exception exc, boolean z, boolean z2) {
        this.f14078g |= z;
        if (!z && z2) {
            mo18942a(5, "Error with data collection. Data lost.", (Object) exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo18947a(C5426v5 v5Var) {
        m20062a((C4747a) new C4827k(this, v5Var));
    }

    /* renamed from: a */
    public final void mo18946a(C5415u5 u5Var) {
        C4300a0.m18620a(u5Var);
        m20062a((C4747a) new C5041x(this, u5Var));
    }

    /* renamed from: a */
    public final void mo18949a(@C0193h0 String str, Bundle bundle) {
        m20066a(null, str, bundle, false, true, null);
    }

    /* renamed from: a */
    public final void mo18951a(String str, String str2, Bundle bundle) {
        m20066a(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void mo18952a(String str, String str2, Bundle bundle, long j) {
        m20066a(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* renamed from: a */
    private final void m20066a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        C4706c0 c0Var = new C4706c0(this, l, str, str2, bundle, z, z2);
        m20062a((C4747a) c0Var);
    }

    /* renamed from: a */
    public final void mo18950a(String str, String str2) {
        m20067a((String) null, str, (Object) str2, false);
    }

    /* renamed from: a */
    public final void mo18953a(String str, String str2, Object obj) {
        m20067a(str, str2, obj, true);
    }

    /* renamed from: a */
    private final void m20067a(String str, String str2, Object obj, boolean z) {
        C4678a0 a0Var = new C4678a0(this, str, str2, obj, z);
        m20062a((C4747a) a0Var);
    }

    /* renamed from: a */
    public final void mo18945a(Bundle bundle) {
        m20062a((C4747a) new C4720d0(this, bundle));
    }

    /* renamed from: a */
    public final void mo18948a(String str) {
        m20062a((C4747a) new C4705c(this, str));
    }

    /* renamed from: a */
    public final void mo18944a(Activity activity, String str, String str2) {
        m20062a((C4747a) new C4751f(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo18954a(boolean z) {
        m20062a((C4747a) new C4733e(this, z));
    }

    /* renamed from: a */
    public final void mo18943a(long j) {
        m20062a((C4747a) new C4769g(this, j));
    }

    /* renamed from: a */
    public final Map<String, Object> mo18941a(String str, String str2, boolean z) {
        C4779g9 g9Var = new C4779g9();
        C4920q qVar = new C4920q(this, str, str2, z, g9Var);
        m20062a((C4747a) qVar);
        Bundle e = g9Var.mo19018e(5000);
        if (e == null || e.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(e.size());
        for (String str3 : e.keySet()) {
            Object obj = e.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo18942a(int i, String str, Object obj, Object obj2, Object obj3) {
        C4965t tVar = new C4965t(this, false, 5, str, obj, null, null);
        m20062a((C4747a) tVar);
    }

    /* renamed from: a */
    public final Bundle mo18937a(Bundle bundle, boolean z) {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C4952s(this, bundle, g9Var));
        if (z) {
            return g9Var.mo19018e(5000);
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo18940a(int i) {
        C4779g9 g9Var = new C4779g9();
        m20062a((C4747a) new C5028w(this, g9Var, i));
        return C4779g9.m20242a(g9Var.mo19018e(15000), Object.class);
    }

    /* renamed from: a */
    private static boolean m20068a(Context context, @C0210o0(min = 1) String str) {
        C4300a0.m18630b(str);
        try {
            ApplicationInfo a = C4439c.m19110a(context).mo18446a(context.getPackageName(), 128);
            if (a != null) {
                if (a.metaData != null) {
                    return a.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
