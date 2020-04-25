package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class MovieFragmentHeaderBox extends FullBox {
    private int sequenceNumber;

    public MovieFragmentHeaderBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "mfhd";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.sequenceNumber);
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.sequenceNumber = byteBuffer.getInt();
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }
}
