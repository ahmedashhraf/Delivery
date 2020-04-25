package org.jcodec.codecs.h264;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import org.jcodec.codecs.h264.decode.CoeffTransformer;
import org.jcodec.codecs.h264.encode.DumbRateControl;
import org.jcodec.codecs.h264.encode.RateControl;
import org.jcodec.codecs.h264.p552io.CAVLC;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.RefPicMarkingIDR;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.h264.p552io.model.SliceType;
import org.jcodec.codecs.h264.p552io.write.CAVLCWriter;
import org.jcodec.codecs.h264.p552io.write.SliceHeaderWriter;
import org.jcodec.common.ArrayUtil;
import org.jcodec.common.VideoEncoder;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Size;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.common.tools.MathUtil;

public class H264Encoder implements VideoEncoder {
    private CAVLC[] cavlc;
    private int[][] leftRow;

    /* renamed from: rc */
    private RateControl f44737rc;
    private int[][] topLine;

    public H264Encoder() {
        this(new DumbRateControl());
    }

    private void chroma(Picture picture, int i, int i2, BitWriter bitWriter, int i3, Picture picture2) {
        int i4 = i3;
        int i5 = picture.getColor().compWidth[1];
        int i6 = picture.getColor().compHeight[1];
        int i7 = i << (4 - i5);
        int i8 = i2 << (4 - i6);
        Picture picture3 = picture;
        int i9 = i3;
        int i10 = i5;
        int i11 = i6;
        int i12 = i7;
        int i13 = i8;
        int[][] transformChroma = transformChroma(picture3, 1, i9, i10, i11, i12, i13, picture2);
        int[][] transformChroma2 = transformChroma(picture3, 2, i9, i10, i11, i12, i13, picture2);
        int[] extractDC = extractDC(transformChroma);
        int i14 = i << 1;
        int i15 = i2 << 1;
        int i16 = i;
        int i17 = i2;
        BitWriter bitWriter2 = bitWriter;
        int i18 = i3;
        int i19 = i14;
        int[] extractDC2 = extractDC(transformChroma2);
        int i20 = i15;
        int[] iArr = extractDC;
        writeDC(1, i16, i17, bitWriter2, i18, i19, i20, extractDC);
        writeDC(2, i16, i17, bitWriter2, i18, i19, i20, extractDC2);
        int i21 = i14;
        int i22 = i15;
        int i23 = i3;
        writeAC(1, i16, i17, bitWriter2, i21, i22, transformChroma, i23);
        writeAC(2, i16, i17, bitWriter2, i21, i22, transformChroma2, i23);
        restorePlane(iArr, transformChroma, i4);
        putChroma(picture2.getData()[1], 1, i7, i8, transformChroma);
        restorePlane(extractDC2, transformChroma2, i4);
        putChroma(picture2.getData()[2], 2, i7, i8, transformChroma2);
    }

    private int chromaPredBlk0(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0 && i3 != 0) {
            return chromaPredTwo(this.leftRow[i], this.topLine[i], i4, i2);
        }
        if (i2 != 0) {
            return chromaPredOne(this.leftRow[i], i4);
        }
        if (i3 != 0) {
            return chromaPredOne(this.topLine[i], i2);
        }
        return 128;
    }

    private int chromaPredBlk1(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i3 != 0) {
            return chromaPredOne(this.topLine[i], i2 + 4);
        }
        if (i2 != 0) {
            return chromaPredOne(this.leftRow[i], i4);
        }
        return 128;
    }

    private int chromaPredBlk2(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0) {
            return chromaPredOne(this.leftRow[i], i4 + 4);
        }
        if (i3 != 0) {
            return chromaPredOne(this.topLine[i], i2);
        }
        return 128;
    }

    private int chromaPredBlk3(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0 && i3 != 0) {
            return chromaPredTwo(this.leftRow[i], this.topLine[i], i4 + 4, i2 + 4);
        }
        if (i2 != 0) {
            return chromaPredOne(this.leftRow[i], i4 + 4);
        }
        if (i3 != 0) {
            return chromaPredOne(this.topLine[i], i2 + 4);
        }
        return 128;
    }

    private final int chromaPredOne(int[] iArr, int i) {
        return ((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + 2) >> 2;
    }

    private final int chromaPredTwo(int[] iArr, int[] iArr2, int i, int i2) {
        return ((((((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + iArr2[i2]) + iArr2[i2 + 1]) + iArr2[i2 + 2]) + iArr2[i2 + 3]) + 4) >> 3;
    }

    private void collectPredictors(Picture picture, int i) {
        System.arraycopy(picture.getPlaneData(0), 240, this.topLine[0], i << 4, 16);
        int i2 = i << 3;
        System.arraycopy(picture.getPlaneData(1), 56, this.topLine[1], i2, 8);
        System.arraycopy(picture.getPlaneData(2), 56, this.topLine[2], i2, 8);
        copyCol(picture.getPlaneData(0), 15, 16, this.leftRow[0]);
        copyCol(picture.getPlaneData(1), 7, 8, this.leftRow[1]);
        copyCol(picture.getPlaneData(2), 7, 8, this.leftRow[2]);
    }

    private void copyCol(int[] iArr, int i, int i2, int[] iArr2) {
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            iArr2[i3] = iArr[i];
            i += i2;
        }
    }

    private void encodeMacroblock(Picture picture, int i, int i2, BitWriter bitWriter, Picture picture2, int i3, int i4) {
        CAVLCWriter.writeUE(bitWriter, 0);
        CAVLCWriter.writeSE(bitWriter, i4);
        Picture picture3 = picture;
        int i5 = i;
        int i6 = i2;
        BitWriter bitWriter2 = bitWriter;
        int i7 = i3;
        Picture picture4 = picture2;
        luma(picture3, i5, i6, bitWriter2, i7, picture4);
        chroma(picture3, i5, i6, bitWriter2, i7, picture4);
    }

    private void encodeSlice(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, Picture picture, ByteBuffer byteBuffer, boolean z, int i) {
        BitWriter fork;
        int i2;
        SeqParameterSet seqParameterSet2 = seqParameterSet;
        PictureParameterSet pictureParameterSet2 = pictureParameterSet;
        ByteBuffer byteBuffer2 = byteBuffer;
        boolean z2 = z;
        this.cavlc = new CAVLC[]{new CAVLC(seqParameterSet2, pictureParameterSet2, 2, 2), new CAVLC(seqParameterSet2, pictureParameterSet2, 1, 1), new CAVLC(seqParameterSet2, pictureParameterSet2, 1, 1)};
        this.f44737rc.reset();
        int initQp = this.f44737rc.getInitQp();
        byteBuffer2.putInt(1);
        new NALUnit(z2 ? NALUnitType.IDR_SLICE : NALUnitType.NON_IDR_SLICE, 2).write(byteBuffer2);
        SliceHeader sliceHeader = new SliceHeader();
        sliceHeader.slice_type = SliceType.I;
        if (z2) {
            sliceHeader.refPicMarkingIDR = new RefPicMarkingIDR(false, false);
        }
        sliceHeader.pps = pictureParameterSet2;
        sliceHeader.sps = seqParameterSet2;
        sliceHeader.pic_order_cnt_lsb = i << 1;
        BitWriter bitWriter = new BitWriter(ByteBuffer.allocate(picture.getWidth() * picture.getHeight()));
        new SliceHeaderWriter().write(sliceHeader, z2, 2, bitWriter);
        Picture create = Picture.create(16, 16, ColorSpace.YUV420);
        int i3 = 0;
        while (i3 < seqParameterSet2.pic_height_in_map_units_minus1 + 1) {
            int i4 = initQp;
            BitWriter bitWriter2 = bitWriter;
            int i5 = 0;
            while (i5 < seqParameterSet2.pic_width_in_mbs_minus1 + 1) {
                CAVLCWriter.writeUE(bitWriter2, 23);
                while (true) {
                    fork = bitWriter2.fork();
                    int qpDelta = this.f44737rc.getQpDelta();
                    i2 = i4 + qpDelta;
                    BitWriter bitWriter3 = bitWriter2;
                    encodeMacroblock(picture, i5, i3, fork, create, i2, qpDelta);
                    if (this.f44737rc.accept(fork.position() - bitWriter3.position())) {
                        break;
                    }
                    bitWriter2 = bitWriter3;
                }
                collectPredictors(create, i5);
                i5++;
                bitWriter2 = fork;
                i4 = i2;
            }
            i3++;
            initQp = i4;
            bitWriter = bitWriter2;
        }
        bitWriter.write1Bit(1);
        bitWriter.flush();
        ByteBuffer buffer = bitWriter.getBuffer();
        buffer.flip();
        H264Utils.escapeNAL(buffer, byteBuffer2);
    }

    private int[] extractDC(int[][] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i][0];
            iArr[i][0] = 0;
        }
        return iArr2;
    }

    private void luma(Picture picture, int i, int i2, BitWriter bitWriter, int i3, Picture picture2) {
        int i4 = i << 4;
        int i5 = i2 << 4;
        int[][] transform = transform(picture, 0, i3, 0, 0, i4, i5);
        int[] extractDC = extractDC(transform);
        int i6 = i << 2;
        int i7 = i2 << 2;
        int i8 = i;
        int i9 = i2;
        BitWriter bitWriter2 = bitWriter;
        writeDC(0, i8, i9, bitWriter2, i3, i6, i7, extractDC);
        writeAC(0, i8, i9, bitWriter2, i6, i7, transform, i3);
        restorePlane(extractDC, transform, i3);
        putLuma(picture2.getPlaneData(0), lumaDCPred(i4, i5), transform, 4);
    }

    private int lumaDCPred(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return 128;
        }
        if (i2 == 0) {
            return (ArrayUtil.sum(this.leftRow[0]) + 8) >> 4;
        }
        if (i == 0) {
            return (ArrayUtil.sum(this.topLine[0], i, 16) + 8) >> 4;
        }
        return ((ArrayUtil.sum(this.leftRow[0]) + ArrayUtil.sum(this.topLine[0], i, 16)) + 16) >> 5;
    }

    private void putBlk(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = 1 << i2;
        int i6 = (i4 << i2) + i3;
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            iArr[i6] = MathUtil.clip(iArr2[i7] + i, 0, 255);
            iArr[i6 + 1] = MathUtil.clip(iArr2[i7 + 1] + i, 0, 255);
            iArr[i6 + 2] = MathUtil.clip(iArr2[i7 + 2] + i, 0, 255);
            iArr[i6 + 3] = MathUtil.clip(iArr2[i7 + 3] + i, 0, 255);
            i7 += 4;
            i6 += i5;
        }
    }

    private void putChroma(int[] iArr, int i, int i2, int i3, int[][] iArr2) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int[] iArr3 = iArr;
        putBlk(iArr3, chromaPredBlk0(i, i2, i3), iArr2[0], 3, 0, 0);
        putBlk(iArr3, chromaPredBlk1(i, i2, i3), iArr2[1], 3, 4, 0);
        putBlk(iArr3, chromaPredBlk2(i, i2, i3), iArr2[2], 3, 0, 4);
        putBlk(iArr3, chromaPredBlk3(i, i2, i3), iArr2[3], 3, 4, 4);
    }

    private void putLuma(int[] iArr, int i, int[][] iArr2, int i2) {
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            putBlk(iArr, i, iArr2[i3], i2, H264Const.BLK_X[i3], H264Const.BLK_Y[i3]);
        }
    }

    private void restorePlane(int[] iArr, int[][] iArr2, int i) {
        if (iArr.length == 4) {
            CoeffTransformer.invDC2x2(iArr);
            CoeffTransformer.dequantizeDC2x2(iArr, i);
        } else if (iArr.length == 8) {
            CoeffTransformer.invDC4x2(iArr);
            CoeffTransformer.dequantizeDC4x2(iArr, i);
        } else {
            CoeffTransformer.invDC4x4(iArr);
            CoeffTransformer.dequantizeDC4x4(iArr, i);
            CoeffTransformer.reorderDC4x4(iArr);
        }
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            CoeffTransformer.dequantizeAC(iArr2[i2], i);
            iArr2[i2][0] = iArr[i2];
            CoeffTransformer.idct4x4(iArr2[i2]);
        }
    }

    private final void takeSubtract(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5) {
        if (i3 + 4 >= i || i4 + 4 >= i2) {
            takeSubtractUnsafe(iArr, i, i2, i3, i4, iArr2, i5);
        } else {
            takeSubtractSafe(iArr, i, i2, i3, i4, iArr2, i5);
        }
    }

    private final void takeSubtractSafe(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5) {
        int i6 = (i4 * i) + i3;
        int i7 = 0;
        int i8 = 0;
        while (i7 < 4) {
            iArr2[i8] = iArr[i6] - i5;
            iArr2[i8 + 1] = iArr[i6 + 1] - i5;
            iArr2[i8 + 2] = iArr[i6 + 2] - i5;
            iArr2[i8 + 3] = iArr[i6 + 3] - i5;
            i7++;
            i6 += i;
            i8 += 4;
        }
    }

    private final void takeSubtractUnsafe(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = i4;
        int i10 = 0;
        while (true) {
            i6 = i4 + 4;
            if (i9 >= Math.min(i6, i2)) {
                break;
            }
            int min = (i9 * i) + Math.min(i3, i);
            int i11 = i10;
            int i12 = i3;
            while (true) {
                i8 = i3 + 4;
                if (i12 >= Math.min(i8, i)) {
                    break;
                }
                int i13 = i11 + 1;
                int i14 = min + 1;
                iArr2[i11] = iArr[min] - i5;
                i12++;
                i11 = i13;
                min = i14;
            }
            int i15 = min - 1;
            while (i12 < i8) {
                int i16 = i11 + 1;
                iArr2[i11] = iArr[i15] - i5;
                i12++;
                i11 = i16;
            }
            i9++;
            i10 = i11;
        }
        while (i9 < i6) {
            int i17 = i10;
            int min2 = ((i2 * i) - i) + Math.min(i3, i);
            int i18 = i3;
            while (true) {
                i7 = i3 + 4;
                if (i18 >= Math.min(i7, i)) {
                    break;
                }
                int i19 = i17 + 1;
                int i20 = min2 + 1;
                iArr2[i17] = iArr[min2] - i5;
                i18++;
                i17 = i19;
                min2 = i20;
            }
            int i21 = min2 - 1;
            while (i18 < i7) {
                int i22 = i17 + 1;
                iArr2[i17] = iArr[i21] - i5;
                i18++;
                i17 = i22;
            }
            i9++;
            i10 = i17;
        }
    }

    private int[][] transform(Picture picture, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5;
        int i8 = i6;
        int lumaDCPred = lumaDCPred(i7, i8);
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{16 >> (i3 + i4), 16});
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int[] iArr2 = iArr[i9];
            takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i7 + H264Const.BLK_X[i9], i8 + H264Const.BLK_Y[i9], iArr2, lumaDCPred);
            CoeffTransformer.fdct4x4(iArr2);
        }
        return iArr;
    }

    private int[][] transformChroma(Picture picture, int i, int i2, int i3, int i4, int i5, int i6, Picture picture2) {
        int i7 = i;
        int i8 = i5;
        int i9 = i6;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{16 >> (i3 + i4), 16});
        int i10 = i6;
        takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i5, i10, iArr[0], chromaPredBlk0(i7, i8, i9));
        CoeffTransformer.fdct4x4(iArr[0]);
        int i11 = i8 + 4;
        takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i11, i10, iArr[1], chromaPredBlk1(i7, i8, i9));
        CoeffTransformer.fdct4x4(iArr[1]);
        int i12 = i9 + 4;
        takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i5, i12, iArr[2], chromaPredBlk2(i7, i8, i9));
        CoeffTransformer.fdct4x4(iArr[2]);
        takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i11, i12, iArr[3], chromaPredBlk3(i7, i8, i9));
        CoeffTransformer.fdct4x4(iArr[3]);
        return iArr;
    }

    private void writeAC(int i, int i2, int i3, BitWriter bitWriter, int i4, int i5, int[][] iArr, int i6) {
        int[][] iArr2 = iArr;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            CoeffTransformer.quantizeAC(iArr2[i7], i6);
            CAVLC cavlc2 = this.cavlc[i];
            int i8 = i4 + H264Const.MB_BLK_OFF_LEFT[i7];
            int i9 = i5 + H264Const.MB_BLK_OFF_TOP[i7];
            MBType mBType = MBType.I_16x16;
            cavlc2.writeACBlock(bitWriter, i8, i9, mBType, mBType, iArr2[i7], H264Const.totalZeros16, 1, 15, CoeffTransformer.zigzag4x4);
        }
    }

    private void writeDC(int i, int i2, int i3, BitWriter bitWriter, int i4, int i5, int i6, int[] iArr) {
        int i7 = i4;
        int[] iArr2 = iArr;
        if (iArr2.length == 4) {
            CoeffTransformer.quantizeDC2x2(iArr2, i7);
            CoeffTransformer.fvdDC2x2(iArr);
            this.cavlc[i].writeChrDCBlock(bitWriter, iArr, H264Const.totalZeros4, 0, iArr2.length, new int[]{0, 1, 2, 3});
        } else if (iArr2.length == 8) {
            CoeffTransformer.quantizeDC4x2(iArr2, i7);
            CoeffTransformer.fvdDC4x2(iArr);
            this.cavlc[i].writeChrDCBlock(bitWriter, iArr, H264Const.totalZeros8, 0, iArr2.length, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        } else {
            CoeffTransformer.reorderDC4x4(iArr);
            CoeffTransformer.quantizeDC4x4(iArr2, i7);
            CoeffTransformer.fvdDC4x4(iArr);
            CAVLC cavlc2 = this.cavlc[i];
            MBType mBType = MBType.I_16x16;
            cavlc2.writeLumaDCBlock(bitWriter, i5, i6, mBType, mBType, iArr, H264Const.totalZeros16, 0, 16, CoeffTransformer.zigzag4x4);
        }
    }

    private void writePPS(ByteBuffer byteBuffer, PictureParameterSet pictureParameterSet) {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        pictureParameterSet.write(allocate);
        allocate.flip();
        H264Utils.escapeNAL(allocate, byteBuffer);
    }

    private void writeSPS(ByteBuffer byteBuffer, SeqParameterSet seqParameterSet) {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        seqParameterSet.write(allocate);
        allocate.flip();
        H264Utils.escapeNAL(allocate, byteBuffer);
    }

    public ByteBuffer encodeFrame(Picture picture, ByteBuffer byteBuffer) {
        return encodeFrame(picture, byteBuffer, true, 0);
    }

    public ColorSpace[] getSupportedColorSpaces() {
        return new ColorSpace[]{ColorSpace.YUV420J};
    }

    public PictureParameterSet initPPS() {
        PictureParameterSet pictureParameterSet = new PictureParameterSet();
        pictureParameterSet.pic_init_qp_minus26 = this.f44737rc.getInitQp() - 26;
        return pictureParameterSet;
    }

    public SeqParameterSet initSPS(Size size) {
        SeqParameterSet seqParameterSet = new SeqParameterSet();
        seqParameterSet.pic_width_in_mbs_minus1 = ((size.getWidth() + 15) >> 4) - 1;
        seqParameterSet.pic_height_in_map_units_minus1 = ((size.getHeight() + 15) >> 4) - 1;
        seqParameterSet.chroma_format_idc = ColorSpace.YUV420;
        seqParameterSet.profile_idc = 66;
        seqParameterSet.level_idc = 40;
        seqParameterSet.frame_mbs_only_flag = true;
        int i = (seqParameterSet.pic_width_in_mbs_minus1 + 1) << 4;
        int i2 = (seqParameterSet.pic_height_in_map_units_minus1 + 1) << 4;
        seqParameterSet.frame_cropping_flag = (i == size.getWidth() && i2 == size.getHeight()) ? false : true;
        seqParameterSet.frame_crop_right_offset = ((i - size.getWidth()) + 1) >> 1;
        seqParameterSet.frame_crop_bottom_offset = ((i2 - size.getHeight()) + 1) >> 1;
        return seqParameterSet;
    }

    public H264Encoder(RateControl rateControl) {
        this.f44737rc = rateControl;
    }

    public ByteBuffer encodeFrame(Picture picture, ByteBuffer byteBuffer, boolean z, int i) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        SeqParameterSet initSPS = initSPS(new Size(picture.getCroppedWidth(), picture.getCroppedHeight()));
        PictureParameterSet initPPS = initPPS();
        if (z) {
            duplicate.putInt(1);
            new NALUnit(NALUnitType.SPS, 3).write(duplicate);
            writeSPS(duplicate, initSPS);
            duplicate.putInt(1);
            new NALUnit(NALUnitType.PPS, 3).write(duplicate);
            writePPS(duplicate, initPPS);
        }
        int i2 = initSPS.pic_width_in_mbs_minus1 + 1;
        this.leftRow = new int[][]{new int[16], new int[8], new int[8]};
        int i3 = i2 << 3;
        this.topLine = new int[][]{new int[(i2 << 4)], new int[i3], new int[i3]};
        encodeSlice(initSPS, initPPS, picture, duplicate, z, i);
        duplicate.flip();
        return duplicate;
    }
}
