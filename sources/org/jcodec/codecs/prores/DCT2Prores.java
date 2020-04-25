package org.jcodec.codecs.prores;

import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresEncoder.Profile;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class DCT2Prores extends ProresEncoder {
    public DCT2Prores(Profile profile) {
        super(profile);
    }

    private Picture sliceData(Picture picture, int i, int i2, int i3, int i4) {
        Picture create = Picture.create(i4 << 4, 16, ColorSpace.YUV422_10);
        int[][] data = create.getData();
        int[][] data2 = picture.getData();
        int i5 = (i2 * i3) + i;
        System.arraycopy(data2[0], i5 << 8, data[0], 0, data[0].length);
        int i6 = i5 << 7;
        System.arraycopy(data2[1], i6, data[1], 0, data[1].length);
        System.arraycopy(data2[2], i6, data[2], 0, data[2].length);
        return create;
    }

    /* access modifiers changed from: protected */
    public int encodeSlice(ByteBuffer byteBuffer, int[][] iArr, int[][] iArr2, int[] iArr3, int i, int i2, int i3, Picture picture, int i4, int i5, int i6, boolean z) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i7 = i4;
        Picture sliceData = sliceData(picture, i2, i3, i5, i);
        int i8 = (i >> 2) * this.profile.bitrate;
        int i9 = i8 >> 3;
        int i10 = i8 - i9;
        int i11 = i8 + i9;
        byteBuffer2.put(48);
        byteBuffer2.put((byte) i7);
        ByteBuffer duplicate = byteBuffer.duplicate();
        byteBuffer2.putInt(0);
        int position = byteBuffer.position();
        int[] iArr4 = new int[3];
        int i12 = i7 - 1;
        int[] iArr5 = iArr4;
        int i13 = i7;
        ProresEncoder.encodeSliceData(byteBuffer, iArr[i12], iArr2[i12], iArr3, i, sliceData, i4, iArr5);
        if (ProresEncoder.bits(iArr5) > i11 && i13 < this.profile.lastQp) {
            do {
                i13++;
                byteBuffer2.position(position);
                int i14 = i13 - 1;
                ProresEncoder.encodeSliceData(byteBuffer, iArr[i14], iArr2[i14], iArr3, i, sliceData, i13, iArr5);
                if (ProresEncoder.bits(iArr5) <= i11) {
                    break;
                }
            } while (i13 < this.profile.lastQp);
        } else if (ProresEncoder.bits(iArr5) < i10 && i13 > this.profile.firstQp) {
            do {
                i13--;
                byteBuffer2.position(position);
                int i15 = i13 - 1;
                ProresEncoder.encodeSliceData(byteBuffer, iArr[i15], iArr2[i15], iArr3, i, sliceData, i13, iArr5);
                if (ProresEncoder.bits(iArr5) >= i10) {
                    break;
                }
            } while (i13 > this.profile.firstQp);
        }
        duplicate.putShort((short) iArr5[0]);
        duplicate.putShort((short) iArr5[1]);
        return i13;
    }
}
