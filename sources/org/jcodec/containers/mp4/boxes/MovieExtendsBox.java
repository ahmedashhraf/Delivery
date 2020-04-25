package org.jcodec.containers.mp4.boxes;

public class MovieExtendsBox extends NodeBox {
    public MovieExtendsBox() {
        super(new Header(fourcc()));
    }

    public static String fourcc() {
        return "mvex";
    }
}
