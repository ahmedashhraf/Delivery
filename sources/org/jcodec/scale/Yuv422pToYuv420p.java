package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv422pToYuv420p implements Transform {
    private int shiftDown;
    private int shiftUp;

    public Yuv422pToYuv420p(int i, int i2) {
        this.shiftUp = i;
        this.shiftDown = i2;
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
                iArr2[i6] = ((iArr[i7] + iArr[i7 + i]) + 1) >> 1;
                i8++;
                i6++;
                i7++;
            }
            i4 = i7 + i;
            i3++;
            i5 = i6;
        }
    }

    private void down(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = iArr[i2] >> i;
        }
    }

    /* renamed from: up */
    private void m68707up(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = iArr[i2] << i;
        }
    }

    public void transform(Picture picture, Picture picture2) {
        System.arraycopy(picture.getPlaneData(0), 0, picture2.getPlaneData(0), 0, picture.getWidth() * picture.getHeight());
        copyAvg(picture.getPlaneData(1), picture2.getPlaneData(1), picture.getPlaneWidth(1), picture.getPlaneHeight(1));
        copyAvg(picture.getPlaneData(2), picture2.getPlaneData(2), picture.getPlaneWidth(2), picture.getPlaneHeight(2));
        int i = this.shiftUp;
        int i2 = this.shiftDown;
        if (i > i2) {
            m68707up(picture2.getPlaneData(0), this.shiftUp - this.shiftDown);
            m68707up(picture2.getPlaneData(1), this.shiftUp - this.shiftDown);
            m68707up(picture2.getPlaneData(2), this.shiftUp - this.shiftDown);
        } else if (i2 > i) {
            down(picture2.getPlaneData(0), this.shiftDown - this.shiftUp);
            down(picture2.getPlaneData(1), this.shiftDown - this.shiftUp);
            down(picture2.getPlaneData(2), this.shiftDown - this.shiftUp);
        }
    }
}
