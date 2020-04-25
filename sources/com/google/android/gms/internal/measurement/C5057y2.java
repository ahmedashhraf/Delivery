package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5057y2 extends C4681a3 {

    /* renamed from: N */
    private final /* synthetic */ C5070z2 f14531N;

    /* renamed from: a */
    private int f14532a = 0;

    /* renamed from: b */
    private final int f14533b = this.f14531N.mo18883a();

    C5057y2(C5070z2 z2Var) {
        this.f14531N = z2Var;
    }

    /* renamed from: a */
    public final byte mo18981a() {
        int i = this.f14532a;
        if (i < this.f14533b) {
            this.f14532a = i + 1;
            return this.f14531N.mo18884e(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f14532a < this.f14533b;
    }
}
