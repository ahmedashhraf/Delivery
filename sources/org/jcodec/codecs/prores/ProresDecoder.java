package org.jcodec.codecs.prores;

import androidx.core.p034l.C1056z;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.codecs.prores.ProresConsts.PictureHeader;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.dct.SimpleIDCT10Bit;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.MathUtil;

public class ProresDecoder implements VideoDecoder {
    static final int[] mask = {0, 0, 0, 0, 0, 0, 0, 0, -1};
    static final int[] table = {8, 7, 6, 6, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    static final BitReader bitstream(ByteBuffer byteBuffer, int i) {
        return new BitReader(NIOUtils.read(byteBuffer, i));
    }

    static final int clip(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void decodeSlice(ByteBuffer byteBuffer, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, short s, int[][] iArr4, int i4, int i5, int i6) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int[] iArr5 = iArr2;
        int i7 = i5;
        int i8 = (byteBuffer.get() & 255) >> 3;
        int clip = clip(byteBuffer.get() & 255, 1, JpegConst.APP0);
        if (clip > 128) {
            clip = (clip - 96) << 2;
        }
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        int[] iArr6 = iArr3;
        int i9 = i2;
        int i10 = i3;
        int i11 = (i << i6) >> 1;
        putSlice(iArr4, i4, i2, i3, decodeOnePlane(bitstream(byteBuffer2, s2), i << 2, scaleMat(iArr, clip), iArr6, i9, i10, 0), decodeOnePlane(bitstream(byteBuffer2, s3), i11, scaleMat(iArr5, clip), iArr6, i9, i10, 1), decodeOnePlane(bitstream(byteBuffer2, i8 > 7 ? byteBuffer.getShort() : ((s - s3) - s2) - i8), i11, scaleMat(iArr5, clip), iArr6, i9, i10, 2), i7 == 0 ? 0 : 1, i7 == 2 ? 1 : 0, i6);
    }

    public static final int golumbSign(int i) {
        return -(i & 1);
    }

    public static final int golumbToSigned(int i) {
        return golumbSign(i) ^ (i >> 1);
    }

    static final boolean hasQMatChroma(int i) {
        return (i & 1) != 0;
    }

    static final boolean hasQMatLuma(int i) {
        return (i & 2) != 0;
    }

    public static final int nZeros(int i) {
        int[] iArr = table;
        int i2 = iArr[i & 255];
        int i3 = iArr[i >> 8];
        return i3 + (mask[i3] & i2);
    }

    private void putBlock(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i;
        for (int i8 = 0; i8 < 8; i8++) {
            for (int i9 = 0; i9 < 8; i9++) {
                iArr[i9 + i7] = clip(iArr2[i9 + i6], 4, C1056z.f4719u);
            }
            i7 += i2;
            i6 += 8;
        }
    }

    private void putChroma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i5;
        int i9 = (i3 << 3) + ((i4 << 4) * i2) + i;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 << 7;
            int[] iArr3 = iArr;
            int i12 = i2;
            int[] iArr4 = iArr2;
            int i13 = i6;
            int i14 = i7;
            putBlock(iArr3, i9, i12, iArr4, i11, i13, i14);
            putBlock(iArr3, i9 + (i2 * 8), i12, iArr4, i11 + 64, i13, i14);
            i9 += 8;
        }
    }

    private void putLuma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i5;
        int i9 = (i3 << 4) + ((i4 << 4) * i2) + i;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 << 8;
            int[] iArr3 = iArr;
            int i12 = i2;
            int[] iArr4 = iArr2;
            int i13 = i6;
            int i14 = i7;
            putBlock(iArr3, i9, i12, iArr4, i11, i13, i14);
            putBlock(iArr3, i9 + 8, i12, iArr4, i11 + 64, i13, i14);
            int i15 = i9 + (i2 * 8);
            putBlock(iArr3, i15, i12, iArr4, i11 + 128, i13, i14);
            putBlock(iArr3, i15 + 8, i12, iArr4, i11 + 192, i13, i14);
            i9 += 16;
        }
    }

    private static final int qScale(int[] iArr, int i, int i2) {
        return (i2 * iArr[i]) >> 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final void readACCoeffs(org.jcodec.common.p554io.BitReader r9, int[] r10, int[] r11, int r12, int[] r13, int r14, int r15) {
        /*
            int r0 = r12 + -1
            int r12 = org.jcodec.common.tools.MathUtil.log2(r12)
            r1 = 64
            int r1 = r1 << r12
            r2 = 4
            r3 = 2
            r3 = r0
            r4 = 2
        L_0x000d:
            int r5 = r9.remaining()
            r6 = 32
            if (r5 > r6) goto L_0x001b
            int r5 = r9.checkAllBits()
            if (r5 == 0) goto L_0x0056
        L_0x001b:
            org.jcodec.codecs.prores.Codebook[] r5 = org.jcodec.codecs.prores.ProresConsts.runCodebooks
            r6 = 15
            int r2 = java.lang.Math.min(r2, r6)
            r2 = r5[r2]
            int r2 = readCodeword(r9, r2)
            if (r2 < 0) goto L_0x0068
            int r5 = r1 - r3
            int r5 = r5 + -1
            if (r2 < r5) goto L_0x0032
            goto L_0x0068
        L_0x0032:
            int r5 = r2 + 1
            int r3 = r3 + r5
            org.jcodec.codecs.prores.Codebook[] r5 = org.jcodec.codecs.prores.ProresConsts.levCodebooks
            r6 = 9
            int r4 = java.lang.Math.min(r4, r6)
            r4 = r5[r4]
            int r4 = readCodeword(r9, r4)
            int r4 = r4 + 1
            if (r4 < 0) goto L_0x0068
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r4 <= r5) goto L_0x004d
            goto L_0x0068
        L_0x004d:
            int r5 = r9.read1Bit()
            int r5 = -r5
            int r6 = r3 >> r12
            if (r6 < r14) goto L_0x0057
        L_0x0056:
            return
        L_0x0057:
            r7 = r3 & r0
            int r7 = r7 << r15
            r8 = r13[r6]
            int r7 = r7 + r8
            int r5 = org.jcodec.common.tools.MathUtil.toSigned(r4, r5)
            int r5 = qScale(r10, r6, r5)
            r11[r7] = r5
            goto L_0x000d
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.prores.ProresDecoder.readACCoeffs(org.jcodec.common.io.BitReader, int[], int[], int, int[], int, int):void");
    }

    public static final int readCodeword(BitReader bitReader, Codebook codebook) {
        int nZeros = nZeros(bitReader.check16Bits());
        bitReader.skipFast(nZeros + 1);
        if (nZeros > codebook.switchBits) {
            int i = codebook.golombBits + nZeros;
            if (i > 16) {
                Logger.error("Broken prores slice");
            }
            return (bitReader.readFast16(i) | (1 << i)) - codebook.golombOffset;
        }
        int i2 = codebook.riceOrder;
        if (i2 <= 0) {
            return nZeros;
        }
        return bitReader.readFast16(i2) | (nZeros << i2);
    }

    public static final void readDCCoeffs(BitReader bitReader, int[] iArr, int[] iArr2, int i, int i2) {
        int readCodeword = readCodeword(bitReader, ProresConsts.firstDCCodebook);
        if (readCodeword >= 0) {
            int golumbToSigned = golumbToSigned(readCodeword);
            iArr2[0] = qScale(iArr, 0, golumbToSigned) + 4096;
            int i3 = 5;
            int i4 = i2;
            int i5 = golumbToSigned;
            int i6 = 1;
            int i7 = 0;
            while (i6 < i) {
                i3 = readCodeword(bitReader, ProresConsts.dcCodebooks[Math.min(i3, 6)]);
                if (i3 >= 0) {
                    i7 = i3 != 0 ? i7 ^ golumbSign(i3) : 0;
                    i5 += MathUtil.toSigned((i3 + 1) >> 1, i7);
                    iArr2[i4] = qScale(iArr, 0, i5) + 4096;
                    i6++;
                    i4 += i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jcodec.codecs.prores.ProresConsts.FrameHeader readFrameHeader(java.nio.ByteBuffer r15) {
        /*
            int r0 = r15.getInt()
            java.lang.String r1 = readSig(r15)
            java.lang.String r2 = "icpf"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00a1
            short r1 = r15.getShort()
            r15.getShort()
            r15.getInt()
            short r4 = r15.getShort()
            short r5 = r15.getShort()
            byte r2 = r15.get()
            int r3 = r2 >> 2
            r6 = r3 & 3
            int r2 = r2 >> 6
            r11 = r2 & 3
            r2 = 1
            r3 = 0
            if (r6 != 0) goto L_0x0036
            int[] r2 = org.jcodec.codecs.prores.ProresConsts.progressive_scan
            r8 = r2
            goto L_0x003d
        L_0x0036:
            int[] r7 = org.jcodec.codecs.prores.ProresConsts.interlaced_scan
            r8 = r7
            if (r6 != r2) goto L_0x003d
            r7 = 1
            goto L_0x003e
        L_0x003d:
            r7 = 0
        L_0x003e:
            r15.get()
            r15.get()
            r15.get()
            r15.get()
            r15.get()
            r15.get()
            byte r2 = r15.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r9 = 64
            int[] r10 = new int[r9]
            int[] r12 = new int[r9]
            boolean r13 = hasQMatLuma(r2)
            r14 = 4
            if (r13 == 0) goto L_0x0067
            readQMat(r15, r10, r8)
            goto L_0x006a
        L_0x0067:
            java.util.Arrays.fill(r10, r14)
        L_0x006a:
            boolean r13 = hasQMatChroma(r2)
            if (r13 == 0) goto L_0x0074
            readQMat(r15, r12, r8)
            goto L_0x0077
        L_0x0074:
            java.util.Arrays.fill(r12, r14)
        L_0x0077:
            int r13 = r15.position()
            int r13 = r13 + r1
            boolean r14 = hasQMatLuma(r2)
            if (r14 == 0) goto L_0x0085
            r14 = 64
            goto L_0x0086
        L_0x0085:
            r14 = 0
        L_0x0086:
            int r14 = r14 + 20
            boolean r2 = hasQMatChroma(r2)
            if (r2 == 0) goto L_0x0090
            r3 = 64
        L_0x0090:
            int r14 = r14 + r3
            int r13 = r13 - r14
            r15.position(r13)
            org.jcodec.codecs.prores.ProresConsts$FrameHeader r15 = new org.jcodec.codecs.prores.ProresConsts$FrameHeader
            int r0 = r0 - r1
            int r3 = r0 + -8
            r2 = r15
            r9 = r10
            r10 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r15
        L_0x00a1:
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            java.lang.String r0 = "Not a prores frame"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.prores.ProresDecoder.readFrameHeader(java.nio.ByteBuffer):org.jcodec.codecs.prores.ProresConsts$FrameHeader");
    }

    public static PictureHeader readPictureHeader(ByteBuffer byteBuffer) {
        byteBuffer.get();
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int i = (byteBuffer.get() & 255) >> 4;
        short[] sArr = new short[s];
        for (int i2 = 0; i2 < s; i2++) {
            sArr[i2] = byteBuffer.getShort();
        }
        return new PictureHeader(i, sArr);
    }

    static final void readQMat(ByteBuffer byteBuffer, int[] iArr, int[] iArr2) {
        byte[] bArr = new byte[64];
        byteBuffer.get(bArr);
        for (int i = 0; i < 64; i++) {
            iArr[i] = bArr[iArr2[i]] & 255;
        }
    }

    static final String readSig(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return new String(bArr);
    }

    public static final int[] scaleMat(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = iArr[i2] * i;
        }
        return iArr2;
    }

    public Picture[] decodeFields(ByteBuffer byteBuffer, int[][][] iArr) {
        FrameHeader readFrameHeader = readFrameHeader(byteBuffer);
        int i = readFrameHeader.width;
        int i2 = (i + 15) & -16;
        int i3 = readFrameHeader.height;
        int i4 = (i3 + 15) & -16;
        int i5 = i2 * i4;
        int i6 = i5 >> 1;
        String str = "Provided output picture won't fit into provided buffer";
        if (readFrameHeader.frameType != 0) {
            int i7 = i6 >> 1;
            if (iArr == null || iArr[0][0].length < i6 || iArr[0][1].length < i7 || iArr[0][2].length < i7 || iArr[1][0].length < i6 || iArr[1][1].length < i7 || iArr[1][2].length < i7) {
                throw new RuntimeException(str);
            }
            int i8 = i2 >> 4;
            decodePicture(byteBuffer, iArr[!readFrameHeader.topFieldFirst], i, i3 >> 1, i8, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, 0, readFrameHeader.chromaType);
            decodePicture(byteBuffer, iArr[readFrameHeader.topFieldFirst], readFrameHeader.width, readFrameHeader.height >> 1, i8, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, 0, readFrameHeader.chromaType);
            int i9 = i4 >> 1;
            return new Picture[]{new Picture(i2, i9, iArr[0], ColorSpace.YUV422_10), new Picture(i2, i9, iArr[1], ColorSpace.YUV422_10)};
        } else if (iArr == null || iArr[0][0].length < i5 || iArr[0][1].length < i6 || iArr[0][2].length < i6) {
            throw new RuntimeException(str);
        } else {
            decodePicture(byteBuffer, iArr[0], i, i3, i2 >> 4, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, 0, readFrameHeader.chromaType);
            return new Picture[]{new Picture(i2, i4, iArr[0], ColorSpace.YUV422_10)};
        }
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        int i;
        int[][] iArr2 = iArr;
        FrameHeader readFrameHeader = readFrameHeader(byteBuffer);
        int i2 = readFrameHeader.width;
        int i3 = (i2 + 15) & -16;
        int i4 = readFrameHeader.height;
        int i5 = (i4 + 15) & -16;
        int i6 = i3 * i5;
        int i7 = readFrameHeader.chromaType;
        int i8 = i6 >> (3 - i7);
        if (iArr2 == null || iArr2[0].length < i6 || iArr2[1].length < i8 || iArr2[2].length < i8) {
            throw new RuntimeException("Provided output picture won't fit into provided buffer");
        }
        if (readFrameHeader.frameType == 0) {
            i = 2;
            decodePicture(byteBuffer, iArr, i2, i4, i3 >> 4, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, 0, i7);
        } else {
            i = 2;
            int i9 = i3 >> 4;
            decodePicture(byteBuffer, iArr, i2, i4 >> 1, i9, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, readFrameHeader.topFieldFirst ? 1 : 2, readFrameHeader.chromaType);
            decodePicture(byteBuffer, iArr, readFrameHeader.width, readFrameHeader.height >> 1, i9, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, readFrameHeader.scan, readFrameHeader.topFieldFirst ? 2 : 1, readFrameHeader.chromaType);
        }
        return new Picture(i3, i5, iArr, readFrameHeader.chromaType == i ? ColorSpace.YUV422_10 : ColorSpace.YUV444_10);
    }

    /* access modifiers changed from: protected */
    public int[] decodeOnePlane(BitReader bitReader, int i, int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        int[] iArr3 = new int[(i << 6)];
        try {
            readDCCoeffs(bitReader, iArr, iArr3, i, 64);
            readACCoeffs(bitReader, iArr, iArr3, i, iArr2, 64, 6);
        } catch (RuntimeException unused) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppressing slice error at [");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append("].");
            printStream.println(sb.toString());
        }
        for (int i5 = 0; i5 < i; i5++) {
            SimpleIDCT10Bit.idct10(iArr3, i5 << 6);
        }
        return iArr3;
    }

    /* access modifiers changed from: protected */
    public void decodePicture(ByteBuffer byteBuffer, int[][] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int i4, int i5) {
        int i6 = i3;
        PictureHeader readPictureHeader = readPictureHeader(byteBuffer);
        int i7 = 1 << readPictureHeader.log2SliceMbWidth;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < readPictureHeader.sliceSizes.length; i10++) {
            int i11 = i7;
            while (i6 - i8 < i11) {
                i11 >>= 1;
            }
            int i12 = i11;
            decodeSlice(NIOUtils.read(byteBuffer, (int) readPictureHeader.sliceSizes[i10]), iArr2, iArr3, iArr4, i11, i8, i9, readPictureHeader.sliceSizes[i10], iArr, i, i4, i5);
            int i13 = i8 + i12;
            if (i13 == i6) {
                i7 = 1 << readPictureHeader.log2SliceMbWidth;
                i9++;
                i8 = 0;
            } else {
                i8 = i13;
                i7 = i12;
            }
        }
    }

    public boolean isProgressive(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(20) & 255) >> 2) & 3) == 0;
    }

    public int probe(ByteBuffer byteBuffer) {
        return (byteBuffer.get(4) == 105 && byteBuffer.get(5) == 99 && byteBuffer.get(6) == 112 && byteBuffer.get(7) == 102) ? 100 : 0;
    }

    /* access modifiers changed from: protected */
    public void putSlice(int[][] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int i4, int i5, int i6) {
        int[] iArr5 = iArr2;
        int length = iArr5.length >> 8;
        int i7 = i >> 1;
        int i8 = i5 * i;
        int i9 = i << i4;
        putLuma(iArr[0], i8, i9, i2, i3, iArr5, length, i4, i5);
        if (i6 == 2) {
            int i10 = i5 * i7;
            int i11 = i7 << i4;
            int i12 = i2;
            int i13 = i3;
            int i14 = length;
            int i15 = i4;
            int i16 = i5;
            putChroma(iArr[1], i10, i11, i12, i13, iArr3, i14, i15, i16);
            putChroma(iArr[2], i10, i11, i12, i13, iArr4, i14, i15, i16);
            return;
        }
        int i17 = i8;
        int i18 = i9;
        int i19 = i2;
        int i20 = i3;
        int i21 = length;
        int i22 = i4;
        int i23 = i5;
        putLuma(iArr[1], i17, i18, i19, i20, iArr3, i21, i22, i23);
        putLuma(iArr[2], i17, i18, i19, i20, iArr4, i21, i22, i23);
    }
}
