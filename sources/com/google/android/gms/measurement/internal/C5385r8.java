package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4484g;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5385r8 {

    /* renamed from: a */
    private final C4484g f15437a;

    /* renamed from: b */
    private long f15438b;

    public C5385r8(C4484g gVar) {
        C4300a0.m18620a(gVar);
        this.f15437a = gVar;
    }

    /* renamed from: a */
    public final void mo21629a() {
        this.f15438b = this.f15437a.mo18572d();
    }

    /* renamed from: b */
    public final void mo21631b() {
        this.f15438b = 0;
    }

    /* renamed from: a */
    public final boolean mo21630a(long j) {
        if (this.f15438b != 0 && this.f15437a.mo18572d() - this.f15438b < 3600000) {
            return false;
        }
        return true;
    }
}
