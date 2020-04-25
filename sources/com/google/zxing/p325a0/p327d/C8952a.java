package com.google.zxing.p325a0.p327d;

import com.google.zxing.C8987p;

/* renamed from: com.google.zxing.a0.d.a */
/* compiled from: AlignmentPattern */
public final class C8952a extends C8987p {

    /* renamed from: c */
    private final float f23399c;

    C8952a(float f, float f2, float f3) {
        super(f, f2);
        this.f23399c = f3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32711a(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32831b()) > f || Math.abs(f3 - mo32830a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f23399c);
        if (abs <= 1.0f || abs <= this.f23399c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8952a mo32712b(float f, float f2, float f3) {
        return new C8952a((mo32830a() + f2) / 2.0f, (mo32831b() + f) / 2.0f, (this.f23399c + f3) / 2.0f);
    }
}
