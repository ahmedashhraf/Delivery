package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv444pToRgb implements Transform {
    private int downShift;
    private int upShift;

    public Yuv444pToRgb(int i, int i2) {
        this.downShift = i;
        this.upShift = i2;
    }

    public static final void YUV444toRGB888(int i, int i2, int i3, int[] iArr, int i4) {
        int i5 = i2 - 128;
        int i6 = i3 - 128;
        int i7 = (i - 16) * 298;
        int i8 = (((i6 * 409) + i7) + 128) >> 8;
        int i9 = (((i7 - (i5 * 100)) - (i6 * 208)) + 128) >> 8;
        iArr[i4] = crop(((i7 + (i5 * 516)) + 128) >> 8);
        iArr[i4 + 1] = crop(i9);
        iArr[i4 + 2] = crop(i8);
    }

    private static int crop(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public void transform(Picture picture, Picture picture2) {
        int[] planeData = picture.getPlaneData(0);
        int[] planeData2 = picture.getPlaneData(1);
        int[] planeData3 = picture.getPlaneData(2);
        int[] planeData4 = picture2.getPlaneData(0);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < picture2.getHeight()) {
            int i4 = i3;
            int i5 = i2;
            int i6 = 0;
            while (i6 < picture2.getWidth()) {
                int i7 = planeData[i5];
                int i8 = this.upShift;
                int i9 = i7 << i8;
                int i10 = this.downShift;
                YUV444toRGB888(i9 >> i10, (planeData2[i5] << i8) >> i10, (planeData3[i5] << i8) >> i10, planeData4, i4);
                i6++;
                i5++;
                i4 += 3;
            }
            i++;
            i2 = i5;
            i3 = i4;
        }
    }
}
