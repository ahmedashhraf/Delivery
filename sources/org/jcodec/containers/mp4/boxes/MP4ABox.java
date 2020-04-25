package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class MP4ABox extends Box {
    private int val;

    public MP4ABox(int i) {
        super(new Header("mp4a"));
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.val);
    }

    public void parse(ByteBuffer byteBuffer) {
        this.val = byteBuffer.getInt();
    }
}
