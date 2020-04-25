package org.jcodec.codecs.prores;

import androidx.core.p034l.C1056z;
import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.common.dct.IDCT2x2;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;

public class ProresToThumb2x2 extends ProresDecoder {
    private void putChroma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i2 * 3;
        int i9 = i + (i3 << 1) + ((i4 << 2) * i2);
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            iArr[i9] = ProresDecoder.clip(iArr2[i10], 4, C1056z.f4719u);
            iArr[i9 + 1] = ProresDecoder.clip(iArr2[i10 + 1], 4, C1056z.f4719u);
            int i12 = i9 + i2;
            iArr[i12] = ProresDecoder.clip(iArr2[i10 + 2], 4, C1056z.f4719u);
            iArr[i12 + 1] = ProresDecoder.clip(iArr2[i10 + 3], 4, C1056z.f4719u);
            int i13 = i12 + i2;
            iArr[i13] = ProresDecoder.clip(iArr2[i10 + 4], 4, C1056z.f4719u);
            iArr[i13 + 1] = ProresDecoder.clip(iArr2[i10 + 5], 4, C1056z.f4719u);
            int i14 = i13 + i2;
            iArr[i14] = ProresDecoder.clip(iArr2[i10 + 6], 4, C1056z.f4719u);
            iArr[i14 + 1] = ProresDecoder.clip(iArr2[i10 + 7], 4, C1056z.f4719u);
            i9 = i14 + (2 - i8);
            i10 += 8;
        }
    }

    private void putLuma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i + (i3 << 2) + ((i4 << 2) * i2);
        int i9 = i2 * 3;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            iArr[i8] = ProresDecoder.clip(iArr2[i10], 4, C1056z.f4719u);
            iArr[i8 + 1] = ProresDecoder.clip(iArr2[i10 + 1], 4, C1056z.f4719u);
            iArr[i8 + 2] = ProresDecoder.clip(iArr2[i10 + 4], 4, C1056z.f4719u);
            iArr[i8 + 3] = ProresDecoder.clip(iArr2[i10 + 5], 4, C1056z.f4719u);
            int i12 = i8 + i2;
            iArr[i12] = ProresDecoder.clip(iArr2[i10 + 2], 4, C1056z.f4719u);
            iArr[i12 + 1] = ProresDecoder.clip(iArr2[i10 + 3], 4, C1056z.f4719u);
            iArr[i12 + 2] = ProresDecoder.clip(iArr2[i10 + 6], 4, C1056z.f4719u);
            iArr[i12 + 3] = ProresDecoder.clip(iArr2[i10 + 7], 4, C1056z.f4719u);
            int i13 = i12 + i2;
            iArr[i13] = ProresDecoder.clip(iArr2[i10 + 8], 4, C1056z.f4719u);
            iArr[i13 + 1] = ProresDecoder.clip(iArr2[i10 + 9], 4, C1056z.f4719u);
            iArr[i13 + 2] = ProresDecoder.clip(iArr2[i10 + 12], 4, C1056z.f4719u);
            iArr[i13 + 3] = ProresDecoder.clip(iArr2[i10 + 13], 4, C1056z.f4719u);
            int i14 = i13 + i2;
            iArr[i14] = ProresDecoder.clip(iArr2[i10 + 10], 4, C1056z.f4719u);
            iArr[i14 + 1] = ProresDecoder.clip(iArr2[i10 + 11], 4, C1056z.f4719u);
            iArr[i14 + 2] = ProresDecoder.clip(iArr2[i10 + 14], 4, C1056z.f4719u);
            iArr[i14 + 3] = ProresDecoder.clip(iArr2[i10 + 15], 4, C1056z.f4719u);
            i8 = i14 + (4 - i9);
            i10 += 16;
        }
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        int[][] iArr2 = iArr;
        FrameHeader readFrameHeader = ProresDecoder.readFrameHeader(byteBuffer);
        int i = ((readFrameHeader.width + 15) & -16) >> 2;
        int i2 = ((readFrameHeader.height + 15) & -16) >> 2;
        int i3 = i * i2;
        int i4 = i3 >> 1;
        if (iArr2 == null || iArr2[0].length < i3 || iArr2[1].length < i4 || iArr2[2].length < i4) {
            throw new RuntimeException("Provided output picture won't fit into provided buffer");
        }
        if (readFrameHeader.frameType == 0) {
            decodePicture(byteBuffer, iArr, i, i2, i >> 2, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0, 1, 2, 3}, 0, readFrameHeader.chromaType);
        } else {
            int i5 = i2 >> 1;
            int i6 = i >> 2;
            decodePicture(byteBuffer, iArr, i, i5, i6, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0, 2, 1, 3}, readFrameHeader.topFieldFirst ? 1 : 2, readFrameHeader.chromaType);
            decodePicture(byteBuffer, iArr, i, i5, i6, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0, 2, 1, 3}, readFrameHeader.topFieldFirst ? 2 : 1, readFrameHeader.chromaType);
        }
        return new Picture(i, i2, iArr2, readFrameHeader.chromaType == 2 ? ColorSpace.YUV422_10 : ColorSpace.YUV444_10);
    }

    /* access modifiers changed from: protected */
    public int[] decodeOnePlane(BitReader bitReader, int i, int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        int[] iArr3 = new int[(i << 2)];
        ProresDecoder.readDCCoeffs(bitReader, iArr, iArr3, i, 4);
        ProresDecoder.readACCoeffs(bitReader, iArr, iArr3, i, iArr2, 4, 2);
        for (int i5 = 0; i5 < i; i5++) {
            IDCT2x2.idct(iArr3, i5 << 2);
        }
        return iArr3;
    }

    /* access modifiers changed from: protected */
    public void putSlice(int[][] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int i4, int i5, int i6) {
        int[] iArr5 = iArr2;
        int length = iArr5.length >> 4;
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
