package com.google.zxing.p325a0.p326c;

/* renamed from: com.google.zxing.a0.c.f */
/* compiled from: ErrorCorrectionLevel */
public enum C8945f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final C8945f[] FOR_BITS = null;
    private final int bits;

    static {
        C8945f fVar;
        C8945f fVar2;
        C8945f fVar3;
        C8945f fVar4;
        FOR_BITS = new C8945f[]{fVar2, fVar, fVar4, fVar3};
    }

    private C8945f(int i) {
        this.bits = i;
    }

    /* renamed from: a */
    public static C8945f m41755a(int i) {
        if (i >= 0) {
            C8945f[] fVarArr = FOR_BITS;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public int mo32689d() {
        return this.bits;
    }
}
