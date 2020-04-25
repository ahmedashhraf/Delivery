package org.jcodec.codecs.common.biari;

import androidx.core.app.C0753l;
import java.nio.ByteBuffer;

public class MEncoder {
    private int bitsInOutReg;
    private int[][] models;
    private int offset;
    private int onesOutstanding;
    private ByteBuffer out;
    private int outReg;
    private int range = 510;
    private boolean zeroBorrowed;

    public MEncoder(ByteBuffer byteBuffer, int[][] iArr) {
        this.models = iArr;
        this.out = byteBuffer;
    }

    private void flushOutstanding(int i) {
        if (this.zeroBorrowed) {
            putBit(i);
        }
        int i2 = 1 - i;
        while (this.onesOutstanding > 0) {
            putBit(i2);
            this.onesOutstanding--;
        }
        this.zeroBorrowed = true;
    }

    private void putBit(int i) {
        this.outReg = i | (this.outReg << 1);
        this.bitsInOutReg++;
        if (this.bitsInOutReg == 8) {
            this.out.put((byte) this.outReg);
            this.outReg = 0;
            this.bitsInOutReg = 0;
        }
    }

    private void renormalize() {
        while (this.range < 256) {
            int i = this.offset;
            if (i < 256) {
                flushOutstanding(0);
            } else if (i < 512) {
                this.offset = i & 255;
                this.onesOutstanding++;
            } else {
                this.offset = i & C0753l.f3451u;
                flushOutstanding(1);
            }
            this.range <<= 1;
            this.offset <<= 1;
        }
    }

    private void stuffBits() {
        int i = this.bitsInOutReg;
        if (i == 0) {
            this.out.put(Byte.MIN_VALUE);
            return;
        }
        this.outReg = (this.outReg << 1) | 1;
        this.outReg <<= 8 - (i + 1);
        this.out.put((byte) this.outReg);
        this.outReg = 0;
        this.bitsInOutReg = 0;
    }

    public void encodeBin(int i, int i2) {
        int i3 = this.range;
        int[] iArr = MConst.rangeLPS[(i3 >> 6) & 3];
        int[][] iArr2 = this.models;
        int i4 = iArr[iArr2[0][i]];
        this.range = i3 - i4;
        if (i2 != iArr2[1][i]) {
            this.offset += this.range;
            this.range = i4;
            if (iArr2[0][i] == 0) {
                iArr2[1][i] = 1 - iArr2[1][i];
            }
            int[][] iArr3 = this.models;
            iArr3[0][i] = MConst.transitLPS[iArr3[0][i]];
        } else if (iArr2[0][i] < 62) {
            int[] iArr4 = iArr2[0];
            iArr4[i] = iArr4[i] + 1;
        }
        renormalize();
    }

    public void encodeBinBypass(int i) {
        this.offset <<= 1;
        if (i == 1) {
            this.offset += this.range;
        }
        int i2 = this.offset;
        if ((i2 & 1024) != 0) {
            flushOutstanding(1);
            this.offset &= 1023;
        } else if ((i2 & 512) != 0) {
            this.offset = i2 & C0753l.f3451u;
            this.onesOutstanding++;
        } else {
            flushOutstanding(0);
        }
    }

    public void encodeBinFinal(int i) {
        this.range -= 2;
        if (i == 0) {
            renormalize();
            return;
        }
        this.offset += this.range;
        this.range = 2;
        renormalize();
    }

    public void finishEncoding() {
        flushOutstanding((this.offset >> 9) & 1);
        putBit((this.offset >> 8) & 1);
        stuffBits();
    }
}
