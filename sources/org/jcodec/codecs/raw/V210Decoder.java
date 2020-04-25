package org.jcodec.codecs.raw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class V210Decoder {
    private int height;
    private int width;

    public V210Decoder(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public Picture decode(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        IntBuffer wrap = IntBuffer.wrap(new int[(this.width * this.height)]);
        IntBuffer wrap2 = IntBuffer.wrap(new int[((this.width * this.height) / 2)]);
        IntBuffer wrap3 = IntBuffer.wrap(new int[((this.width * this.height) / 2)]);
        while (asIntBuffer.hasRemaining()) {
            int i = asIntBuffer.get();
            wrap3.put(i >> 20);
            wrap.put((i >> 10) & 1023);
            wrap2.put(i & 1023);
            int i2 = asIntBuffer.get();
            wrap.put(i2 & 1023);
            wrap.put(i2 >> 20);
            wrap2.put((i2 >> 10) & 1023);
            int i3 = asIntBuffer.get();
            wrap2.put(i3 >> 20);
            wrap.put((i3 >> 10) & 1023);
            wrap3.put(i3 & 1023);
            int i4 = asIntBuffer.get();
            wrap.put(i4 & 1023);
            wrap.put(i4 >> 20);
            wrap3.put((i4 >> 10) & 1023);
        }
        return new Picture(this.width, this.height, new int[][]{wrap.array(), wrap2.array(), wrap3.array()}, ColorSpace.YUV422_10);
    }
}
