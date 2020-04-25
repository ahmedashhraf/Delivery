package org.jcodec.codecs.h264.decode;

import org.jcodec.codecs.h264.H264Const.PartPred;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.common.tools.MathUtil;

public class Prediction {

    /* renamed from: sh */
    private SliceHeader f44739sh;

    public Prediction(SliceHeader sliceHeader) {
        this.f44739sh = sliceHeader;
    }

    private void copyPrediction(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2) {
        int i5 = i2;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = i5;
            int i8 = 0;
            while (i8 < i3) {
                iArr2[i7] = iArr[i7];
                i8++;
                i7++;
            }
            i6++;
            i5 = (i - i3) + i7;
        }
    }

    private void mergeAvg(int[] iArr, int[] iArr2, int i, PartPred partPred, int i2, int i3, int i4, int[] iArr3) {
        if (partPred == PartPred.Bi) {
            mergePrediction(iArr, iArr2, i, partPred, i2, i3, i4, iArr3);
        } else if (partPred == PartPred.L0) {
            copyPrediction(iArr, i, i2, i3, i4, iArr3);
        } else if (partPred == PartPred.L1) {
            copyPrediction(iArr2, i, i2, i3, i4, iArr3);
        }
    }

    private void mergeWeight(int[] iArr, int[] iArr2, int i, PartPred partPred, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr3) {
        PartPred partPred2 = partPred;
        if (partPred2 == PartPred.L0) {
            weight(iArr, i, i2, i3, i4, i5, i6, i8, iArr3);
        } else if (partPred2 == PartPred.L1) {
            weight(iArr2, i, i2, i3, i4, i5, i7, i9, iArr3);
        } else if (partPred2 == PartPred.Bi) {
            weightPrediction(iArr, iArr2, i, i2, i3, i4, i5, i6, i7, i8, i9, iArr3);
        }
    }

    private void weight(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr2) {
        int i8 = 1 << (i5 - 1);
        if (i5 >= 1) {
            int i9 = i2;
            int i10 = 0;
            while (i10 < i4) {
                int i11 = i9;
                int i12 = 0;
                while (i12 < i3) {
                    iArr2[i11] = MathUtil.clip((((iArr[i11] * i6) + i8) >> i5) + i7, 0, 255);
                    i12++;
                    i11++;
                }
                i10++;
                i9 = (i - i3) + i11;
            }
            return;
        }
        int i13 = i2;
        int i14 = 0;
        while (i14 < i4) {
            int i15 = i13;
            int i16 = 0;
            while (i16 < i3) {
                iArr2[i15] = MathUtil.clip((iArr[i15] * i6) + i7, 0, 255);
                i16++;
                i15++;
            }
            i14++;
            i13 = (i - i3) + i15;
        }
    }

    private void weightPrediction(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr3) {
        int i10 = i3;
        int i11 = 1 << i5;
        int i12 = ((i8 + i9) + 1) >> 1;
        int i13 = i5 + 1;
        int i14 = i2;
        int i15 = i4;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = i14;
            int i18 = 0;
            while (i18 < i10) {
                iArr3[i17] = MathUtil.clip(((((iArr[i17] * i6) + (iArr2[i17] * i7)) + i11) >> i13) + i12, 0, 255);
                i18++;
                i17++;
            }
            i16++;
            i14 = (i - i10) + i17;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r18 != org.jcodec.codecs.h264.H264Const.PartPred.Bi) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mergePrediction(int r16, int r17, org.jcodec.codecs.h264.H264Const.PartPred r18, int r19, int[] r20, int[] r21, int r22, int r23, int r24, int r25, int[] r26, org.jcodec.codecs.h264.p552io.model.Frame[][] r27, org.jcodec.codecs.h264.p552io.model.Frame r28) {
        /*
            r15 = this;
            r14 = r15
            r0 = r16
            r1 = r17
            org.jcodec.codecs.h264.io.model.SliceHeader r2 = r14.f44739sh
            org.jcodec.codecs.h264.io.model.PictureParameterSet r3 = r2.pps
            org.jcodec.codecs.h264.io.model.SliceType r4 = r2.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L_0x0070
            boolean r1 = r3.weighted_pred_flag
            if (r1 == 0) goto L_0x005e
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r1 = r2.pred_weight_table
            if (r1 == 0) goto L_0x005e
            if (r19 != 0) goto L_0x001e
            int r2 = r1.luma_log2_weight_denom
            goto L_0x0020
        L_0x001e:
            int r2 = r1.chroma_log2_weight_denom
        L_0x0020:
            r8 = r2
            if (r19 != 0) goto L_0x002a
            int[][] r2 = r1.luma_weight
            r2 = r2[r7]
            r2 = r2[r0]
            goto L_0x0034
        L_0x002a:
            int[][][] r2 = r1.chroma_weight
            r2 = r2[r7]
            int r3 = r19 + -1
            r2 = r2[r3]
            r2 = r2[r0]
        L_0x0034:
            r9 = r2
            if (r19 != 0) goto L_0x003e
            int[][] r1 = r1.luma_offset
            r1 = r1[r7]
            r0 = r1[r0]
            goto L_0x0048
        L_0x003e:
            int[][][] r1 = r1.chroma_offset
            r1 = r1[r7]
            int r2 = r19 + -1
            r1 = r1[r2]
            r0 = r1[r0]
        L_0x0048:
            r10 = r0
            r0 = r15
            r1 = r20
            r2 = r23
            r3 = r22
            r4 = r24
            r5 = r25
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r26
            r0.weight(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01a6
        L_0x005e:
            r0 = r15
            r1 = r20
            r2 = r23
            r3 = r22
            r4 = r24
            r5 = r25
            r6 = r26
            r0.copyPrediction(r1, r2, r3, r4, r5, r6)
            goto L_0x01a6
        L_0x0070:
            boolean r2 = r3.weighted_pred_flag
            if (r2 == 0) goto L_0x0190
            int r2 = r3.weighted_bipred_idc
            if (r2 == 0) goto L_0x0190
            r3 = 2
            if (r2 != r3) goto L_0x0083
            org.jcodec.codecs.h264.H264Const$PartPred r2 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            r4 = r18
            if (r4 == r2) goto L_0x0085
            goto L_0x0192
        L_0x0083:
            r4 = r18
        L_0x0085:
            org.jcodec.codecs.h264.io.model.SliceHeader r2 = r14.f44739sh
            org.jcodec.codecs.h264.io.model.PictureParameterSet r5 = r2.pps
            int r5 = r5.weighted_bipred_idc
            if (r5 != r6) goto L_0x010e
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r2 = r2.pred_weight_table
            r3 = -1
            if (r0 != r3) goto L_0x0094
            r9 = 0
            goto L_0x00a8
        L_0x0094:
            if (r19 != 0) goto L_0x009d
            int[][] r5 = r2.luma_weight
            r5 = r5[r7]
            r5 = r5[r0]
            goto L_0x00a7
        L_0x009d:
            int[][][] r5 = r2.chroma_weight
            r5 = r5[r7]
            int r8 = r19 + -1
            r5 = r5[r8]
            r5 = r5[r0]
        L_0x00a7:
            r9 = r5
        L_0x00a8:
            if (r1 != r3) goto L_0x00ac
            r10 = 0
            goto L_0x00c0
        L_0x00ac:
            if (r19 != 0) goto L_0x00b5
            int[][] r5 = r2.luma_weight
            r5 = r5[r6]
            r5 = r5[r1]
            goto L_0x00bf
        L_0x00b5:
            int[][][] r5 = r2.chroma_weight
            r5 = r5[r6]
            int r8 = r19 + -1
            r5 = r5[r8]
            r5 = r5[r1]
        L_0x00bf:
            r10 = r5
        L_0x00c0:
            if (r0 != r3) goto L_0x00c4
            r11 = 0
            goto L_0x00d8
        L_0x00c4:
            if (r19 != 0) goto L_0x00cd
            int[][] r5 = r2.luma_offset
            r5 = r5[r7]
            r0 = r5[r0]
            goto L_0x00d7
        L_0x00cd:
            int[][][] r5 = r2.chroma_offset
            r5 = r5[r7]
            int r8 = r19 + -1
            r5 = r5[r8]
            r0 = r5[r0]
        L_0x00d7:
            r11 = r0
        L_0x00d8:
            if (r1 != r3) goto L_0x00dc
            r12 = 0
            goto L_0x00f0
        L_0x00dc:
            if (r19 != 0) goto L_0x00e5
            int[][] r0 = r2.luma_offset
            r0 = r0[r6]
            r0 = r0[r1]
            goto L_0x00ef
        L_0x00e5:
            int[][][] r0 = r2.chroma_offset
            r0 = r0[r6]
            int r3 = r19 + -1
            r0 = r0[r3]
            r0 = r0[r1]
        L_0x00ef:
            r12 = r0
        L_0x00f0:
            if (r19 != 0) goto L_0x00f5
            int r0 = r2.luma_log2_weight_denom
            goto L_0x00f7
        L_0x00f5:
            int r0 = r2.chroma_log2_weight_denom
        L_0x00f7:
            r8 = r0
            r0 = r15
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r13 = r26
            r0.mergeWeight(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x01a6
        L_0x010e:
            int r2 = r28.getPOC()
            r5 = r27[r7]
            r5 = r5[r0]
            int r5 = r5.getPOC()
            int r2 = r2 - r5
            r5 = 127(0x7f, float:1.78E-43)
            r8 = -128(0xffffffffffffff80, float:NaN)
            int r2 = org.jcodec.common.tools.MathUtil.clip(r2, r8, r5)
            r9 = r27[r6]
            r9 = r9[r1]
            int r9 = r9.getPOC()
            r10 = r27[r7]
            r10 = r10[r0]
            int r10 = r10.getPOC()
            int r9 = r9 - r10
            int r5 = org.jcodec.common.tools.MathUtil.clip(r9, r8, r5)
            r8 = 32
            if (r5 == 0) goto L_0x0174
            r7 = r27[r7]
            r0 = r7[r0]
            boolean r0 = r0.isShortTerm()
            if (r0 == 0) goto L_0x0174
            r0 = r27[r6]
            r0 = r0[r1]
            boolean r0 = r0.isShortTerm()
            if (r0 == 0) goto L_0x0174
            int r0 = r5 / 2
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + 16384
            int r0 = r0 / r5
            int r2 = r2 * r0
            int r2 = r2 + r8
            int r0 = r2 >> 6
            r1 = -1024(0xfffffffffffffc00, float:NaN)
            r2 = 1023(0x3ff, float:1.434E-42)
            int r0 = org.jcodec.common.tools.MathUtil.clip(r0, r1, r2)
            int r0 = r0 >> r3
            r1 = -64
            if (r0 < r1) goto L_0x0174
            r1 = 128(0x80, float:1.794E-43)
            if (r0 > r1) goto L_0x0174
            int r1 = 64 - r0
            r10 = r0
            r9 = r1
            goto L_0x0178
        L_0x0174:
            r9 = 32
            r10 = 32
        L_0x0178:
            r8 = 5
            r11 = 0
            r12 = 0
            r0 = r15
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r13 = r26
            r0.mergeWeight(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x01a6
        L_0x0190:
            r4 = r18
        L_0x0192:
            r0 = r15
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r8 = r26
            r0.mergeAvg(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.Prediction.mergePrediction(int, int, org.jcodec.codecs.h264.H264Const$PartPred, int, int[], int[], int, int, int, int, int[], org.jcodec.codecs.h264.io.model.Frame[][], org.jcodec.codecs.h264.io.model.Frame):void");
    }

    private void mergePrediction(int[] iArr, int[] iArr2, int i, PartPred partPred, int i2, int i3, int i4, int[] iArr3) {
        int i5 = i2;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = i5;
            int i8 = 0;
            while (i8 < i3) {
                iArr3[i7] = ((iArr[i7] + iArr2[i7]) + 1) >> 1;
                i8++;
                i7++;
            }
            i6++;
            i5 = (i - i3) + i7;
        }
    }
}
