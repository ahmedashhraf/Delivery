package org.jcodec.codecs.prores;

import androidx.core.p034l.C1056z;
import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.common.dct.IDCT4x4;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;

public class ProresToThumb4x4 extends ProresDecoder {
    public static int[] interlaced_scan_4x4 = {0, 4, 1, 5, 8, 12, 9, 13, 2, 6, 3, 7, 10, 14, 11, 15};
    public static int[] progressive_scan_4x4 = {0, 1, 4, 5, 2, 3, 6, 7, 8, 9, 12, 13, 11, 12, 14, 15};
    private static final int[] srcIncLuma = {4, 4, 4, 20, 4, 4, 4, 20};

    private void putChroma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i + (i3 << 2) + ((i4 << 3) * i2);
        int i9 = 0;
        int i10 = 0;
        while (i9 < i5) {
            int i11 = i8;
            int i12 = i10;
            for (int i13 = 0; i13 < 8; i13++) {
                iArr[i11] = ProresDecoder.clip(iArr2[i12], 4, C1056z.f4719u);
                iArr[i11 + 1] = ProresDecoder.clip(iArr2[i12 + 1], 4, C1056z.f4719u);
                iArr[i11 + 2] = ProresDecoder.clip(iArr2[i12 + 2], 4, C1056z.f4719u);
                iArr[i11 + 3] = ProresDecoder.clip(iArr2[i12 + 3], 4, C1056z.f4719u);
                i12 += 4;
                i11 += i2;
            }
            i9++;
            i8 += 4;
            i10 = i12;
        }
    }

    private void putLuma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i + (i3 << 3) + ((i4 << 3) * i2);
        int i9 = 0;
        int i10 = 0;
        while (i9 < i5) {
            int i11 = i8;
            int i12 = i10;
            for (int i13 = 0; i13 < 8; i13++) {
                iArr[i11] = ProresDecoder.clip(iArr2[i12], 4, C1056z.f4719u);
                iArr[i11 + 1] = ProresDecoder.clip(iArr2[i12 + 1], 4, C1056z.f4719u);
                iArr[i11 + 2] = ProresDecoder.clip(iArr2[i12 + 2], 4, C1056z.f4719u);
                iArr[i11 + 3] = ProresDecoder.clip(iArr2[i12 + 3], 4, C1056z.f4719u);
                iArr[i11 + 4] = ProresDecoder.clip(iArr2[i12 + 16], 4, C1056z.f4719u);
                iArr[i11 + 5] = ProresDecoder.clip(iArr2[i12 + 17], 4, C1056z.f4719u);
                iArr[i11 + 6] = ProresDecoder.clip(iArr2[i12 + 18], 4, C1056z.f4719u);
                iArr[i11 + 7] = ProresDecoder.clip(iArr2[i12 + 19], 4, C1056z.f4719u);
                i12 += srcIncLuma[i13];
                i11 += i2;
            }
            i9++;
            i8 += 8;
            i10 = i12;
        }
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        int i;
        int[][] iArr2 = iArr;
        FrameHeader readFrameHeader = ProresDecoder.readFrameHeader(byteBuffer);
        int i2 = ((readFrameHeader.width + 15) & -16) >> 1;
        int i3 = ((readFrameHeader.height + 15) & -16) >> 1;
        int i4 = i2 * i3;
        int i5 = i4 >> 1;
        if (iArr2 == null || iArr2[0].length < i4 || iArr2[1].length < i5 || iArr2[2].length < i5) {
            throw new RuntimeException("Provided output picture won't fit into provided buffer");
        }
        if (readFrameHeader.frameType == 0) {
            i = 2;
            decodePicture(byteBuffer, iArr, i2, i3, i2 >> 3, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, progressive_scan_4x4, 0, readFrameHeader.chromaType);
        } else {
            i = 2;
            int i6 = i3 >> 1;
            int i7 = i2 >> 3;
            decodePicture(byteBuffer, iArr, i2, i6, i7, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, interlaced_scan_4x4, readFrameHeader.topFieldFirst ? 1 : 2, readFrameHeader.chromaType);
            decodePicture(byteBuffer, iArr, i2, i6, i7, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, interlaced_scan_4x4, readFrameHeader.topFieldFirst ? 2 : 1, readFrameHeader.chromaType);
        }
        return new Picture(i2, i3, iArr, readFrameHeader.chromaType == i ? ColorSpace.YUV422_10 : ColorSpace.YUV444_10);
    }

    /* access modifiers changed from: protected */
    public int[] decodeOnePlane(BitReader bitReader, int i, int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        int[] iArr3 = new int[(i << 4)];
        ProresDecoder.readDCCoeffs(bitReader, iArr, iArr3, i, 16);
        ProresDecoder.readACCoeffs(bitReader, iArr, iArr3, i, iArr2, 16, 4);
        for (int i5 = 0; i5 < i; i5++) {
            IDCT4x4.idct(iArr3, i5 << 4);
        }
        return iArr3;
    }

    /* access modifiers changed from: protected */
    public void putSlice(int[][] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int i4, int i5, int i6) {
        int[] iArr5 = iArr2;
        int length = iArr5.length >> 6;
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
