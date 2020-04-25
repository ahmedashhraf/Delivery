package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5338n5 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15339N;

    /* renamed from: O */
    private final /* synthetic */ long f15340O;

    /* renamed from: P */
    private final /* synthetic */ C5414u4 f15341P;

    /* renamed from: a */
    private final /* synthetic */ String f15342a;

    /* renamed from: b */
    private final /* synthetic */ String f15343b;

    C5338n5(C5414u4 u4Var, String str, String str2, String str3, long j) {
        this.f15341P = u4Var;
        this.f15342a = str;
        this.f15343b = str2;
        this.f15339N = str3;
        this.f15340O = j;
    }

    public final void run() {
        String str = this.f15342a;
        if (str == null) {
            this.f15341P.f15506b.mo21865s().mo21582D().mo21310a(this.f15343b, (C5208b7) null);
            return;
        }
        this.f15341P.f15506b.mo21865s().mo21582D().mo21310a(this.f15343b, new C5208b7(this.f15339N, str, this.f15340O));
    }
}
