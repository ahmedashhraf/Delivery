package org.jcodec.codecs.raw;

import androidx.core.p034l.C1056z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jcodec.common.model.Picture;
import org.jcodec.common.tools.MathUtil;

public class V210Encoder {
    static final int clip(int i) {
        return MathUtil.clip(i, 8, C1056z.f4719u);
    }

    public ByteBuffer encodeFrame(ByteBuffer byteBuffer, Picture picture) throws IOException {
        Picture picture2 = picture;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        int planeWidth = ((picture2.getPlaneWidth(0) + 47) / 48) * 48;
        int[][] data = picture.getData();
        int[] iArr = new int[planeWidth];
        int i = planeWidth >> 1;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < picture.getHeight(); i5++) {
            System.arraycopy(data[0], i2, iArr, 0, picture2.getPlaneWidth(0));
            System.arraycopy(data[1], i3, iArr2, 0, picture2.getPlaneWidth(1));
            System.arraycopy(data[2], i4, iArr3, 0, picture2.getPlaneWidth(2));
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < planeWidth) {
                int i9 = i7 + 1;
                int i10 = i6 + 1;
                int clip = (clip(iArr[i6]) << 10) | (clip(iArr3[i7]) << 20) | 0;
                int i11 = i8 + 1;
                duplicate.putInt(clip | clip(iArr2[i8]));
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int i14 = i11 + 1;
                duplicate.putInt(clip(iArr[i10]) | 0 | (clip(iArr[i12]) << 20) | (clip(iArr2[i11]) << 10));
                int i15 = i14 + 1;
                int i16 = i13 + 1;
                int clip2 = (clip(iArr2[i14]) << 20) | 0 | (clip(iArr[i13]) << 10);
                int i17 = i9 + 1;
                duplicate.putInt(clip2 | clip(iArr3[i9]));
                int i18 = i16 + 1;
                int i19 = i18 + 1;
                int clip3 = clip(iArr[i16]) | 0 | (clip(iArr[i18]) << 20);
                int i20 = i17 + 1;
                duplicate.putInt(clip3 | (clip(iArr3[i17]) << 10));
                i7 = i20;
                i8 = i15;
                i6 = i19;
            }
            i2 += picture2.getPlaneWidth(0);
            i3 += picture2.getPlaneWidth(1);
            i4 += picture2.getPlaneWidth(2);
        }
        duplicate.flip();
        return duplicate;
    }
}
