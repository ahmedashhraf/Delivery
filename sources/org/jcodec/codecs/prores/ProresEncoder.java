package org.jcodec.codecs.prores;

import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.dct.DCTRef;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.common.tools.ImageOP;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class ProresEncoder {
    private static final int DEFAULT_SLICE_MB_WIDTH = 8;
    private static final int LOG_DEFAULT_SLICE_MB_WIDTH = 3;
    protected Profile profile;
    private int[][] scaledChroma;
    private int[][] scaledLuma;

    public enum Profile {
        PROXY(ProresConsts.QMAT_LUMA_APCO, ProresConsts.QMAT_CHROMA_APCO, "apco", 1000, 4, 8),
        LT(ProresConsts.QMAT_LUMA_APCS, ProresConsts.QMAT_CHROMA_APCS, "apcs", 2100, 1, 9),
        STANDARD(ProresConsts.QMAT_LUMA_APCN, ProresConsts.QMAT_CHROMA_APCN, "apcn", 3500, 1, 6),
        HQ(ProresConsts.QMAT_LUMA_APCH, ProresConsts.QMAT_CHROMA_APCH, "apch", 5400, 1, 6);
        
        final int bitrate;
        final int firstQp;
        public final String fourcc;
        final int lastQp;
        final int[] qmatChroma;
        final int[] qmatLuma;

        private Profile(int[] iArr, int[] iArr2, String str, int i, int i2, int i3) {
            this.qmatLuma = iArr;
            this.qmatChroma = iArr2;
            this.fourcc = str;
            this.bitrate = i;
            this.firstQp = i2;
            this.lastQp = i3;
        }
    }

    public ProresEncoder(Profile profile2) {
        this.profile = profile2;
        this.scaledLuma = scaleQMat(profile2.qmatLuma, 1, 16);
        this.scaledChroma = scaleQMat(profile2.qmatChroma, 1, 16);
    }

    static final int bits(int[] iArr) {
        return ((iArr[0] + iArr[1]) + iArr[2]) << 3;
    }

    private int calcNSlices(int i, int i2) {
        int i3 = i >> 3;
        for (int i4 = 0; i4 < 3; i4++) {
            i3 += (i >> i4) & 1;
        }
        return i3 * i2;
    }

    private void dctOnePlane(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            DCTRef.fdct(iArr, i2 << 6);
        }
    }

    private static final int diffSign(int i, int i2) {
        return (i >> 31) ^ i2;
    }

    static final void encodeOnePlane(BitWriter bitWriter, int i, int[] iArr, int[] iArr2, int[] iArr3) {
        writeDCCoeffs(bitWriter, iArr, iArr3, i);
        writeACCoeffs(bitWriter, iArr, iArr3, i, iArr2, 64);
    }

    protected static final void encodeSliceData(ByteBuffer byteBuffer, int[] iArr, int[] iArr2, int[] iArr3, int i, Picture picture, int i2, int[] iArr4) {
        iArr4[0] = onePlane(byteBuffer, i << 2, iArr, iArr3, picture.getPlaneData(0));
        int i3 = i << 1;
        iArr4[1] = onePlane(byteBuffer, i3, iArr2, iArr3, picture.getPlaneData(1));
        iArr4[2] = onePlane(byteBuffer, i3, iArr2, iArr3, picture.getPlaneData(2));
    }

    public static final int getLevel(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    static final int onePlane(ByteBuffer byteBuffer, int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int position = byteBuffer.position();
        BitWriter bitWriter = new BitWriter(byteBuffer);
        encodeOnePlane(bitWriter, i, iArr, iArr2, iArr3);
        bitWriter.flush();
        return byteBuffer.position() - position;
    }

    private static final int qScale(int[] iArr, int i, int i2) {
        return i2 / iArr[i];
    }

    private int[][] scaleQMat(int[] iArr, int i, int i2) {
        int[][] iArr2 = new int[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = new int[iArr.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr2[i3][i4] = iArr[i4] * (i3 + i);
            }
        }
        return iArr2;
    }

    private void split(Picture picture, Picture picture2, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        split(picture.getPlaneData(0), picture2.getPlaneData(0), picture.getPlaneWidth(0), i4, i5, i6, 0);
        split(picture.getPlaneData(1), picture2.getPlaneData(1), picture.getPlaneWidth(1), i4, i5, i6, 1);
        split(picture.getPlaneData(2), picture2.getPlaneData(2), picture.getPlaneWidth(2), i4, i5, i6, 1);
    }

    private void splitBlock(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4 = i3;
        int i5 = i2;
        int i6 = 0;
        while (i6 < 8) {
            int i7 = i4;
            int i8 = i5;
            int i9 = 0;
            while (i9 < 8) {
                int i10 = i7 + 1;
                int i11 = i8 + 1;
                iArr2[i7] = iArr[i8];
                i9++;
                i7 = i10;
                i8 = i11;
            }
            i5 = (i - 8) + i8;
            i6++;
            i4 = i7;
        }
    }

    private Picture splitSlice(Picture picture, int i, int i2, int i3, boolean z) {
        int i4 = i3 << 4;
        Picture create = Picture.create(i4, 16, ColorSpace.YUV422_10);
        if (z) {
            Picture create2 = Picture.create(i4, 16, ColorSpace.YUV422_10);
            ImageOP.subImageWithFill(picture, create2, new Rect(i << 4, i2 << 4, i4, 16));
            split(create2, create, 0, 0, i3);
        } else {
            split(picture, create, i, i2, i3);
        }
        return create;
    }

    private static final int toGolumb(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private static final int toGolumb(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        return (i << 1) + i2;
    }

    static final void writeACCoeffs(BitWriter bitWriter, int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3 = 1;
        int i4 = 4;
        int i5 = 2;
        int i6 = 0;
        while (i3 < i2) {
            int i7 = iArr3[i3];
            int i8 = i5;
            int i9 = i4;
            for (int i10 = 0; i10 < i; i10++) {
                int qScale = qScale(iArr, i7, iArr2[(i10 << 6) + i7]);
                if (qScale == 0) {
                    i6++;
                } else {
                    writeCodeword(bitWriter, ProresConsts.runCodebooks[Math.min(i9, 15)], i6);
                    int level = getLevel(qScale);
                    writeCodeword(bitWriter, ProresConsts.levCodebooks[Math.min(i8, 9)], level - 1);
                    bitWriter.write1Bit(MathUtil.sign(qScale));
                    i8 = level;
                    i9 = i6;
                    i6 = 0;
                }
            }
            i3++;
            i4 = i9;
            i5 = i8;
        }
    }

    public static final void writeCodeword(BitWriter bitWriter, Codebook codebook, int i) {
        int i2 = codebook.switchBits + 1;
        int i3 = codebook.riceOrder;
        int i4 = i2 << i3;
        if (i >= i4) {
            int i5 = (i - i4) + (1 << codebook.expOrder);
            int log2 = MathUtil.log2(i5);
            int i6 = (log2 - codebook.expOrder) + codebook.switchBits + 1;
            for (int i7 = 0; i7 < i6; i7++) {
                bitWriter.write1Bit(0);
            }
            bitWriter.write1Bit(1);
            bitWriter.writeNBit(i5, log2);
        } else if (i3 > 0) {
            for (int i8 = 0; i8 < (i >> codebook.riceOrder); i8++) {
                bitWriter.write1Bit(0);
            }
            bitWriter.write1Bit(1);
            int i9 = codebook.riceOrder;
            bitWriter.writeNBit(i & ((1 << i9) - 1), i9);
        } else {
            for (int i10 = 0; i10 < i; i10++) {
                bitWriter.write1Bit(0);
            }
            bitWriter.write1Bit(1);
        }
    }

    static final void writeDCCoeffs(BitWriter bitWriter, int[] iArr, int[] iArr2, int i) {
        int qScale = qScale(iArr, 0, iArr2[0] - 16384);
        writeCodeword(bitWriter, ProresConsts.firstDCCodebook, toGolumb(qScale));
        int i2 = 1;
        int i3 = qScale;
        int i4 = 64;
        int i5 = 0;
        int i6 = 5;
        while (i2 < i) {
            int qScale2 = qScale(iArr, 0, iArr2[i4] - 16384);
            int i7 = qScale2 - i3;
            int golumb = toGolumb(getLevel(i7), diffSign(i7, i5));
            writeCodeword(bitWriter, ProresConsts.dcCodebooks[Math.min(i6, 6)], golumb);
            i2++;
            i4 += 64;
            i6 = golumb;
            i5 = i7 >> 31;
            i3 = qScale2;
        }
    }

    public static void writeFrameHeader(ByteBuffer byteBuffer, FrameHeader frameHeader) {
        byteBuffer.putInt(C13959t.f40953s2 + frameHeader.payloadSize);
        byteBuffer.put(new byte[]{105, 99, 112, 102});
        byteBuffer.putShort(148);
        byteBuffer.putShort(0);
        byteBuffer.put(new byte[]{97, 112, 108, 48});
        byteBuffer.putShort((short) frameHeader.width);
        byteBuffer.putShort((short) frameHeader.height);
        byteBuffer.put((byte) (frameHeader.frameType == 0 ? C13959t.f40843T1 : C13959t.f40859X1));
        byteBuffer.put(new byte[]{0, 2, 2, 6, 32, 0});
        byteBuffer.put(3);
        writeQMat(byteBuffer, frameHeader.qMatLuma);
        writeQMat(byteBuffer, frameHeader.qMatChroma);
    }

    public static void writePictureHeader(int i, int i2, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 64);
        byteBuffer.putInt(0);
        byteBuffer.putShort((short) i2);
        byteBuffer.put((byte) (i << 4));
    }

    static final void writeQMat(ByteBuffer byteBuffer, int[] iArr) {
        for (int i = 0; i < 64; i++) {
            byteBuffer.put((byte) iArr[i]);
        }
    }

    public void encodeFrame(ByteBuffer byteBuffer, Picture... pictureArr) {
        Picture[] pictureArr2 = pictureArr;
        ByteBuffer duplicate = byteBuffer.duplicate();
        int[] iArr = pictureArr2.length > 1 ? ProresConsts.interlaced_scan : ProresConsts.progressive_scan;
        int croppedWidth = pictureArr2[0].getCroppedWidth();
        int croppedHeight = pictureArr2[0].getCroppedHeight() * pictureArr2.length;
        int i = pictureArr2.length == 1 ? 0 : 1;
        Profile profile2 = this.profile;
        FrameHeader frameHeader = new FrameHeader(0, croppedWidth, croppedHeight, i, true, iArr, profile2.qmatLuma, profile2.qmatChroma, 2);
        writeFrameHeader(byteBuffer, frameHeader);
        encodePicture(byteBuffer, this.scaledLuma, this.scaledChroma, iArr, pictureArr2[0]);
        if (pictureArr2.length > 1) {
            encodePicture(byteBuffer, this.scaledLuma, this.scaledChroma, iArr, pictureArr2[1]);
        }
        byteBuffer.flip();
        duplicate.putInt(byteBuffer.remaining());
    }

    /* access modifiers changed from: protected */
    public void encodePicture(ByteBuffer byteBuffer, int[][] iArr, int[][] iArr2, int[] iArr3, Picture picture) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int width = (picture.getWidth() + 15) >> 4;
        int height = (picture.getHeight() + 15) >> 4;
        int i = this.profile.firstQp;
        int calcNSlices = calcNSlices(width, height);
        writePictureHeader(3, calcNSlices, byteBuffer2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer2, calcNSlices << 1);
        int[] iArr4 = new int[calcNSlices];
        int i2 = 0;
        int i3 = 0;
        while (i3 < height) {
            int i4 = 8;
            int i5 = i;
            int i6 = i2;
            int i7 = 0;
            while (i7 < width) {
                int i8 = i4;
                while (width - i7 < i8) {
                    i8 >>= 1;
                }
                int position = byteBuffer.position();
                int i9 = i8;
                int i10 = i7;
                int i11 = i3;
                int[] iArr5 = iArr4;
                ByteBuffer byteBuffer3 = duplicate;
                int i12 = height;
                i5 = encodeSlice(byteBuffer, iArr, iArr2, iArr3, i8, i7, i3, picture, i5, width, height, (picture.getHeight() % 16 != 0 && i3 == height + -1) || (picture.getWidth() % 16 != 0 && i7 + i8 == width));
                byteBuffer3.putShort((short) (byteBuffer.position() - position));
                int i13 = i6 + 1;
                iArr5[i6] = (short) (byteBuffer.position() - position);
                i7 = i10 + i9;
                i6 = i13;
                duplicate = byteBuffer3;
                i4 = i9;
                i3 = i11;
                iArr4 = iArr5;
                height = i12;
            }
            int[] iArr6 = iArr4;
            ByteBuffer byteBuffer4 = duplicate;
            int i14 = height;
            i3++;
            i = i5;
            i2 = i6;
        }
    }

    /* access modifiers changed from: protected */
    public int encodeSlice(ByteBuffer byteBuffer, int[][] iArr, int[][] iArr2, int[] iArr3, int i, int i2, int i3, Picture picture, int i4, int i5, int i6, boolean z) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i7 = i4;
        Picture splitSlice = splitSlice(picture, i2, i3, i, z);
        dctOnePlane(i << 2, splitSlice.getPlaneData(0));
        int i8 = i << 1;
        dctOnePlane(i8, splitSlice.getPlaneData(1));
        dctOnePlane(i8, splitSlice.getPlaneData(2));
        int i9 = (i >> 2) * this.profile.bitrate;
        int i10 = i9 >> 3;
        int i11 = i9 - i10;
        int i12 = i9 + i10;
        byteBuffer2.put(48);
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer2, 5);
        int position = byteBuffer.position();
        int[] iArr4 = new int[3];
        int i13 = i7 - 1;
        int[] iArr5 = iArr4;
        int i14 = position;
        int i15 = i7;
        encodeSliceData(byteBuffer, iArr[i13], iArr2[i13], iArr3, i, splitSlice, i4, iArr5);
        if (bits(iArr5) > i12 && i15 < this.profile.lastQp) {
            do {
                i15++;
                byteBuffer2.position(i14);
                int i16 = i15 - 1;
                encodeSliceData(byteBuffer, iArr[i16], iArr2[i16], iArr3, i, splitSlice, i15, iArr5);
                if (bits(iArr5) <= i12) {
                    break;
                }
            } while (i15 < this.profile.lastQp);
        } else if (bits(iArr5) < i11 && i15 > this.profile.firstQp) {
            do {
                i15--;
                byteBuffer2.position(i14);
                int i17 = i15 - 1;
                encodeSliceData(byteBuffer, iArr[i17], iArr2[i17], iArr3, i, splitSlice, i15, iArr5);
                if (bits(iArr5) >= i11) {
                    break;
                }
            } while (i15 > this.profile.firstQp);
        }
        duplicate.put((byte) i15);
        duplicate.putShort((short) iArr5[0]);
        duplicate.putShort((short) iArr5[1]);
        return i15;
    }

    private int[] split(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        int i6 = i4;
        int i7 = ((i3 << 4) * i) + (i2 << (4 - i5));
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            int[] iArr3 = iArr;
            int i10 = i;
            int[] iArr4 = iArr2;
            splitBlock(iArr3, i10, i7, iArr4, i8);
            int i11 = i7 + (i << 3);
            splitBlock(iArr3, i10, i11, iArr4, i8 + (128 >> i5));
            if (i5 == 0) {
                int[] iArr5 = iArr;
                int i12 = i;
                int[] iArr6 = iArr2;
                splitBlock(iArr5, i12, i7 + 8, iArr6, i8 + 64);
                splitBlock(iArr5, i12, i11 + 8, iArr6, i8 + 192);
            }
            i8 += 256 >> i5;
            i7 += 16 >> i5;
        }
        return iArr2;
    }
}
