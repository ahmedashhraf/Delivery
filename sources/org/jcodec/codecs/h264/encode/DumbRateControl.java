package org.jcodec.codecs.h264.encode;

public class DumbRateControl implements RateControl {

    /* renamed from: QP */
    private static final int f44742QP = 20;

    public boolean accept(int i) {
        return true;
    }

    public int getInitQp() {
        return 20;
    }

    public int getQpDelta() {
        return 0;
    }

    public void reset() {
    }
}
