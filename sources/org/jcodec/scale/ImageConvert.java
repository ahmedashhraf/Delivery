package org.jcodec.scale;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class ImageConvert {
    private static final int CROP = 1024;
    private static final int FIX_0_71414 = FIX(0.71414d);
    private static final int FIX_1_402 = FIX(1.402d);
    private static final int FIX_1_772 = FIX(1.772d);
    private static final int ONE_HALF = 512;
    private static final int SCALEBITS = 10;
    private static final int _FIX_0_34414 = (-FIX(0.34414d));
    private static final byte[] cropTable = new byte[2304];
    private static final int[] intCropTable = new int[2304];
    private static final byte[] y_ccir_to_jpeg = new byte[256];
    private static final byte[] y_jpeg_to_ccir = new byte[256];

    static {
        int i;
        int i2 = -1024;
        while (true) {
            if (i2 >= 0) {
                break;
            }
            int i3 = i2 + 1024;
            cropTable[i3] = 0;
            intCropTable[i3] = 0;
            i2++;
        }
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = i4 + 1024;
            cropTable[i5] = (byte) i4;
            intCropTable[i5] = i4;
        }
        for (int i6 = 256; i6 < 1024; i6++) {
            int i7 = i6 + 1024;
            cropTable[i7] = -1;
            intCropTable[i7] = 255;
        }
        for (i = 0; i < 256; i++) {
            y_ccir_to_jpeg[i] = crop(Y_CCIR_TO_JPEG(i));
            y_jpeg_to_ccir[i] = crop(Y_JPEG_TO_CCIR(i));
        }
    }

    private static final int FIX(double d) {
        return (int) ((d * 1024.0d) + 0.5d);
    }

    public static byte RGB888toU4(int i, int i2, int i3) {
        return crop((((((i * -38) - (i2 * 74)) + (i3 * 112)) + 128) >> 8) + 128);
    }

    public static byte RGB888toV4(int i, int i2, int i3) {
        return crop((((((i * 112) - (i2 * 94)) - (i3 * 18)) + 128) >> 8) + 128);
    }

    public static byte RGB888toY4(int i, int i2, int i3) {
        return crop((((((i * 66) + (i2 * C13959t.f40835R1)) + (i3 * 25)) + 128) >> 8) + 16);
    }

    public static void RGB888toYUV444(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4) {
        byte b = byteBuffer.get() & 255;
        byte b2 = byteBuffer.get() & 255;
        byte b3 = byteBuffer.get() & 255;
        int i = (b * 66) + (b2 * 129) + (b3 * C5785c.f16670C);
        int i2 = ((b * 112) - (b2 * 94)) - (b3 * C5785c.f16702u);
        int i3 = ((((b * -38) - (b2 * 74)) + (b3 * 112)) + 128) >> 8;
        int i4 = (i2 + 128) >> 8;
        byteBuffer2.put(crop(((i + 128) >> 8) + 16));
        byteBuffer3.put(crop(i3 + 128));
        byteBuffer4.put(crop(i4 + 128));
    }

    public static void YUV444toRGB888(int i, int i2, int i3, ByteBuffer byteBuffer) {
        int i4 = i2 - 128;
        int i5 = i3 - 128;
        int i6 = (i - 16) * 298;
        int i7 = (((i6 - (i4 * 100)) - (i5 * 208)) + 128) >> 8;
        int i8 = ((i6 + (i4 * 516)) + 128) >> 8;
        byteBuffer.put(crop((((i5 * 409) + i6) + 128) >> 8));
        byteBuffer.put(crop(i7));
        byteBuffer.put(crop(i8));
    }

    static final int Y_CCIR_TO_JPEG(int i) {
        return ((i * FIX(1.1643835616438356d)) + (512 - (FIX(1.1643835616438356d) * 16))) >> 10;
    }

    static final int Y_JPEG_TO_CCIR(int i) {
        return ((i * FIX(0.8588235294117647d)) + 16896) >> 10;
    }

    public static final byte crop(int i) {
        return cropTable[i + 1024];
    }

    public static final int icrop(int i) {
        return intCropTable[i + 1024];
    }

    public static final byte y_ccir_to_jpeg(byte b) {
        return y_ccir_to_jpeg[b & 255];
    }

    public static final byte y_jpeg_to_ccir(byte b) {
        return y_jpeg_to_ccir[b & 255];
    }

    public static final int ycbcr_to_rgb24(int i, int i2, int i3) {
        int i4 = i << 10;
        int i5 = i2 - 128;
        int i6 = i3 - 128;
        int i7 = ((_FIX_0_34414 * i5) - (FIX_0_71414 * i6)) + 512;
        int i8 = (((FIX_1_402 * i6) + 512) + i4) >> 10;
        int i9 = (i7 + i4) >> 10;
        int i10 = (i4 + ((FIX_1_772 * i5) + 512)) >> 10;
        return (crop(i10) & 255) | ((crop(i8) & 255) << 16) | ((crop(i9) & 255) << 8);
    }
}
