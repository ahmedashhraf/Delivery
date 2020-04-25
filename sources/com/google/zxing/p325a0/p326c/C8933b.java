package com.google.zxing.p325a0.p326c;

import com.google.zxing.p325a0.p326c.C8949j.C8950a;
import com.google.zxing.p325a0.p326c.C8949j.C8951b;

/* renamed from: com.google.zxing.a0.c.b */
/* compiled from: DataBlock */
final class C8933b {

    /* renamed from: a */
    private final int f23375a;

    /* renamed from: b */
    private final byte[] f23376b;

    private C8933b(int i, byte[] bArr) {
        this.f23375a = i;
        this.f23376b = bArr;
    }

    /* renamed from: a */
    static C8933b[] m41728a(byte[] bArr, C8949j jVar, C8945f fVar) {
        if (bArr.length == jVar.mo32702d()) {
            C8951b a = jVar.mo32698a(fVar);
            C8950a[] a2 = a.mo32707a();
            int i = 0;
            for (C8950a a3 : a2) {
                i += a3.mo32705a();
            }
            C8933b[] bVarArr = new C8933b[i];
            int length = a2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                C8950a aVar = a2[i2];
                int i4 = i3;
                int i5 = 0;
                while (i5 < aVar.mo32705a()) {
                    int b = aVar.mo32706b();
                    int i6 = i4 + 1;
                    bVarArr[i4] = new C8933b(b, new byte[(a.mo32708b() + b)]);
                    i5++;
                    i4 = i6;
                }
                i2++;
                i3 = i4;
            }
            int length2 = bVarArr[0].f23376b.length;
            int length3 = bVarArr.length - 1;
            while (length3 >= 0 && bVarArr[length3].f23376b.length != length2) {
                length3--;
            }
            int i7 = length3 + 1;
            int b2 = length2 - a.mo32708b();
            int i8 = 0;
            int i9 = 0;
            while (i8 < b2) {
                int i10 = i9;
                int i11 = 0;
                while (i11 < i3) {
                    int i12 = i10 + 1;
                    bVarArr[i11].f23376b[i8] = bArr[i10];
                    i11++;
                    i10 = i12;
                }
                i8++;
                i9 = i10;
            }
            int i13 = i7;
            while (i13 < i3) {
                int i14 = i9 + 1;
                bVarArr[i13].f23376b[b2] = bArr[i9];
                i13++;
                i9 = i14;
            }
            int length4 = bVarArr[0].f23376b.length;
            while (b2 < length4) {
                int i15 = i9;
                int i16 = 0;
                while (i16 < i3) {
                    int i17 = i15 + 1;
                    bVarArr[i16].f23376b[i16 < i7 ? b2 : b2 + 1] = bArr[i15];
                    i16++;
                    i15 = i17;
                }
                b2++;
                i9 = i15;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo32682b() {
        return this.f23375a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo32681a() {
        return this.f23376b;
    }
}
