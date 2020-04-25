package org.jcodec.common.dct;

import java.util.Arrays;

public class SparseIDCT {
    public static final int[][] COEFF = new int[64][];
    public static final int DC_SHIFT = 10;
    public static final int PRECISION = 13;

    static {
        int[][] iArr = COEFF;
        iArr[0] = new int[64];
        Arrays.fill(iArr[0], 1024);
        for (int i = 1; i < 64; i++) {
            int[][] iArr2 = COEFF;
            iArr2[i] = new int[64];
            iArr2[i][i] = 8192;
            SimpleIDCT10Bit.idct10(iArr2[i], 0);
        }
    }

    public static final void coeff(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < 64; i3 += 4) {
            int i4 = iArr[i3];
            int[][] iArr2 = COEFF;
            iArr[i3] = i4 + (iArr2[i][i3] * i2);
            int i5 = i3 + 1;
            iArr[i5] = iArr[i5] + (iArr2[i][i5] * i2);
            int i6 = i3 + 2;
            iArr[i6] = iArr[i6] + (iArr2[i][i6] * i2);
            int i7 = i3 + 3;
            iArr[i7] = iArr[i7] + (iArr2[i][i7] * i2);
        }
    }

    private static final int div(int i) {
        int i2 = i >> 31;
        int i3 = i >>> 31;
        return ((((i ^ i2) + i3) >> 13) ^ i2) + i3;
    }

    public static final void finish(int[] iArr) {
        for (int i = 0; i < 64; i += 4) {
            iArr[i] = div(iArr[i]);
            int i2 = i + 1;
            iArr[i2] = div(iArr[i2]);
            int i3 = i + 2;
            iArr[i3] = div(iArr[i3]);
            int i4 = i + 3;
            iArr[i4] = div(iArr[i4]);
        }
    }

    public static final void start(int[] iArr, int i) {
        int i2 = i << 10;
        for (int i3 = 0; i3 < 64; i3 += 4) {
            iArr[i3 + 0] = i2;
            iArr[i3 + 1] = i2;
            iArr[i3 + 2] = i2;
            iArr[i3 + 3] = i2;
        }
    }
}
