package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv422pToYuv420j implements Transform {
    public static int COEFF = 9362;
    private int halfDst;
    private int halfSrc;
    private int shift;

    public Yuv422pToYuv420j(int i, int i2) {
        int i3 = i2 + 13;
        this.shift = i3 - i;
        if (this.shift >= 0) {
            this.halfSrc = 128 << Math.max(i2 - i, 0);
            this.halfDst = 128 << Math.max(i - i2, 0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Maximum upshift allowed: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    private void copyAvg(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2 / 2) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            while (i8 < i) {
                int i9 = iArr[i7];
                int i10 = this.halfSrc;
                int i11 = i9 - i10;
                int i12 = COEFF;
                int i13 = i11 * i12;
                int i14 = this.shift;
                int i15 = i13 >> i14;
                int i16 = this.halfDst;
                iArr2[i6] = (((i15 + i16) + ((((iArr[i7 + i] - i10) * i12) >> i14) + i16)) + 1) >> 1;
                i8++;
                i6++;
                i7++;
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
            planeData2[i] = ((planeData[i] - 16) * COEFF) >> this.shift;
        }
        copyAvg(picture.getPlaneData(1), picture2.getPlaneData(1), picture.getPlaneWidth(1), picture.getPlaneHeight(1));
        copyAvg(picture.getPlaneData(2), picture2.getPlaneData(2), picture.getPlaneWidth(2), picture.getPlaneHeight(2));
    }
}
