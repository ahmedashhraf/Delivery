package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv420jToYuv420 implements Transform {
    public static int Y_COEFF = 7168;

    public void transform(Picture picture, Picture picture2) {
        int[] planeData = picture.getPlaneData(0);
        int[] planeData2 = picture2.getPlaneData(0);
        for (int i = 0; i < picture.getPlaneWidth(0) * picture.getPlaneHeight(0); i++) {
            planeData2[i] = ((planeData[i] * Y_COEFF) >> 13) + 16;
        }
        int[] planeData3 = picture.getPlaneData(1);
        int[] planeData4 = picture2.getPlaneData(1);
        for (int i2 = 0; i2 < picture.getPlaneWidth(1) * picture.getPlaneHeight(1); i2++) {
            planeData4[i2] = (((planeData3[i2] - 128) * Y_COEFF) >> 13) + 128;
        }
        int[] planeData5 = picture.getPlaneData(2);
        int[] planeData6 = picture2.getPlaneData(2);
        for (int i3 = 0; i3 < picture.getPlaneWidth(2) * picture.getPlaneHeight(2); i3++) {
            planeData6[i3] = (((planeData5[i3] - 128) * Y_COEFF) >> 13) + 128;
        }
    }
}
