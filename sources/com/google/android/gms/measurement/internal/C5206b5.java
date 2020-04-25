package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5206b5 implements Callable<List<zzs>> {

    /* renamed from: N */
    private final /* synthetic */ String f14897N;

    /* renamed from: O */
    private final /* synthetic */ C5414u4 f14898O;

    /* renamed from: a */
    private final /* synthetic */ String f14899a;

    /* renamed from: b */
    private final /* synthetic */ String f14900b;

    C5206b5(C5414u4 u4Var, String str, String str2, String str3) {
        this.f14898O = u4Var;
        this.f14899a = str;
        this.f14900b = str2;
        this.f14897N = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f14898O.f15506b.mo21863q();
        return this.f14898O.f15506b.mo21855i().mo21695b(this.f14899a, this.f14900b, this.f14897N);
    }
}
