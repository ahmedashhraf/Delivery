package org.jcodec.containers.mp4.boxes;

import androidx.core.p034l.C0962e0;
import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

public class FullBox extends Box {
    protected int flags;
    protected byte version;

    public FullBox(Header header) {
        super(header);
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt((this.version << C5785c.f16669B) | (this.flags & C0962e0.f4342s));
    }

    public int getFlags() {
        return this.flags;
    }

    public byte getVersion() {
        return this.version;
    }

    public void parse(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        this.version = (byte) ((i >> 24) & 255);
        this.flags = i & C0962e0.f4342s;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(byte b) {
        this.version = b;
    }
}
