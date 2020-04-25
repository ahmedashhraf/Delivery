package org.jcodec.codecs.common.biari;

import java.nio.ByteBuffer;

public class MDecoder {

    /* renamed from: cm */
    private int[][] f44720cm;
    private int code;

    /* renamed from: in */
    private ByteBuffer f44721in;
    private int nBitsPending;
    private int range = 510;

    public MDecoder(ByteBuffer byteBuffer, int[][] iArr) {
        this.f44721in = byteBuffer;
        this.f44720cm = iArr;
        initCodeRegister();
    }

    private void renormalize() {
        while (true) {
            int i = this.range;
            if (i < 256) {
                this.range = i << 1;
                this.code <<= 1;
                this.code &= 131071;
                this.nBitsPending--;
                if (this.nBitsPending <= 0) {
                    readOneByte();
                }
            } else {
                return;
            }
        }
    }

    public int decodeBin(int i) {
        int i2 = this.range;
        int[] iArr = MConst.rangeLPS[(i2 >> 6) & 3];
        int[][] iArr2 = this.f44720cm;
        int i3 = iArr[iArr2[0][i]];
        this.range = i2 - i3;
        int i4 = this.range << 8;
        int i5 = this.code;
        if (i5 < i4) {
            if (iArr2[0][i] < 62) {
                int[] iArr3 = iArr2[0];
                iArr3[i] = iArr3[i] + 1;
            }
            renormalize();
            return this.f44720cm[1][i];
        }
        this.range = i3;
        this.code = i5 - i4;
        renormalize();
        int[][] iArr4 = this.f44720cm;
        int i6 = 1 - iArr4[1][i];
        if (iArr4[0][i] == 0) {
            iArr4[1][i] = 1 - iArr4[1][i];
        }
        int[][] iArr5 = this.f44720cm;
        iArr5[0][i] = MConst.transitLPS[iArr5[0][i]];
        return i6;
    }

    public int decodeBinBypass() {
        this.code <<= 1;
        this.nBitsPending--;
        if (this.nBitsPending <= 0) {
            readOneByte();
        }
        int i = this.code - (this.range << 8);
        if (i < 0) {
            return 0;
        }
        this.code = i;
        return 1;
    }

    public int decodeFinalBin() {
        this.range -= 2;
        if (this.code >= (this.range << 8)) {
            return 1;
        }
        renormalize();
        return 0;
    }

    /* access modifiers changed from: protected */
    public void initCodeRegister() {
        readOneByte();
        if (this.nBitsPending == 8) {
            this.code <<= 8;
            readOneByte();
            this.code <<= 1;
            this.nBitsPending -= 9;
            return;
        }
        throw new RuntimeException("Empty stream");
    }

    /* access modifiers changed from: protected */
    public void readOneByte() {
        if (this.f44721in.hasRemaining()) {
            this.code = (this.f44721in.get() & 255) | this.code;
            this.nBitsPending += 8;
        }
    }
}
