package org.jcodec.codecs.h264.decode;

public class Interpolator {
    private static int PADDING = 16;

    private int roundAndClip1024(int i) {
        int i2 = (i + 512) >> 10;
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    private int roundAndClip32(int i) {
        int i2 = (i + 16) >> 5;
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void fillFullPel(int[] iArr, int i, int i2, int[] iArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((PADDING * 2) + i) * 4;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = (PADDING + i8) * 4;
            for (int i10 = 0; i10 < i; i10++) {
                iArr2[(i9 * i7) + ((PADDING + i10) * 4)] = iArr[(i8 * i) + i10];
            }
            int i11 = 0;
            while (true) {
                i6 = PADDING;
                if (i11 >= i6) {
                    break;
                }
                iArr2[(i9 * i7) + (i11 * 4)] = iArr[i8 * i];
                i11++;
            }
            for (int i12 = i6 + i; i12 < (PADDING * 2) + i; i12++) {
                iArr2[(i9 * i7) + (i12 * 4)] = iArr[((i8 * i) + i) - 1];
            }
        }
        int i13 = 0;
        while (true) {
            i3 = PADDING;
            if (i13 >= i3) {
                break;
            }
            int i14 = i13 * 4;
            for (int i15 = 0; i15 < i; i15++) {
                iArr2[(i14 * i7) + ((PADDING + i15) * 4)] = iArr[i15];
            }
            int i16 = 0;
            while (true) {
                i5 = PADDING;
                if (i16 >= i5) {
                    break;
                }
                iArr2[(i14 * i7) + (i16 * 4)] = iArr[0];
                i16++;
            }
            for (int i17 = i5 + i; i17 < (PADDING * 2) + i; i17++) {
                iArr2[(i14 * i7) + (i17 * 4)] = iArr[i - 1];
            }
            i13++;
        }
        for (int i18 = i3 + i2; i18 < (PADDING * 2) + i2; i18++) {
            int i19 = i18 * 4;
            for (int i20 = 0; i20 < i; i20++) {
                iArr2[(i19 * i7) + ((PADDING + i20) * 4)] = iArr[((i2 - 1) * i) + i20];
            }
            int i21 = 0;
            while (true) {
                i4 = PADDING;
                if (i21 >= i4) {
                    break;
                }
                iArr2[(i19 * i7) + (i21 * 4)] = iArr[(i2 - 1) * i];
                i21++;
            }
            for (int i22 = i4 + i; i22 < (PADDING * 2) + i; i22++) {
                iArr2[(i19 * i7) + (i22 * 4)] = iArr[(((i2 - 1) * i) + i) - 1];
            }
        }
    }

    public int[] interpolateChroma(int[] iArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 << 3;
        int[] iArr2 = new int[((i4 << 3) * i5)];
        int i6 = 0;
        while (i6 < i4) {
            int i7 = 0;
            while (i7 < i3) {
                for (int i8 = 0; i8 < 8; i8++) {
                    for (int i9 = 0; i9 < 8; i9++) {
                        int i10 = (i6 * i3) + i7;
                        int i11 = (i6 < i4 + -1 ? i3 : 0) + i10;
                        int i12 = (i7 < i3 + -1 ? 1 : 0) + i10;
                        int i13 = 8 - i9;
                        int i14 = 8 - i8;
                        iArr2[(((i6 << 3) + i8) * i5) + (i7 << 3) + i9] = ((((((i13 * i14) * iArr[i10]) + ((i14 * i9) * iArr[i12])) + ((i13 * i8) * iArr[i11])) + ((i9 * i8) * iArr[(i12 + i11) - i10])) + 32) >> 6;
                    }
                }
                i7++;
            }
            i6++;
        }
        return iArr2;
    }

    public int[] interpolateLuma(int[] iArr, int i, int i2) {
        int i3 = PADDING;
        int i4 = ((i3 * 2) + i) * 4;
        int i5 = ((i3 * 2) + i2) * 4;
        int[] iArr2 = new int[(i4 * i5)];
        fillFullPel(iArr, i, i2, iArr2);
        scanHPelHorizontalWithRound(i4, i5, iArr2);
        scanHPelVertical(i4, i5, iArr2);
        scanHPelCenterWidhRound(i4, i5, iArr2);
        roundHPelVertical(i4, i5, iArr2);
        scanQPel(i4, i5, iArr2);
        return iArr2;
    }

    /* access modifiers changed from: protected */
    public void roundHPelVertical(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i; i3 += 4) {
            for (int i4 = 0; i4 < i2; i4 += 4) {
                int i5 = ((i4 + 2) * i) + i3;
                iArr[i5] = roundAndClip32(iArr[i5]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void scanHPelCenterWidhRound(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i2; i3 += 4) {
            int i4 = (i3 + 2) * i;
            int i5 = iArr[i4];
            int i6 = iArr[i4];
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 4];
            int i9 = iArr[i4 + 8];
            int i10 = iArr[i4 + 12];
            int i11 = i9;
            int i12 = i8;
            int i13 = i7;
            int i14 = i6;
            int i15 = i5;
            int i16 = 0;
            while (i16 < i) {
                iArr[i4 + i16 + 2] = roundAndClip1024(((((i15 - (i14 * 5)) + (i13 * 20)) + (i12 * 20)) - (i11 * 5)) + i10);
                int i17 = i16 + 16;
                i16 += 4;
                int i18 = i10;
                i10 = i17 < i ? iArr[i17 + i4] : i10;
                i15 = i14;
                i14 = i13;
                i13 = i12;
                i12 = i11;
                i11 = i18;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void scanHPelHorizontalWithRound(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i2; i3 += 4) {
            int i4 = i3 * i;
            int i5 = iArr[i4];
            int i6 = iArr[i4];
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 4];
            int i9 = iArr[i4 + 8];
            int i10 = iArr[i4 + 12];
            int i11 = i9;
            int i12 = i8;
            int i13 = i7;
            int i14 = i6;
            int i15 = i5;
            int i16 = 0;
            while (i16 < i) {
                iArr[i4 + i16 + 2] = roundAndClip32(((((i15 - (i14 * 5)) + (i13 * 20)) + (i12 * 20)) - (i11 * 5)) + i10);
                int i17 = i16 + 16;
                i16 += 4;
                int i18 = i10;
                i10 = i17 < i ? iArr[i17 + i4] : i10;
                i15 = i14;
                i14 = i13;
                i13 = i12;
                i12 = i11;
                i11 = i18;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void scanHPelVertical(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i; i3 += 4) {
            int i4 = iArr[i3];
            int i5 = iArr[i3];
            int i6 = iArr[i3];
            int i7 = iArr[(i * 4) + i3];
            int i8 = iArr[(i * 8) + i3];
            int i9 = iArr[(i * 12) + i3];
            int i10 = i8;
            int i11 = i7;
            int i12 = i6;
            int i13 = i5;
            int i14 = i4;
            int i15 = 0;
            while (i15 < i2) {
                iArr[((i15 + 2) * i) + i3] = ((((i14 - (i13 * 5)) + (i12 * 20)) + (i11 * 20)) - (i10 * 5)) + i9;
                int i16 = i15 + 16;
                i15 += 4;
                int i17 = i9;
                i9 = i16 < i2 ? iArr[(i16 * i) + i3] : i9;
                i14 = i13;
                i13 = i12;
                i12 = i11;
                i11 = i10;
                i10 = i17;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void scanQPel(int i, int i2, int[] iArr) {
        int i3;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            while (i5 < i) {
                int i6 = (i4 * i) + i5;
                int i7 = i2 - 2;
                int i8 = i4 < i7 ? iArr[(i * 2) + i6] : iArr[i6];
                int i9 = i - 2;
                int i10 = i5 < i9 ? iArr[i6 + 2] : iArr[i6];
                if (i4 < i7 && i5 < i9) {
                    i3 = iArr[(i * 2) + i6 + 2];
                } else if (i4 < i7) {
                    i3 = iArr[(i * 2) + i6];
                } else if (i5 < i9) {
                    i3 = iArr[i6 + 2];
                } else {
                    i3 = iArr[i6];
                }
                int i11 = i6 + i;
                iArr[i11] = ((iArr[i6] + i8) + 1) >> 1;
                iArr[i6 + 1] = ((iArr[i6] + i10) + 1) >> 1;
                if (i5 % 4 == i4 % 4) {
                    iArr[i11 + 1] = ((i10 + i8) + 1) >> 1;
                } else {
                    iArr[i11 + 1] = ((iArr[i6] + i3) + 1) >> 1;
                }
                i5 += 2;
            }
            i4 += 2;
        }
    }
}
