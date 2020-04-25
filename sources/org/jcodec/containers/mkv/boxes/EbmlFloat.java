package org.jcodec.containers.mkv.boxes;

import java.nio.ByteBuffer;

public class EbmlFloat extends EbmlBin {
    public EbmlFloat(byte[] bArr) {
        super(bArr);
    }

    public double get() {
        if (this.data.limit() == 4) {
            return (double) this.data.duplicate().getFloat();
        }
        return this.data.duplicate().getDouble();
    }

    public void set(double d) {
        if (d < 3.4028234663852886E38d) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putFloat((float) d);
            allocate.flip();
            this.data = allocate;
        } else if (d < Double.MAX_VALUE) {
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            allocate2.putDouble(d);
            allocate2.flip();
            this.data = allocate2;
        }
    }
}
