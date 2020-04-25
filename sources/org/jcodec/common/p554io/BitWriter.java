package org.jcodec.common.p554io;

import java.nio.ByteBuffer;

/* renamed from: org.jcodec.common.io.BitWriter */
public class BitWriter {
    private final ByteBuffer buf;
    private int curBit;
    private int curInt;
    private int initPos;

    public BitWriter(ByteBuffer byteBuffer) {
        this.buf = byteBuffer;
        this.initPos = byteBuffer.position();
    }

    private final void putInt(int i) {
        this.buf.put((byte) (i >>> 24));
        this.buf.put((byte) (i >> 16));
        this.buf.put((byte) (i >> 8));
        this.buf.put((byte) i);
    }

    public int curBit() {
        return this.curBit & 7;
    }

    public void flush() {
        int i = (this.curBit + 7) >> 3;
        for (int i2 = 0; i2 < i; i2++) {
            this.buf.put((byte) (this.curInt >>> 24));
            this.curInt <<= 8;
        }
    }

    public BitWriter fork() {
        return new BitWriter(this.buf.duplicate(), this.curBit, this.curInt, this.initPos);
    }

    public ByteBuffer getBuffer() {
        return this.buf;
    }

    public int position() {
        return ((this.buf.position() - this.initPos) << 3) + this.curBit;
    }

    public void write1Bit(int i) {
        int i2 = this.curInt;
        int i3 = this.curBit;
        this.curInt = (i << ((32 - i3) - 1)) | i2;
        this.curBit = i3 + 1;
        if (this.curBit == 32) {
            putInt(this.curInt);
            this.curBit = 0;
            this.curInt = 0;
        }
    }

    public final void writeNBit(int i, int i2) {
        if (i2 > 32) {
            throw new IllegalArgumentException("Max 32 bit to write");
        } else if (i2 != 0) {
            int i3 = i & (-1 >>> (32 - i2));
            int i4 = this.curBit;
            if (32 - i4 >= i2) {
                this.curInt = (i3 << ((32 - i4) - i2)) | this.curInt;
                this.curBit = i4 + i2;
                if (this.curBit == 32) {
                    putInt(this.curInt);
                    this.curBit = 0;
                    this.curInt = 0;
                }
            } else {
                int i5 = i2 - (32 - i4);
                this.curInt |= i3 >>> i5;
                putInt(this.curInt);
                this.curInt = i3 << (32 - i5);
                this.curBit = i5;
            }
        }
    }

    private BitWriter(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.buf = byteBuffer;
        this.curBit = i;
        this.curInt = i2;
        this.initPos = i3;
    }
}
