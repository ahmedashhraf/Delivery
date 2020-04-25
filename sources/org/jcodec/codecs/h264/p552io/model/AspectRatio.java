package org.jcodec.codecs.h264.p552io.model;

/* renamed from: org.jcodec.codecs.h264.io.model.AspectRatio */
public class AspectRatio {
    public static final AspectRatio Extended_SAR = new AspectRatio(255);
    private int value;

    private AspectRatio(int i) {
        this.value = i;
    }

    public static AspectRatio fromValue(int i) {
        AspectRatio aspectRatio = Extended_SAR;
        if (i == aspectRatio.value) {
            return aspectRatio;
        }
        return new AspectRatio(i);
    }

    public int getValue() {
        return this.value;
    }
}
