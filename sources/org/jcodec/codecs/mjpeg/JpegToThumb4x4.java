package org.jcodec.codecs.mjpeg;

import java.nio.ByteBuffer;
import org.jcodec.common.dct.IDCT4x4;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;
import org.jcodec.common.tools.MathUtil;

public class JpegToThumb4x4 extends JpegDecoder {
    private static final int[] mapping4x4 = {0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 16, 13, 10, 7, 16, 16, 16, 11, 14, 16, 16, 16, 16, 16, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};

    public JpegToThumb4x4() {
    }

    private void putBlock4x4(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        int i6 = i >> 1;
        int i7 = i5 * i6;
        int i8 = (i4 * i6) + ((i3 >> 1) * i7) + (i2 >> 1);
        for (int i9 = 0; i9 < 16; i9 += 4) {
            iArr[i8] = MathUtil.clip(iArr2[i9], 0, 255);
            iArr[i8 + 1] = MathUtil.clip(iArr2[i9 + 1], 0, 255);
            iArr[i8 + 2] = MathUtil.clip(iArr2[i9 + 2], 0, 255);
            iArr[i8 + 3] = MathUtil.clip(iArr2[i9 + 3], 0, 255);
            i8 += i7;
        }
    }

    /* access modifiers changed from: 0000 */
    public void decodeBlock(BitReader bitReader, int[] iArr, int[][] iArr2, VLC[] vlcArr, Picture picture, int[] iArr3, int i, int i2, int i3, int i4, int i5, int i6) {
        BitReader bitReader2 = bitReader;
        Picture picture2 = picture;
        int[] iArr4 = iArr3;
        int i7 = i3;
        iArr4[15] = 0;
        iArr4[14] = 0;
        iArr4[13] = 0;
        iArr4[12] = 0;
        iArr4[11] = 0;
        iArr4[10] = 0;
        iArr4[9] = 0;
        iArr4[8] = 0;
        iArr4[7] = 0;
        iArr4[6] = 0;
        iArr4[5] = 0;
        iArr4[4] = 0;
        iArr4[3] = 0;
        iArr4[2] = 0;
        iArr4[1] = 0;
        int readDCValue = (readDCValue(bitReader, vlcArr[i4]) * iArr2[i4][0]) + iArr[i7];
        iArr4[0] = readDCValue;
        iArr[i7] = readDCValue;
        readACValues(bitReader, iArr3, vlcArr[i4 + 2], iArr2[i4]);
        IDCT4x4.idct(iArr3, 0);
        putBlock4x4(picture.getPlaneData(i7), picture.getPlaneWidth(i7), iArr4, i, i2, i5, i6);
    }

    public Picture decodeField(ByteBuffer byteBuffer, int[][] iArr, int i, int i2) {
        Picture decodeField = super.decodeField(byteBuffer, iArr, i, i2);
        Picture picture = new Picture(decodeField.getWidth() >> 1, decodeField.getHeight() >> 1, decodeField.getData(), decodeField.getColor(), new Rect(0, 0, decodeField.getCroppedWidth() >> 1, decodeField.getCroppedHeight() >> 1));
        return picture;
    }

    /* access modifiers changed from: 0000 */
    public void readACValues(BitReader bitReader, int[] iArr, VLC vlc, int[] iArr2) {
        int readVLC16;
        int i = 1;
        do {
            readVLC16 = vlc.readVLC16(bitReader);
            if (readVLC16 == 240) {
                i += 16;
            } else if (readVLC16 > 0) {
                int i2 = i + (readVLC16 >> 4);
                int i3 = readVLC16 & 15;
                iArr[mapping4x4[i2]] = JpegDecoder.toValue(bitReader.readNBit(i3), i3) * iArr2[i2];
                i = i2 + 1;
            }
            if (readVLC16 == 0) {
                break;
            }
        } while (i < 19);
        if (readVLC16 != 0) {
            do {
                int readVLC162 = vlc.readVLC16(bitReader);
                if (readVLC162 == 240) {
                    i += 16;
                } else if (readVLC162 > 0) {
                    int i4 = i + (readVLC162 >> 4);
                    bitReader.skip(readVLC162 & 15);
                    i = i4 + 1;
                }
                if (readVLC162 == 0) {
                    return;
                }
            } while (i < 64);
        }
    }

    public JpegToThumb4x4(boolean z, boolean z2) {
        super(z, z2);
    }
}
