package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5255g {

    /* renamed from: a */
    final String f15041a;

    /* renamed from: b */
    final String f15042b;

    /* renamed from: c */
    final long f15043c;

    /* renamed from: d */
    final long f15044d;

    /* renamed from: e */
    final long f15045e;

    /* renamed from: f */
    final long f15046f;

    /* renamed from: g */
    final long f15047g;

    /* renamed from: h */
    final Long f15048h;

    /* renamed from: i */
    final Long f15049i;

    /* renamed from: j */
    final Long f15050j;

    /* renamed from: k */
    final Boolean f15051k;

    C5255g(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C4300a0.m18630b(str);
        C4300a0.m18630b(str2);
        boolean z = true;
        C4300a0.m18627a(j6 >= 0);
        C4300a0.m18627a(j7 >= 0);
        C4300a0.m18627a(j8 >= 0);
        if (j9 < 0) {
            z = false;
        }
        C4300a0.m18627a(z);
        this.f15041a = str;
        this.f15042b = str2;
        this.f15043c = j6;
        this.f15044d = j7;
        this.f15045e = j8;
        this.f15046f = j4;
        this.f15047g = j9;
        this.f15048h = l;
        this.f15049i = l2;
        this.f15050j = l3;
        this.f15051k = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C5255g mo21393a(long j) {
        C5255g gVar = new C5255g(this.f15041a, this.f15042b, this.f15043c, this.f15044d, this.f15045e, j, this.f15047g, this.f15048h, this.f15049i, this.f15050j, this.f15051k);
        return gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C5255g mo21394a(long j, long j2) {
        C5255g gVar = new C5255g(this.f15041a, this.f15042b, this.f15043c, this.f15044d, this.f15045e, this.f15046f, j, Long.valueOf(j2), this.f15049i, this.f15050j, this.f15051k);
        return gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C5255g mo21395a(Long l, Long l2, Boolean bool) {
        C5255g gVar = new C5255g(this.f15041a, this.f15042b, this.f15043c, this.f15044d, this.f15045e, this.f15046f, this.f15047g, this.f15048h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return gVar;
    }

    C5255g(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j, j2, 0, j3, 0, null, null, null, null);
    }
}
