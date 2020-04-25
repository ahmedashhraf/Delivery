package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5230d7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5208b7 f14954N;

    /* renamed from: O */
    private final /* synthetic */ C5241e7 f14955O;

    /* renamed from: a */
    private final /* synthetic */ boolean f14956a;

    /* renamed from: b */
    private final /* synthetic */ C5208b7 f14957b;

    C5230d7(C5241e7 e7Var, boolean z, C5208b7 b7Var, C5208b7 b7Var2) {
        this.f14955O = e7Var;
        this.f14956a = z;
        this.f14957b = b7Var;
        this.f14954N = b7Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.google.android.gms.measurement.internal.C5254f9.m22842d(r10.f14957b.f14910a, r10.f14954N.f14910a) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.r9 r0 = r0.mo21214m()
            com.google.android.gms.measurement.internal.e7 r1 = r10.f14955O
            com.google.android.gms.measurement.internal.h3 r1 = r1.mo21229p()
            java.lang.String r1 = r1.mo21410A()
            boolean r0 = r0.mo21657p(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002f
            boolean r0 = r10.f14956a
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.b7 r0 = r0.f15005c
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.measurement.internal.e7 r3 = r10.f14955O
            com.google.android.gms.measurement.internal.b7 r4 = r3.f15005c
            r3.m22694a(r4, r2)
            goto L_0x003d
        L_0x002f:
            boolean r0 = r10.f14956a
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.b7 r3 = r0.f15005c
            if (r3 == 0) goto L_0x003c
            r0.m22694a(r3, r2)
        L_0x003c:
            r0 = 0
        L_0x003d:
            com.google.android.gms.measurement.internal.b7 r3 = r10.f14957b
            if (r3 == 0) goto L_0x0063
            long r4 = r3.f14912c
            com.google.android.gms.measurement.internal.b7 r6 = r10.f14954N
            long r7 = r6.f14912c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0063
            java.lang.String r3 = r3.f14911b
            java.lang.String r4 = r6.f14911b
            boolean r3 = com.google.android.gms.measurement.internal.C5254f9.m22842d(r3, r4)
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.b7 r3 = r10.f14957b
            java.lang.String r3 = r3.f14910a
            com.google.android.gms.measurement.internal.b7 r4 = r10.f14954N
            java.lang.String r4 = r4.f14910a
            boolean r3 = com.google.android.gms.measurement.internal.C5254f9.m22842d(r3, r4)
            if (r3 != 0) goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            if (r1 == 0) goto L_0x00cd
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.b7 r3 = r10.f14954N
            com.google.android.gms.measurement.internal.C5241e7.m22693a(r3, r1, r2)
            com.google.android.gms.measurement.internal.b7 r2 = r10.f14957b
            if (r2 == 0) goto L_0x008f
            java.lang.String r2 = r2.f14910a
            if (r2 == 0) goto L_0x007d
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L_0x007d:
            com.google.android.gms.measurement.internal.b7 r2 = r10.f14957b
            java.lang.String r2 = r2.f14911b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.b7 r2 = r10.f14957b
            long r2 = r2.f14912c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L_0x008f:
            com.google.android.gms.measurement.internal.e7 r2 = r10.f14955O
            com.google.android.gms.measurement.internal.r9 r2 = r2.mo21214m()
            com.google.android.gms.measurement.internal.e7 r3 = r10.f14955O
            com.google.android.gms.measurement.internal.h3 r3 = r3.mo21229p()
            java.lang.String r3 = r3.mo21410A()
            boolean r2 = r2.mo21657p(r3)
            if (r2 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.m8 r0 = r0.mo21233t()
            long r2 = r0.mo21563D()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.f9 r0 = r0.mo21212k()
            r0.mo21367a(r1, r2)
        L_0x00c0:
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.w5 r0 = r0.mo21228o()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.mo21775b(r2, r3, r1)
        L_0x00cd:
            com.google.android.gms.measurement.internal.e7 r0 = r10.f14955O
            com.google.android.gms.measurement.internal.b7 r1 = r10.f14954N
            r0.f15005c = r1
            com.google.android.gms.measurement.internal.f7 r0 = r0.mo21230q()
            com.google.android.gms.measurement.internal.b7 r1 = r10.f14954N
            r0.mo21348a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5230d7.run():void");
    }
}
