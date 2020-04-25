package org.jcodec.containers.mp4.boxes;

public class ProductionApertureBox extends ClearApertureBox {
    public ProductionApertureBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "prof";
    }

    public ProductionApertureBox() {
        super(new Header(fourcc()));
    }

    public ProductionApertureBox(int i, int i2) {
        super(new Header(fourcc()), i, i2);
    }
}
