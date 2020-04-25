package org.jcodec.common.p554io;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

/* renamed from: org.jcodec.common.io.BitReader */
public class BitReader {

    /* renamed from: bb */
    private ByteBuffer f44821bb;
    protected int curInt;
    protected int deficit;
    private int initPos;

    public BitReader(ByteBuffer byteBuffer) {
        this.f44821bb = byteBuffer;
        this.initPos = byteBuffer.position();
        this.curInt = readInt();
        this.deficit = 0;
    }

    private int nextIgnore() {
        if (this.f44821bb.hasRemaining()) {
            return this.f44821bb.get() & 255;
        }
        return 0;
    }

    private int nextIgnore16() {
        if (this.f44821bb.remaining() > 1) {
            return this.f44821bb.getShort() & 65535;
        }
        if (this.f44821bb.hasRemaining()) {
            return (this.f44821bb.get() & 255) << 8;
        }
        return 0;
    }

    private int readIntSafe() {
        this.deficit -= this.f44821bb.remaining() << 3;
        byte b = 0;
        if (this.f44821bb.hasRemaining()) {
            b = 0 | (this.f44821bb.get() & 255);
        }
        int i = b << 8;
        if (this.f44821bb.hasRemaining()) {
            i |= this.f44821bb.get() & 255;
        }
        int i2 = i << 8;
        if (this.f44821bb.hasRemaining()) {
            i2 |= this.f44821bb.get() & 255;
        }
        int i3 = i2 << 8;
        return this.f44821bb.hasRemaining() ? i3 | (this.f44821bb.get() & 255) : i3;
    }

    public int align() {
        int i = this.deficit;
        if ((i & 7) > 0) {
            return skip(8 - (i & 7));
        }
        return 0;
    }

    public int check16Bits() {
        int i = this.deficit;
        if (i > 16) {
            this.deficit = i - 16;
            this.curInt |= nextIgnore16() << this.deficit;
        }
        return this.curInt >>> 16;
    }

    public int check24Bits() {
        int i = this.deficit;
        if (i > 16) {
            this.deficit = i - 16;
            this.curInt |= nextIgnore16() << this.deficit;
        }
        int i2 = this.deficit;
        if (i2 > 8) {
            this.deficit = i2 - 8;
            this.curInt |= nextIgnore() << this.deficit;
        }
        return this.curInt >>> 8;
    }

    public int checkAllBits() {
        return this.curInt;
    }

    public int checkNBit(int i) {
        if (i <= 24) {
            while (true) {
                int i2 = this.deficit;
                if (i2 + i <= 32) {
                    return this.curInt >>> (32 - i);
                }
                this.deficit = i2 - 8;
                this.curInt |= nextIgnore() << this.deficit;
            }
        } else {
            throw new IllegalArgumentException("Can not check more then 24 bit");
        }
    }

    public int curBit() {
        return this.deficit & 7;
    }

    public BitReader fork() {
        return new BitReader(this);
    }

    public final boolean isByteAligned() {
        return (this.deficit & 7) == 0;
    }

    public boolean lastByte() {
        return (this.f44821bb.remaining() + 4) - (this.deficit >> 3) <= 1;
    }

    public boolean moreData() {
        int remaining = (this.f44821bb.remaining() + 4) - ((this.deficit + 7) >> 3);
        if (remaining > 1) {
            return true;
        }
        if (remaining != 1 || this.curInt == 0) {
            return false;
        }
        return true;
    }

    public int position() {
        return (((this.f44821bb.position() - this.initPos) - 4) << 3) + this.deficit;
    }

    public int read1Bit() {
        int i = this.curInt;
        int i2 = i >>> 31;
        this.curInt = i << 1;
        this.deficit++;
        if (this.deficit == 32) {
            this.curInt = readInt();
        }
        return i2;
    }

    public int readFast16(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.deficit;
        if (i2 > 16) {
            this.deficit = i2 - 16;
            this.curInt |= nextIgnore16() << this.deficit;
        }
        int i3 = this.curInt;
        int i4 = i3 >>> (32 - i);
        this.deficit += i;
        this.curInt = i3 << i;
        return i4;
    }

    public final int readInt() {
        if (this.f44821bb.remaining() < 4) {
            return readIntSafe();
        }
        this.deficit -= 32;
        return ((this.f44821bb.get() & 255) << C5785c.f16669B) | ((this.f44821bb.get() & 255) << 16) | ((this.f44821bb.get() & 255) << 8) | (this.f44821bb.get() & 255);
    }

    public int readNBit(int i) {
        if (i <= 32) {
            int i2 = 0;
            int i3 = this.deficit;
            if (i + i3 > 31) {
                i -= 32 - i3;
                i2 = (0 | (this.curInt >>> i3)) << i;
                this.deficit = 32;
                this.curInt = readInt();
            }
            if (i == 0) {
                return i2;
            }
            int i4 = this.curInt;
            int i5 = i2 | (i4 >>> (32 - i));
            this.curInt = i4 << i;
            this.deficit += i;
            return i5;
        }
        throw new IllegalArgumentException("Can not read more then 32 bit");
    }

    public int remaining() {
        return ((this.f44821bb.remaining() << 3) + 32) - this.deficit;
    }

    public int skip(int i) {
        int i2;
        int i3 = this.deficit;
        if (i + i3 > 31) {
            i2 = i - (32 - i3);
            this.deficit = 32;
            if (i2 > 31) {
                int min = Math.min(i2 >> 3, this.f44821bb.remaining());
                ByteBuffer byteBuffer = this.f44821bb;
                byteBuffer.position(byteBuffer.position() + min);
                i2 -= min << 3;
            }
            this.curInt = readInt();
        } else {
            i2 = i;
        }
        this.deficit += i2;
        this.curInt <<= i2;
        return i;
    }

    public int skipFast(int i) {
        this.deficit += i;
        this.curInt <<= i;
        return i;
    }

    public void stop() {
        ByteBuffer byteBuffer = this.f44821bb;
        byteBuffer.position(byteBuffer.position() - ((32 - this.deficit) >> 3));
    }

    public void terminate() {
        int i = (32 - this.deficit) >> 3;
        ByteBuffer byteBuffer = this.f44821bb;
        byteBuffer.position(byteBuffer.position() - i);
    }

    private BitReader(BitReader bitReader) {
        this.f44821bb = bitReader.f44821bb.duplicate();
        this.curInt = bitReader.curInt;
        this.deficit = bitReader.deficit;
    }
}
