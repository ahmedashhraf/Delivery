package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.y.a */
/* compiled from: CodaBarReader */
public final class C9102a extends C9152r {

    /* renamed from: d */
    private static final float f23840d = 2.0f;

    /* renamed from: e */
    private static final float f23841e = 1.5f;

    /* renamed from: f */
    private static final String f23842f = "0123456789-$:/.+ABCD";

    /* renamed from: g */
    static final char[] f23843g = f23842f.toCharArray();

    /* renamed from: h */
    static final int[] f23844h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: i */
    private static final int f23845i = 3;

    /* renamed from: j */
    private static final char[] f23846j = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f23847a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f23848b = new int[80];

    /* renamed from: c */
    private int f23849c = 0;

    /* renamed from: b */
    private int m42572b(int i) {
        int i2 = i + 7;
        if (i2 >= this.f23849c) {
            return -1;
        }
        int[] iArr = this.f23848b;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f23844h;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: c */
    private void m42573c(int i) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f23847a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f23844h[this.f23847a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f23848b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / f23840d;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * f23840d) + f23841e) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f23844h[this.f23847a.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f23848b[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException {
        Arrays.fill(this.f23848b, 0);
        m42570a(aVar);
        int a = m42568a();
        this.f23847a.setLength(0);
        int i2 = a;
        do {
            int b = m42572b(i2);
            if (b != -1) {
                this.f23847a.append((char) b);
                i2 += 8;
                if (this.f23847a.length() > 1 && m42571a(f23846j, f23843g[b])) {
                    break;
                }
            } else {
                throw NotFoundException.m41712a();
            }
        } while (i2 < this.f23849c);
        int i3 = i2 - 1;
        int i4 = this.f23848b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f23848b[i2 + i6];
        }
        if (i2 >= this.f23849c || i4 >= i5 / 2) {
            m42573c(a);
            for (int i7 = 0; i7 < this.f23847a.length(); i7++) {
                StringBuilder sb = this.f23847a;
                sb.setCharAt(i7, f23843g[sb.charAt(i7)]);
            }
            if (m42571a(f23846j, this.f23847a.charAt(0))) {
                StringBuilder sb2 = this.f23847a;
                if (!m42571a(f23846j, sb2.charAt(sb2.length() - 1))) {
                    throw NotFoundException.m41712a();
                } else if (this.f23847a.length() > 3) {
                    if (map == null || !map.containsKey(C8974d.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.f23847a;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.f23847a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < a; i9++) {
                        i8 += this.f23848b[i9];
                    }
                    float f = (float) i8;
                    while (a < i3) {
                        i8 += this.f23848b[a];
                        a++;
                    }
                    float f2 = (float) i8;
                    float f3 = (float) i;
                    return new C8985n(this.f23847a.toString(), null, new C8987p[]{new C8987p(f, f3), new C8987p(f2, f3)}, C8929a.CODABAR);
                } else {
                    throw NotFoundException.m41712a();
                }
            } else {
                throw NotFoundException.m41712a();
            }
        } else {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private void m42570a(C9043a aVar) throws NotFoundException {
        int i = 0;
        this.f23849c = 0;
        int d = aVar.mo32980d(0);
        int d2 = aVar.mo32979d();
        if (d < d2) {
            boolean z = true;
            while (d < d2) {
                if (aVar.mo32974b(d) ^ z) {
                    i++;
                } else {
                    m42569a(i);
                    z = !z;
                    i = 1;
                }
                d++;
            }
            m42569a(i);
            return;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private void m42569a(int i) {
        int[] iArr = this.f23848b;
        int i2 = this.f23849c;
        iArr[i2] = i;
        this.f23849c = i2 + 1;
        int i3 = this.f23849c;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f23848b = iArr2;
        }
    }

    /* renamed from: a */
    private int m42568a() throws NotFoundException {
        for (int i = 1; i < this.f23849c; i += 2) {
            int b = m42572b(i);
            if (b != -1 && m42571a(f23846j, f23843g[b])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f23848b[i3];
                }
                if (i == 1 || this.f23848b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    static boolean m42571a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
