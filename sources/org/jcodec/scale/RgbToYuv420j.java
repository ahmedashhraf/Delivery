package org.jcodec.scale;

import org.jcodec.common.model.Picture;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class RgbToYuv420j implements Transform {
    private static final int clip(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static final void rgb2yuv(int i, int i2, int i3, int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        int i7 = (i * 66) + (i2 * C13959t.f40835R1) + (i3 * 25);
        int i8 = ((i * 112) - (i2 * 94)) - (i3 * 18);
        int i9 = ((((i * -38) - (i2 * 74)) + (i3 * 112)) + 128) >> 8;
        int i10 = (i8 + 128) >> 8;
        iArr[i4] = clip(((i7 + 128) >> 8) + 16);
        iArr2[i5] = iArr2[i5] + clip(i9 + 128);
        iArr3[i6] = iArr3[i6] + clip(i10 + 128);
    }

    public void transform(Picture picture, Picture picture2) {
        int[] iArr = picture.getData()[0];
        int[][] data = picture2.getData();
        int width = picture.getWidth() * 3;
        int width2 = picture2.getWidth();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < (picture.getHeight() >> 1)) {
            int i5 = i2;
            for (int i6 = 0; i6 < (picture.getWidth() >> 1); i6++) {
                data[1][i5] = 0;
                data[2][i5] = 0;
                int i7 = i5;
                int i8 = i5;
                rgb2yuv(iArr[i4], iArr[i4 + 1], iArr[i4 + 2], data[0], i3, data[1], i7, data[2], i8);
                data[0][i3] = data[0][i3];
                int i9 = i4 + width;
                int i10 = i3 + width2;
                rgb2yuv(iArr[i9], iArr[i9 + 1], iArr[i9 + 2], data[0], i10, data[1], i7, data[2], i8);
                data[0][i10] = data[0][i10];
                int i11 = i3 + 1;
                rgb2yuv(iArr[i4 + 3], iArr[i4 + 4], iArr[i4 + 5], data[0], i11, data[1], i7, data[2], i8);
                data[0][i11] = data[0][i11];
                int i12 = i11 + width2;
                rgb2yuv(iArr[i9 + 3], iArr[i9 + 4], iArr[i9 + 5], data[0], i12, data[1], i7, data[2], i8);
                data[0][i12] = data[0][i12];
                i3 = i11 + 1;
                data[1][i5] = data[1][i5] >> 2;
                data[2][i5] = data[2][i5] >> 2;
                i5++;
                i4 += 6;
            }
            i3 += width2;
            i4 += width;
            i++;
            i2 = i5;
        }
    }
}
