package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5217c5 implements Callable<List<zzs>> {

    /* renamed from: N */
    private final /* synthetic */ String f14926N;

    /* renamed from: O */
    private final /* synthetic */ C5414u4 f14927O;

    /* renamed from: a */
    private final /* synthetic */ zzm f14928a;

    /* renamed from: b */
    private final /* synthetic */ String f14929b;

    C5217c5(C5414u4 u4Var, zzm zzm, String str, String str2) {
        this.f14927O = u4Var;
        this.f14928a = zzm;
        this.f14929b = str;
        this.f14926N = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f14927O.f15506b.mo21863q();
        return this.f14927O.f15506b.mo21855i().mo21695b(this.f14928a.f15709a, this.f14929b, this.f14926N);
    }
}
