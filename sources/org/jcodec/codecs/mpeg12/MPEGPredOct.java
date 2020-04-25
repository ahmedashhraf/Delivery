package org.jcodec.codecs.mpeg12;

import org.jcodec.common.tools.MathUtil;

public class MPEGPredOct extends MPEGPred {
    public MPEGPredOct(MPEGPred mPEGPred) {
        super(mPEGPred);
    }

    private void predictEvenOddSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2, int i8, int i9, int i10, int i11) {
        int i12 = i9;
        int i13 = (i4 << i6) - i12;
        int i14 = i11 * i12;
        int i15 = 8 - i2;
        int i16 = (((i3 << i6) + i7) * i4) + i;
        int i17 = i12 * i8;
        int i18 = i10;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = i17;
            int i21 = i16;
            int i22 = 0;
            while (i22 < i12) {
                int i23 = i20 + 1;
                i21++;
                iArr2[i20] = (((iArr[i21] * i15) + (iArr[i21] * i2)) + 4) >> 3;
                i22++;
                i20 = i23;
            }
            i16 = i21 + i13;
            i17 = i20 + i14;
        }
    }

    private void predictEvenOddUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2, int i8, int i9, int i10, int i11) {
        int i12 = i9;
        int i13 = i11 * i12;
        int i14 = i12 * i8;
        int i15 = i10;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = ((i16 + i3) << i6) + i7;
            int i18 = i14;
            int i19 = 0;
            while (i19 < i12) {
                int i20 = i18 + 1;
                int i21 = i19 + i;
                iArr2[i18] = getPix2(iArr, i4, i5, i21, i17, i21 + 1, i17, i6, i7, i2);
                i19++;
                i18 = i20;
            }
            i14 = i18 + i13;
        }
    }

    private void predictOddEvenSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2, int i8, int i9, int i10, int i11) {
        int i12 = i9;
        int i13 = i4 << i6;
        int i14 = i13 - i12;
        int i15 = i11 * i12;
        int i16 = 8 - i3;
        int i17 = (((i2 << i6) + i7) * i4) + i;
        int i18 = i12 * i8;
        int i19 = i10;
        for (int i20 = 0; i20 < i19; i20++) {
            int i21 = i18;
            int i22 = i17;
            int i23 = 0;
            while (i23 < i12) {
                int i24 = i21 + 1;
                iArr2[i21] = (((iArr[i22] * i16) + (iArr[i22 + i13] * i3)) + 4) >> 3;
                i22++;
                i23++;
                i21 = i24;
            }
            i17 = i22 + i14;
            i18 = i21 + i15;
        }
    }

    private void predictOddEvenUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2, int i8, int i9, int i10, int i11) {
        int i12 = i9;
        int i13 = i12 * i8;
        int i14 = i11 * i12;
        int i15 = i10;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 + i2;
            int i18 = (i17 << i6) + i7;
            int i19 = ((i17 + 1) << i6) + i7;
            int i20 = i13;
            int i21 = 0;
            while (i21 < i12) {
                int i22 = i20 + 1;
                int i23 = i21 + i;
                int i24 = i21;
                iArr2[i20] = getPix2(iArr, i4, i5, i23, i18, i23, i19, i6, i7, i3);
                i21 = i24 + 1;
                i20 = i22;
            }
            i13 = i20 + i14;
        }
    }

    private void predictOddOddSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr2, int i9, int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i5 << i7;
        int i15 = i14 - i13;
        int i16 = i12 * i13;
        int i17 = 8 - i2;
        int i18 = 8 - i4;
        int i19 = (((i3 << i7) + i8) * i5) + i;
        int i20 = i13 * i9;
        int i21 = i11;
        for (int i22 = 0; i22 < i21; i22++) {
            int i23 = i20;
            int i24 = i19;
            int i25 = 0;
            while (i25 < i13) {
                int i26 = i23 + 1;
                int i27 = i24 + 1;
                int i28 = i24 + i14;
                iArr2[i23] = ((((((iArr[i24] * i17) * i18) + ((iArr[i27] * i2) * i18)) + ((iArr[i28] * i17) * i4)) + ((iArr[i28 + 1] * i2) * i4)) + 32) >> 6;
                i25++;
                i23 = i26;
                i24 = i27;
            }
            i19 = i24 + i15;
            i20 = i23 + i16;
        }
    }

    private void predictOddOddUnSafe(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr2, int i9, int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i13 * i9;
        int i15 = i12 * i13;
        int i16 = i11;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = i17 + i3;
            int i19 = (i18 << i7) + i8;
            int i20 = ((i18 + 1) << i7) + i8;
            int i21 = i14;
            int i22 = 0;
            while (i22 < i13) {
                int i23 = i22 + i;
                int i24 = i21 + 1;
                int i25 = i23 + 1;
                int i26 = i22;
                int i27 = i17;
                iArr2[i21] = getPix4(iArr, i5, i6, i23, i19, i25, i19, i23, i20, i25, i20, i7, i8, i2, i4);
                i22 = i26 + 1;
                i13 = i10;
                int i28 = i11;
                i21 = i24;
                i17 = i27;
            }
            i14 = i21 + i15;
            i17++;
            i13 = i10;
            i16 = i11;
        }
    }

    /* access modifiers changed from: protected */
    public int getPix2(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i - 1;
        int i11 = (i2 - (1 << i7)) + i8;
        return (((iArr[(MathUtil.clip(i4, 0, i11) * i) + MathUtil.clip(i3, 0, i10)] * (8 - i9)) + (iArr[(MathUtil.clip(i6, 0, i11) * i) + MathUtil.clip(i5, 0, i10)] * i9)) + 4) >> 3;
    }

    /* access modifiers changed from: protected */
    public int getPix4(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = (i2 - (1 << i11)) + i12;
        int i16 = i - 1;
        int i17 = i3;
        int i18 = i4;
        int i19 = 8 - i13;
        int i20 = 8 - i14;
        return ((((((iArr[(MathUtil.clip(i4, 0, i15) * i) + MathUtil.clip(i3, 0, i16)] * i19) * i20) + ((iArr[(MathUtil.clip(i6, 0, i15) * i) + MathUtil.clip(i5, 0, i16)] * i13) * i20)) + ((iArr[(MathUtil.clip(i8, 0, i15) * i) + MathUtil.clip(i7, 0, i16)] * i19) * i14)) + ((iArr[(MathUtil.clip(i10, 0, i15) * i) + MathUtil.clip(i9, 0, i16)] * i13) * i14)) + 32) >> 6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void predictPlane(int[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int[] r23, int r24, int r25, int r26, int r27) {
        /*
            r15 = this;
            int r2 = r17 >> 3
            int r4 = r18 >> 3
            if (r2 < 0) goto L_0x0018
            if (r4 < 0) goto L_0x0018
            int r0 = r2 + r25
            r6 = r19
            if (r0 >= r6) goto L_0x001a
            int r0 = r4 + r26
            int r0 = r0 << r21
            r7 = r20
            if (r0 >= r7) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x0018:
            r6 = r19
        L_0x001a:
            r7 = r20
        L_0x001c:
            r0 = 0
        L_0x001d:
            r1 = r17 & 7
            if (r1 != 0) goto L_0x009f
            r1 = r18 & 7
            if (r1 != 0) goto L_0x005d
            if (r0 == 0) goto L_0x0042
            int r10 = r25 >> 2
            int r11 = r26 >> 2
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r12 = r27
            r0.predictEvenEvenSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0123
        L_0x0042:
            int r10 = r25 >> 2
            int r11 = r26 >> 2
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r12 = r27
            r0.predictEvenEvenUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0123
        L_0x005d:
            if (r0 == 0) goto L_0x007f
            int r0 = r4 << 3
            int r5 = r18 - r0
            int r11 = r25 >> 2
            int r12 = r26 >> 2
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r13 = r27
            r0.predictOddEvenSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0123
        L_0x007f:
            int r0 = r4 << 3
            int r5 = r18 - r0
            int r11 = r25 >> 2
            int r12 = r26 >> 2
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r13 = r27
            r0.predictOddEvenUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0123
        L_0x009f:
            r1 = r18 & 7
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00c3
            int r0 = r2 << 3
            int r3 = r17 - r0
            int r11 = r25 >> 2
            int r12 = r26 >> 2
            r0 = r15
            r1 = r16
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r13 = r27
            r0.predictEvenOddSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0123
        L_0x00c3:
            int r0 = r2 << 3
            int r3 = r17 - r0
            int r11 = r25 >> 2
            int r12 = r26 >> 2
            r0 = r15
            r1 = r16
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r13 = r27
            r0.predictEvenOddUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0123
        L_0x00e0:
            if (r0 == 0) goto L_0x0103
            int r0 = r2 << 3
            int r3 = r17 - r0
            int r0 = r4 << 3
            int r5 = r18 - r0
            int r12 = r25 >> 2
            int r13 = r26 >> 2
            r0 = r15
            r1 = r16
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r14 = r27
            r0.predictOddOddSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0123
        L_0x0103:
            int r0 = r2 << 3
            int r3 = r17 - r0
            int r0 = r4 << 3
            int r5 = r18 - r0
            int r12 = r25 >> 2
            int r13 = r26 >> 2
            r0 = r15
            r1 = r16
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r14 = r27
            r0.predictOddOddUnSafe(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.mpeg12.MPEGPredOct.predictPlane(int[], int, int, int, int, int, int, int[], int, int, int, int):void");
    }
}
