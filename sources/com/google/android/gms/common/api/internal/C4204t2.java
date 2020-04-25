package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.t2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4204t2 implements C4214v2 {

    /* renamed from: a */
    private final /* synthetic */ C4209u2 f13149a;

    C4204t2(C4209u2 u2Var) {
        this.f13149a = u2Var;
    }

    /* renamed from: a */
    public final void mo17970a(BasePendingResult<?> basePendingResult) {
        this.f13149a.f13157a.remove(basePendingResult);
        basePendingResult.mo17750d();
    }
}
