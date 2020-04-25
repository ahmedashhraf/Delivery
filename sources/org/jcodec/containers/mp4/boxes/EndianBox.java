package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class EndianBox extends Box {
    private Endian endian;

    public enum Endian {
        LITTLE_ENDIAN,
        BIG_ENDIAN
    }

    public EndianBox(Box box) {
        super(box);
    }

    public static String fourcc() {
        return "enda";
    }

    /* access modifiers changed from: protected */
    public int calcSize() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) (this.endian == Endian.LITTLE_ENDIAN ? 1 : 0));
    }

    public Endian getEndian() {
        return this.endian;
    }

    public void parse(ByteBuffer byteBuffer) {
        if (((long) byteBuffer.getShort()) == 1) {
            this.endian = Endian.LITTLE_ENDIAN;
        } else {
            this.endian = Endian.BIG_ENDIAN;
        }
    }

    public EndianBox(Header header) {
        super(header);
    }

    public EndianBox(Endian endian2) {
        super(new Header(fourcc()));
        this.endian = endian2;
    }
}
