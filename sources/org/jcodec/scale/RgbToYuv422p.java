package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class RgbToYuv422p implements Transform {
    private int downShift;
    private int downShiftChr;
    private int upShift;

    public RgbToYuv422p(int i, int i2) {
        this.upShift = i;
        this.downShift = i2;
        this.downShiftChr = i2 + 1;
    }

    public void transform(Picture picture, Picture picture2) {
        int[] iArr = picture.getData()[0];
        int[][] data = picture2.getData();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < picture.getHeight()) {
            int i4 = i3;
            int i5 = i2;
            int i6 = 0;
            while (i6 < (picture.getWidth() >> 1)) {
                data[1][i4] = 0;
                data[2][i4] = 0;
                int i7 = i4 << 1;
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i4;
                int i12 = i4;
                RgbToYuv420p.rgb2yuv(iArr[i5], iArr[i8], iArr[i9], data[0], i7, data[1], i11, data[2], i12);
                data[0][i7] = (data[0][i7] << this.upShift) >> this.downShift;
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                int i17 = i15 + 1;
                int i18 = i7 + 1;
                int i19 = i14;
                int i20 = i16;
                RgbToYuv420p.rgb2yuv(i19, i20, iArr[i15], data[0], i18, data[1], i11, data[2], i12);
                int[] iArr2 = data[0];
                int i21 = data[0][i18];
                int i22 = this.upShift;
                iArr2[i18] = (i21 << i22) >> this.downShift;
                int[] iArr3 = data[1];
                int i23 = data[1][i4] << i22;
                int i24 = this.downShiftChr;
                iArr3[i4] = i23 >> i24;
                data[2][i4] = (data[2][i4] << i22) >> i24;
                i4++;
                i6++;
                i5 = i17;
            }
            i++;
            i2 = i5;
            i3 = i4;
        }
    }
}
