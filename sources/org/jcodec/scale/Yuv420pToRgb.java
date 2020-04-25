package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv420pToRgb implements Transform {
    private final int downShift;
    private final int upShift;

    public Yuv420pToRgb(int i, int i2) {
        this.upShift = i;
        this.downShift = i2;
    }

    public final void transform(Picture picture, Picture picture2) {
        Picture picture3 = picture;
        int[] planeData = picture3.getPlaneData(0);
        int i = 1;
        int[] planeData2 = picture3.getPlaneData(1);
        int[] planeData3 = picture3.getPlaneData(2);
        int[] planeData4 = picture2.getPlaneData(0);
        int width = picture2.getWidth();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < (picture2.getHeight() >> i)) {
            int i5 = i4;
            int i6 = 0;
            while (i6 < (picture2.getWidth() >> i)) {
                int i7 = (i6 << 1) + i3;
                int i8 = planeData[i7];
                int i9 = this.upShift;
                int i10 = i8 << i9;
                int i11 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i10 >> i11, (planeData2[i5] << i9) >> i11, (planeData3[i5] << i9) >> i11, planeData4, i7 * 3);
                int i12 = i7 + 1;
                int i13 = planeData[i12];
                int i14 = this.upShift;
                int i15 = i13 << i14;
                int i16 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i15 >> i16, (planeData2[i5] << i14) >> i16, (planeData3[i5] << i14) >> i16, planeData4, i12 * 3);
                int i17 = i7 + width;
                int i18 = planeData[i17];
                int i19 = this.upShift;
                int i20 = i18 << i19;
                int i21 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i20 >> i21, (planeData2[i5] << i19) >> i21, (planeData3[i5] << i19) >> i21, planeData4, i17 * 3);
                int i22 = i17 + 1;
                int i23 = planeData[i22];
                int i24 = this.upShift;
                int i25 = i23 << i24;
                int i26 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i25 >> i26, (planeData2[i5] << i24) >> i26, (planeData3[i5] << i24) >> i26, planeData4, i22 * 3);
                i5++;
                i6++;
                Picture picture4 = picture2;
                i = 1;
            }
            if ((picture2.getWidth() & 1) != 0) {
                int width2 = (picture2.getWidth() - 1) + i3;
                int i27 = planeData[width2];
                int i28 = this.upShift;
                int i29 = i27 << i28;
                int i30 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i29 >> i30, (planeData2[i5] << i28) >> i30, (planeData3[i5] << i28) >> i30, planeData4, width2 * 3);
                int i31 = width2 + width;
                int i32 = planeData[i31];
                int i33 = this.upShift;
                int i34 = i32 << i33;
                int i35 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i34 >> i35, (planeData2[i5] << i33) >> i35, (planeData3[i5] << i33) >> i35, planeData4, i31 * 3);
                i5++;
            }
            i4 = i5;
            i3 += width * 2;
            i2++;
            Picture picture5 = picture2;
            i = 1;
        }
        if ((picture2.getHeight() & 1) != 0) {
            int i36 = 0;
            for (int i37 = 1; i36 < (picture2.getWidth() >> i37); i37 = 1) {
                int i38 = (i36 << 1) + i3;
                int i39 = planeData[i38];
                int i40 = this.upShift;
                int i41 = i39 << i40;
                int i42 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i41 >> i42, (planeData2[i4] << i40) >> i42, (planeData3[i4] << i40) >> i42, planeData4, i38 * 3);
                int i43 = i38 + 1;
                int i44 = planeData[i43];
                int i45 = this.upShift;
                int i46 = i44 << i45;
                int i47 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i46 >> i47, (planeData2[i4] << i45) >> i47, (planeData3[i4] << i45) >> i47, planeData4, i43 * 3);
                i4++;
                i36++;
            }
            if ((picture2.getWidth() & 1) != 0) {
                int width3 = i3 + (picture2.getWidth() - 1);
                int i48 = planeData[width3];
                int i49 = this.upShift;
                int i50 = i48 << i49;
                int i51 = this.downShift;
                Yuv422pToRgb.YUV444toRGB888(i50 >> i51, (planeData2[i4] << i49) >> i51, (planeData3[i4] << i49) >> i51, planeData4, width3 * 3);
            }
        }
    }
}
