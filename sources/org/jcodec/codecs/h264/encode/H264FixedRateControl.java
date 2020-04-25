package org.jcodec.codecs.h264.encode;

import org.jcodec.common.tools.MathUtil;

public class H264FixedRateControl implements RateControl {
    private static final int INIT_QP = 26;
    private int balance;
    private int curQp = 26;
    private int perMb;

    public H264FixedRateControl(int i) {
        this.perMb = i;
    }

    public boolean accept(int i) {
        this.balance += this.perMb - i;
        return true;
    }

    public int calcFrameSize(int i) {
        return ((((this.perMb + 9) * i) + 256) >> 3) + (i >> 6);
    }

    public int getInitQp() {
        return 26;
    }

    public int getQpDelta() {
        int i = this.balance;
        int i2 = 2;
        if (i >= 0) {
            int i3 = this.perMb;
            i2 = i > i3 ? i > (i3 << 2) ? -2 : -1 : 0;
        } else if (i >= (-(this.perMb >> 1))) {
            i2 = 1;
        }
        int i4 = this.curQp;
        this.curQp = MathUtil.clip(i2 + i4, 12, 30);
        return this.curQp - i4;
    }

    public void reset() {
        this.balance = 0;
        this.curQp = 26;
    }

    public void setRate(int i) {
        this.perMb = i;
    }
}
