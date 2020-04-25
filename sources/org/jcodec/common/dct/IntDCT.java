package org.jcodec.common.dct;

import java.nio.IntBuffer;

public class IntDCT extends DCT {
    private static final int CENTERJSAMPLE = 128;
    private static final int CONST_BITS = 13;
    private static final int DCTSIZE = 8;
    private static final int FIX_0_298631336 = FIX(0.298631336d);
    private static final int FIX_0_390180644 = FIX(0.390180644d);
    private static final int FIX_0_541196100 = FIX(0.5411961d);
    private static final int FIX_0_765366865 = FIX(0.765366865d);
    private static final int FIX_0_899976223 = FIX(0.899976223d);
    private static final int FIX_1_175875602 = FIX(1.175875602d);
    private static final int FIX_1_501321110 = FIX(1.50132111d);
    private static final int FIX_1_847759065 = FIX(1.847759065d);
    private static final int FIX_1_961570560 = FIX(1.96157056d);
    private static final int FIX_2_053119869 = FIX(2.053119869d);
    private static final int FIX_2_562915447 = FIX(2.562915447d);
    private static final int FIX_3_072711026 = FIX(3.072711026d);
    public static final IntDCT INSTANCE = new IntDCT();
    private static final int MAXJSAMPLE = 255;
    private static final int ONE_HALF = 4096;
    private static final int PASS1_BITS = 2;
    private static final int RANGE_MASK = 1023;
    private static final IntBuffer idct_sample_range_limit = IntBuffer.allocate(sample_range_limit.capacity() - 128);
    private static final IntBuffer sample_range_limit = IntBuffer.allocate(1408);

    static {
        prepare_range_limit_table();
    }

    static int DESCALE(int i, int i2) {
        return RIGHT_SHIFT(i + (1 << (i2 - 1)), i2);
    }

    private static final int FIX(double d) {
        return (int) ((d * 8192.0d) + 0.5d);
    }

    private static final int MULTIPLY(int i, int i2) {
        return i * i2;
    }

    private static int RIGHT_SHIFT(int i, int i2) {
        return i >> i2;
    }

    private static IntBuffer advance(IntBuffer intBuffer) {
        return advance(intBuffer, 1);
    }

    private static void pass1(IntBuffer intBuffer, IntBuffer intBuffer2) {
        int i = 8;
        IntBuffer intBuffer3 = intBuffer;
        IntBuffer intBuffer4 = intBuffer2;
        int i2 = 8;
        while (i2 > 0) {
            int i3 = intBuffer3.get(16);
            int i4 = intBuffer3.get(48);
            int MULTIPLY = MULTIPLY(i3 + i4, FIX_0_541196100);
            int MULTIPLY2 = MULTIPLY(i4, -FIX_1_847759065) + MULTIPLY;
            int MULTIPLY3 = MULTIPLY + MULTIPLY(i3, FIX_0_765366865);
            int i5 = intBuffer3.get(0);
            int i6 = intBuffer3.get(32);
            int i7 = (i5 + i6) << 13;
            int i8 = (i5 - i6) << 13;
            int i9 = i7 + MULTIPLY3;
            int i10 = i7 - MULTIPLY3;
            int i11 = i8 + MULTIPLY2;
            int i12 = i8 - MULTIPLY2;
            int i13 = intBuffer3.get(56);
            int i14 = intBuffer3.get(40);
            int i15 = intBuffer3.get(24);
            int i16 = intBuffer3.get(i);
            int i17 = i13 + i16;
            int i18 = i14 + i15;
            int i19 = i13 + i15;
            int i20 = i14 + i16;
            int i21 = i2;
            int MULTIPLY4 = MULTIPLY(i19 + i20, FIX_1_175875602);
            int MULTIPLY5 = MULTIPLY(i13, FIX_0_298631336);
            int MULTIPLY6 = MULTIPLY(i14, FIX_2_053119869);
            int MULTIPLY7 = MULTIPLY(i15, FIX_3_072711026);
            int MULTIPLY8 = MULTIPLY(i16, FIX_1_501321110);
            int MULTIPLY9 = MULTIPLY(i17, -FIX_0_899976223);
            int MULTIPLY10 = MULTIPLY(i18, -FIX_2_562915447);
            int MULTIPLY11 = MULTIPLY(i19, -FIX_1_961570560) + MULTIPLY4;
            int MULTIPLY12 = MULTIPLY(i20, -FIX_0_390180644) + MULTIPLY4;
            int i22 = MULTIPLY5 + MULTIPLY9 + MULTIPLY11;
            int i23 = MULTIPLY6 + MULTIPLY10 + MULTIPLY12;
            int i24 = MULTIPLY7 + MULTIPLY10 + MULTIPLY11;
            int i25 = MULTIPLY8 + MULTIPLY9 + MULTIPLY12;
            intBuffer4.put(0, DESCALE(i9 + i25, 11));
            intBuffer4.put(56, DESCALE(i9 - i25, 11));
            intBuffer4.put(8, DESCALE(i11 + i24, 11));
            intBuffer4.put(48, DESCALE(i11 - i24, 11));
            intBuffer4.put(16, DESCALE(i12 + i23, 11));
            intBuffer4.put(40, DESCALE(i12 - i23, 11));
            intBuffer4.put(24, DESCALE(i10 + i22, 11));
            intBuffer4.put(32, DESCALE(i10 - i22, 11));
            intBuffer3 = advance(intBuffer3);
            intBuffer4 = advance(intBuffer4);
            i2 = i21 - 1;
            i = 8;
        }
    }

    private static void pass2(IntBuffer intBuffer, IntBuffer intBuffer2) {
        IntBuffer intBuffer3 = intBuffer;
        int i = 0;
        IntBuffer intBuffer4 = intBuffer2;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = intBuffer4.get(2);
            int i4 = intBuffer4.get(6);
            int MULTIPLY = MULTIPLY(i3 + i4, FIX_0_541196100);
            int MULTIPLY2 = MULTIPLY(i4, -FIX_1_847759065) + MULTIPLY;
            int MULTIPLY3 = MULTIPLY + MULTIPLY(i3, FIX_0_765366865);
            int i5 = (intBuffer4.get(i) + intBuffer4.get(4)) << 13;
            int i6 = (intBuffer4.get(i) - intBuffer4.get(4)) << 13;
            int i7 = i5 + MULTIPLY3;
            int i8 = i5 - MULTIPLY3;
            int i9 = i6 + MULTIPLY2;
            int i10 = i6 - MULTIPLY2;
            int i11 = intBuffer4.get(7);
            int i12 = intBuffer4.get(5);
            int i13 = intBuffer4.get(3);
            int i14 = intBuffer4.get(1);
            int i15 = i11 + i14;
            int i16 = i12 + i13;
            int i17 = i11 + i13;
            int i18 = i12 + i14;
            int i19 = i2;
            int MULTIPLY4 = MULTIPLY(i17 + i18, FIX_1_175875602);
            int MULTIPLY5 = MULTIPLY(i11, FIX_0_298631336);
            int MULTIPLY6 = MULTIPLY(i12, FIX_2_053119869);
            int MULTIPLY7 = MULTIPLY(i13, FIX_3_072711026);
            int MULTIPLY8 = MULTIPLY(i14, FIX_1_501321110);
            int MULTIPLY9 = MULTIPLY(i15, -FIX_0_899976223);
            int MULTIPLY10 = MULTIPLY(i16, -FIX_2_562915447);
            int MULTIPLY11 = MULTIPLY(i17, -FIX_1_961570560) + MULTIPLY4;
            int MULTIPLY12 = MULTIPLY(i18, -FIX_0_390180644) + MULTIPLY4;
            int i20 = MULTIPLY5 + MULTIPLY9 + MULTIPLY11;
            int i21 = MULTIPLY6 + MULTIPLY10 + MULTIPLY12;
            int i22 = MULTIPLY7 + MULTIPLY10 + MULTIPLY11;
            int i23 = MULTIPLY8 + MULTIPLY9 + MULTIPLY12;
            intBuffer3.put(range_limit(DESCALE(i7 + i23, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i9 + i22, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i10 + i21, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i8 + i20, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i8 - i20, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i10 - i21, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i9 - i22, 18) & RANGE_MASK));
            intBuffer3.put(range_limit(DESCALE(i7 - i23, 18) & RANGE_MASK));
            intBuffer4 = advance(intBuffer4, 8);
            i2 = i19 + 1;
            i = 0;
        }
    }

    private static void prepare_range_limit_table() {
        sample_range_limit.position(256);
        for (int i = 0; i < 128; i++) {
            sample_range_limit.put(i);
        }
        for (int i2 = -128; i2 < 0; i2++) {
            sample_range_limit.put(i2);
        }
        for (int i3 = 0; i3 < 384; i3++) {
            sample_range_limit.put(-1);
        }
        for (int i4 = 0; i4 < 384; i4++) {
            sample_range_limit.put(0);
        }
        for (int i5 = 0; i5 < 128; i5++) {
            sample_range_limit.put(i5);
        }
        for (int i6 = 0; i6 < idct_sample_range_limit.capacity(); i6++) {
            idct_sample_range_limit.put(sample_range_limit.get(i6 + 128) & 255);
        }
    }

    public static int range_limit(int i) {
        return idct_sample_range_limit.get(i + 256);
    }

    private static boolean shortcut(IntBuffer intBuffer, IntBuffer intBuffer2) {
        if (intBuffer.get(8) != 0 || intBuffer.get(16) != 0 || intBuffer.get(24) != 0 || intBuffer.get(32) != 0 || intBuffer.get(40) != 0 || intBuffer.get(48) != 0 || intBuffer.get(56) != 0) {
            return false;
        }
        int i = intBuffer.get(0) << 2;
        intBuffer2.put(0, i);
        intBuffer2.put(8, i);
        intBuffer2.put(16, i);
        intBuffer2.put(24, i);
        intBuffer2.put(32, i);
        intBuffer2.put(40, i);
        intBuffer2.put(48, i);
        intBuffer2.put(56, i);
        advance(intBuffer);
        advance(intBuffer2);
        return true;
    }

    public int[] decode(int[] iArr) {
        IntBuffer wrap = IntBuffer.wrap(iArr);
        IntBuffer allocate = IntBuffer.allocate(64);
        IntBuffer allocate2 = IntBuffer.allocate(64);
        decode(wrap, allocate, allocate2);
        return allocate2.array();
    }

    private static IntBuffer advance(IntBuffer intBuffer, int i) {
        return ((IntBuffer) intBuffer.position(intBuffer.position() + i)).slice();
    }

    /* access modifiers changed from: protected */
    public IntBuffer decode(IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) {
        pass1(intBuffer, intBuffer2.duplicate());
        pass2(intBuffer3, intBuffer2.duplicate());
        return intBuffer3;
    }
}
