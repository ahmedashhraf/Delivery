package org.jcodec.codecs.mpeg12;

import java.util.Arrays;
import org.jcodec.codecs.mpeg12.MPEGDecoder.Context;
import org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureHeader;
import org.jcodec.codecs.mpeg12.bitstream.SequenceHeader;
import org.jcodec.common.dct.IDCT4x4;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;

public class Mpeg2Thumb4x4 extends MPEGDecoder {
    public static int[] BLOCK_POS_X = {0, 4, 0, 4, 0, 0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 4, 4, 4, 4};
    public static int[] BLOCK_POS_Y = {0, 0, 4, 4, 0, 0, 4, 4, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
    public static int[][] scan4x4 = {new int[]{0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 16, 13, 10, 7, 16, 16, 16, 11, 14, 16, 16, 16, 16, 16, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}, new int[]{0, 4, 8, 12, 1, 5, 2, 6, 9, 13, 16, 16, 16, 16, 16, 16, 16, 16, 14, 10, 3, 7, 16, 16, 11, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}};
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
        int i5 = 0;
        if (i3 == 2) {
            int i6 = 0;
            while (i5 < (1 << i4)) {
                iArr[i] = MPEGDecoder.clip(iArr2[i6]);
                iArr[i + 1] = MPEGDecoder.clip(iArr2[i6 + 1]);
                iArr[i + 2] = MPEGDecoder.clip(iArr2[i6 + 2]);
                iArr[i + 3] = MPEGDecoder.clip(iArr2[i6 + 3]);
                i6 += 4;
                i += i2;
                i5++;
            }
            return;
        }
        int i7 = 0;
        while (i5 < (1 << i4)) {
            iArr[i] = MPEGDecoder.clip(iArr2[i7]);
            iArr[i + 1] = MPEGDecoder.clip(iArr2[i7 + 1]);
            iArr[i + 2] = MPEGDecoder.clip(iArr2[i7 + 2]);
            iArr[i + 3] = MPEGDecoder.clip(iArr2[i7 + 3]);
            iArr[i + 4] = MPEGDecoder.clip(iArr2[i7 + 4]);
            iArr[i + 5] = MPEGDecoder.clip(iArr2[i7 + 5]);
            iArr[i + 6] = MPEGDecoder.clip(iArr2[i7 + 6]);
            iArr[i + 7] = MPEGDecoder.clip(iArr2[i7 + 7]);
            i7 += 8;
            i += i2;
            i5++;
        }
    }

    /* access modifiers changed from: protected */
    public void blockInter(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int i2, int[] iArr3) {
        int i3;
        int i4;
        int i5;
        Arrays.fill(iArr, 1, 16, 0);
        if (vlc == MPEGConst.vlcCoeff0 && bitReader.checkNBit(1) == 1) {
            bitReader.read1Bit();
            iArr[0] = MPEGDecoder.toSigned(MPEGDecoder.quantInter(1, iArr3[0] * i2), bitReader.read1Bit());
            i3 = 0;
        } else {
            iArr[0] = 0;
            i3 = -1;
        }
        int i6 = 0;
        while (true) {
            if (i3 >= (iArr2 == scan4x4[1] ? 7 : 0) + 19) {
                break;
            }
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
        IDCT4x4.idct(iArr, 0);
    }

    /* access modifiers changed from: protected */
    public void blockIntra(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int i3, int i4, int[] iArr4) {
        int i5;
        int i6 = MPEGConst.BLOCK_TO_CC[i];
        int readVLC = (i6 == 0 ? MPEGConst.vlcDCSizeLuma : MPEGConst.vlcDCSizeChroma).readVLC(bitReader);
        iArr2[i6] = iArr2[i6] + (readVLC != 0 ? MPEGDecoder.mpegSigned(bitReader, readVLC) : 0);
        Arrays.fill(iArr, 1, 16, 0);
        iArr[0] = iArr2[i6] * i3;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= (iArr3 == scan4x4[1] ? 7 : 0) + 19) {
                break;
            }
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
        IDCT4x4.idct(iArr, 0);
    }

    public int decodeMacroblock(PictureHeader pictureHeader, Context context, int i, int[] iArr, int[][] iArr2, int i2, BitReader bitReader, int i3, int i4, MPEGPred mPEGPred) {
        MPEGPred mPEGPred2 = mPEGPred;
        if (this.localPred == null || this.oldPred != mPEGPred2) {
            this.localPred = new MPEGPredQuad(mPEGPred2);
            this.oldPred = mPEGPred2;
        }
        return super.decodeMacroblock(pictureHeader, context, i, iArr, iArr2, i2, bitReader, i3, i4, this.localPred);
    }

    /* access modifiers changed from: protected */
    public Context initContext(SequenceHeader sequenceHeader, PictureHeader pictureHeader) {
        Context initContext = super.initContext(sequenceHeader, pictureHeader);
        initContext.codedWidth >>= 1;
        initContext.codedHeight >>= 1;
        initContext.picWidth >>= 1;
        initContext.picHeight >>= 1;
        int[][] iArr = scan4x4;
        PictureCodingExtension pictureCodingExtension = pictureHeader.pictureCodingExtension;
        initContext.scan = iArr[pictureCodingExtension == null ? 0 : pictureCodingExtension.alternate_scan];
        return initContext;
    }

    /* access modifiers changed from: protected */
    public void mapBlock(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = (i3 == 1 && (i == 4 || i == 5)) ? 0 : i2;
        int i6 = 3;
        if (i >= 4) {
            i6 = 3 - MPEGConst.SQUEEZE_X[i3];
        }
        int i7 = i + (i2 << 4);
        int i8 = (BLOCK_POS_Y[i7] << i6) + BLOCK_POS_X[i7];
        int i9 = 1 << (i6 + i5);
        while (i4 < 16) {
            iArr2[i8] = iArr2[i8] + iArr[i4];
            int i10 = i8 + 1;
            iArr2[i10] = iArr2[i10] + iArr[i4 + 1];
            int i11 = i8 + 2;
            iArr2[i11] = iArr2[i11] + iArr[i4 + 2];
            int i12 = i8 + 3;
            iArr2[i12] = iArr2[i12] + iArr[i4 + 3];
            i4 += 4;
            i8 += i9;
        }
    }

    /* access modifiers changed from: protected */
    public void put(int[][] iArr, int[][] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr3 = MPEGConst.SQUEEZE_X;
        int i9 = (((1 << iArr3[i2]) + i) - 1) >> iArr3[i2];
        int i10 = 3 - iArr3[i2];
        int i11 = 3 - MPEGConst.SQUEEZE_Y[i2];
        int i12 = i << i8;
        putSub(iArr2[0], (i3 << 3) + ((i4 << 3) * i12) + (i7 * i), i12, iArr[0], 3, 3);
        int i13 = i9 << i8;
        int i14 = (i3 << i10) + ((i4 << i11) * i13) + (i9 * i7);
        putSub(iArr2[1], i14, i13, iArr[1], i10, i11);
        putSub(iArr2[2], i14, i13, iArr[2], i10, i11);
    }
}
