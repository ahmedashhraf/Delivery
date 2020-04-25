package com.google.android.gms.measurement.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import java.util.List;
import java.util.Map;

@C0226w0
/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5402t3 implements Runnable {

    /* renamed from: N */
    private final Throwable f15479N;

    /* renamed from: O */
    private final byte[] f15480O;

    /* renamed from: P */
    private final String f15481P;

    /* renamed from: Q */
    private final Map<String, List<String>> f15482Q;

    /* renamed from: a */
    private final C5369q3 f15483a;

    /* renamed from: b */
    private final int f15484b;

    private C5402t3(String str, C5369q3 q3Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C4300a0.m18620a(q3Var);
        this.f15483a = q3Var;
        this.f15484b = i;
        this.f15479N = th;
        this.f15480O = bArr;
        this.f15481P = str;
        this.f15482Q = map;
    }

    public final void run() {
        this.f15483a.mo21148a(this.f15481P, this.f15484b, this.f15479N, this.f15480O, this.f15482Q);
    }
}
