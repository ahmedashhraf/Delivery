package org.jcodec.containers.mp4.boxes;

public class DataInfoBox extends NodeBox {
    public DataInfoBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "dinf";
    }

    public DataRefBox getDref() {
        return (DataRefBox) Box.findFirst(this, DataRefBox.class, "dref");
    }

    public DataInfoBox(Header header) {
        super(header);
    }
}
