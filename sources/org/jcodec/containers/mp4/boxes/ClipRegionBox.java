package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class ClipRegionBox extends Box {
    private short height;
    private short rgnSize;
    private short width;

    /* renamed from: x */
    private short f44841x;

    /* renamed from: y */
    private short f44842y;

    public ClipRegionBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "crgn";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.rgnSize);
        byteBuffer.putShort(this.f44842y);
        byteBuffer.putShort(this.f44841x);
        byteBuffer.putShort(this.height);
        byteBuffer.putShort(this.width);
    }

    public short getHeight() {
        return this.height;
    }

    public short getRgnSize() {
        return this.rgnSize;
    }

    public short getWidth() {
        return this.width;
    }

    public short getX() {
        return this.f44841x;
    }

    public short getY() {
        return this.f44842y;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.rgnSize = byteBuffer.getShort();
        this.f44842y = byteBuffer.getShort();
        this.f44841x = byteBuffer.getShort();
        this.height = byteBuffer.getShort();
        this.width = byteBuffer.getShort();
    }

    public ClipRegionBox() {
        super(new Header(fourcc()));
    }

    public ClipRegionBox(short s, short s2, short s3, short s4) {
        this();
        this.rgnSize = 10;
        this.f44841x = s;
        this.f44842y = s2;
        this.width = s3;
        this.height = s4;
    }
}
