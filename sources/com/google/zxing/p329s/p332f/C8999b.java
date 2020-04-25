package com.google.zxing.p329s.p332f;

import com.google.zxing.p335u.C9043a;
import kotlin.p217i1.C14662d0;

/* renamed from: com.google.zxing.s.f.b */
/* compiled from: BinaryShiftToken */
final class C8999b extends C9005g {

    /* renamed from: c */
    private final short f23527c;

    /* renamed from: d */
    private final short f23528d;

    C8999b(C9005g gVar, int i, int i2) {
        super(gVar);
        this.f23527c = (short) i;
        this.f23528d = (short) i2;
    }

    /* renamed from: a */
    public void mo32856a(C9043a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f23528d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo32966a(31, 5);
                    short s2 = this.f23528d;
                    if (s2 > 62) {
                        aVar.mo32966a(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo32966a(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo32966a(s2 - 31, 5);
                    }
                }
                aVar.mo32966a(bArr[this.f23527c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f23527c);
        sb.append("::");
        sb.append((this.f23527c + this.f23528d) - 1);
        sb.append(C14662d0.f42854e);
        return sb.toString();
    }
}
