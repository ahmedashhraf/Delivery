package org.jcodec.codecs.h264.decode;

import org.jcodec.common.tools.MathUtil;

public class Intra4x4PredictionBuilder {
    public static void predictDC(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (!z || !z2) {
            if (z) {
                i5 = iArr2[i3] + iArr2[i3 + 1] + iArr2[i3 + 2];
                i6 = iArr2[i3 + 3];
            } else if (z2) {
                int i7 = i + i2;
                i5 = iArr3[i7] + iArr3[i7 + 1] + iArr3[i7 + 2];
                i6 = iArr3[i7 + 3];
            } else {
                i4 = 128;
            }
            i4 = ((i5 + i6) + 2) >> 2;
        } else {
            int i8 = i + i2;
            i4 = ((((((((iArr2[i3] + iArr2[i3 + 1]) + iArr2[i3 + 2]) + iArr2[i3 + 3]) + iArr3[i8]) + iArr3[i8 + 1]) + iArr3[i8 + 2]) + iArr3[i8 + 3]) + 4) >> 3;
        }
        int i9 = (i3 << 4) + i2;
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i9] = MathUtil.clip(iArr[i9] + i4, 0, 255);
            int i11 = i9 + 1;
            iArr[i11] = MathUtil.clip(iArr[i11] + i4, 0, 255);
            int i12 = i9 + 2;
            iArr[i12] = MathUtil.clip(iArr[i12] + i4, 0, 255);
            int i13 = i9 + 3;
            iArr[i13] = MathUtil.clip(iArr[i13] + i4, 0, 255);
            i9 += 16;
        }
    }

    public static void predictDiagonalDownLeft(int[] iArr, boolean z, boolean z2, int[] iArr2, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = i4 + 3;
        int i6 = iArr2[i5];
        int i7 = iArr2[i5];
        int i8 = iArr2[i5];
        int i9 = iArr2[i5];
        if (z2) {
            i6 = iArr2[i4 + 4];
            i7 = iArr2[i4 + 5];
            i8 = iArr2[i4 + 6];
            i9 = iArr2[i4 + 7];
        }
        int i10 = i4 + 2;
        int i11 = i4 + 1;
        int i12 = (((iArr2[i4] + iArr2[i10]) + (iArr2[i11] * 2)) + 2) >> 2;
        int i13 = (((iArr2[i11] + iArr2[i5]) + (iArr2[i10] * 2)) + 2) >> 2;
        int i14 = (((iArr2[i10] + i6) + (iArr2[i5] * 2)) + 2) >> 2;
        int i15 = (((iArr2[i5] + i7) + (i6 * 2)) + 2) >> 2;
        int i16 = (((i6 + i8) + (i7 * 2)) + 2) >> 2;
        int i17 = (((i7 + i9) + (i8 * 2)) + 2) >> 2;
        int i18 = ((i8 + (i9 * 3)) + 2) >> 2;
        int i19 = (i3 << 4) + i2;
        iArr[i19] = MathUtil.clip(iArr[i19] + i12, 0, 255);
        int i20 = i19 + 1;
        iArr[i20] = MathUtil.clip(iArr[i20] + i13, 0, 255);
        int i21 = i19 + 2;
        iArr[i21] = MathUtil.clip(iArr[i21] + i14, 0, 255);
        int i22 = i19 + 3;
        iArr[i22] = MathUtil.clip(iArr[i22] + i15, 0, 255);
        int i23 = i19 + 16;
        iArr[i23] = MathUtil.clip(iArr[i23] + i13, 0, 255);
        int i24 = i19 + 17;
        iArr[i24] = MathUtil.clip(iArr[i24] + i14, 0, 255);
        int i25 = i19 + 18;
        iArr[i25] = MathUtil.clip(iArr[i25] + i15, 0, 255);
        int i26 = i19 + 19;
        iArr[i26] = MathUtil.clip(iArr[i26] + i16, 0, 255);
        int i27 = i19 + 32;
        iArr[i27] = MathUtil.clip(iArr[i27] + i14, 0, 255);
        int i28 = i19 + 33;
        iArr[i28] = MathUtil.clip(iArr[i28] + i15, 0, 255);
        int i29 = i19 + 34;
        iArr[i29] = MathUtil.clip(iArr[i29] + i16, 0, 255);
        int i30 = i19 + 35;
        iArr[i30] = MathUtil.clip(iArr[i30] + i17, 0, 255);
        int i31 = i19 + 48;
        iArr[i31] = MathUtil.clip(iArr[i31] + i15, 0, 255);
        int i32 = i19 + 49;
        iArr[i32] = MathUtil.clip(iArr[i32] + i16, 0, 255);
        int i33 = i19 + 50;
        iArr[i33] = MathUtil.clip(iArr[i33] + i17, 0, 255);
        int i34 = i19 + 51;
        iArr[i34] = MathUtil.clip(iArr[i34] + i18, 0, 255);
    }

    public static void predictDiagonalDownRight(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = (i3 << 4) + i2;
        for (int i11 = 0; i11 < 4; i11++) {
            for (int i12 = 0; i12 < 4; i12++) {
                if (i12 > i11) {
                    int i13 = i12 - i11;
                    if (i13 - 2 == -1) {
                        i7 = iArr4[i3 >> 2];
                    } else {
                        i7 = iArr3[(((i + i2) + i12) - i11) - 2];
                    }
                    if (i13 - 1 == -1) {
                        i8 = iArr4[i3 >> 2];
                    } else {
                        i8 = iArr3[(((i + i2) + i12) - i11) - 1];
                    }
                    if (i13 == -1) {
                        i9 = iArr4[i3 >> 2];
                    } else {
                        i9 = iArr3[((i + i2) + i12) - i11];
                    }
                    int i14 = i10 + i12;
                    iArr[i14] = MathUtil.clip(iArr[i14] + ((((i7 + (i8 * 2)) + i9) + 2) >> 2), 0, 255);
                } else if (i12 < i11) {
                    int i15 = i11 - i12;
                    if (i15 - 2 == -1) {
                        i4 = iArr4[i3 >> 2];
                    } else {
                        i4 = iArr2[((i3 + i11) - i12) - 2];
                    }
                    if (i15 - 1 == -1) {
                        i5 = iArr4[i3 >> 2];
                    } else {
                        i5 = iArr2[((i3 + i11) - i12) - 1];
                    }
                    if (i15 == -1) {
                        i6 = iArr4[i3 >> 2];
                    } else {
                        i6 = iArr2[(i3 + i11) - i12];
                    }
                    int i16 = i10 + i12;
                    iArr[i16] = MathUtil.clip(iArr[i16] + ((((i4 + (i5 * 2)) + i6) + 2) >> 2), 0, 255);
                } else {
                    int i17 = i10 + i12;
                    iArr[i17] = MathUtil.clip(iArr[i17] + ((((iArr3[(i + i2) + 0] + (iArr4[i3 >> 2] * 2)) + iArr2[i3]) + 2) >> 2), 0, 255);
                }
            }
            i10 += 16;
        }
    }

    public static void predictHorizontal(int[] iArr, boolean z, int[] iArr2, int i, int i2, int i3) {
        int i4 = (i3 << 4) + i2;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = iArr2[i3 + i5];
            iArr[i4] = MathUtil.clip(iArr[i4] + i6, 0, 255);
            int i7 = i4 + 1;
            iArr[i7] = MathUtil.clip(iArr[i7] + i6, 0, 255);
            int i8 = i4 + 2;
            iArr[i8] = MathUtil.clip(iArr[i8] + i6, 0, 255);
            int i9 = i4 + 3;
            iArr[i9] = MathUtil.clip(iArr[i9] + i6, 0, 255);
            i4 += 16;
        }
    }

    public static void predictHorizontalDown(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int i4 = i3 >> 2;
        int i5 = ((iArr4[i4] + iArr2[i3]) + 1) >> 1;
        int i6 = i + i2;
        int i7 = i6 + 0;
        int i8 = (((iArr2[i3] + (iArr4[i4] * 2)) + iArr3[i7]) + 2) >> 2;
        int i9 = i6 + 1;
        int i10 = (((iArr4[i4] + (iArr3[i7] * 2)) + iArr3[i9]) + 2) >> 2;
        int i11 = (((iArr3[i7] + (iArr3[i9] * 2)) + iArr3[i6 + 2]) + 2) >> 2;
        int i12 = i3 + 1;
        int i13 = ((iArr2[i3] + iArr2[i12]) + 1) >> 1;
        int i14 = (((iArr4[i4] + (iArr2[i3] * 2)) + iArr2[i12]) + 2) >> 2;
        int i15 = i3 + 2;
        int i16 = ((iArr2[i12] + iArr2[i15]) + 1) >> 1;
        int i17 = (((iArr2[i3] + (iArr2[i12] * 2)) + iArr2[i15]) + 2) >> 2;
        int i18 = i3 + 3;
        int i19 = ((iArr2[i15] + iArr2[i18]) + 1) >> 1;
        int i20 = (((iArr2[i12] + (iArr2[i15] * 2)) + iArr2[i18]) + 2) >> 2;
        int i21 = (i3 << 4) + i2;
        iArr[i21] = MathUtil.clip(iArr[i21] + i5, 0, 255);
        int i22 = i21 + 1;
        iArr[i22] = MathUtil.clip(iArr[i22] + i8, 0, 255);
        int i23 = i21 + 2;
        iArr[i23] = MathUtil.clip(iArr[i23] + i10, 0, 255);
        int i24 = i21 + 3;
        iArr[i24] = MathUtil.clip(iArr[i24] + i11, 0, 255);
        int i25 = i21 + 16;
        iArr[i25] = MathUtil.clip(iArr[i25] + i13, 0, 255);
        int i26 = i21 + 17;
        iArr[i26] = MathUtil.clip(iArr[i26] + i14, 0, 255);
        int i27 = i21 + 18;
        iArr[i27] = MathUtil.clip(iArr[i27] + i5, 0, 255);
        int i28 = i21 + 19;
        iArr[i28] = MathUtil.clip(iArr[i28] + i8, 0, 255);
        int i29 = i21 + 32;
        iArr[i29] = MathUtil.clip(iArr[i29] + i16, 0, 255);
        int i30 = i21 + 33;
        iArr[i30] = MathUtil.clip(iArr[i30] + i17, 0, 255);
        int i31 = i21 + 34;
        iArr[i31] = MathUtil.clip(iArr[i31] + i13, 0, 255);
        int i32 = i21 + 35;
        iArr[i32] = MathUtil.clip(iArr[i32] + i14, 0, 255);
        int i33 = i21 + 48;
        iArr[i33] = MathUtil.clip(iArr[i33] + i19, 0, 255);
        int i34 = i21 + 49;
        iArr[i34] = MathUtil.clip(iArr[i34] + i20, 0, 255);
        int i35 = i21 + 50;
        iArr[i35] = MathUtil.clip(iArr[i35] + i16, 0, 255);
        int i36 = i21 + 51;
        iArr[i36] = MathUtil.clip(iArr[i36] + i17, 0, 255);
    }

    public static void predictHorizontalUp(int[] iArr, boolean z, int[] iArr2, int i, int i2, int i3) {
        int i4 = i3 + 1;
        int i5 = ((iArr2[i3] + iArr2[i4]) + 1) >> 1;
        int i6 = i3 + 2;
        int i7 = (((iArr2[i3] + (iArr2[i4] << 1)) + iArr2[i6]) + 2) >> 2;
        int i8 = ((iArr2[i4] + iArr2[i6]) + 1) >> 1;
        int i9 = i3 + 3;
        int i10 = (((iArr2[i4] + (iArr2[i6] << 1)) + iArr2[i9]) + 2) >> 2;
        int i11 = ((iArr2[i6] + iArr2[i9]) + 1) >> 1;
        int i12 = (((iArr2[i6] + (iArr2[i9] << 1)) + iArr2[i9]) + 2) >> 2;
        int i13 = iArr2[i9];
        int i14 = (i3 << 4) + i2;
        iArr[i14] = MathUtil.clip(iArr[i14] + i5, 0, 255);
        int i15 = i14 + 1;
        iArr[i15] = MathUtil.clip(iArr[i15] + i7, 0, 255);
        int i16 = i14 + 2;
        iArr[i16] = MathUtil.clip(iArr[i16] + i8, 0, 255);
        int i17 = i14 + 3;
        iArr[i17] = MathUtil.clip(iArr[i17] + i10, 0, 255);
        int i18 = i14 + 16;
        iArr[i18] = MathUtil.clip(iArr[i18] + i8, 0, 255);
        int i19 = i14 + 17;
        iArr[i19] = MathUtil.clip(iArr[i19] + i10, 0, 255);
        int i20 = i14 + 18;
        iArr[i20] = MathUtil.clip(iArr[i20] + i11, 0, 255);
        int i21 = i14 + 19;
        iArr[i21] = MathUtil.clip(iArr[i21] + i12, 0, 255);
        int i22 = i14 + 32;
        iArr[i22] = MathUtil.clip(iArr[i22] + i11, 0, 255);
        int i23 = i14 + 33;
        iArr[i23] = MathUtil.clip(iArr[i23] + i12, 0, 255);
        int i24 = i14 + 34;
        iArr[i24] = MathUtil.clip(iArr[i24] + i13, 0, 255);
        int i25 = i14 + 35;
        iArr[i25] = MathUtil.clip(iArr[i25] + i13, 0, 255);
        int i26 = i14 + 48;
        iArr[i26] = MathUtil.clip(iArr[i26] + i13, 0, 255);
        int i27 = i14 + 49;
        iArr[i27] = MathUtil.clip(iArr[i27] + i13, 0, 255);
        int i28 = i14 + 50;
        iArr[i28] = MathUtil.clip(iArr[i28] + i13, 0, 255);
        int i29 = i14 + 51;
        iArr[i29] = MathUtil.clip(iArr[i29] + i13, 0, 255);
    }

    public static void predictVertical(int[] iArr, boolean z, int[] iArr2, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = (i3 << 4) + i2;
        for (int i6 = 0; i6 < 4; i6++) {
            iArr[i5] = MathUtil.clip(iArr[i5] + iArr2[i4], 0, 255);
            int i7 = i5 + 1;
            iArr[i7] = MathUtil.clip(iArr[i7] + iArr2[i4 + 1], 0, 255);
            int i8 = i5 + 2;
            iArr[i8] = MathUtil.clip(iArr[i8] + iArr2[i4 + 2], 0, 255);
            int i9 = i5 + 3;
            iArr[i9] = MathUtil.clip(iArr[i9] + iArr2[i4 + 3], 0, 255);
            i5 += 16;
        }
    }

    public static void predictVerticalLeft(int[] iArr, boolean z, boolean z2, int[] iArr2, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = i4 + 3;
        int i6 = iArr2[i5];
        int i7 = iArr2[i5];
        int i8 = iArr2[i5];
        if (z2) {
            i6 = iArr2[i4 + 4];
            i7 = iArr2[i4 + 5];
            i8 = iArr2[i4 + 6];
        }
        int i9 = i4 + 1;
        int i10 = ((iArr2[i4] + iArr2[i9]) + 1) >> 1;
        int i11 = i4 + 2;
        int i12 = ((iArr2[i9] + iArr2[i11]) + 1) >> 1;
        int i13 = ((iArr2[i11] + iArr2[i5]) + 1) >> 1;
        int i14 = ((iArr2[i5] + i6) + 1) >> 1;
        int i15 = ((i6 + i7) + 1) >> 1;
        int i16 = (((iArr2[i4] + (iArr2[i9] * 2)) + iArr2[i11]) + 2) >> 2;
        int i17 = (((iArr2[i9] + (iArr2[i11] * 2)) + iArr2[i5]) + 2) >> 2;
        int i18 = (((iArr2[i11] + (iArr2[i5] * 2)) + i6) + 2) >> 2;
        int i19 = (((iArr2[i5] + (i6 * 2)) + i7) + 2) >> 2;
        int i20 = (((i6 + (i7 * 2)) + i8) + 2) >> 2;
        int i21 = (i3 << 4) + i2;
        iArr[i21] = MathUtil.clip(iArr[i21] + i10, 0, 255);
        int i22 = i21 + 1;
        iArr[i22] = MathUtil.clip(iArr[i22] + i12, 0, 255);
        int i23 = i21 + 2;
        iArr[i23] = MathUtil.clip(iArr[i23] + i13, 0, 255);
        int i24 = i21 + 3;
        iArr[i24] = MathUtil.clip(iArr[i24] + i14, 0, 255);
        int i25 = i21 + 16;
        iArr[i25] = MathUtil.clip(iArr[i25] + i16, 0, 255);
        int i26 = i21 + 17;
        iArr[i26] = MathUtil.clip(iArr[i26] + i17, 0, 255);
        int i27 = i21 + 18;
        iArr[i27] = MathUtil.clip(iArr[i27] + i18, 0, 255);
        int i28 = i21 + 19;
        iArr[i28] = MathUtil.clip(iArr[i28] + i19, 0, 255);
        int i29 = i21 + 32;
        iArr[i29] = MathUtil.clip(iArr[i29] + i12, 0, 255);
        int i30 = i21 + 33;
        iArr[i30] = MathUtil.clip(iArr[i30] + i13, 0, 255);
        int i31 = i21 + 34;
        iArr[i31] = MathUtil.clip(iArr[i31] + i14, 0, 255);
        int i32 = i21 + 35;
        iArr[i32] = MathUtil.clip(iArr[i32] + i15, 0, 255);
        int i33 = i21 + 48;
        iArr[i33] = MathUtil.clip(iArr[i33] + i17, 0, 255);
        int i34 = i21 + 49;
        iArr[i34] = MathUtil.clip(iArr[i34] + i18, 0, 255);
        int i35 = i21 + 50;
        iArr[i35] = MathUtil.clip(iArr[i35] + i19, 0, 255);
        int i36 = i21 + 51;
        iArr[i36] = MathUtil.clip(iArr[i36] + i20, 0, 255);
    }

    public static void predictVerticalRight(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int i4 = i3 >> 2;
        int i5 = i + i2;
        int i6 = i5 + 0;
        int i7 = ((iArr4[i4] + iArr3[i6]) + 1) >> 1;
        int i8 = i5 + 1;
        int i9 = ((iArr3[i6] + iArr3[i8]) + 1) >> 1;
        int i10 = i5 + 2;
        int i11 = ((iArr3[i8] + iArr3[i10]) + 1) >> 1;
        int i12 = i5 + 3;
        int i13 = ((iArr3[i10] + iArr3[i12]) + 1) >> 1;
        int i14 = (((iArr2[i3] + (iArr4[i4] * 2)) + iArr3[i6]) + 2) >> 2;
        int i15 = (((iArr4[i4] + (iArr3[i6] * 2)) + iArr3[i8]) + 2) >> 2;
        int i16 = (((iArr3[i6] + (iArr3[i8] * 2)) + iArr3[i10]) + 2) >> 2;
        int i17 = (((iArr3[i8] + (iArr3[i10] * 2)) + iArr3[i12]) + 2) >> 2;
        int i18 = i3 + 1;
        int i19 = (((iArr4[i4] + (iArr2[i3] * 2)) + iArr2[i18]) + 2) >> 2;
        int i20 = (((iArr2[i3] + (iArr2[i18] * 2)) + iArr2[i3 + 2]) + 2) >> 2;
        int i21 = (i3 << 4) + i2;
        iArr[i21] = MathUtil.clip(iArr[i21] + i7, 0, 255);
        int i22 = i21 + 1;
        iArr[i22] = MathUtil.clip(iArr[i22] + i9, 0, 255);
        int i23 = i21 + 2;
        iArr[i23] = MathUtil.clip(iArr[i23] + i11, 0, 255);
        int i24 = i21 + 3;
        iArr[i24] = MathUtil.clip(iArr[i24] + i13, 0, 255);
        int i25 = i21 + 16;
        iArr[i25] = MathUtil.clip(iArr[i25] + i14, 0, 255);
        int i26 = i21 + 17;
        iArr[i26] = MathUtil.clip(iArr[i26] + i15, 0, 255);
        int i27 = i21 + 18;
        iArr[i27] = MathUtil.clip(iArr[i27] + i16, 0, 255);
        int i28 = i21 + 19;
        iArr[i28] = MathUtil.clip(iArr[i28] + i17, 0, 255);
        int i29 = i21 + 32;
        iArr[i29] = MathUtil.clip(iArr[i29] + i19, 0, 255);
        int i30 = i21 + 33;
        iArr[i30] = MathUtil.clip(iArr[i30] + i7, 0, 255);
        int i31 = i21 + 34;
        iArr[i31] = MathUtil.clip(iArr[i31] + i9, 0, 255);
        int i32 = i21 + 35;
        iArr[i32] = MathUtil.clip(iArr[i32] + i11, 0, 255);
        int i33 = i21 + 48;
        iArr[i33] = MathUtil.clip(iArr[i33] + i20, 0, 255);
        int i34 = i21 + 49;
        iArr[i34] = MathUtil.clip(iArr[i34] + i14, 0, 255);
        int i35 = i21 + 50;
        iArr[i35] = MathUtil.clip(iArr[i35] + i15, 0, 255);
        int i36 = i21 + 51;
        iArr[i36] = MathUtil.clip(iArr[i36] + i16, 0, 255);
    }

    public static void predictWithMode(int i, int[] iArr, boolean z, boolean z2, boolean z3, int[] iArr2, int[] iArr3, int[] iArr4, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                predictVertical(iArr, z2, iArr3, i2, i3, i4);
                break;
            case 1:
                predictHorizontal(iArr, z, iArr2, i2, i3, i4);
                break;
            case 2:
                predictDC(iArr, z, z2, iArr2, iArr3, i2, i3, i4);
                break;
            case 3:
                predictDiagonalDownLeft(iArr, z2, z3, iArr3, i2, i3, i4);
                break;
            case 4:
                predictDiagonalDownRight(iArr, z, z2, iArr2, iArr3, iArr4, i2, i3, i4);
                break;
            case 5:
                predictVerticalRight(iArr, z, z2, iArr2, iArr3, iArr4, i2, i3, i4);
                break;
            case 6:
                predictHorizontalDown(iArr, z, z2, iArr2, iArr3, iArr4, i2, i3, i4);
                break;
            case 7:
                predictVerticalLeft(iArr, z2, z3, iArr3, i2, i3, i4);
                break;
            case 8:
                predictHorizontalUp(iArr, z, iArr2, i2, i3, i4);
                break;
        }
        int i5 = i2 + i3;
        int i6 = (i4 << 4) + i3;
        int i7 = i6 + 3;
        int i8 = i5 + 3;
        iArr4[i4 >> 2] = iArr3[i8];
        iArr2[i4] = iArr[i7];
        iArr2[i4 + 1] = iArr[i7 + 16];
        iArr2[i4 + 2] = iArr[i7 + 32];
        iArr2[i4 + 3] = iArr[i7 + 48];
        int i9 = i6 + 48;
        iArr3[i5] = iArr[i9];
        iArr3[i5 + 1] = iArr[i9 + 1];
        iArr3[i5 + 2] = iArr[i9 + 2];
        iArr3[i8] = iArr[i9 + 3];
    }
}
