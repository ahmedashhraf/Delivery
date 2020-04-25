package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv444jToYuv420p implements Transform {
    public static int Y_COEFF = 7168;

    private void copyAvg(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < (i2 >> 1)) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            while (i8 < i) {
                int i9 = iArr[i7] - 128;
                int i10 = Y_COEFF;
                int i11 = i7 + i;
                int i12 = (((iArr[i11] - 128) * i10) >> 13) + 128;
                iArr2[i6] = (((((((i9 * i10) >> 13) + 128) + ((((iArr[i7 + 1] - 128) * i10) >> 13) + 128)) + i12) + ((((iArr[i11 + 1] - 128) * i10) >> 13) + 128)) + 2) >> 2;
                i8 += 2;
                i6++;
                i7 += 2;
            }
            i4 = i7 + i;
            i3++;
            i5 = i6;
        }
    }

    public void transform(Picture picture, Picture picture2) {
        int[] planeData = picture.getPlaneData(0);
        int[] planeData2 = picture2.getPlaneData(0);
        for (int i = 0; i < picture.getPlaneWidth(0) * picture.getPlaneHeight(0); i++) {
            planeData2[i] = ((planeData[i] * Y_COEFF) >> 13) + 16;
        }
        copyAvg(picture.getPlaneData(1), picture2.getPlaneData(1), picture.getPlaneWidth(1), picture.getPlaneHeight(1));
        copyAvg(picture.getPlaneData(2), picture2.getPlaneData(2), picture.getPlaneWidth(2), picture.getPlaneHeight(2));
    }
}
