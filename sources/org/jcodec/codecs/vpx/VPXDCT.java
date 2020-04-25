package org.jcodec.codecs.vpx;

public class VPXDCT {
    public static int cospi8sqrt2minus1 = 20091;
    public static int sinpi8sqrt2 = 35468;

    public static void fdct4x4(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = i + 3;
            int i3 = (iArr[i] + iArr[i2]) << 3;
            int i4 = i + 1;
            int i5 = i + 2;
            int i6 = (iArr[i4] + iArr[i5]) << 3;
            int i7 = (iArr[i4] - iArr[i5]) << 3;
            int i8 = (iArr[i] - iArr[i2]) << 3;
            iArr[i] = i3 + i6;
            iArr[i5] = i3 - i6;
            iArr[i4] = (((i7 * 2217) + (i8 * 5352)) + 14500) >> 12;
            iArr[i2] = (((i8 * 2217) - (i7 * 5352)) + 7500) >> 12;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 + 12;
            int i11 = iArr[i9] + iArr[i10];
            int i12 = i9 + 4;
            int i13 = i9 + 8;
            int i14 = iArr[i12] + iArr[i13];
            int i15 = iArr[i12] - iArr[i13];
            int i16 = iArr[i9] - iArr[i10];
            iArr[i9] = ((i11 + i14) + 7) >> 4;
            iArr[i13] = ((i11 - i14) + 7) >> 4;
            iArr[i12] = ((((i15 * 2217) + (i16 * 5352)) + 12000) >> 16) + (i16 != 0 ? 1 : 0);
            iArr[i10] = (((i16 * 2217) - (i15 * 5352)) + 51000) >> 16;
        }
    }

    public static void idct4x4(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = i + 8;
            int i3 = iArr[i] + iArr[i2];
            int i4 = iArr[i] - iArr[i2];
            int i5 = i + 4;
            int i6 = iArr[i5];
            int i7 = sinpi8sqrt2;
            int i8 = (i6 * i7) >> 16;
            int i9 = i + 12;
            int i10 = iArr[i9];
            int i11 = iArr[i9];
            int i12 = cospi8sqrt2minus1;
            int i13 = i8 - (i10 + ((i11 * i12) >> 16));
            int i14 = iArr[i5] + ((iArr[i5] * i12) >> 16) + ((iArr[i9] * i7) >> 16);
            iArr[i] = i3 + i14;
            iArr[i9] = i3 - i14;
            iArr[i5] = i4 + i13;
            iArr[i2] = i4 - i13;
        }
        for (int i15 = 0; i15 < 16; i15 += 4) {
            int i16 = i15 + 2;
            int i17 = iArr[i15] + iArr[i16];
            int i18 = iArr[i15] - iArr[i16];
            int i19 = i15 + 1;
            int i20 = iArr[i19];
            int i21 = sinpi8sqrt2;
            int i22 = (i20 * i21) >> 16;
            int i23 = i15 + 3;
            int i24 = iArr[i23];
            int i25 = iArr[i23];
            int i26 = cospi8sqrt2minus1;
            int i27 = i22 - (i24 + ((i25 * i26) >> 16));
            int i28 = iArr[i19] + ((iArr[i19] * i26) >> 16) + ((iArr[i23] * i21) >> 16);
            iArr[i15] = ((i17 + i28) + 4) >> 3;
            iArr[i23] = ((i17 - i28) + 4) >> 3;
            iArr[i19] = ((i18 + i27) + 4) >> 3;
            iArr[i16] = ((i18 - i27) + 4) >> 3;
        }
    }

    public static void iwalsh4x4(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = i + 12;
            int i3 = iArr[i] + iArr[i2];
            int i4 = i + 4;
            int i5 = i + 8;
            int i6 = iArr[i4] + iArr[i5];
            int i7 = iArr[i4] - iArr[i5];
            int i8 = iArr[i] - iArr[i2];
            iArr[i] = i3 + i6;
            iArr[i4] = i7 + i8;
            iArr[i5] = i3 - i6;
            iArr[i2] = i8 - i7;
        }
        for (int i9 = 0; i9 < 16; i9 += 4) {
            int i10 = i9 + 3;
            int i11 = iArr[i9] + iArr[i10];
            int i12 = i9 + 1;
            int i13 = i9 + 2;
            int i14 = iArr[i12] + iArr[i13];
            int i15 = iArr[i12] - iArr[i13];
            int i16 = iArr[i9] - iArr[i10];
            int i17 = i11 + i14;
            int i18 = i15 + i16;
            int i19 = i11 - i14;
            int i20 = i16 - i15;
            iArr[i9] = (i17 + 3) >> 3;
            iArr[i12] = (i18 + 3) >> 3;
            iArr[i13] = (i19 + 3) >> 3;
            iArr[i10] = (i20 + 3) >> 3;
        }
    }

    public static void walsh4x4(int[] iArr) {
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= 16) {
                break;
            }
            int i3 = i + 2;
            int i4 = (iArr[i] + iArr[i3]) << 2;
            int i5 = i + 1;
            int i6 = i + 3;
            int i7 = (iArr[i5] + iArr[i6]) << 2;
            int i8 = (iArr[i5] - iArr[i6]) << 2;
            int i9 = (iArr[i] - iArr[i3]) << 2;
            int i10 = i4 + i7;
            if (i4 == 0) {
                i2 = 0;
            }
            iArr[i] = i10 + i2;
            iArr[i5] = i9 + i8;
            iArr[i3] = i9 - i8;
            iArr[i6] = i4 - i7;
            i += 4;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 + 8;
            int i13 = iArr[i11] + iArr[i12];
            int i14 = i11 + 4;
            int i15 = i11 + 12;
            int i16 = iArr[i14] + iArr[i15];
            int i17 = iArr[i14] - iArr[i15];
            int i18 = iArr[i11] - iArr[i12];
            int i19 = i13 + i16;
            int i20 = i18 + i17;
            int i21 = i18 - i17;
            int i22 = i13 - i16;
            int i23 = i20 + (i20 < 0 ? 1 : 0);
            int i24 = i21 + (i21 < 0 ? 1 : 0);
            int i25 = i22 + (i22 < 0 ? 1 : 0);
            iArr[i11] = ((i19 + (i19 < 0 ? 1 : 0)) + 3) >> 3;
            iArr[i14] = (i23 + 3) >> 3;
            iArr[i12] = (i24 + 3) >> 3;
            iArr[i15] = (i25 + 3) >> 3;
        }
    }
}
