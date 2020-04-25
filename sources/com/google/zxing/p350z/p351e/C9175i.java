package com.google.zxing.p350z.p351e;

import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p350z.C9161a;
import java.lang.reflect.Array;

/* renamed from: com.google.zxing.z.e.i */
/* compiled from: PDF417CodewordDecoder */
final class C9175i {

    /* renamed from: a */
    private static final float[][] f24101a = ((float[][]) Array.newInstance(float.class, new int[]{C9161a.f24038i.length, 8}));

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C9161a.f24038i;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = i3;
                int i6 = 0;
                while (i6 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i5 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i5 >>= 1;
                    }
                    f24101a[i2][(8 - i6) - 1] = f / 17.0f;
                    i6++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private C9175i() {
    }

    /* renamed from: a */
    private static int m42899a(int[] iArr) {
        long j = 0;
        int i = 0;
        while (i < iArr.length) {
            long j2 = j;
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j3 = j2 << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j2 = j3 | ((long) i3);
            }
            i++;
            j = j2;
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m42900b(int[] iArr) {
        int a = C9055a.m42371a(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) a);
        }
        int i2 = -1;
        int i3 = 0;
        float f = Float.MAX_VALUE;
        while (true) {
            float[][] fArr2 = f24101a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C9161a.f24038i[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m42901c(int[] iArr) {
        int a = m42899a(iArr);
        if (C9161a.m42807a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m42902d(int[] iArr) {
        int c = m42901c(m42903e(iArr));
        if (c != -1) {
            return c;
        }
        return m42900b(iArr);
    }

    /* renamed from: e */
    private static int[] m42903e(int[] iArr) {
        float a = (float) C9055a.m42371a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (a / 34.0f) + ((((float) i3) * a) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
