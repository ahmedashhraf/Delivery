package com.google.zxing.p325a0.p326c;

import com.google.zxing.C8987p;

/* renamed from: com.google.zxing.a0.c.i */
/* compiled from: QRCodeDecoderMetaData */
public final class C8948i {

    /* renamed from: a */
    private final boolean f23388a;

    C8948i(boolean z) {
        this.f23388a = z;
    }

    /* renamed from: a */
    public boolean mo32697a() {
        return this.f23388a;
    }

    /* renamed from: a */
    public void mo32696a(C8987p[] pVarArr) {
        if (this.f23388a && pVarArr != null && pVarArr.length >= 3) {
            C8987p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
