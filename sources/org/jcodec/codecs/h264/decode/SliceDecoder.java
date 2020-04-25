package org.jcodec.codecs.h264.decode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import org.jcodec.codecs.common.biari.MDecoder;
import org.jcodec.codecs.h264.H264Const;
import org.jcodec.codecs.h264.H264Const.PartPred;
import org.jcodec.codecs.h264.decode.aso.Mapper;
import org.jcodec.codecs.h264.p552io.CABAC;
import org.jcodec.codecs.h264.p552io.CABAC.BlockType;
import org.jcodec.codecs.h264.p552io.CAVLC;
import org.jcodec.codecs.h264.p552io.model.Frame;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.h264.p552io.model.SliceType;
import org.jcodec.common.IntObjectMap;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class SliceDecoder {
    private static final int[] NULL_VECTOR = {0, 0, -1};
    private PictureParameterSet activePps;
    private SeqParameterSet activeSps;
    private CABAC cabac;
    private CAVLC[] cavlc;
    private ColorSpace chromaFormat;
    private int[] chromaQpOffset;
    private boolean debug;
    private int[] i4x4PredLeft;
    private int[] i4x4PredTop;
    private IntObjectMap<Frame> lRefs;
    private int leftCBPChroma;
    private int leftCBPLuma;
    private MBType leftMBType;
    private int[][] leftRow;
    private MDecoder mDecoder;
    private Mapper mapper;
    private int[][] mbQps;
    private MBType[] mbTypes;
    private int[][][] mvLeft;
    private int[][][] mvTop;
    private int[][] mvTopLeft;
    private int[][][][] mvs;
    private int[][] nCoeff;
    private int[] numRef;
    private PartPred[] predModeLeft;
    private PartPred[] predModeTop;
    private Prediction prediction;

    /* renamed from: qp */
    private int f44740qp;
    private Frame[][][] refsUsed;
    private Frame[] sRefs;

    /* renamed from: sh */
    private SliceHeader f44741sh;
    private SliceHeader[] shs;
    private boolean tf8x8Left;
    private boolean[] tf8x8Top;
    private Frame thisFrame;
    private int[] topCBPChroma;
    private int[] topCBPLuma;
    private int[][] topLeft;
    private int[][] topLine;
    private MBType[] topMBType;
    private boolean[] tr8x8Used;
    private boolean transform8x8;

    public SliceDecoder(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, int[][] iArr, int[][][][] iArr2, MBType[] mBTypeArr, int[][] iArr3, SliceHeader[] sliceHeaderArr, boolean[] zArr, Frame[][][] frameArr, Frame frame, Frame[] frameArr2, IntObjectMap<Frame> intObjectMap) {
        this.activeSps = seqParameterSet;
        this.activePps = pictureParameterSet;
        this.nCoeff = iArr;
        this.mvs = iArr2;
        this.mbTypes = mBTypeArr;
        this.mbQps = iArr3;
        this.shs = sliceHeaderArr;
        this.thisFrame = frame;
        this.sRefs = frameArr2;
        this.lRefs = intObjectMap;
        this.tr8x8Used = zArr;
        this.refsUsed = frameArr;
    }

    private Frame[] buildList(Comparator<Frame> comparator, Comparator<Frame> comparator2) {
        Frame[] frameArr = new Frame[(this.sRefs.length + this.lRefs.size())];
        Frame[] copySort = copySort(comparator, this.thisFrame);
        Frame[] copySort2 = copySort(comparator2, this.thisFrame);
        int count = count(copySort);
        int count2 = count(copySort2);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < count) {
            frameArr[i3] = copySort[i2];
            i2++;
            i3++;
        }
        int i4 = 0;
        while (i4 < count2) {
            frameArr[i3] = copySort2[i4];
            i4++;
            i3++;
        }
        int[] keys = this.lRefs.keys();
        Arrays.sort(keys);
        while (i < keys.length) {
            frameArr[i3] = (Frame) this.lRefs.get(keys[i]);
            i++;
            i3++;
        }
        return frameArr;
    }

    private Frame[][] buildRefListB() {
        Frame[] buildList = buildList(Frame.POCDesc, Frame.POCAsc);
        Frame[] buildList2 = buildList(Frame.POCAsc, Frame.POCDesc);
        if (Arrays.equals(buildList, buildList2) && count(buildList2) > 1) {
            Frame frame = buildList2[1];
            buildList2[1] = buildList2[0];
            buildList2[0] = frame;
        }
        Frame[][] frameArr = {(Frame[]) Arrays.copyOf(buildList, this.numRef[0]), (Frame[]) Arrays.copyOf(buildList2, this.numRef[1])};
        reorder(frameArr[0], 0);
        reorder(frameArr[1], 1);
        return frameArr;
    }

    private Frame[] buildRefListP() {
        SliceHeader sliceHeader = this.f44741sh;
        int i = sliceHeader.frame_num;
        int i2 = 1 << (sliceHeader.sps.log2_max_frame_num_minus4 + 4);
        Frame[] frameArr = new Frame[this.numRef[0]];
        int i3 = i - 1;
        int i4 = 0;
        while (i3 >= i - i2 && i4 < this.numRef[0]) {
            int i5 = i3 < 0 ? i3 + i2 : i3;
            Frame[] frameArr2 = this.sRefs;
            if (frameArr2[i5] != null) {
                frameArr[i4] = frameArr2[i5] == H264Const.NO_PIC ? null : frameArr2[i5];
                i4++;
            }
            i3--;
        }
        int[] keys = this.lRefs.keys();
        Arrays.sort(keys);
        int i6 = 0;
        while (i6 < keys.length && i4 < this.numRef[0]) {
            int i7 = i4 + 1;
            frameArr[i4] = (Frame) this.lRefs.get(keys[i6]);
            i6++;
            i4 = i7;
        }
        reorder(frameArr, 0);
        return frameArr;
    }

    private int calcQpChroma(int i, int i2) {
        return H264Const.QP_SCALE_CR[MathUtil.clip(i + i2, 0, 51)];
    }

    private int calcRef(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        int i2 = -1;
        int minPos = minPos(z ? iArr[2] : -1, z2 ? iArr2[2] : -1);
        if (z4) {
            i2 = iArr3[2];
        } else if (z3) {
            i2 = iArr4[2];
        }
        return minPos(minPos, i2);
    }

    private void chromaAC(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int[] iArr, int i3, int i4, MBType mBType, boolean z3) {
        int i5;
        int i6;
        int[] iArr2 = iArr;
        int i7 = i3;
        int i8 = 0;
        while (i8 < iArr2.length) {
            int[] iArr3 = new int[16];
            int i9 = H264Const.MB_BLK_OFF_LEFT[i8];
            int i10 = H264Const.MB_BLK_OFF_TOP[i8];
            int i11 = (i << 1) + i9;
            if (z3) {
                boolean z4 = true;
                if (!this.activePps.entropy_coding_mode_flag) {
                    CAVLC cavlc2 = this.cavlc[i7];
                    boolean z5 = i9 != 0 || z;
                    MBType mBType2 = i9 == 0 ? this.leftMBType : mBType;
                    if (i10 == 0 && !z2) {
                        z4 = false;
                    }
                    cavlc2.readACBlock(bitReader, iArr3, i11, i10, z5, mBType2, z4, i10 == 0 ? this.topMBType[i] : mBType, 1, 15, CoeffTransformer.zigzag4x4);
                    i6 = i4;
                    i5 = i9;
                } else {
                    i5 = i9;
                    if (this.cabac.readCodedBlockFlagChromaAC(this.mDecoder, i11, i10, i3, this.leftMBType, this.topMBType[i], z, z2, this.leftCBPChroma, this.topCBPChroma[i], mBType) == 1) {
                        CABAC cabac2 = this.cabac;
                        MDecoder mDecoder2 = this.mDecoder;
                        BlockType blockType = BlockType.CHROMA_AC;
                        int[] iArr4 = CoeffTransformer.zigzag4x4;
                        int[] iArr5 = H264Const.identityMapping16;
                        cabac2.readCoeffs(mDecoder2, blockType, iArr3, 1, 15, iArr4, iArr5, iArr5);
                    }
                    i6 = i4;
                }
                CoeffTransformer.dequantizeAC(iArr3, i6);
            } else {
                int i12 = i4;
                i5 = i9;
                if (!this.activePps.entropy_coding_mode_flag) {
                    this.cavlc[i7].setZeroCoeff(i11, i10);
                }
            }
            iArr3[0] = iArr2[i8];
            CoeffTransformer.idct4x4(iArr3);
            int i13 = i8;
            putBlk(picture.getPlaneData(i7), iArr3, 3, i5 << 2, i10 << 2);
            i8 = i13 + 1;
            i7 = i3;
        }
    }

    private void chromaDC(BitReader bitReader, int i, boolean z, boolean z2, int[] iArr, int i2, int i3, MBType mBType) {
        int[] iArr2 = iArr;
        if (!this.activePps.entropy_coding_mode_flag) {
            BitReader bitReader2 = bitReader;
            this.cavlc[i2].readChromaDCBlock(bitReader, iArr2, z, z2);
        } else {
            boolean z3 = z;
            boolean z4 = z2;
            if (this.cabac.readCodedBlockFlagChromaDC(this.mDecoder, i, i2, this.leftMBType, this.topMBType[i], z3, z4, this.leftCBPChroma, this.topCBPChroma[i], mBType) == 1) {
                CABAC cabac2 = this.cabac;
                MDecoder mDecoder2 = this.mDecoder;
                BlockType blockType = BlockType.CHROMA_DC;
                int[] iArr3 = H264Const.identityMapping16;
                cabac2.readCoeffs(mDecoder2, blockType, iArr, 0, 4, iArr3, iArr3, iArr3);
            }
        }
        CoeffTransformer.invDC2x2(iArr);
        CoeffTransformer.dequantizeDC2x2(iArr2, i3);
    }

    private void collectChromaPredictors(Picture picture, int i) {
        int[][] iArr = this.topLeft;
        int[] iArr2 = iArr[1];
        int[][] iArr3 = this.topLine;
        int i2 = i << 3;
        int i3 = i2 + 7;
        iArr2[0] = iArr3[1][i3];
        iArr[2][0] = iArr3[2][i3];
        System.arraycopy(picture.getPlaneData(1), 56, this.topLine[1], i2, 8);
        System.arraycopy(picture.getPlaneData(2), 56, this.topLine[2], i2, 8);
        copyCol(picture.getPlaneData(1), 8, 7, 8, this.leftRow[1]);
        copyCol(picture.getPlaneData(2), 8, 7, 8, this.leftRow[2]);
    }

    private void collectPredictors(Picture picture, int i) {
        int[][] iArr = this.topLeft;
        int i2 = i << 4;
        iArr[0][0] = this.topLine[0][i2 + 15];
        iArr[0][1] = picture.getPlaneData(0)[63];
        this.topLeft[0][2] = picture.getPlaneData(0)[127];
        this.topLeft[0][3] = picture.getPlaneData(0)[191];
        System.arraycopy(picture.getPlaneData(0), 240, this.topLine[0], i2, 16);
        copyCol(picture.getPlaneData(0), 16, 15, 16, this.leftRow[0]);
        collectChromaPredictors(picture, i);
    }

    private void copyCol(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        int i4 = 0;
        while (i4 < i) {
            iArr2[i4] = iArr[i2];
            i4++;
            i2 += i3;
        }
    }

    private Frame[] copySort(Comparator<Frame> comparator, Frame frame) {
        Frame[] frameArr = this.sRefs;
        Frame[] frameArr2 = (Frame[]) Arrays.copyOf(frameArr, frameArr.length);
        for (int i = 0; i < frameArr2.length; i++) {
            if (comparator.compare(frame, frameArr2[i]) > 0) {
                frameArr2[i] = null;
            }
        }
        Arrays.sort(frameArr2, comparator);
        return frameArr2;
    }

    private void copyVect(int[] iArr, int[] iArr2) {
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        iArr[2] = iArr2[2];
    }

    private int count(Frame[] frameArr) {
        for (int i = 0; i < frameArr.length; i++) {
            if (frameArr[i] == null) {
                return i;
            }
        }
        return frameArr.length;
    }

    private void debugPrint(String str) {
        if (this.debug) {
            Logger.debug(str);
        }
    }

    private void decodeChromaResidual(BitReader bitReader, boolean z, boolean z2, int i, int i2, int i3, Picture picture, int i4, int i5, MBType mBType) {
        ColorSpace colorSpace = this.chromaFormat;
        int[] iArr = colorSpace.compWidth;
        int i6 = 16 >> iArr[1];
        int[] iArr2 = colorSpace.compHeight;
        int[] iArr3 = new int[(i6 >> iArr2[1])];
        int[] iArr4 = new int[((16 >> iArr[2]) >> iArr2[2])];
        if ((i3 & 3) > 0) {
            BitReader bitReader2 = bitReader;
            int i7 = i;
            boolean z3 = z;
            boolean z4 = z2;
            MBType mBType2 = mBType;
            chromaDC(bitReader2, i7, z3, z4, iArr3, 1, i4, mBType2);
            chromaDC(bitReader2, i7, z3, z4, iArr4, 2, i5, mBType2);
        }
        int i8 = i3 & 2;
        chromaAC(bitReader, z, z2, i, i2, picture, iArr3, 1, i4, mBType, i8 > 0);
        chromaAC(bitReader, z, z2, i, i2, picture, iArr4, 2, i5, mBType, i8 > 0);
    }

    private void decodeInter16x16(BitReader bitReader, Picture picture, Frame[][] frameArr, int i, MBType mBType, PartPred partPred, MBType mBType2) {
        int i2;
        int i3;
        int[][][] iArr;
        int[] iArr2;
        Picture picture2 = picture;
        int i4 = i;
        PartPred partPred2 = partPred;
        MBType mBType3 = mBType2;
        int mbX = this.mapper.getMbX(i4);
        int mbY = this.mapper.getMbY(i4);
        boolean leftAvailable = this.mapper.leftAvailable(i4);
        boolean z = this.mapper.topAvailable(i4);
        boolean z2 = this.mapper.topLeftAvailable(i4);
        boolean z3 = this.mapper.topRightAvailable(i4);
        int address = this.mapper.getAddress(i4);
        int[][][] iArr3 = new int[2][][];
        int i5 = mbX << 2;
        int[] iArr4 = {0, 0};
        char c = 0;
        int i6 = 0;
        for (int i7 = 2; i6 < i7; i7 = 2) {
            if (!partPred2.usesList(i6) || this.numRef[i6] <= 1) {
                i2 = i6;
                iArr2 = iArr4;
                iArr = iArr3;
                i3 = mbX;
            } else {
                i2 = i6;
                iArr2 = iArr4;
                iArr = iArr3;
                i3 = mbX;
                iArr2[i2] = readRefIdx(bitReader, leftAvailable, z, this.leftMBType, this.topMBType[mbX], this.predModeLeft[c], this.predModeTop[mbX << 1], partPred, mbX, 0, 0, 4, 4, i2);
            }
            i6 = i2 + 1;
            Picture picture3 = picture;
            int i8 = i;
            partPred2 = partPred;
            MBType mBType4 = mBType2;
            iArr4 = iArr2;
            iArr3 = iArr;
            mbX = i3;
            c = 0;
        }
        int[] iArr5 = iArr4;
        int[][][] iArr6 = iArr3;
        int i9 = mbX;
        Picture[] pictureArr = {Picture.create(16, 16, this.chromaFormat), Picture.create(16, 16, this.chromaFormat)};
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            int i12 = i10;
            Picture[] pictureArr2 = pictureArr;
            predictInter16x16(bitReader, pictureArr[i10], frameArr, i9, mbY, leftAvailable, z, z2, z3, iArr6, i5, iArr5, i12, partPred);
            i10 = i12 + 1;
            pictureArr = pictureArr2;
        }
        Picture[] pictureArr3 = pictureArr;
        this.prediction.mergePrediction(iArr6[0][0][2], iArr6[1][0][2], partPred, 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), 0, 16, 16, 16, picture.getPlaneData(0), frameArr, this.thisFrame);
        PartPred[] partPredArr = this.predModeLeft;
        PartPred[] partPredArr2 = this.predModeTop;
        int i13 = i9;
        int i14 = i13 << 1;
        partPredArr2[i14 + 1] = partPred;
        partPredArr2[i14] = partPred;
        partPredArr[1] = partPred;
        partPredArr[0] = partPred;
        residualInter(bitReader, picture, frameArr, leftAvailable, z, i13, mbY, iArr6, new PartPred[]{partPred, partPred, partPred, partPred}, this.mapper.getAddress(i), mBType, mBType2);
        collectPredictors(picture, i13);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        MBType mBType5 = mBType2;
        this.leftMBType = mBType5;
        mBTypeArr2[i13] = mBType5;
        mBTypeArr[address] = mBType5;
    }

    private void decodeInter16x8(BitReader bitReader, Picture picture, Frame[][] frameArr, int i, MBType mBType, PartPred partPred, PartPred partPred2, MBType mBType2) {
        int[] iArr;
        int[][][] iArr2;
        int i2;
        int[] iArr3;
        int i3;
        int i4;
        SliceDecoder sliceDecoder = this;
        Picture picture2 = picture;
        int i5 = i;
        PartPred partPred3 = partPred;
        PartPred partPred4 = partPred2;
        MBType mBType3 = mBType2;
        int mbX = sliceDecoder.mapper.getMbX(i5);
        int mbY = sliceDecoder.mapper.getMbY(i5);
        boolean leftAvailable = sliceDecoder.mapper.leftAvailable(i5);
        boolean z = sliceDecoder.mapper.topAvailable(i5);
        boolean z2 = sliceDecoder.mapper.topLeftAvailable(i5);
        boolean z3 = sliceDecoder.mapper.topRightAvailable(i5);
        int address = sliceDecoder.mapper.getAddress(i5);
        int i6 = mbX << 2;
        int[] iArr4 = {0, 0};
        int[] iArr5 = {0, 0};
        int[][][] iArr6 = new int[2][][];
        char c = 0;
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            if (!partPred3.usesList(i7) || sliceDecoder.numRef[i7] <= 1) {
                i3 = i7;
                iArr2 = iArr6;
                iArr = iArr5;
                iArr3 = iArr4;
                i2 = mbX;
            } else {
                MBType mBType4 = sliceDecoder.leftMBType;
                MBType mBType5 = sliceDecoder.topMBType[mbX];
                PartPred partPred5 = sliceDecoder.predModeLeft[c];
                MBType mBType6 = mBType4;
                iArr2 = iArr6;
                iArr = iArr5;
                PartPred partPred6 = partPred5;
                iArr3 = iArr4;
                i2 = mbX;
                i3 = i7;
                iArr3[i3] = readRefIdx(bitReader, leftAvailable, z, mBType6, mBType5, partPred6, sliceDecoder.predModeTop[mbX << 1], partPred, mbX, 0, 0, 4, 2, i3);
            }
            if (!partPred2.usesList(i3) || sliceDecoder.numRef[i3] <= 1) {
                i4 = i3;
            } else {
                i4 = i3;
                iArr[i4] = readRefIdx(bitReader, leftAvailable, true, sliceDecoder.leftMBType, mBType2, sliceDecoder.predModeLeft[1], partPred, partPred2, i2, 0, 2, 4, 2, i3);
            }
            i7 = i4 + 1;
            Picture picture3 = picture;
            int i9 = i;
            partPred3 = partPred;
            PartPred partPred7 = partPred2;
            MBType mBType7 = mBType2;
            iArr4 = iArr3;
            mbX = i2;
            iArr6 = iArr2;
            iArr5 = iArr;
            c = 0;
        }
        int[][][] iArr7 = iArr6;
        int[] iArr8 = iArr5;
        int[] iArr9 = iArr4;
        int i10 = mbX;
        int i11 = 2;
        Picture[] pictureArr = {Picture.create(16, 16, sliceDecoder.chromaFormat), Picture.create(16, 16, sliceDecoder.chromaFormat)};
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12;
            Picture[] pictureArr2 = pictureArr;
            predictInter16x8(bitReader, pictureArr[i12], frameArr, i10, mbY, leftAvailable, z, z2, z3, i6, iArr9, iArr8, iArr7, partPred, partPred2, i13);
            i12 = i13 + 1;
            pictureArr = pictureArr2;
            i11 = 2;
            sliceDecoder = this;
        }
        Picture[] pictureArr3 = pictureArr;
        SliceDecoder sliceDecoder2 = sliceDecoder;
        sliceDecoder2.prediction.mergePrediction(iArr7[0][0][2], iArr7[1][0][2], partPred, 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), 0, 16, 16, 8, picture.getPlaneData(0), frameArr, sliceDecoder2.thisFrame);
        sliceDecoder2.prediction.mergePrediction(iArr7[0][8][2], iArr7[1][8][2], partPred2, 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), 128, 16, 16, 8, picture.getPlaneData(0), frameArr, sliceDecoder2.thisFrame);
        PartPred[] partPredArr = sliceDecoder2.predModeLeft;
        partPredArr[0] = partPred;
        PartPred[] partPredArr2 = sliceDecoder2.predModeTop;
        int i14 = i10;
        int i15 = i14 << 1;
        partPredArr2[i15 + 1] = partPred2;
        partPredArr2[i15] = partPred2;
        partPredArr[1] = partPred2;
        residualInter(bitReader, picture, frameArr, leftAvailable, z, i14, mbY, iArr7, new PartPred[]{partPred, partPred, partPred2, partPred2}, sliceDecoder2.mapper.getAddress(i), mBType, mBType2);
        sliceDecoder2.collectPredictors(picture, i14);
        MBType[] mBTypeArr = sliceDecoder2.mbTypes;
        MBType[] mBTypeArr2 = sliceDecoder2.topMBType;
        MBType mBType8 = mBType2;
        sliceDecoder2.leftMBType = mBType8;
        mBTypeArr2[i14] = mBType8;
        mBTypeArr[address] = mBType8;
    }

    private void decodeInter8x16(BitReader bitReader, Picture picture, Frame[][] frameArr, int i, MBType mBType, PartPred partPred, PartPred partPred2, MBType mBType2) {
        int[] iArr;
        int i2;
        int[][][] iArr2;
        int[] iArr3;
        int i3;
        int i4;
        int i5;
        SliceDecoder sliceDecoder = this;
        Picture picture2 = picture;
        int i6 = i;
        PartPred partPred3 = partPred;
        PartPred partPred4 = partPred2;
        MBType mBType3 = mBType2;
        int mbX = sliceDecoder.mapper.getMbX(i6);
        int mbY = sliceDecoder.mapper.getMbY(i6);
        boolean leftAvailable = sliceDecoder.mapper.leftAvailable(i6);
        boolean z = sliceDecoder.mapper.topAvailable(i6);
        boolean z2 = sliceDecoder.mapper.topLeftAvailable(i6);
        boolean z3 = sliceDecoder.mapper.topRightAvailable(i6);
        int address = sliceDecoder.mapper.getAddress(i6);
        int[][][] iArr4 = new int[2][][];
        int[] iArr5 = {0, 0};
        int[] iArr6 = {0, 0};
        char c = 0;
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            if (!partPred3.usesList(i7) || sliceDecoder.numRef[i7] <= 1) {
                i3 = i7;
                iArr = iArr6;
                iArr3 = iArr5;
                iArr2 = iArr4;
                i2 = mbX;
            } else {
                MBType mBType4 = sliceDecoder.leftMBType;
                MBType mBType5 = sliceDecoder.topMBType[mbX];
                PartPred partPred5 = sliceDecoder.predModeLeft[c];
                MBType mBType6 = mBType4;
                iArr = iArr6;
                MBType mBType7 = mBType5;
                iArr3 = iArr5;
                PartPred partPred6 = partPred5;
                iArr2 = iArr4;
                i2 = mbX;
                i3 = i7;
                iArr3[i3] = readRefIdx(bitReader, leftAvailable, z, mBType6, mBType7, partPred6, sliceDecoder.predModeTop[mbX << 1], partPred, mbX, 0, 0, 2, 4, i3);
            }
            if (!partPred2.usesList(i3) || sliceDecoder.numRef[i3] <= 1) {
                i4 = i2;
                i5 = i3;
            } else {
                int i9 = i2;
                i4 = i9;
                i5 = i3;
                iArr[i5] = readRefIdx(bitReader, true, z, mBType2, sliceDecoder.topMBType[i9], partPred, sliceDecoder.predModeTop[(i9 << 1) + 1], partPred2, i9, 2, 0, 2, 4, i3);
            }
            i7 = i5 + 1;
            Picture picture3 = picture;
            int i10 = i;
            partPred3 = partPred;
            PartPred partPred7 = partPred2;
            MBType mBType8 = mBType2;
            iArr5 = iArr3;
            iArr4 = iArr2;
            mbX = i4;
            iArr6 = iArr;
            c = 0;
        }
        int[] iArr7 = iArr6;
        int[] iArr8 = iArr5;
        int[][][] iArr9 = iArr4;
        int i11 = mbX;
        int i12 = 2;
        Picture[] pictureArr = {Picture.create(16, 16, sliceDecoder.chromaFormat), Picture.create(16, 16, sliceDecoder.chromaFormat)};
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13;
            Picture[] pictureArr2 = pictureArr;
            predictInter8x16(bitReader, pictureArr[i13], frameArr, i11, mbY, leftAvailable, z, z2, z3, iArr9, iArr8, iArr7, i14, partPred, partPred2);
            i13 = i14 + 1;
            i12 = 2;
            sliceDecoder = this;
            pictureArr = pictureArr2;
        }
        Picture[] pictureArr3 = pictureArr;
        SliceDecoder sliceDecoder2 = sliceDecoder;
        sliceDecoder2.prediction.mergePrediction(iArr9[0][0][2], iArr9[1][0][2], partPred, 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), 0, 16, 8, 16, picture.getPlaneData(0), frameArr, sliceDecoder2.thisFrame);
        sliceDecoder2.prediction.mergePrediction(iArr9[0][2][2], iArr9[1][2][2], partPred2, 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), 8, 16, 8, 16, picture.getPlaneData(0), frameArr, sliceDecoder2.thisFrame);
        PartPred[] partPredArr = sliceDecoder2.predModeTop;
        int i15 = i11;
        int i16 = i15 << 1;
        partPredArr[i16] = partPred;
        int i17 = i16 + 1;
        PartPred[] partPredArr2 = sliceDecoder2.predModeLeft;
        partPredArr2[1] = partPred2;
        partPredArr2[0] = partPred2;
        partPredArr[i17] = partPred2;
        residualInter(bitReader, picture, frameArr, leftAvailable, z, i15, mbY, iArr9, new PartPred[]{partPred, partPred2, partPred, partPred2}, sliceDecoder2.mapper.getAddress(i), mBType, mBType2);
        sliceDecoder2.collectPredictors(picture, i15);
        MBType[] mBTypeArr = sliceDecoder2.mbTypes;
        MBType[] mBTypeArr2 = sliceDecoder2.topMBType;
        MBType mBType9 = mBType2;
        sliceDecoder2.leftMBType = mBType9;
        mBTypeArr2[i15] = mBType9;
        mBTypeArr[address] = mBType9;
    }

    private void decodeMBBiDirect(int i, BitReader bitReader, boolean z, MBType mBType, Picture picture, Frame[][] frameArr) {
        boolean z2;
        int i2 = i;
        Picture picture2 = picture;
        int mbX = this.mapper.getMbX(i2);
        int mbY = this.mapper.getMbY(i2);
        int address = this.mapper.getAddress(i2);
        boolean leftAvailable = this.mapper.leftAvailable(i2);
        boolean z3 = this.mapper.topAvailable(i2);
        boolean z4 = this.mapper.topLeftAvailable(i2);
        boolean z5 = this.mapper.topRightAvailable(i2);
        int[][][] iArr = (int[][][]) Array.newInstance(int.class, new int[]{2, 16, 3});
        for (int i3 = 0; i3 < 16; i3++) {
            int[] iArr2 = iArr[0][i3];
            iArr[1][i3][2] = -1;
            iArr2[2] = -1;
        }
        PartPred[] partPredArr = new PartPred[4];
        Picture create = Picture.create(16, 16, this.chromaFormat);
        int[][][] iArr3 = iArr;
        predictBDirect(frameArr, mbX, mbY, leftAvailable, z3, z4, z5, iArr, partPredArr, create, H264Const.identityMapping4);
        int readCodedBlockPatternInter = readCodedBlockPatternInter(bitReader, leftAvailable, z3, this.leftCBPLuma | (this.leftCBPChroma << 4), this.topCBPLuma[mbX] | (this.topCBPChroma[mbX] << 4), this.leftMBType, this.topMBType[mbX]);
        int i4 = readCodedBlockPatternInter & 15;
        int i5 = readCodedBlockPatternInter >> 4;
        if (!this.transform8x8 || i4 == 0 || !this.activeSps.direct_8x8_inference_flag) {
            z2 = false;
        } else {
            z2 = readTransform8x8Flag(bitReader, leftAvailable, z3, this.leftMBType, this.topMBType[mbX], this.tf8x8Left, this.tf8x8Top[mbX]);
        }
        if (i4 > 0 || i5 > 0) {
            this.f44740qp = ((this.f44740qp + readMBQpDelta(bitReader, mBType)) + 52) % 52;
        } else {
            BitReader bitReader2 = bitReader;
        }
        this.mbQps[0][address] = this.f44740qp;
        MBType mBType2 = MBType.P_8x8;
        boolean z6 = this.tf8x8Left;
        BitReader bitReader3 = bitReader;
        boolean z7 = z6;
        int i6 = readCodedBlockPatternInter;
        MBType mBType3 = mBType2;
        boolean z8 = z2;
        int i7 = i5;
        int i8 = i4;
        residualLuma(bitReader3, leftAvailable, z3, mbX, mbY, picture, i6, mBType3, z2, z7, this.tf8x8Top[mbX]);
        int[][][] iArr4 = iArr3;
        savePrediction8x8(mbX, iArr4[0], 0);
        savePrediction8x8(mbX, iArr4[1], 1);
        saveMvs(iArr4, mbX, mbY);
        int i9 = mbX;
        decodeChromaInter(bitReader3, i7, frameArr, iArr4, partPredArr, leftAvailable, z3, mbX, mbY, address, this.f44740qp, picture, create);
        Picture picture3 = picture;
        mergeResidual(picture3, create);
        collectPredictors(picture3, i9);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        MBType mBType4 = MBType.B_Direct_16x16;
        this.leftMBType = mBType4;
        mBTypeArr2[i9] = mBType4;
        mBTypeArr[address] = mBType4;
        int[] iArr5 = this.topCBPLuma;
        int i10 = i8;
        this.leftCBPLuma = i10;
        iArr5[i9] = i10;
        int[] iArr6 = this.topCBPChroma;
        int i11 = i7;
        this.leftCBPChroma = i11;
        iArr6[i9] = i11;
        boolean z9 = z8;
        this.tf8x8Top[i9] = z9;
        this.tf8x8Left = z9;
        this.tr8x8Used[address] = z9;
        PartPred[] partPredArr2 = this.predModeTop;
        int i12 = i9 << 1;
        int i13 = i12 + 1;
        PartPred[] partPredArr3 = this.predModeLeft;
        PartPred partPred = PartPred.Direct;
        partPredArr3[1] = partPred;
        partPredArr3[0] = partPred;
        partPredArr2[i13] = partPred;
        partPredArr2[i12] = partPred;
    }

    private MBType decodeMBlockB(int i, BitReader bitReader, boolean z, MBType mBType, Picture picture, Frame[][] frameArr) {
        int i2;
        int i3 = i;
        if (!this.activePps.entropy_coding_mode_flag) {
            i2 = CAVLCReader.readUE(bitReader, "MB: mb_type");
        } else {
            BitReader bitReader2 = bitReader;
            i2 = this.cabac.readMBTypeB(this.mDecoder, this.leftMBType, this.topMBType[this.mapper.getMbX(i3)], this.mapper.leftAvailable(i3), this.mapper.topAvailable(i3));
        }
        int i4 = i2;
        if (i4 >= 23) {
            return decodeMBlockIInt(i4 - 23, i, bitReader, z, mBType, picture);
        }
        MBType mBType2 = H264Const.bMbTypes[i4];
        if (i4 == 0) {
            decodeMBBiDirect(i, bitReader, z, mBType, picture, frameArr);
        } else if (i4 <= 3) {
            decodeInter16x16(bitReader, picture, frameArr, i, mBType, H264Const.bPredModes[i4][0], mBType2);
        } else if (i4 == 22) {
            decodeMBInter8x8(bitReader, i4, frameArr, picture, SliceType.B, i, z, mBType, false);
        } else if ((i4 & 1) == 0) {
            PartPred[][] partPredArr = H264Const.bPredModes;
            decodeInter16x8(bitReader, picture, frameArr, i, mBType, partPredArr[i4][0], partPredArr[i4][1], mBType2);
        } else {
            PartPred[][] partPredArr2 = H264Const.bPredModes;
            decodeInter8x16(bitReader, picture, frameArr, i, mBType, partPredArr2[i4][0], partPredArr2[i4][1], mBType2);
        }
        return mBType2;
    }

    private MBType decodeMBlockI(int i, BitReader bitReader, boolean z, MBType mBType, Picture picture) {
        int i2;
        if (!this.activePps.entropy_coding_mode_flag) {
            i2 = CAVLCReader.readUE(bitReader, "MB: mb_type");
        } else {
            i2 = this.cabac.readMBTypeI(this.mDecoder, this.leftMBType, this.topMBType[this.mapper.getMbX(i)], this.mapper.leftAvailable(i), this.mapper.topAvailable(i));
        }
        return decodeMBlockIInt(i2, i, bitReader, z, mBType, picture);
    }

    private MBType decodeMBlockIInt(int i, int i2, BitReader bitReader, boolean z, MBType mBType, Picture picture) {
        MBType mBType2;
        if (i == 0) {
            decodeMBlockIntraNxN(bitReader, i2, mBType, picture);
            mBType2 = MBType.I_NxN;
        } else if (i < 1 || i > 24) {
            Logger.warn("IPCM macroblock found. Not tested, may cause unpredictable behavior.");
            decodeMBlockIPCM(bitReader, i2, picture);
            mBType2 = MBType.I_PCM;
        } else {
            decodeMBlockIntra16x16(bitReader, i - 1, i2, mBType, picture);
            mBType2 = MBType.I_16x16;
        }
        int mbX = this.mapper.getMbX(i2) << 2;
        int i3 = mbX + 3;
        copyVect(this.mvTopLeft[0], this.mvTop[0][i3]);
        copyVect(this.mvTopLeft[1], this.mvTop[1][i3]);
        int i4 = mbX + 4;
        saveVect(this.mvTop[0], mbX, i4, 0, 0, -1);
        saveVect(this.mvLeft[0], 0, 4, 0, 0, -1);
        saveVect(this.mvTop[1], mbX, i4, 0, 0, -1);
        saveVect(this.mvLeft[1], 0, 4, 0, 0, -1);
        return mBType2;
    }

    private MBType decodeMBlockP(int i, BitReader bitReader, boolean z, MBType mBType, Picture picture, Frame[][] frameArr) {
        int i2;
        if (!this.activePps.entropy_coding_mode_flag) {
            BitReader bitReader2 = bitReader;
            i2 = CAVLCReader.readUE(bitReader, "MB: mb_type");
        } else {
            BitReader bitReader3 = bitReader;
            i2 = this.cabac.readMBTypeP(this.mDecoder);
        }
        int i3 = i2;
        if (i3 == 0) {
            decodeInter16x16(bitReader, picture, frameArr, i, mBType, PartPred.L0, MBType.P_16x16);
            return MBType.P_16x16;
        } else if (i3 == 1) {
            PartPred partPred = PartPred.L0;
            decodeInter16x8(bitReader, picture, frameArr, i, mBType, partPred, partPred, MBType.P_16x8);
            return MBType.P_16x8;
        } else if (i3 == 2) {
            PartPred partPred2 = PartPred.L0;
            decodeInter8x16(bitReader, picture, frameArr, i, mBType, partPred2, partPred2, MBType.P_8x16);
            return MBType.P_8x16;
        } else if (i3 == 3) {
            decodeMBInter8x8(bitReader, i3, frameArr, picture, SliceType.P, i, z, mBType, false);
            return MBType.P_8x8;
        } else if (i3 != 4) {
            return decodeMBlockIInt(i3 - 5, i, bitReader, z, mBType, picture);
        } else {
            decodeMBInter8x8(bitReader, i3, frameArr, picture, SliceType.P, i, z, mBType, true);
            return MBType.P_8x8ref0;
        }
    }

    private void decodeSub4x4(BitReader bitReader, Picture[] pictureArr, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int i3, Picture picture, int i4, int i5, int i6, int i7, MBType mBType, MBType mBType2, MBType mBType3, PartPred partPred, PartPred partPred2, PartPred partPred3, int i8) {
        int i9 = i3;
        BitReader bitReader2 = bitReader;
        boolean z5 = z4;
        boolean z6 = z2;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        PartPred partPred4 = partPred;
        PartPred partPred5 = partPred2;
        PartPred partPred6 = partPred3;
        int i10 = i7;
        int i11 = i5;
        int i12 = i6;
        int readMVD = readMVD(bitReader2, 0, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 1, 1, i8);
        int readMVD2 = readMVD(bitReader2, 1, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 1, 1, i8);
        int[] iArr11 = iArr5;
        int[] iArr12 = iArr2;
        int[] iArr13 = iArr3;
        int[] iArr14 = iArr;
        boolean z7 = z4;
        boolean z8 = z2;
        boolean z9 = z2;
        boolean z10 = z;
        int i13 = i3;
        int calcMVPredictionMedian = calcMVPredictionMedian(iArr11, iArr12, iArr13, iArr14, z7, z8, z9, z10, i13, 0);
        int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr11, iArr12, iArr13, iArr14, z7, z8, z9, z10, i13, 1);
        int i14 = readMVD;
        iArr7[0] = i14 + calcMVPredictionMedian;
        iArr7[1] = readMVD2 + calcMVPredictionMedian2;
        StringBuilder sb = new StringBuilder();
        String str = "MVP: (";
        sb.append(str);
        sb.append(calcMVPredictionMedian);
        String str2 = ", ";
        sb.append(str2);
        sb.append(calcMVPredictionMedian2);
        String str3 = "), MVD: (";
        sb.append(str3);
        sb.append(i14);
        sb.append(str2);
        sb.append(readMVD2);
        String str4 = "), MV: (";
        sb.append(str4);
        sb.append(iArr7[0]);
        String str5 = ",";
        sb.append(str5);
        sb.append(iArr7[1]);
        sb.append(str5);
        sb.append(i3);
        String str6 = ")";
        sb.append(str6);
        debugPrint(sb.toString());
        int i15 = i5 + 1;
        BitReader bitReader3 = bitReader;
        boolean z11 = z2;
        MBType mBType6 = mBType3;
        MBType mBType7 = mBType2;
        PartPred partPred7 = partPred3;
        PartPred partPred8 = partPred2;
        String str7 = str6;
        PartPred partPred9 = partPred3;
        int i16 = i7;
        String str8 = str5;
        int i17 = i15;
        String str9 = str4;
        int i18 = i6;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        int readMVD3 = readMVD(bitReader3, 0, true, z11, mBType6, mBType7, partPred7, partPred8, partPred9, i16, i17, i18, 1, 1, i8);
        int readMVD4 = readMVD(bitReader3, 1, true, z11, mBType6, mBType7, partPred7, partPred8, partPred9, i16, i17, i18, 1, 1, i8);
        int[] iArr15 = iArr7;
        int[] iArr16 = iArr3;
        int[] iArr17 = iArr4;
        int[] iArr18 = iArr2;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z2;
        int i19 = i3;
        int calcMVPredictionMedian3 = calcMVPredictionMedian(iArr15, iArr16, iArr17, iArr18, true, z12, z13, z14, i19, 0);
        int calcMVPredictionMedian4 = calcMVPredictionMedian(iArr15, iArr16, iArr17, iArr18, true, z12, z13, z14, i19, 1);
        int i20 = readMVD3;
        iArr8[0] = i20 + calcMVPredictionMedian3;
        iArr8[1] = readMVD4 + calcMVPredictionMedian4;
        StringBuilder sb2 = new StringBuilder();
        String str13 = str12;
        sb2.append(str13);
        sb2.append(calcMVPredictionMedian3);
        String str14 = str11;
        sb2.append(str14);
        sb2.append(calcMVPredictionMedian4);
        String str15 = str10;
        sb2.append(str15);
        sb2.append(i20);
        sb2.append(str14);
        sb2.append(readMVD4);
        String str16 = str9;
        sb2.append(str16);
        sb2.append(iArr8[0]);
        String str17 = str8;
        sb2.append(str17);
        sb2.append(iArr8[1]);
        sb2.append(str17);
        sb2.append(i3);
        String str18 = str7;
        sb2.append(str18);
        debugPrint(sb2.toString());
        int i21 = i6 + 1;
        BitReader bitReader4 = bitReader;
        boolean z15 = z4;
        MBType mBType8 = mBType;
        MBType mBType9 = mBType3;
        PartPred partPred10 = partPred;
        PartPred partPred11 = partPred3;
        String str19 = str18;
        PartPred partPred12 = partPred3;
        int i22 = i7;
        String str20 = str17;
        int i23 = i5;
        String str21 = str16;
        int i24 = i21;
        String str22 = str15;
        String str23 = str14;
        String str24 = str13;
        int readMVD5 = readMVD(bitReader4, 0, z15, true, mBType8, mBType9, partPred10, partPred11, partPred12, i22, i23, i24, 1, 1, i8);
        int readMVD6 = readMVD(bitReader4, 1, z15, true, mBType8, mBType9, partPred10, partPred11, partPred12, i22, i23, i24, 1, 1, i8);
        int[] iArr19 = iArr6;
        int[] iArr20 = iArr7;
        int[] iArr21 = iArr8;
        int[] iArr22 = iArr5;
        boolean z16 = z4;
        boolean z17 = z4;
        int i25 = i3;
        int calcMVPredictionMedian5 = calcMVPredictionMedian(iArr19, iArr20, iArr21, iArr22, z16, true, true, z17, i25, 0);
        int calcMVPredictionMedian6 = calcMVPredictionMedian(iArr19, iArr20, iArr21, iArr22, z16, true, true, z17, i25, 1);
        int i26 = readMVD5;
        iArr9[0] = i26 + calcMVPredictionMedian5;
        iArr9[1] = readMVD6 + calcMVPredictionMedian6;
        StringBuilder sb3 = new StringBuilder();
        String str25 = str24;
        sb3.append(str25);
        sb3.append(calcMVPredictionMedian5);
        String str26 = str23;
        sb3.append(str26);
        sb3.append(calcMVPredictionMedian6);
        String str27 = str22;
        sb3.append(str27);
        sb3.append(i26);
        sb3.append(str26);
        sb3.append(readMVD6);
        String str28 = str21;
        sb3.append(str28);
        sb3.append(iArr9[0]);
        String str29 = str20;
        sb3.append(str29);
        sb3.append(iArr9[1]);
        sb3.append(str29);
        sb3.append(i3);
        String str30 = str19;
        sb3.append(str30);
        debugPrint(sb3.toString());
        BitReader bitReader5 = bitReader;
        MBType mBType10 = mBType3;
        MBType mBType11 = mBType3;
        PartPred partPred13 = partPred3;
        PartPred partPred14 = partPred3;
        String str31 = str30;
        PartPred partPred15 = partPred3;
        int i27 = i7;
        String str32 = str29;
        int i28 = i15;
        String str33 = str28;
        int i29 = i21;
        String str34 = str27;
        String str35 = str26;
        String str36 = str25;
        int readMVD7 = readMVD(bitReader5, 0, true, true, mBType10, mBType11, partPred13, partPred14, partPred15, i27, i28, i29, 1, 1, i8);
        int readMVD8 = readMVD(bitReader5, 1, true, true, mBType10, mBType11, partPred13, partPred14, partPred15, i27, i28, i29, 1, 1, i8);
        int[] iArr23 = iArr9;
        int[] iArr24 = iArr8;
        int[] iArr25 = iArr7;
        int i30 = i3;
        int calcMVPredictionMedian7 = calcMVPredictionMedian(iArr23, iArr24, NULL_VECTOR, iArr25, true, true, false, true, i30, 0);
        int calcMVPredictionMedian8 = calcMVPredictionMedian(iArr23, iArr24, NULL_VECTOR, iArr25, true, true, false, true, i30, 1);
        int i31 = readMVD7;
        iArr10[0] = i31 + calcMVPredictionMedian7;
        iArr10[1] = readMVD8 + calcMVPredictionMedian8;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str36);
        sb4.append(calcMVPredictionMedian7);
        String str37 = str35;
        sb4.append(str37);
        sb4.append(calcMVPredictionMedian8);
        sb4.append(str34);
        sb4.append(i31);
        sb4.append(str37);
        sb4.append(readMVD8);
        sb4.append(str33);
        sb4.append(iArr10[0]);
        String str38 = str32;
        sb4.append(str38);
        sb4.append(iArr10[1]);
        sb4.append(str38);
        int i32 = i3;
        sb4.append(i32);
        sb4.append(str31);
        debugPrint(sb4.toString());
        Picture picture2 = picture;
        BlockInterpolator.getBlockLuma(pictureArr[i32], picture2, i4, i + iArr7[0], i2 + iArr7[1], 4, 4);
        BlockInterpolator.getBlockLuma(pictureArr[i32], picture2, i4 + 4, i + iArr8[0] + 16, i2 + iArr8[1], 4, 4);
        BlockInterpolator.getBlockLuma(pictureArr[i32], picture2, i4 + (picture.getWidth() * 4), i + iArr9[0], i2 + iArr9[1] + 16, 4, 4);
        BlockInterpolator.getBlockLuma(pictureArr[i32], picture, i4 + (picture.getWidth() * 4) + 4, i + iArr10[0] + 16, i2 + iArr10[1] + 16, 4, 4);
    }

    private void decodeSub4x8(BitReader bitReader, Picture[] pictureArr, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int i3, Picture picture, int i4, int i5, int i6, int i7, MBType mBType, MBType mBType2, MBType mBType3, PartPred partPred, PartPred partPred2, PartPred partPred3, int i8) {
        int i9 = i3;
        BitReader bitReader2 = bitReader;
        boolean z5 = z4;
        boolean z6 = z2;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        PartPred partPred4 = partPred;
        PartPred partPred5 = partPred2;
        PartPred partPred6 = partPred3;
        int i10 = i7;
        int i11 = i5;
        int i12 = i6;
        int readMVD = readMVD(bitReader2, 0, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 1, 2, i8);
        int readMVD2 = readMVD(bitReader2, 1, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 1, 2, i8);
        int[] iArr10 = iArr5;
        int[] iArr11 = iArr2;
        int[] iArr12 = iArr3;
        int[] iArr13 = iArr;
        boolean z7 = z4;
        boolean z8 = z2;
        boolean z9 = z2;
        boolean z10 = z;
        int i13 = i3;
        int calcMVPredictionMedian = calcMVPredictionMedian(iArr10, iArr11, iArr12, iArr13, z7, z8, z9, z10, i13, 0);
        int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr10, iArr11, iArr12, iArr13, z7, z8, z9, z10, i13, 1);
        int i14 = readMVD;
        int i15 = i14 + calcMVPredictionMedian;
        iArr8[0] = i15;
        iArr6[0] = i15;
        int i16 = readMVD2 + calcMVPredictionMedian2;
        iArr8[1] = i16;
        iArr6[1] = i16;
        StringBuilder sb = new StringBuilder();
        String str = "MVP: (";
        sb.append(str);
        sb.append(calcMVPredictionMedian);
        String str2 = ", ";
        sb.append(str2);
        sb.append(calcMVPredictionMedian2);
        String str3 = "), MVD: (";
        sb.append(str3);
        sb.append(i14);
        sb.append(str2);
        sb.append(readMVD2);
        String str4 = "), MV: (";
        sb.append(str4);
        sb.append(iArr6[0]);
        String str5 = ",";
        sb.append(str5);
        sb.append(iArr6[1]);
        sb.append(str5);
        sb.append(i3);
        String str6 = ")";
        sb.append(str6);
        debugPrint(sb.toString());
        BitReader bitReader3 = bitReader;
        boolean z11 = z2;
        MBType mBType6 = mBType3;
        MBType mBType7 = mBType2;
        PartPred partPred7 = partPred3;
        PartPred partPred8 = partPred2;
        String str7 = str6;
        PartPred partPred9 = partPred3;
        int i17 = i7;
        String str8 = str5;
        int i18 = i5 + 1;
        String str9 = str4;
        int i19 = i6;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        int readMVD3 = readMVD(bitReader3, 0, true, z11, mBType6, mBType7, partPred7, partPred8, partPred9, i17, i18, i19, 1, 2, i8);
        int readMVD4 = readMVD(bitReader3, 1, true, z11, mBType6, mBType7, partPred7, partPred8, partPred9, i17, i18, i19, 1, 2, i8);
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr3;
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr2;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z2;
        int i20 = i3;
        int calcMVPredictionMedian3 = calcMVPredictionMedian(iArr14, iArr15, iArr16, iArr17, true, z12, z13, z14, i20, 0);
        int calcMVPredictionMedian4 = calcMVPredictionMedian(iArr14, iArr15, iArr16, iArr17, true, z12, z13, z14, i20, 1);
        int i21 = readMVD3;
        int i22 = i21 + calcMVPredictionMedian3;
        iArr9[0] = i22;
        iArr7[0] = i22;
        int i23 = readMVD4 + calcMVPredictionMedian4;
        iArr9[1] = i23;
        iArr7[1] = i23;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str12);
        sb2.append(calcMVPredictionMedian3);
        String str13 = str11;
        sb2.append(str13);
        sb2.append(calcMVPredictionMedian4);
        sb2.append(str10);
        sb2.append(i21);
        sb2.append(str13);
        sb2.append(readMVD4);
        sb2.append(str9);
        sb2.append(iArr7[0]);
        String str14 = str8;
        sb2.append(str14);
        sb2.append(iArr7[1]);
        sb2.append(str14);
        int i24 = i3;
        sb2.append(i24);
        sb2.append(str7);
        debugPrint(sb2.toString());
        BlockInterpolator.getBlockLuma(pictureArr[i24], picture, i4, i + iArr6[0], i2 + iArr6[1], 4, 8);
        BlockInterpolator.getBlockLuma(pictureArr[i24], picture, i4 + 4, i + iArr7[0] + 16, i2 + iArr7[1], 4, 8);
    }

    private void decodeSub8x4(BitReader bitReader, Picture[] pictureArr, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int i3, Picture picture, int i4, int i5, int i6, int i7, MBType mBType, MBType mBType2, MBType mBType3, PartPred partPred, PartPred partPred2, PartPred partPred3, int i8) {
        int i9 = i3;
        BitReader bitReader2 = bitReader;
        boolean z5 = z4;
        boolean z6 = z2;
        MBType mBType4 = mBType;
        MBType mBType5 = mBType2;
        PartPred partPred4 = partPred;
        PartPred partPred5 = partPred2;
        PartPred partPred6 = partPred3;
        int i10 = i7;
        int i11 = i5;
        int i12 = i6;
        int readMVD = readMVD(bitReader2, 0, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 2, 1, i8);
        int readMVD2 = readMVD(bitReader2, 1, z5, z6, mBType4, mBType5, partPred4, partPred5, partPred6, i10, i11, i12, 2, 1, i8);
        int[] iArr10 = iArr4;
        int[] iArr11 = iArr2;
        int[] iArr12 = iArr3;
        int[] iArr13 = iArr;
        boolean z7 = z4;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z;
        int i13 = i3;
        int calcMVPredictionMedian = calcMVPredictionMedian(iArr10, iArr11, iArr12, iArr13, z7, z8, z9, z10, i13, 0);
        int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr10, iArr11, iArr12, iArr13, z7, z8, z9, z10, i13, 1);
        int i14 = readMVD;
        int i15 = i14 + calcMVPredictionMedian;
        iArr7[0] = i15;
        iArr6[0] = i15;
        int i16 = readMVD2 + calcMVPredictionMedian2;
        iArr7[1] = i16;
        iArr6[1] = i16;
        StringBuilder sb = new StringBuilder();
        String str = "MVP: (";
        sb.append(str);
        sb.append(calcMVPredictionMedian);
        String str2 = ", ";
        sb.append(str2);
        sb.append(calcMVPredictionMedian2);
        String str3 = "), MVD: (";
        sb.append(str3);
        sb.append(i14);
        sb.append(str2);
        sb.append(readMVD2);
        String str4 = "), MV: (";
        sb.append(str4);
        sb.append(iArr6[0]);
        String str5 = ",";
        sb.append(str5);
        sb.append(iArr6[1]);
        sb.append(str5);
        sb.append(i3);
        String str6 = ")";
        sb.append(str6);
        debugPrint(sb.toString());
        BitReader bitReader3 = bitReader;
        boolean z11 = z4;
        MBType mBType6 = mBType;
        MBType mBType7 = mBType3;
        PartPred partPred7 = partPred;
        PartPred partPred8 = partPred3;
        String str7 = str6;
        PartPred partPred9 = partPred3;
        int i17 = i7;
        String str8 = str5;
        int i18 = i5;
        String str9 = str4;
        int i19 = i6 + 1;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        int readMVD3 = readMVD(bitReader3, 0, z11, true, mBType6, mBType7, partPred7, partPred8, partPred9, i17, i18, i19, 2, 1, i8);
        int readMVD4 = readMVD(bitReader3, 1, z11, true, mBType6, mBType7, partPred7, partPred8, partPred9, i17, i18, i19, 2, 1, i8);
        int[] iArr14 = iArr5;
        int[] iArr15 = iArr6;
        int[] iArr16 = iArr4;
        boolean z12 = z4;
        boolean z13 = z4;
        int i20 = i3;
        int calcMVPredictionMedian3 = calcMVPredictionMedian(iArr14, iArr15, NULL_VECTOR, iArr16, z12, true, false, z13, i20, 0);
        int calcMVPredictionMedian4 = calcMVPredictionMedian(iArr14, iArr15, NULL_VECTOR, iArr16, z12, true, false, z13, i20, 1);
        int i21 = readMVD3;
        int i22 = i21 + calcMVPredictionMedian3;
        iArr9[0] = i22;
        iArr8[0] = i22;
        int i23 = readMVD4 + calcMVPredictionMedian4;
        iArr9[1] = i23;
        iArr8[1] = i23;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str12);
        sb2.append(calcMVPredictionMedian3);
        String str13 = str11;
        sb2.append(str13);
        sb2.append(calcMVPredictionMedian4);
        sb2.append(str10);
        sb2.append(i21);
        sb2.append(str13);
        sb2.append(readMVD4);
        sb2.append(str9);
        sb2.append(iArr8[0]);
        String str14 = str8;
        sb2.append(str14);
        sb2.append(iArr8[1]);
        sb2.append(str14);
        int i24 = i3;
        sb2.append(i24);
        sb2.append(str7);
        debugPrint(sb2.toString());
        BlockInterpolator.getBlockLuma(pictureArr[i24], picture, i4, i + iArr6[0], i2 + iArr6[1], 8, 4);
        BlockInterpolator.getBlockLuma(pictureArr[i24], picture, i4 + (picture.getWidth() * 4), i + iArr8[0], i2 + iArr8[1] + 16, 8, 4);
    }

    private void decodeSub8x8(BitReader bitReader, Picture[] pictureArr, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int i3, Picture picture, int i4, int i5, int i6, int i7, MBType mBType, MBType mBType2, MBType mBType3, PartPred partPred, PartPred partPred2, PartPred partPred3, int i8) {
        int i9 = i3;
        int readMVD = readMVD(bitReader, 0, z4, z2, mBType, mBType2, partPred, partPred2, partPred3, i7, i5, i6, 2, 2, i8);
        int readMVD2 = readMVD(bitReader, 1, z4, z2, mBType, mBType2, partPred, partPred2, partPred3, i7, i5, i6, 2, 2, i8);
        int[] iArr9 = iArr4;
        int[] iArr10 = iArr2;
        int[] iArr11 = iArr3;
        int[] iArr12 = iArr;
        boolean z5 = z4;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z;
        int i10 = i3;
        int calcMVPredictionMedian = calcMVPredictionMedian(iArr9, iArr10, iArr11, iArr12, z5, z6, z7, z8, i10, 0);
        int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr9, iArr10, iArr11, iArr12, z5, z6, z7, z8, i10, 1);
        int i11 = readMVD + calcMVPredictionMedian;
        iArr8[0] = i11;
        iArr7[0] = i11;
        iArr6[0] = i11;
        iArr5[0] = i11;
        int i12 = calcMVPredictionMedian2 + readMVD2;
        iArr8[1] = i12;
        iArr7[1] = i12;
        iArr6[1] = i12;
        iArr5[1] = i12;
        StringBuilder sb = new StringBuilder();
        sb.append("MVP: (");
        sb.append(calcMVPredictionMedian);
        String str = ", ";
        sb.append(str);
        sb.append(calcMVPredictionMedian2);
        sb.append("), MVD: (");
        sb.append(readMVD);
        sb.append(str);
        sb.append(readMVD2);
        sb.append("), MV: (");
        sb.append(iArr5[0]);
        String str2 = ",";
        sb.append(str2);
        sb.append(iArr5[1]);
        sb.append(str2);
        sb.append(i9);
        sb.append(")");
        debugPrint(sb.toString());
        BlockInterpolator.getBlockLuma(pictureArr[i9], picture, i4, i + iArr5[0], i2 + iArr5[1], 8, 8);
    }

    private void decodeSubMb8x8(BitReader bitReader, int i, Picture[] pictureArr, int i2, int i3, int[][] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int i4, Picture picture, int i5, int i6, int i7, int i8, MBType mBType, MBType mBType2, MBType mBType3, PartPred partPred, PartPred partPred2, PartPred partPred3, int i9) {
        int i10 = i;
        iArr11[2] = i4;
        iArr10[2] = i4;
        iArr9[2] = i4;
        iArr8[2] = i4;
        if (i10 == 0) {
            decodeSub8x8(bitReader, pictureArr, i2, i3, iArr2, iArr3, iArr5, iArr6, z, z2, z3, z4, iArr8, iArr9, iArr10, iArr11, i4, picture, i5, i6, i7, i8, mBType, mBType2, mBType3, partPred, partPred2, partPred3, i9);
        } else if (i10 == 1) {
            decodeSub8x4(bitReader, pictureArr, i2, i3, iArr2, iArr3, iArr5, iArr6, iArr7, z, z2, z3, z4, iArr8, iArr9, iArr10, iArr11, i4, picture, i5, i6, i7, i8, mBType, mBType2, mBType3, partPred, partPred2, partPred3, i9);
        } else if (i10 == 2) {
            decodeSub4x8(bitReader, pictureArr, i2, i3, iArr2, iArr3, iArr4, iArr5, iArr6, z, z2, z3, z4, iArr8, iArr9, iArr10, iArr11, i4, picture, i5, i6, i7, i8, mBType, mBType2, mBType3, partPred, partPred2, partPred3, i9);
        } else if (i10 == 3) {
            decodeSub4x4(bitReader, pictureArr, i2, i3, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, z, z2, z3, z4, iArr8, iArr9, iArr10, iArr11, i4, picture, i5, i6, i7, i8, mBType, mBType2, mBType3, partPred, partPred2, partPred3, i9);
        }
    }

    private int findPic(Frame[] frameArr, Frame frame) {
        for (int i = 0; i < frameArr.length; i++) {
            if (frameArr[i] == frame) {
                return i;
            }
        }
        Logger.error("RefPicList0 shall contain refPicCol");
        return 0;
    }

    private int max(int i, int i2, int i3) {
        if (i > i2) {
            if (i > i3) {
                return i;
            }
        } else if (i2 > i3) {
            return i2;
        }
        return i3;
    }

    private void mergeResidual(Picture picture, Picture picture2) {
        for (int i = 0; i < 3; i++) {
            int[] planeData = picture.getPlaneData(i);
            int[] planeData2 = picture2.getPlaneData(i);
            for (int i2 = 0; i2 < planeData.length; i2++) {
                planeData[i2] = MathUtil.clip(planeData[i2] + planeData2[i2], 0, 255);
            }
        }
    }

    private int min(int i, int i2, int i3) {
        if (i < i2) {
            if (i < i3) {
                return i;
            }
        } else if (i2 < i3) {
            return i2;
        }
        return i3;
    }

    private int minPos(int i, int i2) {
        return (i < 0 || i2 < 0) ? Math.max(i, i2) : Math.min(i, i2);
    }

    private void pred4x4(int i, int i2, int[][][] iArr, PartPred[] partPredArr, int i3, int i4, int i5, int i6, int i7, int i8, Frame frame, PartPred partPred, int i9) {
        int i10 = (i << 2) + (i9 & 3);
        int i11 = (i2 << 2) + (i9 >> 2);
        iArr[0][i9][2] = i3;
        iArr[1][i9][2] = i4;
        int[] iArr2 = frame.getMvs()[0][i11][i10];
        if (iArr2[2] == -1) {
            iArr2 = frame.getMvs()[1][i11][i10];
        }
        boolean z = frame.isShortTerm() && iArr2[2] == 0 && (MathUtil.abs(iArr2[0]) >> 1) == 0 && (MathUtil.abs(iArr2[1]) >> 1) == 0;
        if (i3 > 0 || !z) {
            iArr[0][i9][0] = i5;
            iArr[0][i9][1] = i6;
        }
        if (i4 > 0 || !z) {
            iArr[1][i9][0] = i7;
            iArr[1][i9][1] = i8;
        }
        partPredArr[H264Const.BLK_8x8_IND[i9]] = partPred;
    }

    private void predTemp4x4(Frame[][] frameArr, int i, int i2, int[][][] iArr, int i3) {
        Frame frame;
        int i4;
        int i5 = this.activeSps.pic_width_in_mbs_minus1 + 1;
        Frame frame2 = frameArr[1][0];
        int i6 = (i << 2) + (i3 & 3);
        int i7 = (i2 << 2) + (i3 >> 2);
        int[] iArr2 = frame2.getMvs()[0][i7][i6];
        if (iArr2[2] == -1) {
            iArr2 = frame2.getMvs()[1][i7][i6];
            if (iArr2[2] == -1) {
                frame = frameArr[0][0];
                i4 = 0;
            } else {
                frame = frame2.getRefsUsed()[(i2 * i5) + i][1][iArr2[2]];
                i4 = findPic(frameArr[0], frame);
            }
        } else {
            frame = frame2.getRefsUsed()[(i2 * i5) + i][0][iArr2[2]];
            i4 = findPic(frameArr[0], frame);
        }
        iArr[0][i3][2] = i4;
        iArr[1][i3][2] = 0;
        int clip = MathUtil.clip(frame2.getPOC() - frame.getPOC(), -128, C13959t.f40827P1);
        if (!frame.isShortTerm() || clip == 0) {
            iArr[0][i3][0] = iArr2[0];
            iArr[0][i3][1] = iArr2[1];
            iArr[1][i3][0] = 0;
            iArr[1][i3][1] = 0;
            return;
        }
        int clip2 = MathUtil.clip(((MathUtil.clip(this.thisFrame.getPOC() - frame.getPOC(), -128, C13959t.f40827P1) * ((Math.abs(clip / 2) + 16384) / clip)) + 32) >> 6, -1024, 1023);
        iArr[0][i3][0] = ((iArr2[0] * clip2) + 128) >> 8;
        iArr[0][i3][1] = ((clip2 * iArr2[1]) + 128) >> 8;
        iArr[1][i3][0] = iArr[0][i3][0] - iArr2[0];
        iArr[1][i3][1] = iArr[0][i3][1] - iArr2[1];
    }

    private boolean predict8x8B(BitReader bitReader, Frame[][] frameArr, Picture picture, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, int[][][] iArr, PartPred[] partPredArr) {
        int i3;
        char c;
        Picture[] pictureArr;
        int i4;
        int i5;
        int i6;
        PartPred[] partPredArr2;
        int i7;
        int[] iArr2;
        int i8;
        int i9;
        char c2;
        int i10;
        char c3;
        int i11;
        char c4;
        char c5;
        SliceDecoder sliceDecoder = this;
        int i12 = i;
        int[] iArr3 = new int[4];
        char c6 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            iArr3[i13] = readSubMBTypeB(bitReader);
            partPredArr[i13] = H264Const.bPartPredModes[iArr3[i13]];
        }
        int i14 = 2;
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, new int[]{2, 4});
        int i15 = 0;
        while (i15 < i14) {
            if (sliceDecoder.numRef[i15] <= 1) {
                i8 = i15;
                iArr2 = iArr3;
            } else {
                if (partPredArr[c6].usesList(i15)) {
                    i9 = i15;
                    iArr2 = iArr3;
                    c2 = 0;
                    iArr4[i15][0] = readRefIdx(bitReader, z2, z3, sliceDecoder.leftMBType, sliceDecoder.topMBType[i12], sliceDecoder.predModeLeft[c6], sliceDecoder.predModeTop[i12 << 1], partPredArr[c6], i, 0, 0, 2, 2, i9);
                } else {
                    i9 = i15;
                    iArr2 = iArr3;
                    c2 = 0;
                }
                int i16 = i9;
                if (partPredArr[1].usesList(i16)) {
                    int[] iArr5 = iArr4[i16];
                    int i17 = i;
                    i10 = i16;
                    int readRefIdx = readRefIdx(bitReader, true, z3, MBType.B_8x8, sliceDecoder.topMBType[i17], partPredArr[c2], sliceDecoder.predModeTop[(i17 << 1) + 1], partPredArr[1], i, 2, 0, 2, 2, i10);
                    c3 = 1;
                    iArr5[1] = readRefIdx;
                } else {
                    i10 = i16;
                    c3 = 1;
                }
                int i18 = i10;
                if (partPredArr[2].usesList(i18)) {
                    int[] iArr6 = iArr4[i18];
                    i11 = i18;
                    c4 = 1;
                    int readRefIdx2 = readRefIdx(bitReader, z2, true, sliceDecoder.leftMBType, MBType.B_8x8, sliceDecoder.predModeLeft[c3], partPredArr[0], partPredArr[2], i, 0, 2, 2, 2, i11);
                    c5 = 2;
                    iArr6[2] = readRefIdx2;
                } else {
                    i11 = i18;
                    c5 = 2;
                    c4 = 1;
                }
                int i19 = i11;
                if (partPredArr[3].usesList(i19)) {
                    int[] iArr7 = iArr4[i19];
                    MBType mBType = MBType.B_8x8;
                    i8 = i19;
                    iArr7[3] = readRefIdx(bitReader, true, true, mBType, mBType, partPredArr[c5], partPredArr[c4], partPredArr[3], i, 2, 2, 2, 2, i8);
                    i15 = i8 + 1;
                    i12 = i;
                    iArr3 = iArr2;
                    i14 = 2;
                    c6 = 0;
                    sliceDecoder = this;
                } else {
                    i8 = i19;
                }
            }
            i15 = i8 + 1;
            i12 = i;
            iArr3 = iArr2;
            i14 = 2;
            c6 = 0;
            sliceDecoder = this;
        }
        int[] iArr8 = iArr3;
        int i20 = 2;
        SliceDecoder sliceDecoder2 = this;
        Picture[] pictureArr2 = {Picture.create(16, 16, sliceDecoder2.chromaFormat), Picture.create(16, 16, sliceDecoder2.chromaFormat)};
        PartPred[] partPredArr3 = new PartPred[4];
        int i21 = 0;
        for (int i22 = 4; i21 < i22; i22 = 4) {
            if (partPredArr[i21] == PartPred.Direct) {
                i7 = i21;
                partPredArr2 = partPredArr3;
                predictBDirect(frameArr, i, i2, z2, z3, z4, z5, iArr, partPredArr3, picture, H264Const.ARRAY[i21]);
            } else {
                i7 = i21;
                partPredArr2 = partPredArr3;
            }
            i21 = i7 + 1;
            partPredArr3 = partPredArr2;
        }
        PartPred[] partPredArr4 = partPredArr3;
        char c7 = 0;
        int i23 = i;
        int i24 = i23 << 1;
        int i25 = 0;
        while (i25 < i20) {
            if (partPredArr[c7].usesList(i25)) {
                int i26 = H264Const.bSubMbTypes[iArr8[c7]];
                Frame[] frameArr2 = frameArr[i25];
                int i27 = i23 << 6;
                int i28 = i2 << 6;
                int[][] iArr9 = iArr[i25];
                int[] iArr10 = sliceDecoder2.mvTopLeft[i25];
                int[][][] iArr11 = sliceDecoder2.mvTop;
                int i29 = i23 << 2;
                int[] iArr12 = iArr11[i25][i29];
                int[] iArr13 = iArr11[i25][i29 + 1];
                int[] iArr14 = iArr11[i25][i29 + i20];
                int[][][] iArr15 = sliceDecoder2.mvLeft;
                int i30 = i26;
                int i31 = i25;
                BitReader bitReader2 = bitReader;
                pictureArr = pictureArr2;
                boolean z6 = z4;
                c = 2;
                boolean z7 = z3;
                boolean z8 = z3;
                boolean z9 = z2;
                int i32 = i;
                int i33 = i31;
                i3 = i31;
                int i34 = i30;
                decodeSubMb8x8(bitReader2, i34, frameArr2, i27, i28, iArr9, iArr10, iArr12, iArr13, iArr14, iArr15[i25][c7], iArr15[i25][1], z6, z7, z8, z9, iArr[i25][0], iArr[i25][1], iArr[i25][4], iArr[i25][5], iArr4[i25][0], pictureArr2[i25], 0, 0, 0, i32, sliceDecoder2.leftMBType, sliceDecoder2.topMBType[i23], MBType.B_8x8, sliceDecoder2.predModeLeft[0], sliceDecoder2.predModeTop[i24], partPredArr[0], i33);
            } else {
                i3 = i25;
                pictureArr = pictureArr2;
                c = 2;
            }
            int i35 = i3;
            if (partPredArr[1].usesList(i35)) {
                int i36 = H264Const.bSubMbTypes[iArr8[1]];
                Frame[] frameArr3 = frameArr[i35];
                int i37 = i;
                int i38 = (i37 << 6) + 32;
                int i39 = i2 << 6;
                int[][] iArr16 = iArr[i35];
                int[][][] iArr17 = this.mvTop;
                int i40 = i37 << 2;
                int[] iArr18 = iArr17[i35][i40 + 1];
                int[] iArr19 = iArr17[i35][i40 + 2];
                int[] iArr20 = iArr17[i35][i40 + 3];
                int[] iArr21 = iArr17[i35][i40 + 4];
                int[] iArr22 = iArr[i35][1];
                int[] iArr23 = iArr[i35][5];
                int[] iArr24 = iArr[i35][c];
                int[] iArr25 = iArr[i35][3];
                int[] iArr26 = iArr[i35][6];
                int[] iArr27 = iArr[i35][7];
                int i41 = iArr4[i35][1];
                Picture picture2 = pictureArr[i35];
                MBType mBType2 = MBType.B_8x8;
                MBType mBType3 = mBType2;
                i4 = i35;
                decodeSubMb8x8(bitReader, i36, frameArr3, i38, i39, iArr16, iArr18, iArr19, iArr20, iArr21, iArr22, iArr23, z3, z3, z5, true, iArr24, iArr25, iArr26, iArr27, i41, picture2, 8, 2, 0, i, mBType2, this.topMBType[i37], mBType3, partPredArr[0], this.predModeTop[i24 + 1], partPredArr[1], i4);
            } else {
                i4 = i35;
            }
            int i42 = i4;
            if (partPredArr[c].usesList(i42)) {
                int i43 = H264Const.bSubMbTypes[iArr8[c]];
                Frame[] frameArr4 = frameArr[i42];
                int i44 = i << 6;
                int i45 = (i2 << 6) + 32;
                int[][] iArr28 = iArr[i42];
                int[][][] iArr29 = this.mvLeft;
                int[] iArr30 = iArr29[i42][1];
                int[] iArr31 = iArr[i42][4];
                int[] iArr32 = iArr[i42][5];
                int[] iArr33 = iArr[i42][6];
                int[] iArr34 = iArr29[i42][c];
                int[] iArr35 = iArr29[i42][3];
                int[] iArr36 = iArr[i42][8];
                int[] iArr37 = iArr[i42][9];
                int[] iArr38 = iArr[i42][12];
                int[] iArr39 = iArr[i42][13];
                int i46 = iArr4[i42][c];
                Picture picture3 = pictureArr[i42];
                MBType mBType4 = this.leftMBType;
                MBType mBType5 = MBType.B_8x8;
                i5 = i42;
                decodeSubMb8x8(bitReader, i43, frameArr4, i44, i45, iArr28, iArr30, iArr31, iArr32, iArr33, iArr34, iArr35, z2, true, true, z2, iArr36, iArr37, iArr38, iArr39, i46, picture3, 128, 0, 2, i, mBType4, mBType5, mBType5, this.predModeLeft[1], partPredArr[0], partPredArr[c], i5);
            } else {
                i5 = i42;
            }
            int i47 = i5;
            if (partPredArr[3].usesList(i47)) {
                int i48 = H264Const.bSubMbTypes[iArr8[3]];
                Frame[] frameArr5 = frameArr[i47];
                int i49 = (i << 6) + 32;
                int i50 = (i2 << 6) + 32;
                int[][] iArr40 = iArr[i47];
                int[] iArr41 = iArr[i47][5];
                int[] iArr42 = iArr[i47][6];
                int[] iArr43 = iArr[i47][7];
                int[] iArr44 = iArr[i47][9];
                int[] iArr45 = iArr[i47][13];
                int[] iArr46 = iArr[i47][10];
                int[] iArr47 = iArr[i47][11];
                int[] iArr48 = iArr[i47][14];
                int[] iArr49 = iArr[i47][15];
                int i51 = iArr4[i47][3];
                Picture picture4 = pictureArr[i47];
                MBType mBType6 = MBType.B_8x8;
                MBType mBType7 = mBType6;
                i6 = i47;
                decodeSubMb8x8(bitReader, i48, frameArr5, i49, i50, iArr40, iArr41, iArr42, iArr43, null, iArr44, iArr45, true, true, false, true, iArr46, iArr47, iArr48, iArr49, i51, picture4, C13959t.f40863Y1, 2, 2, i, mBType7, mBType6, mBType6, partPredArr[c], partPredArr[1], partPredArr[3], i6);
            } else {
                i6 = i47;
            }
            i25 = i6 + 1;
            i23 = i;
            pictureArr2 = pictureArr;
            c7 = 0;
            i20 = 2;
            sliceDecoder2 = this;
        }
        Picture[] pictureArr3 = pictureArr2;
        for (int i52 = 0; i52 < 4; i52++) {
            int i53 = H264Const.BLK8x8_BLOCKS[i52][0];
            this.prediction.mergePrediction(iArr[0][i53][2], iArr[1][i53][2], partPredArr[i52], 0, pictureArr3[0].getPlaneData(0), pictureArr3[1].getPlaneData(0), H264Const.BLK_8x8_MB_OFF_LUMA[i52], 16, 8, 8, picture.getPlaneData(0), frameArr, this.thisFrame);
        }
        PartPred[] partPredArr5 = this.predModeLeft;
        partPredArr5[0] = partPredArr[1];
        PartPred[] partPredArr6 = this.predModeTop;
        partPredArr6[i24] = partPredArr[2];
        int i54 = i24 + 1;
        PartPred partPred = partPredArr[3];
        partPredArr6[i54] = partPred;
        partPredArr5[1] = partPred;
        int i55 = i;
        savePrediction8x8(i55, iArr[0], 0);
        savePrediction8x8(i55, iArr[1], 1);
        for (int i56 = 0; i56 < 4; i56++) {
            if (partPredArr[i56] == PartPred.Direct) {
                partPredArr[i56] = partPredArr4[i56];
            }
        }
        int[] iArr50 = H264Const.bSubMbTypes;
        if (iArr50[iArr8[0]] == 0 && iArr50[iArr8[1]] == 0 && iArr50[iArr8[2]] == 0 && iArr50[iArr8[3]] == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r105v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r105v2 */
    /* JADX WARNING: type inference failed for: r105v3 */
    /* JADX WARNING: type inference failed for: r105v4 */
    /* JADX WARNING: type inference failed for: r105v5 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r105v0, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 265
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean predict8x8P(org.jcodec.common.p554io.BitReader r111, org.jcodec.common.model.Picture[] r112, org.jcodec.common.model.Picture r113, boolean r114, int r115, int r116, boolean r117, boolean r118, boolean r119, boolean r120, int[][][] r121, org.jcodec.codecs.h264.H264Const.PartPred[] r122) {
        /*
            r110 = this;
            r15 = r110
            r14 = r115
            r13 = 4
            int[] r12 = new int[r13]
            r11 = 0
            r0 = 0
        L_0x0009:
            if (r0 >= r13) goto L_0x0014
            int r1 = r110.readSubMBTypeP(r111)
            r12[r0] = r1
            int r0 = r0 + 1
            goto L_0x0009
        L_0x0014:
            org.jcodec.codecs.h264.H264Const$PartPred r0 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r1 = r122
            java.util.Arrays.fill(r1, r0)
            int r102 = r14 << 1
            int[] r10 = new int[r13]
            int[] r0 = r15.numRef
            r0 = r0[r11]
            r103 = 3
            r104 = 2
            r9 = 1
            if (r0 <= r9) goto L_0x00aa
            if (r114 != 0) goto L_0x00aa
            org.jcodec.codecs.h264.io.model.MBType r4 = r15.leftMBType
            org.jcodec.codecs.h264.io.model.MBType[] r0 = r15.topMBType
            r5 = r0[r14]
            org.jcodec.codecs.h264.H264Const$PartPred r8 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r16 = 0
            r17 = 0
            r18 = 2
            r19 = 2
            r20 = 0
            r0 = r110
            r1 = r111
            r2 = r117
            r3 = r118
            r6 = r8
            r7 = r8
            r105 = 1
            r9 = r115
            r106 = r10
            r10 = r16
            r11 = r17
            r108 = r12
            r12 = r18
            r68 = 4
            r13 = r19
            r14 = r20
            int r0 = r0.readRefIdx(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            r106[r14] = r0
            r2 = 1
            org.jcodec.codecs.h264.io.model.MBType r4 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            org.jcodec.codecs.h264.io.model.MBType[] r0 = r15.topMBType
            r13 = r115
            r5 = r0[r13]
            org.jcodec.codecs.h264.H264Const$PartPred r8 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r10 = 2
            r11 = 0
            r12 = 2
            r16 = 2
            r0 = r110
            r6 = r8
            r7 = r8
            r13 = r16
            r14 = r17
            int r0 = r0.readRefIdx(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r106[r105] = r0
            r3 = 1
            org.jcodec.codecs.h264.io.model.MBType r4 = r15.leftMBType
            org.jcodec.codecs.h264.io.model.MBType r5 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            org.jcodec.codecs.h264.H264Const$PartPred r8 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r10 = 0
            r11 = 2
            r13 = 2
            r14 = 0
            r0 = r110
            r2 = r117
            r6 = r8
            r7 = r8
            int r0 = r0.readRefIdx(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r106[r104] = r0
            r2 = 1
            org.jcodec.codecs.h264.io.model.MBType r5 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            org.jcodec.codecs.h264.H264Const$PartPred r8 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r10 = 2
            r0 = r110
            r4 = r5
            r6 = r8
            r7 = r8
            int r0 = r0.readRefIdx(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r106[r103] = r0
            goto L_0x00b2
        L_0x00aa:
            r106 = r10
            r108 = r12
            r68 = 4
            r105 = 1
        L_0x00b2:
            r14 = 0
            r2 = r108[r14]
            r13 = r115
            int r34 = r13 << 6
            r72 = r34
            r4 = r34
            r107 = 6
            int r69 = r116 << 6
            r39 = r69
            r5 = r69
            r6 = r121[r14]
            int[][] r0 = r15.mvTopLeft
            r7 = r0[r14]
            int[][][] r0 = r15.mvTop
            r1 = r0[r14]
            int r35 = r13 << 2
            r8 = r1[r35]
            r1 = r0[r14]
            int r37 = r35 + 1
            r9 = r1[r37]
            r0 = r0[r14]
            int r42 = r35 + 2
            r10 = r0[r42]
            int[][][] r0 = r15.mvLeft
            r1 = r0[r14]
            r11 = r1[r14]
            r0 = r0[r14]
            r12 = r0[r105]
            r0 = r121[r14]
            r17 = r0[r14]
            r0 = r121[r14]
            r18 = r0[r105]
            r0 = r121[r14]
            r19 = r0[r68]
            r0 = r121[r14]
            r109 = 5
            r20 = r0[r109]
            r21 = r106[r14]
            r23 = 0
            r24 = 0
            r25 = 0
            org.jcodec.codecs.h264.io.model.MBType r0 = r15.leftMBType
            r27 = r0
            org.jcodec.codecs.h264.io.model.MBType[] r0 = r15.topMBType
            r28 = r0[r13]
            org.jcodec.codecs.h264.io.model.MBType r29 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            org.jcodec.codecs.h264.H264Const$PartPred r0 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r30 = r0
            r32 = r0
            r31 = r0
            r33 = 0
            r0 = r110
            r1 = r111
            r3 = r112
            r13 = r119
            r14 = r118
            r15 = r118
            r16 = r117
            r22 = r113
            r26 = r115
            r0.decodeSubMb8x8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r36 = r108[r105]
            int r0 = r34 + 32
            r4 = r0
            r38 = r0
            r3 = 0
            r40 = r121[r3]
            r1 = r110
            int[][][] r0 = r1.mvTop
            r2 = r0[r3]
            r41 = r2[r37]
            r2 = r0[r3]
            r42 = r2[r42]
            r2 = r0[r3]
            int r5 = r35 + 3
            r43 = r2[r5]
            r0 = r0[r3]
            int r35 = r35 + 4
            r44 = r0[r35]
            r0 = r121[r3]
            r45 = r0[r105]
            r0 = r121[r3]
            r46 = r0[r109]
            r50 = 1
            r0 = r121[r3]
            r51 = r0[r104]
            r0 = r121[r3]
            r52 = r0[r103]
            r0 = r121[r3]
            r53 = r0[r107]
            r0 = r121[r3]
            r9 = 7
            r54 = r0[r9]
            r55 = r106[r105]
            r57 = 8
            r58 = 2
            r59 = 0
            org.jcodec.codecs.h264.io.model.MBType r63 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            r61 = r63
            org.jcodec.codecs.h264.io.model.MBType[] r0 = r1.topMBType
            r15 = r115
            r62 = r0[r15]
            org.jcodec.codecs.h264.H264Const$PartPred r66 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r65 = r66
            r64 = r66
            r67 = 0
            r34 = r110
            r35 = r111
            r37 = r112
            r47 = r118
            r48 = r118
            r49 = r120
            r56 = r113
            r60 = r115
            r34.decodeSubMb8x8(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r70 = r108[r104]
            int r0 = r69 + 32
            r5 = r0
            r73 = r0
            r74 = r121[r3]
            int[][][] r0 = r1.mvLeft
            r2 = r0[r3]
            r75 = r2[r105]
            r2 = r121[r3]
            r76 = r2[r68]
            r2 = r121[r3]
            r77 = r2[r109]
            r2 = r121[r3]
            r78 = r2[r107]
            r2 = r0[r3]
            r79 = r2[r104]
            r0 = r0[r3]
            r80 = r0[r103]
            r82 = 1
            r83 = 1
            r0 = r121[r3]
            r2 = 8
            r85 = r0[r2]
            r0 = r121[r3]
            r11 = 9
            r86 = r0[r11]
            r0 = r121[r3]
            r2 = 12
            r87 = r0[r2]
            r0 = r121[r3]
            r12 = 13
            r88 = r0[r12]
            r89 = r106[r104]
            r91 = 128(0x80, float:1.794E-43)
            r92 = 0
            r93 = 2
            org.jcodec.codecs.h264.io.model.MBType r0 = r1.leftMBType
            r95 = r0
            org.jcodec.codecs.h264.io.model.MBType r0 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            r97 = r0
            r96 = r0
            org.jcodec.codecs.h264.H264Const$PartPred r100 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r99 = r100
            r98 = r100
            r101 = 0
            r68 = r110
            r69 = r111
            r71 = r112
            r81 = r117
            r84 = r117
            r90 = r113
            r94 = r115
            r68.decodeSubMb8x8(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101)
            r2 = r108[r103]
            r6 = r121[r3]
            r0 = r121[r3]
            r7 = r0[r109]
            r0 = r121[r3]
            r8 = r0[r107]
            r0 = r121[r3]
            r9 = r0[r9]
            r10 = 0
            r0 = r121[r3]
            r11 = r0[r11]
            r0 = r121[r3]
            r12 = r0[r12]
            r13 = 1
            r14 = 1
            r0 = 0
            r15 = r0
            r16 = 1
            r0 = r121[r3]
            r17 = 10
            r17 = r0[r17]
            r0 = r121[r3]
            r18 = 11
            r18 = r0[r18]
            r0 = r121[r3]
            r19 = 14
            r19 = r0[r19]
            r0 = r121[r3]
            r20 = 15
            r20 = r0[r20]
            r21 = r106[r103]
            r23 = 136(0x88, float:1.9E-43)
            r24 = 2
            r25 = 2
            org.jcodec.codecs.h264.io.model.MBType r0 = org.jcodec.codecs.h264.p552io.model.MBType.P_8x8
            r27 = r0
            r29 = r0
            r28 = r0
            org.jcodec.codecs.h264.H264Const$PartPred r32 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r31 = r32
            r30 = r32
            r0 = r110
            r1 = r111
            r3 = r112
            r0.decodeSubMb8x8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = 0
            r1 = r121[r0]
            r2 = r110
            r3 = r115
            r2.savePrediction8x8(r3, r1, r0)
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = r2.predModeLeft
            org.jcodec.codecs.h264.H264Const$PartPred[] r3 = r2.predModeTop
            int r4 = r102 + 1
            org.jcodec.codecs.h264.H264Const$PartPred r5 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r3[r4] = r5
            r3[r102] = r5
            r1[r105] = r5
            r1[r0] = r5
            r1 = r108[r0]
            if (r1 != 0) goto L_0x0281
            r1 = r108[r105]
            if (r1 != 0) goto L_0x0281
            r1 = r108[r104]
            if (r1 != 0) goto L_0x0281
            r1 = r108[r103]
            if (r1 != 0) goto L_0x0281
            goto L_0x0283
        L_0x0281:
            r105 = 0
        L_0x0283:
            return r105
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.SliceDecoder.predict8x8P(org.jcodec.common.io.BitReader, org.jcodec.common.model.Picture[], org.jcodec.common.model.Picture, boolean, int, int, boolean, boolean, boolean, boolean, int[][][], org.jcodec.codecs.h264.H264Const$PartPred[]):boolean");
    }

    private void predictBSpatialDirect(Frame[][] frameArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int[][][] iArr, PartPred[] partPredArr, Picture picture, int[] iArr2) {
        int i3;
        int i4;
        String str;
        SliceDecoder sliceDecoder;
        String str2;
        int i5;
        String str3;
        String str4;
        int[] iArr3;
        SliceDecoder sliceDecoder2 = this;
        int[][][] iArr4 = iArr;
        Picture picture2 = picture;
        int[] iArr5 = iArr2;
        int[][][] iArr6 = sliceDecoder2.mvLeft;
        int i6 = 0;
        int[] iArr7 = iArr6[0][0];
        int[] iArr8 = iArr6[1][0];
        int[][][] iArr9 = sliceDecoder2.mvTop;
        int i7 = i << 2;
        int[] iArr10 = iArr9[0][i7];
        int[] iArr11 = iArr9[1][i7];
        int i8 = i7 + 4;
        int[] iArr12 = iArr9[0][i8];
        int[] iArr13 = iArr9[1][i8];
        int[][] iArr14 = sliceDecoder2.mvTopLeft;
        int[] iArr15 = iArr14[0];
        int[] iArr16 = iArr14[1];
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        int i9 = i;
        int calcRef = calcRef(iArr7, iArr10, iArr12, iArr15, z5, z6, z7, z8, i9);
        int calcRef2 = calcRef(iArr8, iArr11, iArr13, iArr16, z5, z6, z7, z8, i9);
        Picture create = Picture.create(16, 16, sliceDecoder2.chromaFormat);
        Picture create2 = Picture.create(16, 16, sliceDecoder2.chromaFormat);
        String str5 = "DIRECT_8x8 [";
        String str6 = ", ";
        if (calcRef >= 0 || calcRef2 >= 0) {
            Picture picture3 = create;
            Picture picture4 = create2;
            String str7 = str6;
            String str8 = str5;
            int[] iArr17 = iArr7;
            int[] iArr18 = iArr10;
            int[] iArr19 = iArr12;
            int[] iArr20 = iArr15;
            boolean z9 = z;
            boolean z10 = z2;
            boolean z11 = z4;
            boolean z12 = z3;
            int i10 = calcRef2;
            int i11 = calcRef;
            int calcMVPredictionMedian = calcMVPredictionMedian(iArr17, iArr18, iArr19, iArr20, z9, z10, z11, z12, calcRef, 0);
            int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr17, iArr18, iArr19, iArr20, z9, z10, z11, z12, i11, 1);
            int[] iArr21 = iArr8;
            int[] iArr22 = iArr11;
            int[] iArr23 = iArr13;
            int[] iArr24 = iArr16;
            int i12 = i10;
            int calcMVPredictionMedian3 = calcMVPredictionMedian(iArr21, iArr22, iArr23, iArr24, z9, z10, z11, z12, i12, 0);
            int calcMVPredictionMedian4 = calcMVPredictionMedian(iArr21, iArr22, iArr23, iArr24, z9, z10, z11, z12, i12, 1);
            char c = 0;
            Frame frame = frameArr[1][0];
            int i13 = i11;
            PartPred partPred = (i13 < 0 || i12 < 0) ? i13 >= 0 ? PartPred.L0 : PartPred.L1 : PartPred.Bi;
            int[] iArr25 = iArr2;
            PartPred partPred2 = partPred;
            int length = iArr25.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = iArr25[i14];
                int[][] iArr26 = H264Const.BLK8x8_BLOCKS;
                int i16 = iArr26[i15][c];
                boolean z13 = sliceDecoder2.activeSps.direct_8x8_inference_flag;
                String str9 = ")";
                String str10 = "), (";
                String str11 = "]: (";
                String str12 = ",";
                if (!z13) {
                    int[] iArr27 = iArr26[i15];
                    int length2 = iArr27.length;
                    int i17 = 0;
                    while (i17 < length2) {
                        int i18 = iArr27[i17];
                        int i19 = i17;
                        int i20 = length2;
                        String str13 = str12;
                        String str14 = str11;
                        String str15 = str10;
                        String str16 = str9;
                        int[] iArr28 = iArr27;
                        int i21 = i14;
                        int i22 = length;
                        int i23 = i12;
                        int i24 = i13;
                        String str17 = str7;
                        String str18 = str8;
                        pred4x4(i, i2, iArr, partPredArr, i13, i12, calcMVPredictionMedian, calcMVPredictionMedian2, calcMVPredictionMedian3, calcMVPredictionMedian4, frame, partPred2, i18);
                        int i25 = i18 & 3;
                        int i26 = i18 >> 2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("DIRECT_4x4 [");
                        sb.append(i26);
                        sb.append(str17);
                        sb.append(i25);
                        sb.append(str14);
                        int[][][] iArr29 = iArr;
                        sb.append(iArr29[0][i18][0]);
                        String str19 = str13;
                        sb.append(str19);
                        sb.append(iArr29[0][i18][1]);
                        sb.append(str19);
                        int i27 = i24;
                        sb.append(i27);
                        String str20 = str15;
                        sb.append(str20);
                        sb.append(iArr29[1][i18][0]);
                        sb.append(str19);
                        sb.append(iArr29[1][i18][1]);
                        sb.append(str19);
                        i12 = i23;
                        sb.append(i12);
                        String str21 = str16;
                        sb.append(str21);
                        String str22 = str19;
                        debugPrint(sb.toString());
                        int i28 = (i25 << 4) + (i << 6);
                        int i29 = (i26 << 4) + (i2 << 6);
                        if (i27 >= 0) {
                            str4 = str22;
                            str3 = str21;
                            BlockInterpolator.getBlockLuma(frameArr[0][i27], picture3, H264Const.BLK_4x4_MB_OFF_LUMA[i18], i28 + iArr29[0][i18][0], i29 + iArr29[0][i18][1], 4, 4);
                        } else {
                            str4 = str22;
                            str3 = str21;
                        }
                        if (i12 >= 0) {
                            BlockInterpolator.getBlockLuma(frameArr[1][i12], picture4, H264Const.BLK_4x4_MB_OFF_LUMA[i18], i28 + iArr29[1][i18][0], i29 + iArr29[1][i18][1], 4, 4);
                        }
                        i17 = i19 + 1;
                        int[] iArr30 = iArr2;
                        str10 = str20;
                        i13 = i27;
                        str11 = str14;
                        str7 = str17;
                        length2 = i20;
                        iArr27 = iArr28;
                        i14 = i21;
                        length = i22;
                        str12 = str4;
                        str9 = str3;
                        iArr4 = iArr29;
                        str8 = str18;
                    }
                    i4 = i14;
                    i3 = length;
                    str2 = str7;
                    str = str8;
                    i5 = 0;
                    iArr4 = iArr4;
                    sliceDecoder = this;
                } else {
                    String str23 = str9;
                    i4 = i14;
                    i3 = length;
                    int i30 = i13;
                    String str24 = str8;
                    String str25 = str12;
                    int[][][] iArr31 = iArr4;
                    String str26 = str10;
                    String str27 = str7;
                    String str28 = str11;
                    int i31 = i15;
                    int i32 = H264Const.BLK_INV_MAP[i15 * 5];
                    int i33 = i12;
                    String str29 = str26;
                    int i34 = i30;
                    String str30 = str27;
                    iArr4 = iArr31;
                    pred4x4(i, i2, iArr, partPredArr, i30, i12, calcMVPredictionMedian, calcMVPredictionMedian2, calcMVPredictionMedian3, calcMVPredictionMedian4, frame, partPred2, i32);
                    sliceDecoder = this;
                    sliceDecoder.propagatePred(iArr4, i31, i32);
                    int i35 = i16 & 3;
                    int i36 = i16 >> 2;
                    StringBuilder sb2 = new StringBuilder();
                    str = str24;
                    sb2.append(str);
                    sb2.append(i36);
                    str2 = str30;
                    sb2.append(str2);
                    sb2.append(i35);
                    sb2.append(str28);
                    i5 = 0;
                    sb2.append(iArr4[0][i16][0]);
                    String str31 = str25;
                    sb2.append(str31);
                    sb2.append(iArr4[0][i16][1]);
                    sb2.append(str31);
                    i13 = i34;
                    sb2.append(i13);
                    sb2.append(str29);
                    sb2.append(iArr4[1][i16][0]);
                    sb2.append(str31);
                    sb2.append(iArr4[1][i16][1]);
                    sb2.append(str31);
                    i12 = i33;
                    sb2.append(i12);
                    sb2.append(str23);
                    sliceDecoder.debugPrint(sb2.toString());
                    int i37 = (i35 << 4) + (i << 6);
                    int i38 = (i36 << 4) + (i2 << 6);
                    if (i13 >= 0) {
                        BlockInterpolator.getBlockLuma(frameArr[0][i13], picture3, H264Const.BLK_4x4_MB_OFF_LUMA[i16], i37 + iArr4[0][i16][0], i38 + iArr4[0][i16][1], 8, 8);
                    }
                    if (i12 >= 0) {
                        BlockInterpolator.getBlockLuma(frameArr[1][i12], picture4, H264Const.BLK_4x4_MB_OFF_LUMA[i16], i37 + iArr4[1][i16][0], i38 + iArr4[1][i16][1], 8, 8);
                    }
                }
                Prediction prediction2 = sliceDecoder.prediction;
                int i39 = iArr4[i5][i16][2];
                int i40 = iArr4[1][i16][2];
                PartPred partPred3 = i13 >= 0 ? i12 >= 0 ? PartPred.Bi : PartPred.L0 : PartPred.L1;
                Picture picture5 = picture3;
                int[] planeData = picture5.getPlaneData(i5);
                Picture picture6 = picture4;
                int[] planeData2 = picture6.getPlaneData(i5);
                Picture picture7 = picture6;
                int i41 = H264Const.BLK_4x4_MB_OFF_LUMA[i16];
                Picture picture8 = picture5;
                int i42 = i12;
                int i43 = i13;
                String str32 = str2;
                prediction2.mergePrediction(i39, i40, partPred3, 0, planeData, planeData2, i41, 16, 8, 8, picture.getPlaneData(i5), frameArr, sliceDecoder.thisFrame);
                i14 = i4 + 1;
                iArr25 = iArr2;
                str8 = str;
                picture3 = picture8;
                i12 = i42;
                i13 = i43;
                str7 = str32;
                picture4 = picture7;
                length = i3;
                c = 0;
                sliceDecoder2 = this;
            }
            return;
        }
        int length3 = iArr5.length;
        int i44 = 0;
        while (i44 < length3) {
            int i45 = iArr5[i44];
            for (int i46 : H264Const.BLK8x8_BLOCKS[i45]) {
                int[] iArr32 = iArr4[i6][i46];
                int[] iArr33 = iArr4[i6][i46];
                int[] iArr34 = iArr4[i6][i46];
                int[] iArr35 = iArr4[1][i46];
                int[] iArr36 = iArr4[1][i46];
                iArr4[1][i46][2] = i6;
                iArr36[1] = i6;
                iArr35[i6] = i6;
                iArr34[2] = i6;
                iArr33[1] = i6;
                iArr32[i6] = i6;
            }
            partPredArr[i45] = PartPred.Bi;
            int i47 = (i << 6) + ((i45 & 1) << 5);
            int i48 = (i2 << 6) + ((i45 >> 1) << 5);
            String str33 = str6;
            String str34 = str5;
            BlockInterpolator.getBlockLuma(frameArr[i6][i6], create, H264Const.BLK_8x8_MB_OFF_LUMA[i45], i47, i48, 8, 8);
            BlockInterpolator.getBlockLuma(frameArr[1][i6], create2, H264Const.BLK_8x8_MB_OFF_LUMA[i45], i47, i48, 8, 8);
            Picture picture9 = create;
            Picture picture10 = create2;
            int i49 = i44;
            int i50 = length3;
            sliceDecoder2.prediction.mergePrediction(0, 0, PartPred.Bi, 0, create.getPlaneData(i6), create2.getPlaneData(i6), H264Const.BLK_8x8_MB_OFF_LUMA[i45], 16, 8, 8, picture2.getPlaneData(i6), frameArr, sliceDecoder2.thisFrame);
            StringBuilder sb3 = new StringBuilder();
            String str35 = str34;
            sb3.append(str35);
            sb3.append(i45 & 2);
            String str36 = str33;
            sb3.append(str36);
            sb3.append((i45 << 1) & 2);
            sb3.append("]: (0,0,0), (0,0,0)");
            sliceDecoder2.debugPrint(sb3.toString());
            i44 = i49 + 1;
            str6 = str36;
            str5 = str35;
            length3 = i50;
            create = picture9;
            create2 = picture10;
            i6 = 0;
            picture2 = picture;
            iArr5 = iArr2;
        }
    }

    private void predictBTemporalDirect(Frame[][] frameArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int[][][] iArr, PartPred[] partPredArr, Picture picture, int[] iArr2) {
        Picture picture2;
        Picture picture3;
        int i3;
        int i4;
        int i5;
        int[][][] iArr3 = iArr;
        int[] iArr4 = iArr2;
        Picture create = Picture.create(16, 16, this.chromaFormat);
        Picture create2 = Picture.create(16, 16, this.chromaFormat);
        int length = iArr4.length;
        char c = 0;
        int i6 = 0;
        while (i6 < length) {
            int i7 = iArr4[i6];
            int i8 = H264Const.BLK8x8_BLOCKS[i7][c];
            partPredArr[i7] = PartPred.Bi;
            String str = ")";
            String str2 = "), (";
            String str3 = "]: (";
            String str4 = ", ";
            String str5 = ",";
            if (!this.activeSps.direct_8x8_inference_flag) {
                int[] iArr5 = H264Const.BLK8x8_BLOCKS[i7];
                int length2 = iArr5.length;
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = iArr5[i9];
                    int i11 = i9;
                    int i12 = length2;
                    Picture picture4 = create2;
                    String str6 = str5;
                    String str7 = str4;
                    String str8 = str3;
                    int i13 = length;
                    String str9 = str2;
                    predTemp4x4(frameArr, i, i2, iArr, i10);
                    int i14 = i10 & 3;
                    int i15 = i10 >> 2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRECT_4x4 [");
                    sb.append(i15);
                    sb.append(str7);
                    sb.append(i14);
                    sb.append(str8);
                    sb.append(iArr3[0][i10][0]);
                    sb.append(str6);
                    sb.append(iArr3[0][i10][1]);
                    sb.append(str6);
                    sb.append(iArr3[0][i10][2]);
                    sb.append(str9);
                    sb.append(iArr3[1][i10][0]);
                    sb.append(str6);
                    sb.append(iArr3[1][i10][1]);
                    sb.append(str6);
                    sb.append(iArr3[1][i10][2]);
                    sb.append(str);
                    debugPrint(sb.toString());
                    int i16 = (i << 6) + (i14 << 4);
                    int i17 = (i2 << 6) + (i15 << 4);
                    Frame frame = frameArr[0][iArr3[0][i10][2]];
                    int[] iArr6 = iArr5;
                    Frame frame2 = frame;
                    String str10 = str;
                    int i18 = i6;
                    int i19 = H264Const.BLK_4x4_MB_OFF_LUMA[i10];
                    String str11 = str7;
                    int i20 = iArr3[0][i10][0] + i16;
                    str2 = str9;
                    int i21 = i13;
                    Picture picture5 = picture4;
                    String str12 = str6;
                    Picture picture6 = create;
                    BlockInterpolator.getBlockLuma(frame2, create, i19, i20, i17 + iArr3[0][i10][1], 4, 4);
                    BlockInterpolator.getBlockLuma(frameArr[1][0], picture5, H264Const.BLK_4x4_MB_OFF_LUMA[i10], i16 + iArr3[1][i10][0], i17 + iArr3[1][i10][1], 4, 4);
                    i9 = i11 + 1;
                    create = picture6;
                    create2 = picture5;
                    str = str10;
                    str4 = str11;
                    str3 = str8;
                    length2 = i12;
                    iArr5 = iArr6;
                    i6 = i18;
                    length = i21;
                    str5 = str12;
                    int[] iArr7 = iArr2;
                }
                i4 = i6;
                i3 = length;
                picture2 = create2;
                picture3 = create;
                i5 = 0;
            } else {
                String str13 = str5;
                String str14 = str3;
                i4 = i6;
                i3 = length;
                picture2 = create2;
                picture3 = create;
                String str15 = str4;
                String str16 = str;
                int i22 = H264Const.BLK_INV_MAP[i7 * 5];
                String str17 = str16;
                String str18 = str15;
                String str19 = str2;
                predTemp4x4(frameArr, i, i2, iArr, i22);
                propagatePred(iArr3, i7, i22);
                int i23 = i8 & 3;
                int i24 = i8 >> 2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DIRECT_8x8 [");
                sb2.append(i24);
                sb2.append(str18);
                sb2.append(i23);
                sb2.append(str14);
                sb2.append(iArr3[0][i8][0]);
                String str20 = str13;
                sb2.append(str20);
                sb2.append(iArr3[0][i8][1]);
                sb2.append(str20);
                sb2.append(iArr3[0][i8][2]);
                sb2.append(str19);
                sb2.append(iArr3[1][i8][0]);
                sb2.append(str20);
                sb2.append(iArr3[1][i8][1]);
                sb2.append(str20);
                sb2.append(iArr3[0][i8][2]);
                sb2.append(str17);
                debugPrint(sb2.toString());
                int i25 = (i << 6) + (i23 << 4);
                int i26 = (i2 << 6) + (i24 << 4);
                i5 = 0;
                BlockInterpolator.getBlockLuma(frameArr[0][iArr3[0][i8][2]], picture3, H264Const.BLK_4x4_MB_OFF_LUMA[i8], i25 + iArr3[0][i8][0], i26 + iArr3[0][i8][1], 8, 8);
                BlockInterpolator.getBlockLuma(frameArr[1][0], picture2, H264Const.BLK_4x4_MB_OFF_LUMA[i8], i25 + iArr3[1][i8][0], i26 + iArr3[1][i8][1], 8, 8);
            }
            Picture picture7 = picture3;
            Picture picture8 = picture2;
            this.prediction.mergePrediction(iArr3[i5][i8][2], iArr3[1][i8][2], PartPred.Bi, 0, picture7.getPlaneData(i5), picture8.getPlaneData(i5), H264Const.BLK_4x4_MB_OFF_LUMA[i8], 16, 8, 8, picture.getPlaneData(i5), frameArr, this.thisFrame);
            i6 = i4 + 1;
            iArr3 = iArr;
            iArr4 = iArr2;
            create = picture7;
            create2 = picture8;
            length = i3;
            c = 0;
        }
    }

    private void predictInter16x16(BitReader bitReader, Picture picture, Picture[][] pictureArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int[][][] iArr, int i3, int[] iArr2, int i4, PartPred partPred) {
        int i5;
        int i6;
        SliceDecoder sliceDecoder;
        int i7;
        int i8 = i4;
        int i9 = i << 1;
        if (partPred.usesList(i8)) {
            int[] iArr3 = this.mvLeft[i8][0];
            int[][][] iArr4 = this.mvTop;
            int i10 = i << 2;
            int i11 = i10 + 4;
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z4;
            boolean z8 = z3;
            int calcMVPredictionMedian = calcMVPredictionMedian(iArr3, iArr4[i8][i10], iArr4[i8][i11], this.mvTopLeft[i8], z5, z6, z7, z8, iArr2[i8], 0);
            int[] iArr5 = this.mvLeft[i8][0];
            int[][][] iArr6 = this.mvTop;
            int i12 = calcMVPredictionMedian;
            int calcMVPredictionMedian2 = calcMVPredictionMedian(iArr5, iArr6[i8][i10], iArr6[i8][i11], this.mvTopLeft[i8], z5, z6, z7, z8, iArr2[i8], 1);
            BitReader bitReader2 = bitReader;
            boolean z9 = z;
            boolean z10 = z2;
            PartPred partPred2 = partPred;
            int i13 = i;
            int i14 = calcMVPredictionMedian2;
            int i15 = i12;
            int readMVD = readMVD(bitReader2, 0, z9, z10, this.leftMBType, this.topMBType[i], this.predModeLeft[0], this.predModeTop[i9], partPred2, i13, 0, 0, 4, 4, i4);
            int i16 = readMVD;
            int readMVD2 = readMVD(bitReader2, 1, z9, z10, this.leftMBType, this.topMBType[i], this.predModeLeft[0], this.predModeTop[i9], partPred2, i13, 0, 0, 4, 4, i4);
            int i17 = i15;
            int i18 = i16;
            i5 = i18 + i17;
            int i19 = i14;
            i6 = readMVD2 + i19;
            StringBuilder sb = new StringBuilder();
            sb.append("MVP: (");
            sb.append(i17);
            String str = ", ";
            sb.append(str);
            sb.append(i19);
            sb.append("), MVD: (");
            sb.append(i18);
            sb.append(str);
            sb.append(readMVD2);
            sb.append("), MV: (");
            sb.append(i5);
            String str2 = ",";
            sb.append(str2);
            sb.append(i6);
            sb.append(str2);
            sb.append(iArr2[i4]);
            sb.append(")");
            sliceDecoder = this;
            sliceDecoder.debugPrint(sb.toString());
            i7 = iArr2[i4];
            BlockInterpolator.getBlockLuma(pictureArr[i4][i7], picture, 0, (i << 6) + i5, (i2 << 6) + i6, 16, 16);
        } else {
            sliceDecoder = this;
            i7 = -1;
            i6 = 0;
            i5 = 0;
        }
        sliceDecoder.copyVect(sliceDecoder.mvTopLeft[i4], sliceDecoder.mvTop[i4][i3 + 3]);
        int i20 = i5;
        int i21 = i6;
        int i22 = i7;
        saveVect(sliceDecoder.mvTop[i4], i3, i3 + 4, i20, i21, i22);
        saveVect(sliceDecoder.mvLeft[i4], 0, 4, i20, i21, i22);
        int[] iArr7 = {i5, i6, i7};
        iArr[i4] = new int[][]{iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7, iArr7};
    }

    private void predictInter16x8(BitReader bitReader, Picture picture, Picture[][] pictureArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int[] iArr, int[] iArr2, int[][][] iArr3, PartPred partPred, PartPred partPred2, int i4) {
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int[] iArr4;
        int i8;
        SliceDecoder sliceDecoder;
        int i9;
        int i10;
        int i11;
        SliceDecoder sliceDecoder2 = this;
        int i12 = i << 1;
        String str6 = ")";
        String str7 = "), MV: (";
        String str8 = "), MVD: (";
        String str9 = "MVP: (";
        String str10 = ",";
        String str11 = ", ";
        if (partPred.usesList(i4)) {
            BitReader bitReader2 = bitReader;
            boolean z5 = z;
            boolean z6 = z2;
            String str12 = str11;
            String str13 = str10;
            String str14 = str9;
            PartPred partPred3 = partPred;
            String str15 = str8;
            int i13 = i;
            String str16 = str7;
            String str17 = str6;
            int readMVD = readMVD(bitReader2, 0, z5, z6, sliceDecoder2.leftMBType, sliceDecoder2.topMBType[i], sliceDecoder2.predModeLeft[0], sliceDecoder2.predModeTop[i12], partPred3, i13, 0, 0, 4, 2, i4);
            int i14 = readMVD;
            int readMVD2 = readMVD(bitReader2, 1, z5, z6, this.leftMBType, this.topMBType[i], this.predModeLeft[0], this.predModeTop[i12], partPred3, i13, 0, 0, 4, 2, i4);
            sliceDecoder2 = this;
            int[] iArr5 = sliceDecoder2.mvLeft[i4][0];
            int[][][] iArr6 = sliceDecoder2.mvTop;
            int i15 = i << 2;
            int i16 = i15 + 4;
            boolean z7 = z;
            boolean z8 = z2;
            boolean z9 = z4;
            boolean z10 = z3;
            int calcMVPrediction16x8Top = calcMVPrediction16x8Top(iArr5, iArr6[i4][i15], iArr6[i4][i16], sliceDecoder2.mvTopLeft[i4], z7, z8, z9, z10, iArr[i4], 0);
            int[] iArr7 = sliceDecoder2.mvLeft[i4][0];
            int[][][] iArr8 = sliceDecoder2.mvTop;
            int calcMVPrediction16x8Top2 = calcMVPrediction16x8Top(iArr7, iArr8[i4][i15], iArr8[i4][i16], sliceDecoder2.mvTopLeft[i4], z7, z8, z9, z10, iArr[i4], 1);
            int i17 = i14;
            int i18 = i17 + calcMVPrediction16x8Top;
            int i19 = readMVD2 + calcMVPrediction16x8Top2;
            StringBuilder sb = new StringBuilder();
            str2 = str14;
            sb.append(str2);
            sb.append(calcMVPrediction16x8Top);
            str = str12;
            sb.append(str);
            sb.append(calcMVPrediction16x8Top2);
            str3 = str15;
            sb.append(str3);
            sb.append(i17);
            sb.append(str);
            sb.append(readMVD2);
            str7 = str16;
            sb.append(str7);
            sb.append(i18);
            str4 = str13;
            sb.append(str4);
            sb.append(i19);
            sb.append(str4);
            sb.append(iArr[i4]);
            str5 = str17;
            sb.append(str5);
            sliceDecoder2.debugPrint(sb.toString());
            BlockInterpolator.getBlockLuma(pictureArr[i4][iArr[i4]], picture, 0, (i << 6) + i18, (i2 << 6) + i19, 16, 8);
            i5 = iArr[i4];
            i7 = i18;
            i6 = i19;
        } else {
            str = str11;
            str2 = str9;
            str5 = str6;
            str3 = str8;
            str4 = str10;
            i7 = 0;
            i6 = 0;
            i5 = -1;
        }
        int[] iArr9 = {i7, i6, i5};
        if (partPred2.usesList(i4)) {
            BitReader bitReader3 = bitReader;
            boolean z11 = z;
            iArr4 = iArr9;
            PartPred partPred4 = partPred;
            String str18 = str5;
            PartPred partPred5 = partPred2;
            String str19 = str4;
            int i20 = i;
            String str20 = str7;
            String str21 = str3;
            String str22 = str2;
            String str23 = str;
            int readMVD3 = readMVD(bitReader3, 0, z11, true, sliceDecoder2.leftMBType, MBType.P_16x8, sliceDecoder2.predModeLeft[1], partPred4, partPred5, i20, 0, 2, 4, 2, i4);
            int i21 = readMVD3;
            int readMVD4 = readMVD(bitReader3, 1, z11, true, this.leftMBType, MBType.P_16x8, this.predModeLeft[1], partPred4, partPred5, i20, 0, 2, 4, 2, i4);
            sliceDecoder = this;
            int[][][] iArr10 = sliceDecoder.mvLeft;
            int[] iArr11 = iArr4;
            boolean z12 = z;
            boolean z13 = z;
            int calcMVPrediction16x8Bottom = calcMVPrediction16x8Bottom(iArr10[i4][2], iArr11, null, iArr10[i4][1], z12, true, false, z13, iArr2[i4], 0);
            int[][][] iArr12 = sliceDecoder.mvLeft;
            int calcMVPrediction16x8Bottom2 = calcMVPrediction16x8Bottom(iArr12[i4][2], iArr11, null, iArr12[i4][1], z12, true, false, z13, iArr2[i4], 1);
            int i22 = i21;
            i8 = i22 + calcMVPrediction16x8Bottom;
            i9 = readMVD4 + calcMVPrediction16x8Bottom2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str22);
            sb2.append(calcMVPrediction16x8Bottom);
            String str24 = str23;
            sb2.append(str24);
            sb2.append(calcMVPrediction16x8Bottom2);
            sb2.append(str21);
            sb2.append(i22);
            sb2.append(str24);
            sb2.append(readMVD4);
            sb2.append(str20);
            sb2.append(i8);
            String str25 = str19;
            sb2.append(str25);
            sb2.append(i9);
            sb2.append(str25);
            sb2.append(iArr2[i4]);
            sb2.append(str18);
            sliceDecoder.debugPrint(sb2.toString());
            BlockInterpolator.getBlockLuma(pictureArr[i4][iArr2[i4]], picture, 128, (i << 6) + i8, (i2 << 6) + 32 + i9, 16, 8);
            i11 = iArr2[i4];
            i10 = 3;
        } else {
            iArr4 = iArr9;
            sliceDecoder = sliceDecoder2;
            i11 = -1;
            i10 = 3;
            i9 = 0;
            i8 = 0;
        }
        int[] iArr13 = new int[i10];
        iArr13[0] = i8;
        iArr13[1] = i9;
        iArr13[2] = i11;
        sliceDecoder.copyVect(sliceDecoder.mvTopLeft[i4], sliceDecoder.mvTop[i4][i3 + 3]);
        saveVect(sliceDecoder.mvLeft[i4], 0, 2, i7, i6, i5);
        int i23 = i8;
        int i24 = i9;
        int i25 = i11;
        saveVect(sliceDecoder.mvLeft[i4], 2, 4, i23, i24, i25);
        saveVect(sliceDecoder.mvTop[i4], i3, i3 + 4, i23, i24, i25);
        int[][] iArr14 = new int[16][];
        iArr14[0] = iArr4;
        iArr14[1] = iArr4;
        iArr14[2] = iArr4;
        iArr14[i10] = iArr4;
        iArr14[4] = iArr4;
        iArr14[5] = iArr4;
        iArr14[6] = iArr4;
        iArr14[7] = iArr4;
        iArr14[8] = iArr13;
        iArr14[9] = iArr13;
        iArr14[10] = iArr13;
        iArr14[11] = iArr13;
        iArr14[12] = iArr13;
        iArr14[13] = iArr13;
        iArr14[14] = iArr13;
        iArr14[15] = iArr13;
        iArr3[i4] = iArr14;
    }

    private void predictInter8x16(BitReader bitReader, Picture picture, Picture[][] pictureArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int[][][] iArr, int[] iArr2, int[] iArr3, int i3, PartPred partPred, PartPred partPred2) {
        int i4;
        int i5;
        int i6;
        String str;
        String str2;
        String str3;
        String str4;
        int[] iArr4;
        int i7;
        SliceDecoder sliceDecoder;
        int i8;
        int i9;
        int i10;
        SliceDecoder sliceDecoder2 = this;
        int i11 = i3;
        int i12 = i << 2;
        int i13 = i << 1;
        String str5 = ")";
        String str6 = "), MV: (";
        String str7 = "), MVD: (";
        String str8 = "MVP: (";
        String str9 = ",";
        String str10 = ", ";
        if (partPred.usesList(i11)) {
            BitReader bitReader2 = bitReader;
            boolean z5 = z;
            boolean z6 = z2;
            String str11 = str10;
            String str12 = str9;
            String str13 = str8;
            PartPred partPred3 = partPred;
            String str14 = str7;
            int i14 = i;
            String str15 = str6;
            String str16 = str5;
            int readMVD = readMVD(bitReader2, 0, z5, z6, sliceDecoder2.leftMBType, sliceDecoder2.topMBType[i], sliceDecoder2.predModeLeft[0], sliceDecoder2.predModeTop[i13], partPred3, i14, 0, 0, 2, 4, i3);
            int i15 = readMVD;
            int readMVD2 = readMVD(bitReader2, 1, z5, z6, this.leftMBType, this.topMBType[i], this.predModeLeft[0], this.predModeTop[i13], partPred3, i14, 0, 0, 2, 4, i3);
            sliceDecoder2 = this;
            i11 = i3;
            int[] iArr5 = sliceDecoder2.mvLeft[i11][0];
            int[][][] iArr6 = sliceDecoder2.mvTop;
            int i16 = i12 + 2;
            boolean z7 = z;
            boolean z8 = z2;
            boolean z9 = z2;
            boolean z10 = z3;
            int calcMVPrediction8x16Left = calcMVPrediction8x16Left(iArr5, iArr6[i11][i12], iArr6[i11][i16], sliceDecoder2.mvTopLeft[i11], z7, z8, z9, z10, iArr2[i11], 0);
            int[] iArr7 = sliceDecoder2.mvLeft[i11][0];
            int[][][] iArr8 = sliceDecoder2.mvTop;
            int calcMVPrediction8x16Left2 = calcMVPrediction8x16Left(iArr7, iArr8[i11][i12], iArr8[i11][i16], sliceDecoder2.mvTopLeft[i11], z7, z8, z9, z10, iArr2[i11], 1);
            int i17 = i15;
            int i18 = i17 + calcMVPrediction8x16Left;
            int i19 = readMVD2 + calcMVPrediction8x16Left2;
            StringBuilder sb = new StringBuilder();
            str2 = str13;
            sb.append(str2);
            sb.append(calcMVPrediction8x16Left);
            str = str11;
            sb.append(str);
            sb.append(calcMVPrediction8x16Left2);
            str7 = str14;
            sb.append(str7);
            sb.append(i17);
            sb.append(str);
            sb.append(readMVD2);
            str6 = str15;
            sb.append(str6);
            sb.append(i18);
            str3 = str12;
            sb.append(str3);
            sb.append(i19);
            sb.append(str3);
            sb.append(iArr2[i11]);
            str4 = str16;
            sb.append(str4);
            sliceDecoder2.debugPrint(sb.toString());
            BlockInterpolator.getBlockLuma(pictureArr[i11][iArr2[i11]], picture, 0, (i << 6) + i18, (i2 << 6) + i19, 8, 16);
            i4 = iArr2[i11];
            i6 = i18;
            i5 = i19;
        } else {
            str = str10;
            String str17 = str8;
            str3 = str9;
            str4 = str5;
            str2 = str17;
            i6 = 0;
            i5 = 0;
            i4 = -1;
        }
        int[] iArr9 = {i6, i5, i4};
        if (partPred2.usesList(i11)) {
            int i20 = i13 + 1;
            BitReader bitReader3 = bitReader;
            boolean z11 = z2;
            iArr4 = iArr9;
            PartPred partPred4 = partPred;
            String str18 = str4;
            String str19 = str3;
            PartPred partPred5 = partPred2;
            String str20 = str7;
            int i21 = i;
            String str21 = str6;
            String str22 = str2;
            String str23 = str;
            int readMVD3 = readMVD(bitReader3, 0, true, z11, MBType.P_8x16, sliceDecoder2.topMBType[i], partPred4, sliceDecoder2.predModeTop[i20], partPred5, i21, 2, 0, 2, 4, i3);
            int i22 = readMVD3;
            int readMVD4 = readMVD(bitReader3, 1, true, z11, MBType.P_8x16, this.topMBType[i], partPred4, this.predModeTop[i20], partPred5, i21, 2, 0, 2, 4, i3);
            sliceDecoder = this;
            int[][][] iArr10 = sliceDecoder.mvTop;
            int i23 = i12 + 2;
            int i24 = i12 + 4;
            int i25 = i12 + 1;
            boolean z12 = z2;
            boolean z13 = z4;
            boolean z14 = z2;
            int calcMVPrediction8x16Right = calcMVPrediction8x16Right(iArr4, iArr10[i3][i23], iArr10[i3][i24], iArr10[i3][i25], true, z12, z13, z14, iArr3[i3], 0);
            int[][][] iArr11 = sliceDecoder.mvTop;
            int i26 = calcMVPrediction8x16Right;
            int calcMVPrediction8x16Right2 = calcMVPrediction8x16Right(iArr4, iArr11[i3][i23], iArr11[i3][i24], iArr11[i3][i25], true, z12, z13, z14, iArr3[i3], 1);
            int i27 = i22;
            i7 = i27 + i26;
            i8 = readMVD4 + calcMVPrediction8x16Right2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str22);
            sb2.append(i26);
            String str24 = str23;
            sb2.append(str24);
            sb2.append(calcMVPrediction8x16Right2);
            sb2.append(str20);
            sb2.append(i27);
            sb2.append(str24);
            sb2.append(readMVD4);
            sb2.append(str21);
            sb2.append(i7);
            String str25 = str19;
            sb2.append(str25);
            sb2.append(i8);
            sb2.append(str25);
            sb2.append(iArr3[i3]);
            sb2.append(str18);
            sliceDecoder.debugPrint(sb2.toString());
            BlockInterpolator.getBlockLuma(pictureArr[i3][iArr3[i3]], picture, 8, (i << 6) + 32 + i7, (i2 << 6) + i8, 8, 16);
            i10 = iArr3[i3];
            i9 = 3;
        } else {
            iArr4 = iArr9;
            sliceDecoder = sliceDecoder2;
            i10 = -1;
            i9 = 3;
            i8 = 0;
            i7 = 0;
        }
        int[] iArr12 = new int[i9];
        iArr12[0] = i7;
        iArr12[1] = i8;
        iArr12[2] = i10;
        sliceDecoder.copyVect(sliceDecoder.mvTopLeft[i3], sliceDecoder.mvTop[i3][i12 + 3]);
        int i28 = i12 + 2;
        saveVect(sliceDecoder.mvTop[i3], i12, i28, i6, i5, i4);
        int i29 = i7;
        int i30 = i8;
        int i31 = i10;
        saveVect(sliceDecoder.mvTop[i3], i28, i12 + 4, i29, i30, i31);
        saveVect(sliceDecoder.mvLeft[i3], 0, 4, i29, i30, i31);
        int[][] iArr13 = new int[16][];
        iArr13[0] = iArr4;
        iArr13[1] = iArr4;
        iArr13[2] = iArr12;
        iArr13[i9] = iArr12;
        iArr13[4] = iArr4;
        iArr13[5] = iArr4;
        iArr13[6] = iArr12;
        iArr13[7] = iArr12;
        iArr13[8] = iArr4;
        iArr13[9] = iArr4;
        iArr13[10] = iArr12;
        iArr13[11] = iArr12;
        iArr13[12] = iArr4;
        iArr13[13] = iArr4;
        iArr13[14] = iArr12;
        iArr13[15] = iArr12;
        iArr[i3] = iArr13;
    }

    private boolean prev4x4PredMode(BitReader bitReader) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readBool(bitReader, "MBP: prev_intra4x4_pred_mode_flag");
        }
        return this.cabac.prev4x4PredModeFlag(this.mDecoder);
    }

    private void propagatePred(int[][][] iArr, int i, int i2) {
        int[][] iArr2 = H264Const.BLK8x8_BLOCKS;
        int i3 = iArr2[i][0];
        int i4 = iArr2[i][1];
        int i5 = iArr2[i][2];
        int i6 = iArr2[i][3];
        int[] iArr3 = iArr[0][i3];
        int[] iArr4 = iArr[0][i4];
        int[] iArr5 = iArr[0][i5];
        int[] iArr6 = iArr[0][i6];
        int i7 = iArr[0][i2][0];
        iArr6[0] = i7;
        iArr5[0] = i7;
        iArr4[0] = i7;
        iArr3[0] = i7;
        int[] iArr7 = iArr[0][i3];
        int[] iArr8 = iArr[0][i4];
        int[] iArr9 = iArr[0][i5];
        int[] iArr10 = iArr[0][i6];
        int i8 = iArr[0][i2][1];
        iArr10[1] = i8;
        iArr9[1] = i8;
        iArr8[1] = i8;
        iArr7[1] = i8;
        int[] iArr11 = iArr[0][i3];
        int[] iArr12 = iArr[0][i4];
        int[] iArr13 = iArr[0][i5];
        int[] iArr14 = iArr[0][i6];
        int i9 = iArr[0][i2][2];
        iArr14[2] = i9;
        iArr13[2] = i9;
        iArr12[2] = i9;
        iArr11[2] = i9;
        int[] iArr15 = iArr[1][i3];
        int[] iArr16 = iArr[1][i4];
        int[] iArr17 = iArr[1][i5];
        int[] iArr18 = iArr[1][i6];
        int i10 = iArr[1][i2][0];
        iArr18[0] = i10;
        iArr17[0] = i10;
        iArr16[0] = i10;
        iArr15[0] = i10;
        int[] iArr19 = iArr[1][i3];
        int[] iArr20 = iArr[1][i4];
        int[] iArr21 = iArr[1][i5];
        int[] iArr22 = iArr[1][i6];
        int i11 = iArr[1][i2][1];
        iArr22[1] = i11;
        iArr21[1] = i11;
        iArr20[1] = i11;
        iArr19[1] = i11;
        int[] iArr23 = iArr[1][i3];
        int[] iArr24 = iArr[1][i4];
        int[] iArr25 = iArr[1][i5];
        int[] iArr26 = iArr[1][i6];
        int i12 = iArr[1][i2][2];
        iArr26[2] = i12;
        iArr25[2] = i12;
        iArr24[2] = i12;
        iArr23[2] = i12;
    }

    private void putBlk(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = 1 << i;
        int i5 = (i3 << i) + i2;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            iArr[i5] = iArr2[i6];
            iArr[i5 + 1] = iArr2[i6 + 1];
            iArr[i5 + 2] = iArr2[i6 + 2];
            iArr[i5 + 3] = iArr2[i6 + 3];
            i6 += 4;
            i5 += i4;
        }
    }

    private void putBlk8x8(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = 1 << i;
        int i5 = (i3 << i) + i2;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            for (int i8 = 0; i8 < 8; i8++) {
                iArr[i5 + i8] = iArr2[i6 + i8];
            }
            i6 += 8;
            i5 += i4;
        }
    }

    private int readChromaPredMode(BitReader bitReader, int i, boolean z, boolean z2) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readUE(bitReader, "MBP: intra_chroma_pred_mode");
        }
        return this.cabac.readIntraChromaPredMode(this.mDecoder, i, this.leftMBType, this.topMBType[i], z, z2);
    }

    private int readMBQpDelta(BitReader bitReader, MBType mBType) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readSE(bitReader, "mb_qp_delta");
        }
        return this.cabac.readMBQpDelta(this.mDecoder, mBType);
    }

    private int readMVD(BitReader bitReader, int i, boolean z, boolean z2, MBType mBType, MBType mBType2, PartPred partPred, PartPred partPred2, PartPred partPred3, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.activePps.entropy_coding_mode_flag) {
            return this.cabac.readMVD(this.mDecoder, i, z, z2, mBType, mBType2, partPred, partPred2, partPred3, i2, i3, i4, i5, i6, i7);
        }
        return CAVLCReader.readSE(bitReader, "mvd_l0_x");
    }

    private int readPredictionI4x4Block(BitReader bitReader, boolean z, boolean z2, MBType mBType, MBType mBType2, int i, int i2, int i3) {
        int i4;
        if ((z || i > 0) && (z2 || i2 > 0)) {
            i4 = Math.min((mBType2 == MBType.I_NxN || i2 > 0) ? this.i4x4PredTop[(i3 << 2) + i] : 2, (mBType == MBType.I_NxN || i > 0) ? this.i4x4PredLeft[i2] : 2);
        } else {
            i4 = 2;
        }
        if (!prev4x4PredMode(bitReader)) {
            int rem4x4PredMode = rem4x4PredMode(bitReader);
            i4 = (rem4x4PredMode < i4 ? 0 : 1) + rem4x4PredMode;
        }
        int[] iArr = this.i4x4PredTop;
        int i5 = (i3 << 2) + i;
        this.i4x4PredLeft[i2] = i4;
        iArr[i5] = i4;
        return i4;
    }

    private int readRefIdx(BitReader bitReader, boolean z, boolean z2, MBType mBType, MBType mBType2, PartPred partPred, PartPred partPred2, PartPred partPred3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.activePps.entropy_coding_mode_flag) {
            return this.cabac.readRefIdx(this.mDecoder, z, z2, mBType, mBType2, partPred, partPred2, partPred3, i, i2, i3, i4, i5, i6);
        }
        return CAVLCReader.readTE(bitReader, this.numRef[i6] - 1);
    }

    private int readSubMBTypeB(BitReader bitReader) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readUE(bitReader, "SUB: sub_mb_type");
        }
        return this.cabac.readSubMbTypeB(this.mDecoder);
    }

    private int readSubMBTypeP(BitReader bitReader) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readUE(bitReader, "SUB: sub_mb_type");
        }
        return this.cabac.readSubMbTypeP(this.mDecoder);
    }

    private boolean readTransform8x8Flag(BitReader bitReader, boolean z, boolean z2, MBType mBType, MBType mBType2, boolean z3, boolean z4) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readBool(bitReader, "transform_size_8x8_flag");
        }
        return this.cabac.readTransform8x8Flag(this.mDecoder, z, z2, mBType, mBType2, z3, z4);
    }

    private int rem4x4PredMode(BitReader bitReader) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return CAVLCReader.readNBit(bitReader, 3, "MB: rem_intra4x4_pred_mode");
        }
        return this.cabac.rem4x4PredMode(this.mDecoder);
    }

    private void reorder(Picture[] pictureArr, int i) {
        SliceHeader sliceHeader = this.f44741sh;
        if (sliceHeader.refPicReordering[i] != null) {
            int i2 = sliceHeader.frame_num;
            int i3 = 1 << (sliceHeader.sps.log2_max_frame_num_minus4 + 4);
            int i4 = i2;
            int i5 = 0;
            while (true) {
                int[][][] iArr = this.f44741sh.refPicReordering;
                if (i5 < iArr[i][0].length) {
                    int i6 = iArr[i][0][i5];
                    if (i6 == 0) {
                        i4 = MathUtil.wrap((i4 - iArr[i][1][i5]) - 1, i3);
                    } else if (i6 == 1) {
                        i4 = MathUtil.wrap(i4 + iArr[i][1][i5] + 1, i3);
                    } else if (i6 == 2) {
                        throw new RuntimeException("long term");
                    }
                    for (int i7 = this.numRef[i] - 1; i7 > i5; i7--) {
                        pictureArr[i7] = pictureArr[i7 - 1];
                    }
                    pictureArr[i5] = this.sRefs[i4];
                    i5++;
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < this.numRef[i] && pictureArr[i8] != null) {
                        if (pictureArr[i8] != this.sRefs[i4]) {
                            int i10 = i9 + 1;
                            pictureArr[i9] = pictureArr[i8];
                            i9 = i10;
                        }
                        i8++;
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void residualInter(BitReader bitReader, Picture picture, Frame[][] frameArr, boolean z, boolean z2, int i, int i2, int[][][] iArr, PartPred[] partPredArr, int i3, MBType mBType, MBType mBType2) {
        boolean z3;
        int i4;
        Picture picture2;
        Picture picture3 = picture;
        int i5 = i;
        int readCodedBlockPatternInter = readCodedBlockPatternInter(bitReader, z, z2, this.leftCBPLuma | (this.leftCBPChroma << 4), this.topCBPLuma[i5] | (this.topCBPChroma[i5] << 4), this.leftMBType, this.topMBType[i5]);
        int i6 = readCodedBlockPatternInter & 15;
        int i7 = readCodedBlockPatternInter >> 4;
        Picture create = Picture.create(16, 16, this.chromaFormat);
        if (i6 == 0 || !this.transform8x8) {
            z3 = false;
        } else {
            z3 = readTransform8x8Flag(bitReader, z, z2, this.leftMBType, this.topMBType[i5], this.tf8x8Left, this.tf8x8Top[i5]);
        }
        if (i6 > 0 || i7 > 0) {
            this.f44740qp = ((this.f44740qp + readMBQpDelta(bitReader, mBType)) + 52) % 52;
        } else {
            BitReader bitReader2 = bitReader;
        }
        this.mbQps[0][i3] = this.f44740qp;
        boolean z4 = this.tf8x8Left;
        boolean z5 = z3;
        Picture picture4 = create;
        boolean z6 = z4;
        int i8 = i7;
        residualLuma(bitReader, z, z2, i, i2, create, readCodedBlockPatternInter, mBType2, z5, z6, this.tf8x8Top[i5]);
        saveMvs(iArr, i5, i2);
        if (this.chromaFormat == ColorSpace.MONO) {
            Arrays.fill(picture3.getPlaneData(1), 128);
            Arrays.fill(picture3.getPlaneData(2), 128);
            picture2 = picture4;
            i4 = i6;
        } else {
            i4 = i6;
            decodeChromaInter(bitReader, i8, frameArr, iArr, partPredArr, z, z2, i, i2, i3, this.f44740qp, picture, picture4);
            picture2 = picture4;
        }
        mergeResidual(picture3, picture2);
        int[] iArr2 = this.topCBPLuma;
        int i9 = i4;
        this.leftCBPLuma = i9;
        iArr2[i] = i9;
        int[] iArr3 = this.topCBPChroma;
        int i10 = i8;
        this.leftCBPChroma = i10;
        iArr3[i] = i10;
        boolean z7 = z5;
        this.tf8x8Top[i] = z7;
        this.tf8x8Left = z7;
        this.tr8x8Used[i3] = z7;
    }

    private void residualLuma(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int i3, MBType mBType, boolean z3, boolean z4, boolean z5) {
        if (!z3) {
            residualLuma(bitReader, z, z2, i, i2, picture, i3, mBType);
        } else if (this.activePps.entropy_coding_mode_flag) {
            residualLuma8x8CABAC(bitReader, z, z2, i, i2, picture, i3, mBType, z4, z5);
        } else {
            residualLuma8x8CAVLC(bitReader, z, z2, i, i2, picture, i3, mBType);
        }
    }

    private void residualLuma8x8CABAC(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int i3, MBType mBType, boolean z3, boolean z4) {
        int i4;
        int i5 = i3;
        int i6 = i5 & 15;
        int i7 = 0;
        while (i7 < 4) {
            int i8 = (i7 & 1) << 1;
            int i9 = i7 & 2;
            int i10 = (i << 2) + i8;
            int i11 = (i2 << 2) + i9;
            if (((1 << i7) & i6) == 0) {
                i4 = i6;
                Picture picture2 = picture;
            } else {
                int[] iArr = new int[64];
                int[][] iArr2 = this.nCoeff;
                int[] iArr3 = iArr2[i11];
                int[] iArr4 = iArr2[i11];
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int[] iArr5 = iArr2[i13];
                int[] iArr6 = iArr2[i13];
                int i14 = i13;
                i4 = i6;
                int i15 = i12;
                int readCoeffs = this.cabac.readCoeffs(this.mDecoder, BlockType.LUMA_64, iArr, 0, 64, CoeffTransformer.zigzag8x8, H264Const.sig_coeff_map_8x8, H264Const.last_sig_coeff_map_8x8);
                iArr6[i15] = readCoeffs;
                iArr5[i10] = readCoeffs;
                iArr4[i15] = readCoeffs;
                iArr3[i10] = readCoeffs;
                this.cabac.setCodedBlock(i10, i11);
                this.cabac.setCodedBlock(i15, i11);
                this.cabac.setCodedBlock(i10, i14);
                this.cabac.setCodedBlock(i15, i14);
                CoeffTransformer.dequantizeAC8x8(iArr, this.f44740qp);
                CoeffTransformer.idct8x8(iArr);
                putBlk8x8(picture.getPlaneData(0), iArr, 4, i8 << 2, i9 << 2);
            }
            i7++;
            i6 = i4;
        }
        this.cabac.setPrevCBP(i5);
    }

    private void residualLuma8x8CAVLC(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int i3, MBType mBType) {
        int i4 = i3 & 15;
        int i5 = 0;
        while (true) {
            if (i5 < 4) {
                int i6 = (i5 & 1) << 1;
                int i7 = i5 & 2;
                int i8 = (i << 2) + i6;
                int i9 = (i2 << 2) + i7;
                if (((1 << i5) & i4) == 0) {
                    this.cavlc[0].setZeroCoeff(i8, i7);
                    int i10 = i8 + 1;
                    this.cavlc[0].setZeroCoeff(i10, i7);
                    int i11 = i7 + 1;
                    this.cavlc[0].setZeroCoeff(i8, i11);
                    this.cavlc[0].setZeroCoeff(i10, i11);
                    Picture picture2 = picture;
                } else {
                    int[] iArr = new int[64];
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 4; i12 < i14; i14 = 4) {
                        int i15 = i12 & 1;
                        int i16 = i6 + i15;
                        int i17 = i7 + (i12 >> 1);
                        int i18 = i8 + i15;
                        CAVLC cavlc2 = this.cavlc[0];
                        int[] iArr2 = new int[16];
                        i13 += cavlc2.readACBlock(bitReader, iArr2, i18, i17, i16 != 0 || z, i16 == 0 ? this.leftMBType : mBType, i17 != 0 || z2, i17 == 0 ? this.topMBType[i] : mBType, 0, 16, H264Const.identityMapping16);
                        for (int i19 = 0; i19 < 16; i19++) {
                            iArr[CoeffTransformer.zigzag8x8[(i19 << 2) + i12]] = iArr2[i19];
                        }
                        i12++;
                    }
                    int[][] iArr3 = this.nCoeff;
                    int[] iArr4 = iArr3[i9];
                    int[] iArr5 = iArr3[i9];
                    int i20 = i8 + 1;
                    int i21 = i9 + 1;
                    int[] iArr6 = iArr3[i21];
                    iArr3[i21][i20] = i13;
                    iArr6[i8] = i13;
                    iArr5[i20] = i13;
                    iArr4[i8] = i13;
                    CoeffTransformer.dequantizeAC8x8(iArr, this.f44740qp);
                    CoeffTransformer.idct8x8(iArr);
                    putBlk8x8(picture.getPlaneData(0), iArr, 4, i6 << 2, i7 << 2);
                }
                i5++;
            } else {
                return;
            }
        }
    }

    private void residualLumaI16x16(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int i3) {
        int i4;
        int i5;
        int[] iArr = new int[16];
        int i6 = 1;
        int i7 = 0;
        if (!this.activePps.entropy_coding_mode_flag) {
            this.cavlc[0].readLumaDCBlock(bitReader, iArr, i, z, this.leftMBType, z2, this.topMBType[i], CoeffTransformer.zigzag4x4);
        } else {
            if (this.cabac.readCodedBlockFlagLumaDC(this.mDecoder, i, this.leftMBType, this.topMBType[i], z, z2, MBType.I_16x16) == 1) {
                CABAC cabac2 = this.cabac;
                MDecoder mDecoder2 = this.mDecoder;
                BlockType blockType = BlockType.LUMA_16_DC;
                int[] iArr2 = CoeffTransformer.zigzag4x4;
                int[] iArr3 = H264Const.identityMapping16;
                cabac2.readCoeffs(mDecoder2, blockType, iArr, 0, 16, iArr2, iArr3, iArr3);
            }
        }
        CoeffTransformer.invDC4x4(iArr);
        CoeffTransformer.dequantizeDC4x4(iArr, this.f44740qp);
        CoeffTransformer.reorderDC4x4(iArr);
        int i8 = 0;
        for (int i9 = 16; i8 < i9; i9 = 16) {
            int[] iArr4 = new int[i9];
            int i10 = H264Const.MB_BLK_OFF_LEFT[i8];
            int i11 = H264Const.MB_BLK_OFF_TOP[i8];
            int i12 = (i << 2) + i10;
            int i13 = (i2 << 2) + i11;
            if ((i3 & (i6 << (i8 >> 2))) != 0) {
                if (!this.activePps.entropy_coding_mode_flag) {
                    i5 = i11;
                    this.nCoeff[i13][i12] = this.cavlc[i7].readACBlock(bitReader, iArr4, i12, i11, i10 != 0 || z, i10 == 0 ? this.leftMBType : MBType.I_16x16, i11 != 0 || z2, i11 == 0 ? this.topMBType[i] : MBType.I_16x16, 1, 15, CoeffTransformer.zigzag4x4);
                } else {
                    int i14 = i12;
                    i5 = i11;
                    if (this.cabac.readCodedBlockFlagLumaAC(this.mDecoder, BlockType.LUMA_15_AC, i14, i5, 0, this.leftMBType, this.topMBType[i], z, z2, this.leftCBPLuma, this.topCBPLuma[i], i3, MBType.I_16x16) == i6) {
                        int[] iArr5 = this.nCoeff[i13];
                        CABAC cabac3 = this.cabac;
                        MDecoder mDecoder3 = this.mDecoder;
                        BlockType blockType2 = BlockType.LUMA_15_AC;
                        int[] iArr6 = CoeffTransformer.zigzag4x4;
                        int[] iArr7 = H264Const.identityMapping16;
                        iArr5[i14] = cabac3.readCoeffs(mDecoder3, blockType2, iArr4, 1, 15, iArr6, iArr7, iArr7);
                    }
                }
                CoeffTransformer.dequantizeAC(iArr4, this.f44740qp);
            } else {
                int i15 = i12;
                i5 = i11;
                if (!this.activePps.entropy_coding_mode_flag) {
                    i4 = i5;
                    this.cavlc[i7].setZeroCoeff(i15, i4);
                    iArr4[i7] = iArr[i8];
                    CoeffTransformer.idct4x4(iArr4);
                    int[] iArr8 = iArr;
                    putBlk(picture.getPlaneData(i7), iArr4, 4, i10 << 2, i4 << 2);
                    i8++;
                    iArr = iArr8;
                    i7 = 0;
                    i6 = 1;
                }
            }
            i4 = i5;
            iArr4[i7] = iArr[i8];
            CoeffTransformer.idct4x4(iArr4);
            int[] iArr82 = iArr;
            putBlk(picture.getPlaneData(i7), iArr4, 4, i10 << 2, i4 << 2);
            i8++;
            iArr = iArr82;
            i7 = 0;
            i6 = 1;
        }
    }

    private void saveMvs(int[][][] iArr, int i, int i2) {
        int i3 = i2 << 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < 4) {
            int i6 = i << 2;
            int i7 = i5;
            int i8 = 0;
            while (i8 < 4) {
                int[][][][] iArr2 = this.mvs;
                iArr2[0][i3][i6] = iArr[0][i7];
                iArr2[1][i3][i6] = iArr[1][i7];
                i8++;
                i6++;
                i7++;
            }
            i4++;
            i3++;
            i5 = i7;
        }
    }

    private void saveMvsIntra(int i, int i2) {
        int i3 = i2 << 2;
        int i4 = 0;
        while (i4 < 4) {
            int i5 = i << 2;
            int i6 = 0;
            while (i6 < 4) {
                int[][][][] iArr = this.mvs;
                int[][] iArr2 = iArr[0][i3];
                int[] iArr3 = NULL_VECTOR;
                iArr2[i5] = iArr3;
                iArr[1][i3][i5] = iArr3;
                i6++;
                i5++;
            }
            i4++;
            i3++;
        }
    }

    private void savePrediction8x8(int i, int[][] iArr, int i2) {
        int i3 = i << 2;
        int i4 = i3 + 3;
        copyVect(this.mvTopLeft[i2], this.mvTop[i2][i4]);
        copyVect(this.mvLeft[i2][0], iArr[3]);
        copyVect(this.mvLeft[i2][1], iArr[7]);
        copyVect(this.mvLeft[i2][2], iArr[11]);
        copyVect(this.mvLeft[i2][3], iArr[15]);
        copyVect(this.mvTop[i2][i3], iArr[12]);
        copyVect(this.mvTop[i2][i3 + 1], iArr[13]);
        copyVect(this.mvTop[i2][i3 + 2], iArr[14]);
        copyVect(this.mvTop[i2][i4], iArr[15]);
    }

    private void saveVect(int[][] iArr, int i, int i2, int i3, int i4, int i5) {
        while (i < i2) {
            iArr[i][0] = i3;
            iArr[i][1] = i4;
            iArr[i][2] = i5;
            i++;
        }
    }

    private void wipe(Picture picture) {
        Arrays.fill(picture.getPlaneData(0), 0);
        Arrays.fill(picture.getPlaneData(1), 0);
        Arrays.fill(picture.getPlaneData(2), 0);
    }

    public int calcMVPrediction16x8Bottom(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if (!z || iArr[2] != i) {
            return calcMVPredictionMedian(iArr, iArr2, iArr3, iArr4, z, z2, z3, z4, i, i2);
        }
        return iArr[i2];
    }

    public int calcMVPrediction16x8Top(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if (!z2 || iArr2[2] != i) {
            return calcMVPredictionMedian(iArr, iArr2, iArr3, iArr4, z, z2, z3, z4, i, i2);
        }
        return iArr2[i2];
    }

    public int calcMVPrediction8x16Left(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if (!z || iArr[2] != i) {
            return calcMVPredictionMedian(iArr, iArr2, iArr3, iArr4, z, z2, z3, z4, i, i2);
        }
        return iArr[i2];
    }

    public int calcMVPrediction8x16Right(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        int[] iArr5 = z3 ? iArr3 : z4 ? iArr4 : NULL_VECTOR;
        if (iArr5[2] == i) {
            return iArr5[i2];
        }
        return calcMVPredictionMedian(iArr, iArr2, iArr3, iArr4, z, z2, z3, z4, i, i2);
    }

    public int calcMVPredictionMedian(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if (!z3) {
            iArr3 = iArr4;
            z3 = z4;
        }
        if (z && !z2 && !z3) {
            iArr2 = iArr;
            iArr3 = iArr2;
            z2 = z;
            z3 = z2;
        }
        if (!z) {
            iArr = NULL_VECTOR;
        }
        if (!z2) {
            iArr2 = NULL_VECTOR;
        }
        if (!z3) {
            iArr3 = NULL_VECTOR;
        }
        if (iArr[2] == i && iArr2[2] != i && iArr3[2] != i) {
            return iArr[i2];
        }
        if (iArr2[2] == i && iArr[2] != i && iArr3[2] != i) {
            return iArr2[i2];
        }
        if (iArr3[2] != i || iArr[2] == i || iArr2[2] == i) {
            return (((iArr[i2] + iArr2[i2]) + iArr3[i2]) - min(iArr[i2], iArr2[i2], iArr3[i2])) - max(iArr[i2], iArr2[i2], iArr3[i2]);
        }
        return iArr3[i2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0374 A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decode(java.nio.ByteBuffer r24, org.jcodec.codecs.h264.p552io.model.NALUnit r25) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            java.lang.Class<int> r1 = int.class
            org.jcodec.common.io.BitReader r9 = new org.jcodec.common.io.BitReader
            r9.<init>(r0)
            org.jcodec.codecs.h264.decode.SliceHeaderReader r2 = new org.jcodec.codecs.h264.decode.SliceHeaderReader
            r2.<init>()
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r2.readPart1(r9)
            r8.f44741sh = r3
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r4 = r8.activeSps
            r3.sps = r4
            org.jcodec.codecs.h264.io.model.PictureParameterSet r4 = r8.activePps
            r3.pps = r4
            r4 = 3
            org.jcodec.codecs.h264.io.CAVLC[] r5 = new org.jcodec.codecs.h264.p552io.CAVLC[r4]
            org.jcodec.codecs.h264.io.CAVLC r6 = new org.jcodec.codecs.h264.io.CAVLC
            org.jcodec.codecs.h264.io.model.SeqParameterSet r7 = r3.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r3 = r3.pps
            r10 = 2
            r6.<init>(r7, r3, r10, r10)
            r11 = 0
            r5[r11] = r6
            org.jcodec.codecs.h264.io.CAVLC r3 = new org.jcodec.codecs.h264.io.CAVLC
            org.jcodec.codecs.h264.io.model.SliceHeader r6 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r7 = r6.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r6 = r6.pps
            r12 = 1
            r3.<init>(r7, r6, r12, r12)
            r5[r12] = r3
            org.jcodec.codecs.h264.io.CAVLC r3 = new org.jcodec.codecs.h264.io.CAVLC
            org.jcodec.codecs.h264.io.model.SliceHeader r6 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r7 = r6.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r6 = r6.pps
            r3.<init>(r7, r6, r12, r12)
            r5[r10] = r3
            r8.cavlc = r5
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r3 = r3.sps
            int r3 = r3.pic_width_in_mbs_minus1
            int r13 = r3 + 1
            org.jcodec.codecs.h264.io.CABAC r3 = new org.jcodec.codecs.h264.io.CABAC
            r3.<init>(r13)
            r8.cabac = r3
            int[] r3 = new int[r10]
            org.jcodec.codecs.h264.io.model.SliceHeader r5 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.PictureParameterSet r5 = r5.pps
            int r6 = r5.chroma_qp_index_offset
            r3[r11] = r6
            org.jcodec.codecs.h264.io.model.PictureParameterSet$PPSExt r5 = r5.extended
            if (r5 == 0) goto L_0x006c
            int r6 = r5.second_chroma_qp_index_offset
        L_0x006c:
            r3[r12] = r6
            r8.chromaQpOffset = r3
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r5 = r3.sps
            org.jcodec.common.model.ColorSpace r5 = r5.chroma_format_idc
            r8.chromaFormat = r5
            org.jcodec.codecs.h264.io.model.PictureParameterSet r3 = r3.pps
            org.jcodec.codecs.h264.io.model.PictureParameterSet$PPSExt r3 = r3.extended
            if (r3 != 0) goto L_0x0080
            r3 = 0
            goto L_0x0082
        L_0x0080:
            boolean r3 = r3.transform_8x8_mode_flag
        L_0x0082:
            r8.transform8x8 = r3
            r3 = 4
            int[] r5 = new int[r3]
            r8.i4x4PredLeft = r5
            int r5 = r13 << 2
            int[] r6 = new int[r5]
            r8.i4x4PredTop = r6
            org.jcodec.codecs.h264.io.model.MBType[] r6 = new org.jcodec.codecs.h264.p552io.model.MBType[r13]
            r8.topMBType = r6
            int[] r6 = new int[r13]
            r8.topCBPLuma = r6
            int[] r6 = new int[r13]
            r8.topCBPChroma = r6
            int r5 = r5 + r12
            int[] r5 = new int[]{r10, r5, r4}
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            int[][][] r5 = (int[][][]) r5
            r8.mvTop = r5
            int[] r5 = new int[]{r10, r3, r4}
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            int[][][] r5 = (int[][][]) r5
            r8.mvLeft = r5
            int[] r5 = new int[]{r10, r4}
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            int[][] r5 = (int[][]) r5
            r8.mvTopLeft = r5
            r14 = 16
            int[] r5 = new int[]{r4, r14}
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            int[][] r5 = (int[][]) r5
            r8.leftRow = r5
            int[] r3 = new int[]{r4, r3}
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r3)
            int[][] r3 = (int[][]) r3
            r8.topLeft = r3
            int r3 = r13 << 4
            int[] r3 = new int[]{r4, r3}
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r3)
            int[][] r3 = (int[][]) r3
            r8.topLine = r3
            org.jcodec.codecs.h264.H264Const$PartPred[] r3 = new org.jcodec.codecs.h264.H264Const.PartPred[r10]
            r8.predModeLeft = r3
            int r3 = r13 << 1
            org.jcodec.codecs.h264.H264Const$PartPred[] r3 = new org.jcodec.codecs.h264.H264Const.PartPred[r3]
            r8.predModeTop = r3
            boolean[] r3 = new boolean[r13]
            r8.tf8x8Top = r3
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r5 = r3.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r6 = r3.pps
            r4 = r25
            r7 = r9
            r2.readPart2(r3, r4, r5, r6, r7)
            org.jcodec.codecs.h264.decode.Prediction r2 = new org.jcodec.codecs.h264.decode.Prediction
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            r2.<init>(r3)
            r8.prediction = r2
            org.jcodec.codecs.h264.io.model.SliceHeader r2 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.PictureParameterSet r3 = r2.pps
            int r3 = r3.pic_init_qp_minus26
            int r3 = r3 + 26
            int r2 = r2.slice_qp_delta
            int r3 = r3 + r2
            r8.f44740qp = r3
            org.jcodec.codecs.h264.io.model.PictureParameterSet r2 = r8.activePps
            boolean r2 = r2.entropy_coding_mode_flag
            if (r2 == 0) goto L_0x0141
            r9.terminate()
            r2 = 1024(0x400, float:1.435E-42)
            int[] r2 = new int[]{r10, r2}
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            int[][] r1 = (int[][]) r1
            org.jcodec.codecs.h264.io.CABAC r2 = r8.cabac
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r4 = r3.slice_type
            int r3 = r3.cabac_init_idc
            int r5 = r8.f44740qp
            r2.initModels(r1, r4, r3, r5)
            org.jcodec.codecs.common.biari.MDecoder r2 = new org.jcodec.codecs.common.biari.MDecoder
            r2.<init>(r0, r1)
            r8.mDecoder = r2
        L_0x0141:
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            boolean r1 = r0.num_ref_idx_active_override_flag
            if (r1 == 0) goto L_0x0158
            int[] r1 = new int[r10]
            int[] r0 = r0.num_ref_idx_active_minus1
            r2 = r0[r11]
            int r2 = r2 + r12
            r1[r11] = r2
            r0 = r0[r12]
            int r0 = r0 + r12
            r1[r12] = r0
            r8.numRef = r1
            goto L_0x016a
        L_0x0158:
            int[] r0 = new int[r10]
            org.jcodec.codecs.h264.io.model.PictureParameterSet r1 = r8.activePps
            int[] r1 = r1.num_ref_idx_active_minus1
            r2 = r1[r11]
            int r2 = r2 + r12
            r0[r11] = r2
            r1 = r1[r12]
            int r1 = r1 + r12
            r0[r12] = r1
            r8.numRef = r0
        L_0x016a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "============"
            r0.append(r1)
            org.jcodec.codecs.h264.io.model.Frame r1 = r8.thisFrame
            int r1 = r1.getPOC()
            r0.append(r1)
            java.lang.String r1 = "============= "
            r0.append(r1)
            org.jcodec.codecs.h264.io.model.SliceHeader r1 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r1 = r1.slice_type
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.debugPrint(r0)
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r0 = r0.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            r15 = 0
            if (r0 != r1) goto L_0x01a9
            org.jcodec.codecs.h264.io.model.Frame[][] r0 = new org.jcodec.codecs.h264.p552io.model.Frame[r10][]
            org.jcodec.codecs.h264.io.model.Frame[] r1 = r23.buildRefListP()
            r0[r11] = r1
            r0[r12] = r15
        L_0x01a7:
            r7 = r0
            goto L_0x01b3
        L_0x01a9:
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r0 != r1) goto L_0x01b2
            org.jcodec.codecs.h264.io.model.Frame[][] r0 = r23.buildRefListB()
            goto L_0x01a7
        L_0x01b2:
            r7 = r15
        L_0x01b3:
            java.lang.String r0 = "------"
            r8.debugPrint(r0)
            if (r7 == 0) goto L_0x01ff
            r0 = 0
        L_0x01bb:
            if (r0 >= r10) goto L_0x01ff
            r1 = r7[r0]
            if (r1 == 0) goto L_0x01fc
            r1 = 0
        L_0x01c2:
            r2 = r7[r0]
            int r2 = r2.length
            if (r1 >= r2) goto L_0x01fc
            r2 = r7[r0]
            r2 = r2[r1]
            if (r2 == 0) goto L_0x01f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "REF["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "]["
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = "]: "
            r2.append(r3)
            r3 = r7[r0]
            r3 = r3[r1]
            int r3 = r3.getPOC()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.debugPrint(r2)
        L_0x01f9:
            int r1 = r1 + 1
            goto L_0x01c2
        L_0x01fc:
            int r0 = r0 + 1
            goto L_0x01bb
        L_0x01ff:
            org.jcodec.codecs.h264.decode.aso.MapManager r0 = new org.jcodec.codecs.h264.decode.aso.MapManager
            org.jcodec.codecs.h264.io.model.SliceHeader r1 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r2 = r1.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r1 = r1.pps
            r0.<init>(r2, r1)
            org.jcodec.codecs.h264.io.model.SliceHeader r1 = r8.f44741sh
            org.jcodec.codecs.h264.decode.aso.Mapper r0 = r0.getMapper(r1)
            r8.mapper = r0
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r0.sps
            org.jcodec.common.model.ColorSpace r0 = r0.chroma_format_idc
            org.jcodec.common.model.Picture r10 = org.jcodec.common.model.Picture.create(r14, r14, r0)
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r0.sps
            boolean r1 = r1.mb_adaptive_frame_field_flag
            if (r1 == 0) goto L_0x022a
            boolean r0 = r0.field_pic_flag
            if (r0 != 0) goto L_0x022a
            r14 = 1
            goto L_0x022b
        L_0x022a:
            r14 = 0
        L_0x022b:
            r2 = r15
            r0 = 0
            r1 = 0
        L_0x022e:
            org.jcodec.codecs.h264.io.model.SliceHeader r3 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r3 = r3.slice_type
            boolean r3 = r3.isInter()
            java.lang.String r4 = ") ---------------------"
            java.lang.String r5 = ","
            java.lang.String r6 = "---------------------- MB ("
            if (r3 == 0) goto L_0x02b1
            org.jcodec.codecs.h264.io.model.PictureParameterSet r3 = r8.activePps
            boolean r3 = r3.entropy_coding_mode_flag
            if (r3 != 0) goto L_0x02b1
            java.lang.String r1 = "mb_skip_run"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r1)
            r2 = r0
            r0 = 0
        L_0x024c:
            if (r0 >= r1) goto L_0x029f
            org.jcodec.codecs.h264.decode.aso.Mapper r3 = r8.mapper
            int r3 = r3.getAddress(r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r15 = r3 % r13
            r11.append(r15)
            r11.append(r5)
            int r15 = r3 / r13
            r11.append(r15)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r8.debugPrint(r11)
            org.jcodec.codecs.h264.io.model.SliceHeader r11 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r11 = r11.slice_type
            r8.decodeSkip(r7, r2, r10, r11)
            org.jcodec.codecs.h264.io.model.SliceHeader[] r11 = r8.shs
            org.jcodec.codecs.h264.io.model.SliceHeader r15 = r8.f44741sh
            r11[r3] = r15
            org.jcodec.codecs.h264.io.model.Frame[][][] r11 = r8.refsUsed
            r11[r3] = r7
            org.jcodec.codecs.h264.io.model.Frame r3 = r8.thisFrame
            org.jcodec.codecs.h264.decode.aso.Mapper r11 = r8.mapper
            int r11 = r11.getMbX(r2)
            org.jcodec.codecs.h264.decode.aso.Mapper r15 = r8.mapper
            int r15 = r15.getMbY(r2)
            r8.put(r3, r10, r11, r15)
            r8.wipe(r10)
            int r0 = r0 + 1
            int r2 = r2 + 1
            r11 = 0
            r15 = 0
            goto L_0x024c
        L_0x029f:
            if (r1 <= 0) goto L_0x02a3
            r0 = 1
            goto L_0x02a4
        L_0x02a3:
            r0 = 0
        L_0x02a4:
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.moreRBSPData(r9)
            if (r1 != 0) goto L_0x02ac
            goto L_0x0373
        L_0x02ac:
            r15 = r0
            r11 = r2
            r16 = 0
            goto L_0x02b5
        L_0x02b1:
            r11 = r0
            r15 = r1
            r16 = r2
        L_0x02b5:
            org.jcodec.codecs.h264.decode.aso.Mapper r0 = r8.mapper
            int r0 = r0.getAddress(r11)
            org.jcodec.codecs.h264.io.model.SliceHeader[] r1 = r8.shs
            org.jcodec.codecs.h264.io.model.SliceHeader r2 = r8.f44741sh
            r1[r0] = r2
            org.jcodec.codecs.h264.io.model.Frame[][][] r1 = r8.refsUsed
            r1[r0] = r7
            int r3 = r0 % r13
            int r2 = r0 / r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r8.debugPrint(r0)
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r0 = r0.slice_type
            boolean r0 = r0.isIntra()
            if (r0 != 0) goto L_0x0326
            org.jcodec.codecs.h264.io.model.PictureParameterSet r0 = r8.activePps
            boolean r0 = r0.entropy_coding_mode_flag
            if (r0 == 0) goto L_0x0326
            org.jcodec.codecs.h264.io.CABAC r0 = r8.cabac
            org.jcodec.codecs.common.biari.MDecoder r1 = r8.mDecoder
            org.jcodec.codecs.h264.io.model.SliceHeader r4 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r4 = r4.slice_type
            org.jcodec.codecs.h264.decode.aso.Mapper r5 = r8.mapper
            boolean r20 = r5.leftAvailable(r11)
            org.jcodec.codecs.h264.decode.aso.Mapper r5 = r8.mapper
            boolean r21 = r5.topAvailable(r11)
            r17 = r0
            r18 = r1
            r19 = r4
            r22 = r3
            boolean r0 = r17.readMBSkipFlag(r18, r19, r20, r21, r22)
            if (r0 != 0) goto L_0x0317
            goto L_0x0326
        L_0x0317:
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r0 = r0.slice_type
            r8.decodeSkip(r7, r11, r10, r0)
            r12 = r3
            r18 = r7
            r16 = r13
            r13 = r2
            r2 = 0
            goto L_0x0351
        L_0x0326:
            if (r14 == 0) goto L_0x0338
            int r0 = r11 % 2
            if (r0 == 0) goto L_0x0330
            if (r0 != r12) goto L_0x0338
            if (r15 == 0) goto L_0x0338
        L_0x0330:
            java.lang.String r0 = "mb_field_decoding_flag"
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r0)
            r4 = r0
            goto L_0x0339
        L_0x0338:
            r4 = 0
        L_0x0339:
            org.jcodec.codecs.h264.io.model.SliceHeader r0 = r8.f44741sh
            org.jcodec.codecs.h264.io.model.SliceType r1 = r0.slice_type
            r0 = r23
            r6 = r2
            r2 = r11
            r5 = r3
            r3 = r9
            r12 = r5
            r5 = r16
            r16 = r13
            r13 = r6
            r6 = r10
            r18 = r7
            org.jcodec.codecs.h264.io.model.MBType r0 = r0.decode(r1, r2, r3, r4, r5, r6, r7)
            r2 = r0
        L_0x0351:
            org.jcodec.codecs.h264.io.model.Frame r0 = r8.thisFrame
            r8.put(r0, r10, r12, r13)
            org.jcodec.codecs.h264.io.model.PictureParameterSet r0 = r8.activePps
            boolean r0 = r0.entropy_coding_mode_flag
            if (r0 == 0) goto L_0x0366
            org.jcodec.codecs.common.biari.MDecoder r0 = r8.mDecoder
            int r0 = r0.decodeFinalBin()
            r1 = 1
            if (r0 != r1) goto L_0x0367
            goto L_0x0373
        L_0x0366:
            r1 = 1
        L_0x0367:
            org.jcodec.codecs.h264.io.model.PictureParameterSet r0 = r8.activePps
            boolean r0 = r0.entropy_coding_mode_flag
            if (r0 != 0) goto L_0x0374
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.moreRBSPData(r9)
            if (r0 != 0) goto L_0x0374
        L_0x0373:
            return
        L_0x0374:
            r8.wipe(r10)
            int r0 = r11 + 1
            r1 = r15
            r13 = r16
            r7 = r18
            r11 = 0
            r12 = 1
            r15 = 0
            goto L_0x022e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.SliceDecoder.decode(java.nio.ByteBuffer, org.jcodec.codecs.h264.io.model.NALUnit):void");
    }

    public void decodeChroma(BitReader bitReader, int i, int i2, int i3, int i4, boolean z, boolean z2, Picture picture, int i5, MBType mBType) {
        Picture picture2 = picture;
        int i6 = i5;
        if (this.chromaFormat == ColorSpace.MONO) {
            Arrays.fill(picture2.getPlaneData(1), 128);
            Arrays.fill(picture2.getPlaneData(2), 128);
            return;
        }
        int calcQpChroma = calcQpChroma(i6, this.chromaQpOffset[0]);
        int calcQpChroma2 = calcQpChroma(i6, this.chromaQpOffset[1]);
        if (i != 0) {
            decodeChromaResidual(bitReader, z, z2, i3, i4, i, picture, calcQpChroma, calcQpChroma2, mBType);
        } else if (!this.activePps.entropy_coding_mode_flag) {
            int i7 = i3 << 1;
            this.cavlc[1].setZeroCoeff(i7, 0);
            int i8 = i7 + 1;
            this.cavlc[1].setZeroCoeff(i8, 1);
            this.cavlc[2].setZeroCoeff(i7, 0);
            this.cavlc[2].setZeroCoeff(i8, 1);
        }
        int i9 = ((this.activeSps.pic_width_in_mbs_minus1 + 1) * i4) + i3;
        int[][] iArr = this.mbQps;
        iArr[1][i9] = calcQpChroma;
        iArr[2][i9] = calcQpChroma2;
        int i10 = i3;
        boolean z3 = z;
        boolean z4 = z2;
        ChromaPredictionBuilder.predictWithMode(picture2.getPlaneData(1), i2, i10, z3, z4, this.leftRow[1], this.topLine[1], this.topLeft[1]);
        ChromaPredictionBuilder.predictWithMode(picture2.getPlaneData(2), i2, i10, z3, z4, this.leftRow[2], this.topLine[2], this.topLeft[2]);
    }

    public void decodeChromaInter(BitReader bitReader, int i, Frame[][] frameArr, int[][][] iArr, PartPred[] partPredArr, boolean z, boolean z2, int i2, int i3, int i4, int i5, Picture picture, Picture picture2) {
        int i6 = i5;
        Frame[][] frameArr2 = frameArr;
        int[][][] iArr2 = iArr;
        int i7 = i2 << 3;
        int i8 = i3 << 3;
        Picture picture3 = picture2;
        PartPred[] partPredArr2 = partPredArr;
        predictChromaInter(frameArr2, iArr2, i7, i8, 1, picture3, partPredArr2);
        predictChromaInter(frameArr2, iArr2, i7, i8, 2, picture3, partPredArr2);
        int calcQpChroma = calcQpChroma(i6, this.chromaQpOffset[0]);
        int calcQpChroma2 = calcQpChroma(i6, this.chromaQpOffset[1]);
        decodeChromaResidual(bitReader, z, z2, i2, i3, i, picture, calcQpChroma, calcQpChroma2, MBType.P_16x16);
        int[][] iArr3 = this.mbQps;
        iArr3[1][i4] = calcQpChroma;
        iArr3[2][i4] = calcQpChroma2;
    }

    public void decodeChromaSkip(Frame[][] frameArr, int[][][] iArr, PartPred[] partPredArr, int i, int i2, Picture picture) {
        Frame[][] frameArr2 = frameArr;
        int[][][] iArr2 = iArr;
        int i3 = i << 3;
        int i4 = i2 << 3;
        Picture picture2 = picture;
        PartPred[] partPredArr2 = partPredArr;
        predictChromaInter(frameArr2, iArr2, i3, i4, 1, picture2, partPredArr2);
        predictChromaInter(frameArr2, iArr2, i3, i4, 2, picture2, partPredArr2);
    }

    public void decodeMBInter8x8(BitReader bitReader, int i, Frame[][] frameArr, Picture picture, SliceType sliceType, int i2, boolean z, MBType mBType, boolean z2) {
        int i3;
        int[][][] iArr;
        Picture picture2;
        PartPred[] partPredArr;
        MBType mBType2;
        boolean z3;
        boolean z4;
        Picture picture3 = picture;
        int i4 = i2;
        int mbX = this.mapper.getMbX(i4);
        int mbY = this.mapper.getMbY(i4);
        int address = this.mapper.getAddress(i4);
        boolean leftAvailable = this.mapper.leftAvailable(i4);
        boolean z5 = this.mapper.topAvailable(i4);
        boolean z6 = this.mapper.topLeftAvailable(i4);
        boolean z7 = this.mapper.topRightAvailable(i4);
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, new int[]{2, 16, 3});
        PartPred[] partPredArr2 = new PartPred[4];
        for (int i5 = 0; i5 < 16; i5++) {
            int[] iArr3 = iArr2[0][i5];
            iArr2[1][i5][2] = -1;
            iArr3[2] = -1;
        }
        Picture create = Picture.create(16, 16, this.chromaFormat);
        if (sliceType == SliceType.P) {
            picture2 = create;
            partPredArr = partPredArr2;
            iArr = iArr2;
            i3 = mbY;
            z3 = predict8x8P(bitReader, frameArr[0], create, z2, mbX, mbY, leftAvailable, z5, z6, z7, iArr2, partPredArr);
            mBType2 = MBType.P_8x8;
        } else {
            picture2 = create;
            partPredArr = partPredArr2;
            iArr = iArr2;
            i3 = mbY;
            z3 = predict8x8B(bitReader, frameArr, picture2, z2, mbX, i3, leftAvailable, z5, z6, z7, iArr2, partPredArr);
            mBType2 = MBType.B_8x8;
        }
        boolean z8 = z3;
        MBType mBType3 = mBType2;
        int readCodedBlockPatternInter = readCodedBlockPatternInter(bitReader, leftAvailable, z5, this.leftCBPLuma | (this.leftCBPChroma << 4), this.topCBPLuma[mbX] | (this.topCBPChroma[mbX] << 4), this.leftMBType, this.topMBType[mbX]);
        int i6 = readCodedBlockPatternInter & 15;
        int i7 = readCodedBlockPatternInter >> 4;
        if (!this.transform8x8 || i6 == 0 || !z8) {
            z4 = false;
        } else {
            z4 = readTransform8x8Flag(bitReader, leftAvailable, z5, this.leftMBType, this.topMBType[mbX], this.tf8x8Left, this.tf8x8Top[mbX]);
        }
        if (i6 > 0 || i7 > 0) {
            this.f44740qp = ((this.f44740qp + readMBQpDelta(bitReader, mBType)) + 52) % 52;
        } else {
            BitReader bitReader2 = bitReader;
        }
        this.mbQps[0][address] = this.f44740qp;
        boolean z9 = this.tf8x8Left;
        BitReader bitReader3 = bitReader;
        boolean z10 = z9;
        int i8 = readCodedBlockPatternInter;
        boolean z11 = z4;
        boolean z12 = z11;
        int i9 = i7;
        int i10 = i6;
        residualLuma(bitReader3, leftAvailable, z5, mbX, i3, picture, i8, mBType3, z11, z10, this.tf8x8Top[mbX]);
        int[][][] iArr4 = iArr;
        int i11 = i3;
        saveMvs(iArr4, mbX, i11);
        MBType mBType4 = mBType3;
        int i12 = mbX;
        decodeChromaInter(bitReader3, i9, frameArr, iArr4, partPredArr, leftAvailable, z5, mbX, i11, address, this.f44740qp, picture, picture2);
        mergeResidual(picture3, picture2);
        int i13 = i12;
        collectPredictors(picture3, i13);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        MBType mBType5 = mBType4;
        this.leftMBType = mBType5;
        mBTypeArr2[i13] = mBType5;
        mBTypeArr[address] = mBType5;
        int[] iArr5 = this.topCBPLuma;
        int i14 = i10;
        this.leftCBPLuma = i14;
        iArr5[i13] = i14;
        int[] iArr6 = this.topCBPChroma;
        int i15 = i9;
        this.leftCBPChroma = i15;
        iArr6[i13] = i15;
        boolean z13 = z12;
        this.tf8x8Top[i13] = z13;
        this.tf8x8Left = z13;
        this.tr8x8Used[address] = z13;
    }

    public void decodeMBlockIPCM(BitReader bitReader, int i, Picture picture) {
        int mbX = this.mapper.getMbX(i);
        bitReader.align();
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = bitReader.readNBit(8);
        }
        ColorSpace colorSpace = this.chromaFormat;
        int i3 = (16 >> colorSpace.compWidth[1]) * 2 * (16 >> colorSpace.compHeight[1]);
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr2[i4] = bitReader.readNBit(8);
        }
        collectPredictors(picture, mbX);
    }

    public void decodeMBlockIntra16x16(BitReader bitReader, int i, int i2, MBType mBType, Picture picture) {
        BitReader bitReader2 = bitReader;
        int i3 = i2;
        Picture picture2 = picture;
        int mbX = this.mapper.getMbX(i3);
        int mbY = this.mapper.getMbY(i3);
        int address = this.mapper.getAddress(i3);
        int i4 = (i / 4) % 3;
        int i5 = (i / 12) * 15;
        boolean leftAvailable = this.mapper.leftAvailable(i3);
        boolean z = this.mapper.topAvailable(i3);
        int readChromaPredMode = readChromaPredMode(bitReader2, mbX, leftAvailable, z);
        this.f44740qp = ((this.f44740qp + readMBQpDelta(bitReader2, mBType)) + 52) % 52;
        this.mbQps[0][address] = this.f44740qp;
        BitReader bitReader3 = bitReader;
        int i6 = mbX;
        int i7 = address;
        int i8 = mbY;
        boolean z2 = z;
        boolean z3 = leftAvailable;
        residualLumaI16x16(bitReader3, leftAvailable, z, i6, i8, picture, i5);
        Intra16x16PredictionBuilder.predictWithMode(i % 4, picture2.getPlaneData(0), z3, z2, this.leftRow[0], this.topLine[0], this.topLeft[0], mbX << 4);
        int i9 = i5;
        int i10 = this.f44740qp;
        int i11 = mbY;
        int i12 = i4;
        decodeChroma(bitReader3, i4, readChromaPredMode, i6, i8, z3, z2, picture, i10, MBType.I_16x16);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        MBType mBType2 = MBType.I_16x16;
        this.leftMBType = mBType2;
        mBTypeArr2[mbX] = mBType2;
        mBTypeArr[i7] = mBType2;
        int[] iArr = this.topCBPLuma;
        this.leftCBPLuma = i9;
        iArr[mbX] = i9;
        int[] iArr2 = this.topCBPChroma;
        this.leftCBPChroma = i12;
        iArr2[mbX] = i12;
        this.tf8x8Top[mbX] = false;
        this.tf8x8Left = false;
        collectPredictors(picture2, mbX);
        saveMvsIntra(mbX, i11);
    }

    public void decodeMBlockIntraNxN(BitReader bitReader, int i, MBType mBType, Picture picture) {
        int[] iArr;
        boolean z;
        int i2;
        Picture picture2;
        BitReader bitReader2 = bitReader;
        int i3 = i;
        Picture picture3 = picture;
        int mbX = this.mapper.getMbX(i3);
        int mbY = this.mapper.getMbY(i3);
        int address = this.mapper.getAddress(i3);
        boolean leftAvailable = this.mapper.leftAvailable(i3);
        boolean z2 = this.mapper.topAvailable(i3);
        boolean z3 = this.mapper.topLeftAvailable(i3);
        boolean z4 = this.mapper.topRightAvailable(i3);
        boolean readTransform8x8Flag = this.transform8x8 ? readTransform8x8Flag(bitReader, leftAvailable, z2, this.leftMBType, this.topMBType[mbX], this.tf8x8Left, this.tf8x8Top[mbX]) : false;
        if (!readTransform8x8Flag) {
            int[] iArr2 = new int[16];
            int i4 = 0;
            for (int i5 = 16; i4 < i5; i5 = 16) {
                int i6 = i4;
                int[] iArr3 = iArr2;
                boolean z5 = readTransform8x8Flag;
                iArr3[i6] = readPredictionI4x4Block(bitReader, leftAvailable, z2, this.leftMBType, this.topMBType[mbX], H264Const.MB_BLK_OFF_LEFT[i4], H264Const.MB_BLK_OFF_TOP[i4], mbX);
                i4 = i6 + 1;
                Picture picture4 = picture;
                readTransform8x8Flag = z5;
                iArr2 = iArr3;
            }
            z = readTransform8x8Flag;
            i2 = 4;
            iArr = iArr2;
        } else {
            z = readTransform8x8Flag;
            i2 = 4;
            int[] iArr4 = new int[4];
            int i7 = 0;
            while (i7 < 4) {
                int i8 = (i7 & 1) << 1;
                int i9 = i7 & 2;
                int i10 = i7;
                int[] iArr5 = iArr4;
                iArr5[i10] = readPredictionI4x4Block(bitReader, leftAvailable, z2, this.leftMBType, this.topMBType[mbX], i8, i9, mbX);
                int[] iArr6 = this.i4x4PredLeft;
                iArr6[i9 + 1] = iArr6[i9];
                int[] iArr7 = this.i4x4PredTop;
                int i11 = (mbX << 2) + i8;
                iArr7[i11 + 1] = iArr7[i11];
                i7 = i10 + 1;
                iArr4 = iArr5;
            }
            iArr = iArr4;
        }
        int readChromaPredMode = readChromaPredMode(bitReader2, mbX, leftAvailable, z2);
        int readCodedBlockPatternIntra = readCodedBlockPatternIntra(bitReader, leftAvailable, z2, this.leftCBPLuma | (this.leftCBPChroma << i2), this.topCBPLuma[mbX] | (this.topCBPChroma[mbX] << i2), this.leftMBType, this.topMBType[mbX]);
        int i12 = readCodedBlockPatternIntra & 15;
        int i13 = readCodedBlockPatternIntra >> 4;
        if (i12 > 0 || i13 > 0) {
            this.f44740qp = ((this.f44740qp + readMBQpDelta(bitReader2, mBType)) + 52) % 52;
        }
        this.mbQps[0][address] = this.f44740qp;
        int i14 = i13;
        int i15 = i12;
        boolean z6 = z2;
        boolean z7 = leftAvailable;
        int i16 = mbY;
        residualLuma(bitReader, leftAvailable, z2, mbX, mbY, picture, readCodedBlockPatternIntra, MBType.I_NxN, z, this.tf8x8Left, this.tf8x8Top[mbX]);
        boolean z8 = z;
        if (!z8) {
            for (int i17 = 0; i17 < 16; i17++) {
                int i18 = (i17 & 3) << 2;
                int i19 = i17 & -4;
                int i20 = H264Const.BLK_INV_MAP[i17];
                Intra4x4PredictionBuilder.predictWithMode(iArr[i20], picture.getPlaneData(0), i18 == 0 ? z7 : true, i19 == 0 ? z6 : true, ((i20 == 0 || i20 == 1 || i20 == i2) && z6) || (i20 == 5 && z4) || i20 == 2 || i20 == 6 || i20 == 8 || i20 == 9 || i20 == 10 || i20 == 12 || i20 == 14, this.leftRow[0], this.topLine[0], this.topLeft[0], mbX << 4, i18, i19);
            }
            picture2 = picture;
        } else {
            picture2 = picture;
            int i21 = 0;
            while (i21 < i2) {
                int i22 = (i21 & 1) << 1;
                int i23 = i21 & 2;
                boolean z9 = (i21 == 0 && z6) || (i21 == 1 && z4) || i21 == 2;
                boolean z10 = i21 == 0 ? z3 : i21 == 1 ? z6 : i21 == 2 ? z7 : true;
                Intra8x8PredictionBuilder.predictWithMode(iArr[i21], picture2.getPlaneData(0), i22 == 0 ? z7 : true, i23 == 0 ? z6 : true, z10, z9, this.leftRow[0], this.topLine[0], this.topLeft[0], mbX << 4, i22 << 2, i23 << 2);
                i21++;
            }
        }
        Picture picture5 = picture2;
        decodeChroma(bitReader, i14, readChromaPredMode, mbX, i16, z7, z6, picture, this.f44740qp, MBType.I_NxN);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        MBType mBType2 = MBType.I_NxN;
        this.leftMBType = mBType2;
        mBTypeArr2[mbX] = mBType2;
        mBTypeArr[address] = mBType2;
        int[] iArr8 = this.topCBPLuma;
        int i24 = i15;
        this.leftCBPLuma = i24;
        iArr8[mbX] = i24;
        int[] iArr9 = this.topCBPChroma;
        int i25 = i14;
        this.leftCBPChroma = i25;
        iArr9[mbX] = i25;
        this.tf8x8Top[mbX] = z8;
        this.tf8x8Left = z8;
        this.tr8x8Used[address] = z8;
        collectChromaPredictors(picture5, mbX);
        saveMvsIntra(mbX, i16);
    }

    public void decodeSkip(Frame[][] frameArr, int i, Picture picture, SliceType sliceType) {
        char c;
        int i2;
        int i3;
        PartPred[] partPredArr;
        int[][][] iArr;
        int i4 = i;
        int mbX = this.mapper.getMbX(i4);
        int mbY = this.mapper.getMbY(i4);
        int address = this.mapper.getAddress(i4);
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, new int[]{2, 16, 3});
        PartPred[] partPredArr2 = new PartPred[4];
        for (int i5 = 0; i5 < 16; i5++) {
            int[] iArr3 = iArr2[0][i5];
            iArr2[1][i5][2] = -1;
            iArr3[2] = -1;
        }
        if (sliceType == SliceType.P) {
            i3 = address;
            partPredArr = partPredArr2;
            predictPSkip(frameArr, mbX, mbY, this.mapper.leftAvailable(i4), this.mapper.topAvailable(i4), this.mapper.topLeftAvailable(i4), this.mapper.topRightAvailable(i4), iArr2, picture);
            Arrays.fill(partPredArr, PartPred.L0);
            i2 = mbY;
            c = 2;
            iArr = iArr2;
        } else {
            i3 = address;
            partPredArr = partPredArr2;
            i2 = mbY;
            iArr = iArr2;
            c = 2;
            predictBDirect(frameArr, mbX, mbY, this.mapper.leftAvailable(i4), this.mapper.topAvailable(i4), this.mapper.topLeftAvailable(i4), this.mapper.topRightAvailable(i4), iArr2, partPredArr2, picture, H264Const.identityMapping4);
            savePrediction8x8(mbX, iArr[0], 0);
            savePrediction8x8(mbX, iArr[1], 1);
        }
        decodeChromaSkip(frameArr, iArr, partPredArr, mbX, i2, picture);
        collectPredictors(picture, mbX);
        saveMvs(iArr, mbX, i2);
        MBType[] mBTypeArr = this.mbTypes;
        MBType[] mBTypeArr2 = this.topMBType;
        this.leftMBType = null;
        mBTypeArr2[mbX] = null;
        mBTypeArr[i3] = null;
        int[][] iArr4 = this.mbQps;
        int[] iArr5 = iArr4[0];
        int i6 = this.f44740qp;
        iArr5[i3] = i6;
        iArr4[1][i3] = calcQpChroma(i6, this.chromaQpOffset[0]);
        this.mbQps[c][i3] = calcQpChroma(this.f44740qp, this.chromaQpOffset[1]);
    }

    public void predictBDirect(Frame[][] frameArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int[][][] iArr, PartPred[] partPredArr, Picture picture, int[] iArr2) {
        if (this.f44741sh.direct_spatial_mv_pred_flag) {
            predictBSpatialDirect(frameArr, i, i2, z, z2, z3, z4, iArr, partPredArr, picture, iArr2);
        } else {
            predictBTemporalDirect(frameArr, i, i2, z, z2, z3, z4, iArr, partPredArr, picture, iArr2);
        }
    }

    public void predictChromaInter(Frame[][] frameArr, int[][][] iArr, int i, int i2, int i3, Picture picture, PartPred[] partPredArr) {
        int i4 = i3;
        Picture picture2 = picture;
        int i5 = 2;
        Picture[] pictureArr = {Picture.create(16, 16, this.chromaFormat), Picture.create(16, 16, this.chromaFormat)};
        int i6 = 0;
        while (i6 < 4) {
            for (int i7 = 0; i7 < i5; i7++) {
                if (partPredArr[i6].usesList(i7)) {
                    for (int i8 = 0; i8 < 4; i8++) {
                        int i9 = H264Const.BLK_INV_MAP[(i6 << 2) + i8];
                        int[] iArr2 = iArr[i7][i9];
                        Frame frame = frameArr[i7][iArr2[i5]];
                        int i10 = (i9 & 3) << 1;
                        int i11 = (i9 >> i5) << 1;
                        BlockInterpolator.getBlockChroma(frame.getPlaneData(i4), frame.getPlaneWidth(i4), frame.getPlaneHeight(i4), pictureArr[i7].getPlaneData(i4), (i11 * picture2.getPlaneWidth(i4)) + i10, picture2.getPlaneWidth(i4), ((i + i10) << 3) + iArr2[0], ((i2 + i11) << 3) + iArr2[1], 2, 2);
                    }
                }
            }
            int i12 = H264Const.BLK8x8_BLOCKS[i6][0];
            int i13 = i6;
            Picture[] pictureArr2 = pictureArr;
            this.prediction.mergePrediction(iArr[0][i12][i5], iArr[1][i12][i5], partPredArr[i6], i3, pictureArr[0].getPlaneData(i4), pictureArr[1].getPlaneData(i4), H264Const.BLK_8x8_MB_OFF_CHROMA[i6], picture2.getPlaneWidth(i4), 4, 4, picture2.getPlaneData(i4), frameArr, this.thisFrame);
            i6 = i13 + 1;
            picture2 = picture;
            pictureArr = pictureArr2;
            i5 = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca A[LOOP:0: B:18:0x00c6->B:20:0x00ca, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void predictPSkip(org.jcodec.codecs.h264.p552io.model.Frame[][] r31, int r32, int r33, boolean r34, boolean r35, boolean r36, boolean r37, int[][][] r38, org.jcodec.common.model.Picture r39) {
        /*
            r30 = this;
            r11 = r30
            r12 = r39
            r13 = 2
            r14 = 1
            r15 = 0
            if (r34 == 0) goto L_0x0066
            if (r35 == 0) goto L_0x0066
            int[][][] r0 = r11.mvTop
            r0 = r0[r15]
            int r1 = r32 << 2
            r16 = r0[r1]
            int[][][] r0 = r11.mvLeft
            r0 = r0[r15]
            r17 = r0[r15]
            r0 = r17[r15]
            if (r0 != 0) goto L_0x0025
            r0 = r17[r14]
            if (r0 != 0) goto L_0x0025
            r0 = r17[r13]
            if (r0 == 0) goto L_0x0066
        L_0x0025:
            r0 = r16[r15]
            if (r0 != 0) goto L_0x0031
            r0 = r16[r14]
            if (r0 != 0) goto L_0x0031
            r0 = r16[r13]
            if (r0 == 0) goto L_0x0066
        L_0x0031:
            int[][][] r0 = r11.mvTop
            r0 = r0[r15]
            int r18 = r1 + 4
            r3 = r0[r18]
            int[][] r0 = r11.mvTopLeft
            r4 = r0[r15]
            r9 = 0
            r10 = 0
            r0 = r30
            r1 = r17
            r2 = r16
            r5 = r34
            r6 = r35
            r7 = r37
            r8 = r36
            int r19 = r0.calcMVPredictionMedian(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int[][][] r0 = r11.mvTop
            r0 = r0[r15]
            r3 = r0[r18]
            int[][] r0 = r11.mvTopLeft
            r4 = r0[r15]
            r10 = 1
            r0 = r30
            int r0 = r0.calcMVPredictionMedian(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8 = r0
            r7 = r19
            goto L_0x0068
        L_0x0066:
            r7 = 0
            r8 = 0
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MV_SKIP: ("
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ","
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.debugPrint(r0)
            int r0 = r32 << 1
            org.jcodec.codecs.h264.H264Const$PartPred[] r1 = r11.predModeLeft
            org.jcodec.codecs.h264.H264Const$PartPred[] r2 = r11.predModeTop
            int r3 = r0 + 1
            org.jcodec.codecs.h264.H264Const$PartPred r4 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r2[r3] = r4
            r2[r0] = r4
            r1[r14] = r4
            r1[r15] = r4
            int r2 = r32 << 2
            int[][] r0 = r11.mvTopLeft
            r0 = r0[r15]
            int[][][] r1 = r11.mvTop
            r1 = r1[r15]
            int r3 = r2 + 3
            r1 = r1[r3]
            r11.copyVect(r0, r1)
            int[][][] r0 = r11.mvTop
            r1 = r0[r15]
            int r3 = r2 + 4
            r6 = 0
            r0 = r30
            r4 = r7
            r5 = r8
            r0.saveVect(r1, r2, r3, r4, r5, r6)
            int[][][] r0 = r11.mvLeft
            r1 = r0[r15]
            r2 = 0
            r3 = 4
            r0 = r30
            r0.saveVect(r1, r2, r3, r4, r5, r6)
            r0 = 0
        L_0x00c6:
            r1 = 16
            if (r0 >= r1) goto L_0x00df
            r1 = r38[r15]
            r1 = r1[r0]
            r1[r15] = r7
            r1 = r38[r15]
            r1 = r1[r0]
            r1[r14] = r8
            r1 = r38[r15]
            r1 = r1[r0]
            r1[r13] = r15
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00df:
            r0 = r31[r15]
            r0 = r0[r15]
            r1 = 0
            int r2 = r32 << 6
            int r2 = r2 + r7
            int r3 = r33 << 6
            int r3 = r3 + r8
            r4 = 16
            r5 = 16
            r32 = r0
            r33 = r39
            r34 = r1
            r35 = r2
            r36 = r3
            r37 = r4
            r38 = r5
            org.jcodec.codecs.h264.decode.BlockInterpolator.getBlockLuma(r32, r33, r34, r35, r36, r37, r38)
            org.jcodec.codecs.h264.decode.Prediction r0 = r11.prediction
            r17 = 0
            r18 = 0
            org.jcodec.codecs.h264.H264Const$PartPred r19 = org.jcodec.codecs.h264.H264Const.PartPred.L0
            r20 = 0
            int[] r21 = r12.getPlaneData(r15)
            r22 = 0
            r23 = 0
            r24 = 16
            r25 = 16
            r26 = 16
            int[] r27 = r12.getPlaneData(r15)
            org.jcodec.codecs.h264.io.model.Frame r1 = r11.thisFrame
            r16 = r0
            r28 = r31
            r29 = r1
            r16.mergePrediction(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.SliceDecoder.predictPSkip(org.jcodec.codecs.h264.io.model.Frame[][], int, int, boolean, boolean, boolean, boolean, int[][][], org.jcodec.common.model.Picture):void");
    }

    public void put(Picture picture, Picture picture2, int i, int i2) {
        Picture picture3 = picture;
        Picture picture4 = picture2;
        int[] planeData = picture3.getPlaneData(0);
        int planeWidth = picture3.getPlaneWidth(0);
        int[] planeData2 = picture3.getPlaneData(1);
        int[] planeData3 = picture3.getPlaneData(2);
        int planeWidth2 = picture3.getPlaneWidth(1);
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            System.arraycopy(picture4.getPlaneData(0), i3, planeData, (((i2 * 16) + i4) * planeWidth) + (i * 16), 16);
            i3 += 16;
        }
        for (int i5 = 0; i5 < 8; i5++) {
            System.arraycopy(picture4.getPlaneData(1), i5 * 8, planeData2, (((i2 * 8) + i5) * planeWidth2) + (i * 8), 8);
        }
        for (int i6 = 0; i6 < 8; i6++) {
            System.arraycopy(picture4.getPlaneData(2), i6 * 8, planeData3, (((i2 * 8) + i6) * planeWidth2) + (i * 8), 8);
        }
    }

    /* access modifiers changed from: protected */
    public int readCodedBlockPatternInter(BitReader bitReader, boolean z, boolean z2, int i, int i2, MBType mBType, MBType mBType2) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return H264Const.CODED_BLOCK_PATTERN_INTER_COLOR[CAVLCReader.readUE(bitReader, "coded_block_pattern")];
        }
        return this.cabac.codedBlockPatternIntra(this.mDecoder, z, z2, i, i2, mBType, mBType2);
    }

    /* access modifiers changed from: protected */
    public int readCodedBlockPatternIntra(BitReader bitReader, boolean z, boolean z2, int i, int i2, MBType mBType, MBType mBType2) {
        if (!this.activePps.entropy_coding_mode_flag) {
            return H264Const.CODED_BLOCK_PATTERN_INTRA_COLOR[CAVLCReader.readUE(bitReader, "coded_block_pattern")];
        }
        return this.cabac.codedBlockPatternIntra(this.mDecoder, z, z2, i, i2, mBType, mBType2);
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    private void residualLuma(BitReader bitReader, boolean z, boolean z2, int i, int i2, Picture picture, int i3, MBType mBType) {
        int i4;
        int i5 = i3;
        int i6 = i5 & 15;
        char c = 0;
        int i7 = 0;
        while (i7 < 16) {
            int i8 = H264Const.MB_BLK_OFF_LEFT[i7];
            int i9 = H264Const.MB_BLK_OFF_TOP[i7];
            int i10 = (i << 2) + i8;
            int i11 = (i2 << 2) + i9;
            boolean z3 = true;
            if ((i6 & (1 << (i7 >> 2))) == 0) {
                if (!this.activePps.entropy_coding_mode_flag) {
                    this.cavlc[c].setZeroCoeff(i10, i9);
                }
                Picture picture2 = picture;
                i4 = i7;
            } else {
                int[] iArr = new int[16];
                if (!this.activePps.entropy_coding_mode_flag) {
                    int[] iArr2 = this.nCoeff[i11];
                    CAVLC cavlc2 = this.cavlc[c];
                    boolean z4 = i8 != 0 || z;
                    MBType mBType2 = i8 == 0 ? this.leftMBType : mBType;
                    if (i9 == 0 && !z2) {
                        z3 = false;
                    }
                    iArr2[i10] = cavlc2.readACBlock(bitReader, iArr, i10, i9, z4, mBType2, z3, i9 == 0 ? this.topMBType[i] : mBType, 0, 16, CoeffTransformer.zigzag4x4);
                } else {
                    if (this.cabac.readCodedBlockFlagLumaAC(this.mDecoder, BlockType.LUMA_16, i10, i9, 0, this.leftMBType, this.topMBType[i], z, z2, this.leftCBPLuma, this.topCBPLuma[i], i6, mBType) == 1) {
                        int[] iArr3 = this.nCoeff[i11];
                        CABAC cabac2 = this.cabac;
                        MDecoder mDecoder2 = this.mDecoder;
                        BlockType blockType = BlockType.LUMA_16;
                        int[] iArr4 = CoeffTransformer.zigzag4x4;
                        int[] iArr5 = H264Const.identityMapping16;
                        iArr3[i10] = cabac2.readCoeffs(mDecoder2, blockType, iArr, 0, 16, iArr4, iArr5, iArr5);
                    }
                }
                CoeffTransformer.dequantizeAC(iArr, this.f44740qp);
                CoeffTransformer.idct4x4(iArr);
                i4 = i7;
                putBlk(picture.getPlaneData(0), iArr, 4, i8 << 2, i9 << 2);
            }
            i7 = i4 + 1;
            c = 0;
        }
        if (this.activePps.entropy_coding_mode_flag) {
            this.cabac.setPrevCBP(i5);
        }
    }

    public MBType decode(SliceType sliceType, int i, BitReader bitReader, boolean z, MBType mBType, Picture picture, Frame[][] frameArr) {
        if (sliceType == SliceType.I) {
            return decodeMBlockI(i, bitReader, z, mBType, picture);
        }
        if (sliceType == SliceType.P) {
            return decodeMBlockP(i, bitReader, z, mBType, picture, frameArr);
        }
        return decodeMBlockB(i, bitReader, z, mBType, picture, frameArr);
    }
}
