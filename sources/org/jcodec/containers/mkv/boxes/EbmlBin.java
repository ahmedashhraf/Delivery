package org.jcodec.containers.mkv.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class EbmlBin extends EbmlBase {
    public ByteBuffer data;
    protected boolean dataRead = false;

    public EbmlBin(byte[] bArr) {
        this.f44838id = bArr;
    }

    public ByteBuffer getData() {
        int ebmlLength = EbmlUtil.ebmlLength((long) this.data.limit());
        byte[] ebmlEncode = EbmlUtil.ebmlEncode((long) this.data.limit(), ebmlLength);
        ByteBuffer allocate = ByteBuffer.allocate(this.f44838id.length + ebmlLength + this.data.limit());
        allocate.put(this.f44838id);
        allocate.put(ebmlEncode);
        allocate.put(this.data);
        allocate.flip();
        this.data.flip();
        return allocate;
    }

    public void read(SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(this.dataLen);
        seekableByteChannel.read(allocate);
        allocate.flip();
        read(allocate);
    }

    public void set(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        this.dataLen = this.data.limit();
    }

    public long size() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.limit() == 0) {
            return super.size();
        }
        return ((long) this.data.limit()) + ((long) EbmlUtil.ebmlLength((long) this.data.limit())) + ((long) this.f44838id.length);
    }

    public void skip(ByteBuffer byteBuffer) {
        if (!this.dataRead) {
            byteBuffer.position((int) (this.dataOffset + ((long) this.dataLen)));
            this.dataRead = true;
        }
    }

    public void read(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        this.data.limit(this.dataLen);
        this.dataRead = true;
    }
}
