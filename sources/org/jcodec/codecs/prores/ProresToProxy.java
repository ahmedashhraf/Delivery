package org.jcodec.codecs.prores;

import java.nio.ByteBuffer;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class ProresToProxy {
    private static final int START_QP = 6;
    private int bitsPer1024;
    private int bitsPer1024High;
    private int bitsPer1024Low;
    private int frameSize;
    private int nCoeffs;
    private int[] qMatChromaTo = ProresConsts.QMAT_CHROMA_APCO;
    private int[] qMatLumaTo = ProresConsts.QMAT_LUMA_APCO;

    public ProresToProxy(int i, int i2, int i3) {
        this.frameSize = i3;
        int i4 = i * i2;
        this.bitsPer1024 = (((i3 - ((((i2 >> 4) * (((i >> 4) + 7) >> 3)) * 8) + C13959t.f40921k2)) << 3) << 10) / i4;
        int i5 = this.bitsPer1024;
        this.bitsPer1024High = i5 - (i5 / 10);
        this.bitsPer1024Low = i5 - (i5 / 20);
        this.nCoeffs = Math.max(Math.min(33000 / (i4 >> 8), 64), 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void transcodePicture(java.nio.ByteBuffer r28, java.nio.ByteBuffer r29, org.jcodec.codecs.prores.ProresConsts.FrameHeader r30) {
        /*
            r27 = this;
            r11 = r27
            r12 = r29
            r13 = r30
            org.jcodec.codecs.prores.ProresConsts$PictureHeader r14 = org.jcodec.codecs.prores.ProresDecoder.readPictureHeader(r28)
            int r0 = r14.log2SliceMbWidth
            short[] r1 = r14.sliceSizes
            int r1 = r1.length
            org.jcodec.codecs.prores.ProresEncoder.writePictureHeader(r0, r1, r12)
            java.nio.ByteBuffer r15 = r29.duplicate()
            int r0 = r29.position()
            short[] r1 = r14.sliceSizes
            int r1 = r1.length
            r16 = 1
            int r1 = r1 << 1
            int r0 = r0 + r1
            r12.position(r0)
            int r0 = r13.width
            int r0 = r0 + 15
            int r10 = r0 >> 4
            int r0 = r14.log2SliceMbWidth
            int r0 = r16 << r0
            r17 = 6
            r18 = 0
            r8 = 6
            r9 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x003b:
            short[] r1 = r14.sliceSizes
            int r1 = r1.length
            if (r9 >= r1) goto L_0x00c4
            r7 = r0
        L_0x0041:
            int r0 = r10 - r19
            if (r0 >= r7) goto L_0x0048
            int r7 = r7 >> 1
            goto L_0x0041
        L_0x0048:
            int r22 = r29.position()
            int[] r3 = r13.qMatLuma
            int[] r4 = r13.qMatChroma
            int[] r5 = r13.scan
            short[] r0 = r14.sliceSizes
            short r23 = r0[r9]
            r0 = r27
            r1 = r28
            r2 = r29
            r6 = r7
            r24 = r7
            r7 = r19
            r25 = r8
            r8 = r20
            r26 = r9
            r9 = r23
            r12 = r10
            r10 = r25
            r0.transcodeSlice(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r0 = r29.position()
            int r0 = r0 - r22
            short r0 = (short) r0
            r15.putShort(r0)
            int r1 = r11.bitsPer1024High
            int r7 = r24 * r1
            int r1 = r7 >> 5
            int r1 = r1 + 6
            int r2 = r11.bitsPer1024Low
            int r7 = r24 * r2
            int r2 = r7 >> 5
            int r2 = r2 + 6
            if (r0 <= r1) goto L_0x009c
            r3 = 128(0x80, float:1.794E-43)
            r4 = r25
            if (r4 >= r3) goto L_0x009e
            int r8 = r4 + 1
            int r2 = r1 + r21
            if (r0 <= r2) goto L_0x00a9
            if (r8 >= r3) goto L_0x00a9
            int r8 = r8 + 1
            goto L_0x00a9
        L_0x009c:
            r4 = r25
        L_0x009e:
            if (r0 >= r2) goto L_0x00a8
            r2 = 2
            if (r4 <= r2) goto L_0x00a8
            if (r21 <= 0) goto L_0x00a8
            int r8 = r4 + -1
            goto L_0x00a9
        L_0x00a8:
            r8 = r4
        L_0x00a9:
            int r1 = r1 - r0
            int r21 = r21 + r1
            int r0 = r19 + r24
            if (r0 != r12) goto L_0x00b9
            int r0 = r14.log2SliceMbWidth
            int r0 = r16 << r0
            int r20 = r20 + 1
            r19 = 0
            goto L_0x00bd
        L_0x00b9:
            r19 = r0
            r0 = r24
        L_0x00bd:
            int r9 = r26 + 1
            r10 = r12
            r12 = r29
            goto L_0x003b
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.prores.ProresToProxy.transcodePicture(java.nio.ByteBuffer, java.nio.ByteBuffer, org.jcodec.codecs.prores.ProresConsts$FrameHeader):void");
    }

    private void transcodeSlice(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, short s, int i4) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        int[] iArr4 = iArr2;
        int i5 = i4;
        int i6 = (byteBuffer.get() & 255) >> 3;
        int clip = ProresDecoder.clip(byteBuffer.get() & 255, 1, JpegConst.APP0);
        if (clip > 128) {
            clip = (clip - 96) << 2;
        }
        int i7 = clip;
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        int i8 = ((s - s3) - s2) - i6;
        byteBuffer4.put(48);
        byteBuffer4.put((byte) i5);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        byteBuffer4.putInt(0);
        int position = byteBuffer2.position();
        BitReader bitstream = ProresDecoder.bitstream(byteBuffer3, s2);
        BitWriter bitWriter = new BitWriter(byteBuffer4);
        int i9 = i << 2;
        int[] scaleMat = ProresDecoder.scaleMat(iArr, i7);
        int[] scaleMat2 = ProresDecoder.scaleMat(this.qMatLumaTo, i5);
        ByteBuffer byteBuffer5 = duplicate;
        int[] iArr5 = iArr3;
        int i10 = i8;
        int i11 = i2;
        short s4 = s3;
        int i12 = i3;
        int i13 = i7;
        requant(bitstream, bitWriter, i9, scaleMat, scaleMat2, iArr5, i11, i12, 0);
        int position2 = byteBuffer2.position();
        BitReader bitstream2 = ProresDecoder.bitstream(byteBuffer3, s4);
        BitWriter bitWriter2 = new BitWriter(byteBuffer4);
        int i14 = i << 1;
        int[] scaleMat3 = ProresDecoder.scaleMat(iArr4, i13);
        int i15 = i13;
        int i16 = i4;
        int i17 = i14;
        int i18 = i14;
        int i19 = i15;
        requant(bitstream2, bitWriter2, i17, scaleMat3, ProresDecoder.scaleMat(this.qMatChromaTo, i16), iArr5, i11, i12, 1);
        int position3 = byteBuffer2.position();
        requant(ProresDecoder.bitstream(byteBuffer3, i10), new BitWriter(byteBuffer4), i18, ProresDecoder.scaleMat(iArr4, i19), ProresDecoder.scaleMat(this.qMatChromaTo, i16), iArr5, i11, i12, 2);
        ByteBuffer byteBuffer6 = byteBuffer5;
        byteBuffer6.putShort((short) (position2 - position));
        byteBuffer6.putShort((short) (position3 - position2));
    }

    public int getFrameSize() {
        return this.frameSize;
    }

    /* access modifiers changed from: 0000 */
    public void requant(BitReader bitReader, BitWriter bitWriter, int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int i3, int i4) {
        int[] iArr4 = new int[(i << 6)];
        BitReader bitReader2 = bitReader;
        int[] iArr5 = iArr;
        try {
            ProresDecoder.readDCCoeffs(bitReader, iArr, iArr4, i, 64);
            ProresDecoder.readACCoeffs(bitReader, iArr, iArr4, i, iArr3, this.nCoeffs, 6);
        } catch (RuntimeException unused) {
        }
        for (int i5 = 0; i5 < iArr4.length; i5++) {
            iArr4[i5] = iArr4[i5] << 2;
        }
        BitWriter bitWriter2 = bitWriter;
        int[] iArr6 = iArr2;
        ProresEncoder.writeDCCoeffs(bitWriter, iArr2, iArr4, i);
        ProresEncoder.writeACCoeffs(bitWriter, iArr6, iArr4, i, iArr3, this.nCoeffs);
        bitWriter.flush();
    }

    public void transcode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer duplicate = byteBuffer2.duplicate();
        FrameHeader readFrameHeader = ProresDecoder.readFrameHeader(byteBuffer);
        ProresEncoder.writeFrameHeader(byteBuffer2, readFrameHeader);
        int position = byteBuffer2.position();
        if (readFrameHeader.frameType == 0) {
            transcodePicture(byteBuffer, byteBuffer2, readFrameHeader);
        } else {
            transcodePicture(byteBuffer, byteBuffer2, readFrameHeader);
            transcodePicture(byteBuffer, byteBuffer2, readFrameHeader);
        }
        readFrameHeader.qMatLuma = this.qMatLumaTo;
        readFrameHeader.qMatChroma = this.qMatChromaTo;
        readFrameHeader.payloadSize = byteBuffer2.position() - position;
        ProresEncoder.writeFrameHeader(duplicate, readFrameHeader);
    }
}
