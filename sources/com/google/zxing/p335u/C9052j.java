package com.google.zxing.p335u;

import com.google.zxing.C8968b;
import com.google.zxing.C8978h;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* renamed from: com.google.zxing.u.j */
/* compiled from: HybridBinarizer */
public final class C9052j extends C9050h {

    /* renamed from: i */
    private static final int f23689i = 3;

    /* renamed from: j */
    private static final int f23690j = 8;

    /* renamed from: k */
    private static final int f23691k = 7;

    /* renamed from: l */
    private static final int f23692l = 40;

    /* renamed from: m */
    private static final int f23693m = 24;

    /* renamed from: h */
    private C9044b f23694h;

    public C9052j(C8978h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    private static int m42354a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public C9044b mo32760a() throws NotFoundException {
        C9044b bVar = this.f23694h;
        if (bVar != null) {
            return bVar;
        }
        C8978h c = mo32762c();
        int c2 = c.mo32812c();
        int a = c.mo32811a();
        if (c2 < 40 || a < 40) {
            this.f23694h = super.mo32760a();
        } else {
            byte[] b = c.mo32805b();
            int i = c2 >> 3;
            if ((c2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] a2 = m42357a(b, i2, i4, c2, a);
            C9044b bVar2 = new C9044b(c2, a);
            m42356a(b, i2, i4, c2, a, a2, bVar2);
            this.f23694h = bVar2;
        }
        return this.f23694h;
    }

    /* renamed from: a */
    public C8968b mo32758a(C8978h hVar) {
        return new C9052j(hVar);
    }

    /* renamed from: a */
    private static void m42356a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C9044b bVar) {
        int i5 = i;
        int i6 = i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 <= i12) {
                    i12 = i11;
                }
                int a = m42354a(i10, 2, i5 - 3);
                int a2 = m42354a(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[a2 + i14];
                    i13 += iArr2[a - 2] + iArr2[a - 1] + iArr2[a] + iArr2[a + 1] + iArr2[a + 2];
                }
                m42355a(bArr, i12, i8, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m42355a(byte[] bArr, int i, int i2, int i3, int i4, C9044b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo32996c(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    private static int[][] m42357a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i6, i5});
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 > i12) {
                    i11 = i12;
                }
                int i13 = (i8 * i3) + i11;
                int i14 = 0;
                int i15 = 0;
                byte b = 0;
                byte b2 = 255;
                while (i14 < 8) {
                    int i16 = i15;
                    for (int i17 = 0; i17 < 8; i17++) {
                        byte b3 = bArr[i13 + i17] & 255;
                        i16 += b3;
                        if (b3 < b2) {
                            b2 = b3;
                        }
                        if (b3 > b) {
                            b = b3;
                        }
                    }
                    if (b - b2 <= 24) {
                        i15 = i16;
                        i14++;
                        i13 += i3;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 >= 8) {
                            break;
                        }
                        for (int i18 = 0; i18 < 8; i18++) {
                            i16 += bArr[i13 + i18] & 255;
                        }
                    }
                    i15 = i16;
                    i14++;
                    i13 += i3;
                }
                int i19 = i15 >> 6;
                if (b - b2 <= 24) {
                    i19 = b2 / 2;
                    if (i7 > 0 && i10 > 0) {
                        int i20 = i7 - 1;
                        int i21 = i10 - 1;
                        int i22 = ((iArr[i20][i10] + (iArr[i7][i21] * 2)) + iArr[i20][i21]) / 4;
                        if (b2 < i22) {
                            i19 = i22;
                        }
                    }
                }
                iArr[i7][i10] = i19;
            }
        }
        return iArr;
    }
}
