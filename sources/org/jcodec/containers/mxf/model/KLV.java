package org.jcodec.containers.mxf.model;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.SeekableByteChannel;

public class KLV {
    public final long dataOffset;
    public final C15568UL key;
    public final long len;
    public final long offset;
    ByteBuffer value;

    public KLV(C15568UL ul, long j, long j2, long j3) {
        this.key = ul;
        this.len = j;
        this.offset = j2;
        this.dataOffset = j3;
    }

    public static boolean matches(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static KLV readKL(SeekableByteChannel seekableByteChannel) throws IOException {
        long position = seekableByteChannel.position();
        if (position >= seekableByteChannel.size() - 1) {
            return null;
        }
        byte[] bArr = new byte[16];
        seekableByteChannel.read(ByteBuffer.wrap(bArr));
        KLV klv = new KLV(new C15568UL(bArr), BER.decodeLength(seekableByteChannel), position, seekableByteChannel.position());
        return klv;
    }

    public int getLenByteCount() {
        int i = (int) ((this.dataOffset - this.offset) - 16);
        if (i <= 0) {
            return 4;
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KLV [offset=");
        sb.append(this.offset);
        sb.append(", dataOffset=");
        sb.append(this.dataOffset);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", len=");
        sb.append(this.len);
        sb.append(", value=");
        sb.append(this.value);
        sb.append("]");
        return sb.toString();
    }

    public static KLV readKL(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.remaining() < 17) {
            return null;
        }
        KLV klv = new KLV(C15568UL.read(byteBuffer), BER.decodeLength(byteBuffer), j + ((long) byteBuffer.position()), j + ((long) byteBuffer.position()));
        return klv;
    }
}
