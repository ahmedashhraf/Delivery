package com.google.common.util.concurrent;

import com.google.common.base.C7365j0;
import com.google.common.base.C7397x;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.p203u.C5969d;

@C5969d
@C2775a
/* renamed from: com.google.common.util.concurrent.k0 */
/* compiled from: RateLimiter */
public abstract class C8533k0 {

    /* renamed from: a */
    private final C8536c f22488a;

    /* renamed from: b */
    private final long f22489b;

    /* renamed from: c */
    double f22490c;

    /* renamed from: d */
    double f22491d;

    /* renamed from: e */
    volatile double f22492e;

    /* renamed from: f */
    private final Object f22493f;

    /* renamed from: g */
    private long f22494g;

    /* renamed from: com.google.common.util.concurrent.k0$b */
    /* compiled from: RateLimiter */
    private static class C8535b extends C8533k0 {

        /* renamed from: h */
        final double f22495h;

        C8535b(C8536c cVar, double d) {
            super(cVar);
            this.f22495h = d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31810a(double d, double d2) {
            double d3 = this.f22491d;
            this.f22491d = this.f22495h * d;
            double d4 = 0.0d;
            if (d3 != 0.0d) {
                d4 = (this.f22490c * this.f22491d) / d3;
            }
            this.f22490c = d4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public long mo31814b(double d, double d2) {
            return 0;
        }
    }

    @C2778d
    /* renamed from: com.google.common.util.concurrent.k0$c */
    /* compiled from: RateLimiter */
    static abstract class C8536c extends C7365j0 {

        /* renamed from: b */
        static final C8536c f22496b = new C8537a();

        /* renamed from: com.google.common.util.concurrent.k0$c$a */
        /* compiled from: RateLimiter */
        static class C8537a extends C8536c {
            C8537a() {
            }

            /* renamed from: a */
            public long mo23201a() {
                return C7365j0.m35606b().mo23201a();
            }

            /* renamed from: a */
            public void mo31820a(long j) {
                if (j > 0) {
                    C8595u0.m40490a(j, TimeUnit.MICROSECONDS);
                }
            }
        }

        C8536c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo31820a(long j);
    }

    /* renamed from: com.google.common.util.concurrent.k0$d */
    /* compiled from: RateLimiter */
    private static class C8538d extends C8533k0 {

        /* renamed from: h */
        final long f22497h;

        /* renamed from: i */
        private double f22498i;

        /* renamed from: j */
        private double f22499j;

        C8538d(C8536c cVar, long j, TimeUnit timeUnit) {
            super(cVar);
            this.f22497h = timeUnit.toMicros(j);
        }

        /* renamed from: c */
        private double m40330c(double d) {
            return this.f22492e + (d * this.f22498i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31810a(double d, double d2) {
            double d3 = this.f22491d;
            double d4 = (double) this.f22497h;
            Double.isNaN(d4);
            this.f22491d = d4 / d2;
            double d5 = this.f22491d;
            this.f22499j = d5 / 2.0d;
            this.f22498i = ((3.0d * d2) - d2) / this.f22499j;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.f22490c = 0.0d;
                return;
            }
            if (d3 != 0.0d) {
                d5 = (this.f22490c * d5) / d3;
            }
            this.f22490c = d5;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public long mo31814b(double d, double d2) {
            long j;
            double d3 = d - this.f22499j;
            if (d3 > 0.0d) {
                double min = Math.min(d3, d2);
                j = (long) (((m40330c(d3) + m40330c(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            double d4 = (double) j;
            double d5 = this.f22492e * d2;
            Double.isNaN(d4);
            return (long) (d4 + d5);
        }
    }

    @C2778d
    /* renamed from: a */
    static C8533k0 m40306a(C8536c cVar, double d) {
        C8535b bVar = new C8535b(cVar, 1.0d);
        bVar.mo31809a(d);
        return bVar;
    }

    /* renamed from: b */
    public static C8533k0 m40309b(double d) {
        return m40306a(C8536c.f22496b, d);
    }

    /* renamed from: e */
    private long m40312e() {
        return TimeUnit.NANOSECONDS.toMicros(this.f22488a.mo23201a() - this.f22489b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo31810a(double d, double d2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract long mo31814b(double d, double d2);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo31816c() {
        return mo31815b(1);
    }

    /* renamed from: d */
    public boolean mo31818d() {
        return mo31811a(1, 0, TimeUnit.MICROSECONDS);
    }

    public String toString() {
        return String.format("RateLimiter[stableRate=%3.1fqps]", new Object[]{Double.valueOf(1000000.0d / this.f22492e)});
    }

    private C8533k0(C8536c cVar) {
        this.f22493f = new Object();
        this.f22494g = 0;
        this.f22488a = cVar;
        this.f22489b = cVar.mo23201a();
    }

    @C2778d
    /* renamed from: b */
    static C8533k0 m40310b(C8536c cVar, double d, long j, TimeUnit timeUnit) {
        double nanos = (double) timeUnit.toNanos(j);
        Double.isNaN(nanos);
        C8535b bVar = new C8535b(cVar, nanos / 1.0E9d);
        bVar.mo31809a(d);
        return bVar;
    }

    /* renamed from: d */
    private static void m40311d(int i) {
        C7397x.m35671a(i > 0, (Object) "Requested permits must be positive");
    }

    /* renamed from: c */
    public boolean mo31817c(int i) {
        return mo31811a(i, 0, TimeUnit.MICROSECONDS);
    }

    /* renamed from: a */
    public static C8533k0 m40305a(double d, long j, TimeUnit timeUnit) {
        return m40307a(C8536c.f22496b, d, j, timeUnit);
    }

    @C2778d
    /* renamed from: a */
    static C8533k0 m40307a(C8536c cVar, double d, long j, TimeUnit timeUnit) {
        C8538d dVar = new C8538d(cVar, j, timeUnit);
        dVar.mo31809a(d);
        return dVar;
    }

    /* renamed from: b */
    public final double mo31813b() {
        double micros = (double) TimeUnit.SECONDS.toMicros(1);
        double d = this.f22492e;
        Double.isNaN(micros);
        return micros / d;
    }

    /* renamed from: a */
    public final void mo31809a(double d) {
        C7397x.m35671a(d > 0.0d && !Double.isNaN(d), (Object) "rate must be positive");
        synchronized (this.f22493f) {
            m40308a(m40312e());
            double micros = (double) TimeUnit.SECONDS.toMicros(1);
            Double.isNaN(micros);
            double d2 = micros / d;
            this.f22492e = d2;
            mo31810a(d, d2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo31815b(int i) {
        long a;
        m40311d(i);
        synchronized (this.f22493f) {
            a = m40304a((double) i, m40312e());
        }
        return a;
    }

    /* renamed from: a */
    public double mo31807a() {
        return mo31808a(1);
    }

    /* renamed from: a */
    public double mo31808a(int i) {
        long b = mo31815b(i);
        this.f22488a.mo31820a(b);
        double d = (double) b;
        Double.isNaN(d);
        double d2 = d * 1.0d;
        double micros = (double) TimeUnit.SECONDS.toMicros(1);
        Double.isNaN(micros);
        return d2 / micros;
    }

    /* renamed from: a */
    public boolean mo31812a(long j, TimeUnit timeUnit) {
        return mo31811a(1, j, timeUnit);
    }

    /* renamed from: a */
    public boolean mo31811a(int i, long j, TimeUnit timeUnit) {
        long micros = timeUnit.toMicros(j);
        m40311d(i);
        synchronized (this.f22493f) {
            long e = m40312e();
            if (this.f22494g > micros + e) {
                return false;
            }
            long a = m40304a((double) i, e);
            this.f22488a.mo31820a(a);
            return true;
        }
    }

    /* renamed from: a */
    private long m40304a(double d, long j) {
        m40308a(j);
        long max = Math.max(0, this.f22494g - j);
        double min = Math.min(d, this.f22490c);
        this.f22494g += mo31814b(this.f22490c, min) + ((long) ((d - min) * this.f22492e));
        this.f22490c -= min;
        return max;
    }

    /* renamed from: a */
    private void m40308a(long j) {
        long j2 = this.f22494g;
        if (j > j2) {
            double d = this.f22491d;
            double d2 = this.f22490c;
            double d3 = (double) (j - j2);
            double d4 = this.f22492e;
            Double.isNaN(d3);
            this.f22490c = Math.min(d, d2 + (d3 / d4));
            this.f22494g = j;
        }
    }
}
