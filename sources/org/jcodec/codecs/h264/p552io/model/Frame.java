package org.jcodec.codecs.h264.p552io.model;

import java.util.Comparator;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;

/* renamed from: org.jcodec.codecs.h264.io.model.Frame */
public class Frame extends Picture {
    public static Comparator<Frame> POCAsc = new C15524a();
    public static Comparator<Frame> POCDesc = new C15525b();
    private int frameNo;
    private int[][][][] mvs;
    /* access modifiers changed from: private */
    public int poc;
    private Frame[][][] refsUsed;
    private boolean shortTerm = true;

    /* renamed from: org.jcodec.codecs.h264.io.model.Frame$a */
    static class C15524a implements Comparator<Frame> {
        C15524a() {
        }

        /* renamed from: a */
        public int compare(Frame frame, Frame frame2) {
            int i = 0;
            if (frame == null && frame2 == null) {
                return 0;
            }
            if (frame == null) {
                return 1;
            }
            if (frame2 == null) {
                return -1;
            }
            if (frame.poc > frame2.poc) {
                i = 1;
            } else if (frame.poc != frame2.poc) {
                i = -1;
            }
            return i;
        }
    }

    /* renamed from: org.jcodec.codecs.h264.io.model.Frame$b */
    static class C15525b implements Comparator<Frame> {
        C15525b() {
        }

        /* renamed from: a */
        public int compare(Frame frame, Frame frame2) {
            int i = 0;
            if (frame == null && frame2 == null) {
                return 0;
            }
            if (frame == null) {
                return 1;
            }
            if (frame2 == null) {
                return -1;
            }
            if (frame.poc < frame2.poc) {
                i = 1;
            } else if (frame.poc != frame2.poc) {
                i = -1;
            }
            return i;
        }
    }

    public Frame(int i, int i2, int[][] iArr, ColorSpace colorSpace, Rect rect, int i3, int[][][][] iArr2, Frame[][][] frameArr, int i4) {
        super(i, i2, iArr, colorSpace, rect);
        this.frameNo = i3;
        this.mvs = iArr2;
        this.refsUsed = frameArr;
        this.poc = i4;
    }

    public static Frame createFrame(Frame frame) {
        Picture createCompatible = frame.createCompatible();
        Frame frame2 = new Frame(createCompatible.getWidth(), createCompatible.getHeight(), createCompatible.getData(), createCompatible.getColor(), frame.getCrop(), frame.frameNo, frame.mvs, frame.refsUsed, frame.poc);
        return frame2;
    }

    public void copyFrom(Frame frame) {
        super.copyFrom(frame);
        this.frameNo = frame.frameNo;
        this.mvs = frame.mvs;
        this.shortTerm = frame.shortTerm;
        this.refsUsed = frame.refsUsed;
        this.poc = frame.poc;
    }

    public int getFrameNo() {
        return this.frameNo;
    }

    public int[][][][] getMvs() {
        return this.mvs;
    }

    public int getPOC() {
        return this.poc;
    }

    public Frame[][][] getRefsUsed() {
        return this.refsUsed;
    }

    public boolean isShortTerm() {
        return this.shortTerm;
    }

    public void setShortTerm(boolean z) {
        this.shortTerm = z;
    }

    public Frame cropped() {
        Picture cropped = super.cropped();
        Frame frame = new Frame(cropped.getWidth(), cropped.getHeight(), cropped.getData(), cropped.getColor(), null, this.frameNo, this.mvs, this.refsUsed, this.poc);
        return frame;
    }
}
