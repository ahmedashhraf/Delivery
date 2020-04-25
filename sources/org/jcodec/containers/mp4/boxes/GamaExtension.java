package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class GamaExtension extends Box {
    private float gamma;

    public GamaExtension(float f) {
        super(new Header(fourcc(), 0));
        this.gamma = f;
    }

    public static String fourcc() {
        return "gama";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) (this.gamma * 65536.0f));
    }

    public float getGamma() {
        return this.gamma;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.gamma = ((float) byteBuffer.getInt()) / 65536.0f;
    }

    public GamaExtension(Header header) {
        super(header);
    }

    public GamaExtension(Box box) {
        super(box);
    }
}
