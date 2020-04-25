package org.jcodec.codecs.mpeg12;

import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jcodec.codecs.mpeg12.MPEGConst.MBType;
import org.jcodec.codecs.mpeg12.bitstream.GOPHeader;
import org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureHeader;
import org.jcodec.codecs.mpeg12.bitstream.QuantMatrixExtension;
import org.jcodec.codecs.mpeg12.bitstream.SequenceExtension;
import org.jcodec.codecs.mpeg12.bitstream.SequenceHeader;
import org.jcodec.codecs.mpeg12.bitstream.SequenceScalableExtension;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.dct.SparseIDCT;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.model.Size;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;

public class MPEGDecoder implements VideoDecoder {

    /* renamed from: gh */
    protected GOPHeader f44761gh;
    private Picture[] refFields = new Picture[2];
    private Picture[] refFrames = new Picture[2];

    /* renamed from: sh */
    protected SequenceHeader f44762sh;

    public class Context {
        public int codedHeight;
        public int codedWidth;
        public ColorSpace color;
        int[] intra_dc_predictor = new int[3];
        public MBType lastPredB;
        public int mbHeight;
        int mbNo;
        public int mbWidth;
        public int picHeight;
        public int picWidth;
        public int[][] qMats;
        public int[] scan;

        public Context() {
        }
    }

    public MPEGDecoder(SequenceHeader sequenceHeader, GOPHeader gOPHeader) {
        this.f44762sh = sequenceHeader;
        this.f44761gh = gOPHeader;
    }

    private static final void avgPred(int[][] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i].length; i2 += 4) {
                iArr[i][i2] = ((iArr[i][i2] + iArr2[i][i2]) + 1) >> 1;
                int i3 = i2 + 1;
                iArr[i][i3] = ((iArr[i][i3] + iArr2[i][i3]) + 1) >> 1;
                int i4 = i2 + 2;
                iArr[i][i4] = ((iArr[i][i4] + iArr2[i][i4]) + 1) >> 1;
                int i5 = i2 + 3;
                iArr[i][i5] = ((iArr[i][i5] + iArr2[i][i5]) + 1) >> 1;
            }
        }
    }

    private static final int[][] buildPred(int[][] iArr, int[][] iArr2) {
        if (iArr != null && iArr2 != null) {
            avgPred(iArr, iArr2);
            return iArr;
        } else if (iArr != null) {
            return iArr;
        } else {
            if (iArr2 != null) {
                return iArr2;
            }
            throw new RuntimeException("Omited pred in B-frames --> invalid");
        }
    }

    protected static final int clip(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private Picture copyAndCreateIfNeeded(Picture picture, Picture picture2) {
        if (picture2 == null || !picture2.compatible(picture)) {
            picture2 = picture.createCompatible();
        }
        picture2.copyFrom(picture);
        return picture2;
    }

    public static int getCodedHeight(SequenceHeader sequenceHeader, PictureHeader pictureHeader) {
        PictureCodingExtension pictureCodingExtension = pictureHeader.pictureCodingExtension;
        int i = (pictureCodingExtension == null || pictureCodingExtension.picture_structure == 3) ? 0 : 1;
        return (((sequenceHeader.vertical_size >> i) + 15) & -16) << i;
    }

    private ColorSpace getColor(int i) {
        if (i == 1) {
            return ColorSpace.YUV420;
        }
        if (i == 2) {
            return ColorSpace.YUV422;
        }
        if (i != 3) {
            return null;
        }
        return ColorSpace.YUV444;
    }

    private static SequenceHeader getSequenceHeader(ByteBuffer byteBuffer) {
        ByteBuffer nextSegment = MPEGUtil.nextSegment(byteBuffer);
        while (nextSegment != null) {
            if (nextSegment.getInt() == 435) {
                return SequenceHeader.read(nextSegment);
            }
            nextSegment = MPEGUtil.nextSegment(byteBuffer);
        }
        return null;
    }

    public static Size getSize(ByteBuffer byteBuffer) {
        SequenceHeader sequenceHeader = getSequenceHeader(byteBuffer.duplicate());
        return new Size(sequenceHeader.horizontal_size, sequenceHeader.vertical_size);
    }

    public static final int mpegSigned(BitReader bitReader, int i) {
        int readNBit = bitReader.readNBit(i);
        int i2 = (readNBit >>> (i - 1)) ^ 1;
        return (readNBit + i2) - (i2 << i);
    }

    private void mvZero(Context context, PictureHeader pictureHeader, MPEGPred mPEGPred, int i, int i2, int[][] iArr) {
        int[][] iArr2;
        Context context2 = context;
        PictureHeader pictureHeader2 = pictureHeader;
        int[][] iArr3 = iArr;
        int i3 = 3;
        if (pictureHeader2.picture_coding_type == 2) {
            Picture picture = this.refFrames[0];
            int i4 = i << 4;
            int i5 = i2 << 4;
            PictureCodingExtension pictureCodingExtension = pictureHeader2.pictureCodingExtension;
            if (pictureCodingExtension != null) {
                i3 = pictureCodingExtension.picture_structure;
            }
            mPEGPred.predict16x16NoMV(picture, i4, i5, i3, 0, iArr);
            return;
        }
        if (context2.lastPredB.macroblock_motion_backward == 1) {
            Picture picture2 = this.refFrames[0];
            int i6 = i << 4;
            int i7 = i2 << 4;
            PictureCodingExtension pictureCodingExtension2 = pictureHeader2.pictureCodingExtension;
            mPEGPred.predict16x16NoMV(picture2, i6, i7, pictureCodingExtension2 == null ? 3 : pictureCodingExtension2.picture_structure, 1, iArr);
            iArr2 = new int[][]{new int[iArr3[0].length], new int[iArr3[1].length], new int[iArr3[2].length]};
        } else {
            iArr2 = iArr3;
        }
        if (context2.lastPredB.macroblock_motion_forward == 1) {
            Picture picture3 = this.refFrames[1];
            int i8 = i << 4;
            int i9 = i2 << 4;
            PictureCodingExtension pictureCodingExtension3 = pictureHeader2.pictureCodingExtension;
            mPEGPred.predict16x16NoMV(picture3, i8, i9, pictureCodingExtension3 == null ? 3 : pictureCodingExtension3.picture_structure, 0, iArr2);
            if (iArr3 != iArr2) {
                avgPred(iArr3, iArr2);
            }
        }
    }

    private final void putSub(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        int i5 = 0;
        if (i3 == 3) {
            int i6 = 0;
            while (i5 < (1 << i4)) {
                iArr[i] = clip(iArr2[i6]);
                iArr[i + 1] = clip(iArr2[i6 + 1]);
                iArr[i + 2] = clip(iArr2[i6 + 2]);
                iArr[i + 3] = clip(iArr2[i6 + 3]);
                iArr[i + 4] = clip(iArr2[i6 + 4]);
                iArr[i + 5] = clip(iArr2[i6 + 5]);
                iArr[i + 6] = clip(iArr2[i6 + 6]);
                iArr[i + 7] = clip(iArr2[i6 + 7]);
                i6 += 8;
                i += i2;
                i5++;
            }
            return;
        }
        int i7 = 0;
        while (i5 < (1 << i4)) {
            iArr[i] = clip(iArr2[i7]);
            iArr[i + 1] = clip(iArr2[i7 + 1]);
            iArr[i + 2] = clip(iArr2[i7 + 2]);
            iArr[i + 3] = clip(iArr2[i7 + 3]);
            iArr[i + 4] = clip(iArr2[i7 + 4]);
            iArr[i + 5] = clip(iArr2[i7 + 5]);
            iArr[i + 6] = clip(iArr2[i7 + 6]);
            iArr[i + 7] = clip(iArr2[i7 + 7]);
            iArr[i + 8] = clip(iArr2[i7 + 8]);
            iArr[i + 9] = clip(iArr2[i7 + 9]);
            iArr[i + 10] = clip(iArr2[i7 + 10]);
            iArr[i + 11] = clip(iArr2[i7 + 11]);
            iArr[i + 12] = clip(iArr2[i7 + 12]);
            iArr[i + 13] = clip(iArr2[i7 + 13]);
            iArr[i + 14] = clip(iArr2[i7 + 14]);
            iArr[i + 15] = clip(iArr2[i7 + 15]);
            i7 += 16;
            i += i2;
            i5++;
        }
    }

    protected static final int quantInter(int i, int i2) {
        return (((i << 1) + 1) * i2) >> 5;
    }

    protected static final int quantInterSigned(int i, int i2) {
        return i >= 0 ? quantInter(i, i2) : -quantInter(-i, i2);
    }

    private final int readCbPattern(BitReader bitReader) {
        int i;
        int readNBit;
        int readVLC = MPEGConst.vlcCBP.readVLC(bitReader);
        SequenceExtension sequenceExtension = this.f44762sh.sequenceExtension;
        if (sequenceExtension != null) {
            int i2 = sequenceExtension.chroma_format;
            if (i2 != 1) {
                if (i2 == 2) {
                    i = readVLC << 2;
                    readNBit = bitReader.readNBit(2);
                } else if (i2 == 3) {
                    i = readVLC << 6;
                    readNBit = bitReader.readNBit(6);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported chroma format: ");
                    sb.append(this.f44762sh.sequenceExtension.chroma_format);
                    throw new RuntimeException(sb.toString());
                }
                return readNBit | i;
            }
        }
        return readVLC;
    }

    private PictureHeader readHeader(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        PictureHeader pictureHeader = null;
        while (true) {
            ByteBuffer nextSegment = MPEGUtil.nextSegment(duplicate);
            if (nextSegment == null) {
                break;
            }
            int i = nextSegment.getInt() & 255;
            if (i != 179) {
                if (i != 184) {
                    if (i != 0) {
                        if (i != 181) {
                            if (i != 178) {
                                break;
                            }
                        } else {
                            int i2 = nextSegment.get(4) >> 4;
                            if (i2 == 1 || i2 == 5 || i2 == 2) {
                                SequenceHeader.readExtension(nextSegment, this.f44762sh);
                            } else {
                                PictureHeader.readExtension(nextSegment, pictureHeader, this.f44762sh);
                            }
                        }
                    } else {
                        pictureHeader = PictureHeader.read(nextSegment);
                    }
                } else {
                    this.f44761gh = GOPHeader.read(nextSegment);
                }
            } else {
                SequenceHeader read = SequenceHeader.read(nextSegment);
                SequenceHeader sequenceHeader = this.f44762sh;
                if (sequenceHeader != null) {
                    read.copyExtensions(sequenceHeader);
                }
                this.f44762sh = read;
            }
            byteBuffer.position(duplicate.position());
        }
        return pictureHeader;
    }

    private void resetDCPredictors(Context context, PictureHeader pictureHeader) {
        PictureCodingExtension pictureCodingExtension = pictureHeader.pictureCodingExtension;
        int i = pictureCodingExtension != null ? 1 << (pictureCodingExtension.intra_dc_precision + 7) : 128;
        int[] iArr = context.intra_dc_predictor;
        iArr[2] = i;
        iArr[1] = i;
        iArr[0] = i;
    }

    public static final int toSigned(int i, int i2) {
        int i3 = (i2 << 31) >> 31;
        return (i ^ i3) - i3;
    }

    public static final int twosSigned(BitReader bitReader, int i) {
        int i2 = 32 - i;
        return (bitReader.readNBit(i) << i2) >> i2;
    }

    private int[] zigzag(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[64];
        for (int i = 0; i < iArr2.length; i++) {
            iArr3[i] = iArr[iArr2[i]];
        }
        return iArr3;
    }

    /* access modifiers changed from: protected */
    public void blockInter(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int i2, int[] iArr3) {
        int i3;
        int i4;
        int i5 = 0;
        if (vlc == MPEGConst.vlcCoeff0 && bitReader.checkNBit(1) == 1) {
            bitReader.read1Bit();
            SparseIDCT.start(iArr, toSigned(quantInter(1, iArr3[0] * i2), bitReader.read1Bit()));
        } else {
            SparseIDCT.start(iArr, 0);
            i5 = -1;
        }
        while (i3 < 64) {
            int readVLC = vlc.readVLC(bitReader);
            if (readVLC == 2048) {
                break;
            }
            if (readVLC == 2049) {
                i3 += bitReader.readNBit(6) + 1;
                i4 = quantInterSigned(twosSigned(bitReader, i), iArr3[i3] * i2);
            } else {
                i3 += (readVLC >> 6) + 1;
                i4 = toSigned(quantInter(readVLC & 63, iArr3[i3] * i2), bitReader.read1Bit());
            }
            SparseIDCT.coeff(iArr, iArr2[i3], i4);
        }
        SparseIDCT.finish(iArr);
    }

    /* access modifiers changed from: protected */
    public void blockIntra(BitReader bitReader, VLC vlc, int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int i3, int i4, int[] iArr4) {
        int i5;
        int i6 = MPEGConst.BLOCK_TO_CC[i];
        int readVLC = (i6 == 0 ? MPEGConst.vlcDCSizeLuma : MPEGConst.vlcDCSizeChroma).readVLC(bitReader);
        int i7 = 0;
        iArr2[i6] = iArr2[i6] + (readVLC != 0 ? mpegSigned(bitReader, readVLC) : 0);
        SparseIDCT.start(iArr, iArr2[i6] * i3);
        while (i7 < 64) {
            int readVLC2 = vlc.readVLC(bitReader);
            if (readVLC2 == 2048) {
                break;
            }
            if (readVLC2 == 2049) {
                i7 += bitReader.readNBit(6) + 1;
                int twosSigned = twosSigned(bitReader, i2) * i4 * iArr4[i7];
                i5 = twosSigned >= 0 ? twosSigned >> 4 : -((-twosSigned) >> 4);
            } else {
                i7 += (readVLC2 >> 6) + 1;
                i5 = toSigned((((readVLC2 & 63) * i4) * iArr4[i7]) >> 4, bitReader.read1Bit());
            }
            SparseIDCT.coeff(iArr, iArr3[i7], i5);
        }
        SparseIDCT.finish(iArr);
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        Picture picture;
        PictureHeader readHeader = readHeader(byteBuffer);
        if ((this.refFrames[0] != null || readHeader.picture_coding_type <= 1) && (this.refFrames[1] != null || readHeader.picture_coding_type <= 2)) {
            Context initContext = initContext(this.f44762sh, readHeader);
            Picture picture2 = new Picture(initContext.codedWidth, initContext.codedHeight, iArr, initContext.color, new Rect(0, 0, initContext.picWidth, initContext.picHeight));
            PictureCodingExtension pictureCodingExtension = readHeader.pictureCodingExtension;
            if (pictureCodingExtension != null) {
                int i = pictureCodingExtension.picture_structure;
                if (i != 3) {
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int[][] iArr2 = iArr;
                    picture = picture2;
                    decodePicture(initContext, readHeader, byteBuffer2, iArr2, i - 1, 1);
                    readHeader = readHeader(byteBuffer);
                    decodePicture(initContext(this.f44762sh, readHeader), readHeader, byteBuffer2, iArr2, readHeader.pictureCodingExtension.picture_structure - 1, 1);
                    int i2 = readHeader.picture_coding_type;
                    if (i2 == 1 || i2 == 2) {
                        Picture[] pictureArr = this.refFrames;
                        Picture picture3 = pictureArr[1];
                        pictureArr[1] = pictureArr[0];
                        pictureArr[0] = copyAndCreateIfNeeded(picture, picture3);
                    }
                    return picture;
                }
            }
            picture = picture2;
            decodePicture(initContext, readHeader, byteBuffer, iArr, 0, 0);
            int i22 = readHeader.picture_coding_type;
            Picture[] pictureArr2 = this.refFrames;
            Picture picture32 = pictureArr2[1];
            pictureArr2[1] = pictureArr2[0];
            pictureArr2[0] = copyAndCreateIfNeeded(picture, picture32);
            return picture;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not enough references to decode ");
        sb.append(readHeader.picture_coding_type == 1 ? C11644i.f33192S6 : "B");
        sb.append(" frame");
        throw new RuntimeException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decodeMacroblock(org.jcodec.codecs.mpeg12.bitstream.PictureHeader r35, org.jcodec.codecs.mpeg12.MPEGDecoder.Context r36, int r37, int[] r38, int[][] r39, int r40, org.jcodec.common.p554io.BitReader r41, int r42, int r43, org.jcodec.codecs.mpeg12.MPEGPred r44) {
        /*
            r34 = this;
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r41
            r0 = r37
        L_0x000a:
            r1 = 11
            int r2 = r14.checkNBit(r1)
            r15 = 8
            if (r2 != r15) goto L_0x001a
            r14.skip(r1)
            int r0 = r0 + 33
            goto L_0x000a
        L_0x001a:
            org.jcodec.common.io.VLC r1 = org.jcodec.codecs.mpeg12.MPEGConst.vlcAddressIncrement
            int r1 = r1.readVLC(r14)
            r10 = 1
            int r1 = r1 + r10
            int r9 = r0 + r1
            org.jcodec.codecs.mpeg12.bitstream.SequenceHeader r0 = r11.f44762sh
            org.jcodec.codecs.mpeg12.bitstream.SequenceExtension r0 = r0.sequenceExtension
            if (r0 == 0) goto L_0x002e
            int r0 = r0.chroma_format
            r8 = r0
            goto L_0x002f
        L_0x002e:
            r8 = 1
        L_0x002f:
            int r0 = r37 + 1
            r7 = r0
        L_0x0032:
            r6 = 256(0x100, float:3.59E-43)
            r5 = 3
            r4 = 2
            r16 = 0
            if (r7 >= r9) goto L_0x009e
            int[][] r5 = new int[r5][]
            int[] r0 = new int[r6]
            r5[r16] = r0
            int r0 = r8 + 5
            int r0 = r10 << r0
            int[] r1 = new int[r0]
            r5[r10] = r1
            int[] r0 = new int[r0]
            r5[r4] = r0
            int r0 = r13.mbWidth
            int r16 = r7 % r0
            int r17 = r7 / r0
            int r0 = r12.picture_coding_type
            if (r0 != r4) goto L_0x0059
            r44.reset()
        L_0x0059:
            r0 = r34
            r1 = r36
            r2 = r35
            r3 = r44
            r4 = r16
            r18 = r5
            r5 = r17
            r6 = r18
            r0.mvZero(r1, r2, r3, r4, r5, r6)
            int r6 = r13.codedWidth
            int r0 = r13.codedHeight
            int r19 = r0 >> r43
            r0 = r34
            r1 = r18
            r2 = r39
            r3 = r40
            r4 = r8
            r5 = r16
            r16 = r6
            r6 = r17
            r17 = r7
            r7 = r16
            r15 = r8
            r8 = r19
            r19 = r9
            r9 = r42
            r20 = r15
            r15 = 1
            r10 = r43
            r0.put(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r7 = r17 + 1
            r9 = r19
            r8 = r20
            r10 = 1
            r15 = 8
            goto L_0x0032
        L_0x009e:
            r20 = r8
            r19 = r9
            r15 = 1
            int r0 = r12.picture_coding_type
            org.jcodec.codecs.mpeg12.bitstream.SequenceHeader r1 = r11.f44762sh
            org.jcodec.codecs.mpeg12.bitstream.SequenceScalableExtension r1 = r1.sequenceScalableExtension
            org.jcodec.common.io.VLC r0 = org.jcodec.codecs.mpeg12.MPEGConst.vlcMBType(r0, r1)
            int r1 = r12.picture_coding_type
            org.jcodec.codecs.mpeg12.bitstream.SequenceHeader r2 = r11.f44762sh
            org.jcodec.codecs.mpeg12.bitstream.SequenceScalableExtension r2 = r2.sequenceScalableExtension
            org.jcodec.codecs.mpeg12.MPEGConst$MBType[] r1 = org.jcodec.codecs.mpeg12.MPEGConst.mbTypeVal(r1, r2)
            int r0 = r0.readVLC(r14)
            r10 = r1[r0]
            int r0 = r10.macroblock_intra
            if (r0 != r15) goto L_0x00c5
            int r9 = r19 - r37
            if (r9 <= r15) goto L_0x00c8
        L_0x00c5:
            r11.resetDCPredictors(r13, r12)
        L_0x00c8:
            int r0 = r10.spatial_temporal_weight_code_flag
            if (r0 != r15) goto L_0x00da
            org.jcodec.codecs.mpeg12.bitstream.PictureSpatialScalableExtension r0 = r12.pictureSpatialScalableExtension
            if (r0 == 0) goto L_0x00da
            int r0 = r0.spatial_temporal_weight_code_table_index
            if (r0 == 0) goto L_0x00da
            int r0 = r14.readNBit(r4)
            r9 = r0
            goto L_0x00db
        L_0x00da:
            r9 = 0
        L_0x00db:
            r0 = -1
            int r1 = r10.macroblock_motion_forward
            if (r1 != 0) goto L_0x00e8
            int r1 = r10.macroblock_motion_backward
            if (r1 == 0) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            r17 = -1
            goto L_0x00fe
        L_0x00e8:
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x00fc
            int r1 = r0.picture_structure
            if (r1 != r5) goto L_0x00f5
            int r0 = r0.frame_pred_frame_dct
            if (r0 != r15) goto L_0x00f5
            goto L_0x00fc
        L_0x00f5:
            int r0 = r14.readNBit(r4)
            r17 = r0
            goto L_0x00fe
        L_0x00fc:
            r17 = 2
        L_0x00fe:
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x0119
            int r1 = r0.picture_structure
            if (r1 != r5) goto L_0x0119
            int r0 = r0.frame_pred_frame_dct
            if (r0 != 0) goto L_0x0119
            int r0 = r10.macroblock_intra
            if (r0 != 0) goto L_0x0112
            int r0 = r10.macroblock_pattern
            if (r0 == 0) goto L_0x0119
        L_0x0112:
            int r0 = r41.read1Bit()
            r21 = r0
            goto L_0x011b
        L_0x0119:
            r21 = 0
        L_0x011b:
            int r0 = r10.macroblock_quant
            if (r0 == 0) goto L_0x0126
            r0 = 5
            int r0 = r14.readNBit(r0)
            r38[r16] = r0
        L_0x0126:
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x0131
            int r0 = r0.concealment_motion_vectors
            if (r0 == 0) goto L_0x0131
            r22 = 1
            goto L_0x0133
        L_0x0131:
            r22 = 0
        L_0x0133:
            int r0 = r13.mbWidth
            int r23 = r19 % r0
            int r24 = r19 / r0
            int r0 = r10.macroblock_intra
            r25 = 0
            if (r0 != r15) goto L_0x0148
            if (r22 == 0) goto L_0x0143
            goto L_0x0207
        L_0x0143:
            r44.reset()
            goto L_0x0207
        L_0x0148:
            int r0 = r10.macroblock_motion_forward
            if (r0 == 0) goto L_0x01d6
            int r0 = r12.picture_coding_type
            if (r0 != r4) goto L_0x0152
            r0 = 0
            goto L_0x0153
        L_0x0152:
            r0 = 1
        L_0x0153:
            int[][] r8 = new int[r5][]
            int[] r1 = new int[r6]
            r8[r16] = r1
            int r1 = r20 + 5
            int r1 = r15 << r1
            int[] r2 = new int[r1]
            r8[r15] = r2
            int[] r1 = new int[r1]
            r8[r4] = r1
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r1 = r12.pictureCodingExtension
            if (r1 == 0) goto L_0x01b8
            int r1 = r1.picture_structure
            if (r1 != r5) goto L_0x016e
            goto L_0x01b8
        L_0x016e:
            int r2 = r12.picture_coding_type
            if (r2 != r4) goto L_0x0192
            org.jcodec.common.model.Picture[] r2 = r11.refFields
            int r3 = r23 << 4
            int r7 = r24 << 4
            r26 = 0
            int r27 = r1 + -1
            r0 = r44
            r1 = r2
            r2 = r3
            r3 = r7
            r7 = 2
            r4 = r8
            r5 = r41
            r6 = r17
            r15 = 2
            r7 = r26
            r26 = r8
            r8 = r27
            r0.predictInField(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01d0
        L_0x0192:
            r26 = r8
            r15 = 2
            org.jcodec.common.model.Picture[] r2 = new org.jcodec.common.model.Picture[r15]
            org.jcodec.common.model.Picture[] r3 = r11.refFrames
            r4 = r3[r0]
            r2[r16] = r4
            r0 = r3[r0]
            r3 = 1
            r2[r3] = r0
            int r4 = r23 << 4
            int r5 = r24 << 4
            r7 = 0
            int r8 = r1 + -1
            r0 = r44
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r26
            r5 = r41
            r6 = r17
            r0.predictInField(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01d0
        L_0x01b8:
            r26 = r8
            r15 = 2
            org.jcodec.common.model.Picture[] r1 = r11.refFrames
            r1 = r1[r0]
            int r2 = r23 << 4
            int r3 = r24 << 4
            r7 = 0
            r0 = r44
            r4 = r26
            r5 = r41
            r6 = r17
            r8 = r9
            r0.predictInFrame(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x01d0:
            r7 = r26
            r8 = 3
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x020c
        L_0x01d6:
            r15 = 2
            int r0 = r12.picture_coding_type
            if (r0 != r15) goto L_0x0207
            r8 = 3
            int[][] r7 = new int[r8][]
            r6 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r6]
            r7[r16] = r0
            int r0 = r20 + 5
            r1 = 1
            int r0 = r1 << r0
            int[] r2 = new int[r0]
            r7[r1] = r2
            int[] r0 = new int[r0]
            r7[r15] = r0
            r44.reset()
            r0 = r34
            r1 = r36
            r2 = r35
            r3 = r44
            r4 = r23
            r5 = r24
            r15 = 256(0x100, float:3.59E-43)
            r6 = r7
            r0.mvZero(r1, r2, r3, r4, r5, r6)
            goto L_0x020c
        L_0x0207:
            r8 = 3
            r15 = 256(0x100, float:3.59E-43)
            r7 = r25
        L_0x020c:
            int r0 = r10.macroblock_motion_backward
            if (r0 == 0) goto L_0x0275
            int[][] r6 = new int[r8][]
            int[] r0 = new int[r15]
            r6[r16] = r0
            int r0 = r20 + 5
            r1 = 1
            int r0 = r1 << r0
            int[] r2 = new int[r0]
            r6[r1] = r2
            int[] r0 = new int[r0]
            r1 = 2
            r6[r1] = r0
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x0258
            int r0 = r0.picture_structure
            if (r0 != r8) goto L_0x022d
            goto L_0x0258
        L_0x022d:
            org.jcodec.common.model.Picture[] r2 = new org.jcodec.common.model.Picture[r1]
            org.jcodec.common.model.Picture[] r1 = r11.refFrames
            r3 = r1[r16]
            r2[r16] = r3
            r1 = r1[r16]
            r3 = 1
            r2[r3] = r1
            int r4 = r23 << 4
            int r5 = r24 << 4
            r9 = 1
            int r25 = r0 + -1
            r0 = r44
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r41
            r27 = r6
            r6 = r17
            r31 = r7
            r7 = r9
            r9 = 3
            r8 = r25
            r0.predictInField(r1, r2, r3, r4, r5, r6, r7, r8)
            r15 = 3
            goto L_0x0272
        L_0x0258:
            r27 = r6
            r31 = r7
            org.jcodec.common.model.Picture[] r0 = r11.refFrames
            r1 = r0[r16]
            int r2 = r23 << 4
            int r3 = r24 << 4
            r7 = 1
            r0 = r44
            r4 = r27
            r5 = r41
            r6 = r17
            r15 = 3
            r8 = r9
            r0.predictInFrame(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0272:
            r0 = r27
            goto L_0x027a
        L_0x0275:
            r31 = r7
            r15 = 3
            r0 = r25
        L_0x027a:
            r13.lastPredB = r10
            int r1 = r10.macroblock_intra
            r2 = 1
            if (r1 != r2) goto L_0x0297
            int[][] r0 = new int[r15][]
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            r0[r16] = r1
            int r8 = r20 + 5
            int r1 = r2 << r8
            int[] r3 = new int[r1]
            r0[r2] = r3
            int[] r1 = new int[r1]
            r3 = 2
            r0[r3] = r1
            goto L_0x029d
        L_0x0297:
            r7 = r31
            int[][] r0 = buildPred(r7, r0)
        L_0x029d:
            r15 = r0
            int r0 = r10.macroblock_intra
            if (r0 == 0) goto L_0x02ab
            if (r22 == 0) goto L_0x02ab
            int r0 = r41.read1Bit()
            org.jcodec.common.Assert.assertEquals(r2, r0)
        L_0x02ab:
            int r0 = r10.macroblock_intra
            if (r0 != r2) goto L_0x02b2
            r0 = 4095(0xfff, float:5.738E-42)
            goto L_0x02b3
        L_0x02b2:
            r0 = 0
        L_0x02b3:
            int r1 = r10.macroblock_pattern
            if (r1 == 0) goto L_0x02bb
            int r0 = r11.readCbPattern(r14)
        L_0x02bb:
            r17 = r0
            org.jcodec.common.io.VLC r0 = org.jcodec.codecs.mpeg12.MPEGConst.vlcCoeff0
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r1 = r12.pictureCodingExtension
            if (r1 == 0) goto L_0x02cf
            int r2 = r10.macroblock_intra
            r3 = 1
            if (r2 != r3) goto L_0x02d0
            int r1 = r1.intra_vlc_format
            if (r1 != r3) goto L_0x02d0
            org.jcodec.common.io.VLC r0 = org.jcodec.codecs.mpeg12.MPEGConst.vlcCoeff1
            goto L_0x02d0
        L_0x02cf:
            r3 = 1
        L_0x02d0:
            r22 = r0
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x02dd
            int r0 = r0.q_scale_type
            if (r0 != r3) goto L_0x02dd
            int[] r0 = org.jcodec.codecs.mpeg12.MPEGConst.qScaleTab2
            goto L_0x02df
        L_0x02dd:
            int[] r0 = org.jcodec.codecs.mpeg12.MPEGConst.qScaleTab1
        L_0x02df:
            r1 = r38[r16]
            r25 = r0[r1]
            org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension r0 = r12.pictureCodingExtension
            if (r0 == 0) goto L_0x02f0
            int r0 = r0.intra_dc_precision
            r18 = 8
            int r0 = r18 >> r0
            r27 = r0
            goto L_0x02f4
        L_0x02f0:
            r18 = 8
            r27 = 8
        L_0x02f4:
            r4 = 6
            r9 = r20
            r0 = 1
            if (r9 != r0) goto L_0x02fc
            r1 = 0
            goto L_0x0301
        L_0x02fc:
            r1 = 2
            if (r9 != r1) goto L_0x0300
            goto L_0x0301
        L_0x0300:
            r1 = 6
        L_0x0301:
            int r8 = r1 + 6
            r1 = 64
            int[] r7 = new int[r1]
            int r1 = r8 + -1
            int r1 = r0 << r1
            r20 = r1
            r6 = 0
        L_0x030e:
            if (r6 >= r8) goto L_0x03c4
            r0 = r17 & r20
            if (r0 != 0) goto L_0x0322
            r31 = r6
            r29 = r7
            r28 = r8
            r32 = r9
            r33 = r10
            r30 = 1
            goto L_0x03b6
        L_0x0322:
            int[][] r0 = r13.qMats
            r1 = 4
            if (r6 < r1) goto L_0x0329
            r1 = 1
            goto L_0x032a
        L_0x0329:
            r1 = 0
        L_0x032a:
            int r2 = r10.macroblock_intra
            int r3 = r2 << 1
            int r1 = r1 + r3
            r26 = r0[r1]
            r0 = 12
            r5 = 1
            if (r2 != r5) goto L_0x0372
            int[] r4 = r13.intra_dc_predictor
            int[] r3 = r13.scan
            org.jcodec.codecs.mpeg12.bitstream.SequenceHeader r1 = r11.f44762sh
            boolean r1 = r1.hasExtensions()
            if (r1 != 0) goto L_0x034c
            boolean r1 = r35.hasExtensions()
            if (r1 == 0) goto L_0x0349
            goto L_0x034c
        L_0x0349:
            r28 = 8
            goto L_0x034e
        L_0x034c:
            r28 = 12
        L_0x034e:
            r0 = r34
            r1 = r41
            r2 = r22
            r29 = r3
            r3 = r7
            r30 = 1
            r5 = r6
            r31 = r6
            r6 = r29
            r29 = r7
            r7 = r28
            r28 = r8
            r8 = r27
            r32 = r9
            r9 = r25
            r33 = r10
            r10 = r26
            r0.blockIntra(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x03a3
        L_0x0372:
            r31 = r6
            r29 = r7
            r28 = r8
            r32 = r9
            r33 = r10
            r30 = 1
            int[] r4 = r13.scan
            org.jcodec.codecs.mpeg12.bitstream.SequenceHeader r1 = r11.f44762sh
            boolean r1 = r1.hasExtensions()
            if (r1 != 0) goto L_0x0392
            boolean r1 = r35.hasExtensions()
            if (r1 == 0) goto L_0x038f
            goto L_0x0392
        L_0x038f:
            r5 = 8
            goto L_0x0394
        L_0x0392:
            r5 = 12
        L_0x0394:
            r0 = r34
            r1 = r41
            r2 = r22
            r3 = r29
            r6 = r25
            r7 = r26
            r0.blockInter(r1, r2, r3, r4, r5, r6, r7)
        L_0x03a3:
            int[] r0 = org.jcodec.codecs.mpeg12.MPEGConst.BLOCK_TO_CC
            r0 = r0[r31]
            r2 = r15[r0]
            r0 = r34
            r1 = r29
            r3 = r31
            r4 = r21
            r5 = r32
            r0.mapBlock(r1, r2, r3, r4, r5)
        L_0x03b6:
            int r6 = r31 + 1
            int r20 = r20 >> 1
            r8 = r28
            r7 = r29
            r9 = r32
            r10 = r33
            goto L_0x030e
        L_0x03c4:
            r32 = r9
            int r7 = r13.codedWidth
            int r0 = r13.codedHeight
            int r8 = r0 >> r43
            r0 = r34
            r1 = r15
            r2 = r39
            r3 = r40
            r4 = r32
            r5 = r23
            r6 = r24
            r9 = r42
            r10 = r43
            r0.put(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.mpeg12.MPEGDecoder.decodeMacroblock(org.jcodec.codecs.mpeg12.bitstream.PictureHeader, org.jcodec.codecs.mpeg12.MPEGDecoder$Context, int, int[], int[][], int, org.jcodec.common.io.BitReader, int, int, org.jcodec.codecs.mpeg12.MPEGPred):int");
    }

    public Picture decodePicture(Context context, PictureHeader pictureHeader, ByteBuffer byteBuffer, int[][] iArr, int i, int i2) {
        Context context2 = context;
        PictureHeader pictureHeader2 = pictureHeader;
        int[][] iArr2 = iArr;
        int i3 = context2.codedWidth * context2.codedHeight;
        if (iArr2.length < 3 || iArr2[0].length < i3 || iArr2[1].length < i3 || iArr2[2].length < i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("ByteBuffer too small to hold output picture [");
            sb.append(context2.codedWidth);
            sb.append("x");
            sb.append(context2.codedHeight);
            sb.append("]");
            throw new RuntimeException(sb.toString());
        }
        while (true) {
            try {
                ByteBuffer nextSegment = MPEGUtil.nextSegment(byteBuffer);
                if (nextSegment == null) {
                    break;
                } else if (nextSegment.get(3) < 1 || nextSegment.get(3) > 175) {
                    if (nextSegment.get(3) >= 179 && nextSegment.get(3) != 182) {
                        if (nextSegment.get(3) != 183) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unexpected start code ");
                            sb2.append(nextSegment.get(3));
                            throw new RuntimeException(sb2.toString());
                        }
                    }
                    if (nextSegment.get(3) == 0) {
                        byteBuffer.reset();
                        break;
                    }
                } else {
                    nextSegment.position(4);
                    try {
                        decodeSlice(pictureHeader, nextSegment.get(3) & 255, context, iArr, new BitReader(nextSegment), i, i2);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        Picture picture = new Picture(context2.codedWidth, context2.codedHeight, iArr2, context2.color);
        if (!((pictureHeader2.picture_coding_type != 1 && pictureHeader2.picture_coding_type != 2) || pictureHeader2.pictureCodingExtension == null || pictureHeader2.pictureCodingExtension.picture_structure == 3)) {
            this.refFields[pictureHeader2.pictureCodingExtension.picture_structure - 1] = copyAndCreateIfNeeded(picture, this.refFields[pictureHeader2.pictureCodingExtension.picture_structure - 1]);
        }
        return picture;
    }

    public void decodeSlice(PictureHeader pictureHeader, int i, Context context, int[][] iArr, BitReader bitReader, int i2, int i3) throws IOException {
        int[][] iArr2;
        PictureHeader pictureHeader2 = pictureHeader;
        Context context2 = context;
        BitReader bitReader2 = bitReader;
        int i4 = context2.codedWidth;
        resetDCPredictors(context2, pictureHeader2);
        int i5 = i - 1;
        if (this.f44762sh.vertical_size > 2800) {
            i5 += bitReader2.readNBit(3) << 7;
        }
        SequenceScalableExtension sequenceScalableExtension = this.f44762sh.sequenceScalableExtension;
        if (sequenceScalableExtension != null && sequenceScalableExtension.scalable_mode == 0) {
            bitReader2.readNBit(7);
        }
        int readNBit = bitReader2.readNBit(5);
        if (bitReader.read1Bit() == 1) {
            bitReader.read1Bit();
            bitReader2.skip(7);
            while (bitReader.read1Bit() == 1) {
                bitReader2.readNBit(8);
            }
        }
        PictureCodingExtension pictureCodingExtension = pictureHeader2.pictureCodingExtension;
        if (pictureCodingExtension != null) {
            iArr2 = pictureCodingExtension.f_code;
        } else {
            int i6 = pictureHeader2.forward_f_code;
            int[] iArr3 = {i6, i6};
            int i7 = pictureHeader2.backward_f_code;
            iArr2 = new int[][]{iArr3, new int[]{i7, i7}};
        }
        SequenceExtension sequenceExtension = this.f44762sh.sequenceExtension;
        int i8 = sequenceExtension != null ? sequenceExtension.chroma_format : 1;
        PictureCodingExtension pictureCodingExtension2 = pictureHeader2.pictureCodingExtension;
        MPEGPred mPEGPred = new MPEGPred(iArr2, i8, pictureCodingExtension2 == null || pictureCodingExtension2.top_field_first != 0);
        int[] iArr4 = {readNBit};
        int i9 = (i5 * context2.mbWidth) - 1;
        while (bitReader2.checkNBit(23) != 0) {
            int[] iArr5 = iArr4;
            MPEGPred mPEGPred2 = mPEGPred;
            i9 = decodeMacroblock(pictureHeader, context, i9, iArr4, iArr, i4, bitReader, i2, i3, mPEGPred2);
            context2.mbNo++;
            iArr4 = iArr5;
            mPEGPred = mPEGPred2;
        }
    }

    /* access modifiers changed from: protected */
    public Context initContext(SequenceHeader sequenceHeader, PictureHeader pictureHeader) {
        Context context = new Context();
        context.codedWidth = (sequenceHeader.horizontal_size + 15) & -16;
        context.codedHeight = getCodedHeight(sequenceHeader, pictureHeader);
        int i = sequenceHeader.horizontal_size;
        context.mbWidth = (i + 15) >> 4;
        int i2 = sequenceHeader.vertical_size;
        context.mbHeight = (i2 + 15) >> 4;
        context.picWidth = i;
        context.picHeight = i2;
        SequenceExtension sequenceExtension = sequenceHeader.sequenceExtension;
        context.color = getColor(sequenceExtension != null ? sequenceExtension.chroma_format : 1);
        int[][] iArr = MPEGConst.scan;
        PictureCodingExtension pictureCodingExtension = pictureHeader.pictureCodingExtension;
        context.scan = iArr[pictureCodingExtension == null ? 0 : pictureCodingExtension.alternate_scan];
        int[] iArr2 = sequenceHeader.non_intra_quantiser_matrix;
        if (iArr2 == null) {
            iArr2 = zigzag(MPEGConst.defaultQMatInter, context.scan);
        }
        int[] iArr3 = sequenceHeader.intra_quantiser_matrix;
        if (iArr3 == null) {
            iArr3 = zigzag(MPEGConst.defaultQMatIntra, context.scan);
        }
        context.qMats = new int[][]{iArr2, iArr2, iArr3, iArr3};
        QuantMatrixExtension quantMatrixExtension = pictureHeader.quantMatrixExtension;
        if (quantMatrixExtension != null) {
            int[] iArr4 = quantMatrixExtension.non_intra_quantiser_matrix;
            if (iArr4 != null) {
                context.qMats[0] = iArr4;
            }
            int[] iArr5 = pictureHeader.quantMatrixExtension.chroma_non_intra_quantiser_matrix;
            if (iArr5 != null) {
                context.qMats[1] = iArr5;
            }
            int[] iArr6 = pictureHeader.quantMatrixExtension.intra_quantiser_matrix;
            if (iArr6 != null) {
                context.qMats[2] = iArr6;
            }
            int[] iArr7 = pictureHeader.quantMatrixExtension.chroma_intra_quantiser_matrix;
            if (iArr7 != null) {
                context.qMats[3] = iArr7;
            }
        }
        return context;
    }

    /* access modifiers changed from: protected */
    public void mapBlock(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = (i3 == 1 && (i == 4 || i == 5)) ? 0 : i2;
        int i6 = i < 4 ? 4 : 4 - MPEGConst.SQUEEZE_X[i3];
        int i7 = i + (i2 << 4);
        int i8 = (MPEGConst.BLOCK_POS_Y[i7] << i6) + MPEGConst.BLOCK_POS_X[i7];
        int i9 = 1 << (i6 + i5);
        int i10 = 0;
        while (i4 < 8) {
            iArr2[i8] = iArr2[i8] + iArr[i10];
            int i11 = i8 + 1;
            iArr2[i11] = iArr2[i11] + iArr[i10 + 1];
            int i12 = i8 + 2;
            iArr2[i12] = iArr2[i12] + iArr[i10 + 2];
            int i13 = i8 + 3;
            iArr2[i13] = iArr2[i13] + iArr[i10 + 3];
            int i14 = i8 + 4;
            iArr2[i14] = iArr2[i14] + iArr[i10 + 4];
            int i15 = i8 + 5;
            iArr2[i15] = iArr2[i15] + iArr[i10 + 5];
            int i16 = i8 + 6;
            iArr2[i16] = iArr2[i16] + iArr[i10 + 6];
            int i17 = i8 + 7;
            iArr2[i17] = iArr2[i17] + iArr[i10 + 7];
            i8 += i9;
            i4++;
            i10 += 8;
        }
    }

    public int probe(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        for (int i = 0; i < 2 && MPEGUtil.gotoNextMarker(duplicate) != null && duplicate.hasRemaining(); i++) {
            int i2 = duplicate.getInt();
            if (i2 == 256 || (i2 >= 432 && i2 <= 440)) {
                return 50 - (i * 10);
            }
            if (i2 > 256 && i2 < 432) {
                return 20 - (i * 10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void put(int[][] iArr, int[][] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr3 = MPEGConst.SQUEEZE_X;
        int i9 = (((1 << iArr3[i2]) + i) - 1) >> iArr3[i2];
        int i10 = 4 - iArr3[i2];
        int i11 = 4 - MPEGConst.SQUEEZE_Y[i2];
        int i12 = i << i8;
        putSub(iArr2[0], (i3 << 4) + ((i4 << 4) * i12) + (i7 * i), i12, iArr[0], 4, 4);
        int i13 = i9 << i8;
        int i14 = (i3 << i10) + ((i4 << i11) * i13) + (i9 * i7);
        putSub(iArr2[1], i14, i13, iArr[1], i10, i11);
        putSub(iArr2[2], i14, i13, iArr[2], i10, i11);
    }

    public MPEGDecoder() {
    }
}
