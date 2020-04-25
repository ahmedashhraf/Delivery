package com.google.zxing.p335u;

import com.google.zxing.C8968b;
import com.google.zxing.C8978h;
import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.u.h */
/* compiled from: GlobalHistogramBinarizer */
public class C9050h extends C8968b {

    /* renamed from: d */
    private static final int f23682d = 5;

    /* renamed from: e */
    private static final int f23683e = 3;

    /* renamed from: f */
    private static final int f23684f = 32;

    /* renamed from: g */
    private static final byte[] f23685g = new byte[0];

    /* renamed from: b */
    private byte[] f23686b = f23685g;

    /* renamed from: c */
    private final int[] f23687c = new int[32];

    public C9050h(C8978h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public C9043a mo32759a(int i, C9043a aVar) throws NotFoundException {
        C8978h c = mo32762c();
        int c2 = c.mo32812c();
        if (aVar == null || aVar.mo32979d() < c2) {
            aVar = new C9043a(c2);
        } else {
            aVar.mo32971b();
        }
        m42345a(c2);
        byte[] a = c.mo32804a(i, this.f23686b);
        int[] iArr = this.f23687c;
        for (int i2 = 0; i2 < c2; i2++) {
            int i3 = (a[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int a2 = m42344a(iArr);
        if (c2 < 3) {
            for (int i4 = 0; i4 < c2; i4++) {
                if ((a[i4] & 255) < a2) {
                    aVar.mo32982e(i4);
                }
            }
        } else {
            byte b = a[1] & 255;
            byte b2 = a[0] & 255;
            int i5 = 1;
            while (i5 < c2 - 1) {
                int i6 = i5 + 1;
                byte b3 = a[i6] & 255;
                if ((((b << 2) - b2) - b3) / 2 < a2) {
                    aVar.mo32982e(i5);
                }
                b2 = b;
                i5 = i6;
                b = b3;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C9044b mo32760a() throws NotFoundException {
        C8978h c = mo32762c();
        int c2 = c.mo32812c();
        int a = c.mo32811a();
        C9044b bVar = new C9044b(c2, a);
        m42345a(c2);
        int[] iArr = this.f23687c;
        for (int i = 1; i < 5; i++) {
            byte[] a2 = c.mo32804a((a * i) / 5, this.f23686b);
            int i2 = (c2 << 2) / 5;
            for (int i3 = c2 / 5; i3 < i2; i3++) {
                int i4 = (a2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a3 = m42344a(iArr);
        byte[] b = c.mo32805b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * c2;
            for (int i7 = 0; i7 < c2; i7++) {
                if ((b[i6 + i7] & 255) < a3) {
                    bVar.mo32996c(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public C8968b mo32758a(C8978h hVar) {
        return new C9050h(hVar);
    }

    /* renamed from: a */
    private void m42345a(int i) {
        if (this.f23686b.length < i) {
            this.f23686b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f23687c[i2] = 0;
        }
    }

    /* renamed from: a */
    private static int m42344a(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 > i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i5 - i3 > length / 16) {
            int i11 = i5 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i3) {
                int i14 = i11 - i3;
                int i15 = i14 * i14 * (i5 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw NotFoundException.m41712a();
    }
}
