package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5195a5 implements Callable<List<C5265g9>> {

    /* renamed from: N */
    private final /* synthetic */ String f14868N;

    /* renamed from: O */
    private final /* synthetic */ C5414u4 f14869O;

    /* renamed from: a */
    private final /* synthetic */ zzm f14870a;

    /* renamed from: b */
    private final /* synthetic */ String f14871b;

    C5195a5(C5414u4 u4Var, zzm zzm, String str, String str2) {
        this.f14869O = u4Var;
        this.f14870a = zzm;
        this.f14871b = str;
        this.f14868N = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f14869O.f15506b.mo21863q();
        return this.f14869O.f15506b.mo21855i().mo21682a(this.f14870a.f15709a, this.f14871b, this.f14868N);
    }
}
