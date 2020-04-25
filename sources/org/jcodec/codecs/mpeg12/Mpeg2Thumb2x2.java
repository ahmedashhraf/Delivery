package org.jcodec.codecs.mpeg12;

import org.jcodec.codecs.mpeg12.MPEGDecoder.Context;
import org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureHeader;
import org.jcodec.codecs.mpeg12.bitstream.SequenceHeader;
import org.jcodec.common.dct.IDCT2x2;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;

public class Mpeg2Thumb2x2 extends MPEGDecoder {
    public static int[] BLOCK_POS_X = {0, 2, 0, 2, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 2, 2, 2, 2};
    public static int[] BLOCK_POS_Y = {0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
    public static int[][] scan2x2 = {new int[]{0, 1, 2, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new int[]{0, 2, 4, 4, 1, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}};
    private MPEGPred localPred;
    private MPEGPred oldPred;

    private void finishOff(BitReader bitReader, int i, VLC vlc, int i2) {
        while (i < 64) {
            int readVLC = vlc.readVLC(bitReader);
            if (readVLC != 2048) {
                if (readVLC == 2049) {
                    i += bitReader.readNBit(6) + 1;
                    bitReader.readNBit(i2);
                } else {
                    bitReader.read1Bit();
                }
            } else {
                return;
            }
        }
    }

    private final void putSub(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        if (i3 == 1) {
            iArr[i] = MPEGDecoder.clip(iArr2[0]);
            iArr[i + 1] = MPEGDecoder.clip(iArr2[1]);
            int i5 = i + i2;
            iArr[i5] = MPEGDecoder.clip(iArr2[2]);
            iArr[i5 + 1] = MPEGDecoder.clip(iArr2[3]);
            if (i4 == 2) {
                int i6 = i + (i2 << 1);
                iArr[i6] = MPEGDecoder.clip(iArr2[4]);
                iArr[i6 + 1] = MPEGDecoder.clip(iArr2[5]);
                int i7 = i6 + i2;
                iArr[i7] = MPEGDecoder.clip(iArr2[6]);
                iArr[i7 + 1] = MPEGDecoder.clip(iArr2[7]);
                return;
            }
            return;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            iArr[i] = MPEGDecoder.clip(iArr2[i8]);
            iArr[i + 1] = MPEGDecoder.clip(iArr2[i8 + 1]);
            iArr[i + 2] = MPEGDecoder.clip(iArr2[i8 + 2]);
            iArr[i + 3] = MPEGDecoder.clip(iArr2[i8 + 3]);
            i += i2;
            i8 += 4;
        }
    }

    /* access modifiers changed from: protected */
    public void blockInter(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int i2, int[] iArr3) {
        int i3;
        int i4;
        int i5;
        iArr[3] = 0;
        iArr[2] = 0;
        iArr[1] = 0;
        if (vlc == MPEGConst.vlcCoeff0 && bitReader.checkNBit(1) == 1) {
            bitReader.read1Bit();
            iArr[0] = MPEGDecoder.toSigned(MPEGDecoder.quantInter(1, iArr3[0] * i2), bitReader.read1Bit());
            i3 = 0;
        } else {
            iArr[0] = 0;
            i3 = -1;
        }
        int i6 = 0;
        while (i3 < 6) {
            i6 = vlc.readVLC(bitReader);
            if (i6 == 2048) {
                break;
            }
            if (i6 == 2049) {
                i5 = i3 + bitReader.readNBit(6) + 1;
                i4 = MPEGDecoder.quantInterSigned(MPEGDecoder.twosSigned(bitReader, i), iArr3[i5] * i2);
            } else {
                i5 = i3 + (i6 >> 6) + 1;
                i4 = MPEGDecoder.toSigned(MPEGDecoder.quantInter(i6 & 63, iArr3[i5] * i2), bitReader.read1Bit());
            }
            iArr[iArr2[i3]] = i4;
        }
        if (i6 != 2048) {
            finishOff(bitReader, i3, vlc, i);
        }
        IDCT2x2.idct(iArr, 0);
    }

    /* access modifiers changed from: protected */
    public void blockIntra(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int i3, int i4, int[] iArr4) {
        int i5;
        int i6 = MPEGConst.BLOCK_TO_CC[i];
        int readVLC = (i6 == 0 ? MPEGConst.vlcDCSizeLuma : MPEGConst.vlcDCSizeChroma).readVLC(bitReader);
        iArr2[i6] = iArr2[i6] + (readVLC != 0 ? MPEGDecoder.mpegSigned(bitReader, readVLC) : 0);
        iArr[0] = iArr2[i6] * i3;
        iArr[3] = 0;
        iArr[2] = 0;
        iArr[1] = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < 6) {
            i8 = vlc.readVLC(bitReader);
            if (i8 == 2048) {
                break;
            }
            if (i8 == 2049) {
                i7 += bitReader.readNBit(6) + 1;
                int twosSigned = MPEGDecoder.twosSigned(bitReader, i2) * i4 * iArr4[i7];
                i5 = twosSigned >= 0 ? twosSigned >> 4 : -((-twosSigned) >> 4);
            } else {
                i7 += (i8 >> 6) + 1;
                i5 = MPEGDecoder.toSigned((((i8 & 63) * i4) * iArr4[i7]) >> 4, bitReader.read1Bit());
            }
            iArr[iArr3[i7]] = i5;
        }
        if (i8 != 2048) {
            finishOff(bitReader, i7, vlc, i2);
        }
        IDCT2x2.idct(iArr, 0);
    }

    public int decodeMacroblock(PictureHeader pictureHeader, Context context, int i, int[] iArr, int[][] iArr2, int i2, BitReader bitReader, int i3, int i4, MPEGPred mPEGPred) {
        MPEGPred mPEGPred2 = mPEGPred;
        if (this.localPred == null || this.oldPred != mPEGPred2) {
            this.localPred = new MPEGPredOct(mPEGPred2);
            this.oldPred = mPEGPred2;
        }
        return super.decodeMacroblock(pictureHeader, context, i, iArr, iArr2, i2, bitReader, i3, i4, this.localPred);
    }

    /* access modifiers changed from: protected */
    public Context initContext(SequenceHeader sequenceHeader, PictureHeader pictureHeader) {
        Context initContext = super.initContext(sequenceHeader, pictureHeader);
        initContext.codedWidth >>= 2;
        initContext.codedHeight >>= 2;
        initContext.picWidth >>= 2;
        initContext.picHeight >>= 2;
        int[][] iArr = scan2x2;
        PictureCodingExtension pictureCodingExtension = pictureHeader.pictureCodingExtension;
        initContext.scan = iArr[pictureCodingExtension == null ? 0 : pictureCodingExtension.alternate_scan];
        return initContext;
    }

    /* access modifiers changed from: protected */
    public void mapBlock(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = (i3 == 1 && (i == 4 || i == 5)) ? 0 : i2;
        int i5 = i < 4 ? 2 : 2 - MPEGConst.SQUEEZE_X[i3];
        int i6 = i + (i2 << 4);
        int i7 = (BLOCK_POS_Y[i6] << i5) + BLOCK_POS_X[i6];
        int i8 = 1 << (i5 + i4);
        iArr2[i7] = iArr2[i7] + iArr[0];
        int i9 = i7 + 1;
        iArr2[i9] = iArr2[i9] + iArr[1];
        int i10 = i7 + i8;
        iArr2[i10] = iArr2[i10] + iArr[2];
        int i11 = i10 + 1;
        iArr2[i11] = iArr2[i11] + iArr[3];
    }

    /* access modifiers changed from: protected */
    public void put(int[][] iArr, int[][] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr3 = MPEGConst.SQUEEZE_X;
        int i9 = ((i + (1 << iArr3[i2])) - 1) >> iArr3[i2];
        int i10 = 2 - iArr3[i2];
        int i11 = 2 - MPEGConst.SQUEEZE_Y[i2];
        int i12 = i << i8;
        putSub(iArr2[0], (i3 << 2) + ((i4 << 2) * i12) + (i7 * i), i12, iArr[0], 2, 2);
        int i13 = i9 << i8;
        int i14 = (i3 << i10) + ((i4 << i11) * i13) + (i9 * i7);
        putSub(iArr2[1], i14, i13, iArr[1], i10, i11);
        putSub(iArr2[2], i14, i13, iArr[2], i10, i11);
    }
}
