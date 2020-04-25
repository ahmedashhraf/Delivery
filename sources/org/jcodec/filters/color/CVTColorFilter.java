package org.jcodec.filters.color;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.jcodec.common.model.Picture;

public class CVTColorFilter {
    private static byte blue(int i, int i2) {
        int i3 = (((i2 * 1192) + (i * 2064)) + 512) >> 10;
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 > 1023) {
            i3 = 1023;
        }
        return (byte) ((i3 >> 2) & 255);
    }

    private static byte green(int i, int i2, int i3) {
        int i4 = ((((i3 * 1192) - (i * 400)) - (i2 * 832)) + 512) >> 10;
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 1023) {
            i4 = 1023;
        }
        return (byte) ((i4 >> 2) & 255);
    }

    private static byte red(int i, int i2) {
        int i3 = (((i2 * 1192) + (i * 1636)) + 512) >> 10;
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 > 1023) {
            i3 = 1023;
        }
        return (byte) ((i3 >> 2) & 255);
    }

    public void yuv42210BitTObgr24(Picture picture, ByteBuffer byteBuffer) {
        IntBuffer wrap = IntBuffer.wrap(picture.getPlaneData(0));
        IntBuffer wrap2 = IntBuffer.wrap(picture.getPlaneData(1));
        IntBuffer wrap3 = IntBuffer.wrap(picture.getPlaneData(2));
        while (wrap.hasRemaining()) {
            int i = wrap.get() - 64;
            int i2 = wrap.get() - 64;
            int i3 = wrap2.get() - 512;
            int i4 = wrap3.get() - 512;
            byteBuffer.put(blue(i3, i));
            byteBuffer.put(green(i3, i4, i));
            byteBuffer.put(red(i4, i));
            byteBuffer.put(blue(i3, i2));
            byteBuffer.put(green(i3, i4, i2));
            byteBuffer.put(red(i4, i2));
        }
    }
}
