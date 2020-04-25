package org.jcodec.movtool.streaming;

import java.nio.ByteBuffer;

public class CodecMeta {
    private ByteBuffer codecPrivate;
    private String fourcc;

    public CodecMeta(String str, ByteBuffer byteBuffer) {
        this.fourcc = str;
        this.codecPrivate = byteBuffer;
    }

    public ByteBuffer getCodecPrivate() {
        return this.codecPrivate;
    }

    public String getFourcc() {
        return this.fourcc;
    }
}
