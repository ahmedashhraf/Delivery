package org.jcodec.codecs.h264.p552io.model;

/* renamed from: org.jcodec.codecs.h264.io.model.SliceType */
public enum SliceType {
    P,
    B,
    I,
    SP,
    SI;

    public static SliceType fromValue(int i) {
        SliceType[] values;
        for (SliceType sliceType : values()) {
            if (sliceType.ordinal() == i) {
                return sliceType;
            }
        }
        return null;
    }

    public boolean isInter() {
        return (this == I || this == SI) ? false : true;
    }

    public boolean isIntra() {
        return this == I || this == SI;
    }
}
