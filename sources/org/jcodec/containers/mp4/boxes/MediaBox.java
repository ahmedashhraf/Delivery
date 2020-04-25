package org.jcodec.containers.mp4.boxes;

public class MediaBox extends NodeBox {
    public MediaBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "mdia";
    }

    public MediaInfoBox getMinf() {
        return (MediaInfoBox) Box.findFirst(this, MediaInfoBox.class, "minf");
    }

    public MediaBox() {
        super(new Header(fourcc()));
    }
}
