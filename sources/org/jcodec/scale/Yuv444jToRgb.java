package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv444jToRgb implements Transform {
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
                Yuv420jToRgb.YUVJtoRGB(planeData[i5], planeData2[i5], planeData3[i5], planeData4, i4);
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
