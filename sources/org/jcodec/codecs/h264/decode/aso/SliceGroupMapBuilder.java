package org.jcodec.codecs.h264.decode.aso;

public class SliceGroupMapBuilder {
    private static int Max(int i, int i2) {
        return i > i2 ? i : i2;
    }

    private static int Min(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r17v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] buildBoxOutMap(int r15, int r16, int r17, int r18) {
        /*
            int r0 = r15 * r16
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L_0x0006:
            r4 = 1
            if (r3 >= r0) goto L_0x000e
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0006
        L_0x000e:
            int r0 = r15 - r17
            int r0 = r0 / 2
            int r3 = r16 - r17
            int r3 = r3 / 2
            int r5 = r17 + -1
            r10 = r17
            r6 = r0
            r8 = r6
            r9 = r8
            r11 = r3
            r12 = r11
            r7 = r5
            r0 = r18
            r5 = r12
            r3 = 0
        L_0x0024:
            if (r3 >= r0) goto L_0x007e
            int r13 = r5 * r15
            int r13 = r13 + r6
            r14 = r1[r13]
            if (r14 != r4) goto L_0x002f
            r14 = 1
            goto L_0x0030
        L_0x002f:
            r14 = 0
        L_0x0030:
            if (r14 == 0) goto L_0x0034
            r1[r13] = r2
        L_0x0034:
            r13 = -1
            if (r7 != r13) goto L_0x0046
            if (r6 != r8) goto L_0x0046
            int r8 = r8 + -1
            int r6 = Max(r8, r2)
            int r7 = r17 * 2
            int r7 = r7 - r4
            r8 = r6
        L_0x0043:
            r10 = r7
            r7 = 0
            goto L_0x007c
        L_0x0046:
            if (r7 != r4) goto L_0x0058
            if (r6 != r9) goto L_0x0058
            int r9 = r9 + 1
            int r6 = r15 + -1
            int r6 = Min(r9, r6)
            int r7 = r17 * 2
            int r7 = 1 - r7
            r9 = r6
            goto L_0x0043
        L_0x0058:
            if (r10 != r13) goto L_0x0069
            if (r5 != r11) goto L_0x0069
            int r11 = r11 + -1
            int r5 = Max(r11, r2)
            int r7 = r17 * 2
            int r7 = 1 - r7
            r11 = r5
        L_0x0067:
            r10 = 0
            goto L_0x007c
        L_0x0069:
            if (r10 != r4) goto L_0x007a
            if (r5 != r12) goto L_0x007a
            int r12 = r12 + 1
            int r5 = r16 + -1
            int r5 = Min(r12, r5)
            int r7 = r17 * 2
            int r7 = r7 - r4
            r12 = r5
            goto L_0x0067
        L_0x007a:
            int r6 = r6 + r7
            int r5 = r5 + r10
        L_0x007c:
            int r3 = r3 + r14
            goto L_0x0024
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.aso.SliceGroupMapBuilder.buildBoxOutMap(int, int, boolean, int):int[]");
    }

    public static int[] buildDispersedMap(int i, int i2, int i3) {
        int i4 = i2 * i;
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i5] = ((i5 % i) + (((i5 / i) * i3) / 2)) % i3;
        }
        return iArr;
    }

    public static int[] buildForegroundMap(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = i2 * i;
        int[] iArr3 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr3[i5] = i3 - 1;
        }
        for (int i6 = i3 - 2; i6 >= 0; i6--) {
            int i7 = iArr[i6] % i;
            int i8 = iArr2[i6] / i;
            int i9 = iArr2[i6] % i;
            for (int i10 = iArr[i6] / i; i10 <= i8; i10++) {
                for (int i11 = i7; i11 <= i9; i11++) {
                    iArr3[(i10 * i) + i11] = i6;
                }
            }
        }
        return iArr3;
    }

    public static int[] buildInterleavedMap(int i, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = i * i2;
        int[] iArr2 = new int[i3];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            for (int i6 = 0; i6 < length && i5 < i3; i6++) {
                for (int i7 = 0; i7 < iArr[i6]; i7++) {
                    int i8 = i5 + i7;
                    if (i8 >= i3) {
                        break;
                    }
                    iArr2[i8] = i6;
                }
                i5 += iArr[i6];
            }
            if (i5 >= i3) {
                return iArr2;
            }
            i4 = i5;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r4v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] buildRasterScanMap(int r1, int r2, int r3, int r4) {
        /*
            int r1 = r1 * r2
            int[] r2 = new int[r1]
            r0 = 0
        L_0x0005:
            if (r0 >= r3) goto L_0x000c
            r2[r0] = r4
            int r0 = r0 + 1
            goto L_0x0005
        L_0x000c:
            if (r0 >= r1) goto L_0x0015
            int r3 = 1 - r4
            r2[r0] = r3
            int r0 = r0 + 1
            goto L_0x000c
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.aso.SliceGroupMapBuilder.buildRasterScanMap(int, int, int, boolean):int[]");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r10v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] buildWipeMap(int r7, int r8, int r9, int r10) {
        /*
            int r0 = r7 * r8
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r2 >= r7) goto L_0x0023
            r4 = r3
            r3 = 0
        L_0x000b:
            if (r3 >= r8) goto L_0x001f
            int r5 = r3 * r7
            int r5 = r5 + r2
            int r6 = r4 + 1
            if (r4 >= r9) goto L_0x0017
            r0[r5] = r10
            goto L_0x001b
        L_0x0017:
            int r4 = 1 - r10
            r0[r5] = r4
        L_0x001b:
            int r3 = r3 + 1
            r4 = r6
            goto L_0x000b
        L_0x001f:
            int r2 = r2 + 1
            r3 = r4
            goto L_0x0007
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.aso.SliceGroupMapBuilder.buildWipeMap(int, int, int, boolean):int[]");
    }
}
