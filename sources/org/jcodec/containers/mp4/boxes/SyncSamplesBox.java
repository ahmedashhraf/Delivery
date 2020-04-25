package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class SyncSamplesBox extends FullBox {
    private int[] syncSamples;

    public SyncSamplesBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "stss";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.syncSamples.length);
        int i = 0;
        while (true) {
            int[] iArr = this.syncSamples;
            if (i < iArr.length) {
                byteBuffer.putInt(iArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public int[] getSyncSamples() {
        return this.syncSamples;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.syncSamples = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.syncSamples[i2] = byteBuffer.getInt();
        }
    }

    public SyncSamplesBox(int[] iArr) {
        this();
        this.syncSamples = iArr;
    }

    public SyncSamplesBox(Header header) {
        super(header);
    }
}
