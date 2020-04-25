package com.google.zxing.p337v.p338c;

/* renamed from: com.google.zxing.v.c.b */
/* compiled from: DataBlock */
final class C9061b {

    /* renamed from: a */
    private final int f23727a;

    /* renamed from: b */
    private final byte[] f23728b;

    private C9061b(int i, byte[] bArr) {
        this.f23727a = i;
        this.f23728b = bArr;
    }

    /* renamed from: a */
    static C9061b[] m42397a(byte[] bArr, C9066e eVar) {
        C9069c c = eVar.mo33047c();
        C9068b[] a = c.mo33055a();
        int i = 0;
        for (C9068b a2 : a) {
            i += a2.mo33053a();
        }
        C9061b[] bVarArr = new C9061b[i];
        int length = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9068b bVar = a[i2];
            int i4 = i3;
            int i5 = 0;
            while (i5 < bVar.mo33053a()) {
                int b = bVar.mo33054b();
                int i6 = i4 + 1;
                bVarArr[i4] = new C9061b(b, new byte[(c.mo33056b() + b)]);
                i5++;
                i4 = i6;
            }
            i2++;
            i3 = i4;
        }
        int length2 = bVarArr[0].f23728b.length - c.mo33056b();
        int i7 = length2 - 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i9;
            int i11 = 0;
            while (i11 < i3) {
                int i12 = i10 + 1;
                bVarArr[i11].f23728b[i8] = bArr[i10];
                i11++;
                i10 = i12;
            }
            i8++;
            i9 = i10;
        }
        boolean z = eVar.mo33051g() == 24;
        int i13 = z ? 8 : i3;
        int i14 = i9;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i14 + 1;
            bVarArr[i15].f23728b[i7] = bArr[i14];
            i15++;
            i14 = i16;
        }
        int length3 = bVarArr[0].f23728b.length;
        while (length2 < length3) {
            int i17 = 0;
            while (i17 < i3) {
                int i18 = z ? (i17 + 8) % i3 : i17;
                int i19 = i14 + 1;
                bVarArr[i18].f23728b[(!z || i18 <= 7) ? length2 : length2 - 1] = bArr[i14];
                i17++;
                i14 = i19;
            }
            length2++;
        }
        if (i14 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33042b() {
        return this.f23727a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo33041a() {
        return this.f23728b;
    }
}
