package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public abstract class C4896o1<T> {

    /* renamed from: f */
    private static final Object f14302f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    private static Context f14303g = null;

    /* renamed from: h */
    private static boolean f14304h = false;

    /* renamed from: i */
    private static C4708c2<C4829k1> f14305i;

    /* renamed from: j */
    private static final AtomicInteger f14306j = new AtomicInteger();

    /* renamed from: a */
    private final C5003u1 f14307a;

    /* renamed from: b */
    private final String f14308b;

    /* renamed from: c */
    private final T f14309c;

    /* renamed from: d */
    private volatile int f14310d;

    /* renamed from: e */
    private volatile T f14311e;

    private C4896o1(C5003u1 u1Var, String str, T t) {
        this.f14310d = -1;
        if (u1Var.f14425b != null) {
            this.f14307a = u1Var;
            this.f14308b = str;
            this.f14309c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public static void m20856a(Context context) {
        synchronized (f14302f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f14303g != context) {
                C5068z0.m21859d();
                C5043x1.m21767a();
                C4816j1.m20385a();
                f14306j.incrementAndGet();
                f14303g = context;
                f14305i = C4772g2.m20229a(C4941r1.f14383a);
            }
        }
    }

    /* renamed from: c */
    static void m20861c() {
        f14306j.incrementAndGet();
    }

    /* renamed from: d */
    static final /* synthetic */ C4829k1 m20862d() {
        new C4883n1();
        return C4883n1.m20744a(f14303g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo19351a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo19353b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f14306j
            int r0 = r0.get()
            int r1 = r6.f14310d
            if (r1 >= r0) goto L_0x00e3
            monitor-enter(r6)
            int r1 = r6.f14310d     // Catch:{ all -> 0x00e0 }
            if (r1 >= r0) goto L_0x00de
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00d6
            com.google.android.gms.internal.measurement.c2<com.google.android.gms.internal.measurement.k1> r1 = f14305i     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r1.mo18847a()     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.k1 r1 = (com.google.android.gms.internal.measurement.C4829k1) r1     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.u1 r2 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            android.net.Uri r2 = r2.f14425b     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.u1 r3 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = r3.f14427d     // Catch:{ all -> 0x00e0 }
            java.lang.String r4 = r6.f14308b     // Catch:{ all -> 0x00e0 }
            r5 = 0
            java.lang.String r1 = r1.mo19160a(r2, r5, r3, r4)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r6.mo19351a(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00d1
        L_0x0032:
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.j1 r1 = com.google.android.gms.internal.measurement.C4816j1.m20384a(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.mo18931a(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0050
            java.util.regex.Pattern r2 = com.google.android.gms.internal.measurement.C5055y0.f14520c     // Catch:{ all -> 0x00e0 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00e0 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0050
            r1 = 1
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            if (r1 != 0) goto L_0x008d
            com.google.android.gms.internal.measurement.u1 r1 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            android.net.Uri r1 = r1.f14425b     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0076
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.u1 r2 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            android.net.Uri r2 = r2.f14425b     // Catch:{ all -> 0x00e0 }
            boolean r1 = com.google.android.gms.internal.measurement.C4870m1.m20647a(r1, r2)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0074
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.u1 r2 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            android.net.Uri r2 = r2.f14425b     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.z0 r1 = com.google.android.gms.internal.measurement.C5068z0.m21858a(r1, r2)     // Catch:{ all -> 0x00e0 }
            goto L_0x007c
        L_0x0074:
            r1 = r5
            goto L_0x007c
        L_0x0076:
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.x1 r1 = com.google.android.gms.internal.measurement.C5043x1.m21766a(r1, r5)     // Catch:{ all -> 0x00e0 }
        L_0x007c:
            if (r1 == 0) goto L_0x00af
            java.lang.String r2 = r6.mo19352a()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r1.mo18931a(r2)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r6.mo19351a(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r1 = "PhenotypeFlag"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00af
            java.lang.String r1 = "Bypass reading Phenotype values for flag: "
            java.lang.String r2 = r6.mo19352a()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00e0 }
            int r3 = r2.length()     // Catch:{ all -> 0x00e0 }
            if (r3 == 0) goto L_0x00aa
            r1.concat(r2)     // Catch:{ all -> 0x00e0 }
            goto L_0x00af
        L_0x00aa:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e0 }
        L_0x00af:
            r1 = r5
        L_0x00b0:
            if (r1 == 0) goto L_0x00b3
            goto L_0x00d1
        L_0x00b3:
            android.content.Context r1 = f14303g     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.j1 r1 = com.google.android.gms.internal.measurement.C4816j1.m20384a(r1)     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.measurement.u1 r2 = r6.f14307a     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r2.f14426c     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r6.m20855a(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r1.mo18931a(r2)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r5 = r6.mo19351a(r1)     // Catch:{ all -> 0x00e0 }
        L_0x00cb:
            r1 = r5
            if (r1 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            T r1 = r6.f14309c     // Catch:{ all -> 0x00e0 }
        L_0x00d1:
            r6.f14311e = r1     // Catch:{ all -> 0x00e0 }
            r6.f14310d = r0     // Catch:{ all -> 0x00e0 }
            goto L_0x00de
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r6)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e3
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00e0 }
            throw r0
        L_0x00e3:
            T r0 = r6.f14311e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4896o1.mo19353b():java.lang.Object");
    }

    /* synthetic */ C4896o1(C5003u1 u1Var, String str, Object obj, C4928q1 q1Var) {
        this(u1Var, str, obj);
    }

    /* renamed from: a */
    private final String m20855a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f14308b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f14308b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final String mo19352a() {
        return m20855a(this.f14307a.f14427d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4896o1<Long> m20858b(C5003u1 u1Var, String str, long j) {
        return new C4928q1(u1Var, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4896o1<Boolean> m20860b(C5003u1 u1Var, String str, boolean z) {
        return new C4990t1(u1Var, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4896o1<Double> m20857b(C5003u1 u1Var, String str, double d) {
        return new C4954s1(u1Var, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4896o1<String> m20859b(C5003u1 u1Var, String str, String str2) {
        return new C5017v1(u1Var, str, str2);
    }
}
