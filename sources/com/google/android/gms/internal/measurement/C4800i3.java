package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4800i3 {

    /* renamed from: a */
    private final zzek f14181a;

    /* renamed from: b */
    private final byte[] f14182b;

    private C4800i3(int i) {
        this.f14182b = new byte[i];
        this.f14181a = zzek.m21923a(this.f14182b);
    }

    /* renamed from: a */
    public final C5070z2 mo19040a() {
        this.f14181a.mo19795b();
        return new C4832k3(this.f14182b);
    }

    /* renamed from: b */
    public final zzek mo19041b() {
        return this.f14181a;
    }

    /* synthetic */ C4800i3(int i, C5057y2 y2Var) {
        this(i);
    }
}
