package org.jcodec.containers.mp4.boxes;

public class PartialSyncSamplesBox extends SyncSamplesBox {
    public PartialSyncSamplesBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "stps";
    }

    public PartialSyncSamplesBox(int[] iArr) {
        super(iArr);
    }
}
