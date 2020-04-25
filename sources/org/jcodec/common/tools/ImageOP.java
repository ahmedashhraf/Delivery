package org.jcodec.common.tools;

import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;

public class ImageOP {
    public static void subImageWithFill(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        int min = Math.min(i2 - i6, i4);
        int min2 = Math.min(i - i5, i3);
        int i7 = (i6 * i) + i5;
        int i8 = 0;
        int i9 = 0;
        while (i8 < min) {
            int i10 = 0;
            while (i10 < min2) {
                iArr2[i9 + i10] = iArr[i7 + i10];
                i10++;
            }
            int i11 = iArr2[i10 - 1];
            while (i10 < i3) {
                iArr2[i9 + i10] = i11;
                i10++;
            }
            i7 += i;
            i9 += i3;
            i8++;
        }
        int i12 = i9 - i3;
        while (i8 < i4) {
            System.arraycopy(iArr2, i12, iArr2, i9, i3);
            i9 += i3;
            i8++;
        }
    }

    public static void subImageWithFill(Picture picture, Picture picture2, Rect rect) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        ColorSpace color = picture.getColor();
        int[][] data = picture.getData();
        for (int i = 0; i < data.length; i++) {
            subImageWithFill(data[i], width >> color.compWidth[i], height >> color.compHeight[i], picture2.getPlaneData(i), rect.getWidth() >> color.compWidth[i], rect.getHeight() >> color.compHeight[i], rect.getX() >> color.compWidth[i], rect.getY() >> color.compHeight[i]);
        }
    }
}
