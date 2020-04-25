package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv422jToRgb implements Transform {
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
            for (int i6 = 0; i6 < picture2.getWidth(); i6 += 2) {
                Yuv420jToRgb.YUVJtoRGB(planeData[i5], planeData2[i4], planeData3[i4], planeData4, i5 * 3);
                int i7 = i5 + 1;
                Yuv420jToRgb.YUVJtoRGB(planeData[i7], planeData2[i4], planeData3[i4], planeData4, i7 * 3);
                i5 += 2;
                i4++;
            }
            i++;
            i2 = i5;
            i3 = i4;
        }
    }
}
