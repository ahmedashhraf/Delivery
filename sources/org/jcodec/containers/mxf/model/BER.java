package org.jcodec.containers.mxf.model;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;

public class BER {
    public static final byte ASN_LONG_LEN = Byte.MIN_VALUE;

    public static final long decodeLength(SeekableByteChannel seekableByteChannel) throws IOException {
        byte readByte = NIOUtils.readByte(seekableByteChannel) & 255;
        if ((readByte & Byte.MIN_VALUE) <= 0) {
            return (long) (readByte & 255);
        }
        byte b = readByte & Byte.MAX_VALUE;
        if (b == 0) {
            throw new IOException("Indefinite lengths are not supported");
        } else if (b <= 8) {
            byte[] readNByte = NIOUtils.readNByte(seekableByteChannel, b);
            long j = 0;
            for (int i = 0; i < b; i++) {
                j = (j << 8) | ((long) (readNByte[i] & 255));
            }
            if (j >= 0) {
                return j;
            }
            throw new IOException("mxflib does not support data lengths > 2^63");
        } else {
            throw new IOException("Data length > 4 bytes are not supported!");
        }
    }

    public static long decodeLength(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get() & 255;
        if ((b & Byte.MIN_VALUE) <= 0) {
            return (long) (b & 255);
        }
        byte b2 = b & Byte.MAX_VALUE;
        if (b2 == 0) {
            throw new RuntimeException("Indefinite lengths are not supported");
        } else if (b2 <= 8) {
            long j = 0;
            for (int i = 0; i < b2; i++) {
                j = (j << 8) | ((long) (byteBuffer.get() & 255));
            }
            if (j >= 0) {
                return j;
            }
            throw new RuntimeException("mxflib does not support data lengths > 2^63");
        } else {
            throw new RuntimeException("Data length > 8 bytes are not supported!");
        }
    }
}
