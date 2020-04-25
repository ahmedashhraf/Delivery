package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final /* synthetic */ class C5197a7 implements Runnable {

    /* renamed from: N */
    private final Exception f14877N;

    /* renamed from: O */
    private final byte[] f14878O;

    /* renamed from: P */
    private final Map f14879P;

    /* renamed from: a */
    private final C5449x6 f14880a;

    /* renamed from: b */
    private final int f14881b;

    C5197a7(C5449x6 x6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f14880a = x6Var;
        this.f14881b = i;
        this.f14877N = exc;
        this.f14878O = bArr;
        this.f14879P = map;
    }

    public final void run() {
        this.f14880a.mo21821a(this.f14881b, this.f14877N, this.f14878O, this.f14879P);
    }
}
