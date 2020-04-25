package org.jcodec.common.dct;

import java.nio.ShortBuffer;

public class FfmpegIntDct {
    private static final int CONST_BITS = 13;

    /* renamed from: D1 */
    private static final int f44805D1 = 11;

    /* renamed from: D2 */
    private static final int f44806D2 = 18;
    private static final int DCTSIZE = 8;
    private static final int DCTSIZE_0 = 0;
    private static final int DCTSIZE_1 = 8;
    private static final int DCTSIZE_2 = 16;
    private static final int DCTSIZE_3 = 24;
    private static final int DCTSIZE_4 = 32;
    private static final int DCTSIZE_5 = 40;
    private static final int DCTSIZE_6 = 48;
    private static final int DCTSIZE_7 = 56;
    private static final short FIX_0_211164243 = 1730;
    private static final short FIX_0_275899380 = 2260;
    private static final short FIX_0_298631336 = 2446;
    private static final short FIX_0_390180644 = 3196;
    private static final short FIX_0_509795579 = 4176;
    private static final short FIX_0_541196100 = 4433;
    private static final short FIX_0_601344887 = 4926;
    private static final short FIX_0_765366865 = 6270;
    private static final short FIX_0_785694958 = 6436;
    private static final short FIX_0_899976223 = 7373;
    private static final short FIX_1_061594337 = 8697;
    private static final short FIX_1_111140466 = 9102;
    private static final short FIX_1_175875602 = 9633;
    private static final short FIX_1_306562965 = 10703;
    private static final short FIX_1_387039845 = 11363;
    private static final short FIX_1_451774981 = 11893;
    private static final short FIX_1_501321110 = 12299;
    private static final short FIX_1_662939225 = 13623;
    private static final short FIX_1_847759065 = 15137;
    private static final short FIX_1_961570560 = 16069;
    private static final short FIX_2_053119869 = 16819;
    private static final short FIX_2_172734803 = 17799;
    private static final short FIX_2_562915447 = 20995;
    private static final short FIX_3_072711026 = 25172;
    private static final int ONEHALF_11 = 1024;
    private static final int ONEHALF_18 = 131072;
    private static final int PASS1_BITS = 2;

    private static final int DESCALE(int i, int i2) {
        return (i + (1 << (i2 - 1))) >> i2;
    }

    private static final short DESCALE11(int i) {
        return (short) ((i + 1024) >> 11);
    }

    private static final short DESCALE18(int i) {
        return (short) ((i + 131072) >> 18);
    }

    private static int MULTIPLY(int i, short s) {
        return s * ((short) i);
    }

    private static ShortBuffer advance(ShortBuffer shortBuffer, int i) {
        return ((ShortBuffer) shortBuffer.position(shortBuffer.position() + i)).slice();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x029e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void pass1(java.nio.ShortBuffer r18) {
        /*
            java.nio.ShortBuffer r0 = r18.duplicate()
            r1 = 7
            r2 = r0
            r0 = 7
        L_0x0007:
            if (r0 < 0) goto L_0x0432
            r3 = 0
            short r4 = r2.get(r3)
            r5 = 1
            short r5 = r2.get(r5)
            r6 = 2
            short r6 = r2.get(r6)
            r7 = 3
            short r7 = r2.get(r7)
            r8 = 4
            short r8 = r2.get(r8)
            r9 = 5
            short r9 = r2.get(r9)
            r10 = 6
            short r10 = r2.get(r10)
            short r11 = r2.get(r1)
            r12 = r8 | r5
            r12 = r12 | r9
            r12 = r12 | r6
            r12 = r12 | r10
            r12 = r12 | r7
            r12 = r12 | r11
            if (r12 != 0) goto L_0x0053
            if (r4 == 0) goto L_0x0048
            int r4 = r4 << 2
        L_0x003d:
            r5 = 8
            if (r3 >= r5) goto L_0x0048
            short r5 = (short) r4
            r2.put(r3, r5)
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0048:
            r3 = 8
            java.nio.ShortBuffer r2 = advance(r2, r3)
            r16 = r0
            r6 = 7
            goto L_0x042d
        L_0x0053:
            if (r7 == 0) goto L_0x0096
            if (r5 == 0) goto L_0x0079
            int r12 = r5 + r7
            r13 = 4433(0x1151, float:6.212E-42)
            int r12 = MULTIPLY(r12, r13)
            int r7 = -r7
            r13 = 15137(0x3b21, float:2.1211E-41)
            int r7 = MULTIPLY(r7, r13)
            int r7 = r7 + r12
            r13 = 6270(0x187e, float:8.786E-42)
            int r5 = MULTIPLY(r5, r13)
            int r12 = r12 + r5
            int r5 = r4 + r6
            int r5 = r5 << 13
            int r4 = r4 - r6
            int r4 = r4 << 13
            int r6 = r5 + r12
            int r5 = r5 - r12
            goto L_0x00af
        L_0x0079:
            int r5 = -r7
            r12 = 10703(0x29cf, float:1.4998E-41)
            int r5 = MULTIPLY(r5, r12)
            r12 = 4433(0x1151, float:6.212E-42)
            int r7 = MULTIPLY(r7, r12)
            int r12 = r4 + r6
            int r12 = r12 << 13
            int r4 = r4 - r6
            int r4 = r4 << 13
            int r6 = r12 + r7
            int r7 = r12 - r7
            int r12 = r4 + r5
            int r4 = r4 - r5
            r5 = r7
            goto L_0x00bc
        L_0x0096:
            if (r5 == 0) goto L_0x00b3
            r7 = 4433(0x1151, float:6.212E-42)
            int r7 = MULTIPLY(r5, r7)
            r12 = 10703(0x29cf, float:1.4998E-41)
            int r5 = MULTIPLY(r5, r12)
            int r12 = r4 + r6
            int r12 = r12 << 13
            int r4 = r4 - r6
            int r4 = r4 << 13
            int r6 = r12 + r5
            int r5 = r12 - r5
        L_0x00af:
            int r12 = r4 + r7
            int r4 = r4 - r7
            goto L_0x00bc
        L_0x00b3:
            int r5 = r4 + r6
            int r5 = r5 << 13
            int r4 = r4 - r6
            int r12 = r4 << 13
            r6 = r5
            r4 = r12
        L_0x00bc:
            r15 = 9633(0x25a1, float:1.3499E-41)
            if (r11 == 0) goto L_0x029e
            r3 = 2446(0x98e, float:3.428E-42)
            if (r10 == 0) goto L_0x01df
            if (r9 == 0) goto L_0x015e
            if (r8 == 0) goto L_0x0118
            int r1 = r11 + r8
            int r7 = r10 + r9
            int r13 = r11 + r9
            int r14 = r10 + r8
            r16 = r0
            int r0 = r13 + r14
            int r0 = MULTIPLY(r0, r15)
            int r3 = MULTIPLY(r11, r3)
            r11 = 16819(0x41b3, float:2.3568E-41)
            int r10 = MULTIPLY(r10, r11)
            r11 = 25172(0x6254, float:3.5273E-41)
            int r9 = MULTIPLY(r9, r11)
            r11 = 12299(0x300b, float:1.7235E-41)
            int r8 = MULTIPLY(r8, r11)
            int r1 = -r1
            r11 = 7373(0x1ccd, float:1.0332E-41)
            int r1 = MULTIPLY(r1, r11)
            int r7 = -r7
            r11 = 20995(0x5203, float:2.942E-41)
            int r7 = MULTIPLY(r7, r11)
            int r11 = -r13
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r11 = MULTIPLY(r11, r13)
            int r13 = -r14
            r14 = 3196(0xc7c, float:4.479E-42)
            int r13 = MULTIPLY(r13, r14)
            int r11 = r11 + r0
            int r13 = r13 + r0
            int r0 = r1 + r11
            int r3 = r3 + r0
            int r0 = r7 + r13
            int r0 = r0 + r10
            int r7 = r7 + r11
            int r7 = r7 + r9
            int r1 = r1 + r13
            int r1 = r1 + r8
            goto L_0x03d0
        L_0x0118:
            r16 = r0
            int r0 = r10 + r9
            int r1 = r11 + r9
            int r7 = r1 + r10
            int r7 = MULTIPLY(r7, r15)
            int r3 = MULTIPLY(r11, r3)
            r8 = 16819(0x41b3, float:2.3568E-41)
            int r8 = MULTIPLY(r10, r8)
            r13 = 25172(0x6254, float:3.5273E-41)
            int r9 = MULTIPLY(r9, r13)
            int r11 = -r11
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r11 = MULTIPLY(r11, r13)
            int r0 = -r0
            r13 = 20995(0x5203, float:2.942E-41)
            int r0 = MULTIPLY(r0, r13)
            int r1 = -r1
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r1 = MULTIPLY(r1, r13)
            int r10 = -r10
            r13 = 3196(0xc7c, float:4.479E-42)
            int r10 = MULTIPLY(r10, r13)
            int r1 = r1 + r7
            int r10 = r10 + r7
            int r7 = r11 + r1
            int r3 = r3 + r7
            int r7 = r0 + r10
            int r7 = r7 + r8
            int r0 = r0 + r1
            int r0 = r0 + r9
            int r1 = r11 + r10
            goto L_0x03da
        L_0x015e:
            r16 = r0
            if (r8 == 0) goto L_0x01a8
            int r0 = r11 + r8
            int r1 = r10 + r8
            int r7 = r11 + r1
            int r7 = MULTIPLY(r7, r15)
            int r3 = MULTIPLY(r11, r3)
            r9 = 16819(0x41b3, float:2.3568E-41)
            int r9 = MULTIPLY(r10, r9)
            r13 = 12299(0x300b, float:1.7235E-41)
            int r8 = MULTIPLY(r8, r13)
            int r0 = -r0
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r0 = MULTIPLY(r0, r13)
            int r10 = -r10
            r13 = 20995(0x5203, float:2.942E-41)
            int r10 = MULTIPLY(r10, r13)
            int r11 = -r11
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r11 = MULTIPLY(r11, r13)
            int r1 = -r1
            r13 = 3196(0xc7c, float:4.479E-42)
            int r1 = MULTIPLY(r1, r13)
            int r11 = r11 + r7
            int r1 = r1 + r7
            int r7 = r0 + r11
            int r3 = r3 + r7
            int r7 = r10 + r1
            int r7 = r7 + r9
            int r9 = r10 + r11
            int r0 = r0 + r1
            int r0 = r0 + r8
            r1 = r0
            r0 = r9
            goto L_0x03da
        L_0x01a8:
            int r0 = -r11
            r1 = 4926(0x133e, float:6.903E-42)
            int r1 = MULTIPLY(r0, r1)
            r3 = 7373(0x1ccd, float:1.0332E-41)
            int r3 = MULTIPLY(r0, r3)
            r7 = 16069(0x3ec5, float:2.2517E-41)
            int r0 = MULTIPLY(r0, r7)
            int r7 = -r10
            r8 = 4176(0x1050, float:5.852E-42)
            int r8 = MULTIPLY(r7, r8)
            r9 = 20995(0x5203, float:2.942E-41)
            int r9 = MULTIPLY(r7, r9)
            r13 = 3196(0xc7c, float:4.479E-42)
            int r7 = MULTIPLY(r7, r13)
            int r10 = r10 + r11
            int r10 = MULTIPLY(r10, r15)
            int r0 = r0 + r10
            int r7 = r7 + r10
            int r1 = r1 + r0
            int r8 = r8 + r7
            int r0 = r0 + r9
            int r3 = r3 + r7
            r7 = r8
            r17 = r3
            r3 = r1
            goto L_0x03b5
        L_0x01df:
            r16 = r0
            if (r9 == 0) goto L_0x0257
            if (r8 == 0) goto L_0x0229
            int r0 = r11 + r8
            int r1 = r11 + r9
            int r7 = r1 + r8
            int r7 = MULTIPLY(r7, r15)
            int r3 = MULTIPLY(r11, r3)
            r10 = 25172(0x6254, float:3.5273E-41)
            int r10 = MULTIPLY(r9, r10)
            r11 = 12299(0x300b, float:1.7235E-41)
            int r11 = MULTIPLY(r8, r11)
            int r0 = -r0
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r0 = MULTIPLY(r0, r13)
            int r9 = -r9
            r13 = 20995(0x5203, float:2.942E-41)
            int r9 = MULTIPLY(r9, r13)
            int r1 = -r1
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r1 = MULTIPLY(r1, r13)
            int r8 = -r8
            r13 = 3196(0xc7c, float:4.479E-42)
            int r8 = MULTIPLY(r8, r13)
            int r1 = r1 + r7
            int r8 = r8 + r7
            int r7 = r0 + r1
            int r3 = r3 + r7
            int r7 = r9 + r8
            int r9 = r9 + r1
            int r1 = r10 + r9
            int r0 = r0 + r8
            int r0 = r0 + r11
            goto L_0x0348
        L_0x0229:
            int r0 = r11 + r9
            int r1 = -r11
            r3 = 4926(0x133e, float:6.903E-42)
            int r3 = MULTIPLY(r1, r3)
            r7 = 7373(0x1ccd, float:1.0332E-41)
            int r1 = MULTIPLY(r1, r7)
            r7 = 4176(0x1050, float:5.852E-42)
            int r7 = MULTIPLY(r9, r7)
            int r8 = -r9
            r9 = 20995(0x5203, float:2.942E-41)
            int r8 = MULTIPLY(r8, r9)
            int r9 = MULTIPLY(r0, r15)
            int r0 = -r0
            r10 = 6436(0x1924, float:9.019E-42)
            int r0 = MULTIPLY(r0, r10)
            int r3 = r3 + r0
            int r8 = r8 + r9
            int r0 = r0 + r7
            int r1 = r1 + r9
            r7 = r8
            goto L_0x03da
        L_0x0257:
            if (r8 == 0) goto L_0x0285
            int r0 = r11 + r8
            int r1 = MULTIPLY(r0, r15)
            r3 = 2260(0x8d4, float:3.167E-42)
            int r0 = MULTIPLY(r0, r3)
            int r3 = -r11
            r7 = 16069(0x3ec5, float:2.2517E-41)
            int r7 = MULTIPLY(r3, r7)
            r9 = 13623(0x3537, float:1.909E-41)
            int r3 = MULTIPLY(r3, r9)
            int r9 = -r8
            r10 = 3196(0xc7c, float:4.479E-42)
            int r9 = MULTIPLY(r9, r10)
            r10 = 9102(0x238e, float:1.2755E-41)
            int r8 = MULTIPLY(r8, r10)
            int r3 = r3 + r0
            int r9 = r9 + r1
            int r1 = r1 + r7
            int r0 = r0 + r8
            goto L_0x0347
        L_0x0285:
            int r0 = -r11
            r1 = 11363(0x2c63, float:1.5923E-41)
            int r3 = MULTIPLY(r0, r1)
            int r1 = MULTIPLY(r11, r15)
            r7 = 6436(0x1924, float:9.019E-42)
            int r0 = MULTIPLY(r0, r7)
            r7 = 2260(0x8d4, float:3.167E-42)
            int r7 = MULTIPLY(r11, r7)
            goto L_0x03b2
        L_0x029e:
            r16 = r0
            if (r10 == 0) goto L_0x0369
            if (r9 == 0) goto L_0x031b
            if (r8 == 0) goto L_0x02ec
            int r0 = r10 + r9
            int r1 = r10 + r8
            int r3 = r9 + r1
            int r3 = MULTIPLY(r3, r15)
            r7 = 16819(0x41b3, float:2.3568E-41)
            int r7 = MULTIPLY(r10, r7)
            r10 = 25172(0x6254, float:3.5273E-41)
            int r10 = MULTIPLY(r9, r10)
            r11 = 12299(0x300b, float:1.7235E-41)
            int r11 = MULTIPLY(r8, r11)
            int r8 = -r8
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r8 = MULTIPLY(r8, r13)
            int r0 = -r0
            r13 = 20995(0x5203, float:2.942E-41)
            int r0 = MULTIPLY(r0, r13)
            int r9 = -r9
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r9 = MULTIPLY(r9, r13)
            int r1 = -r1
            r13 = 3196(0xc7c, float:4.479E-42)
            int r1 = MULTIPLY(r1, r13)
            int r9 = r9 + r3
            int r1 = r1 + r3
            int r3 = r8 + r9
            int r13 = r0 + r1
            int r7 = r7 + r13
            int r0 = r0 + r9
            int r0 = r0 + r10
            int r8 = r8 + r1
            int r1 = r11 + r8
            goto L_0x03da
        L_0x02ec:
            int r0 = r10 + r9
            int r1 = MULTIPLY(r0, r15)
            r3 = 13623(0x3537, float:1.909E-41)
            int r3 = MULTIPLY(r10, r3)
            int r7 = -r10
            r8 = 3196(0xc7c, float:4.479E-42)
            int r7 = MULTIPLY(r7, r8)
            int r0 = -r0
            r8 = 11363(0x2c63, float:1.5923E-41)
            int r0 = MULTIPLY(r0, r8)
            r8 = 9102(0x238e, float:1.2755E-41)
            int r8 = MULTIPLY(r9, r8)
            int r9 = -r9
            r10 = 16069(0x3ec5, float:2.2517E-41)
            int r9 = MULTIPLY(r9, r10)
            int r9 = r9 + r1
            int r3 = r3 + r0
            int r0 = r0 + r8
            int r1 = r1 + r7
            r7 = r3
            r3 = r9
            goto L_0x03da
        L_0x031b:
            if (r8 == 0) goto L_0x034d
            int r0 = r10 + r8
            int r1 = MULTIPLY(r0, r15)
            int r3 = -r8
            r7 = 7373(0x1ccd, float:1.0332E-41)
            int r3 = MULTIPLY(r3, r7)
            r7 = 4926(0x133e, float:6.903E-42)
            int r7 = MULTIPLY(r8, r7)
            int r8 = -r10
            r9 = 4176(0x1050, float:5.852E-42)
            int r9 = MULTIPLY(r8, r9)
            r10 = 20995(0x5203, float:2.942E-41)
            int r8 = MULTIPLY(r8, r10)
            r11 = 6436(0x1924, float:9.019E-42)
            int r0 = MULTIPLY(r0, r11)
            int r3 = r3 + r1
            int r9 = r9 + r0
            int r1 = r1 + r8
            int r0 = r0 + r7
        L_0x0347:
            r7 = r9
        L_0x0348:
            r17 = r1
            r1 = r0
            goto L_0x03d3
        L_0x034d:
            r11 = 6436(0x1924, float:9.019E-42)
            int r3 = MULTIPLY(r10, r15)
            r0 = 2260(0x8d4, float:3.167E-42)
            int r0 = MULTIPLY(r10, r0)
            int r1 = -r10
            r7 = 11363(0x2c63, float:1.5923E-41)
            int r1 = MULTIPLY(r1, r7)
            int r7 = MULTIPLY(r10, r11)
            r17 = r7
            r7 = r0
            r0 = r1
            goto L_0x03b5
        L_0x0369:
            if (r9 == 0) goto L_0x03b8
            if (r8 == 0) goto L_0x039b
            int r0 = r8 + r9
            r1 = 1730(0x6c2, float:2.424E-42)
            int r1 = MULTIPLY(r8, r1)
            int r3 = -r9
            r7 = 11893(0x2e75, float:1.6666E-41)
            int r7 = MULTIPLY(r3, r7)
            r9 = 8697(0x21f9, float:1.2187E-41)
            int r8 = MULTIPLY(r8, r9)
            r9 = 17799(0x4587, float:2.4942E-41)
            int r3 = MULTIPLY(r3, r9)
            r10 = 6436(0x1924, float:9.019E-42)
            int r9 = MULTIPLY(r0, r10)
            int r0 = MULTIPLY(r0, r15)
            int r8 = r8 - r9
            int r3 = r3 + r9
            int r7 = r7 + r0
            int r0 = r0 + r1
            r1 = r0
            r0 = r7
            r7 = r3
            r3 = r8
            goto L_0x03da
        L_0x039b:
            r10 = 6436(0x1924, float:9.019E-42)
            int r0 = -r9
            int r3 = MULTIPLY(r0, r10)
            r1 = 11363(0x2c63, float:1.5923E-41)
            int r1 = MULTIPLY(r0, r1)
            r7 = 2260(0x8d4, float:3.167E-42)
            int r0 = MULTIPLY(r0, r7)
            int r7 = MULTIPLY(r9, r15)
        L_0x03b2:
            r17 = r7
            r7 = r1
        L_0x03b5:
            r1 = r17
            goto L_0x03da
        L_0x03b8:
            r1 = 11363(0x2c63, float:1.5923E-41)
            r7 = 2260(0x8d4, float:3.167E-42)
            r10 = 6436(0x1924, float:9.019E-42)
            if (r8 == 0) goto L_0x03d6
            int r3 = MULTIPLY(r8, r7)
            int r0 = MULTIPLY(r8, r10)
            int r7 = MULTIPLY(r8, r15)
            int r1 = MULTIPLY(r8, r1)
        L_0x03d0:
            r17 = r7
            r7 = r0
        L_0x03d3:
            r0 = r17
            goto L_0x03da
        L_0x03d6:
            r0 = 0
            r1 = 0
            r3 = 0
            r7 = 0
        L_0x03da:
            int r8 = r6 + r1
            short r8 = DESCALE11(r8)
            r9 = 0
            r2.put(r9, r8)
            int r6 = r6 - r1
            short r1 = DESCALE11(r6)
            r6 = 7
            r2.put(r6, r1)
            r1 = 1
            int r8 = r12 + r0
            short r8 = DESCALE11(r8)
            r2.put(r1, r8)
            r1 = 6
            int r12 = r12 - r0
            short r0 = DESCALE11(r12)
            r2.put(r1, r0)
            r0 = 2
            int r1 = r4 + r7
            short r1 = DESCALE11(r1)
            r2.put(r0, r1)
            r0 = 5
            int r4 = r4 - r7
            short r1 = DESCALE11(r4)
            r2.put(r0, r1)
            r0 = 3
            int r1 = r5 + r3
            short r1 = DESCALE11(r1)
            r2.put(r0, r1)
            r0 = 4
            int r5 = r5 - r3
            short r1 = DESCALE11(r5)
            r2.put(r0, r1)
            r0 = 8
            java.nio.ShortBuffer r0 = advance(r2, r0)
            r2 = r0
        L_0x042d:
            int r0 = r16 + -1
            r1 = 7
            goto L_0x0007
        L_0x0432:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.common.dct.FfmpegIntDct.pass1(java.nio.ShortBuffer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void pass2(java.nio.ShortBuffer r18) {
        /*
            java.nio.ShortBuffer r0 = r18.duplicate()
            r1 = 7
        L_0x0005:
            if (r1 < 0) goto L_0x0417
            r2 = 0
            short r3 = r0.get(r2)
            r4 = 8
            short r4 = r0.get(r4)
            r5 = 16
            short r5 = r0.get(r5)
            r6 = 24
            short r6 = r0.get(r6)
            r7 = 32
            short r7 = r0.get(r7)
            r8 = 40
            short r8 = r0.get(r8)
            r9 = 48
            short r9 = r0.get(r9)
            r10 = 56
            short r10 = r0.get(r10)
            r11 = 4433(0x1151, float:6.212E-42)
            if (r9 == 0) goto L_0x0077
            if (r5 == 0) goto L_0x005c
            int r12 = r5 + r9
            int r11 = MULTIPLY(r12, r11)
            int r9 = -r9
            r12 = 15137(0x3b21, float:2.1211E-41)
            int r9 = MULTIPLY(r9, r12)
            int r9 = r9 + r11
            r12 = 6270(0x187e, float:8.786E-42)
            int r5 = MULTIPLY(r5, r12)
            int r11 = r11 + r5
            int r5 = r3 + r7
            int r5 = r5 << 13
            int r3 = r3 - r7
            int r3 = r3 << 13
            int r7 = r5 + r11
            int r5 = r5 - r11
            goto L_0x008e
        L_0x005c:
            int r5 = -r9
            r12 = 10703(0x29cf, float:1.4998E-41)
            int r5 = MULTIPLY(r5, r12)
            int r9 = MULTIPLY(r9, r11)
            int r11 = r3 + r7
            int r11 = r11 << 13
            int r3 = r3 - r7
            int r3 = r3 << 13
            int r7 = r11 + r9
            int r9 = r11 - r9
            int r11 = r3 + r5
            int r3 = r3 - r5
            r5 = r9
            goto L_0x009b
        L_0x0077:
            if (r5 == 0) goto L_0x0092
            int r9 = MULTIPLY(r5, r11)
            r11 = 10703(0x29cf, float:1.4998E-41)
            int r5 = MULTIPLY(r5, r11)
            int r11 = r3 + r7
            int r11 = r11 << 13
            int r3 = r3 - r7
            int r3 = r3 << 13
            int r7 = r11 + r5
            int r5 = r11 - r5
        L_0x008e:
            int r11 = r3 + r9
            int r3 = r3 - r9
            goto L_0x009b
        L_0x0092:
            int r5 = r3 + r7
            int r5 = r5 << 13
            int r3 = r3 - r7
            int r11 = r3 << 13
            r7 = r5
            r3 = r11
        L_0x009b:
            r14 = 9633(0x25a1, float:1.3499E-41)
            if (r10 == 0) goto L_0x027a
            r2 = 2446(0x98e, float:3.428E-42)
            if (r8 == 0) goto L_0x01bb
            if (r6 == 0) goto L_0x013e
            if (r4 == 0) goto L_0x00f7
            int r15 = r10 + r4
            int r9 = r8 + r6
            int r12 = r10 + r6
            int r13 = r8 + r4
            r16 = r1
            int r1 = r12 + r13
            int r1 = MULTIPLY(r1, r14)
            int r2 = MULTIPLY(r10, r2)
            r10 = 16819(0x41b3, float:2.3568E-41)
            int r8 = MULTIPLY(r8, r10)
            r10 = 25172(0x6254, float:3.5273E-41)
            int r6 = MULTIPLY(r6, r10)
            r10 = 12299(0x300b, float:1.7235E-41)
            int r4 = MULTIPLY(r4, r10)
            int r10 = -r15
            r14 = 7373(0x1ccd, float:1.0332E-41)
            int r10 = MULTIPLY(r10, r14)
            int r9 = -r9
            r14 = 20995(0x5203, float:2.942E-41)
            int r9 = MULTIPLY(r9, r14)
            int r12 = -r12
            r14 = 16069(0x3ec5, float:2.2517E-41)
            int r12 = MULTIPLY(r12, r14)
            int r13 = -r13
            r14 = 3196(0xc7c, float:4.479E-42)
            int r13 = MULTIPLY(r13, r14)
            int r12 = r12 + r1
            int r13 = r13 + r1
            int r1 = r10 + r12
            int r2 = r2 + r1
            int r1 = r9 + r13
            int r1 = r1 + r8
            int r9 = r9 + r12
            int r6 = r6 + r9
            int r10 = r10 + r13
            int r4 = r4 + r10
            goto L_0x03b4
        L_0x00f7:
            r16 = r1
            int r1 = r8 + r6
            int r4 = r10 + r6
            int r9 = r4 + r8
            int r9 = MULTIPLY(r9, r14)
            int r2 = MULTIPLY(r10, r2)
            r12 = 16819(0x41b3, float:2.3568E-41)
            int r12 = MULTIPLY(r8, r12)
            r13 = 25172(0x6254, float:3.5273E-41)
            int r6 = MULTIPLY(r6, r13)
            int r10 = -r10
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r10 = MULTIPLY(r10, r13)
            int r1 = -r1
            r13 = 20995(0x5203, float:2.942E-41)
            int r1 = MULTIPLY(r1, r13)
            int r4 = -r4
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r4 = MULTIPLY(r4, r13)
            int r8 = -r8
            r13 = 3196(0xc7c, float:4.479E-42)
            int r8 = MULTIPLY(r8, r13)
            int r4 = r4 + r9
            int r8 = r8 + r9
            int r9 = r10 + r4
            int r2 = r2 + r9
            int r9 = r1 + r8
            int r9 = r9 + r12
            int r1 = r1 + r4
            int r1 = r1 + r6
            int r4 = r10 + r8
            r6 = r1
            goto L_0x03b5
        L_0x013e:
            r16 = r1
            if (r4 == 0) goto L_0x0185
            int r1 = r10 + r4
            int r6 = r8 + r4
            int r9 = r10 + r6
            int r9 = MULTIPLY(r9, r14)
            int r2 = MULTIPLY(r10, r2)
            r12 = 16819(0x41b3, float:2.3568E-41)
            int r12 = MULTIPLY(r8, r12)
            r13 = 12299(0x300b, float:1.7235E-41)
            int r4 = MULTIPLY(r4, r13)
            int r1 = -r1
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r1 = MULTIPLY(r1, r13)
            int r8 = -r8
            r13 = 20995(0x5203, float:2.942E-41)
            int r8 = MULTIPLY(r8, r13)
            int r10 = -r10
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r10 = MULTIPLY(r10, r13)
            int r6 = -r6
            r13 = 3196(0xc7c, float:4.479E-42)
            int r6 = MULTIPLY(r6, r13)
            int r10 = r10 + r9
            int r6 = r6 + r9
            int r9 = r1 + r10
            int r2 = r2 + r9
            int r9 = r8 + r6
            int r9 = r9 + r12
            int r8 = r8 + r10
            int r1 = r1 + r6
            int r1 = r1 + r4
            goto L_0x037c
        L_0x0185:
            int r1 = -r10
            r2 = 4926(0x133e, float:6.903E-42)
            int r2 = MULTIPLY(r1, r2)
            r4 = 7373(0x1ccd, float:1.0332E-41)
            int r4 = MULTIPLY(r1, r4)
            r6 = 16069(0x3ec5, float:2.2517E-41)
            int r1 = MULTIPLY(r1, r6)
            int r6 = -r8
            r9 = 4176(0x1050, float:5.852E-42)
            int r9 = MULTIPLY(r6, r9)
            r12 = 20995(0x5203, float:2.942E-41)
            int r12 = MULTIPLY(r6, r12)
            r13 = 3196(0xc7c, float:4.479E-42)
            int r6 = MULTIPLY(r6, r13)
            int r8 = r8 + r10
            int r8 = MULTIPLY(r8, r14)
            int r1 = r1 + r8
            int r6 = r6 + r8
            int r2 = r2 + r1
            int r8 = r9 + r6
            int r1 = r1 + r12
            int r4 = r4 + r6
            r6 = r1
            r1 = r4
            goto L_0x02c9
        L_0x01bb:
            r16 = r1
            if (r6 == 0) goto L_0x0235
            if (r4 == 0) goto L_0x0204
            int r1 = r10 + r4
            int r8 = r10 + r6
            int r9 = r8 + r4
            int r9 = MULTIPLY(r9, r14)
            int r2 = MULTIPLY(r10, r2)
            r10 = 25172(0x6254, float:3.5273E-41)
            int r10 = MULTIPLY(r6, r10)
            r12 = 12299(0x300b, float:1.7235E-41)
            int r12 = MULTIPLY(r4, r12)
            int r1 = -r1
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r1 = MULTIPLY(r1, r13)
            int r6 = -r6
            r13 = 20995(0x5203, float:2.942E-41)
            int r6 = MULTIPLY(r6, r13)
            int r8 = -r8
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r8 = MULTIPLY(r8, r13)
            int r4 = -r4
            r13 = 3196(0xc7c, float:4.479E-42)
            int r4 = MULTIPLY(r4, r13)
            int r8 = r8 + r9
            int r4 = r4 + r9
            int r9 = r1 + r8
            int r2 = r2 + r9
            int r9 = r6 + r4
            int r6 = r6 + r8
            int r6 = r6 + r10
            int r1 = r1 + r4
            int r1 = r1 + r12
            goto L_0x03bb
        L_0x0204:
            int r1 = r10 + r6
            int r2 = -r10
            r4 = 4926(0x133e, float:6.903E-42)
            int r4 = MULTIPLY(r2, r4)
            r8 = 7373(0x1ccd, float:1.0332E-41)
            int r2 = MULTIPLY(r2, r8)
            r8 = 4176(0x1050, float:5.852E-42)
            int r8 = MULTIPLY(r6, r8)
            int r6 = -r6
            r9 = 20995(0x5203, float:2.942E-41)
            int r6 = MULTIPLY(r6, r9)
            int r9 = MULTIPLY(r1, r14)
            int r1 = -r1
            r10 = 6436(0x1924, float:9.019E-42)
            int r1 = MULTIPLY(r1, r10)
            int r4 = r4 + r1
            int r6 = r6 + r9
            int r1 = r1 + r8
            int r2 = r2 + r9
            r9 = r6
            r6 = r1
            r1 = r2
            r2 = r4
            goto L_0x03bb
        L_0x0235:
            if (r4 == 0) goto L_0x0261
            int r1 = r10 + r4
            int r2 = MULTIPLY(r1, r14)
            r6 = 2260(0x8d4, float:3.167E-42)
            int r1 = MULTIPLY(r1, r6)
            int r6 = -r10
            r8 = 16069(0x3ec5, float:2.2517E-41)
            int r8 = MULTIPLY(r6, r8)
            r9 = 13623(0x3537, float:1.909E-41)
            int r6 = MULTIPLY(r6, r9)
            int r9 = -r4
            r10 = 3196(0xc7c, float:4.479E-42)
            int r9 = MULTIPLY(r9, r10)
            r10 = 9102(0x238e, float:1.2755E-41)
            int r4 = MULTIPLY(r4, r10)
            int r6 = r6 + r1
            int r9 = r9 + r2
            goto L_0x0327
        L_0x0261:
            int r1 = -r10
            r2 = 11363(0x2c63, float:1.5923E-41)
            int r2 = MULTIPLY(r1, r2)
            int r4 = MULTIPLY(r10, r14)
            r6 = 6436(0x1924, float:9.019E-42)
            int r1 = MULTIPLY(r1, r6)
            r6 = 2260(0x8d4, float:3.167E-42)
            int r6 = MULTIPLY(r10, r6)
            goto L_0x0395
        L_0x027a:
            r16 = r1
            if (r8 == 0) goto L_0x034c
            if (r6 == 0) goto L_0x02fd
            if (r4 == 0) goto L_0x02cc
            int r1 = r8 + r6
            int r2 = r8 + r4
            int r9 = r6 + r2
            int r9 = MULTIPLY(r9, r14)
            r10 = 16819(0x41b3, float:2.3568E-41)
            int r8 = MULTIPLY(r8, r10)
            r10 = 25172(0x6254, float:3.5273E-41)
            int r10 = MULTIPLY(r6, r10)
            r12 = 12299(0x300b, float:1.7235E-41)
            int r12 = MULTIPLY(r4, r12)
            int r4 = -r4
            r13 = 7373(0x1ccd, float:1.0332E-41)
            int r4 = MULTIPLY(r4, r13)
            int r1 = -r1
            r13 = 20995(0x5203, float:2.942E-41)
            int r1 = MULTIPLY(r1, r13)
            int r6 = -r6
            r13 = 16069(0x3ec5, float:2.2517E-41)
            int r6 = MULTIPLY(r6, r13)
            int r2 = -r2
            r13 = 3196(0xc7c, float:4.479E-42)
            int r2 = MULTIPLY(r2, r13)
            int r6 = r6 + r9
            int r2 = r2 + r9
            int r9 = r4 + r6
            int r13 = r1 + r2
            int r8 = r8 + r13
            int r1 = r1 + r6
            int r1 = r1 + r10
            int r4 = r4 + r2
            int r2 = r12 + r4
            r6 = r1
            r1 = r2
            r2 = r9
        L_0x02c9:
            r9 = r8
            goto L_0x03bb
        L_0x02cc:
            int r1 = r8 + r6
            int r2 = MULTIPLY(r1, r14)
            r4 = 13623(0x3537, float:1.909E-41)
            int r4 = MULTIPLY(r8, r4)
            int r8 = -r8
            r9 = 3196(0xc7c, float:4.479E-42)
            int r8 = MULTIPLY(r8, r9)
            int r1 = -r1
            r9 = 11363(0x2c63, float:1.5923E-41)
            int r1 = MULTIPLY(r1, r9)
            r9 = 9102(0x238e, float:1.2755E-41)
            int r9 = MULTIPLY(r6, r9)
            int r6 = -r6
            r10 = 16069(0x3ec5, float:2.2517E-41)
            int r6 = MULTIPLY(r6, r10)
            int r6 = r6 + r2
            int r4 = r4 + r1
            int r1 = r1 + r9
            int r2 = r2 + r8
            r9 = r4
            r17 = r6
            r6 = r1
            r1 = r2
            goto L_0x032c
        L_0x02fd:
            if (r4 == 0) goto L_0x0330
            int r1 = r8 + r4
            int r2 = MULTIPLY(r1, r14)
            int r6 = -r4
            r9 = 7373(0x1ccd, float:1.0332E-41)
            int r6 = MULTIPLY(r6, r9)
            r9 = 4926(0x133e, float:6.903E-42)
            int r4 = MULTIPLY(r4, r9)
            int r8 = -r8
            r9 = 4176(0x1050, float:5.852E-42)
            int r9 = MULTIPLY(r8, r9)
            r10 = 20995(0x5203, float:2.942E-41)
            int r8 = MULTIPLY(r8, r10)
            r10 = 6436(0x1924, float:9.019E-42)
            int r1 = MULTIPLY(r1, r10)
            int r6 = r6 + r2
            int r9 = r9 + r1
        L_0x0327:
            int r2 = r2 + r8
            int r1 = r1 + r4
            r17 = r6
            r6 = r2
        L_0x032c:
            r2 = r17
            goto L_0x03bb
        L_0x0330:
            r10 = 6436(0x1924, float:9.019E-42)
            int r2 = MULTIPLY(r8, r14)
            r1 = 2260(0x8d4, float:3.167E-42)
            int r1 = MULTIPLY(r8, r1)
            int r4 = -r8
            r6 = 11363(0x2c63, float:1.5923E-41)
            int r4 = MULTIPLY(r4, r6)
            int r6 = MULTIPLY(r8, r10)
            r9 = r1
            r1 = r6
            r6 = r4
            goto L_0x03bb
        L_0x034c:
            if (r6 == 0) goto L_0x039c
            if (r4 == 0) goto L_0x037e
            int r1 = r4 + r6
            r2 = 1730(0x6c2, float:2.424E-42)
            int r2 = MULTIPLY(r4, r2)
            int r6 = -r6
            r8 = 11893(0x2e75, float:1.6666E-41)
            int r8 = MULTIPLY(r6, r8)
            r9 = 8697(0x21f9, float:1.2187E-41)
            int r4 = MULTIPLY(r4, r9)
            r9 = 17799(0x4587, float:2.4942E-41)
            int r6 = MULTIPLY(r6, r9)
            r9 = 6436(0x1924, float:9.019E-42)
            int r9 = MULTIPLY(r1, r9)
            int r1 = MULTIPLY(r1, r14)
            int r4 = r4 - r9
            int r6 = r6 + r9
            int r8 = r8 + r1
            int r2 = r2 + r1
            r1 = r2
            r2 = r4
            r9 = r6
        L_0x037c:
            r6 = r8
            goto L_0x03bb
        L_0x037e:
            r9 = 6436(0x1924, float:9.019E-42)
            int r1 = -r6
            int r2 = MULTIPLY(r1, r9)
            r8 = 11363(0x2c63, float:1.5923E-41)
            int r4 = MULTIPLY(r1, r8)
            r10 = 2260(0x8d4, float:3.167E-42)
            int r1 = MULTIPLY(r1, r10)
            int r6 = MULTIPLY(r6, r14)
        L_0x0395:
            r9 = r4
            r17 = r6
            r6 = r1
            r1 = r17
            goto L_0x03bb
        L_0x039c:
            r8 = 11363(0x2c63, float:1.5923E-41)
            r9 = 6436(0x1924, float:9.019E-42)
            r10 = 2260(0x8d4, float:3.167E-42)
            if (r4 == 0) goto L_0x03b7
            int r2 = MULTIPLY(r4, r10)
            int r1 = MULTIPLY(r4, r9)
            int r6 = MULTIPLY(r4, r14)
            int r4 = MULTIPLY(r4, r8)
        L_0x03b4:
            r9 = r1
        L_0x03b5:
            r1 = r4
            goto L_0x03bb
        L_0x03b7:
            r1 = 0
            r2 = 0
            r6 = 0
            r9 = 0
        L_0x03bb:
            int r4 = r7 + r1
            short r4 = DESCALE18(r4)
            r8 = 0
            r0.put(r8, r4)
            r4 = 56
            int r7 = r7 - r1
            short r1 = DESCALE18(r7)
            r0.put(r4, r1)
            r1 = 8
            int r4 = r11 + r6
            short r4 = DESCALE18(r4)
            r0.put(r1, r4)
            r1 = 48
            int r11 = r11 - r6
            short r4 = DESCALE18(r11)
            r0.put(r1, r4)
            r1 = 16
            int r4 = r3 + r9
            short r4 = DESCALE18(r4)
            r0.put(r1, r4)
            r1 = 40
            int r3 = r3 - r9
            short r3 = DESCALE18(r3)
            r0.put(r1, r3)
            r1 = 24
            int r3 = r5 + r2
            short r3 = DESCALE18(r3)
            r0.put(r1, r3)
            r1 = 32
            int r5 = r5 - r2
            short r2 = DESCALE18(r5)
            r0.put(r1, r2)
            r1 = 1
            java.nio.ShortBuffer r0 = advance(r0, r1)
            int r1 = r16 + -1
            goto L_0x0005
        L_0x0417:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.common.dct.FfmpegIntDct.pass2(java.nio.ShortBuffer):void");
    }

    public short[] decode(short[] sArr) {
        ShortBuffer wrap = ShortBuffer.wrap(sArr);
        pass1(wrap);
        pass2(wrap);
        return sArr;
    }
}
