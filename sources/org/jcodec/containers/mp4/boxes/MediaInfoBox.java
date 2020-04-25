package org.jcodec.containers.mp4.boxes;

public class MediaInfoBox extends NodeBox {
    public MediaInfoBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "minf";
    }

    public DataInfoBox getDinf() {
        return (DataInfoBox) Box.findFirst(this, DataInfoBox.class, "dinf");
    }

    public NodeBox getStbl() {
        return (NodeBox) Box.findFirst(this, NodeBox.class, "stbl");
    }

    public MediaInfoBox() {
        super(new Header(fourcc()));
    }
}
