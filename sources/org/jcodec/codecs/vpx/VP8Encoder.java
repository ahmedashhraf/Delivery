package org.jcodec.codecs.vpx;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.jcodec.codecs.common.biari.VPxBooleanEncoder;
import org.jcodec.common.ArrayUtil;
import org.jcodec.common.VideoEncoder;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class VP8Encoder implements VideoEncoder {
    private VPXBitstream bitstream;
    private ByteBuffer dataBuffer;
    private ByteBuffer headerBuffer;
    private int[][] leftRow;
    private VPXQuantizer quantizer;

    /* renamed from: rc */
    private RateControl f44789rc;
    private int[] tmp;
    private int[][] topLine;

    public VP8Encoder(int i) {
        this((RateControl) new NopRateControl(i));
    }

    private int[] calcSegmentProbs(int[] iArr) {
        int[] iArr2 = new int[3];
        for (int i : iArr) {
            if (i == 0) {
                iArr2[0] = iArr2[0] + 1;
                iArr2[1] = iArr2[1] + 1;
            } else if (i == 1) {
                iArr2[0] = iArr2[0] + 1;
            } else if (i == 2) {
                iArr2[2] = iArr2[2] + 1;
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            iArr2[i2] = MathUtil.clip((iArr2[i2] << 8) / iArr.length, 1, 255);
        }
        return iArr2;
    }

    private void chroma(Picture picture, int i, int i2, VPxBooleanEncoder vPxBooleanEncoder, int i3, Picture picture2) {
        int i4 = i3;
        int i5 = i << 3;
        int i6 = i2 << 3;
        int chromaPredBlk = chromaPredBlk(1, i5, i6);
        int chromaPredBlk2 = chromaPredBlk(2, i5, i6);
        Picture picture3 = picture;
        int i7 = i3;
        int i8 = i5;
        int i9 = i6;
        Picture picture4 = picture2;
        int[][] transformChroma = transformChroma(picture3, 1, i7, i8, i9, picture4, chromaPredBlk);
        int[][] transformChroma2 = transformChroma(picture3, 2, i7, i8, i9, picture4, chromaPredBlk2);
        int i10 = i;
        int i11 = i2;
        VPxBooleanEncoder vPxBooleanEncoder2 = vPxBooleanEncoder;
        int i12 = i3;
        writeChroma(1, i10, i11, vPxBooleanEncoder2, transformChroma, i12);
        writeChroma(2, i10, i11, vPxBooleanEncoder2, transformChroma2, i12);
        int[][] iArr = transformChroma;
        restorePlaneChroma(iArr, i4);
        int i13 = i5;
        int i14 = i6;
        putChroma(picture2.getData()[1], 1, i13, i14, iArr, chromaPredBlk);
        restorePlaneChroma(transformChroma2, i4);
        putChroma(picture2.getData()[2], 2, i13, i14, transformChroma2, chromaPredBlk2);
    }

    private int chromaPredBlk(int i, int i2, int i3) {
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

    private final int chromaPredOne(int[] iArr, int i) {
        return ((((((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + iArr[i + 4]) + iArr[i + 5]) + iArr[i + 6]) + iArr[i + 7]) + 4) >> 3;
    }

    private final int chromaPredTwo(int[] iArr, int[] iArr2, int i, int i2) {
        return ((((((((((((((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + iArr[i + 4]) + iArr[i + 5]) + iArr[i + 6]) + iArr[i + 7]) + iArr2[i2]) + iArr2[i2 + 1]) + iArr2[i2 + 2]) + iArr2[i2 + 3]) + iArr2[i2 + 4]) + iArr2[i2 + 5]) + iArr2[i2 + 6]) + iArr2[i2 + 7]) + 8) >> 4;
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

    private int[] extractDC(int[][] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i][0];
        }
        return iArr2;
    }

    private void initValue(int[][] iArr, int i) {
        Arrays.fill(iArr[0], i);
        Arrays.fill(iArr[1], i);
        Arrays.fill(iArr[2], i);
    }

    private void luma(Picture picture, int i, int i2, VPxBooleanEncoder vPxBooleanEncoder, int i3, Picture picture2) {
        int i4 = i << 4;
        int i5 = i2 << 4;
        int[][] transform = transform(picture, 0, i3, i4, i5);
        int[] extractDC = extractDC(transform);
        int i6 = i;
        int i7 = i2;
        VPxBooleanEncoder vPxBooleanEncoder2 = vPxBooleanEncoder;
        writeLumaDC(i6, i7, vPxBooleanEncoder2, i3, extractDC);
        writeLumaAC(i6, i7, vPxBooleanEncoder2, transform, i3);
        restorePlaneLuma(extractDC, transform, i3);
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

    private void prepareBuffers(int i, int i2) {
        int i3 = (i2 * i2) << 10;
        int i4 = (i * i2) + 256;
        ByteBuffer byteBuffer = this.headerBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < i4) {
            this.headerBuffer = ByteBuffer.allocate(i4);
        } else {
            this.headerBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.dataBuffer;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i3) {
            this.dataBuffer = ByteBuffer.allocate(i3);
        } else {
            this.dataBuffer.clear();
        }
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

    private void putChroma(int[] iArr, int i, int i2, int i3, int[][] iArr2, int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            putBlk(iArr, i4, iArr2[i5], 3, (i5 & 1) << 2, (i5 >> 1) << 2);
        }
    }

    private void putLuma(int[] iArr, int i, int[][] iArr2, int i2) {
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            int[] iArr3 = iArr;
            int i4 = i;
            putBlk(iArr3, i4, iArr2[i3], i2, (i3 & 3) << 2, i3 & -4);
        }
    }

    private void restorePlaneChroma(int[][] iArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.quantizer.dequantizeUV(iArr[i2], i);
            VPXDCT.idct4x4(iArr[i2]);
        }
    }

    private void restorePlaneLuma(int[] iArr, int[][] iArr2, int i) {
        this.quantizer.dequantizeY2(iArr, i);
        VPXDCT.iwalsh4x4(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            this.quantizer.dequantizeY(iArr2[i2], i);
            iArr2[i2][0] = iArr[i2];
            VPXDCT.idct4x4(iArr2[i2]);
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

    private int[][] transform(Picture picture, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i4;
        int lumaDCPred = lumaDCPred(i5, i6);
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{16, 16});
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int[] iArr2 = iArr[i7];
            int i8 = (i7 & 3) << 2;
            int i9 = i7 & -4;
            takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i5 + i8, i6 + i9, iArr2, lumaDCPred);
            VPXDCT.fdct4x4(iArr2);
        }
        return iArr;
    }

    private int[][] transformChroma(Picture picture, int i, int i2, int i3, int i4, Picture picture2, int i5) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{4, 16});
        for (int i6 = 0; i6 < iArr.length; i6++) {
            takeSubtract(picture.getPlaneData(i), picture.getPlaneWidth(i), picture.getPlaneHeight(i), i3 + ((i6 & 1) << 2), i4 + ((i6 >> 1) << 2), iArr[i6], i5);
            VPXDCT.fdct4x4(iArr[i6]);
        }
        return iArr;
    }

    private void writeChroma(int i, int i2, int i3, VPxBooleanEncoder vPxBooleanEncoder, int[][] iArr, int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            this.quantizer.quantizeUV(iArr[i5], i4);
            this.bitstream.encodeCoeffsDCTUV(vPxBooleanEncoder, zigzag(iArr[i5], this.tmp), i, i2, i5 & 1, i5 >> 1);
        }
    }

    private void writeHeader(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 << 5) | 16 | 0 | 0;
        byteBuffer.put((byte) (i4 & 255));
        byteBuffer.put((byte) ((i4 >> 8) & 255));
        byteBuffer.put((byte) ((i4 >> 16) & 255));
        byteBuffer.put(-99);
        byteBuffer.put(1);
        byteBuffer.put(42);
        byteBuffer.putShort((short) i);
        byteBuffer.putShort((short) i2);
    }

    private void writeHeader2(VPxBooleanEncoder vPxBooleanEncoder, int[] iArr, int[] iArr2) {
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 1);
        vPxBooleanEncoder.writeBit(128, 1);
        vPxBooleanEncoder.writeBit(128, 1);
        vPxBooleanEncoder.writeBit(128, 1);
        for (int writeInt : iArr) {
            vPxBooleanEncoder.writeBit(128, 1);
            writeInt(vPxBooleanEncoder, writeInt, 7);
            vPxBooleanEncoder.writeBit(128, 0);
        }
        for (int length = iArr.length; length < 4; length++) {
            vPxBooleanEncoder.writeBit(128, 0);
        }
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        for (int i = 0; i < 3; i++) {
            vPxBooleanEncoder.writeBit(128, 1);
            writeInt(vPxBooleanEncoder, iArr2[i], 8);
        }
        vPxBooleanEncoder.writeBit(128, 0);
        writeInt(vPxBooleanEncoder, 1, 6);
        writeInt(vPxBooleanEncoder, 0, 3);
        vPxBooleanEncoder.writeBit(128, 0);
        writeInt(vPxBooleanEncoder, 0, 2);
        writeInt(vPxBooleanEncoder, iArr[0], 7);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        vPxBooleanEncoder.writeBit(128, 0);
        int[][][][] iArr3 = VPXConst.tokenProbUpdateFlagProbs;
        for (int i2 = 0; i2 < iArr3.length; i2++) {
            for (int i3 = 0; i3 < iArr3[i2].length; i3++) {
                for (int i4 = 0; i4 < iArr3[i2][i3].length; i4++) {
                    for (int writeBit : iArr3[i2][i3][i4]) {
                        vPxBooleanEncoder.writeBit(writeBit, 0);
                    }
                }
            }
        }
        vPxBooleanEncoder.writeBit(128, 0);
    }

    private void writeLumaAC(int i, int i2, VPxBooleanEncoder vPxBooleanEncoder, int[][] iArr, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            this.quantizer.quantizeY(iArr[i4], i3);
            this.bitstream.encodeCoeffsDCT15(vPxBooleanEncoder, zigzag(iArr[i4], this.tmp), i, i4 & 3, i4 >> 2);
        }
    }

    private void writeLumaDC(int i, int i2, VPxBooleanEncoder vPxBooleanEncoder, int i3, int[] iArr) {
        VPXDCT.walsh4x4(iArr);
        this.quantizer.quantizeY2(iArr, i3);
        this.bitstream.encodeCoeffsWHT(vPxBooleanEncoder, zigzag(iArr, this.tmp), i);
    }

    private void writeSegmetId(VPxBooleanEncoder vPxBooleanEncoder, int i, int[] iArr) {
        int i2 = (i >> 1) & 1;
        vPxBooleanEncoder.writeBit(iArr[0], i2);
        vPxBooleanEncoder.writeBit(iArr[i2 + 1], i & 1);
    }

    private int[] zigzag(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 16; i++) {
            iArr2[i] = iArr[VPXConst.zigzag[i]];
        }
        return iArr2;
    }

    public ByteBuffer encodeFrame(Picture picture, ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int width = (picture.getWidth() + 15) >> 4;
        int height = (picture.getHeight() + 15) >> 4;
        prepareBuffers(width, height);
        this.bitstream = new VPXBitstream(VPXConst.tokenDefaultBinProbs, width);
        this.leftRow = new int[][]{new int[16], new int[8], new int[8]};
        int i = width << 3;
        this.topLine = new int[][]{new int[(width << 4)], new int[i], new int[i]};
        int[][] iArr = this.leftRow;
        int i2 = C13959t.f40835R1;
        initValue(iArr, C13959t.f40835R1);
        initValue(this.topLine, C13959t.f40827P1);
        this.quantizer = new VPXQuantizer();
        Picture create = Picture.create(16, 16, ColorSpace.YUV420);
        int[] segmentQps = this.f44789rc.getSegmentQps();
        VPxBooleanEncoder vPxBooleanEncoder = new VPxBooleanEncoder(this.dataBuffer);
        int[] iArr2 = new int[(width * height)];
        int i3 = 0;
        int i4 = 0;
        while (i4 < height) {
            initValue(this.leftRow, i2);
            int i5 = i3;
            int i6 = 0;
            while (i6 < width) {
                int position = vPxBooleanEncoder.position();
                int segment = this.f44789rc.getSegment();
                iArr2[i5] = segment;
                Picture picture2 = picture;
                int i7 = i6;
                int i8 = i4;
                int[] iArr3 = iArr2;
                VPxBooleanEncoder vPxBooleanEncoder2 = vPxBooleanEncoder;
                Picture picture3 = create;
                luma(picture2, i6, i4, vPxBooleanEncoder, segmentQps[segment], picture3);
                chroma(picture2, i7, i8, vPxBooleanEncoder2, segmentQps[segment], picture3);
                this.f44789rc.report(vPxBooleanEncoder2.position() - position);
                int i9 = i7;
                collectPredictors(create, i9);
                i6 = i9 + 1;
                i5++;
                iArr2 = iArr3;
                vPxBooleanEncoder = vPxBooleanEncoder2;
                i4 = i8;
            }
            int[] iArr4 = iArr2;
            VPxBooleanEncoder vPxBooleanEncoder3 = vPxBooleanEncoder;
            i4++;
            i3 = i5;
            i2 = C13959t.f40835R1;
        }
        int[] iArr5 = iArr2;
        vPxBooleanEncoder.stop();
        this.dataBuffer.flip();
        VPxBooleanEncoder vPxBooleanEncoder4 = new VPxBooleanEncoder(this.headerBuffer);
        int[] calcSegmentProbs = calcSegmentProbs(iArr5);
        writeHeader2(vPxBooleanEncoder4, segmentQps, calcSegmentProbs);
        int i10 = 0;
        int i11 = 0;
        while (i10 < height) {
            int i12 = i11;
            int i13 = 0;
            while (i13 < width) {
                writeSegmetId(vPxBooleanEncoder4, iArr5[i12], calcSegmentProbs);
                vPxBooleanEncoder4.writeBit(C13959t.f40907h2, 1);
                vPxBooleanEncoder4.writeBit(C13959t.f40953s2, 0);
                vPxBooleanEncoder4.writeBit(C13959t.f40981z2, 0);
                vPxBooleanEncoder4.writeBit(C13959t.f40892e2, 0);
                i13++;
                i12++;
            }
            i10++;
            i11 = i12;
        }
        vPxBooleanEncoder4.stop();
        this.headerBuffer.flip();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        writeHeader(duplicate, picture.getWidth(), picture.getHeight(), this.headerBuffer.remaining());
        duplicate.put(this.headerBuffer);
        duplicate.put(this.dataBuffer);
        duplicate.flip();
        return duplicate;
    }

    public ColorSpace[] getSupportedColorSpaces() {
        return new ColorSpace[]{ColorSpace.YUV420J};
    }

    /* access modifiers changed from: 0000 */
    public void writeInt(VPxBooleanEncoder vPxBooleanEncoder, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            vPxBooleanEncoder.writeBit(128, (i >> i3) & 1);
        }
    }

    public VP8Encoder(RateControl rateControl) {
        this.tmp = new int[16];
        this.f44789rc = rateControl;
    }
}
