package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.Map;

/* renamed from: com.google.zxing.y.n */
/* compiled from: ITFReader */
public final class C9148n extends C9152r {

    /* renamed from: b */
    private static final float f23997b = 0.38f;

    /* renamed from: c */
    private static final float f23998c = 0.78f;

    /* renamed from: d */
    private static final int f23999d = 3;

    /* renamed from: e */
    private static final int f24000e = 1;

    /* renamed from: f */
    private static final int[] f24001f = {6, 8, 10, 12, 14};

    /* renamed from: g */
    private static final int[] f24002g = {1, 1, 1, 1};

    /* renamed from: h */
    private static final int[] f24003h = {1, 1, 3};

    /* renamed from: i */
    static final int[][] f24004i = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f24005a = -1;

    /* renamed from: b */
    private int[] m42754b(C9043a aVar) throws NotFoundException {
        int[] c = m42756c(aVar, m42755c(aVar), f24002g);
        this.f24005a = (c[1] - c[0]) / 4;
        m42751a(aVar, c[0]);
        return c;
    }

    /* renamed from: c */
    private static int m42755c(C9043a aVar) throws NotFoundException {
        int d = aVar.mo32979d();
        int c = aVar.mo32975c(0);
        if (c != d) {
            return c;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws FormatException, NotFoundException {
        boolean z;
        int[] b = m42754b(aVar);
        int[] a = m42753a(aVar);
        StringBuilder sb = new StringBuilder(20);
        m42752a(aVar, b[1], a[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C8974d.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f24001f;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C8985n(sb2, null, new C8987p[]{new C8987p((float) b[1], f), new C8987p((float) a[0], f)}, C8929a.ITF);
        }
        throw FormatException.m41710a();
    }

    /* renamed from: c */
    private static int[] m42756c(C9043a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int d = aVar.mo32979d();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < d) {
            if (aVar.mo32974b(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C9152r.m42762a(iArr2, iArr, (float) f23998c) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static void m42752a(C9043a aVar, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C9152r.m42763a(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m42750a(iArr2) + 48));
            sb.append((char) (m42750a(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: a */
    private void m42751a(C9043a aVar, int i) throws NotFoundException {
        int i2 = this.f24005a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo32974b(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw NotFoundException.m41712a();
        }
    }

    /* renamed from: a */
    private int[] m42753a(C9043a aVar) throws NotFoundException {
        aVar.mo32984f();
        try {
            int[] c = m42756c(aVar, m42755c(aVar), f24003h);
            m42751a(aVar, c[0]);
            int i = c[0];
            c[0] = aVar.mo32979d() - c[1];
            c[1] = aVar.mo32979d() - i;
            return c;
        } finally {
            aVar.mo32984f();
        }
    }

    /* renamed from: a */
    private static int m42750a(int[] iArr) throws NotFoundException {
        int length = f24004i.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float a = C9152r.m42762a(iArr, f24004i[i2], (float) f23998c);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.m41712a();
    }
}
