package com.google.common.cache;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.f */
/* compiled from: CacheStats */
public final class C7441f {

    /* renamed from: a */
    private final long f20897a;

    /* renamed from: b */
    private final long f20898b;

    /* renamed from: c */
    private final long f20899c;

    /* renamed from: d */
    private final long f20900d;

    /* renamed from: e */
    private final long f20901e;

    /* renamed from: f */
    private final long f20902f;

    public C7441f(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z = true;
        C7397x.m35670a(j7 >= 0);
        C7397x.m35670a(j8 >= 0);
        C7397x.m35670a(j9 >= 0);
        C7397x.m35670a(j10 >= 0);
        C7397x.m35670a(j11 >= 0);
        if (j12 < 0) {
            z = false;
        }
        C7397x.m35670a(z);
        this.f20897a = j7;
        this.f20898b = j8;
        this.f20899c = j9;
        this.f20900d = j10;
        this.f20901e = j11;
        this.f20902f = j12;
    }

    /* renamed from: a */
    public double mo29346a() {
        long j = this.f20899c + this.f20900d;
        if (j == 0) {
            return 0.0d;
        }
        double d = (double) this.f20901e;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: b */
    public long mo29348b() {
        return this.f20902f;
    }

    /* renamed from: c */
    public long mo29350c() {
        return this.f20897a;
    }

    /* renamed from: d */
    public double mo29351d() {
        long k = mo29360k();
        if (k == 0) {
            return 1.0d;
        }
        double d = (double) this.f20897a;
        double d2 = (double) k;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: e */
    public long mo29352e() {
        return this.f20899c + this.f20900d;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C7441f)) {
            return false;
        }
        C7441f fVar = (C7441f) obj;
        if (this.f20897a == fVar.f20897a && this.f20898b == fVar.f20898b && this.f20899c == fVar.f20899c && this.f20900d == fVar.f20900d && this.f20901e == fVar.f20901e && this.f20902f == fVar.f20902f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo29354f() {
        return this.f20900d;
    }

    /* renamed from: g */
    public double mo29355g() {
        long j = this.f20899c;
        long j2 = this.f20900d;
        long j3 = j + j2;
        if (j3 == 0) {
            return 0.0d;
        }
        double d = (double) j2;
        double d2 = (double) j3;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: h */
    public long mo29356h() {
        return this.f20899c;
    }

    public int hashCode() {
        return C5827t.m25558a(Long.valueOf(this.f20897a), Long.valueOf(this.f20898b), Long.valueOf(this.f20899c), Long.valueOf(this.f20900d), Long.valueOf(this.f20901e), Long.valueOf(this.f20902f));
    }

    /* renamed from: i */
    public long mo29358i() {
        return this.f20898b;
    }

    /* renamed from: j */
    public double mo29359j() {
        long k = mo29360k();
        if (k == 0) {
            return 0.0d;
        }
        double d = (double) this.f20898b;
        double d2 = (double) k;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: k */
    public long mo29360k() {
        return this.f20897a + this.f20898b;
    }

    /* renamed from: l */
    public long mo29361l() {
        return this.f20901e;
    }

    public String toString() {
        return C5827t.m25559a((Object) this).mo23151a("hitCount", this.f20897a).mo23151a("missCount", this.f20898b).mo23151a("loadSuccessCount", this.f20899c).mo23151a("loadExceptionCount", this.f20900d).mo23151a("totalLoadTime", this.f20901e).mo23151a("evictionCount", this.f20902f).toString();
    }

    /* renamed from: b */
    public C7441f mo29349b(C7441f fVar) {
        C7441f fVar2 = fVar;
        C7441f fVar3 = new C7441f(this.f20897a + fVar2.f20897a, this.f20898b + fVar2.f20898b, this.f20899c + fVar2.f20899c, this.f20900d + fVar2.f20900d, this.f20901e + fVar2.f20901e, this.f20902f + fVar2.f20902f);
        return fVar3;
    }

    /* renamed from: a */
    public C7441f mo29347a(C7441f fVar) {
        C7441f fVar2 = fVar;
        long max = Math.max(0, this.f20897a - fVar2.f20897a);
        long max2 = Math.max(0, this.f20898b - fVar2.f20898b);
        long max3 = Math.max(0, this.f20899c - fVar2.f20899c);
        C7441f fVar3 = new C7441f(max, max2, max3, Math.max(0, this.f20900d - fVar2.f20900d), Math.max(0, this.f20901e - fVar2.f20901e), Math.max(0, this.f20902f - fVar2.f20902f));
        return fVar3;
    }
}
