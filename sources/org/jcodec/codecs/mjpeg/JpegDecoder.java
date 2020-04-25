package org.jcodec.codecs.mjpeg;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jcodec.codecs.mjpeg.tools.Asserts;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.dct.SimpleIDCT10Bit;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rect;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;
import org.jcodec.common.p554io.VLCBuilder;
import org.jcodec.common.tools.MathUtil;

public class JpegDecoder implements VideoDecoder {
    int[] buf;
    private boolean interlace;
    private boolean topFieldFirst;

    public JpegDecoder() {
        this(false, false);
    }

    private Picture decodeScan(ByteBuffer byteBuffer, FrameHeader frameHeader, ScanHeader scanHeader, VLC[] vlcArr, int[][] iArr, int[][] iArr2, int i, int i2) {
        FrameHeader frameHeader2 = frameHeader;
        int hmax = frameHeader.getHmax();
        int vmax = frameHeader.getVmax();
        int i3 = hmax << 3;
        int i4 = vmax << 3;
        int i5 = frameHeader2.width;
        int i6 = frameHeader2.height;
        int i7 = hmax + 2;
        int i8 = ((i3 + i5) - 1) >> i7;
        int i9 = vmax + 2;
        int i10 = ((i4 + i6) - 1) >> i9;
        int i11 = hmax + vmax;
        int i12 = i8 << i7;
        int i13 = i10 << i9;
        ColorSpace colorSpace = i11 == 4 ? ColorSpace.YUV420J : i11 == 3 ? ColorSpace.YUV422J : ColorSpace.YUV444J;
        Picture picture = new Picture(i12, i13, iArr2, colorSpace, new Rect(0, 0, i5, i6));
        BitReader bitReader = new BitReader(byteBuffer);
        int[] iArr3 = {1024, 1024, 1024};
        int i14 = 0;
        while (i14 < i10) {
            int i15 = 0;
            while (i15 < i8 && bitReader.moreData()) {
                int i16 = i15;
                int i17 = i14;
                int[] iArr4 = iArr3;
                BitReader bitReader2 = bitReader;
                decodeMCU(bitReader, iArr3, iArr, vlcArr, picture, i15, i14, hmax, vmax, i, i2);
                i15 = i16 + 1;
                i14 = i17;
                iArr3 = iArr4;
                bitReader = bitReader2;
            }
            i14++;
            iArr3 = iArr3;
            bitReader = bitReader;
        }
        return picture;
    }

    private static VLC readHuffmanTable(ByteBuffer byteBuffer) {
        VLCBuilder vLCBuilder = new VLCBuilder();
        byte[] array = NIOUtils.toArray(NIOUtils.read(byteBuffer, 16));
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = array[i2] & 255;
            int i3 = i;
            int i4 = 0;
            while (i4 < b) {
                int i5 = i3 + 1;
                vLCBuilder.set(i3, i2 + 1, byteBuffer.get() & 255);
                i4++;
                i3 = i5;
            }
            i = i3 << 1;
        }
        return vLCBuilder.getVLC();
    }

    private static int[] readQuantTable(ByteBuffer byteBuffer) {
        int[] iArr = new int[64];
        for (int i = 0; i < 64; i++) {
            iArr[i] = byteBuffer.get() & 255;
        }
        return iArr;
    }

    private static ByteBuffer readToMarker(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            byte b = byteBuffer.get();
            if (b == -1) {
                if (byteBuffer.get() != 0) {
                    byteBuffer.position(byteBuffer.position() - 2);
                    break;
                }
                allocate.put(-1);
            } else {
                allocate.put(b);
            }
        }
        allocate.flip();
        return allocate;
    }

    public static final int toValue(int i, int i2) {
        return (i2 < 1 || i >= (1 << (i2 + -1))) ? i : i + (-(1 << i2)) + 1;
    }

    /* access modifiers changed from: 0000 */
    public void decodeBlock(BitReader bitReader, int[] iArr, int[][] iArr2, VLC[] vlcArr, Picture picture, int[] iArr3, int i, int i2, int i3, int i4, int i5, int i6) {
        BitReader bitReader2 = bitReader;
        Picture picture2 = picture;
        int[] iArr4 = iArr3;
        int i7 = i3;
        Arrays.fill(iArr3, 0);
        int readDCValue = (readDCValue(bitReader, vlcArr[i4]) * iArr2[i4][0]) + iArr[i7];
        iArr4[0] = readDCValue;
        iArr[i7] = readDCValue;
        readACValues(bitReader, iArr3, vlcArr[i4 + 2], iArr2[i4]);
        SimpleIDCT10Bit.idct10(iArr3, 0);
        putBlock(picture.getPlaneData(i7), picture.getPlaneWidth(i7), iArr4, i, i2, i5, i6);
    }

    public Picture decodeField(ByteBuffer byteBuffer, int[][] iArr, int i, int i2) {
        byte b;
        ByteBuffer byteBuffer2 = byteBuffer;
        VLC[] vlcArr = {JpegConst.YDC_DEFAULT, JpegConst.CDC_DEFAULT, JpegConst.YAC_DEFAULT, JpegConst.CAC_DEFAULT};
        int[][] iArr2 = new int[4][];
        ScanHeader scanHeader = null;
        Picture picture = null;
        FrameHeader frameHeader = null;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get() & 255;
            if (b2 != 0) {
                if (b2 == 255) {
                    do {
                        b = byteBuffer.get() & 255;
                    } while (b == 255);
                    if (b == 192) {
                        frameHeader = FrameHeader.read(byteBuffer);
                    } else if (b == 196) {
                        ByteBuffer read = NIOUtils.read(byteBuffer2, (byteBuffer.getShort() & 65535) - 2);
                        while (read.hasRemaining()) {
                            byte b3 = read.get() & 255;
                            vlcArr[((b3 >> 3) & 2) | (b3 & 1)] = readHuffmanTable(read);
                        }
                    } else if (b == 219) {
                        ByteBuffer read2 = NIOUtils.read(byteBuffer2, (byteBuffer.getShort() & 65535) - 2);
                        while (read2.hasRemaining()) {
                            iArr2[read2.get() & 255] = readQuantTable(read2);
                        }
                    } else if (b == 218) {
                        if (scanHeader == null) {
                            ScanHeader read3 = ScanHeader.read(byteBuffer);
                            picture = decodeScan(readToMarker(byteBuffer), frameHeader, read3, vlcArr, iArr2, iArr, i, i2);
                            scanHeader = read3;
                        } else {
                            throw new IllegalStateException("unhandled - more than one scan header");
                        }
                    } else if (b != 216 && (b < 208 || b > 215)) {
                        if (b == 217) {
                            break;
                        } else if (b >= 224 && b <= 254) {
                            NIOUtils.read(byteBuffer2, (byteBuffer.getShort() & 65535) - 2);
                        } else if (b == 221) {
                            byteBuffer.getShort();
                            Asserts.assertEquals(0, byteBuffer.getShort() & 65535);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unhandled marker ");
                            sb.append(JpegConst.toString(b));
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("@");
                    sb2.append(Long.toHexString((long) byteBuffer.position()));
                    sb2.append(" Marker expected: 0x");
                    sb2.append(Integer.toHexString(b2));
                    throw new RuntimeException(sb2.toString());
                }
            }
        }
        return picture;
    }

    public Picture decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        if (!this.interlace) {
            return decodeField(byteBuffer, iArr, 0, 1);
        }
        Picture decodeField = decodeField(byteBuffer, iArr, this.topFieldFirst ^ true ? 1 : 0, 2);
        decodeField(byteBuffer, iArr, this.topFieldFirst ? 1 : 0, 2);
        return new Picture(decodeField.getWidth(), decodeField.getHeight() << 1, iArr, decodeField.getColor());
    }

    /* access modifiers changed from: 0000 */
    public void decodeMCU(BitReader bitReader, int[] iArr, int[][] iArr2, VLC[] vlcArr, Picture picture, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        int i9 = i << (i7 - 1);
        int i10 = i2 << (i8 - 1);
        int i11 = 0;
        while (i11 < i8) {
            int i12 = 0;
            while (i12 < i7) {
                BitReader bitReader2 = bitReader;
                int[] iArr3 = iArr;
                int[][] iArr4 = iArr2;
                VLC[] vlcArr2 = vlcArr;
                Picture picture2 = picture;
                int i13 = i12;
                int i14 = i11;
                decodeBlock(bitReader2, iArr3, iArr4, vlcArr2, picture2, this.buf, (i9 + i12) << 3, (i10 + i11) << 3, 0, 0, i5, i6);
                i12 = i13 + 1;
                i11 = i14;
            }
            i11++;
        }
        BitReader bitReader3 = bitReader;
        int[] iArr5 = iArr;
        int[][] iArr6 = iArr2;
        VLC[] vlcArr3 = vlcArr;
        Picture picture3 = picture;
        int i15 = i << 3;
        int i16 = i2 << 3;
        int i17 = i5;
        int i18 = i6;
        decodeBlock(bitReader3, iArr5, iArr6, vlcArr3, picture3, this.buf, i15, i16, 1, 1, i17, i18);
        decodeBlock(bitReader3, iArr5, iArr6, vlcArr3, picture3, this.buf, i15, i16, 2, 1, i17, i18);
    }

    public int probe(ByteBuffer byteBuffer) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void putBlock(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        int i6 = i5 * i;
        int i7 = (i4 * i) + (i3 * i6) + i2;
        int i8 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            for (int i10 = 0; i10 < 8; i10++) {
                iArr[i10 + i7] = MathUtil.clip(iArr2[i10 + i8], 0, 255);
            }
            i7 += i6;
            i8 += 8;
        }
    }

    /* access modifiers changed from: 0000 */
    public void readACValues(BitReader bitReader, int[] iArr, VLC vlc, int[] iArr2) {
        int i = 1;
        do {
            int readVLC16 = vlc.readVLC16(bitReader);
            if (readVLC16 == 240) {
                i += 16;
            } else if (readVLC16 > 0) {
                int i2 = i + (readVLC16 >> 4);
                int i3 = readVLC16 & 15;
                iArr[JpegConst.naturalOrder[i2]] = toValue(bitReader.readNBit(i3), i3) * iArr2[i2];
                i = i2 + 1;
            }
            if (readVLC16 == 0) {
                return;
            }
        } while (i < 64);
    }

    /* access modifiers changed from: 0000 */
    public int readDCValue(BitReader bitReader, VLC vlc) {
        int readVLC16 = vlc.readVLC16(bitReader);
        if (readVLC16 != 0) {
            return toValue(bitReader.readNBit(readVLC16), readVLC16);
        }
        return 0;
    }

    public JpegDecoder(boolean z, boolean z2) {
        this.buf = new int[64];
        this.interlace = z;
        this.topFieldFirst = z2;
    }
}
