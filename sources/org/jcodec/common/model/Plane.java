package org.jcodec.common.model;

public class Plane {
    int[] data;
    Size size;

    public Plane(int[] iArr, Size size2) {
        this.data = iArr;
        this.size = size2;
    }

    public int[] getData() {
        return this.data;
    }

    public Size getSize() {
        return this.size;
    }
}
