package com.google.common.base;

import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.base.e0 */
/* compiled from: Stopwatch */
public final class C7333e0 {

    /* renamed from: a */
    private final C7365j0 f20780a;

    /* renamed from: b */
    private boolean f20781b;

    /* renamed from: c */
    private long f20782c;

    /* renamed from: d */
    private long f20783d;

    /* renamed from: com.google.common.base.e0$a */
    /* compiled from: Stopwatch */
    static /* synthetic */ class C7334a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20784a = new int[TimeUnit.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20784a = r0
                int[] r0 = f20784a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20784a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f20784a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f20784a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C7333e0.C7334a.<clinit>():void");
        }
    }

    @Deprecated
    C7333e0() {
        this(C7365j0.m35606b());
    }

    /* renamed from: a */
    public static C7333e0 m35516a(C7365j0 j0Var) {
        return new C7333e0(j0Var).mo29210c();
    }

    /* renamed from: b */
    public static C7333e0 m35518b(C7365j0 j0Var) {
        return new C7333e0(j0Var);
    }

    /* renamed from: e */
    public static C7333e0 m35520e() {
        return new C7333e0().mo29210c();
    }

    /* renamed from: f */
    public static C7333e0 m35521f() {
        return new C7333e0();
    }

    /* renamed from: g */
    private long m35522g() {
        return this.f20781b ? (this.f20780a.mo23201a() - this.f20783d) + this.f20782c : this.f20782c;
    }

    /* renamed from: c */
    public C7333e0 mo29210c() {
        C7397x.m35677b(!this.f20781b, (Object) "This stopwatch is already running.");
        this.f20781b = true;
        this.f20783d = this.f20780a.mo23201a();
        return this;
    }

    /* renamed from: d */
    public C7333e0 mo29211d() {
        long a = this.f20780a.mo23201a();
        C7397x.m35677b(this.f20781b, (Object) "This stopwatch is already stopped.");
        this.f20781b = false;
        this.f20782c += a - this.f20783d;
        return this;
    }

    @C2777c("String.format()")
    public String toString() {
        long g = m35522g();
        TimeUnit a = m35517a(g);
        double d = (double) g;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, a);
        Double.isNaN(d);
        Double.isNaN(convert);
        return String.format("%.4g %s", new Object[]{Double.valueOf(d / convert), m35519b(a)});
    }

    @Deprecated
    C7333e0(C7365j0 j0Var) {
        this.f20780a = (C7365j0) C7397x.m35665a(j0Var, (Object) "ticker");
    }

    /* renamed from: a */
    public boolean mo29208a() {
        return this.f20781b;
    }

    /* renamed from: b */
    public C7333e0 mo29209b() {
        this.f20782c = 0;
        this.f20781b = false;
        return this;
    }

    /* renamed from: a */
    public long mo29207a(TimeUnit timeUnit) {
        return timeUnit.convert(m35522g(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    private static TimeUnit m35517a(long j) {
        if (TimeUnit.SECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    /* renamed from: b */
    private static String m35519b(TimeUnit timeUnit) {
        int i = C7334a.f20784a[timeUnit.ordinal()];
        if (i == 1) {
            return "ns";
        }
        if (i == 2) {
            return "μs";
        }
        if (i == 3) {
            return "ms";
        }
        if (i == 4) {
            return "s";
        }
        throw new AssertionError();
    }
}
