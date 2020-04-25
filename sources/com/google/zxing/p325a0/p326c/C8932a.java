package com.google.zxing.p325a0.p326c;

import com.google.zxing.FormatException;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.a0.c.a */
/* compiled from: BitMatrixParser */
final class C8932a {

    /* renamed from: a */
    private final C9044b f23371a;

    /* renamed from: b */
    private C8949j f23372b;

    /* renamed from: c */
    private C8946g f23373c;

    /* renamed from: d */
    private boolean f23374d;

    C8932a(C9044b bVar) throws FormatException {
        int e = bVar.mo33001e();
        if (e < 21 || (e & 3) != 1) {
            throw FormatException.m41710a();
        }
        this.f23371a = bVar;
    }

    /* renamed from: a */
    private int m41721a(int i, int i2, int i3) {
        return this.f23374d ? this.f23371a.mo32995b(i2, i) : this.f23371a.mo32995b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte[] mo32677b() throws FormatException {
        C8946g c = mo32678c();
        C8949j d = mo32679d();
        C8934c cVar = C8934c.values()[c.mo32690a()];
        int e = this.f23371a.mo33001e();
        cVar.mo32683a(this.f23371a, e);
        C9044b a = d.mo32699a();
        byte[] bArr = new byte[d.mo32702d()];
        int i = e - 1;
        int i2 = i;
        int i3 = 0;
        boolean z = true;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            int i6 = i5;
            int i7 = i4;
            int i8 = i3;
            int i9 = 0;
            while (i9 < e) {
                int i10 = z ? i - i9 : i9;
                int i11 = i6;
                int i12 = i7;
                int i13 = i8;
                for (int i14 = 0; i14 < 2; i14++) {
                    int i15 = i2 - i14;
                    if (!a.mo32995b(i15, i10)) {
                        i12++;
                        int i16 = i11 << 1;
                        int i17 = this.f23371a.mo32995b(i15, i10) ? i16 | 1 : i16;
                        if (i12 == 8) {
                            int i18 = i13 + 1;
                            bArr[i13] = (byte) i17;
                            i13 = i18;
                            i12 = 0;
                            i11 = 0;
                        } else {
                            i11 = i17;
                        }
                    }
                }
                i9++;
                i8 = i13;
                i7 = i12;
                i6 = i11;
            }
            z = !z;
            i2 -= 2;
            i3 = i8;
            i4 = i7;
            i5 = i6;
        }
        if (i3 == d.mo32702d()) {
            return bArr;
        }
        throw FormatException.m41710a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8946g mo32678c() throws FormatException {
        C8946g gVar = this.f23373c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m41721a(i3, 8, i2);
        }
        int a = m41721a(8, 7, m41721a(8, 8, m41721a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m41721a(8, i4, a);
        }
        int e = this.f23371a.mo33001e();
        int i5 = e - 7;
        for (int i6 = e - 1; i6 >= i5; i6--) {
            i = m41721a(8, i6, i);
        }
        for (int i7 = e - 8; i7 < e; i7++) {
            i = m41721a(i7, 8, i);
        }
        this.f23373c = C8946g.m41757a(a, i);
        C8946g gVar2 = this.f23373c;
        if (gVar2 != null) {
            return gVar2;
        }
        throw FormatException.m41710a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8949j mo32679d() throws FormatException {
        C8949j jVar = this.f23372b;
        if (jVar != null) {
            return jVar;
        }
        int e = this.f23371a.mo33001e();
        int i = (e - 17) / 4;
        if (i <= 6) {
            return C8949j.m41769c(i);
        }
        int i2 = e - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = e - 9; i6 >= i2; i6--) {
                i4 = m41721a(i6, i5, i4);
            }
        }
        C8949j a = C8949j.m41767a(i4);
        if (a == null || a.mo32701c() != e) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = e - 9; i8 >= i2; i8--) {
                    i3 = m41721a(i7, i8, i3);
                }
            }
            C8949j a2 = C8949j.m41767a(i3);
            if (a2 == null || a2.mo32701c() != e) {
                throw FormatException.m41710a();
            }
            this.f23372b = a2;
            return a2;
        }
        this.f23372b = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo32680e() {
        if (this.f23373c != null) {
            C8934c.values()[this.f23373c.mo32690a()].mo32683a(this.f23371a, this.f23371a.mo33001e());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32676a(boolean z) {
        this.f23372b = null;
        this.f23373c = null;
        this.f23374d = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32675a() {
        int i = 0;
        while (i < this.f23371a.mo33005h()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f23371a.mo33001e(); i3++) {
                if (this.f23371a.mo32995b(i, i3) != this.f23371a.mo32995b(i3, i)) {
                    this.f23371a.mo32990a(i3, i);
                    this.f23371a.mo32990a(i, i3);
                }
            }
            i = i2;
        }
    }
}
