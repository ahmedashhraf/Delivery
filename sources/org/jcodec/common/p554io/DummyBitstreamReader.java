package org.jcodec.common.p554io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.jcodec.common.io.DummyBitstreamReader */
public class DummyBitstreamReader {
    protected static int bitsRead;
    int cnt = 0;
    private int curByte;

    /* renamed from: is */
    private InputStream f44822is;
    int nBit;
    private int nextByte;
    private int secondByte;

    public DummyBitstreamReader(InputStream inputStream) throws IOException {
        this.f44822is = inputStream;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
        this.secondByte = inputStream.read();
    }

    private final void advance() throws IOException {
        advance1();
        this.nBit = 0;
    }

    private final void advance1() throws IOException {
        this.curByte = this.nextByte;
        this.nextByte = this.secondByte;
        this.secondByte = this.f44822is.read();
    }

    public int align() throws IOException {
        int i = this.nBit;
        int i2 = (8 - i) & 7;
        skip((8 - i) & 7);
        return i2;
    }

    public int checkNBit(int i) throws IOException {
        return peakNextBits(i);
    }

    public void close() throws IOException {
        this.f44822is.close();
    }

    public int curBit() {
        return this.nBit;
    }

    public long getBitPosition() {
        return (long) ((bitsRead * 8) + (this.nBit % 8));
    }

    public int getCurBit() {
        return this.nBit;
    }

    public boolean isByteAligned() {
        return this.nBit % 8 == 0;
    }

    public boolean lastByte() throws IOException {
        return this.nextByte == -1 && this.secondByte == -1;
    }

    public boolean moreData() throws IOException {
        if (this.nBit == 8) {
            advance();
        }
        boolean z = false;
        if (this.curByte == -1) {
            return false;
        }
        int i = this.nextByte;
        if (i != -1 && (i != 0 || this.secondByte != -1)) {
            return true;
        }
        if ((((1 << (8 - this.nBit)) - 1) & this.curByte) != 0) {
            z = true;
        }
        return z;
    }

    public boolean moreRBSPData() throws IOException {
        if (this.nBit == 8) {
            advance();
        }
        int i = 1 << ((8 - this.nBit) - 1);
        boolean z = (((i << 1) - 1) & this.curByte) == i;
        if (this.curByte == -1 || (this.nextByte == -1 && z)) {
            return false;
        }
        return true;
    }

    public int peakNextBits(int i) throws IOException {
        if (i <= 8) {
            if (this.nBit == 8) {
                advance();
                if (this.curByte == -1) {
                    return -1;
                }
            }
            int i2 = this.nBit;
            int[] iArr = new int[(16 - i2)];
            int i3 = 0;
            while (i2 < 8) {
                int i4 = i3 + 1;
                iArr[i3] = (this.curByte >> (7 - i2)) & 1;
                i2++;
                i3 = i4;
            }
            int i5 = 0;
            while (i5 < 8) {
                int i6 = i3 + 1;
                iArr[i3] = (this.nextByte >> (7 - i5)) & 1;
                i5++;
                i3 = i6;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                i7 = (i7 << 1) | iArr[i8];
            }
            return i7;
        }
        throw new IllegalArgumentException("N should be less then 8");
    }

    public int read1Bit() throws IOException {
        return read1BitInt();
    }

    public int read1BitInt() throws IOException {
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i = this.curByte;
        int i2 = this.nBit;
        int i3 = (i >> (7 - i2)) & 1;
        this.nBit = i2 + 1;
        bitsRead++;
        return i3;
    }

    public int readByte() throws IOException {
        if (this.nBit > 0) {
            advance();
        }
        int i = this.curByte;
        advance();
        return i;
    }

    public int readNBit(int i) throws IOException {
        if (i <= 32) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 = (i2 << 1) | read1BitInt();
            }
            return i2;
        }
        throw new IllegalArgumentException("Can not read more then 32 bit");
    }

    public long readRemainingByte() throws IOException {
        return (long) readNBit(8 - this.nBit);
    }

    public final int skip(int i) throws IOException {
        this.nBit += i;
        int i2 = this.nBit;
        while (this.nBit >= 8 && this.curByte != -1) {
            advance1();
            this.nBit -= 8;
        }
        return i2 - this.nBit;
    }

    public boolean moreData(int i) throws IOException {
        throw new UnsupportedOperationException();
    }
}
