package org.jcodec.codecs.prores;

import androidx.core.p034l.C1056z;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresConsts.FrameHeader;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.p554io.BitReader;

public class ProresToThumb extends ProresDecoder {
    private void putChroma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i + i3 + ((i4 << 1) * i2);
        int i9 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            iArr[i8] = ProresDecoder.clip(iArr2[i9], 4, C1056z.f4719u);
            int i11 = i8 + i2;
            iArr[i11] = ProresDecoder.clip(iArr2[i9 + 1], 4, C1056z.f4719u);
            i8 = i11 + (1 - i2);
            i9 += 2;
        }
    }

    private void putLuma(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8 = i + (i3 << 1) + ((i4 << 1) * i2);
        int i9 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            iArr[i8] = ProresDecoder.clip(iArr2[i9], 4, C1056z.f4719u);
            iArr[i8 + 1] = ProresDecoder.clip(iArr2[i9 + 1], 4, C1056z.f4719u);
            int i11 = i8 + i2;
            iArr[i11] = ProresDecoder.clip(iArr2[i9 + 2], 4, C1056z.f4719u);
            iArr[i11 + 1] = ProresDecoder.clip(iArr2[i9 + 3], 4, C1056z.f4719u);
            i8 = i11 + (2 - i2);
            i9 += 4;
        }
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        int[][] iArr2 = iArr;
        FrameHeader readFrameHeader = ProresDecoder.readFrameHeader(byteBuffer);
        int i = ((readFrameHeader.width + 15) & -16) >> 3;
        int i2 = ((readFrameHeader.height + 15) & -16) >> 3;
        int i3 = i * i2;
        int i4 = i3 >> 1;
        if (iArr2 == null || iArr2[0].length < i3 || iArr2[1].length < i4 || iArr2[2].length < i4) {
            throw new RuntimeException("Provided output picture won't fit into provided buffer");
        }
        if (readFrameHeader.frameType == 0) {
            decodePicture(byteBuffer, iArr, i, i2, i >> 1, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0}, 0, readFrameHeader.chromaType);
        } else {
            int i5 = i2 >> 1;
            int i6 = i >> 1;
            decodePicture(byteBuffer, iArr, i, i5, i6, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0}, readFrameHeader.topFieldFirst ? 1 : 2, readFrameHeader.chromaType);
            decodePicture(byteBuffer, iArr, i, i5, i6, readFrameHeader.qMatLuma, readFrameHeader.qMatChroma, new int[]{0}, readFrameHeader.topFieldFirst ? 2 : 1, readFrameHeader.chromaType);
        }
        return new Picture(i, i2, iArr, readFrameHeader.chromaType == 2 ? ColorSpace.YUV422_10 : ColorSpace.YUV444_10);
    }

    /* access modifiers changed from: protected */
    public int[] decodeOnePlane(BitReader bitReader, int i, int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        int[] iArr3 = new int[i];
        try {
            ProresDecoder.readDCCoeffs(bitReader, iArr, iArr3, i, 1);
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
            iArr3[i5] = iArr3[i5] >> 3;
        }
        return iArr3;
    }

    /* access modifiers changed from: protected */
    public void putSlice(int[][] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int i4, int i5, int i6) {
        int[] iArr5 = iArr2;
        int length = iArr5.length >> 2;
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
