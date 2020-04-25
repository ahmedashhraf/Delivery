package org.jcodec.containers.mp4.boxes;

import java.util.List;

public class TrackFragmentBox extends NodeBox {
    public TrackFragmentBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "traf";
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
    }

    public int getTrackId() {
        TrackFragmentHeaderBox trackFragmentHeaderBox = (TrackFragmentHeaderBox) Box.findFirst(this, TrackFragmentHeaderBox.class, TrackFragmentHeaderBox.fourcc());
        if (trackFragmentHeaderBox != null) {
            return trackFragmentHeaderBox.getTrackId();
        }
        throw new RuntimeException("Corrupt track fragment, no header atom found");
    }
}
