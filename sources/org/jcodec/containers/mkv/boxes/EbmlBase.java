package org.jcodec.containers.mkv.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mkv.MKVType;
import org.jcodec.containers.mkv.util.EbmlUtil;

public abstract class EbmlBase {
    public int dataLen = 0;
    public long dataOffset;

    /* renamed from: id */
    public byte[] f44838id = {0};
    public long offset;
    protected EbmlMaster parent;
    public MKVType type;
    public int typeSizeLength;

    public boolean equalId(byte[] bArr) {
        return Arrays.equals(this.f44838id, bArr);
    }

    public abstract ByteBuffer getData();

    public long mux(SeekableByteChannel seekableByteChannel) throws IOException {
        return (long) seekableByteChannel.write(getData());
    }

    public long size() {
        int i = this.dataLen;
        return (long) (i + EbmlUtil.ebmlLength((long) i) + this.f44838id.length);
    }
}
