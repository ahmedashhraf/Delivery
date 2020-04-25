package org.jcodec.scale;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.IntBuffer;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class BitmapUtil {
    private static ThreadLocal<int[]> buffer = new ThreadLocal<>();

    public static Picture fromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Picture create = Picture.create(bitmap.getWidth(), bitmap.getHeight(), ColorSpace.RGB);
        fromBitmap(bitmap, create);
        return create;
    }

    private static int[] getBuffer(Picture picture) {
        int[] iArr = (int[]) buffer.get();
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[(picture.getWidth() * picture.getHeight())];
        buffer.set(iArr2);
        return iArr2;
    }

    public static Bitmap toBitmap(Picture picture) {
        if (picture == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(picture.getCroppedWidth(), picture.getCroppedHeight(), Config.ARGB_8888);
        toBitmap(picture, createBitmap);
        return createBitmap;
    }

    public static void fromBitmap(Bitmap bitmap, Picture picture) {
        int[] planeData = picture.getPlaneData(0);
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < bitmap.getHeight()) {
            int i4 = i3;
            int i5 = i2;
            int i6 = 0;
            while (i6 < bitmap.getWidth()) {
                int i7 = iArr[i5];
                planeData[i4] = (i7 >> 16) & 255;
                planeData[i4 + 1] = (i7 >> 8) & 255;
                planeData[i4 + 2] = i7 & 255;
                i6++;
                i5++;
                i4 += 3;
            }
            i++;
            i2 = i5;
            i3 = i4;
        }
    }

    public static void toBitmap(Picture picture, Bitmap bitmap) {
        int[] planeData = picture.getPlaneData(0);
        int[] buffer2 = getBuffer(picture);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < picture.getCroppedHeight()) {
            int i4 = i2;
            int i5 = 0;
            while (i5 < picture.getCroppedWidth()) {
                buffer2[i4] = -16777216 | (planeData[i3] << 16) | (planeData[i3 + 1] << 8) | planeData[i3 + 2];
                i5++;
                i4++;
                i3 += 3;
            }
            i3 += picture.getWidth() - picture.getCroppedWidth();
            i++;
            i2 = i4;
        }
        bitmap.copyPixelsFromBuffer(IntBuffer.wrap(buffer2));
    }
}
