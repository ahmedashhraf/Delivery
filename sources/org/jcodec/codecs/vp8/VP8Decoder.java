package org.jcodec.codecs.vp8;

import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class VP8Decoder {
    private int height;
    private Macroblock[][] mbs;
    private int width;

    public static String printHexByte(byte b) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        sb.append(Integer.toHexString(b & 255));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x02d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decode(java.nio.ByteBuffer r28) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 3
            byte[] r3 = new byte[r2]
            r1.get(r3)
            r4 = 0
            int r5 = org.jcodec.codecs.vp8.VP8Util.getBitInBytes(r3, r4)
            r6 = 1
            if (r5 != 0) goto L_0x0014
            r5 = 1
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            org.jcodec.codecs.vp8.VP8Util.getBitsInBytes(r3, r6, r2)
            r7 = 4
            int r8 = org.jcodec.codecs.vp8.VP8Util.getBitInBytes(r3, r7)
            r8 = 5
            r9 = 19
            int r3 = org.jcodec.codecs.vp8.VP8Util.getBitsInBytes(r3, r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            byte r9 = r28.get()
            java.lang.String r9 = printHexByte(r9)
            r8.append(r9)
            java.lang.String r9 = " "
            r8.append(r9)
            byte r10 = r28.get()
            java.lang.String r10 = printHexByte(r10)
            r8.append(r10)
            r8.append(r9)
            byte r9 = r28.get()
            java.lang.String r9 = printHexByte(r9)
            r8.append(r9)
            r8.toString()
            byte r8 = r28.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r9 = r28.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r9 = r9 << r10
            r8 = r8 | r9
            byte r9 = r28.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r11 = r28.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r10
            r9 = r9 | r11
            r8 = r8 & 16383(0x3fff, float:2.2957E-41)
            r0.width = r8
            r8 = r9 & 16383(0x3fff, float:2.2957E-41)
            r0.height = r8
            int r8 = r0.height
            int r8 = org.jcodec.codecs.vp8.VP8Util.getMacroblockCount(r8)
            int r9 = r0.width
            int r9 = org.jcodec.codecs.vp8.VP8Util.getMacroblockCount(r9)
            int r11 = r8 + 2
            int r12 = r9 + 2
            int[] r13 = new int[]{r11, r12}
            java.lang.Class<org.jcodec.codecs.vp8.Macroblock> r14 = org.jcodec.codecs.vp8.Macroblock.class
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r14, r13)
            org.jcodec.codecs.vp8.Macroblock[][] r13 = (org.jcodec.codecs.vp8.Macroblock[][]) r13
            r0.mbs = r13
            r13 = 0
        L_0x009a:
            if (r13 >= r11) goto L_0x00b2
            r14 = 0
        L_0x009d:
            if (r14 >= r12) goto L_0x00ae
            org.jcodec.codecs.vp8.Macroblock[][] r15 = r0.mbs
            r15 = r15[r13]
            org.jcodec.codecs.vp8.Macroblock r7 = new org.jcodec.codecs.vp8.Macroblock
            r7.<init>(r13, r14)
            r15[r14] = r7
            int r14 = r14 + 1
            r7 = 4
            goto L_0x009d
        L_0x00ae:
            int r13 = r13 + 1
            r7 = 4
            goto L_0x009a
        L_0x00b2:
            int r7 = r28.position()
            org.jcodec.codecs.vp8.BooleanArithmeticDecoder r11 = new org.jcodec.codecs.vp8.BooleanArithmeticDecoder
            r11.<init>(r1, r4)
            int r12 = r11.decodeBit()
            int r12 = r11.decodeBit()
            int r12 = r11.decodeBit()
            java.lang.String r13 = "Frame has segmentation, segment decoding is not "
            org.jcodec.common.Assert.assertEquals(r13, r4, r12)
            int r13 = r11.decodeBit()
            r14 = 6
            int r15 = r11.decodeInt(r14)
            if (r15 != 0) goto L_0x00d9
            r13 = 0
            goto L_0x00de
        L_0x00d9:
            if (r13 <= 0) goto L_0x00dd
            r13 = 1
            goto L_0x00de
        L_0x00dd:
            r13 = 2
        L_0x00de:
            int r4 = r11.decodeInt(r2)
            int r2 = r11.decodeBit()
            org.jcodec.common.Assert.assertEquals(r6, r2)
            int r10 = r11.decodeBit()
            org.jcodec.common.Assert.assertEquals(r6, r10)
            int r10 = org.jcodec.codecs.vp8.VP8Util.MAX_REF_LF_DELTAS
            int[] r10 = new int[r10]
            int r6 = org.jcodec.codecs.vp8.VP8Util.MAX_MODE_LF_DELTAS
            int[] r6 = new int[r6]
            r14 = 0
        L_0x00f9:
            int r1 = org.jcodec.codecs.vp8.VP8Util.MAX_REF_LF_DELTAS
            if (r14 >= r1) goto L_0x0119
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0116
            r1 = 6
            int r20 = r11.decodeInt(r1)
            r10[r14] = r20
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0116
            r1 = r10[r14]
            int r1 = r1 * -1
            r10[r14] = r1
        L_0x0116:
            int r14 = r14 + 1
            goto L_0x00f9
        L_0x0119:
            r1 = 0
        L_0x011a:
            int r14 = org.jcodec.codecs.vp8.VP8Util.MAX_MODE_LF_DELTAS
            if (r1 >= r14) goto L_0x013c
            int r14 = r11.decodeBit()
            if (r14 <= 0) goto L_0x0138
            r14 = 6
            int r19 = r11.decodeInt(r14)
            r6[r1] = r19
            int r19 = r11.decodeBit()
            if (r19 <= 0) goto L_0x0139
            r19 = r6[r1]
            int r19 = r19 * -1
            r6[r1] = r19
            goto L_0x0139
        L_0x0138:
            r14 = 6
        L_0x0139:
            int r1 = r1 + 1
            goto L_0x011a
        L_0x013c:
            r1 = 2
            int r6 = r11.decodeInt(r1)
            r1 = 0
            org.jcodec.common.Assert.assertEquals(r1, r6)
            r28.limit()
            int r3 = r3 + r7
            java.nio.ByteBuffer r6 = r28.duplicate()
            r6.position(r3)
            org.jcodec.codecs.vp8.BooleanArithmeticDecoder r3 = new org.jcodec.codecs.vp8.BooleanArithmeticDecoder
            r3.<init>(r6, r1)
            r1 = 7
            int r20 = r11.decodeInt(r1)
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0167
            int r1 = org.jcodec.codecs.vp8.VP8Util.delta(r11)
            r21 = r1
            goto L_0x0169
        L_0x0167:
            r21 = 0
        L_0x0169:
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0176
            int r1 = org.jcodec.codecs.vp8.VP8Util.delta(r11)
            r22 = r1
            goto L_0x0178
        L_0x0176:
            r22 = 0
        L_0x0178:
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0185
            int r1 = org.jcodec.codecs.vp8.VP8Util.delta(r11)
            r23 = r1
            goto L_0x0187
        L_0x0185:
            r23 = 0
        L_0x0187:
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x0194
            int r1 = org.jcodec.codecs.vp8.VP8Util.delta(r11)
            r24 = r1
            goto L_0x0196
        L_0x0194:
            r24 = 0
        L_0x0196:
            int r1 = r11.decodeBit()
            if (r1 <= 0) goto L_0x01a3
            int r1 = org.jcodec.codecs.vp8.VP8Util.delta(r11)
            r25 = r1
            goto L_0x01a5
        L_0x01a3:
            r25 = 0
        L_0x01a5:
            int r1 = r11.decodeBit()
            org.jcodec.codecs.vp8.VP8Util$QuantizationParams r1 = new org.jcodec.codecs.vp8.VP8Util$QuantizationParams
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            int[][][][] r6 = org.jcodec.codecs.vp8.VP8Util.getDefaultCoefProbs()
            r7 = 0
        L_0x01b5:
            int r14 = org.jcodec.codecs.vp8.VP8Util.BLOCK_TYPES
            if (r7 >= r14) goto L_0x020a
            r19 = r4
            r14 = 0
        L_0x01bc:
            int r4 = org.jcodec.codecs.vp8.VP8Util.COEF_BANDS
            if (r14 >= r4) goto L_0x0201
            r20 = r5
            r4 = 0
        L_0x01c3:
            int r5 = org.jcodec.codecs.vp8.VP8Util.PREV_COEF_CONTEXTS
            if (r4 >= r5) goto L_0x01fa
            r5 = 0
        L_0x01c8:
            int r21 = org.jcodec.codecs.vp8.VP8Util.MAX_ENTROPY_TOKENS
            r22 = r13
            r18 = 1
            int r13 = r21 + -1
            if (r5 >= r13) goto L_0x01f5
            int[][][][] r13 = org.jcodec.codecs.vp8.VP8Util.vp8CoefUpdateProbs
            r13 = r13[r7]
            r13 = r13[r14]
            r13 = r13[r4]
            r13 = r13[r5]
            int r13 = r11.decodeBool(r13)
            if (r13 <= 0) goto L_0x01f0
            r13 = 8
            int r21 = r11.decodeInt(r13)
            r13 = r6[r7]
            r13 = r13[r14]
            r13 = r13[r4]
            r13[r5] = r21
        L_0x01f0:
            int r5 = r5 + 1
            r13 = r22
            goto L_0x01c8
        L_0x01f5:
            int r4 = r4 + 1
            r13 = r22
            goto L_0x01c3
        L_0x01fa:
            r22 = r13
            int r14 = r14 + 1
            r5 = r20
            goto L_0x01bc
        L_0x0201:
            r20 = r5
            r22 = r13
            int r7 = r7 + 1
            r4 = r19
            goto L_0x01b5
        L_0x020a:
            r19 = r4
            r20 = r5
            r22 = r13
            int r4 = r11.decodeBit()
            r5 = 1
            org.jcodec.common.Assert.assertEquals(r5, r4)
            r5 = 8
            int r5 = r11.decodeInt(r5)
            r7 = 0
        L_0x021f:
            if (r7 >= r8) goto L_0x0329
            r13 = 0
        L_0x0222:
            if (r13 >= r9) goto L_0x0313
            org.jcodec.codecs.vp8.Macroblock[][] r14 = r0.mbs
            int r16 = r7 + 1
            r14 = r14[r16]
            int r13 = r13 + 1
            r14 = r14[r13]
            if (r12 > 0) goto L_0x030b
            if (r2 <= 0) goto L_0x0303
            r16 = 0
            r17 = r10[r16]
            r21 = r2
            int r2 = r15 + r17
            r17 = r10
            r10 = 63
            if (r2 >= 0) goto L_0x0242
            r2 = 0
            goto L_0x0246
        L_0x0242:
            if (r2 <= r10) goto L_0x0246
            r2 = 63
        L_0x0246:
            r14.filterLevel = r2
            if (r4 <= 0) goto L_0x0250
            int r2 = r11.decodeBool(r5)
            r14.skipCoeff = r2
        L_0x0250:
            int[] r2 = org.jcodec.codecs.vp8.VP8Util.keyFrameYModeTree
            int[] r10 = org.jcodec.codecs.vp8.VP8Util.keyFrameYModeProb
            int r2 = r11.readTree(r2, r10)
            r14.lumaMode = r2
            int r2 = r14.lumaMode
            r10 = 4
            if (r2 != r10) goto L_0x02b4
            r2 = 0
        L_0x0260:
            r28 = r4
            if (r2 >= r10) goto L_0x02ab
            r4 = 0
        L_0x0265:
            if (r4 >= r10) goto L_0x029f
            org.jcodec.codecs.vp8.Macroblock$Subblock[][] r10 = r14.ySubblocks
            r10 = r10[r2]
            r10 = r10[r4]
            r23 = r5
            org.jcodec.codecs.vp8.VP8Util$PLANE r5 = org.jcodec.codecs.vp8.VP8Util.PLANE.Y1
            r24 = r12
            org.jcodec.codecs.vp8.Macroblock[][] r12 = r0.mbs
            org.jcodec.codecs.vp8.Macroblock$Subblock r5 = r10.getAbove(r5, r12)
            org.jcodec.codecs.vp8.VP8Util$PLANE r12 = org.jcodec.codecs.vp8.VP8Util.PLANE.Y1
            r25 = r13
            org.jcodec.codecs.vp8.Macroblock[][] r13 = r0.mbs
            org.jcodec.codecs.vp8.Macroblock$Subblock r12 = r10.getLeft(r12, r13)
            int[] r13 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.subblockModeTree
            int[][][] r26 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.keyFrameSubblockModeProb
            int r5 = r5.mode
            r5 = r26[r5]
            int r12 = r12.mode
            r5 = r5[r12]
            int r5 = r11.readTree(r13, r5)
            r10.mode = r5
            int r4 = r4 + 1
            r5 = r23
            r12 = r24
            r13 = r25
            r10 = 4
            goto L_0x0265
        L_0x029f:
            r23 = r5
            r24 = r12
            r25 = r13
            int r2 = r2 + 1
            r4 = r28
            r10 = 4
            goto L_0x0260
        L_0x02ab:
            r23 = r5
            r24 = r12
            r25 = r13
            r5 = 3
            r12 = 4
            goto L_0x02eb
        L_0x02b4:
            r28 = r4
            r23 = r5
            r24 = r12
            r25 = r13
            if (r2 == 0) goto L_0x02d1
            r4 = 1
            if (r2 == r4) goto L_0x02ce
            r5 = 2
            if (r2 == r5) goto L_0x02cb
            r5 = 3
            if (r2 == r5) goto L_0x02c9
        L_0x02c7:
            r2 = 0
            goto L_0x02d4
        L_0x02c9:
            r2 = 1
            goto L_0x02d4
        L_0x02cb:
            r5 = 3
            r2 = 3
            goto L_0x02d4
        L_0x02ce:
            r5 = 3
            r2 = 2
            goto L_0x02d4
        L_0x02d1:
            r4 = 1
            r5 = 3
            goto L_0x02c7
        L_0x02d4:
            r10 = 0
            r12 = 4
        L_0x02d6:
            if (r10 >= r12) goto L_0x02eb
            r13 = 0
        L_0x02d9:
            if (r13 >= r12) goto L_0x02e7
            org.jcodec.codecs.vp8.Macroblock$Subblock[][] r4 = r14.ySubblocks
            r4 = r4[r13]
            r4 = r4[r10]
            r4.mode = r2
            int r13 = r13 + 1
            r4 = 1
            goto L_0x02d9
        L_0x02e7:
            int r10 = r10 + 1
            r4 = 1
            goto L_0x02d6
        L_0x02eb:
            int[] r2 = org.jcodec.codecs.vp8.VP8Util.vp8UVModeTree
            int[] r4 = org.jcodec.codecs.vp8.VP8Util.vp8KeyFrameUVModeProb
            int r2 = r11.readTree(r2, r4)
            r14.chromaMode = r2
            r4 = r28
            r10 = r17
            r2 = r21
            r5 = r23
            r12 = r24
            r13 = r25
            goto L_0x0222
        L_0x0303:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "TODO: frames with loopFilterDeltaFlag <= 0 are not supported yet"
            r1.<init>(r2)
            throw r1
        L_0x030b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "TODO: frames with multiple segments are not supported yet"
            r1.<init>(r2)
            throw r1
        L_0x0313:
            r21 = r2
            r28 = r4
            r23 = r5
            r17 = r10
            r24 = r12
            r5 = 3
            r12 = 4
            r16 = 0
            int r7 = r7 + 1
            r5 = r23
            r12 = r24
            goto L_0x021f
        L_0x0329:
            r16 = 0
            r2 = 0
        L_0x032c:
            if (r2 >= r8) goto L_0x0347
            r4 = 0
        L_0x032f:
            if (r4 >= r9) goto L_0x0344
            org.jcodec.codecs.vp8.Macroblock[][] r5 = r0.mbs
            int r7 = r2 + 1
            r7 = r5[r7]
            int r4 = r4 + 1
            r7 = r7[r4]
            r7.decodeMacroBlock(r5, r3, r6)
            org.jcodec.codecs.vp8.Macroblock[][] r5 = r0.mbs
            r7.dequantMacroBlock(r5, r1)
            goto L_0x032f
        L_0x0344:
            int r2 = r2 + 1
            goto L_0x032c
        L_0x0347:
            if (r22 <= 0) goto L_0x035e
            if (r15 == 0) goto L_0x035e
            r4 = r22
            r1 = 2
            if (r4 != r1) goto L_0x035e
            org.jcodec.codecs.vp8.Macroblock[][] r1 = r0.mbs
            r2 = r19
            r4 = r20
            org.jcodec.codecs.vp8.FilterUtil.loopFilterUV(r1, r2, r4)
            org.jcodec.codecs.vp8.Macroblock[][] r1 = r0.mbs
            org.jcodec.codecs.vp8.FilterUtil.loopFilterY(r1, r2, r4)
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.vp8.VP8Decoder.decode(java.nio.ByteBuffer):void");
    }

    public Picture getPicture() {
        int[] iArr;
        VP8Decoder vP8Decoder = this;
        Picture create = Picture.create(vP8Decoder.width, vP8Decoder.height, ColorSpace.YUV420);
        int[] planeData = create.getPlaneData(0);
        int[] planeData2 = create.getPlaneData(1);
        int[] planeData3 = create.getPlaneData(2);
        int macroblockCount = VP8Util.getMacroblockCount(vP8Decoder.width);
        int macroblockCount2 = VP8Util.getMacroblockCount(vP8Decoder.height);
        int i = macroblockCount * 16;
        int i2 = macroblockCount * 8;
        int i3 = 0;
        while (i3 < macroblockCount2) {
            int i4 = 0;
            while (i4 < macroblockCount) {
                int i5 = i4 + 1;
                Macroblock macroblock = vP8Decoder.mbs[i3 + 1][i5];
                int i6 = 0;
                while (true) {
                    int i7 = 4;
                    if (i6 >= 4) {
                        break;
                    }
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = 0;
                        while (i9 < i7) {
                            int i10 = macroblockCount;
                            int i11 = 0;
                            while (i11 < i7) {
                                int i12 = (i3 << 4) + (i6 << 2) + i9;
                                int i13 = macroblockCount2;
                                int i14 = (i4 << 4) + (i8 << 2) + i11;
                                int i15 = i5;
                                if (i14 < i && i12 < planeData.length / i) {
                                    planeData[(i12 * i) + i14] = macroblock.ySubblocks[i6][i8].val[(i9 * 4) + i11];
                                }
                                i11++;
                                i5 = i15;
                                macroblockCount2 = i13;
                                i7 = 4;
                            }
                            int i16 = macroblockCount2;
                            int i17 = i5;
                            i9++;
                            macroblockCount = i10;
                            i7 = 4;
                        }
                        int i18 = macroblockCount;
                        int i19 = macroblockCount2;
                        int i20 = i5;
                        i8++;
                        i7 = 4;
                    }
                    int i21 = macroblockCount;
                    int i22 = macroblockCount2;
                    int i23 = i5;
                    i6++;
                }
                int i24 = macroblockCount;
                int i25 = macroblockCount2;
                int i26 = i5;
                int i27 = 0;
                while (true) {
                    if (i27 >= 2) {
                        break;
                    }
                    int i28 = 0;
                    for (int i29 = 2; i28 < i29; i29 = 2) {
                        int i30 = 0;
                        while (true) {
                            if (i30 >= 4) {
                                break;
                            }
                            int i31 = 0;
                            for (int i32 = 4; i31 < i32; i32 = 4) {
                                int i33 = (i3 << 3) + (i27 << 2) + i30;
                                int i34 = (i4 << 3) + (i28 << 2) + i31;
                                if (i34 >= i2 || i33 >= planeData2.length / i2) {
                                    iArr = planeData;
                                } else {
                                    int i35 = (i30 * 4) + i31;
                                    int i36 = macroblock.uSubblocks[i27][i28].val[i35];
                                    iArr = planeData;
                                    int i37 = macroblock.vSubblocks[i27][i28].val[i35];
                                    int i38 = (i33 * i2) + i34;
                                    planeData2[i38] = i36;
                                    planeData3[i38] = i37;
                                }
                                i31++;
                                planeData = iArr;
                            }
                            int[] iArr2 = planeData;
                            i30++;
                        }
                        int[] iArr3 = planeData;
                        i28++;
                    }
                    int[] iArr4 = planeData;
                    i27++;
                }
                vP8Decoder = this;
                macroblockCount = i24;
                i4 = i26;
                macroblockCount2 = i25;
            }
            int[] iArr5 = planeData;
            int i39 = macroblockCount;
            int i40 = macroblockCount2;
            i3++;
            vP8Decoder = this;
        }
        return create;
    }
}
