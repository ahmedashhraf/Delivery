package org.jcodec.codecs.vp8;

import java.nio.ByteBuffer;

public class BooleanArithmeticDecoder {
    int bit_count;
    long callCounter;
    private String debugName;
    ByteBuffer input;
    int offset;
    int range;
    int value;

    public BooleanArithmeticDecoder(ByteBuffer byteBuffer, int i, String str) {
        this(byteBuffer, i);
        this.debugName = str;
    }

    public static int getBitInBytes(byte[] bArr, int i) {
        return (bArr[i >> 3] >> (7 - (i & 7))) & 1;
    }

    public static int getBitsInBytes(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 1) | getBitInBytes(bArr, i + i4);
        }
        return i3;
    }

    public static int leadingZeroCountInByte(byte b) {
        byte b2 = b & 255;
        if (b2 >= 128 || b2 == 0) {
            return 0;
        }
        return Integer.numberOfLeadingZeros(b) - 24;
    }

    public int decodeBit() {
        return decodeBool(128);
    }

    public int decodeBool(int i) {
        int i2;
        int i3 = this.range;
        int i4 = this.value;
        int i5 = (((i3 - 1) * i) >> 8) + 1;
        int i6 = i5 << 8;
        this.callCounter++;
        if (i4 >= i6) {
            i5 = i3 - i5;
            i4 -= i6;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = this.bit_count;
        int leadingZeroCountInByte = leadingZeroCountInByte((byte) i5);
        int i8 = i5 << leadingZeroCountInByte;
        int i9 = i4 << leadingZeroCountInByte;
        int i10 = i7 - leadingZeroCountInByte;
        if (i10 <= 0) {
            i9 |= (this.input.get() & 255) << (-i10);
            this.offset++;
            i10 += 8;
        }
        this.bit_count = i10;
        this.value = i9;
        this.range = i8;
        return i2;
    }

    public int decodeInt(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return i2;
            }
            i2 = decodeBool(128) | (i2 << 1);
            i = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    public void initBoolDecoder() {
        this.value = 0;
        this.value = (this.input.get() & 255) << 8;
        this.offset++;
        this.range = 255;
        this.bit_count = 0;
    }

    public int readTree(int[] iArr, int[] iArr2) {
        int i = 0;
        do {
            i = iArr[i + decodeBool(iArr2[i >> 1])];
        } while (i > 0);
        return -i;
    }

    public int readTreeSkip(int[] iArr, int[] iArr2, int i) {
        int i2 = i * 2;
        do {
            i2 = iArr[i2 + decodeBool(iArr2[i2 >> 1])];
        } while (i2 > 0);
        return -i2;
    }

    public void seek() {
        this.input.position(this.offset);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bc: ");
        sb.append(this.value);
        return sb.toString();
    }

    public BooleanArithmeticDecoder(ByteBuffer byteBuffer, int i) {
        this.callCounter = 0;
        this.input = byteBuffer;
        this.offset = i;
        initBoolDecoder();
    }
}
