package org.jcodec.codecs.vp8;

import java.io.PrintStream;
import java.lang.reflect.Array;
import org.jcodec.codecs.vp8.VP8Util.PLANE;
import org.jcodec.codecs.vp8.VP8Util.QuantizationParams;
import org.jcodec.codecs.vp8.VP8Util.SubblockConstants;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class Macroblock {
    public final int Rrow;
    public int chromaMode;
    public final int column;
    public boolean debug;
    public int filterLevel;
    public int lumaMode;
    public int segment;
    public int skipCoeff;
    boolean skipFilter;
    public final Subblock[][] uSubblocks;
    public final Subblock[][] vSubblocks;

    /* renamed from: y2 */
    public final Subblock f44781y2 = new Subblock(0, 0, PLANE.Y2);
    public final Subblock[][] ySubblocks;

    public class Subblock {
        private int col;
        public int mode;
        private PLANE plane;
        public int[] predict;
        public int[] residue;
        private int row;
        public boolean someValuePresent;
        /* access modifiers changed from: private */
        public int[] tokens = new int[16];
        public int[] val;

        public Subblock(int i, int i2, PLANE plane2) {
            this.row = i;
            this.col = i2;
            this.plane = plane2;
        }

        private int DCTextra(BooleanArithmeticDecoder booleanArithmeticDecoder, int[] iArr) {
            int i = 0;
            int i2 = 0;
            do {
                i += booleanArithmeticDecoder.decodeBool(iArr[i2]) + i;
                i2++;
            } while (iArr[i2] > 0);
            return i;
        }

        private int decodeToken(BooleanArithmeticDecoder booleanArithmeticDecoder, int i) {
            int DCTextra = i == 5 ? 5 + DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat1) : i;
            if (i == 6) {
                DCTextra = DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat2) + 7;
            }
            if (i == 7) {
                DCTextra = DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat3) + 11;
            }
            if (i == 8) {
                DCTextra = DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat4) + 19;
            }
            if (i == 9) {
                DCTextra = DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat5) + 35;
            }
            if (i == 10) {
                DCTextra = DCTextra(booleanArithmeticDecoder, SubblockConstants.Pcat6) + 67;
            }
            return (i == 0 || i == 11 || booleanArithmeticDecoder.decodeBit() <= 0) ? DCTextra : -DCTextra;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int[] getAboveRightLowestRow(org.jcodec.codecs.vp8.Macroblock[][] r10) {
            /*
                r9 = this;
                org.jcodec.codecs.vp8.VP8Util$PLANE r0 = org.jcodec.codecs.vp8.VP8Util.PLANE.Y1
                org.jcodec.codecs.vp8.VP8Util$PLANE r1 = r9.plane
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00b2
                int r0 = r9.row
                r1 = 15
                r2 = 0
                r3 = 1
                r4 = 3
                if (r0 != 0) goto L_0x002c
                int r0 = r9.col
                if (r0 >= r4) goto L_0x002c
                org.jcodec.codecs.vp8.Macroblock r5 = org.jcodec.codecs.vp8.Macroblock.this
                int r6 = r5.Rrow
                int r6 = r6 - r3
                r10 = r10[r6]
                int r5 = r5.column
                r10 = r10[r5]
                org.jcodec.codecs.vp8.Macroblock$Subblock[][] r10 = r10.ySubblocks
                r10 = r10[r4]
                int r0 = r0 + r3
                r10 = r10[r0]
                int[] r10 = r10.val
                goto L_0x0086
            L_0x002c:
                int r0 = r9.row
                if (r0 <= 0) goto L_0x0041
                int r5 = r9.col
                if (r5 >= r4) goto L_0x0041
                org.jcodec.codecs.vp8.Macroblock r10 = org.jcodec.codecs.vp8.Macroblock.this
                org.jcodec.codecs.vp8.Macroblock$Subblock[][] r10 = r10.ySubblocks
                int r0 = r0 - r3
                r10 = r10[r0]
                int r5 = r5 + r3
                r10 = r10[r5]
                int[] r10 = r10.val
                goto L_0x0086
            L_0x0041:
                int r0 = r9.row
                if (r0 != 0) goto L_0x00a5
                int r0 = r9.col
                if (r0 != r4) goto L_0x00a5
                org.jcodec.codecs.vp8.Macroblock r0 = org.jcodec.codecs.vp8.Macroblock.this
                int r5 = r0.Rrow
                int r6 = r5 + -1
                r6 = r10[r6]
                int r0 = r0.column
                int r7 = r0 + 1
                r6 = r6[r7]
                int r7 = r6.column
                r8 = r10[r2]
                int r8 = r8.length
                int r8 = r8 - r3
                if (r7 >= r8) goto L_0x0068
                org.jcodec.codecs.vp8.Macroblock$Subblock[][] r10 = r6.ySubblocks
                r10 = r10[r4]
                r10 = r10[r2]
                int[] r10 = r10.val
                goto L_0x0086
            L_0x0068:
                r7 = 16
                int[] r7 = new int[r7]
                int r6 = r6.Rrow
                if (r6 != 0) goto L_0x0073
                r10 = 127(0x7f, float:1.78E-43)
                goto L_0x0082
            L_0x0073:
                int r5 = r5 - r3
                r10 = r10[r5]
                r10 = r10[r0]
                org.jcodec.codecs.vp8.Macroblock$Subblock[][] r10 = r10.ySubblocks
                r10 = r10[r4]
                r10 = r10[r4]
                int[] r10 = r10.val
                r10 = r10[r1]
            L_0x0082:
                java.util.Arrays.fill(r7, r10)
                r10 = r7
            L_0x0086:
                if (r10 != 0) goto L_0x008a
                int[] r10 = org.jcodec.codecs.vp8.VP8Util.PRED_BLOCK_127
            L_0x008a:
                r0 = 4
                int[] r0 = new int[r0]
                r5 = 12
                r5 = r10[r5]
                r0[r2] = r5
                r2 = 13
                r2 = r10[r2]
                r0[r3] = r2
                r2 = 2
                r3 = 14
                r3 = r10[r3]
                r0[r2] = r3
                r10 = r10[r1]
                r0[r4] = r10
                return r0
            L_0x00a5:
                org.jcodec.codecs.vp8.Macroblock r0 = org.jcodec.codecs.vp8.Macroblock.this
                org.jcodec.codecs.vp8.Macroblock$Subblock[][] r0 = r0.ySubblocks
                r0 = r0[r2]
                r0 = r0[r4]
                int[] r10 = r0.getAboveRightLowestRow(r10)
                return r10
            L_0x00b2:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Decoder.getAboveRight: not implemented for Y2 and chroma planes"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.vp8.Macroblock.Subblock.getAboveRightLowestRow(org.jcodec.codecs.vp8.Macroblock[][]):int[]");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void decodeSubBlock(org.jcodec.codecs.vp8.BooleanArithmeticDecoder r10, int[][][][] r11, int r12, int r13, boolean r14) {
            /*
                r9 = this;
                r0 = 0
                r9.someValuePresent = r0
                r1 = 1
                r3 = r12
                r12 = 1
                r2 = 0
                r4 = 0
            L_0x0008:
                r5 = 16
                r6 = 11
                if (r12 == r6) goto L_0x0053
                int r12 = r2 + r14
                if (r12 >= r5) goto L_0x0053
                r5 = r11[r13]
                int[] r7 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.vp8CoefBands
                r7 = r7[r12]
                r5 = r5[r7]
                r3 = r5[r3]
                if (r4 != 0) goto L_0x0025
                int[] r4 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.vp8CoefTree
                int r3 = r10.readTree(r4, r3)
                goto L_0x002b
            L_0x0025:
                int[] r4 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.vp8CoefTree
                int r3 = r10.readTreeSkip(r4, r3, r1)
            L_0x002b:
                int r4 = r9.decodeToken(r10, r3)
                if (r4 == r1) goto L_0x0041
                r5 = -1
                if (r4 != r5) goto L_0x0035
                goto L_0x0041
            L_0x0035:
                if (r4 > r1) goto L_0x003f
                if (r4 >= r5) goto L_0x003a
                goto L_0x003f
            L_0x003a:
                r5 = 0
                if (r4 != 0) goto L_0x0042
                r7 = 1
                goto L_0x0043
            L_0x003f:
                r5 = 2
                goto L_0x0042
            L_0x0041:
                r5 = 1
            L_0x0042:
                r7 = 0
            L_0x0043:
                if (r3 == r6) goto L_0x004d
                int[] r6 = r9.tokens
                int[] r8 = org.jcodec.codecs.vp8.VP8Util.SubblockConstants.vp8defaultZigZag1d
                r12 = r8[r12]
                r6[r12] = r4
            L_0x004d:
                int r2 = r2 + 1
                r12 = r3
                r3 = r5
                r4 = r7
                goto L_0x0008
            L_0x0053:
                if (r0 >= r5) goto L_0x0060
                int[] r10 = r9.tokens
                r10 = r10[r0]
                if (r10 == 0) goto L_0x005d
                r9.someValuePresent = r1
            L_0x005d:
                int r0 = r0 + 1
                goto L_0x0053
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.vp8.Macroblock.Subblock.decodeSubBlock(org.jcodec.codecs.vp8.BooleanArithmeticDecoder, int[][][][], int, int, boolean):void");
        }

        public void dequantSubblock(int i, int i2, Integer num) {
            int[] iArr = new int[16];
            iArr[0] = this.tokens[0] * i;
            for (int i3 = 1; i3 < 16; i3++) {
                iArr[i3] = this.tokens[i3] * i2;
            }
            if (num != null) {
                iArr[0] = num.intValue();
            }
            this.residue = VP8DCT.decodeDCT(iArr);
        }

        public Subblock getAbove(PLANE plane2, Macroblock[][] macroblockArr) {
            if (this.row > 0) {
                if (PLANE.Y1.equals(this.plane)) {
                    return Macroblock.this.ySubblocks[this.row - 1][this.col];
                }
                if (PLANE.U.equals(this.plane)) {
                    return Macroblock.this.uSubblocks[this.row - 1][this.col];
                }
                if (PLANE.V.equals(this.plane)) {
                    return Macroblock.this.vSubblocks[this.row - 1][this.col];
                }
            }
            int i = this.col;
            Macroblock macroblock = Macroblock.this;
            Macroblock macroblock2 = macroblockArr[macroblock.Rrow - 1][macroblock.column];
            if (plane2 == PLANE.Y2) {
                while (macroblock2.lumaMode == 4) {
                    macroblock2 = macroblockArr[macroblock2.Rrow - 1][macroblock2.column];
                }
            }
            return macroblock2.getBottomSubblock(i, plane2);
        }

        public Subblock getLeft(PLANE plane2, Macroblock[][] macroblockArr) {
            if (this.col > 0) {
                if (PLANE.Y1.equals(this.plane)) {
                    return Macroblock.this.ySubblocks[this.row][this.col - 1];
                }
                if (PLANE.U.equals(this.plane)) {
                    return Macroblock.this.uSubblocks[this.row][this.col - 1];
                }
                if (PLANE.V.equals(this.plane)) {
                    return Macroblock.this.vSubblocks[this.row][this.col - 1];
                }
            }
            int i = this.row;
            Macroblock macroblock = Macroblock.this;
            Macroblock macroblock2 = macroblockArr[macroblock.Rrow][macroblock.column - 1];
            if (plane2 == PLANE.Y2) {
                while (macroblock2.lumaMode == 4) {
                    macroblock2 = macroblockArr[macroblock2.Rrow][macroblock2.column - 1];
                }
            }
            return macroblock2.getRightSubBlock(i, plane2);
        }

        public void predict(Macroblock[][] macroblockArr) {
            Subblock above = getAbove(this.plane, macroblockArr);
            Subblock left = getLeft(this.plane, macroblockArr);
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = above.val;
            if (iArr3 == null) {
                iArr3 = VP8Util.PRED_BLOCK_127;
            }
            iArr[0] = iArr3[12];
            iArr[1] = iArr3[13];
            iArr[2] = iArr3[14];
            iArr[3] = iArr3[15];
            int[] iArr4 = left.val;
            if (iArr4 == null) {
                iArr4 = VP8Util.pickDefaultPrediction(this.mode);
            }
            iArr2[0] = iArr4[3];
            iArr2[1] = iArr4[7];
            iArr2[2] = iArr4[11];
            iArr2[3] = iArr4[15];
            Subblock left2 = above.getLeft(this.plane, macroblockArr);
            int[] iArr5 = left.val;
            int i = C13959t.f40827P1;
            if (!((iArr5 == null && above.val == null) || above.val == null)) {
                int[] iArr6 = left2.val;
                i = iArr6 != null ? iArr6[15] : VP8Util.pickDefaultPrediction(this.mode)[15];
            }
            int[] aboveRightLowestRow = getAboveRightLowestRow(macroblockArr);
            switch (this.mode) {
                case 0:
                    this.predict = VP8Util.predictDC(iArr, iArr2);
                    return;
                case 1:
                    this.predict = VP8Util.predictTM(iArr, iArr2, i);
                    return;
                case 2:
                    this.predict = VP8Util.predictVE(iArr, i, aboveRightLowestRow);
                    return;
                case 3:
                    this.predict = VP8Util.predictHE(iArr2, i);
                    return;
                case 4:
                    this.predict = VP8Util.predictLD(iArr, aboveRightLowestRow);
                    return;
                case 5:
                    this.predict = VP8Util.predictRD(iArr, iArr2, i);
                    return;
                case 6:
                    this.predict = VP8Util.predictVR(iArr, iArr2, i);
                    return;
                case 7:
                    this.predict = VP8Util.predictVL(iArr, aboveRightLowestRow);
                    return;
                case 8:
                    this.predict = VP8Util.predictHD(iArr, iArr2, i);
                    return;
                case 9:
                    this.predict = VP8Util.predictHU(iArr2);
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("TODO: unknowwn mode: ");
                    sb.append(this.mode);
                    throw new UnsupportedOperationException(sb.toString());
            }
        }

        public void reconstruct() {
            int[] iArr = this.val;
            if (iArr == null) {
                iArr = this.predict;
            }
            int[] iArr2 = new int[16];
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = (i * 4) + i2;
                    iArr2[i3] = QuantizationParams.clip255(this.residue[i3] + iArr[i3]);
                }
            }
            this.val = iArr2;
        }
    }

    public Macroblock(int i, int i2) {
        Class<Subblock> cls = Subblock.class;
        this.ySubblocks = (Subblock[][]) Array.newInstance(cls, new int[]{4, 4});
        this.uSubblocks = (Subblock[][]) Array.newInstance(cls, new int[]{2, 2});
        this.vSubblocks = (Subblock[][]) Array.newInstance(cls, new int[]{2, 2});
        this.segment = 0;
        this.debug = true;
        this.Rrow = i;
        this.column = i2;
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                this.ySubblocks[i3][i4] = new Subblock(i3, i4, PLANE.Y1);
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < 2; i6++) {
                this.uSubblocks[i5][i6] = new Subblock(i5, i6, PLANE.U);
                this.vSubblocks[i5][i6] = new Subblock(i5, i6, PLANE.V);
            }
        }
    }

    private void decodeMacroBlockTokens(boolean z, Macroblock[][] macroblockArr, BooleanArithmeticDecoder booleanArithmeticDecoder, int[][][][] iArr) {
        this.skipFilter = false;
        if (z) {
            this.skipFilter |= decodePlaneTokens(1, PLANE.Y2, false, macroblockArr, booleanArithmeticDecoder, iArr);
        }
        this.skipFilter = decodePlaneTokens(4, PLANE.Y1, z, macroblockArr, booleanArithmeticDecoder, iArr) | this.skipFilter;
        Macroblock[][] macroblockArr2 = macroblockArr;
        BooleanArithmeticDecoder booleanArithmeticDecoder2 = booleanArithmeticDecoder;
        int[][][][] iArr2 = iArr;
        this.skipFilter |= decodePlaneTokens(2, PLANE.U, false, macroblockArr2, booleanArithmeticDecoder2, iArr2);
        this.skipFilter |= decodePlaneTokens(2, PLANE.V, false, macroblockArr2, booleanArithmeticDecoder2, iArr2);
        this.skipFilter = !this.skipFilter;
    }

    private boolean decodePlaneTokens(int i, PLANE plane, boolean z, Macroblock[][] macroblockArr, BooleanArithmeticDecoder booleanArithmeticDecoder, int[][][][] iArr) {
        int i2 = i;
        PLANE plane2 = plane;
        Macroblock[][] macroblockArr2 = macroblockArr;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            boolean z3 = z2;
            for (int i4 = 0; i4 < i2; i4++) {
                Subblock subblock = null;
                if (PLANE.Y1.equals(plane2)) {
                    subblock = this.ySubblocks[i3][i4];
                } else if (PLANE.U.equals(plane2)) {
                    subblock = this.uSubblocks[i3][i4];
                } else if (PLANE.V.equals(plane2)) {
                    subblock = this.vSubblocks[i3][i4];
                } else if (PLANE.Y2.equals(plane2)) {
                    subblock = this.f44781y2;
                }
                Subblock left = subblock.getLeft(plane2, macroblockArr2);
                Subblock above = subblock.getAbove(plane2, macroblockArr2);
                subblock.decodeSubBlock(booleanArithmeticDecoder, iArr, (left.someValuePresent ? 1 : 0) + (above.someValuePresent ? 1 : 0), VP8Util.planeToType(plane2, Boolean.valueOf(z)), z);
                z3 |= subblock.someValuePresent;
            }
            i3++;
            z2 = z3;
        }
        return z2;
    }

    private void predictLumaDC(Macroblock macroblock, Macroblock macroblock2) {
        int i;
        boolean z = this.Rrow > 1;
        boolean z2 = this.column > 1;
        int i2 = 128;
        if (z || z2) {
            int i3 = 3;
            if (z) {
                int i4 = 0;
                i = 0;
                while (i4 < 4) {
                    Subblock subblock = macroblock.ySubblocks[3][i4];
                    int i5 = i;
                    for (int i6 = 0; i6 < 4; i6++) {
                        i5 += subblock.val[i6 + 12];
                    }
                    i4++;
                    i = i5;
                }
            } else {
                i = 0;
            }
            if (z2) {
                int i7 = 0;
                while (i7 < 4) {
                    Subblock subblock2 = macroblock2.ySubblocks[i7][3];
                    int i8 = i;
                    for (int i9 = 0; i9 < 4; i9++) {
                        i8 += subblock2.val[(i9 * 4) + 3];
                    }
                    i7++;
                    i = i8;
                }
            }
            if (z) {
                i3 = 4;
            }
            if (z2) {
                i3++;
            }
            i2 = (i + (1 << (i3 - 1))) >> i3;
        }
        int[] iArr = new int[16];
        for (int i10 = 0; i10 < 16; i10++) {
            iArr[i10] = i2;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            for (int i12 = 0; i12 < 4; i12++) {
                this.ySubblocks[i11][i12].predict = iArr;
            }
        }
    }

    private void predictLumaH(Macroblock macroblock) {
        Subblock[] subblockArr = new Subblock[4];
        for (int i = 0; i < 4; i++) {
            subblockArr[i] = macroblock.ySubblocks[i][3];
        }
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                Subblock subblock = this.ySubblocks[i2][i3];
                int[] iArr = new int[16];
                for (int i4 = 0; i4 < 4; i4++) {
                    for (int i5 = 0; i5 < 4; i5++) {
                        int i6 = i4 * 4;
                        iArr[i6 + i5] = subblockArr[i2].val != null ? subblockArr[i2].val[i6 + 3] : C13959t.f40835R1;
                    }
                }
                subblock.predict = iArr;
            }
        }
    }

    private void predictLumaTM(Macroblock macroblock, Macroblock macroblock2, int i) {
        Subblock[] subblockArr = new Subblock[4];
        Subblock[] subblockArr2 = new Subblock[4];
        for (int i2 = 0; i2 < 4; i2++) {
            subblockArr[i2] = macroblock.ySubblocks[3][i2];
        }
        for (int i3 = 0; i3 < 4; i3++) {
            subblockArr2[i3] = macroblock2.ySubblocks[i3][3];
        }
        for (int i4 = 0; i4 < 4; i4++) {
            for (int i5 = 0; i5 < 4; i5++) {
                for (int i6 = 0; i6 < 4; i6++) {
                    Subblock[][] subblockArr3 = this.ySubblocks;
                    if (subblockArr3[i4][i6].val == null) {
                        subblockArr3[i4][i6].val = new int[16];
                    }
                    for (int i7 = 0; i7 < 4; i7++) {
                        int i8 = i5 * 4;
                        this.ySubblocks[i4][i6].val[i8 + i7] = QuantizationParams.clip255((subblockArr2[i4].val[i8 + 3] + subblockArr[i6].val[i7 + 12]) - i);
                    }
                }
            }
        }
    }

    private void predictLumaV(Macroblock macroblock) {
        Subblock[] subblockArr = new Subblock[4];
        for (int i = 0; i < 4; i++) {
            subblockArr[i] = macroblock.ySubblocks[3][i];
        }
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                Subblock subblock = this.ySubblocks[i2][i3];
                int[] iArr = new int[16];
                for (int i4 = 0; i4 < 4; i4++) {
                    for (int i5 = 0; i5 < 4; i5++) {
                        iArr[(i4 * 4) + i5] = subblockArr[i3].val != null ? subblockArr[i3].val[i5 + 12] : C13959t.f40827P1;
                    }
                }
                subblock.predict = iArr;
            }
        }
    }

    private void predictY(Macroblock[][] macroblockArr) {
        int i = this.Rrow;
        Macroblock[] macroblockArr2 = macroblockArr[i - 1];
        int i2 = this.column;
        Macroblock macroblock = macroblockArr2[i2];
        Macroblock macroblock2 = macroblockArr[i][i2 - 1];
        int i3 = this.lumaMode;
        if (i3 == 0) {
            predictLumaDC(macroblock, macroblock2);
        } else if (i3 == 1) {
            predictLumaV(macroblock);
        } else if (i3 == 2) {
            predictLumaH(macroblock2);
        } else if (i3 != 3) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("TODO predict_mb_y: ");
            sb.append(this.lumaMode);
            printStream.println(sb.toString());
            System.exit(0);
        } else {
            predictLumaTM(macroblock, macroblock2, macroblockArr[i - 1][i2 - 1].ySubblocks[3][3].val[15]);
        }
    }

    public void decodeMacroBlock(Macroblock[][] macroblockArr, BooleanArithmeticDecoder booleanArithmeticDecoder, int[][][][] iArr) {
        boolean z = true;
        if (this.skipCoeff > 0) {
            if (this.lumaMode == 4) {
                z = false;
            }
            this.skipFilter = z;
        } else if (this.lumaMode != 4) {
            decodeMacroBlockTokens(true, macroblockArr, booleanArithmeticDecoder, iArr);
        } else {
            decodeMacroBlockTokens(false, macroblockArr, booleanArithmeticDecoder, iArr);
        }
    }

    public void dequantMacroBlock(Macroblock[][] macroblockArr, QuantizationParams quantizationParams) {
        if (this.lumaMode != 4) {
            int i = quantizationParams.y2AC;
            int[] iArr = new int[16];
            iArr[0] = this.f44781y2.tokens[0] * quantizationParams.y2DC;
            for (int i2 = 1; i2 < 16; i2++) {
                iArr[i2] = this.f44781y2.tokens[i2] * i;
            }
            this.f44781y2.residue = VP8DCT.decodeWHT(iArr);
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    this.ySubblocks[i3][i4].dequantSubblock(quantizationParams.yDC, quantizationParams.yAC, Integer.valueOf(this.f44781y2.residue[(i3 * 4) + i4]));
                }
            }
            predictY(macroblockArr);
            predictUV(macroblockArr);
            for (int i5 = 0; i5 < 2; i5++) {
                for (int i6 = 0; i6 < 2; i6++) {
                    this.uSubblocks[i5][i6].dequantSubblock(quantizationParams.chromaDC, quantizationParams.chromaAC, null);
                    this.vSubblocks[i5][i6].dequantSubblock(quantizationParams.chromaDC, quantizationParams.chromaAC, null);
                }
            }
            reconstruct();
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                Subblock subblock = this.ySubblocks[i7][i8];
                subblock.dequantSubblock(quantizationParams.yDC, quantizationParams.yAC, null);
                subblock.predict(macroblockArr);
                subblock.reconstruct();
            }
        }
        predictUV(macroblockArr);
        for (int i9 = 0; i9 < 2; i9++) {
            for (int i10 = 0; i10 < 2; i10++) {
                Subblock subblock2 = this.uSubblocks[i9][i10];
                subblock2.dequantSubblock(quantizationParams.chromaDC, quantizationParams.chromaAC, null);
                subblock2.reconstruct();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            for (int i12 = 0; i12 < 2; i12++) {
                Subblock subblock3 = this.vSubblocks[i11][i12];
                subblock3.dequantSubblock(quantizationParams.chromaDC, quantizationParams.chromaAC, null);
                subblock3.reconstruct();
            }
        }
    }

    public Subblock getBottomSubblock(int i, PLANE plane) {
        if (plane == PLANE.Y1) {
            return this.ySubblocks[3][i];
        }
        if (plane == PLANE.U) {
            return this.uSubblocks[1][i];
        }
        if (plane == PLANE.V) {
            return this.vSubblocks[1][i];
        }
        if (plane == PLANE.Y2) {
            return this.f44781y2;
        }
        return null;
    }

    public Subblock getRightSubBlock(int i, PLANE plane) {
        if (plane == PLANE.Y1) {
            return this.ySubblocks[i][3];
        }
        if (plane == PLANE.U) {
            return this.uSubblocks[i][1];
        }
        if (plane == PLANE.V) {
            return this.vSubblocks[i][1];
        }
        if (plane == PLANE.Y2) {
            return this.f44781y2;
        }
        return null;
    }

    public void predictUV(Macroblock[][] macroblockArr) {
        int i;
        int i2;
        int i3;
        int i4 = this.Rrow;
        Macroblock[] macroblockArr2 = macroblockArr[i4 - 1];
        int i5 = this.column;
        Macroblock macroblock = macroblockArr2[i5];
        Macroblock macroblock2 = macroblockArr[i4][i5 - 1];
        int i6 = this.chromaMode;
        int i7 = 3;
        int i8 = 4;
        if (i6 == 0) {
            boolean z = i5 > 1;
            boolean z2 = this.Rrow > 1;
            int i9 = 128;
            if (z2 || z) {
                if (z2) {
                    int i10 = 0;
                    i3 = 0;
                    i2 = 0;
                    while (i10 < 2) {
                        Subblock subblock = macroblock.uSubblocks[1][i10];
                        Subblock subblock2 = macroblock.vSubblocks[1][i10];
                        int i11 = i3;
                        for (int i12 = 0; i12 < 4; i12++) {
                            int i13 = i12 + 12;
                            i2 += subblock.val[i13];
                            i11 += subblock2.val[i13];
                        }
                        i10++;
                        i3 = i11;
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (z) {
                    int i14 = 0;
                    while (i14 < 2) {
                        Subblock subblock3 = macroblock2.uSubblocks[i14][1];
                        Subblock subblock4 = macroblock2.vSubblocks[i14][1];
                        int i15 = i3;
                        for (int i16 = 0; i16 < 4; i16++) {
                            int i17 = (i16 * 4) + 3;
                            i2 += subblock3.val[i17];
                            i15 += subblock4.val[i17];
                        }
                        i14++;
                        i3 = i15;
                    }
                }
                if (!z2) {
                    i7 = 2;
                }
                if (z) {
                    i7++;
                }
                int i18 = 1 << (i7 - 1);
                i9 = (i2 + i18) >> i7;
                i = (i3 + i18) >> i7;
            } else {
                i = 128;
            }
            int[] iArr = new int[16];
            int i19 = 0;
            while (true) {
                if (i19 >= 4) {
                    break;
                }
                int i20 = 0;
                for (int i21 = 4; i20 < i21; i21 = 4) {
                    iArr[(i19 * 4) + i20] = i9;
                    i20++;
                }
                i19++;
            }
            int[] iArr2 = new int[16];
            for (int i22 = 0; i22 < 4; i22++) {
                for (int i23 = 0; i23 < 4; i23++) {
                    iArr2[(i22 * 4) + i23] = i;
                }
            }
            for (int i24 = 0; i24 < 2; i24++) {
                for (int i25 = 0; i25 < 2; i25++) {
                    Subblock subblock5 = this.uSubblocks[i24][i25];
                    Subblock subblock6 = this.vSubblocks[i24][i25];
                    subblock5.predict = iArr;
                    subblock6.predict = iArr2;
                }
            }
        } else if (i6 == 1) {
            Subblock[] subblockArr = new Subblock[2];
            Subblock[] subblockArr2 = new Subblock[2];
            for (int i26 = 0; i26 < 2; i26++) {
                subblockArr[i26] = macroblock.uSubblocks[1][i26];
                subblockArr2[i26] = macroblock.vSubblocks[1][i26];
            }
            for (int i27 = 0; i27 < 2; i27++) {
                for (int i28 = 0; i28 < 2; i28++) {
                    Subblock subblock7 = this.uSubblocks[i27][i28];
                    Subblock subblock8 = this.vSubblocks[i27][i28];
                    int[] iArr3 = new int[16];
                    int[] iArr4 = new int[16];
                    int i29 = 0;
                    while (true) {
                        if (i29 >= 4) {
                            break;
                        }
                        int i30 = 0;
                        for (int i31 = 4; i30 < i31; i31 = 4) {
                            int i32 = (i29 * 4) + i30;
                            int[] iArr5 = subblockArr[i28].val;
                            int i33 = C13959t.f40827P1;
                            iArr3[i32] = iArr5 != null ? subblockArr[i28].val[i30 + 12] : C13959t.f40827P1;
                            if (subblockArr2[i28].val != null) {
                                i33 = subblockArr2[i28].val[i30 + 12];
                            }
                            iArr4[i32] = i33;
                            i30++;
                        }
                        i29++;
                    }
                    subblock7.predict = iArr3;
                    subblock8.predict = iArr4;
                }
            }
        } else if (i6 == 2) {
            Subblock[] subblockArr3 = new Subblock[2];
            Subblock[] subblockArr4 = new Subblock[2];
            for (int i34 = 0; i34 < 2; i34++) {
                subblockArr3[i34] = macroblock2.uSubblocks[i34][1];
                subblockArr4[i34] = macroblock2.vSubblocks[i34][1];
            }
            int i35 = 0;
            while (i35 < 2) {
                int i36 = 0;
                while (i36 < 2) {
                    Subblock subblock9 = this.uSubblocks[i35][i36];
                    Subblock subblock10 = this.vSubblocks[i35][i36];
                    int[] iArr6 = new int[16];
                    int[] iArr7 = new int[16];
                    int i37 = 0;
                    while (i37 < i8) {
                        int i38 = 0;
                        while (i38 < i8) {
                            int i39 = i37 * 4;
                            int i40 = i39 + i38;
                            int[] iArr8 = subblockArr3[i35].val;
                            int i41 = C13959t.f40835R1;
                            iArr6[i40] = iArr8 != null ? subblockArr3[i35].val[i39 + 3] : C13959t.f40835R1;
                            if (subblockArr4[i35].val != null) {
                                i41 = subblockArr4[i35].val[i39 + 3];
                            }
                            iArr7[i40] = i41;
                            i38++;
                            i8 = 4;
                        }
                        i37++;
                        i8 = 4;
                    }
                    subblock9.predict = iArr6;
                    subblock10.predict = iArr7;
                    i36++;
                    i8 = 4;
                }
                i35++;
                i8 = 4;
            }
        } else if (i6 != 3) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("TODO predict_mb_uv: ");
            sb.append(this.lumaMode);
            printStream.println(sb.toString());
            System.exit(0);
        } else {
            Macroblock macroblock3 = macroblockArr[i4 - 1][i5 - 1];
            int i42 = macroblock3.uSubblocks[1][1].val[15];
            int i43 = macroblock3.vSubblocks[1][1].val[15];
            Subblock[] subblockArr5 = new Subblock[2];
            Subblock[] subblockArr6 = new Subblock[2];
            Subblock[] subblockArr7 = new Subblock[2];
            Subblock[] subblockArr8 = new Subblock[2];
            for (int i44 = 0; i44 < 2; i44++) {
                subblockArr5[i44] = macroblock.uSubblocks[1][i44];
                subblockArr6[i44] = macroblock2.uSubblocks[i44][1];
                subblockArr7[i44] = macroblock.vSubblocks[1][i44];
                subblockArr8[i44] = macroblock2.vSubblocks[i44][1];
            }
            for (int i45 = 0; i45 < 2; i45++) {
                for (int i46 = 0; i46 < 4; i46++) {
                    for (int i47 = 0; i47 < 2; i47++) {
                        Subblock[][] subblockArr9 = this.uSubblocks;
                        if (subblockArr9[i45][i47].val == null) {
                            subblockArr9[i45][i47].val = new int[16];
                        }
                        Subblock[][] subblockArr10 = this.vSubblocks;
                        if (subblockArr10[i45][i47].val == null) {
                            subblockArr10[i45][i47].val = new int[16];
                        }
                        for (int i48 = 0; i48 < 4; i48++) {
                            int i49 = i46 * 4;
                            int i50 = i49 + 3;
                            int i51 = i48 + 12;
                            int i52 = i49 + i48;
                            this.uSubblocks[i45][i47].val[i52] = QuantizationParams.clip255((subblockArr6[i45].val[i50] + subblockArr5[i47].val[i51]) - i42);
                            this.vSubblocks[i45][i47].val[i52] = QuantizationParams.clip255((subblockArr8[i45].val[i50] + subblockArr7[i47].val[i51]) - i43);
                        }
                    }
                }
            }
        }
    }

    public void reconstruct() {
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.ySubblocks[i][i2].reconstruct();
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < 2; i4++) {
                this.uSubblocks[i3][i4].reconstruct();
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < 2; i6++) {
                this.vSubblocks[i5][i6].reconstruct();
            }
        }
    }
}
