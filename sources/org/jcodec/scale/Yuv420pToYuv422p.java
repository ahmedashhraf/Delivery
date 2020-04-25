package org.jcodec.scale;

import org.jcodec.common.model.Picture;

public class Yuv420pToYuv422p implements Transform {
    private int shiftDown;
    private int shiftUp;

    public Yuv420pToYuv422p(int i, int i2) {
        this.shiftUp = i;
        this.shiftDown = i2;
    }

    private static final void copy(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i + (i2 * i6);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i7) {
            int i14 = i13;
            int i15 = i11;
            int i16 = 0;
            while (i16 < i5) {
                int i17 = i14 + 1;
                iArr2[i15] = (iArr[i14] & 255) << 2;
                i15 += i3;
                i16++;
                i14 = i17;
            }
            int i18 = i15 - i3;
            int i19 = i5 * i3;
            while (i19 < i6) {
                iArr2[i15] = iArr2[i18];
                i15 += i3;
                i19 += i3;
            }
            i11 = ((i4 - 1) * i6) + i15;
            i12++;
            i13 = i14;
        }
        int i20 = i11 - (i4 * i6);
        int i21 = i7 * i4;
        while (i21 < i8) {
            int i22 = 0;
            while (i22 < i6) {
                iArr2[i11] = iArr2[i20 + i22];
                i11 += i3;
                i22 += i3;
            }
            i11 += (i4 - 1) * i6;
            i21 += i4;
        }
    }

    public void transform(Picture picture, Picture picture2) {
        Picture picture3 = picture;
        Picture picture4 = picture2;
        copy(picture3.getPlaneData(0), picture4.getPlaneData(0), picture.getWidth(), picture2.getWidth(), picture2.getHeight(), this.shiftUp, this.shiftDown);
        copy(picture3.getPlaneData(1), picture4.getPlaneData(1), 0, 0, 1, 2, picture.getWidth() >> 1, picture2.getWidth() >> 1, picture.getHeight() >> 1, picture2.getHeight(), this.shiftUp, this.shiftDown);
        copy(picture3.getPlaneData(1), picture4.getPlaneData(1), 0, 1, 1, 2, picture.getWidth() >> 1, picture2.getWidth() >> 1, picture.getHeight() >> 1, picture2.getHeight(), this.shiftUp, this.shiftDown);
        copy(picture3.getPlaneData(2), picture4.getPlaneData(2), 0, 0, 1, 2, picture.getWidth() >> 1, picture2.getWidth() >> 1, picture.getHeight() >> 1, picture2.getHeight(), this.shiftUp, this.shiftDown);
        copy(picture3.getPlaneData(2), picture4.getPlaneData(2), 0, 1, 1, 2, picture.getWidth() >> 1, picture2.getWidth() >> 1, picture.getHeight() >> 1, picture2.getHeight(), this.shiftUp, this.shiftDown);
    }

    private static void copy(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        int length = iArr.length / i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = i8;
            int i10 = i7;
            int i11 = 0;
            while (i11 < i) {
                int i12 = i10 + 1;
                int i13 = i9 + 1;
                iArr2[i10] = (iArr[i9] & 255) << 2;
                i11++;
                i10 = i12;
                i9 = i13;
            }
            int i14 = i;
            while (i14 < i2) {
                int i15 = i10 + 1;
                iArr2[i10] = iArr2[i - 1];
                i14++;
                i10 = i15;
            }
            i6++;
            i7 = i10;
            i8 = i9;
        }
        int i16 = (length - 1) * i2;
        while (length < i3) {
            int i17 = 0;
            while (i17 < i2) {
                int i18 = i7 + 1;
                iArr2[i7] = iArr2[i16 + i17];
                i17++;
                i7 = i18;
            }
            length++;
        }
    }
}
