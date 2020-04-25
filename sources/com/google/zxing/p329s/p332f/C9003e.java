package com.google.zxing.p329s.p332f;

import com.google.zxing.p335u.C9043a;
import kotlin.p217i1.C14662d0;

/* renamed from: com.google.zxing.s.f.e */
/* compiled from: SimpleToken */
final class C9003e extends C9005g {

    /* renamed from: c */
    private final short f23545c;

    /* renamed from: d */
    private final short f23546d;

    C9003e(C9005g gVar, int i, int i2) {
        super(gVar);
        this.f23545c = (short) i;
        this.f23546d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32856a(C9043a aVar, byte[] bArr) {
        aVar.mo32966a(this.f23545c, this.f23546d);
    }

    public String toString() {
        short s = this.f23545c;
        short s2 = this.f23546d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s3 | (1 << this.f23546d)).substring(1));
        sb.append(C14662d0.f42854e);
        return sb.toString();
    }
}
