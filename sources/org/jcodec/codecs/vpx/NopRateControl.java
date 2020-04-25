package org.jcodec.codecs.vpx;

public class NopRateControl implements RateControl {

    /* renamed from: qp */
    private int f44788qp;

    public NopRateControl(int i) {
        this.f44788qp = i;
    }

    public int getSegment() {
        return 0;
    }

    public int[] getSegmentQps() {
        return new int[]{this.f44788qp};
    }

    public void report(int i) {
    }

    public void reset() {
    }
}
