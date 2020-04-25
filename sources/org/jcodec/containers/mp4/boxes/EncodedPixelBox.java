package org.jcodec.containers.mp4.boxes;

public class EncodedPixelBox extends ClearApertureBox {
    public EncodedPixelBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "enof";
    }

    public EncodedPixelBox() {
        super(new Header(fourcc()));
    }

    public EncodedPixelBox(int i, int i2) {
        super(new Header(fourcc()), i, i2);
    }
}
