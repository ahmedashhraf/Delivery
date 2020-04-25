package org.jcodec.codecs.prores;

import java.nio.ByteBuffer;
import org.jcodec.codecs.mpeg12.MPEGConst;
import org.jcodec.codecs.mpeg12.MPEGDecoder;
import org.jcodec.codecs.mpeg12.bitstream.GOPHeader;
import org.jcodec.codecs.mpeg12.bitstream.SequenceHeader;
import org.jcodec.codecs.prores.ProresEncoder.Profile;
import org.jcodec.common.dct.DCTRef;
import org.jcodec.common.dct.SimpleIDCT10Bit;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;

public class Mpeg2Prores extends MPEGDecoder {
    private DCT2Prores dct2Prores;

    public Mpeg2Prores(SequenceHeader sequenceHeader, GOPHeader gOPHeader, Profile profile) {
        super(sequenceHeader, gOPHeader);
        this.dct2Prores = new DCT2Prores(profile);
    }

    private Picture colorCvt(Picture picture) {
        if (picture.getColor() == ColorSpace.YUV422_10) {
            return picture;
        }
        Transform transform = ColorUtil.getTransform(picture.getColor(), ColorSpace.YUV422_10);
        Picture create = Picture.create(picture.getWidth(), picture.getHeight(), ColorSpace.YUV422_10);
        transform.transform(picture, create);
        return create;
    }

    private Picture[] convert(Picture picture) {
        int i = 0;
        for (int i2 : picture.getPlaneData(3)) {
            i += i2;
        }
        if (i == 0) {
            upShift(picture);
            return new Picture[]{colorCvt(picture)};
        }
        Picture[] interlaced = interlaced(picture);
        return new Picture[]{colorCvt(interlaced[0]), colorCvt(interlaced[1])};
    }

    private final void copyLine(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i2 + 1;
            int i5 = i + 1;
            iArr2[i2] = iArr[i];
            i3++;
            i2 = i4;
            i = i5;
        }
    }

    private final void copyShift(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            iArr[i] = iArr2[i2] << 2;
            i4++;
            i = i5;
            i2 = i6;
        }
    }

    private void deinterleave(int[] iArr, int i, int i2, int[] iArr2, int[] iArr3, int i3) {
        int i4 = i3 + 0;
        copyLine(iArr, iArr2, i + 0, i4);
        int i5 = i3 + 8;
        copyLine(iArr, iArr2, i + 16, i5);
        int i6 = i3 + 16;
        copyLine(iArr, iArr2, i + 32, i6);
        int i7 = i3 + 24;
        copyLine(iArr, iArr2, i + 48, i7);
        int i8 = i3 + 32;
        copyLine(iArr, iArr2, i2 + 0, i8);
        int i9 = i3 + 40;
        copyLine(iArr, iArr2, i2 + 16, i9);
        int i10 = i3 + 48;
        copyLine(iArr, iArr2, i2 + 32, i10);
        int i11 = i3 + 56;
        copyLine(iArr, iArr2, i2 + 48, i11);
        copyLine(iArr, iArr3, i + 8, i4);
        copyLine(iArr, iArr3, i + 24, i5);
        copyLine(iArr, iArr3, i + 40, i6);
        copyLine(iArr, iArr3, i + 56, i7);
        copyLine(iArr, iArr3, i2 + 8, i8);
        copyLine(iArr, iArr3, i2 + 24, i9);
        copyLine(iArr, iArr3, i2 + 40, i10);
        copyLine(iArr, iArr3, i2 + 56, i11);
    }

    private Picture[] interlaced(Picture picture) {
        Picture picture2 = picture;
        int width = (picture.getWidth() + 15) >> 4;
        int height = (picture.getHeight() + 15) >> 4;
        Picture create = Picture.create(picture.getWidth(), picture.getHeight() >> 1, picture.getColor());
        Picture create2 = Picture.create(picture.getWidth(), picture.getHeight() >> 1, picture.getColor());
        int i = width;
        int i2 = height;
        splitY(i, i2, picture2.getPlaneData(0), create.getPlaneData(0), create2.getPlaneData(0), picture2.getPlaneData(3));
        splitCbCr(i, i2, picture2.getPlaneData(1), create.getPlaneData(1), create2.getPlaneData(1), picture2.getPlaneData(3));
        splitCbCr(i, i2, picture2.getPlaneData(2), create.getPlaneData(2), create2.getPlaneData(2), picture2.getPlaneData(3));
        return new Picture[]{create, create2};
    }

    private void interleave(int[] iArr, int i, int i2) {
        int[] iArr2 = new int[64];
        for (int i3 = 0; i3 < 64; i3++) {
            iArr2[i3] = iArr[i2 + i3];
        }
        int i4 = i + 56;
        copyLine(iArr, iArr, i4, i2 + 48);
        int i5 = i + 48;
        copyLine(iArr, iArr, i5, i2 + 32);
        int i6 = i + 40;
        copyLine(iArr, iArr, i6, i2 + 16);
        int i7 = i + 32;
        copyLine(iArr, iArr, i7, i2);
        int i8 = i + 24;
        copyLine(iArr, iArr, i8, i5);
        int i9 = i + 16;
        copyLine(iArr, iArr, i9, i7);
        int i10 = i + 8;
        copyLine(iArr, iArr, i10, i9);
        copyLine(iArr2, iArr, 0, i10);
        copyLine(iArr2, iArr, 8, i8);
        copyLine(iArr2, iArr, 16, i6);
        copyLine(iArr2, iArr, 24, i4);
        copyLine(iArr2, iArr, 32, i2 + 8);
        copyLine(iArr2, iArr, 40, i2 + 24);
        copyLine(iArr2, iArr, 48, i2 + 40);
    }

    private Picture progressive(Picture picture) {
        progressiveY(picture.getPlaneData(0), picture.getPlaneData(3));
        progressiveCbCr(picture.getPlaneData(0), picture.getPlaneData(3));
        progressiveCbCr(picture.getPlaneData(0), picture.getPlaneData(3));
        return picture;
    }

    private void progressiveCbCr(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (iArr2[i] == 1) {
                int i2 = i << 7;
                int i3 = i2 + 0;
                SimpleIDCT10Bit.idct10(iArr, i3);
                int i4 = i2 + 64;
                SimpleIDCT10Bit.idct10(iArr, i4);
                interleave(iArr, i3, i4);
                DCTRef.fdct(iArr, i3);
                DCTRef.fdct(iArr, i4);
            } else {
                upShift(iArr, i << 7, 128);
            }
        }
    }

    private void progressiveY(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (iArr2[i] == 1) {
                int i2 = i << 8;
                int i3 = i2 + 0;
                SimpleIDCT10Bit.idct10(iArr, i3);
                int i4 = i2 + 64;
                SimpleIDCT10Bit.idct10(iArr, i4);
                int i5 = i2 + 128;
                SimpleIDCT10Bit.idct10(iArr, i5);
                int i6 = i2 + 192;
                SimpleIDCT10Bit.idct10(iArr, i6);
                interleave(iArr, i3, i5);
                interleave(iArr, i4, i6);
                DCTRef.fdct(iArr, i3);
                DCTRef.fdct(iArr, i4);
                DCTRef.fdct(iArr, i5);
                DCTRef.fdct(iArr, i6);
            } else {
                upShift(iArr, i << 8, 256);
            }
        }
    }

    private final void splitCbCr(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr;
        int i4 = i2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < i4) {
            int i9 = i5;
            int i10 = i6;
            int i11 = i7;
            int i12 = 0;
            while (i12 < i3) {
                if (iArr4[i11] == 0) {
                    SimpleIDCT10Bit.idct10(iArr5, i10);
                    int i13 = i10 + 64;
                    SimpleIDCT10Bit.idct10(iArr5, i13);
                    int[] iArr6 = iArr3;
                    deinterleave(iArr, i10, i13, iArr2, iArr6, i9);
                    DCTRef.fdct(iArr2, i9);
                    DCTRef.fdct(iArr6, i9);
                } else {
                    int[] iArr7 = iArr2;
                    int[] iArr8 = iArr3;
                    int[] iArr9 = iArr;
                    int i14 = i9;
                    copyShift(iArr9, i10, iArr2, i14, 64);
                    copyShift(iArr9, i10 + 64, iArr3, i14, 64);
                }
                i12++;
                i11++;
                i9 += 128;
                i10 += 128;
            }
            int[] iArr10 = iArr2;
            i5 = (i8 & 1) == 0 ? i9 - ((i3 << 7) - 64) : i9 - 64;
            i8++;
            i7 = i11;
            i6 = i10;
        }
    }

    private final void splitY(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3;
        int i4;
        int i5 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr3;
        int i6 = i2;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i7;
            int i12 = i8;
            int i13 = i9;
            int i14 = 0;
            while (i14 < i5) {
                if (iArr4[i13] == 0) {
                    SimpleIDCT10Bit.idct10(iArr5, i12);
                    int i15 = i12 + 64;
                    SimpleIDCT10Bit.idct10(iArr5, i15);
                    int i16 = i12 + 128;
                    SimpleIDCT10Bit.idct10(iArr5, i16);
                    int i17 = i12 + 192;
                    SimpleIDCT10Bit.idct10(iArr5, i17);
                    int[] iArr8 = iArr;
                    int i18 = i17;
                    int i19 = i15;
                    int[] iArr9 = iArr2;
                    int i20 = i12;
                    int i21 = i11;
                    deinterleave(iArr8, i12, i16, iArr9, iArr3, i11);
                    i3 = i11;
                    int i22 = i11 + 64;
                    deinterleave(iArr8, i19, i18, iArr9, iArr3, i22);
                    DCTRef.fdct(iArr6, i3);
                    DCTRef.fdct(iArr6, i22);
                    DCTRef.fdct(iArr7, i3);
                    DCTRef.fdct(iArr7, i22);
                    i4 = i20;
                } else {
                    int i23 = i12;
                    i3 = i11;
                    int[] iArr10 = iArr;
                    int i24 = i3;
                    copyShift(iArr10, i23, iArr2, i24, 128);
                    i4 = i23;
                    copyShift(iArr10, i4 + 128, iArr3, i24, 128);
                }
                i14++;
                i13++;
                i12 = i4 + 256;
                i11 = i3 + 256;
            }
            int i25 = i11;
            int i26 = i12;
            i7 = (i10 & 1) == 0 ? i25 - ((i5 << 8) - 128) : i25 - 128;
            i10++;
            i8 = i26;
            i9 = i13;
        }
    }

    private void upShift(Picture picture) {
        int[][] data;
        for (int[] iArr : picture.getData()) {
            upShift(iArr, 0, iArr.length);
        }
    }

    /* access modifiers changed from: protected */
    public void idctPut(int[] iArr, int[][] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = (i5 * (i >> 4)) + i4;
        if (i3 < 4) {
            i8 = i9 << 8;
            i7 = i3 << 6;
        } else {
            i8 = i9 << (i2 + 5);
            i7 = ((i3 - 4) >> 1) << 6;
        }
        System.arraycopy(iArr, 0, iArr2[MPEGConst.BLOCK_TO_CC[i3]], i8 + i7, 64);
        iArr2[3][i9] = i6;
    }

    public ByteBuffer transcode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer slice = byteBuffer2.slice();
        SequenceHeader sequenceHeader = this.f44762sh;
        int i = (sequenceHeader.horizontal_size + 15) & -16;
        int i2 = (sequenceHeader.vertical_size + 15) & -16;
        int i3 = i * i2;
        Picture[] convert = convert(decodeFrame(byteBuffer, new int[][]{new int[i3], new int[i3], new int[i3], new int[((i >> 4) * (i2 >> 4))]}));
        if (convert.length == 1) {
            this.dct2Prores.encodeFrame(slice, convert[0]);
        } else {
            this.dct2Prores.encodeFrame(slice, convert[0], convert[1]);
        }
        slice.flip();
        return slice;
    }

    private void upShift(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + 1;
            iArr[i] = iArr[i] << 2;
            i3++;
            i = i4;
        }
    }
}
