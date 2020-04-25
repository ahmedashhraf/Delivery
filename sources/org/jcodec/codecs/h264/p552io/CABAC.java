package org.jcodec.codecs.h264.p552io;

import androidx.core.p034l.C0986h;
import androidx.core.p034l.C1056z;
import java.lang.reflect.Array;
import org.apache.http.C15470v;
import org.jcodec.codecs.common.biari.MDecoder;
import org.jcodec.codecs.common.biari.MEncoder;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.decode.CABACContst;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.SliceType;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.common.tools.MathUtil;
import org.jcodec.containers.mps.MPSUtils;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: org.jcodec.codecs.h264.io.CABAC */
public class CABAC {
    private int chromaPredModeLeft = 0;
    private int[] chromaPredModeTop;
    private int[] codedBlkDCLeft;
    private int[][] codedBlkDCTop;
    private int[][] codedBlkLeft;
    private int[][] codedBlkTop;
    private int[][][] mvdLeft;
    private int[][][] mvdTop;
    private int prevCBP;
    private int prevMbQpDelta;
    private int[][] refIdxLeft;
    private int[][] refIdxTop;
    private boolean skipFlagLeft;
    private boolean[] skipFlagsTop;
    public int[] tmp = new int[16];

    /* renamed from: org.jcodec.codecs.h264.io.CABAC$BlockType */
    public enum BlockType {
        LUMA_16_DC(85, 105, C13959t.f40776C2, 277, 338, JpegConst.APP3, 0),
        LUMA_15_AC(89, 120, 181, 292, 353, JpegConst.APPD, 0),
        LUMA_16(93, C13959t.f40855W1, 195, 306, 367, 247, 0),
        CHROMA_DC(97, C13959t.f40925l2, JpegConst.RST2, 321, 382, C0986h.f4407i, 1),
        CHROMA_AC(101, C13959t.f40937o2, JpegConst.RST5, 324, 385, 266, 0),
        LUMA_64(1012, 402, C15470v.f44647J, 436, 451, 426, 0),
        CB_16_DC(460, 484, 572, 776, 864, 952, 0),
        CB_15x16_AC(464, 499, 587, 791, 879, 962, 0),
        CB_16(468, C0986h.f4408j, 601, 805, 893, 972, 0),
        CB_64(C1056z.f4716r, 660, 690, 675, 699, 708, 0),
        CR_16_DC(472, 528, 616, 820, 908, 982, 0),
        CR_15x16_AC(476, 543, 631, 835, 923, 992, 0),
        CR_16(MPSUtils.VIDEO_MIN, 557, 645, 849, 937, 1002, 0),
        CR_64(C1056z.f4720v, 718, 748, 733, 757, 766, 0);
        
        public int codedBlockCtxOff;
        public int coeffAbsLevelAdjust;
        public int coeffAbsLevelCtxOff;
        public int lastSigCoeffCtxOff;
        public int lastSigCoeffFldCtxOff;
        public int sigCoeffFlagCtxOff;
        public int sigCoeffFlagFldCtxOff;

        private BlockType(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.codedBlockCtxOff = i;
            this.sigCoeffFlagCtxOff = i2;
            this.lastSigCoeffCtxOff = i3;
            this.sigCoeffFlagFldCtxOff = i4;
            this.lastSigCoeffFldCtxOff = i4;
            this.coeffAbsLevelCtxOff = i6;
            this.coeffAbsLevelAdjust = i7;
        }
    }

    public CABAC(int i) {
        Class<int> cls = int.class;
        this.chromaPredModeTop = new int[i];
        this.codedBlkLeft = new int[][]{new int[4], new int[2], new int[2]};
        int i2 = i << 2;
        int i3 = i << 1;
        this.codedBlkTop = new int[][]{new int[i2], new int[i3], new int[i3]};
        this.codedBlkDCLeft = new int[3];
        this.codedBlkDCTop = (int[][]) Array.newInstance(cls, new int[]{3, i});
        this.refIdxLeft = (int[][]) Array.newInstance(cls, new int[]{2, 4});
        this.refIdxTop = (int[][]) Array.newInstance(cls, new int[]{2, i2});
        this.skipFlagsTop = new boolean[i];
        this.mvdTop = (int[][][]) Array.newInstance(cls, new int[]{2, 2, i2});
        this.mvdLeft = (int[][][]) Array.newInstance(cls, new int[]{2, 2, 4});
    }

    private boolean cbp(int i, int i2, int i3) {
        return ((i >> ((i3 & 2) + (i2 >> 1))) & 1) == 1;
    }

    private int condTermCr0(boolean z, MBType mBType, int i) {
        return (!z || (mBType != MBType.I_PCM && (mBType == null || i == 0))) ? 0 : 1;
    }

    private int condTermCr1(boolean z, MBType mBType, int i) {
        return (!z || (mBType != MBType.I_PCM && (mBType == null || (i & 2) == 0))) ? 0 : 1;
    }

    private int readCoeffAbsLevel(MDecoder mDecoder, BlockType blockType, int i, int i2) {
        int i3 = 0;
        int min = i != 0 ? 0 : Math.min(4, i2 + 1);
        int min2 = Math.min(4 - blockType.coeffAbsLevelAdjust, i) + 5;
        int decodeBin = mDecoder.decodeBin(blockType.coeffAbsLevelCtxOff + min);
        int i4 = 0;
        while (decodeBin != 0 && i4 < 13) {
            decodeBin = mDecoder.decodeBin(blockType.coeffAbsLevelCtxOff + min2);
            i4++;
        }
        int i5 = i4 + decodeBin;
        if (i5 != 14) {
            return i5;
        }
        int i6 = -2;
        do {
            i6++;
        } while (mDecoder.decodeBinBypass() != 0);
        int i7 = 0;
        while (i6 >= 0) {
            i3 |= mDecoder.decodeBinBypass() << i6;
            i7 += 1 << i6;
            i6--;
        }
        return i5 + i3 + i7;
    }

    private int readIntraP(MDecoder mDecoder, int i) {
        if (mDecoder.decodeBin(i) == 0) {
            return 0;
        }
        return mDecoder.decodeFinalBin() == 1 ? 25 : readMBType16x16P(mDecoder, i) + 1;
    }

    private int readMBType16x16(MDecoder mDecoder) {
        int decodeBin = mDecoder.decodeBin(6) * 12;
        if (mDecoder.decodeBin(7) == 0) {
            return decodeBin + (mDecoder.decodeBin(9) << 1) + mDecoder.decodeBin(10);
        }
        return decodeBin + (mDecoder.decodeBin(8) << 2) + (mDecoder.decodeBin(9) << 1) + mDecoder.decodeBin(10) + 4;
    }

    private int readMBType16x16P(MDecoder mDecoder, int i) {
        int i2 = i + 1;
        int decodeBin = mDecoder.decodeBin(i2) * 12;
        int i3 = i2 + 1;
        if (mDecoder.decodeBin(i3) == 0) {
            int i4 = i3 + 1;
            return decodeBin + (mDecoder.decodeBin(i4) << 1) + mDecoder.decodeBin(i4);
        }
        int i5 = i3 + 1;
        return decodeBin + (mDecoder.decodeBin(i3) << 2) + (mDecoder.decodeBin(i5) << 1) + mDecoder.decodeBin(i5) + 4;
    }

    private void writeCoeffAbsLevel(MEncoder mEncoder, BlockType blockType, int i, int i2, int i3) {
        int min = i != 0 ? 0 : Math.min(4, i2 + 1);
        int min2 = Math.min(4 - blockType.coeffAbsLevelAdjust, i) + 5;
        if (i3 == 0) {
            mEncoder.encodeBin(blockType.coeffAbsLevelCtxOff + min, 0);
            return;
        }
        mEncoder.encodeBin(blockType.coeffAbsLevelCtxOff + min, 1);
        if (i3 < 14) {
            for (int i4 = 1; i4 < i3; i4++) {
                mEncoder.encodeBin(blockType.coeffAbsLevelCtxOff + min2, 1);
            }
            mEncoder.encodeBin(blockType.coeffAbsLevelCtxOff + min2, 0);
            return;
        }
        for (int i5 = 1; i5 < 14; i5++) {
            mEncoder.encodeBin(blockType.coeffAbsLevelCtxOff + min2, 1);
        }
        int i6 = i3 - 14;
        int i7 = 1;
        int i8 = 0;
        while (i6 >= i7) {
            mEncoder.encodeBinBypass(1);
            i6 -= i7;
            i8++;
            i7 = 1 << i8;
        }
        mEncoder.encodeBinBypass(0);
        while (true) {
            i8--;
            if (i8 >= 0) {
                mEncoder.encodeBinBypass((i6 >> i8) & 1);
            } else {
                return;
            }
        }
    }

    private void writeMBType16x16(MEncoder mEncoder, int i) {
        if (i < 12) {
            mEncoder.encodeBin(6, 0);
        } else {
            mEncoder.encodeBin(6, 1);
            i -= 12;
        }
        if (i < 4) {
            mEncoder.encodeBin(7, 0);
            mEncoder.encodeBin(9, i >> 1);
            mEncoder.encodeBin(10, i & 1);
            return;
        }
        int i2 = i - 4;
        mEncoder.encodeBin(7, 1);
        mEncoder.encodeBin(8, i2 >> 2);
        mEncoder.encodeBin(9, (i2 >> 1) & 1);
        mEncoder.encodeBin(10, i2 & 1);
    }

    public int codedBlockPatternIntra(MDecoder mDecoder, boolean z, boolean z2, int i, int i2, MBType mBType, MBType mBType2) {
        int decodeBin = mDecoder.decodeBin(condTerm(z, mBType, (i >> 1) & 1) + 73 + (condTerm(z2, mBType2, (i2 >> 2) & 1) * 2));
        int i3 = 1 - decodeBin;
        int decodeBin2 = mDecoder.decodeBin(i3 + 73 + (condTerm(z2, mBType2, (i2 >> 3) & 1) * 2));
        int decodeBin3 = mDecoder.decodeBin(condTerm(z, mBType, (i >> 3) & 1) + 73 + (i3 * 2));
        int decodeBin4 = mDecoder.decodeBin((1 - decodeBin3) + 73 + ((1 - decodeBin2) * 2));
        int i4 = i >> 4;
        int i5 = i2 >> 4;
        int decodeBin5 = mDecoder.decodeBin(condTermCr0(z, mBType, i4) + 77 + (condTermCr0(z2, mBType2, i5) * 2));
        return ((decodeBin5 != 0 ? mDecoder.decodeBin((condTermCr1(z, mBType, i4) + 81) + (condTermCr1(z2, mBType2, i5) * 2)) : 0) << 5) | (decodeBin2 << 1) | decodeBin | (decodeBin3 << 2) | (decodeBin4 << 3) | (decodeBin5 << 4);
    }

    public int condTerm(MBType mBType, boolean z, MBType mBType2, boolean z2, int i) {
        if (!z) {
            return mBType.isIntra() ? 1 : 0;
        }
        if (mBType2 == MBType.I_PCM) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return i;
    }

    public void initModels(int[][] iArr, SliceType sliceType, int i, int i2) {
        int[] iArr2 = sliceType.isIntra() ? CABACContst.cabac_context_init_I_A : CABACContst.cabac_context_init_PB_A[i];
        int[] iArr3 = sliceType.isIntra() ? CABACContst.cabac_context_init_I_B : CABACContst.cabac_context_init_PB_B[i];
        for (int i3 = 0; i3 < 1024; i3++) {
            int clip = MathUtil.clip(((iArr2[i3] * MathUtil.clip(i2, 0, 51)) >> 4) + iArr3[i3], 1, C13959t.f40823O1);
            if (clip <= 63) {
                iArr[0][i3] = 63 - clip;
                iArr[1][i3] = 0;
            } else {
                iArr[0][i3] = clip - 64;
                iArr[1][i3] = 1;
            }
        }
    }

    public boolean prev4x4PredModeFlag(MDecoder mDecoder) {
        return mDecoder.decodeBin(68) == 1;
    }

    public int readCodedBlockFlagChromaAC(MDecoder mDecoder, int i, int i2, int i3, MBType mBType, MBType mBType2, boolean z, boolean z2, int i4, int i5, MBType mBType3) {
        int i6;
        int i7;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        int i8 = i2 & 1;
        if ((i & 1) == 0) {
            i6 = condTerm(mBType3, z, mBType, (mBType4 == null || mBType4 == MBType.I_PCM || (i4 & 2) == 0) ? false : true, this.codedBlkLeft[i3][i8]);
        } else {
            i6 = condTerm(mBType3, true, mBType3, true, this.codedBlkLeft[i3][i8]);
        }
        int i9 = i6;
        if (i8 == 0) {
            i7 = condTerm(mBType3, z2, mBType2, (mBType5 == null || mBType5 == MBType.I_PCM || (i5 & 2) == 0) ? false : true, this.codedBlkTop[i3][i]);
        } else {
            i7 = condTerm(mBType3, true, mBType3, true, this.codedBlkTop[i3][i]);
        }
        int i10 = BlockType.CHROMA_AC.codedBlockCtxOff + i9 + (i7 * 2);
        MDecoder mDecoder2 = mDecoder;
        int decodeBin = mDecoder.decodeBin(i10);
        this.codedBlkLeft[i3][i8] = decodeBin;
        this.codedBlkTop[i3][i] = decodeBin;
        return decodeBin;
    }

    public int readCodedBlockFlagChromaDC(MDecoder mDecoder, int i, int i2, MBType mBType, MBType mBType2, boolean z, boolean z2, int i3, int i4, MBType mBType3) {
        MDecoder mDecoder2 = mDecoder;
        int decodeBin = mDecoder.decodeBin(BlockType.CHROMA_DC.codedBlockCtxOff + condTerm(mBType3, z, mBType, (mBType == null || i3 == 0) ? false : true, this.codedBlkDCLeft[i2]) + (condTerm(mBType3, z2, mBType2, (mBType2 == null || i4 == 0) ? false : true, this.codedBlkDCTop[i2][i]) * 2));
        this.codedBlkDCLeft[i2] = decodeBin;
        this.codedBlkDCTop[i2][i] = decodeBin;
        return decodeBin;
    }

    public int readCodedBlockFlagLuma64(MDecoder mDecoder, int i, int i2, int i3, MBType mBType, MBType mBType2, boolean z, boolean z2, int i4, int i5, int i6, MBType mBType3, boolean z3, boolean z4) {
        int i7;
        int i8;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        int i9 = i6;
        int i10 = i & 3;
        int i11 = i2 & 3;
        if (i10 == 0) {
            i7 = condTerm(mBType3, z, mBType, mBType4 != null && mBType4 != MBType.I_PCM && z3 && cbp(i4, 3, i11), this.codedBlkLeft[i3][i11]);
        } else {
            i7 = condTerm(mBType3, true, mBType3, cbp(i9, i10 - 1, i11), this.codedBlkLeft[i3][i11]);
        }
        int i12 = i7;
        if (i11 == 0) {
            i8 = condTerm(mBType3, z2, mBType2, mBType5 != null && mBType5 != MBType.I_PCM && z4 && cbp(i5, i10, 3), this.codedBlkTop[i3][i]);
        } else {
            i8 = condTerm(mBType3, true, mBType3, cbp(i9, i10, i11 - 1), this.codedBlkTop[i3][i]);
        }
        int decodeBin = mDecoder.decodeBin(BlockType.LUMA_64.codedBlockCtxOff + i12 + (i8 * 2));
        this.codedBlkLeft[i3][i11] = decodeBin;
        this.codedBlkTop[i3][i] = decodeBin;
        return decodeBin;
    }

    public int readCodedBlockFlagLumaAC(MDecoder mDecoder, BlockType blockType, int i, int i2, int i3, MBType mBType, MBType mBType2, boolean z, boolean z2, int i4, int i5, int i6, MBType mBType3) {
        int i7;
        int i8;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        int i9 = i6;
        int i10 = i & 3;
        int i11 = i2 & 3;
        if (i10 == 0) {
            i7 = condTerm(mBType3, z, mBType, (mBType4 == null || mBType4 == MBType.I_PCM || !cbp(i4, 3, i11)) ? false : true, this.codedBlkLeft[i3][i11]);
        } else {
            i7 = condTerm(mBType3, true, mBType3, cbp(i9, i10 - 1, i11), this.codedBlkLeft[i3][i11]);
        }
        int i12 = i7;
        if (i11 == 0) {
            i8 = condTerm(mBType3, z2, mBType2, (mBType5 == null || mBType5 == MBType.I_PCM || !cbp(i5, i10, 3)) ? false : true, this.codedBlkTop[i3][i]);
        } else {
            i8 = condTerm(mBType3, true, mBType3, cbp(i9, i10, i11 - 1), this.codedBlkTop[i3][i]);
        }
        int decodeBin = mDecoder.decodeBin(blockType.codedBlockCtxOff + i12 + (i8 * 2));
        this.codedBlkLeft[i3][i11] = decodeBin;
        this.codedBlkTop[i3][i] = decodeBin;
        return decodeBin;
    }

    public int readCodedBlockFlagLumaDC(MDecoder mDecoder, int i, MBType mBType, MBType mBType2, boolean z, boolean z2, MBType mBType3) {
        MDecoder mDecoder2 = mDecoder;
        int decodeBin = mDecoder.decodeBin(BlockType.LUMA_16_DC.codedBlockCtxOff + condTerm(mBType3, z, mBType, mBType == MBType.I_16x16, this.codedBlkDCLeft[0]) + (condTerm(mBType3, z2, mBType2, mBType2 == MBType.I_16x16, this.codedBlkDCTop[0][i]) * 2));
        this.codedBlkDCLeft[0] = decodeBin;
        this.codedBlkDCTop[0][i] = decodeBin;
        return decodeBin;
    }

    public int readCoeffs(MDecoder mDecoder, BlockType blockType, int[] iArr, int i, int i2, int[] iArr2, int[] iArr3, int[] iArr4) {
        boolean[] zArr = new boolean[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2 - 1) {
            zArr[i4] = mDecoder.decodeBin(blockType.sigCoeffFlagCtxOff + iArr3[i4]) == 1;
            if (zArr[i4] && mDecoder.decodeBin(blockType.lastSigCoeffCtxOff + iArr4[i4]) == 1) {
                break;
            }
            i4++;
        }
        int i5 = i4 + 1;
        zArr[i4] = true;
        int i6 = 0;
        for (int i7 = i5 - 1; i7 >= 0; i7--) {
            if (zArr[i7]) {
                int readCoeffAbsLevel = readCoeffAbsLevel(mDecoder, blockType, i3, i6);
                if (readCoeffAbsLevel == 0) {
                    i6++;
                } else {
                    i3++;
                }
                iArr[iArr2[i7 + i]] = MathUtil.toSigned(readCoeffAbsLevel + 1, -mDecoder.decodeBinBypass());
            }
        }
        return i3 + i6;
    }

    public int readIntraChromaPredMode(MDecoder mDecoder, int i, MBType mBType, MBType mBType2, boolean z, boolean z2) {
        int i2 = 1;
        if (mDecoder.decodeBin(64 + ((!z || mBType == null || !mBType.isIntra() || this.chromaPredModeLeft == 0) ? 0 : 1) + ((!z2 || mBType2 == null || !mBType2.isIntra() || this.chromaPredModeTop[i] == 0) ? 0 : 1)) == 0) {
            i2 = 0;
        } else if (mDecoder.decodeBin(67) != 0) {
            i2 = mDecoder.decodeBin(67) == 0 ? 2 : 3;
        }
        this.chromaPredModeTop[i] = i2;
        this.chromaPredModeLeft = i2;
        return i2;
    }

    public int readMBQpDelta(MDecoder mDecoder, MBType mBType) {
        int i = 0;
        if (mDecoder.decodeBin(60 + ((mBType == null || mBType == MBType.I_PCM || (mBType != MBType.I_16x16 && this.prevCBP == 0) || this.prevMbQpDelta == 0) ? 0 : 1)) == 1) {
            if (mDecoder.decodeBin(62) == 1) {
                i = 2;
                while (mDecoder.decodeBin(63) == 1) {
                    i++;
                }
            } else {
                i = 1;
            }
        }
        this.prevMbQpDelta = H264Utils.golomb2Signed(i);
        return this.prevMbQpDelta;
    }

    public boolean readMBSkipFlag(MDecoder mDecoder, SliceType sliceType, boolean z, boolean z2, int i) {
        boolean z3 = false;
        if (mDecoder.decodeBin((sliceType == SliceType.P ? 11 : 24) + ((!z || this.skipFlagLeft) ? 0 : 1) + ((!z2 || this.skipFlagsTop[i]) ? 0 : 1)) == 1) {
            z3 = true;
        }
        this.skipFlagsTop[i] = z3;
        this.skipFlagLeft = z3;
        return z3;
    }

    public int readMBTypeB(MDecoder mDecoder, MBType mBType, MBType mBType2, boolean z, boolean z2) {
        if (mDecoder.decodeBin(27 + ((!z || mBType == null || mBType == MBType.B_Direct_16x16) ? 0 : 1) + ((!z2 || mBType2 == null || mBType2 == MBType.B_Direct_16x16) ? 0 : 1)) == 0) {
            return 0;
        }
        if (mDecoder.decodeBin(30) == 0) {
            return mDecoder.decodeBin(32) + 1;
        }
        if (mDecoder.decodeBin(31) == 0) {
            return (mDecoder.decodeBin(32) | (mDecoder.decodeBin(32) << 2) | (mDecoder.decodeBin(32) << 1)) + 3;
        } else if (mDecoder.decodeBin(32) == 0) {
            return (mDecoder.decodeBin(32) | (mDecoder.decodeBin(32) << 2) | (mDecoder.decodeBin(32) << 1)) + 12;
        } else {
            int decodeBin = (mDecoder.decodeBin(32) << 1) + mDecoder.decodeBin(32);
            if (decodeBin == 0) {
                return mDecoder.decodeBin(32) + 20;
            }
            if (decodeBin == 1) {
                return readIntraP(mDecoder, 32) + 23;
            }
            if (decodeBin == 2) {
                return 11;
            }
            if (decodeBin != 3) {
                return 0;
            }
            return 22;
        }
    }

    public int readMBTypeI(MDecoder mDecoder, MBType mBType, MBType mBType2, boolean z, boolean z2) {
        if (mDecoder.decodeBin(3 + ((!z || mBType == MBType.I_NxN) ? 0 : 1) + ((!z2 || mBType2 == MBType.I_NxN) ? 0 : 1)) == 0) {
            return 0;
        }
        return mDecoder.decodeFinalBin() == 1 ? 25 : readMBType16x16(mDecoder) + 1;
    }

    public int readMBTypeP(MDecoder mDecoder) {
        int i = 1;
        if (mDecoder.decodeBin(14) == 1) {
            return readIntraP(mDecoder, 17) + 5;
        }
        if (mDecoder.decodeBin(15) == 0) {
            return mDecoder.decodeBin(16) == 0 ? 0 : 3;
        }
        if (mDecoder.decodeBin(17) == 0) {
            i = 2;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9 A[LOOP:3: B:67:0x00d7->B:68:0x00d9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ea A[LOOP:4: B:70:0x00e8->B:71:0x00ea, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readMVD(org.jcodec.codecs.common.biari.MDecoder r13, int r14, boolean r15, boolean r16, org.jcodec.codecs.h264.p552io.model.MBType r17, org.jcodec.codecs.h264.p552io.model.MBType r18, org.jcodec.codecs.h264.H264Const.PartPred r19, org.jcodec.codecs.h264.H264Const.PartPred r20, org.jcodec.codecs.h264.H264Const.PartPred r21, int r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r27
            if (r14 != 0) goto L_0x000f
            r6 = 40
            goto L_0x0011
        L_0x000f:
            r6 = 47
        L_0x0011:
            r7 = 2
            int r8 = r22 << 2
            int r8 = r8 + r23
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x002e
            org.jcodec.codecs.h264.H264Const$PartPred r11 = org.jcodec.codecs.h264.H264Const.PartPred.Direct
            if (r2 == r11) goto L_0x002e
            org.jcodec.codecs.h264.H264Const$PartPred r11 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            if (r2 == r11) goto L_0x002c
            if (r2 == r4) goto L_0x002c
            if (r4 != r11) goto L_0x002e
            boolean r2 = r2.usesList(r5)
            if (r2 == 0) goto L_0x002e
        L_0x002c:
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0045
            org.jcodec.codecs.h264.H264Const$PartPred r11 = org.jcodec.codecs.h264.H264Const.PartPred.Direct
            if (r3 == r11) goto L_0x0045
            org.jcodec.codecs.h264.H264Const$PartPred r11 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            if (r3 == r11) goto L_0x0043
            if (r3 == r4) goto L_0x0043
            if (r4 != r11) goto L_0x0045
            boolean r3 = r3.usesList(r5)
            if (r3 == 0) goto L_0x0045
        L_0x0043:
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r15 == 0) goto L_0x0060
            if (r17 == 0) goto L_0x0060
            boolean r4 = r17.isIntra()
            if (r4 != 0) goto L_0x0060
            if (r2 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            int[][][] r2 = r0.mvdLeft
            r2 = r2[r5]
            r2 = r2[r14]
            r2 = r2[r24]
            int r2 = java.lang.Math.abs(r2)
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r16 == 0) goto L_0x007b
            if (r18 == 0) goto L_0x007b
            boolean r4 = r18.isIntra()
            if (r4 != 0) goto L_0x007b
            if (r3 != 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            int[][][] r3 = r0.mvdTop
            r3 = r3[r5]
            r3 = r3[r14]
            r3 = r3[r8]
            int r3 = java.lang.Math.abs(r3)
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            int r2 = r2 + r3
            r3 = 3
            if (r2 >= r3) goto L_0x0082
            r2 = 0
            goto L_0x0089
        L_0x0082:
            r4 = 32
            if (r2 <= r4) goto L_0x0088
            r2 = 2
            goto L_0x0089
        L_0x0088:
            r2 = 1
        L_0x0089:
            int r2 = r2 + r6
            int r2 = r13.decodeBin(r2)
            r4 = 0
        L_0x008f:
            if (r2 == 0) goto L_0x00a5
            r11 = 8
            if (r4 >= r11) goto L_0x00a5
            int r2 = r6 + r4
            int r2 = r2 + r3
            int r11 = r6 + 6
            int r2 = java.lang.Math.min(r2, r11)
            int r2 = r13.decodeBin(r2)
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00a5:
            int r4 = r4 + r2
            if (r4 == 0) goto L_0x00d4
            r2 = 9
            if (r4 != r2) goto L_0x00cb
            r2 = 0
            r3 = 0
        L_0x00ae:
            int r2 = r2 + r3
            int r7 = r7 + r9
            int r3 = r13.decodeBinBypass()
            int r6 = r9 << r7
            if (r3 != 0) goto L_0x00c9
            int r7 = r7 + -1
            r3 = 0
        L_0x00bb:
            if (r7 < 0) goto L_0x00c6
            int r6 = r13.decodeBinBypass()
            int r6 = r6 << r7
            r3 = r3 | r6
            int r7 = r7 + -1
            goto L_0x00bb
        L_0x00c6:
            int r3 = r3 + r2
            int r4 = r4 + r3
            goto L_0x00cb
        L_0x00c9:
            r3 = r6
            goto L_0x00ae
        L_0x00cb:
            int r1 = r13.decodeBinBypass()
            int r1 = -r1
            int r4 = org.jcodec.common.tools.MathUtil.toSigned(r4, r1)
        L_0x00d4:
            r1 = r25
            r2 = 0
        L_0x00d7:
            if (r2 >= r1) goto L_0x00e6
            int[][][] r3 = r0.mvdTop
            r3 = r3[r5]
            r3 = r3[r14]
            int r6 = r8 + r2
            r3[r6] = r4
            int r2 = r2 + 1
            goto L_0x00d7
        L_0x00e6:
            r1 = r26
        L_0x00e8:
            if (r10 >= r1) goto L_0x00f7
            int[][][] r2 = r0.mvdLeft
            r2 = r2[r5]
            r2 = r2[r14]
            int r3 = r24 + r10
            r2[r3] = r4
            int r10 = r10 + 1
            goto L_0x00e8
        L_0x00f7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.CABAC.readMVD(org.jcodec.codecs.common.biari.MDecoder, int, boolean, boolean, org.jcodec.codecs.h264.io.model.MBType, org.jcodec.codecs.h264.io.model.MBType, org.jcodec.codecs.h264.H264Const$PartPred, org.jcodec.codecs.h264.H264Const$PartPred, org.jcodec.codecs.h264.H264Const$PartPred, int, int, int, int, int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0096 A[LOOP:1: B:51:0x0094->B:52:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5 A[LOOP:2: B:54:0x00a3->B:55:0x00a5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readRefIdx(org.jcodec.codecs.common.biari.MDecoder r12, boolean r13, boolean r14, org.jcodec.codecs.h264.p552io.model.MBType r15, org.jcodec.codecs.h264.p552io.model.MBType r16, org.jcodec.codecs.h264.H264Const.PartPred r17, org.jcodec.codecs.h264.H264Const.PartPred r18, org.jcodec.codecs.h264.H264Const.PartPred r19, int r20, int r21, int r22, int r23, int r24, int r25) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r25
            r6 = 2
            int r7 = r20 << 2
            int r7 = r7 + r21
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0027
            org.jcodec.codecs.h264.H264Const$PartPred r10 = org.jcodec.codecs.h264.H264Const.PartPred.Direct
            if (r2 == r10) goto L_0x0027
            org.jcodec.codecs.h264.H264Const$PartPred r10 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            if (r2 == r10) goto L_0x0025
            if (r2 == r4) goto L_0x0025
            if (r4 != r10) goto L_0x0027
            boolean r2 = r2.usesList(r5)
            if (r2 == 0) goto L_0x0027
        L_0x0025:
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x003e
            org.jcodec.codecs.h264.H264Const$PartPred r10 = org.jcodec.codecs.h264.H264Const.PartPred.Direct
            if (r3 == r10) goto L_0x003e
            org.jcodec.codecs.h264.H264Const$PartPred r10 = org.jcodec.codecs.h264.H264Const.PartPred.Bi
            if (r3 == r10) goto L_0x003c
            if (r3 == r4) goto L_0x003c
            if (r4 != r10) goto L_0x003e
            boolean r3 = r3.usesList(r5)
            if (r3 == 0) goto L_0x003e
        L_0x003c:
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r13 == 0) goto L_0x0056
            if (r15 == 0) goto L_0x0056
            boolean r4 = r15.isIntra()
            if (r4 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            int[][] r2 = r0.refIdxLeft
            r2 = r2[r5]
            r2 = r2[r22]
            if (r2 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r2 = 1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r14 == 0) goto L_0x006e
            if (r16 == 0) goto L_0x006e
            boolean r4 = r16.isIntra()
            if (r4 != 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            int[][] r3 = r0.refIdxTop
            r3 = r3[r5]
            r3 = r3[r7]
            if (r3 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            int r2 = r2 + 54
            int r3 = r3 * 2
            int r2 = r2 + r3
            int r2 = r12.decodeBin(r2)
            if (r2 != 0) goto L_0x007c
            r6 = 0
            goto L_0x0091
        L_0x007c:
            r2 = 58
            int r2 = r12.decodeBin(r2)
            if (r2 != 0) goto L_0x0086
            r6 = 1
            goto L_0x0091
        L_0x0086:
            r2 = 59
            int r2 = r12.decodeBin(r2)
            if (r2 != r9) goto L_0x0091
            int r6 = r6 + 1
            goto L_0x0086
        L_0x0091:
            r1 = r23
            r2 = 0
        L_0x0094:
            if (r2 >= r1) goto L_0x00a1
            int[][] r3 = r0.refIdxTop
            r3 = r3[r5]
            int r4 = r7 + r2
            r3[r4] = r6
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00a1:
            r1 = r24
        L_0x00a3:
            if (r8 >= r1) goto L_0x00b0
            int[][] r2 = r0.refIdxLeft
            r2 = r2[r5]
            int r3 = r22 + r8
            r2[r3] = r6
            int r8 = r8 + 1
            goto L_0x00a3
        L_0x00b0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.CABAC.readRefIdx(org.jcodec.codecs.common.biari.MDecoder, boolean, boolean, org.jcodec.codecs.h264.io.model.MBType, org.jcodec.codecs.h264.io.model.MBType, org.jcodec.codecs.h264.H264Const$PartPred, org.jcodec.codecs.h264.H264Const$PartPred, org.jcodec.codecs.h264.H264Const$PartPred, int, int, int, int, int, int):int");
    }

    public int readSubMbTypeB(MDecoder mDecoder) {
        int decodeBin;
        int decodeBin2;
        if (mDecoder.decodeBin(36) == 0) {
            return 0;
        }
        if (mDecoder.decodeBin(37) == 0) {
            return mDecoder.decodeBin(39) + 1;
        }
        if (mDecoder.decodeBin(38) == 0) {
            decodeBin = (mDecoder.decodeBin(39) << 1) + 3;
            decodeBin2 = mDecoder.decodeBin(39);
        } else if (mDecoder.decodeBin(39) != 0) {
            return mDecoder.decodeBin(39) + 11;
        } else {
            decodeBin = (mDecoder.decodeBin(39) << 1) + 7;
            decodeBin2 = mDecoder.decodeBin(39);
        }
        return decodeBin + decodeBin2;
    }

    public int readSubMbTypeP(MDecoder mDecoder) {
        if (mDecoder.decodeBin(21) == 1) {
            return 0;
        }
        if (mDecoder.decodeBin(22) == 0) {
            return 1;
        }
        return mDecoder.decodeBin(23) == 1 ? 2 : 3;
    }

    public boolean readTransform8x8Flag(MDecoder mDecoder, boolean z, boolean z2, MBType mBType, MBType mBType2, boolean z3, boolean z4) {
        return mDecoder.decodeBin((399 + ((!z || mBType == null || !z3) ? 0 : 1)) + ((!z2 || mBType2 == null || !z4) ? 0 : 1)) == 1;
    }

    public int rem4x4PredMode(MDecoder mDecoder) {
        return (mDecoder.decodeBin(69) << 2) | mDecoder.decodeBin(69) | (mDecoder.decodeBin(69) << 1);
    }

    public void setCodedBlock(int i, int i2) {
        int[] iArr = this.codedBlkLeft[0];
        int i3 = i2 & 3;
        this.codedBlkTop[0][i] = 1;
        iArr[i3] = 1;
    }

    public void setPrevCBP(int i) {
        this.prevCBP = i;
    }

    public void writeCoeffs(MEncoder mEncoder, BlockType blockType, int[] iArr, int i, int i2, int[] iArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.tmp[i3] = iArr[iArr2[i + i3]];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.tmp[i5] != 0) {
                i4 = i5 + 1;
            }
        }
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i6 >= Math.min(i4, i2 - 1)) {
                break;
            }
            if (this.tmp[i6] != 0) {
                mEncoder.encodeBin(blockType.sigCoeffFlagCtxOff + i6, 1);
                int i8 = blockType.lastSigCoeffCtxOff + i6;
                if (i6 != i4 - 1) {
                    i7 = 0;
                }
                mEncoder.encodeBin(i8, i7);
            } else {
                mEncoder.encodeBin(blockType.sigCoeffFlagCtxOff + i6, 0);
            }
            i6++;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = i4 - 1; i11 >= 0; i11--) {
            int[] iArr3 = this.tmp;
            if (iArr3[i11] != 0) {
                int abs = MathUtil.abs(iArr3[i11]) - 1;
                writeCoeffAbsLevel(mEncoder, blockType, i9, i10, abs);
                if (abs == 0) {
                    i10++;
                } else {
                    i9++;
                }
                mEncoder.encodeBinBypass(MathUtil.sign(this.tmp[i11]));
            }
        }
    }

    public void writeIntraChromaPredMode(MEncoder mEncoder, int i, MBType mBType, MBType mBType2, boolean z, boolean z2, int i2) {
        int i3 = 64 + ((!z || !mBType.isIntra() || this.chromaPredModeLeft == 0) ? 0 : 1) + ((!z2 || !mBType2.isIntra() || this.chromaPredModeTop[i] == 0) ? 0 : 1);
        int i4 = i2 - 1;
        mEncoder.encodeBin(i3, i2 == 0 ? 0 : 1);
        int i5 = 0;
        while (i4 >= 0 && i5 < 2) {
            int i6 = i4 - 1;
            mEncoder.encodeBin(67, i4 == 0 ? 0 : 1);
            i5++;
            i4 = i6;
        }
        this.chromaPredModeTop[i] = i4;
        this.chromaPredModeLeft = i4;
    }

    public void writeMBQpDelta(MEncoder mEncoder, MBType mBType, int i) {
        int i2 = 60 + ((mBType == null || mBType == MBType.I_PCM || (mBType != MBType.I_16x16 && this.prevCBP == 0) || this.prevMbQpDelta == 0) ? 0 : 1);
        this.prevMbQpDelta = i;
        int i3 = i - 1;
        if (i == 0) {
            mEncoder.encodeBin(i2, 0);
            return;
        }
        mEncoder.encodeBin(i2, 1);
        int i4 = i3 - 1;
        if (i3 == 0) {
            mEncoder.encodeBin(62, 0);
            return;
        }
        while (true) {
            int i5 = i4 - 1;
            if (i4 > 0) {
                mEncoder.encodeBin(63, 1);
                i4 = i5;
            } else {
                mEncoder.encodeBin(63, 0);
                return;
            }
        }
    }

    public void writeMBTypeI(MEncoder mEncoder, MBType mBType, MBType mBType2, boolean z, boolean z2, int i) {
        int i2 = 3 + ((!z || mBType == MBType.I_NxN) ? 0 : 1) + ((!z2 || mBType2 == MBType.I_NxN) ? 0 : 1);
        if (i == 0) {
            mEncoder.encodeBin(i2, 0);
            return;
        }
        mEncoder.encodeBin(i2, 1);
        if (i == 25) {
            mEncoder.encodeBinFinal(1);
            return;
        }
        mEncoder.encodeBinFinal(0);
        writeMBType16x16(mEncoder, i - 1);
    }

    private int condTerm(boolean z, MBType mBType, int i) {
        return (!z || mBType == MBType.I_PCM || (mBType != null && i == 1)) ? 0 : 1;
    }
}
