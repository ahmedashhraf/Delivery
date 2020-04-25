package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class VideoMediaHeaderBox extends FullBox {
    int bOpColor;
    int gOpColor;
    int graphicsMode;
    int rOpColor;

    public VideoMediaHeaderBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "vmhd";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putShort((short) this.graphicsMode);
        byteBuffer.putShort((short) this.rOpColor);
        byteBuffer.putShort((short) this.gOpColor);
        byteBuffer.putShort((short) this.bOpColor);
    }

    public int getGraphicsMode() {
        return this.graphicsMode;
    }

    public int getbOpColor() {
        return this.bOpColor;
    }

    public int getgOpColor() {
        return this.gOpColor;
    }

    public int getrOpColor() {
        return this.rOpColor;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.rOpColor = byteBuffer.getShort();
        this.gOpColor = byteBuffer.getShort();
        this.bOpColor = byteBuffer.getShort();
    }

    public VideoMediaHeaderBox(Header header) {
        super(header);
    }

    public VideoMediaHeaderBox(int i, int i2, int i3, int i4) {
        super(new Header(fourcc()));
        this.graphicsMode = i;
        this.rOpColor = i2;
        this.gOpColor = i3;
        this.bOpColor = i4;
    }
}
