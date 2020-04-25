package org.jcodec.codecs.vp8;

import java.lang.reflect.Array;

public class VP8DCT {
    private static final int cospi8sqrt2minus1 = 20091;
    private static final int sinpi8sqrt2 = 35468;

    public static int[] decodeDCT(int[] iArr) {
        int[] iArr2 = new int[16];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 0;
            int i4 = i + 8;
            int i5 = iArr[i3] + iArr[i4];
            int i6 = iArr[i3] - iArr[i4];
            int i7 = i + 4;
            int i8 = i + 12;
            int i9 = ((iArr[i7] * sinpi8sqrt2) >> 16) - (iArr[i8] + ((iArr[i8] * cospi8sqrt2minus1) >> 16));
            int i10 = iArr[i7] + ((iArr[i7] * cospi8sqrt2minus1) >> 16) + ((iArr[i8] * sinpi8sqrt2) >> 16);
            iArr2[i3] = i5 + i10;
            iArr2[i8] = i5 - i10;
            iArr2[i7] = i6 + i9;
            iArr2[i4] = i6 - i9;
            i++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 * 4;
            int i14 = i13 + 0;
            int i15 = i13 + 2;
            int i16 = iArr2[i14] + iArr2[i15];
            int i17 = iArr2[i14] - iArr2[i15];
            int i18 = i13 + 1;
            int i19 = i13 + 3;
            int i20 = ((iArr2[i18] * sinpi8sqrt2) >> 16) - (iArr2[i19] + ((iArr2[i19] * cospi8sqrt2minus1) >> 16));
            int i21 = iArr2[i18] + ((iArr2[i18] * cospi8sqrt2minus1) >> 16) + ((iArr2[i19] * sinpi8sqrt2) >> 16);
            iArr2[i14] = ((i16 + i21) + 4) >> 3;
            iArr2[i19] = ((i16 - i21) + 4) >> 3;
            iArr2[i18] = ((i17 + i20) + 4) >> 3;
            iArr2[i15] = ((i17 - i20) + 4) >> 3;
            i11++;
        }
        return iArr2;
    }

    public static int[] decodeWHT(int[] iArr) {
        int[] iArr2 = new int[16];
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, new int[]{4, 4});
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 0;
            int i4 = i + 12;
            int i5 = iArr[i3] + iArr[i4];
            int i6 = i + 4;
            int i7 = i + 8;
            int i8 = iArr[i6] + iArr[i7];
            int i9 = iArr[i6] - iArr[i7];
            int i10 = iArr[i3] - iArr[i4];
            iArr2[i3] = i5 + i8;
            iArr2[i6] = i9 + i10;
            iArr2[i7] = i5 - i8;
            iArr2[i4] = i10 - i9;
            i++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 0;
            int i14 = i11 + 3;
            int i15 = iArr2[i13] + iArr2[i14];
            int i16 = i11 + 1;
            int i17 = i11 + 2;
            int i18 = iArr2[i16] + iArr2[i17];
            int i19 = iArr2[i16] - iArr2[i17];
            int i20 = iArr2[i13] - iArr2[i14];
            int i21 = i15 + i18;
            int i22 = i19 + i20;
            int i23 = i15 - i18;
            int i24 = i20 - i19;
            int i25 = (i21 + 3) >> 3;
            iArr2[i13] = i25;
            int i26 = (i22 + 3) >> 3;
            iArr2[i16] = i26;
            int i27 = (i23 + 3) >> 3;
            iArr2[i17] = i27;
            int i28 = (i24 + 3) >> 3;
            iArr2[i14] = i28;
            iArr3[0][i12] = i25;
            iArr3[1][i12] = i26;
            iArr3[2][i12] = i27;
            iArr3[3][i12] = i28;
            i11 += 4;
        }
        return iArr2;
    }

    public static int[] encodeDCT(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i + 0;
            int i5 = i + 3;
            int i6 = (iArr[i4] + iArr[i5]) << 3;
            int i7 = i + 1;
            int i8 = i + 2;
            int i9 = (iArr[i7] + iArr[i8]) << 3;
            int i10 = (iArr[i7] - iArr[i8]) << 3;
            int i11 = (iArr[i4] - iArr[i5]) << 3;
            iArr2[i2 + 0] = i6 + i9;
            iArr2[i2 + 2] = i6 - i9;
            iArr2[i2 + 1] = (((i10 * 2217) + (i11 * 5352)) + 14500) >> 12;
            iArr2[i2 + 3] = (((i11 * 2217) - (i10 * 5352)) + 7500) >> 12;
            i += 4;
            i2 += 4;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i12 + 0;
            int i16 = i12 + 12;
            int i17 = iArr2[i15] + iArr2[i16];
            int i18 = i12 + 4;
            int i19 = i12 + 8;
            int i20 = iArr2[i18] + iArr2[i19];
            int i21 = iArr2[i18] - iArr2[i19];
            int i22 = iArr2[i15] - iArr2[i16];
            iArr2[i13 + 0] = ((i17 + i20) + 7) >> 4;
            iArr2[i13 + 8] = ((i17 - i20) + 7) >> 4;
            iArr2[i13 + 4] = ((((i21 * 2217) + (i22 * 5352)) + 12000) >> 16) + (i22 != 0 ? 1 : 0);
            iArr2[i13 + 12] = (((i22 * 2217) - (i21 * 5352)) + 51000) >> 16;
            i12++;
            i13++;
        }
        return iArr2;
    }

    public static int[] encodeWHT(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i >= 4) {
                break;
            }
            int i5 = i2 + 0;
            int i6 = i2 + 2;
            int i7 = (iArr[i5] + iArr[i6]) << 2;
            int i8 = i2 + 1;
            int i9 = i2 + 3;
            int i10 = (iArr[i8] + iArr[i9]) << 2;
            int i11 = (iArr[i8] - iArr[i9]) << 2;
            int i12 = (iArr[i5] - iArr[i6]) << 2;
            int i13 = i3 + 0;
            int i14 = i7 + i10;
            if (i7 == 0) {
                i4 = 0;
            }
            iArr2[i13] = i14 + i4;
            iArr2[i3 + 1] = i12 + i11;
            iArr2[i3 + 2] = i12 - i11;
            iArr2[i3 + 3] = i7 - i10;
            i2 += 4;
            i3 += 4;
            i++;
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i15 + 0;
            int i19 = i15 + 8;
            int i20 = iArr2[i18] + iArr2[i19];
            int i21 = i15 + 4;
            int i22 = i15 + 12;
            int i23 = iArr2[i21] + iArr2[i22];
            int i24 = iArr2[i21] - iArr2[i22];
            int i25 = iArr2[i18] - iArr2[i19];
            int i26 = i20 + i23;
            int i27 = i25 + i24;
            int i28 = i25 - i24;
            int i29 = i20 - i23;
            int i30 = i27 + (i27 < 0 ? 1 : 0);
            int i31 = i28 + (i28 < 0 ? 1 : 0);
            int i32 = i29 + (i29 < 0 ? 1 : 0);
            iArr2[i16 + 0] = ((i26 + (i26 < 0 ? 1 : 0)) + 3) >> 3;
            iArr2[i16 + 4] = (i30 + 3) >> 3;
            iArr2[i16 + 8] = (i31 + 3) >> 3;
            iArr2[i16 + 12] = (i32 + 3) >> 3;
            i15++;
            i16++;
        }
        return iArr2;
    }
}
