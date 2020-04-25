package org.jcodec.common.model;

import java.util.List;

public class Frame {
    private RationalLarge duration;
    private int frameNo;
    private List<String> messages;
    private Picture pic;
    private Rational pixelAspect;
    private RationalLarge pts;
    private TapeTimecode tapeTimecode;

    public Frame(Picture picture, RationalLarge rationalLarge, RationalLarge rationalLarge2, Rational rational, int i, TapeTimecode tapeTimecode2, List<String> list) {
        this.pic = picture;
        this.pts = rationalLarge;
        this.duration = rationalLarge2;
        this.pixelAspect = rational;
        this.tapeTimecode = tapeTimecode2;
        this.frameNo = i;
        this.messages = list;
    }

    public RationalLarge getDuration() {
        return this.duration;
    }

    public int getFrameNo() {
        return this.frameNo;
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public Picture getPic() {
        return this.pic;
    }

    public Rational getPixelAspect() {
        return this.pixelAspect;
    }

    public RationalLarge getPts() {
        return this.pts;
    }

    public TapeTimecode getTapeTimecode() {
        return this.tapeTimecode;
    }

    public boolean isAvailable() {
        return true;
    }
}
