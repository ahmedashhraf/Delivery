package org.jcodec.codecs.h264.p552io;

import org.jcodec.codecs.h264.H264Const;
import org.jcodec.codecs.h264.decode.CAVLCReader;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.common.p554io.VLC;
import org.jcodec.common.tools.MathUtil;

/* renamed from: org.jcodec.codecs.h264.io.CAVLC */
public class CAVLC {
    public static int[] NO_ZIGZAG = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private VLC chromaDCVLC = codeTableChromaDC();
    private ColorSpace color;
    private int mbMask;
    private int mbWidth;
    private int[] tokensLeft;
    private int[] tokensTop;

    public CAVLC(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, int i, int i2) {
        this.color = seqParameterSet.chroma_format_idc;
        this.mbWidth = seqParameterSet.pic_width_in_mbs_minus1 + 1;
        this.mbMask = (1 << i2) - 1;
        this.tokensLeft = new int[4];
        this.tokensTop = new int[(this.mbWidth << i)];
    }

    private static int Abs(int i) {
        return i < 0 ? -i : i;
    }

    private static int Min(int i, int i2) {
        return i < i2 ? i : i2;
    }

    public static final int coeffToken(int i, int i2) {
        return (i << 4) | i2;
    }

    public static final int totalCoeff(int i) {
        return i >> 4;
    }

    public static final int trailingOnes(int i) {
        return i & 15;
    }

    private final int unsigned(int i) {
        int i2 = i >> 31;
        return ((((i ^ i2) - i2) << 1) + (i >>> 31)) - 2;
    }

    private int writeBlockGen(BitWriter bitWriter, int[] iArr, VLC[] vlcArr, int i, int i2, int[] iArr2, VLC vlc) {
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = iArr[iArr2[i6 + i]];
            if (i7 == 0) {
                iArr3[i4] = iArr3[i4] + 1;
                i5++;
            } else {
                int i8 = i4 + 1;
                iArr4[i4] = i7;
                i4 = i8;
            }
        }
        if (i4 < i2) {
            i5 -= iArr3[i4];
        }
        while (i3 < i4 && i3 < 3 && Math.abs(iArr4[(i4 - i3) - 1]) == 1) {
            i3++;
        }
        int coeffToken = coeffToken(i4, i3);
        vlc.writeVLC(bitWriter, coeffToken);
        if (i4 > 0) {
            writeTrailingOnes(bitWriter, iArr4, i4, i3);
            writeLevels(bitWriter, iArr4, i4, i3);
            if (i4 < i2) {
                vlcArr[i4 - 1].writeVLC(bitWriter, i5);
                writeRuns(bitWriter, iArr3, i4, i5);
            }
        }
        return coeffToken;
    }

    private void writeLevels(BitWriter bitWriter, int[] iArr, int i, int i2) {
        int i3;
        int i4 = (i <= 10 || i2 >= 3) ? 0 : 1;
        int i5 = (i - i2) - 1;
        int i6 = i4;
        for (int i7 = i5; i7 >= 0; i7--) {
            int unsigned = unsigned(iArr[i7]);
            if (i7 == i5 && i2 < 3) {
                unsigned -= 2;
            }
            int i8 = unsigned >> i6;
            if ((i6 == 0 && i8 < 14) || (i6 > 0 && i8 < 15)) {
                bitWriter.writeNBit(1, i8 + 1);
                bitWriter.writeNBit(unsigned, i6);
            } else if (i6 != 0 || unsigned >= 30) {
                if (i6 == 0) {
                    unsigned -= 15;
                }
                int i9 = 12;
                while (true) {
                    int i10 = 1 << i9;
                    i3 = ((unsigned - ((i9 + 3) << i6)) - i10) + 4096;
                    if (i3 < i10) {
                        break;
                    }
                    i9++;
                }
                bitWriter.writeNBit(1, i9 + 4);
                bitWriter.writeNBit(i3, i9);
            } else {
                bitWriter.writeNBit(1, 15);
                bitWriter.writeNBit(unsigned - 14, 4);
            }
            if (i6 == 0) {
                i6 = 1;
            }
            if (MathUtil.abs(iArr[i7]) > (3 << (i6 - 1)) && i6 < 6) {
                i6++;
            }
        }
    }

    private void writeRuns(BitWriter bitWriter, int[] iArr, int i, int i2) {
        for (int i3 = i - 1; i3 > 0 && i2 > 0; i3--) {
            H264Const.run[Math.min(6, i2 - 1)].writeVLC(bitWriter, iArr[i3]);
            i2 -= iArr[i3];
        }
    }

    private void writeTrailingOnes(BitWriter bitWriter, int[] iArr, int i, int i2) {
        for (int i3 = i - 1; i3 >= i - i2; i3--) {
            bitWriter.write1Bit(iArr[i3] >>> 31);
        }
    }

    /* access modifiers changed from: protected */
    public VLC codeTableChromaDC() {
        ColorSpace colorSpace = this.color;
        if (colorSpace == ColorSpace.YUV420) {
            return H264Const.coeffTokenChromaDCY420;
        }
        if (colorSpace == ColorSpace.YUV422) {
            return H264Const.coeffTokenChromaDCY422;
        }
        if (colorSpace == ColorSpace.YUV444) {
            return H264Const.coeffToken[0];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int codeTableLuma(boolean z, MBType mBType, int i, boolean z2, MBType mBType2, int i2) {
        int i3;
        int i4 = mBType == null ? 0 : totalCoeff(i);
        if (mBType2 == null) {
            i3 = 0;
        } else {
            i3 = totalCoeff(i2);
        }
        if (z && z2) {
            return ((i4 + i3) + 1) >> 1;
        }
        if (z) {
            return i4;
        }
        if (z2) {
            return i3;
        }
        return 0;
    }

    public VLC getCoeffTokenVLCForChromaDC() {
        return this.chromaDCVLC;
    }

    public VLC getCoeffTokenVLCForLuma(boolean z, MBType mBType, int i, boolean z2, MBType mBType2, int i2) {
        return H264Const.coeffToken[Math.min(codeTableLuma(z, mBType, i, z2, mBType2, i2), 8)];
    }

    public int readACBlock(BitReader bitReader, int[] iArr, int i, int i2, boolean z, MBType mBType, boolean z2, MBType mBType2, int i3, int i4, int[] iArr2) {
        BitReader bitReader2 = bitReader;
        int readCoeffs = readCoeffs(bitReader2, getCoeffTokenVLCForLuma(z, mBType, this.tokensLeft[this.mbMask & i2], z2, mBType2, this.tokensTop[i]), H264Const.totalZeros16, iArr, i3, i4, iArr2);
        int[] iArr3 = this.tokensLeft;
        int i5 = this.mbMask & i2;
        this.tokensTop[i] = readCoeffs;
        iArr3[i5] = readCoeffs;
        return totalCoeff(readCoeffs);
    }

    public void readChromaDCBlock(BitReader bitReader, int[] iArr, boolean z, boolean z2) {
        VLC coeffTokenVLCForChromaDC = getCoeffTokenVLCForChromaDC();
        VLC[] vlcArr = iArr.length == 16 ? H264Const.totalZeros16 : iArr.length == 8 ? H264Const.totalZeros8 : H264Const.totalZeros4;
        readCoeffs(bitReader, coeffTokenVLCForChromaDC, vlcArr, iArr, 0, iArr.length, NO_ZIGZAG);
    }

    public int readCoeffs(BitReader bitReader, VLC vlc, VLC[] vlcArr, int[] iArr, int i, int i2, int[] iArr2) {
        int i3;
        BitReader bitReader2 = bitReader;
        int[] iArr3 = iArr;
        int i4 = i2;
        int readVLC = vlc.readVLC(bitReader2);
        int i5 = totalCoeff(readVLC);
        int trailingOnes = trailingOnes(readVLC);
        if (i5 > 0) {
            int i6 = (i5 <= 10 || trailingOnes >= 3) ? 0 : 1;
            int[] iArr4 = new int[i5];
            int i7 = 0;
            while (i7 < trailingOnes) {
                iArr4[i7] = 1 - (bitReader.read1Bit() * 2);
                i7++;
            }
            while (true) {
                int i8 = 4;
                if (i7 >= i5) {
                    break;
                }
                int readZeroBitCount = CAVLCReader.readZeroBitCount(bitReader2, "");
                if (!(readZeroBitCount == 14 && i6 == 0)) {
                    i8 = i6;
                }
                if (readZeroBitCount >= 15) {
                    i8 = readZeroBitCount - 3;
                }
                int Min = Min(15, readZeroBitCount) << i6;
                if (i8 > 0) {
                    Min += CAVLCReader.readU(bitReader2, i8, "RB: level_suffix");
                }
                if (readZeroBitCount >= 15 && i6 == 0) {
                    Min += 15;
                }
                if (readZeroBitCount >= 16) {
                    Min += (1 << (readZeroBitCount - 3)) - 4096;
                }
                if (i7 == trailingOnes && trailingOnes < 3) {
                    Min += 2;
                }
                int i9 = Min;
                if (i9 % 2 == 0) {
                    iArr4[i7] = (i9 + 2) >> 1;
                } else {
                    iArr4[i7] = ((-i9) - 1) >> 1;
                }
                if (i6 == 0) {
                    i6 = 1;
                }
                if (Abs(iArr4[i7]) > (3 << (i6 - 1)) && i6 < 6) {
                    i6++;
                }
                i7++;
            }
            int i10 = i5 < i4 ? iArr3.length == 4 ? H264Const.totalZeros4[i5 - 1].readVLC(bitReader2) : iArr3.length == 8 ? H264Const.totalZeros8[i5 - 1].readVLC(bitReader2) : H264Const.totalZeros16[i5 - 1].readVLC(bitReader2) : 0;
            int[] iArr5 = new int[i5];
            int i11 = 0;
            while (true) {
                i3 = i5 - 1;
                if (i11 >= i3 || i10 <= 0) {
                    iArr5[i11] = i10;
                    int i12 = 0;
                } else {
                    int readVLC2 = H264Const.run[Math.min(6, i10 - 1)].readVLC(bitReader2);
                    i10 -= readVLC2;
                    iArr5[i11] = readVLC2;
                    i11++;
                }
            }
            iArr5[i11] = i10;
            int i122 = 0;
            while (i3 >= 0 && i122 < i4) {
                int i13 = i122 + iArr5[i3];
                iArr3[iArr2[i13 + i]] = iArr4[i3];
                i3--;
                i122 = i13 + 1;
            }
        }
        return readVLC;
    }

    public void readLumaDCBlock(BitReader bitReader, int[] iArr, int i, boolean z, MBType mBType, boolean z2, MBType mBType2, int[] iArr2) {
        BitReader bitReader2 = bitReader;
        readCoeffs(bitReader2, getCoeffTokenVLCForLuma(z, mBType, this.tokensLeft[0], z2, mBType2, this.tokensTop[i << 2]), H264Const.totalZeros16, iArr, 0, 16, iArr2);
    }

    public void setZeroCoeff(int i, int i2) {
        int[] iArr = this.tokensLeft;
        int i3 = i2 & this.mbMask;
        this.tokensTop[i] = 0;
        iArr[i3] = 0;
    }

    public void writeACBlock(BitWriter bitWriter, int i, int i2, MBType mBType, MBType mBType2, int[] iArr, VLC[] vlcArr, int i3, int i4, int[] iArr2) {
        int writeBlockGen = writeBlockGen(bitWriter, iArr, vlcArr, i3, i4, iArr2, getCoeffTokenVLCForLuma(i != 0, mBType, this.tokensLeft[this.mbMask & i2], i2 != 0, mBType2, this.tokensTop[i]));
        this.tokensLeft[this.mbMask & i2] = writeBlockGen;
        this.tokensTop[i] = writeBlockGen;
    }

    public void writeChrDCBlock(BitWriter bitWriter, int[] iArr, VLC[] vlcArr, int i, int i2, int[] iArr2) {
        writeBlockGen(bitWriter, iArr, vlcArr, i, i2, iArr2, getCoeffTokenVLCForChromaDC());
    }

    public void writeLumaDCBlock(BitWriter bitWriter, int i, int i2, MBType mBType, MBType mBType2, int[] iArr, VLC[] vlcArr, int i3, int i4, int[] iArr2) {
        writeBlockGen(bitWriter, iArr, vlcArr, i3, i4, iArr2, getCoeffTokenVLCForLuma(i != 0, mBType, this.tokensLeft[this.mbMask & i2], i2 != 0, mBType2, this.tokensTop[i]));
    }
}
