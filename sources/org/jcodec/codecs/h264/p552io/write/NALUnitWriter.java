package org.jcodec.codecs.h264.p552io.write;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.common.NIOUtils;

/* renamed from: org.jcodec.codecs.h264.io.write.NALUnitWriter */
public class NALUnitWriter {
    private static ByteBuffer _MARKER = ByteBuffer.allocate(4);

    /* renamed from: to */
    private final WritableByteChannel f44749to;

    static {
        _MARKER.putInt(1);
        _MARKER.flip();
    }

    public NALUnitWriter(WritableByteChannel writableByteChannel) {
        this.f44749to = writableByteChannel;
    }

    private void emprev(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer duplicate = byteBuffer2.duplicate();
        byte b = 1;
        byte b2 = 1;
        while (duplicate.hasRemaining()) {
            byte b3 = duplicate.get();
            if (b == 0 && b2 == 0 && (b3 & 3) == b3) {
                byteBuffer.put(3);
                b2 = 3;
            } else {
                b2 = b;
            }
            byteBuffer.put(b3);
            b = b3;
        }
    }

    public void writeUnit(NALUnit nALUnit, ByteBuffer byteBuffer) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 1024);
        NIOUtils.write(allocate, _MARKER);
        nALUnit.write(allocate);
        emprev(allocate, byteBuffer);
        allocate.flip();
        this.f44749to.write(allocate);
    }
}
