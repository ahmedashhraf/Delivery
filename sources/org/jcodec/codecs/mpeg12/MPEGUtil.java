package org.jcodec.codecs.mpeg12;

import androidx.core.app.C0753l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MPEGUtil {
    public static final ByteBuffer gotoMarker(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        int position = byteBuffer.position();
        ByteBuffer slice = byteBuffer.slice();
        slice.order(ByteOrder.BIG_ENDIAN);
        byte b = -1;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            b = (b << 8) | (byteBuffer.get() & 255);
            if (b >= i2 && b <= i3) {
                if (i == 0) {
                    byteBuffer.position(byteBuffer.position() - 4);
                    slice.limit(byteBuffer.position() - position);
                    break;
                }
                i--;
            }
        }
        return slice;
    }

    public static final ByteBuffer gotoNextMarker(ByteBuffer byteBuffer) {
        return gotoMarker(byteBuffer, 0, 256, C0753l.f3451u);
    }

    public static final ByteBuffer nextSegment(ByteBuffer byteBuffer) {
        gotoMarker(byteBuffer, 0, 256, C0753l.f3451u);
        return gotoMarker(byteBuffer, 1, 256, C0753l.f3451u);
    }
}
