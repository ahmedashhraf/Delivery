package org.jcodec.scale;

import org.jcodec.common.model.Picture;
import org.jcodec.common.tools.MathUtil;

public class Yuv420jToRgb implements Transform {
    private static final int FIX_0_71414 = FIX(0.71414d);
    private static final int FIX_1_402 = FIX(1.402d);
    private static final int FIX_1_772 = FIX(1.772d);
    private static final int ONE_HALF = 512;
    private static final int SCALEBITS = 10;
    private static final int _FIX_0_34414 = (-FIX(0.34414d));

    private static final int FIX(double d) {
        return (int) ((d * 1024.0d) + 0.5d);
    }

    public static final void YUVJtoRGB(int i, int i2, int i3, int[] iArr, int i4) {
        int i5 = i << 10;
        int i6 = i2 - 128;
        int i7 = i3 - 128;
        int i8 = ((_FIX_0_34414 * i6) - (FIX_0_71414 * i7)) + 512;
        int i9 = (((FIX_1_402 * i7) + 512) + i5) >> 10;
        int i10 = (i8 + i5) >> 10;
        iArr[i4] = MathUtil.clip((i5 + ((FIX_1_772 * i6) + 512)) >> 10, 0, 255);
        iArr[i4 + 1] = MathUtil.clip(i10, 0, 255);
        iArr[i4 + 2] = MathUtil.clip(i9, 0, 255);
    }

    public final void transform(Picture picture, Picture picture2) {
        Picture picture3 = picture;
        int[] planeData = picture3.getPlaneData(0);
        int[] planeData2 = picture3.getPlaneData(1);
        int[] planeData3 = picture3.getPlaneData(2);
        int[] planeData4 = picture2.getPlaneData(0);
        int width = picture2.getWidth();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < (picture2.getHeight() >> 1); i3++) {
            int i4 = i2;
            for (int i5 = 0; i5 < (picture2.getWidth() >> 1); i5++) {
                int i6 = (i5 << 1) + i;
                YUVJtoRGB(planeData[i6], planeData2[i4], planeData3[i4], planeData4, i6 * 3);
                int i7 = i6 + 1;
                YUVJtoRGB(planeData[i7], planeData2[i4], planeData3[i4], planeData4, i7 * 3);
                int i8 = i6 + width;
                YUVJtoRGB(planeData[i8], planeData2[i4], planeData3[i4], planeData4, i8 * 3);
                int i9 = i8 + 1;
                YUVJtoRGB(planeData[i9], planeData2[i4], planeData3[i4], planeData4, i9 * 3);
                i4++;
            }
            if ((picture2.getWidth() & 1) != 0) {
                int width2 = (picture2.getWidth() - 1) + i;
                YUVJtoRGB(planeData[width2], planeData2[i4], planeData3[i4], planeData4, width2 * 3);
                int i10 = width2 + width;
                YUVJtoRGB(planeData[i10], planeData2[i4], planeData3[i4], planeData4, i10 * 3);
                i4++;
            }
            i2 = i4;
            i += width * 2;
        }
        if ((picture2.getHeight() & 1) != 0) {
            for (int i11 = 0; i11 < (picture2.getWidth() >> 1); i11++) {
                int i12 = (i11 << 1) + i;
                YUVJtoRGB(planeData[i12], planeData2[i2], planeData3[i2], planeData4, i12 * 3);
                int i13 = i12 + 1;
                YUVJtoRGB(planeData[i13], planeData2[i2], planeData3[i2], planeData4, i13 * 3);
                i2++;
            }
            if ((picture2.getWidth() & 1) != 0) {
                int width3 = i + (picture2.getWidth() - 1);
                YUVJtoRGB(planeData[width3], planeData2[i2], planeData3[i2], planeData4, width3 * 3);
            }
        }
    }
}
