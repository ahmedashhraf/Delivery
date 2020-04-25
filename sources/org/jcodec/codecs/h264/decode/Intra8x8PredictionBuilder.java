package org.jcodec.codecs.h264.decode;

import org.jcodec.common.Assert;
import org.jcodec.common.tools.MathUtil;

public class Intra8x8PredictionBuilder {
    static int[] genBuf = new int[24];
    static int[] leftBuf = new int[8];
    static int[] topBuf = new int[16];

    public static void copyAdd(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = MathUtil.clip(iArr2[i2] + iArr[i], 0, 255);
        int i3 = i2 + 1;
        iArr2[i3] = MathUtil.clip(iArr2[i3] + iArr[i + 1], 0, 255);
        int i4 = i2 + 2;
        iArr2[i4] = MathUtil.clip(iArr2[i4] + iArr[i + 2], 0, 255);
        int i5 = i2 + 3;
        iArr2[i5] = MathUtil.clip(iArr2[i5] + iArr[i + 3], 0, 255);
        int i6 = i2 + 4;
        iArr2[i6] = MathUtil.clip(iArr2[i6] + iArr[i + 4], 0, 255);
        int i7 = i2 + 5;
        iArr2[i7] = MathUtil.clip(iArr2[i7] + iArr[i + 5], 0, 255);
        int i8 = i2 + 6;
        iArr2[i8] = MathUtil.clip(iArr2[i8] + iArr[i + 6], 0, 255);
        int i9 = i2 + 7;
        iArr2[i9] = MathUtil.clip(iArr2[i9] + iArr[i + 7], 0, 255);
    }

    public static void fillAdd(int[] iArr, int i, int i2) {
        int i3 = i;
        int i4 = 0;
        while (i4 < 8) {
            iArr[i3] = MathUtil.clip(iArr[i3] + i2, 0, 255);
            int i5 = i3 + 1;
            iArr[i5] = MathUtil.clip(iArr[i5] + i2, 0, 255);
            int i6 = i3 + 2;
            iArr[i6] = MathUtil.clip(iArr[i6] + i2, 0, 255);
            int i7 = i3 + 3;
            iArr[i7] = MathUtil.clip(iArr[i7] + i2, 0, 255);
            int i8 = i3 + 4;
            iArr[i8] = MathUtil.clip(iArr[i8] + i2, 0, 255);
            int i9 = i3 + 5;
            iArr[i9] = MathUtil.clip(iArr[i9] + i2, 0, 255);
            int i10 = i3 + 6;
            iArr[i10] = MathUtil.clip(iArr[i10] + i2, 0, 255);
            int i11 = i3 + 7;
            iArr[i11] = MathUtil.clip(iArr[i11] + i2, 0, 255);
            i4++;
            i3 += 16;
        }
    }

    private static void interpolateLeft(boolean z, int[] iArr, int[] iArr2, int i, int[] iArr3) {
        iArr3[0] = ((((z ? iArr[i >> 2] : iArr2[0]) + (iArr2[i] << 1)) + iArr2[i + 1]) + 2) >> 2;
        for (int i2 = 1; i2 < 7; i2++) {
            int i3 = i + i2;
            iArr3[i2] = (((iArr2[i3 - 1] + (iArr2[i3] << 1)) + iArr2[i3 + 1]) + 2) >> 2;
        }
        int i4 = i + 7;
        iArr3[7] = (((iArr2[i + 6] + (iArr2[i4] << 1)) + iArr2[i4]) + 2) >> 2;
    }

    private static void interpolateTop(boolean z, boolean z2, int[] iArr, int[] iArr2, int i, int i2, int[] iArr3) {
        iArr3[0] = ((((z ? iArr[i2 >> 2] : iArr2[i]) + (iArr2[i] << 1)) + iArr2[i + 1]) + 2) >> 2;
        int i3 = 1;
        while (i3 < 7) {
            int i4 = i + i3;
            iArr3[i3] = (((iArr2[i4 - 1] + (iArr2[i4] << 1)) + iArr2[i4 + 1]) + 2) >> 2;
            i3++;
        }
        if (z2) {
            while (i3 < 15) {
                int i5 = i + i3;
                iArr3[i3] = (((iArr2[i5 - 1] + (iArr2[i5] << 1)) + iArr2[i5 + 1]) + 2) >> 2;
                i3++;
            }
            int i6 = i + 15;
            iArr3[15] = (((iArr2[i + 14] + (iArr2[i6] << 1)) + iArr2[i6]) + 2) >> 2;
            return;
        }
        int i7 = i + 7;
        iArr3[7] = (((iArr2[i + 6] + (iArr2[i7] << 1)) + iArr2[i7]) + 2) >> 2;
        for (int i8 = 8; i8 < 16; i8++) {
            iArr3[i8] = iArr2[i7];
        }
    }

    private static int interpolateTopLeft(boolean z, boolean z2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        int i4 = iArr[i3 >> 2];
        return ((((i4 << 1) + (z ? iArr2[i + i2] : i4)) + (z2 ? iArr3[i3] : i4)) + 2) >> 2;
    }

    private static void predictDC(int[] iArr, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int[] iArr5 = iArr;
        boolean z5 = z;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr3;
        int i4 = i3;
        if (z4 && z3) {
            interpolateTop(z, z2, iArr2, iArr4, i + i2, i3, topBuf);
            interpolateLeft(z5, iArr6, iArr7, i4, leftBuf);
            int[] iArr8 = topBuf;
            int i5 = iArr8[0] + iArr8[1] + iArr8[2] + iArr8[3];
            int i6 = iArr8[4] + iArr8[5] + iArr8[6] + iArr8[7];
            int[] iArr9 = leftBuf;
            int i7 = iArr9[4] + iArr9[5] + iArr9[6] + iArr9[7];
            fillAdd(iArr5, (i4 << 4) + i2, ((((i5 + i6) + (((iArr9[0] + iArr9[1]) + iArr9[2]) + iArr9[3])) + i7) + 8) >> 4);
        } else if (z3) {
            interpolateLeft(z5, iArr6, iArr7, i4, leftBuf);
            int[] iArr10 = leftBuf;
            fillAdd(iArr5, (i4 << 4) + i2, (((((iArr10[0] + iArr10[1]) + iArr10[2]) + iArr10[3]) + (((iArr10[4] + iArr10[5]) + iArr10[6]) + iArr10[7])) + 4) >> 3);
        } else if (z4) {
            interpolateTop(z, z2, iArr2, iArr4, i + i2, i3, topBuf);
            int[] iArr11 = topBuf;
            fillAdd(iArr5, (i4 << 4) + i2, (((((iArr11[0] + iArr11[1]) + iArr11[2]) + iArr11[3]) + (((iArr11[4] + iArr11[5]) + iArr11[6]) + iArr11[7])) + 4) >> 3);
        } else {
            fillAdd(iArr5, (i4 << 4) + i2, 128);
        }
    }

    private static void predictDiagonalDownLeft(int[] iArr, boolean z, boolean z2, boolean z3, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        int[] iArr4 = iArr;
        interpolateTop(z, z3, iArr2, iArr3, i + i2, i3, topBuf);
        int[] iArr5 = genBuf;
        int[] iArr6 = topBuf;
        iArr5[0] = (((iArr6[0] + iArr6[2]) + (iArr6[1] << 1)) + 2) >> 2;
        iArr5[1] = (((iArr6[1] + iArr6[3]) + (iArr6[2] << 1)) + 2) >> 2;
        iArr5[2] = (((iArr6[2] + iArr6[4]) + (iArr6[3] << 1)) + 2) >> 2;
        iArr5[3] = (((iArr6[3] + iArr6[5]) + (iArr6[4] << 1)) + 2) >> 2;
        iArr5[4] = (((iArr6[4] + iArr6[6]) + (iArr6[5] << 1)) + 2) >> 2;
        iArr5[5] = (((iArr6[5] + iArr6[7]) + (iArr6[6] << 1)) + 2) >> 2;
        iArr5[6] = (((iArr6[6] + iArr6[8]) + (iArr6[7] << 1)) + 2) >> 2;
        iArr5[7] = (((iArr6[7] + iArr6[9]) + (iArr6[8] << 1)) + 2) >> 2;
        iArr5[8] = (((iArr6[8] + iArr6[10]) + (iArr6[9] << 1)) + 2) >> 2;
        iArr5[9] = (((iArr6[9] + iArr6[11]) + (iArr6[10] << 1)) + 2) >> 2;
        iArr5[10] = (((iArr6[10] + iArr6[12]) + (iArr6[11] << 1)) + 2) >> 2;
        iArr5[11] = (((iArr6[11] + iArr6[13]) + (iArr6[12] << 1)) + 2) >> 2;
        iArr5[12] = (((iArr6[12] + iArr6[14]) + (iArr6[13] << 1)) + 2) >> 2;
        iArr5[13] = (((iArr6[13] + iArr6[15]) + (iArr6[14] << 1)) + 2) >> 2;
        iArr5[14] = (((iArr6[14] + iArr6[15]) + (iArr6[15] << 1)) + 2) >> 2;
        int i4 = (i3 << 4) + i2;
        copyAdd(iArr5, 0, iArr4, i4);
        copyAdd(genBuf, 1, iArr4, i4 + 16);
        copyAdd(genBuf, 2, iArr4, i4 + 32);
        copyAdd(genBuf, 3, iArr4, i4 + 48);
        copyAdd(genBuf, 4, iArr4, i4 + 64);
        copyAdd(genBuf, 5, iArr4, i4 + 80);
        copyAdd(genBuf, 6, iArr4, i4 + 96);
        copyAdd(genBuf, 7, iArr4, i4 + 112);
    }

    private static void predictDiagonalDownRight(int[] iArr, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int[] iArr5 = iArr;
        int i4 = i3;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr4;
        interpolateTop(true, z, iArr6, iArr7, i + i2, i3, topBuf);
        int[] iArr8 = iArr3;
        interpolateLeft(true, iArr6, iArr8, i4, leftBuf);
        int interpolateTopLeft = interpolateTopLeft(true, true, iArr6, iArr7, iArr8, i, i2, i3);
        int[] iArr9 = genBuf;
        int[] iArr10 = leftBuf;
        iArr9[0] = (((iArr10[7] + iArr10[5]) + (iArr10[6] << 1)) + 2) >> 2;
        iArr9[1] = (((iArr10[6] + iArr10[4]) + (iArr10[5] << 1)) + 2) >> 2;
        iArr9[2] = (((iArr10[5] + iArr10[3]) + (iArr10[4] << 1)) + 2) >> 2;
        iArr9[3] = (((iArr10[4] + iArr10[2]) + (iArr10[3] << 1)) + 2) >> 2;
        iArr9[4] = (((iArr10[3] + iArr10[1]) + (iArr10[2] << 1)) + 2) >> 2;
        iArr9[5] = (((iArr10[2] + iArr10[0]) + (iArr10[1] << 1)) + 2) >> 2;
        iArr9[6] = (((iArr10[1] + interpolateTopLeft) + (iArr10[0] << 1)) + 2) >> 2;
        int i5 = iArr10[0];
        int[] iArr11 = topBuf;
        iArr9[7] = (((i5 + iArr11[0]) + (interpolateTopLeft << 1)) + 2) >> 2;
        iArr9[8] = (((interpolateTopLeft + iArr11[1]) + (iArr11[0] << 1)) + 2) >> 2;
        iArr9[9] = (((iArr11[0] + iArr11[2]) + (iArr11[1] << 1)) + 2) >> 2;
        iArr9[10] = (((iArr11[1] + iArr11[3]) + (iArr11[2] << 1)) + 2) >> 2;
        iArr9[11] = (((iArr11[2] + iArr11[4]) + (iArr11[3] << 1)) + 2) >> 2;
        iArr9[12] = (((iArr11[3] + iArr11[5]) + (iArr11[4] << 1)) + 2) >> 2;
        iArr9[13] = (((iArr11[4] + iArr11[6]) + (iArr11[5] << 1)) + 2) >> 2;
        iArr9[14] = (((iArr11[5] + iArr11[7]) + (iArr11[6] << 1)) + 2) >> 2;
        int i6 = (i4 << 4) + i2;
        copyAdd(iArr9, 7, iArr, i6);
        copyAdd(genBuf, 6, iArr, i6 + 16);
        copyAdd(genBuf, 5, iArr, i6 + 32);
        copyAdd(genBuf, 4, iArr, i6 + 48);
        copyAdd(genBuf, 3, iArr, i6 + 64);
        copyAdd(genBuf, 2, iArr, i6 + 80);
        copyAdd(genBuf, 1, iArr, i6 + 96);
        copyAdd(genBuf, 0, iArr, i6 + 112);
    }

    private static void predictHorizontal(int[] iArr, boolean z, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        interpolateLeft(z, iArr2, iArr3, i3, leftBuf);
        int i4 = (i3 << 4) + i2;
        int i5 = 0;
        while (i5 < 8) {
            iArr[i4] = MathUtil.clip(iArr[i4] + leftBuf[i5], 0, 255);
            int i6 = i4 + 1;
            iArr[i6] = MathUtil.clip(iArr[i6] + leftBuf[i5], 0, 255);
            int i7 = i4 + 2;
            iArr[i7] = MathUtil.clip(iArr[i7] + leftBuf[i5], 0, 255);
            int i8 = i4 + 3;
            iArr[i8] = MathUtil.clip(iArr[i8] + leftBuf[i5], 0, 255);
            int i9 = i4 + 4;
            iArr[i9] = MathUtil.clip(iArr[i9] + leftBuf[i5], 0, 255);
            int i10 = i4 + 5;
            iArr[i10] = MathUtil.clip(iArr[i10] + leftBuf[i5], 0, 255);
            int i11 = i4 + 6;
            iArr[i11] = MathUtil.clip(iArr[i11] + leftBuf[i5], 0, 255);
            int i12 = i4 + 7;
            iArr[i12] = MathUtil.clip(iArr[i12] + leftBuf[i5], 0, 255);
            i5++;
            i4 += 16;
        }
    }

    private static void predictHorizontalDown(int[] iArr, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int[] iArr5 = iArr;
        int i4 = i3;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr4;
        interpolateTop(true, z, iArr6, iArr7, i + i2, i3, topBuf);
        int[] iArr8 = iArr3;
        interpolateLeft(true, iArr6, iArr8, i4, leftBuf);
        int interpolateTopLeft = interpolateTopLeft(true, true, iArr6, iArr7, iArr8, i, i2, i3);
        int[] iArr9 = genBuf;
        int[] iArr10 = leftBuf;
        iArr9[0] = ((iArr10[7] + iArr10[6]) + 1) >> 1;
        iArr9[1] = (((iArr10[5] + iArr10[7]) + (iArr10[6] << 1)) + 2) >> 2;
        iArr9[2] = ((iArr10[6] + iArr10[5]) + 1) >> 1;
        iArr9[3] = (((iArr10[4] + iArr10[6]) + (iArr10[5] << 1)) + 2) >> 2;
        iArr9[4] = ((iArr10[5] + iArr10[4]) + 1) >> 1;
        iArr9[5] = (((iArr10[3] + iArr10[5]) + (iArr10[4] << 1)) + 2) >> 2;
        iArr9[6] = ((iArr10[4] + iArr10[3]) + 1) >> 1;
        iArr9[7] = (((iArr10[2] + iArr10[4]) + (iArr10[3] << 1)) + 2) >> 2;
        iArr9[8] = ((iArr10[3] + iArr10[2]) + 1) >> 1;
        iArr9[9] = (((iArr10[1] + iArr10[3]) + (iArr10[2] << 1)) + 2) >> 2;
        iArr9[10] = ((iArr10[2] + iArr10[1]) + 1) >> 1;
        iArr9[11] = (((iArr10[0] + iArr10[2]) + (iArr10[1] << 1)) + 2) >> 2;
        iArr9[12] = ((iArr10[1] + iArr10[0]) + 1) >> 1;
        iArr9[13] = (((iArr10[1] + interpolateTopLeft) + (iArr10[0] << 1)) + 2) >> 2;
        iArr9[14] = ((iArr10[0] + interpolateTopLeft) + 1) >> 1;
        int i5 = iArr10[0];
        int[] iArr11 = topBuf;
        iArr9[15] = (((i5 + iArr11[0]) + (interpolateTopLeft << 1)) + 2) >> 2;
        iArr9[16] = (((interpolateTopLeft + iArr11[1]) + (iArr11[0] << 1)) + 2) >> 2;
        iArr9[17] = (((iArr11[0] + iArr11[2]) + (iArr11[1] << 1)) + 2) >> 2;
        iArr9[18] = (((iArr11[1] + iArr11[3]) + (iArr11[2] << 1)) + 2) >> 2;
        iArr9[19] = (((iArr11[2] + iArr11[4]) + (iArr11[3] << 1)) + 2) >> 2;
        iArr9[20] = (((iArr11[3] + iArr11[5]) + (iArr11[4] << 1)) + 2) >> 2;
        iArr9[21] = (((iArr11[4] + iArr11[6]) + (iArr11[5] << 1)) + 2) >> 2;
        int i6 = (i4 << 4) + i2;
        copyAdd(iArr9, 14, iArr5, i6);
        copyAdd(genBuf, 12, iArr5, i6 + 16);
        copyAdd(genBuf, 10, iArr5, i6 + 32);
        copyAdd(genBuf, 8, iArr5, i6 + 48);
        copyAdd(genBuf, 6, iArr5, i6 + 64);
        copyAdd(genBuf, 4, iArr5, i6 + 80);
        copyAdd(genBuf, 2, iArr5, i6 + 96);
        copyAdd(genBuf, 0, iArr5, i6 + 112);
    }

    private static void predictHorizontalUp(int[] iArr, boolean z, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        interpolateLeft(z, iArr2, iArr3, i3, leftBuf);
        int[] iArr4 = genBuf;
        int[] iArr5 = leftBuf;
        iArr4[0] = ((iArr5[0] + iArr5[1]) + 1) >> 1;
        iArr4[1] = (((iArr5[2] + iArr5[0]) + (iArr5[1] << 1)) + 2) >> 2;
        iArr4[2] = ((iArr5[1] + iArr5[2]) + 1) >> 1;
        iArr4[3] = (((iArr5[3] + iArr5[1]) + (iArr5[2] << 1)) + 2) >> 2;
        iArr4[4] = ((iArr5[2] + iArr5[3]) + 1) >> 1;
        iArr4[5] = (((iArr5[4] + iArr5[2]) + (iArr5[3] << 1)) + 2) >> 2;
        iArr4[6] = ((iArr5[3] + iArr5[4]) + 1) >> 1;
        iArr4[7] = (((iArr5[5] + iArr5[3]) + (iArr5[4] << 1)) + 2) >> 2;
        iArr4[8] = ((iArr5[4] + iArr5[5]) + 1) >> 1;
        iArr4[9] = (((iArr5[6] + iArr5[4]) + (iArr5[5] << 1)) + 2) >> 2;
        iArr4[10] = ((iArr5[5] + iArr5[6]) + 1) >> 1;
        iArr4[11] = (((iArr5[7] + iArr5[5]) + (iArr5[6] << 1)) + 2) >> 2;
        iArr4[12] = ((iArr5[6] + iArr5[7]) + 1) >> 1;
        iArr4[13] = (((iArr5[6] + iArr5[7]) + (iArr5[7] << 1)) + 2) >> 2;
        int i4 = iArr5[7];
        iArr4[21] = i4;
        iArr4[20] = i4;
        iArr4[19] = i4;
        iArr4[18] = i4;
        iArr4[17] = i4;
        iArr4[16] = i4;
        iArr4[15] = i4;
        iArr4[14] = i4;
        int i5 = (i3 << 4) + i2;
        copyAdd(iArr4, 0, iArr, i5);
        copyAdd(genBuf, 2, iArr, i5 + 16);
        copyAdd(genBuf, 4, iArr, i5 + 32);
        copyAdd(genBuf, 6, iArr, i5 + 48);
        copyAdd(genBuf, 8, iArr, i5 + 64);
        copyAdd(genBuf, 10, iArr, i5 + 80);
        copyAdd(genBuf, 12, iArr, i5 + 96);
        copyAdd(genBuf, 14, iArr, i5 + 112);
    }

    private static void predictVertical(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        interpolateTop(z, z2, iArr2, iArr3, i + i2, i3, topBuf);
        int i4 = (i3 << 4) + i2;
        int i5 = 0;
        while (i5 < 8) {
            iArr[i4] = MathUtil.clip(iArr[i4] + topBuf[0], 0, 255);
            int i6 = i4 + 1;
            iArr[i6] = MathUtil.clip(iArr[i6] + topBuf[1], 0, 255);
            int i7 = i4 + 2;
            iArr[i7] = MathUtil.clip(iArr[i7] + topBuf[2], 0, 255);
            int i8 = i4 + 3;
            iArr[i8] = MathUtil.clip(iArr[i8] + topBuf[3], 0, 255);
            int i9 = i4 + 4;
            iArr[i9] = MathUtil.clip(iArr[i9] + topBuf[4], 0, 255);
            int i10 = i4 + 5;
            iArr[i10] = MathUtil.clip(iArr[i10] + topBuf[5], 0, 255);
            int i11 = i4 + 6;
            iArr[i11] = MathUtil.clip(iArr[i11] + topBuf[6], 0, 255);
            int i12 = i4 + 7;
            iArr[i12] = MathUtil.clip(iArr[i12] + topBuf[7], 0, 255);
            i5++;
            i4 += 16;
        }
    }

    private static void predictVerticalLeft(int[] iArr, boolean z, boolean z2, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        int[] iArr4 = iArr;
        interpolateTop(z, z2, iArr2, iArr3, i + i2, i3, topBuf);
        int[] iArr5 = genBuf;
        int[] iArr6 = topBuf;
        iArr5[0] = ((iArr6[0] + iArr6[1]) + 1) >> 1;
        iArr5[1] = ((iArr6[1] + iArr6[2]) + 1) >> 1;
        iArr5[2] = ((iArr6[2] + iArr6[3]) + 1) >> 1;
        iArr5[3] = ((iArr6[3] + iArr6[4]) + 1) >> 1;
        iArr5[4] = ((iArr6[4] + iArr6[5]) + 1) >> 1;
        iArr5[5] = ((iArr6[5] + iArr6[6]) + 1) >> 1;
        iArr5[6] = ((iArr6[6] + iArr6[7]) + 1) >> 1;
        iArr5[7] = ((iArr6[7] + iArr6[8]) + 1) >> 1;
        iArr5[8] = ((iArr6[8] + iArr6[9]) + 1) >> 1;
        iArr5[9] = ((iArr6[9] + iArr6[10]) + 1) >> 1;
        iArr5[10] = ((iArr6[10] + iArr6[11]) + 1) >> 1;
        iArr5[11] = (((iArr6[0] + iArr6[2]) + (iArr6[1] << 1)) + 2) >> 2;
        iArr5[12] = (((iArr6[1] + iArr6[3]) + (iArr6[2] << 1)) + 2) >> 2;
        iArr5[13] = (((iArr6[2] + iArr6[4]) + (iArr6[3] << 1)) + 2) >> 2;
        iArr5[14] = (((iArr6[3] + iArr6[5]) + (iArr6[4] << 1)) + 2) >> 2;
        iArr5[15] = (((iArr6[4] + iArr6[6]) + (iArr6[5] << 1)) + 2) >> 2;
        iArr5[16] = (((iArr6[5] + iArr6[7]) + (iArr6[6] << 1)) + 2) >> 2;
        iArr5[17] = (((iArr6[6] + iArr6[8]) + (iArr6[7] << 1)) + 2) >> 2;
        iArr5[18] = (((iArr6[7] + iArr6[9]) + (iArr6[8] << 1)) + 2) >> 2;
        iArr5[19] = (((iArr6[8] + iArr6[10]) + (iArr6[9] << 1)) + 2) >> 2;
        iArr5[20] = (((iArr6[9] + iArr6[11]) + (iArr6[10] << 1)) + 2) >> 2;
        iArr5[21] = (((iArr6[10] + iArr6[12]) + (iArr6[11] << 1)) + 2) >> 2;
        int i4 = (i3 << 4) + i2;
        copyAdd(iArr5, 0, iArr4, i4);
        copyAdd(genBuf, 11, iArr4, i4 + 16);
        copyAdd(genBuf, 1, iArr4, i4 + 32);
        copyAdd(genBuf, 12, iArr4, i4 + 48);
        copyAdd(genBuf, 2, iArr4, i4 + 64);
        copyAdd(genBuf, 13, iArr4, i4 + 80);
        copyAdd(genBuf, 3, iArr4, i4 + 96);
        copyAdd(genBuf, 14, iArr4, i4 + 112);
    }

    private static void predictVerticalRight(int[] iArr, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3) {
        int[] iArr5 = iArr;
        int i4 = i3;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr4;
        interpolateTop(true, z, iArr6, iArr7, i + i2, i3, topBuf);
        int[] iArr8 = iArr3;
        interpolateLeft(true, iArr6, iArr8, i4, leftBuf);
        int interpolateTopLeft = interpolateTopLeft(true, true, iArr6, iArr7, iArr8, i, i2, i3);
        int[] iArr9 = genBuf;
        int[] iArr10 = leftBuf;
        iArr9[0] = (((iArr10[5] + iArr10[3]) + (iArr10[4] << 1)) + 2) >> 2;
        iArr9[1] = (((iArr10[3] + iArr10[1]) + (iArr10[2] << 1)) + 2) >> 2;
        iArr9[2] = (((iArr10[1] + interpolateTopLeft) + (iArr10[0] << 1)) + 2) >> 2;
        int[] iArr11 = topBuf;
        iArr9[3] = ((iArr11[0] + interpolateTopLeft) + 1) >> 1;
        iArr9[4] = ((iArr11[0] + iArr11[1]) + 1) >> 1;
        iArr9[5] = ((iArr11[1] + iArr11[2]) + 1) >> 1;
        iArr9[6] = ((iArr11[2] + iArr11[3]) + 1) >> 1;
        iArr9[7] = ((iArr11[3] + iArr11[4]) + 1) >> 1;
        iArr9[8] = ((iArr11[4] + iArr11[5]) + 1) >> 1;
        iArr9[9] = ((iArr11[5] + iArr11[6]) + 1) >> 1;
        iArr9[10] = ((iArr11[6] + iArr11[7]) + 1) >> 1;
        iArr9[11] = (((iArr10[6] + iArr10[4]) + (iArr10[5] << 1)) + 2) >> 2;
        iArr9[12] = (((iArr10[4] + iArr10[2]) + (iArr10[3] << 1)) + 2) >> 2;
        iArr9[13] = (((iArr10[2] + iArr10[0]) + (iArr10[1] << 1)) + 2) >> 2;
        iArr9[14] = (((iArr10[0] + iArr11[0]) + (interpolateTopLeft << 1)) + 2) >> 2;
        iArr9[15] = (((interpolateTopLeft + iArr11[1]) + (iArr11[0] << 1)) + 2) >> 2;
        iArr9[16] = (((iArr11[0] + iArr11[2]) + (iArr11[1] << 1)) + 2) >> 2;
        iArr9[17] = (((iArr11[1] + iArr11[3]) + (iArr11[2] << 1)) + 2) >> 2;
        iArr9[18] = (((iArr11[2] + iArr11[4]) + (iArr11[3] << 1)) + 2) >> 2;
        iArr9[19] = (((iArr11[3] + iArr11[5]) + (iArr11[4] << 1)) + 2) >> 2;
        iArr9[20] = (((iArr11[4] + iArr11[6]) + (iArr11[5] << 1)) + 2) >> 2;
        iArr9[21] = (((iArr11[5] + iArr11[7]) + (iArr11[6] << 1)) + 2) >> 2;
        int i5 = (i4 << 4) + i2;
        copyAdd(iArr9, 3, iArr5, i5);
        copyAdd(genBuf, 14, iArr5, i5 + 16);
        copyAdd(genBuf, 2, iArr5, i5 + 32);
        copyAdd(genBuf, 13, iArr5, i5 + 48);
        copyAdd(genBuf, 1, iArr5, i5 + 64);
        copyAdd(genBuf, 12, iArr5, i5 + 80);
        copyAdd(genBuf, 0, iArr5, i5 + 96);
        copyAdd(genBuf, 11, iArr5, i5 + 112);
    }

    public static void predictWithMode(int i, int[] iArr, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr2, int[] iArr3, int[] iArr4, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                Assert.assertTrue(z2);
                predictVertical(iArr, z3, z4, iArr4, iArr3, i2, i3, i4);
                break;
            case 1:
                Assert.assertTrue(z);
                predictHorizontal(iArr, z3, iArr4, iArr2, i2, i3, i4);
                break;
            case 2:
                predictDC(iArr, z3, z4, z, z2, iArr4, iArr2, iArr3, i2, i3, i4);
                break;
            case 3:
                Assert.assertTrue(z2);
                predictDiagonalDownLeft(iArr, z3, z2, z4, iArr4, iArr3, i2, i3, i4);
                break;
            case 4:
                Assert.assertTrue(z2 && z && z3);
                predictDiagonalDownRight(iArr, z4, iArr4, iArr2, iArr3, i2, i3, i4);
                break;
            case 5:
                Assert.assertTrue(z2 && z && z3);
                predictVerticalRight(iArr, z4, iArr4, iArr2, iArr3, i2, i3, i4);
                break;
            case 6:
                Assert.assertTrue(z2 && z && z3);
                predictHorizontalDown(iArr, z4, iArr4, iArr2, iArr3, i2, i3, i4);
                break;
            case 7:
                Assert.assertTrue(z2);
                predictVerticalLeft(iArr, z3, z4, iArr4, iArr3, i2, i3, i4);
                break;
            case 8:
                Assert.assertTrue(z);
                predictHorizontalUp(iArr, z3, iArr4, iArr2, i2, i3, i4);
                break;
        }
        int i5 = i2 + i3;
        int i6 = (i4 << 4) + i3;
        int i7 = i6 + 7;
        int i8 = i4 >> 2;
        iArr4[i8] = iArr3[i5 + 7];
        for (int i9 = 0; i9 < 8; i9++) {
            iArr2[i4 + i9] = iArr[(i9 << 4) + i7];
        }
        int i10 = i6 + 112;
        for (int i11 = 0; i11 < 8; i11++) {
            iArr3[i5 + i11] = iArr[i10 + i11];
        }
        iArr4[i8 + 1] = iArr2[i4 + 3];
    }
}
