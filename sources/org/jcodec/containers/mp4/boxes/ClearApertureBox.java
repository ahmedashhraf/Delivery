package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class ClearApertureBox extends FullBox {
    private float height;
    private float width;

    public ClearApertureBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "clef";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt((int) (this.width * 65536.0f));
        byteBuffer.putInt((int) (this.height * 65536.0f));
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.width = ((float) byteBuffer.getInt()) / 65536.0f;
        this.height = ((float) byteBuffer.getInt()) / 65536.0f;
    }

    public ClearApertureBox() {
        super(new Header(fourcc()));
    }

    public ClearApertureBox(int i, int i2) {
        this();
        this.width = (float) i;
        this.height = (float) i2;
    }

    public ClearApertureBox(Header header, int i, int i2) {
        super(header);
        this.width = (float) i;
        this.height = (float) i2;
    }
}
