package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class SoundMediaHeaderBox extends FullBox {
    private short balance;

    public SoundMediaHeaderBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "smhd";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(0);
    }

    public short getBalance() {
        return this.balance;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.balance = byteBuffer.getShort();
        byteBuffer.getShort();
    }

    public SoundMediaHeaderBox() {
        super(new Header(fourcc()));
    }
}
