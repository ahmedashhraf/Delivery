package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4123f0 implements C4238a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f12933a;

    /* renamed from: b */
    private final /* synthetic */ C4205t3 f12934b;

    C4123f0(C4205t3 t3Var, BasePendingResult basePendingResult) {
        this.f12934b = t3Var;
        this.f12933a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo17820a(Status status) {
        this.f12934b.f13150a.remove(this.f12933a);
    }
}
