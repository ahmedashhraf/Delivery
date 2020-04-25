package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5468z4 implements Callable<List<C5265g9>> {

    /* renamed from: N */
    private final /* synthetic */ String f15671N;

    /* renamed from: O */
    private final /* synthetic */ C5414u4 f15672O;

    /* renamed from: a */
    private final /* synthetic */ String f15673a;

    /* renamed from: b */
    private final /* synthetic */ String f15674b;

    C5468z4(C5414u4 u4Var, String str, String str2, String str3) {
        this.f15672O = u4Var;
        this.f15673a = str;
        this.f15674b = str2;
        this.f15671N = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15672O.f15506b.mo21863q();
        return this.f15672O.f15506b.mo21855i().mo21682a(this.f15673a, this.f15674b, this.f15671N);
    }
}
