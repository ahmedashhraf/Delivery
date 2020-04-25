package org.jcodec.codecs.h264.decode;

import org.jcodec.common.tools.MathUtil;

public class Intra16x16PredictionBuilder {
    public static void predictDC(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int i) {
        int i2;
        int i3;
        if (!z || !z2) {
            if (z) {
                i3 = 0;
                for (int i4 = 0; i4 < 16; i4++) {
                    i3 += iArr2[i4];
                }
            } else if (z2) {
                int i5 = 0;
                for (int i6 = 0; i6 < 16; i6++) {
                    i5 = i3 + iArr3[i + i6];
                }
            } else {
                i2 = 128;
            }
            i2 = (i3 + 8) >> 4;
        } else {
            int i7 = 0;
            for (int i8 = 0; i8 < 16; i8++) {
                i7 += iArr2[i8];
            }
            for (int i9 = 0; i9 < 16; i9++) {
                i7 += iArr3[i + i9];
            }
            i2 = (i7 + 16) >> 5;
        }
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = MathUtil.clip(iArr[i10] + i2, 0, 255);
        }
    }

    public static void predictHorizontal(int[] iArr, boolean z, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 16) {
            int i4 = i3;
            int i5 = 0;
            while (i5 < 16) {
                iArr[i4] = MathUtil.clip(iArr[i4] + iArr2[i2], 0, 255);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
    }

    public static void predictPlane(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 7) {
            int i4 = i2 + 1;
            i3 += (iArr3[(i + 8) + i2] - iArr3[(i + 6) - i2]) * i4;
            i2 = i4;
        }
        int i5 = i + 15;
        int i6 = i3 + ((iArr3[i5] - iArr4[0]) * 8);
        int i7 = 0;
        int i8 = 0;
        while (i7 < 7) {
            int i9 = i7 + 1;
            i8 += (iArr2[i7 + 8] - iArr2[6 - i7]) * i9;
            i7 = i9;
        }
        int i10 = (((i8 + ((iArr2[15] - iArr4[0]) * 8)) * 5) + 32) >> 6;
        int i11 = ((i6 * 5) + 32) >> 6;
        int i12 = (iArr2[15] + iArr3[i5]) * 16;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 16) {
            int i15 = i14;
            int i16 = 0;
            while (i16 < 16) {
                iArr[i15] = MathUtil.clip(iArr[i15] + MathUtil.clip((((((i16 - 7) * i11) + i12) + ((i13 - 7) * i10)) + 16) >> 5, 0, 255), 0, 255);
                i16++;
                i15++;
            }
            i13++;
            i14 = i15;
        }
    }

    public static void predictVertical(int[] iArr, boolean z, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 16) {
            int i4 = i3;
            int i5 = 0;
            while (i5 < 16) {
                iArr[i4] = MathUtil.clip(iArr[i4] + iArr2[i + i5], 0, 255);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
    }

    public static void predictWithMode(int i, int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, int i2) {
        if (i == 0) {
            predictVertical(iArr, z2, iArr3, i2);
        } else if (i == 1) {
            predictHorizontal(iArr, z, iArr2, i2);
        } else if (i == 2) {
            predictDC(iArr, z, z2, iArr2, iArr3, i2);
        } else if (i == 3) {
            predictPlane(iArr, z, z2, iArr2, iArr3, iArr4, i2);
        }
    }
}
