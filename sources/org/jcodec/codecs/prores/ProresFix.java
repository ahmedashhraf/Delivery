package org.jcodec.codecs.prores;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.codecs.prores.ProresConsts.PictureHeader;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.common.tools.MathUtil;

public class ProresFix {
    public static List<String> check(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        byteBuffer.getInt();
        if (!"icpf".equals(ProresDecoder.readSig(byteBuffer))) {
            arrayList.add("[ERROR] Missing ProRes signature (icpf).");
            return arrayList;
        }
        short s = byteBuffer.getShort();
        if (s > 148) {
            arrayList.add("[ERROR] Wrong ProRes frame header.");
            return arrayList;
        }
        byteBuffer.getShort();
        byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        if (s2 < 0 || s2 > 10000 || s3 < 0 || s3 > 10000) {
            StringBuilder sb = new StringBuilder();
            sb.append("[ERROR] Wrong ProRes frame header, invalid image size [");
            sb.append(s2);
            sb.append("x");
            sb.append(s3);
            sb.append("].");
            arrayList.add(sb.toString());
            return arrayList;
        }
        byte b = byteBuffer.get();
        byteBuffer.position((byteBuffer.position() + s) - 13);
        if (((b >> 2) & 3) == 0) {
            checkPicture(byteBuffer, s2, s3, arrayList);
        } else {
            int i = s3 / 2;
            checkPicture(byteBuffer, s2, i, arrayList);
            checkPicture(byteBuffer, s2, i, arrayList);
        }
        return arrayList;
    }

    private static void checkCoeff(BitReader bitReader, int i) {
        int[] iArr = new int[64];
        int[] iArr2 = new int[(i << 6)];
        readDCCoeffs(bitReader, iArr2, i);
        readACCoeffs(bitReader, iArr2, i, iArr);
    }

    private static void checkPicture(ByteBuffer byteBuffer, int i, int i2, List<String> list) {
        PictureHeader readPictureHeader = ProresDecoder.readPictureHeader(byteBuffer);
        int i3 = (i + 15) >> 4;
        int i4 = 1 << readPictureHeader.log2SliceMbWidth;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < readPictureHeader.sliceSizes.length; i7++) {
            while (i3 - i5 < i4) {
                i4 >>= 1;
            }
            try {
                checkSlice(NIOUtils.read(byteBuffer, (int) readPictureHeader.sliceSizes[i7]), i4);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("[ERROR] Slice data corrupt: mbX = ");
                sb.append(i5);
                sb.append(", mbY = ");
                sb.append(i6);
                sb.append(". ");
                sb.append(e.getMessage());
                list.add(sb.toString());
            }
            i5 += i4;
            if (i5 == i3) {
                i4 = 1 << readPictureHeader.log2SliceMbWidth;
                i6++;
                i5 = 0;
            }
        }
    }

    private static void checkSlice(ByteBuffer byteBuffer, int i) {
        int remaining = byteBuffer.remaining();
        int i2 = (byteBuffer.get() & 255) >> 3;
        byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = ((remaining - s2) - s) - i2;
        checkCoeff(ProresDecoder.bitstream(byteBuffer, s), i << 2);
        int i4 = i << 1;
        checkCoeff(ProresDecoder.bitstream(byteBuffer, s2), i4);
        checkCoeff(ProresDecoder.bitstream(byteBuffer, i3), i4);
    }

    static void copyCoeff(BitReader bitReader, BitWriter bitWriter, int i, int[] iArr) {
        int[] iArr2 = new int[(i << 6)];
        try {
            readDCCoeffs(bitReader, iArr2, i);
            readACCoeffs(bitReader, iArr2, i, iArr);
        } catch (RuntimeException unused) {
        }
        writeDCCoeffs(bitWriter, iArr2, i);
        writeACCoeffs(bitWriter, iArr2, i, iArr);
        bitWriter.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        throw new java.lang.RuntimeException("Level codeword damaged");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void readACCoeffs(org.jcodec.common.p554io.BitReader r8, int[] r9, int r10, int[] r11) {
        /*
            int r0 = r10 + -1
            int r10 = org.jcodec.common.tools.MathUtil.log2(r10)
            r1 = 64
            int r1 = r1 << r10
            r2 = 4
            r3 = 2
            r3 = r0
            r4 = 2
        L_0x000d:
            int r5 = r8.remaining()
            r6 = 32
            if (r5 > r6) goto L_0x001f
            r5 = 24
            int r5 = r8.checkNBit(r5)
            if (r5 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return
        L_0x001f:
            org.jcodec.codecs.prores.Codebook[] r5 = org.jcodec.codecs.prores.ProresConsts.runCodebooks
            r6 = 15
            int r2 = java.lang.Math.min(r2, r6)
            r2 = r5[r2]
            int r2 = org.jcodec.codecs.prores.ProresDecoder.readCodeword(r8, r2)
            if (r2 < 0) goto L_0x006c
            int r5 = r1 - r3
            int r5 = r5 + -1
            if (r2 >= r5) goto L_0x006c
            int r5 = r2 + 1
            int r3 = r3 + r5
            org.jcodec.codecs.prores.Codebook[] r5 = org.jcodec.codecs.prores.ProresConsts.levCodebooks
            r6 = 9
            int r4 = java.lang.Math.min(r4, r6)
            r4 = r5[r4]
            int r4 = org.jcodec.codecs.prores.ProresDecoder.readCodeword(r8, r4)
            int r4 = r4 + 1
            if (r4 < 0) goto L_0x0064
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r5) goto L_0x0064
            int r5 = r8.read1Bit()
            int r5 = -r5
            int r6 = r3 >> r10
            r7 = r3 & r0
            int r7 = r7 << 6
            r6 = r11[r6]
            int r7 = r7 + r6
            int r5 = org.jcodec.common.tools.MathUtil.toSigned(r4, r5)
            r9[r7] = r5
            goto L_0x000d
        L_0x0064:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Level codeword damaged"
            r8.<init>(r9)
            throw r8
        L_0x006c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Run codeword damaged"
            r8.<init>(r9)
            goto L_0x0075
        L_0x0074:
            throw r8
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.prores.ProresFix.readACCoeffs(org.jcodec.common.io.BitReader, int[], int, int[]):void");
    }

    static final void readDCCoeffs(BitReader bitReader, int[] iArr, int i) {
        iArr[0] = ProresDecoder.readCodeword(bitReader, ProresConsts.firstDCCodebook);
        if (iArr[0] >= 0) {
            int i2 = 5;
            int i3 = 1;
            int i4 = 64;
            while (i3 < i) {
                i2 = ProresDecoder.readCodeword(bitReader, ProresConsts.dcCodebooks[Math.min(i2, 6)]);
                if (i2 >= 0) {
                    iArr[i4] = i2;
                    i3++;
                    i4 += 64;
                } else {
                    throw new RuntimeException("DC coeff damaged");
                }
            }
            return;
        }
        throw new RuntimeException("First DC coeff damaged");
    }

    public static ByteBuffer transcode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer slice = byteBuffer2.slice();
        ByteBuffer duplicate = slice.duplicate();
        FrameHeader readFrameHeader = ProresDecoder.readFrameHeader(byteBuffer);
        ProresEncoder.writeFrameHeader(slice, readFrameHeader);
        if (readFrameHeader.frameType == 0) {
            transcodePicture(byteBuffer, slice, readFrameHeader);
        } else {
            transcodePicture(byteBuffer, slice, readFrameHeader);
            transcodePicture(byteBuffer, slice, readFrameHeader);
        }
        ProresEncoder.writeFrameHeader(duplicate, readFrameHeader);
        slice.flip();
        return slice;
    }

    private static void transcodePicture(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, FrameHeader frameHeader) {
        PictureHeader readPictureHeader = ProresDecoder.readPictureHeader(byteBuffer);
        ProresEncoder.writePictureHeader(readPictureHeader.log2SliceMbWidth, readPictureHeader.sliceSizes.length, byteBuffer2);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        byteBuffer2.position(byteBuffer2.position() + (readPictureHeader.sliceSizes.length << 1));
        int i = (frameHeader.width + 15) >> 4;
        int i2 = 1 << readPictureHeader.log2SliceMbWidth;
        int i3 = 0;
        for (short transcodeSlice : readPictureHeader.sliceSizes) {
            while (i - i3 < i2) {
                i2 >>= 1;
            }
            int position = byteBuffer2.position();
            transcodeSlice(byteBuffer, byteBuffer2, i2, transcodeSlice, frameHeader);
            duplicate.putShort((short) (byteBuffer2.position() - position));
            i3 += i2;
            if (i3 == i) {
                i2 = 1 << readPictureHeader.log2SliceMbWidth;
                i3 = 0;
            }
        }
    }

    private static void transcodeSlice(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, short s, FrameHeader frameHeader) {
        int i2 = (byteBuffer.get() & 255) >> 3;
        byte b = byteBuffer.get() & 255;
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        int i3 = ((s - s3) - s2) - i2;
        byteBuffer2.put(48);
        byteBuffer2.put((byte) b);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        byteBuffer2.putInt(0);
        int position = byteBuffer2.position();
        copyCoeff(ProresDecoder.bitstream(byteBuffer, s2), new BitWriter(byteBuffer2), i << 2, frameHeader.scan);
        int position2 = byteBuffer2.position();
        int i4 = i << 1;
        copyCoeff(ProresDecoder.bitstream(byteBuffer, s3), new BitWriter(byteBuffer2), i4, frameHeader.scan);
        int position3 = byteBuffer2.position();
        copyCoeff(ProresDecoder.bitstream(byteBuffer, i3), new BitWriter(byteBuffer2), i4, frameHeader.scan);
        duplicate.putShort((short) (position2 - position));
        duplicate.putShort((short) (position3 - position2));
    }

    static final void writeACCoeffs(BitWriter bitWriter, int[] iArr, int i, int[] iArr2) {
        int i2 = 1;
        int i3 = 4;
        int i4 = 2;
        int i5 = 0;
        while (i2 < 64) {
            int i6 = iArr2[i2];
            int i7 = i4;
            int i8 = i3;
            for (int i9 = 0; i9 < i; i9++) {
                int i10 = iArr[(i9 << 6) + i6];
                if (i10 == 0) {
                    i5++;
                } else {
                    ProresEncoder.writeCodeword(bitWriter, ProresConsts.runCodebooks[Math.min(i8, 15)], i5);
                    int level = ProresEncoder.getLevel(i10);
                    ProresEncoder.writeCodeword(bitWriter, ProresConsts.levCodebooks[Math.min(i7, 9)], level - 1);
                    bitWriter.write1Bit(MathUtil.sign(i10));
                    i7 = level;
                    i8 = i5;
                    i5 = 0;
                }
            }
            i2++;
            i3 = i8;
            i4 = i7;
        }
    }

    static final void writeDCCoeffs(BitWriter bitWriter, int[] iArr, int i) {
        ProresEncoder.writeCodeword(bitWriter, ProresConsts.firstDCCodebook, iArr[0]);
        int i2 = 1;
        int i3 = 5;
        int i4 = 64;
        while (i2 < i) {
            ProresEncoder.writeCodeword(bitWriter, ProresConsts.dcCodebooks[Math.min(i3, 6)], iArr[i4]);
            i3 = iArr[i4];
            i2++;
            i4 += 64;
        }
    }
}
