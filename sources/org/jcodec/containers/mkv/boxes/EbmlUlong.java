package org.jcodec.containers.mkv.boxes;

import java.nio.ByteBuffer;

public class EbmlUlong extends EbmlBin {
    public EbmlUlong(byte[] bArr) {
        super(bArr);
        this.data = ByteBuffer.allocate(8);
    }

    public long get() {
        return this.data.duplicate().getLong();
    }

    public void set(long j) {
        this.data.putLong(j);
        this.data.flip();
    }

    public EbmlUlong(byte[] bArr, long j) {
        super(bArr);
        set(j);
    }
}
