package org.jcodec.containers.mkv.boxes;

import java.nio.ByteBuffer;

public class EbmlUint extends EbmlBin {
    public EbmlUint(byte[] bArr) {
        super(bArr);
    }

    public static int calculatePayloadSize(long j) {
        if (j == 0) {
            return 1;
        }
        int i = 0;
        while (((-72057594037927936 >>> (i * 8)) & j) == 0 && i < 8) {
            i++;
        }
        return 8 - i;
    }

    public static byte[] longToBytes(long j) {
        byte[] bArr = new byte[calculatePayloadSize(j)];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) ((int) (j >>> (((bArr.length - length) - 1) * 8)));
        }
        return bArr;
    }

    public long get() {
        long j = 0;
        for (int i = 0; i < this.data.limit(); i++) {
            ByteBuffer byteBuffer = this.data;
            j |= (((long) byteBuffer.get((byteBuffer.limit() - 1) - i)) << 56) >>> (56 - (i * 8));
        }
        return j;
    }

    public void set(long j) {
        this.data = ByteBuffer.wrap(longToBytes(j));
        this.dataLen = this.data.limit();
    }

    public EbmlUint(byte[] bArr, long j) {
        super(bArr);
        set(j);
    }
}
