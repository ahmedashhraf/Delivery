package org.jcodec.codecs.h264.decode;

import org.jcodec.common.tools.MathUtil;

public class ChromaPredictionBuilder {
    public static void predictDC(int[] iArr, int i, boolean z, boolean z2, int[] iArr2, int[] iArr3) {
        predictDCInside(iArr, 0, 0, i, z, z2, iArr2, iArr3);
        predictDCTopBorder(iArr, 1, 0, i, z, z2, iArr2, iArr3);
        predictDCLeftBorder(iArr, 0, 1, i, z, z2, iArr2, iArr3);
        predictDCInside(iArr, 1, 1, i, z, z2, iArr2, iArr3);
    }

    public static void predictDCInside(int[] iArr, int i, int i2, int i3, boolean z, boolean z2, int[] iArr2, int[] iArr3) {
        int i4;
        int i5 = i << 2;
        int i6 = (i3 << 3) + i5;
        int i7 = i2 << 2;
        if (z && z2) {
            int i8 = 0;
            for (int i9 = 0; i9 < 4; i9++) {
                i8 += iArr2[i9 + i7];
            }
            for (int i10 = 0; i10 < 4; i10++) {
                i8 += iArr3[i6 + i10];
            }
            i4 = (i8 + 4) >> 3;
        } else if (z) {
            int i11 = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                i11 += iArr2[i7 + i12];
            }
            i4 = (i11 + 2) >> 2;
        } else if (z2) {
            int i13 = 0;
            for (int i14 = 0; i14 < 4; i14++) {
                i13 += iArr3[i6 + i14];
            }
            i4 = (i13 + 2) >> 2;
        } else {
            i4 = 128;
        }
        int i15 = (i2 << 5) + i5;
        int i16 = 0;
        while (i16 < 4) {
            iArr[i15] = MathUtil.clip(iArr[i15] + i4, 0, 255);
            int i17 = i15 + 1;
            iArr[i17] = MathUtil.clip(iArr[i17] + i4, 0, 255);
            int i18 = i15 + 2;
            iArr[i18] = MathUtil.clip(iArr[i18] + i4, 0, 255);
            int i19 = i15 + 3;
            iArr[i19] = MathUtil.clip(iArr[i19] + i4, 0, 255);
            i16++;
            i15 += 8;
        }
    }

    public static void predictDCLeftBorder(int[] iArr, int i, int i2, int i3, boolean z, boolean z2, int[] iArr2, int[] iArr3) {
        int i4;
        int i5 = i << 2;
        int i6 = (i3 << 3) + i5;
        int i7 = i2 << 2;
        if (z) {
            int i8 = 0;
            for (int i9 = 0; i9 < 4; i9++) {
                i8 += iArr2[i7 + i9];
            }
            i4 = (i8 + 2) >> 2;
        } else if (z2) {
            int i10 = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                i10 += iArr3[i6 + i11];
            }
            i4 = (i10 + 2) >> 2;
        } else {
            i4 = 128;
        }
        int i12 = (i2 << 5) + i5;
        int i13 = 0;
        while (i13 < 4) {
            iArr[i12] = MathUtil.clip(iArr[i12] + i4, 0, 255);
            int i14 = i12 + 1;
            iArr[i14] = MathUtil.clip(iArr[i14] + i4, 0, 255);
            int i15 = i12 + 2;
            iArr[i15] = MathUtil.clip(iArr[i15] + i4, 0, 255);
            int i16 = i12 + 3;
            iArr[i16] = MathUtil.clip(iArr[i16] + i4, 0, 255);
            i13++;
            i12 += 8;
        }
    }

    public static void predictDCTopBorder(int[] iArr, int i, int i2, int i3, boolean z, boolean z2, int[] iArr2, int[] iArr3) {
        int i4;
        int i5 = i << 2;
        int i6 = (i3 << 3) + i5;
        int i7 = i2 << 2;
        if (z2) {
            int i8 = 0;
            for (int i9 = 0; i9 < 4; i9++) {
                i8 += iArr3[i6 + i9];
            }
            i4 = (i8 + 2) >> 2;
        } else if (z) {
            int i10 = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                i10 += iArr2[i7 + i11];
            }
            i4 = (i10 + 2) >> 2;
        } else {
            i4 = 128;
        }
        int i12 = (i2 << 5) + i5;
        int i13 = 0;
        while (i13 < 4) {
            iArr[i12] = MathUtil.clip(iArr[i12] + i4, 0, 255);
            int i14 = i12 + 1;
            iArr[i14] = MathUtil.clip(iArr[i14] + i4, 0, 255);
            int i15 = i12 + 2;
            iArr[i15] = MathUtil.clip(iArr[i15] + i4, 0, 255);
            int i16 = i12 + 3;
            iArr[i16] = MathUtil.clip(iArr[i16] + i4, 0, 255);
            i13++;
            i12 += 8;
        }
    }

    public static void predictHorizontal(int[] iArr, int i, boolean z, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            int i4 = i3;
            int i5 = 0;
            while (i5 < 8) {
                iArr[i4] = MathUtil.clip(iArr[i4] + iArr2[i2], 0, 255);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
    }

    public static void predictPlane(int[] iArr, int i, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i2 = i << 3;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 3) {
            int i5 = i3 + 1;
            i4 += (iArr3[(i2 + 4) + i3] - iArr3[(i2 + 2) - i3]) * i5;
            i3 = i5;
        }
        int i6 = i2 + 7;
        int i7 = i4 + ((iArr3[i6] - iArr4[0]) * 4);
        int i8 = 0;
        int i9 = 0;
        while (i8 < 3) {
            int i10 = i8 + 1;
            i9 += (iArr2[i8 + 4] - iArr2[2 - i8]) * i10;
            i8 = i10;
        }
        int i11 = (((i9 + ((iArr2[7] - iArr4[0]) * 4)) * 34) + 32) >> 6;
        int i12 = ((i7 * 34) + 32) >> 6;
        int i13 = (iArr2[7] + iArr3[i6]) * 16;
        int i14 = 0;
        int i15 = 0;
        while (i14 < 8) {
            int i16 = i15;
            int i17 = 0;
            while (i17 < 8) {
                iArr[i16] = MathUtil.clip(iArr[i16] + MathUtil.clip((((((i17 - 3) * i12) + i13) + ((i14 - 3) * i11)) + 16) >> 5, 0, 255), 0, 255);
                i17++;
                i16++;
            }
            i14++;
            i15 = i16;
        }
    }

    public static void predictVertical(int[] iArr, int i, boolean z, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            int i4 = i3;
            int i5 = 0;
            while (i5 < 8) {
                iArr[i4] = MathUtil.clip(iArr[i4] + iArr2[(i << 3) + i5], 0, 255);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
    }

    public static void predictWithMode(int[] iArr, int i, int i2, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4) {
        if (i == 0) {
            predictDC(iArr, i2, z, z2, iArr2, iArr3);
        } else if (i == 1) {
            predictHorizontal(iArr, i2, z, iArr2);
        } else if (i == 2) {
            predictVertical(iArr, i2, z2, iArr3);
        } else if (i == 3) {
            predictPlane(iArr, i2, z, z2, iArr2, iArr3, iArr4);
        }
    }
}
