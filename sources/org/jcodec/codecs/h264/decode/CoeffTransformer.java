package org.jcodec.codecs.h264.decode;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.jcodec.common.ArrayUtil;

public class CoeffTransformer {
    static int[][] dequantCoef = {new int[]{10, 13, 10, 13, 13, 16, 13, 16, 10, 13, 10, 13, 13, 16, 13, 16}, new int[]{11, 14, 11, 14, 14, 18, 14, 18, 11, 14, 11, 14, 14, 18, 14, 18}, new int[]{13, 16, 13, 16, 16, 20, 16, 20, 13, 16, 13, 16, 16, 20, 16, 20}, new int[]{14, 18, 14, 18, 18, 23, 18, 23, 14, 18, 14, 18, 18, 23, 18, 23}, new int[]{16, 20, 16, 20, 20, 25, 20, 25, 16, 20, 16, 20, 20, 25, 20, 25}, new int[]{18, 23, 18, 23, 23, 29, 23, 29, 18, 23, 18, 23, 23, 29, 23, 29}};
    static int[][] dequantCoef8x8 = ((int[][]) Array.newInstance(int.class, new int[]{6, 64}));
    static int[][] initDequantCoeff8x8 = {new int[]{20, 18, 32, 19, 25, 24}, new int[]{22, 19, 35, 21, 28, 26}, new int[]{26, 23, 42, 24, 33, 31}, new int[]{28, 25, 45, 26, 35, 33}, new int[]{32, 28, 51, 30, 40, 38}, new int[]{36, 32, 58, 34, 46, 43}};
    private static final int[][] quantCoeff = {new int[]{13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243, 13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243}, new int[]{11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660, 11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660}, new int[]{10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194, 10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194}, new int[]{9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647, 9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647}, new int[]{8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355, 8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355}, new int[]{7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893, 7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893}};
    public static int[] zigzag4x4 = {0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 13, 10, 7, 11, 14, 15};
    public static int[] zigzag8x8 = {0, 1, 8, 16, 9, 2, 3, 10, 17, 24, 32, 25, 18, 11, 4, 5, 12, 19, 26, 33, 40, 48, 41, 34, 27, 20, 13, 6, 7, 14, 21, 28, 35, 42, 49, 56, 57, 50, 43, 36, 29, 22, 15, 23, 30, 37, 44, 51, 58, 59, 52, 45, 38, 31, 39, 46, 53, 60, 61, 54, 47, 55, 62, 63};
    private int[] fieldScan4x4 = {0, 4, 1, 8, 12, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15};
    private int[] fieldScan8x8 = {0, 8, 16, 1, 9, 24, 32, 17, 2, 25, 40, 48, 56, 33, 10, 3, 18, 41, 49, 57, 26, 11, 4, 19, 34, 42, 50, 58, 27, 12, 5, 20, 35, 43, 51, 58, 28, 13, 6, 21, 36, 44, 52, 60, 29, 14, 22, 37, 45, 53, 61, 30, 7, 15, 38, 46, 54, 62, 23, 31, 39, 47, 55, 63};

    static {
        for (int i = 0; i < 6; i++) {
            Arrays.fill(dequantCoef8x8[i], initDequantCoeff8x8[i][5]);
            for (int i2 = 0; i2 < 8; i2 += 4) {
                for (int i3 = 0; i3 < 8; i3 += 4) {
                    dequantCoef8x8[i][(i2 << 3) + i3] = initDequantCoeff8x8[i][0];
                }
            }
            for (int i4 = 1; i4 < 8; i4 += 2) {
                for (int i5 = 1; i5 < 8; i5 += 2) {
                    dequantCoef8x8[i][(i4 << 3) + i5] = initDequantCoeff8x8[i][1];
                }
            }
            for (int i6 = 2; i6 < 8; i6 += 4) {
                for (int i7 = 2; i7 < 8; i7 += 4) {
                    dequantCoef8x8[i][(i6 << 3) + i7] = initDequantCoeff8x8[i][2];
                }
            }
            for (int i8 = 0; i8 < 8; i8 += 4) {
                for (int i9 = 1; i9 < 8; i9 += 2) {
                    dequantCoef8x8[i][(i8 << 3) + i9] = initDequantCoeff8x8[i][3];
                }
            }
            for (int i10 = 1; i10 < 8; i10 += 2) {
                for (int i11 = 0; i11 < 8; i11 += 4) {
                    dequantCoef8x8[i][(i10 << 3) + i11] = initDequantCoeff8x8[i][3];
                }
            }
            for (int i12 = 0; i12 < 8; i12 += 4) {
                for (int i13 = 2; i13 < 8; i13 += 4) {
                    dequantCoef8x8[i][(i12 << 3) + i13] = initDequantCoeff8x8[i][4];
                }
            }
            for (int i14 = 2; i14 < 8; i14 += 4) {
                for (int i15 = 0; i15 < 8; i15 += 4) {
                    dequantCoef8x8[i][(i14 << 3) + i15] = initDequantCoeff8x8[i][4];
                }
            }
        }
    }

    public CoeffTransformer(int[][] iArr) {
    }

    public static void dequantizeAC(int[] iArr, int i) {
        int i2 = i % 6;
        int i3 = 0;
        if (i >= 24) {
            int i4 = i / 6;
            while (i3 < 16) {
                iArr[i3] = (iArr[i3] * dequantCoef[i2][i3]) << i4;
                i3++;
            }
            return;
        }
        int i5 = i / 6;
        int i6 = 4 - i5;
        int i7 = 1 << (3 - i5);
        while (i3 < 16) {
            iArr[i3] = ((iArr[i3] * (dequantCoef[i2][i3] << 4)) + i7) >> i6;
            i3++;
        }
    }

    public static void dequantizeAC8x8(int[] iArr, int i) {
        int i2 = i % 6;
        int i3 = 0;
        if (i >= 36) {
            int i4 = (i / 6) - 2;
            while (i3 < 64) {
                iArr[i3] = (iArr[i3] * dequantCoef8x8[i2][i3]) << i4;
                i3++;
            }
            return;
        }
        int i5 = i / 6;
        int i6 = 6 - i5;
        int i7 = 1 << (5 - i5);
        while (i3 < 64) {
            iArr[i3] = ((iArr[i3] * (dequantCoef8x8[i2][i3] << 4)) + i7) >> i6;
            i3++;
        }
    }

    public static void dequantizeDC2x2(int[] iArr, int i) {
        int i2 = i % 6;
        int i3 = i / 6;
        for (int i4 = 0; i4 < 4; i4++) {
            iArr[i4] = ((iArr[i4] * dequantCoef[i2][0]) << i3) >> 1;
        }
    }

    public static void dequantizeDC4x2(int[] iArr, int i) {
    }

    public static void dequantizeDC4x4(int[] iArr, int i) {
        int i2 = i % 6;
        if (i >= 36) {
            int i3 = (i / 6) - 2;
            for (int i4 = 0; i4 < 16; i4++) {
                iArr[i4] = (iArr[i4] * dequantCoef[i2][0]) << i3;
            }
            return;
        }
        int i5 = i / 6;
        int i6 = 6 - i5;
        int i7 = 1 << (5 - i5);
        for (int i8 = 0; i8 < 16; i8++) {
            iArr[i8] = ((iArr[i8] * (dequantCoef[i2][0] << 4)) + i7) >> i6;
        }
    }

    public static void fdct4x4(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = i + 3;
            int i3 = iArr[i] + iArr[i2];
            int i4 = i + 1;
            int i5 = i + 2;
            int i6 = iArr[i4] + iArr[i5];
            int i7 = iArr[i4] - iArr[i5];
            int i8 = iArr[i] - iArr[i2];
            iArr[i] = i3 + i6;
            iArr[i4] = (i8 << 1) + i7;
            iArr[i5] = i3 - i6;
            iArr[i2] = i8 - (i7 << 1);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 + 12;
            int i11 = iArr[i9] + iArr[i10];
            int i12 = i9 + 4;
            int i13 = i9 + 8;
            int i14 = iArr[i12] + iArr[i13];
            int i15 = iArr[i12] - iArr[i13];
            int i16 = iArr[i9] - iArr[i10];
            iArr[i9] = i11 + i14;
            iArr[i12] = (i16 << 1) + i15;
            iArr[i13] = i11 - i14;
            iArr[i10] = i16 - (i15 << 1);
        }
    }

    public static void fvdDC2x2(int[] iArr) {
        invDC2x2(iArr);
    }

    public static void fvdDC4x2(int[] iArr) {
    }

    public static void fvdDC4x4(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = i + 3;
            int i3 = iArr[i] + iArr[i2];
            int i4 = i + 1;
            int i5 = i + 2;
            int i6 = iArr[i4] + iArr[i5];
            int i7 = iArr[i4] - iArr[i5];
            int i8 = iArr[i] - iArr[i2];
            iArr[i] = i3 + i6;
            iArr[i4] = i8 + i7;
            iArr[i5] = i3 - i6;
            iArr[i2] = i8 - i7;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 + 12;
            int i11 = iArr[i9] + iArr[i10];
            int i12 = i9 + 4;
            int i13 = i9 + 8;
            int i14 = iArr[i12] + iArr[i13];
            int i15 = iArr[i12] - iArr[i13];
            int i16 = iArr[i9] - iArr[i10];
            iArr[i9] = (i11 + i14) >> 1;
            iArr[i12] = (i15 + i16) >> 1;
            iArr[i13] = (i11 - i14) >> 1;
            iArr[i10] = (i16 - i15) >> 1;
        }
    }

    public static final void idct4x4(int[] iArr) {
        idct4x4(iArr, iArr);
    }

    public static void idct8x8(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i + 4;
            int i4 = iArr[i] + iArr[i3];
            int i5 = i + 3;
            int i6 = i + 5;
            int i7 = i + 7;
            int i8 = (((-iArr[i5]) + iArr[i6]) - iArr[i7]) - (iArr[i7] >> 1);
            int i9 = iArr[i] - iArr[i3];
            int i10 = i + 1;
            int i11 = ((iArr[i10] + iArr[i7]) - iArr[i5]) - (iArr[i5] >> 1);
            int i12 = i + 2;
            int i13 = i + 6;
            int i14 = (iArr[i12] >> 1) - iArr[i13];
            int i15 = (-iArr[i10]) + iArr[i7] + iArr[i6] + (iArr[i6] >> 1);
            int i16 = iArr[i12] + (iArr[i13] >> 1);
            int i17 = iArr[i5] + iArr[i6] + iArr[i10] + (iArr[i10] >> 1);
            int i18 = i4 + i16;
            int i19 = i8 + (i17 >> 2);
            int i20 = i9 + i14;
            int i21 = i11 + (i15 >> 2);
            int i22 = i9 - i14;
            int i23 = (i11 >> 2) - i15;
            int i24 = i4 - i16;
            int i25 = i17 - (i8 >> 2);
            iArr[i] = i18 + i25;
            iArr[i10] = i20 + i23;
            iArr[i12] = i22 + i21;
            iArr[i5] = i24 + i19;
            iArr[i3] = i24 - i19;
            iArr[i6] = i22 - i21;
            iArr[i13] = i20 - i23;
            iArr[i7] = i18 - i25;
            i += 8;
        }
        for (int i26 = 0; i26 < 8; i26++) {
            int i27 = i26 + 32;
            int i28 = iArr[i26] + iArr[i27];
            int i29 = i26 + 24;
            int i30 = i26 + 40;
            int i31 = i26 + 56;
            int i32 = (((-iArr[i29]) + iArr[i30]) - iArr[i31]) - (iArr[i31] >> 1);
            int i33 = iArr[i26] - iArr[i27];
            int i34 = i26 + 8;
            int i35 = ((iArr[i34] + iArr[i31]) - iArr[i29]) - (iArr[i29] >> 1);
            int i36 = i26 + 16;
            int i37 = i26 + 48;
            int i38 = (iArr[i36] >> 1) - iArr[i37];
            int i39 = (-iArr[i34]) + iArr[i31] + iArr[i30] + (iArr[i30] >> 1);
            int i40 = iArr[i36] + (iArr[i37] >> 1);
            int i41 = iArr[i29] + iArr[i30] + iArr[i34] + (iArr[i34] >> 1);
            int i42 = i28 + i40;
            int i43 = i32 + (i41 >> 2);
            int i44 = i33 + i38;
            int i45 = i35 + (i39 >> 2);
            int i46 = i33 - i38;
            int i47 = (i35 >> 2) - i39;
            int i48 = i28 - i40;
            int i49 = i41 - (i32 >> 2);
            iArr[i26] = i42 + i49;
            iArr[i34] = i44 + i47;
            iArr[i36] = i46 + i45;
            iArr[i29] = i48 + i43;
            iArr[i27] = i48 - i43;
            iArr[i30] = i46 - i45;
            iArr[i37] = i44 - i47;
            iArr[i31] = i42 - i49;
        }
        for (int i50 = 0; i50 < 64; i50++) {
            iArr[i50] = (iArr[i50] + 32) >> 6;
        }
    }

    public static void invDC2x2(int[] iArr) {
        int i = iArr[0] + iArr[1];
        int i2 = iArr[0] - iArr[1];
        int i3 = iArr[2] + iArr[3];
        int i4 = iArr[2] - iArr[3];
        iArr[0] = i + i3;
        iArr[1] = i2 + i4;
        iArr[2] = i - i3;
        iArr[3] = i2 - i4;
    }

    public static void invDC4x2(int[] iArr) {
    }

    public static void invDC4x4(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = i + 2;
            int i3 = iArr[i] + iArr[i2];
            int i4 = iArr[i] - iArr[i2];
            int i5 = i + 1;
            int i6 = i + 3;
            int i7 = iArr[i5] - iArr[i6];
            int i8 = iArr[i5] + iArr[i6];
            iArr[i] = i3 + i8;
            iArr[i5] = i4 + i7;
            iArr[i2] = i4 - i7;
            iArr[i6] = i3 - i8;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 + 8;
            int i11 = iArr[i9] + iArr[i10];
            int i12 = iArr[i9] - iArr[i10];
            int i13 = i9 + 4;
            int i14 = i9 + 12;
            int i15 = iArr[i13] - iArr[i14];
            int i16 = iArr[i13] + iArr[i14];
            iArr[i9] = i11 + i16;
            iArr[i13] = i12 + i15;
            iArr[i10] = i12 - i15;
            iArr[i14] = i11 - i16;
        }
    }

    public static void quantizeAC(int[] iArr, int i) {
        int i2 = i / 6;
        int i3 = i % 6;
        int i4 = 682 << (i2 + 4);
        int i5 = i2 + 15;
        int i6 = 1;
        if (i < 10) {
            while (i6 < 16) {
                int i7 = iArr[i6] >> 31;
                iArr[i6] = (Math.min(((((iArr[i6] ^ i7) - i7) * quantCoeff[i3][i6]) + i4) >> i5, 2063) ^ i7) - i7;
                i6++;
            }
            return;
        }
        while (i6 < 16) {
            int i8 = iArr[i6] >> 31;
            iArr[i6] = ((((((iArr[i6] ^ i8) - i8) * quantCoeff[i3][i6]) + i4) >> i5) ^ i8) - i8;
            i6++;
        }
    }

    public static void quantizeDC2x2(int[] iArr, int i) {
        int i2 = i / 6;
        int i3 = i % 6;
        int i4 = 682 << (i2 + 5);
        int i5 = i2 + 16;
        if (i < 4) {
            for (int i6 = 0; i6 < 4; i6++) {
                int i7 = iArr[i6] >> 31;
                iArr[i6] = (Math.min(((((iArr[i6] ^ i7) - i7) * quantCoeff[i3][0]) + i4) >> i5, 2063) ^ i7) - i7;
            }
            return;
        }
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = iArr[i8] >> 31;
            iArr[i8] = ((((((iArr[i8] ^ i9) - i9) * quantCoeff[i3][0]) + i4) >> i5) ^ i9) - i9;
        }
    }

    public static void quantizeDC4x2(int[] iArr, int i) {
    }

    public static void quantizeDC4x4(int[] iArr, int i) {
        int i2 = i / 6;
        int i3 = i % 6;
        int i4 = 682 << (i2 + 5);
        int i5 = i2 + 16;
        if (i < 10) {
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = iArr[i6] >> 31;
                iArr[i6] = (Math.min(((((iArr[i6] ^ i7) - i7) * quantCoeff[i3][0]) + i4) >> i5, 2063) ^ i7) - i7;
            }
            return;
        }
        for (int i8 = 0; i8 < 16; i8++) {
            int i9 = iArr[i8] >> 31;
            iArr[i8] = ((((((iArr[i8] ^ i9) - i9) * quantCoeff[i3][0]) + i4) >> i5) ^ i9) - i9;
        }
    }

    public static void reorderDC4x4(int[] iArr) {
        ArrayUtil.swap(iArr, 2, 4);
        ArrayUtil.swap(iArr, 3, 5);
        ArrayUtil.swap(iArr, 10, 12);
        ArrayUtil.swap(iArr, 11, 13);
    }

    public static int[] unzigzagAC(int[] iArr) {
        int[] iArr2;
        if (iArr.length == 16) {
            iArr2 = zigzag4x4;
        } else if (iArr.length == 64) {
            iArr2 = zigzag8x8;
        } else {
            throw new IllegalArgumentException("Coefficients array should be of either 16 or 64 length.");
        }
        int[] iArr3 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[iArr2[i]] = iArr[i];
        }
        return iArr3;
    }

    public static final void idct4x4(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = i + 2;
            int i3 = iArr[i] + iArr[i2];
            int i4 = iArr[i] - iArr[i2];
            int i5 = i + 1;
            int i6 = i + 3;
            int i7 = (iArr[i5] >> 1) - iArr[i6];
            int i8 = iArr[i5] + (iArr[i6] >> 1);
            iArr2[i] = i3 + i8;
            iArr2[i5] = i4 + i7;
            iArr2[i2] = i4 - i7;
            iArr2[i6] = i3 - i8;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 + 8;
            int i11 = iArr2[i9] + iArr2[i10];
            int i12 = iArr2[i9] - iArr2[i10];
            int i13 = i9 + 4;
            int i14 = i9 + 12;
            int i15 = (iArr2[i13] >> 1) - iArr2[i14];
            int i16 = iArr2[i13] + (iArr2[i14] >> 1);
            iArr2[i9] = i11 + i16;
            iArr2[i13] = i12 + i15;
            iArr2[i10] = i12 - i15;
            iArr2[i14] = i11 - i16;
        }
        for (int i17 = 0; i17 < 16; i17++) {
            iArr2[i17] = (iArr2[i17] + 32) >> 6;
        }
    }
}
