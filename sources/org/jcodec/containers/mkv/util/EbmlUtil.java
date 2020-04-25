package org.jcodec.containers.mkv.util;

public class EbmlUtil {
    public static final long[] ebmlLengthMasks = {0, 127, two, three, four, five, six, seven, eight};
    public static final long eight = 71494644084506624L;
    public static final long five = 34091302912L;
    public static final long four = 266338304;
    public static final byte[] lengthOptions = {0, Byte.MIN_VALUE, 64, 32, 16, 8, 4, 2, 1};
    public static final long one = 127;
    public static final long seven = 558551906910208L;
    public static final long six = 4363686772736L;
    public static final long three = 2080768;
    public static final long two = 16256;

    public static int computeLength(byte b) {
        if (b != 0) {
            int i = 1;
            while ((lengthOptions[i] & b) == 0) {
                i++;
            }
            return i;
        }
        throw new RuntimeException("Invalid head element for ebml sequence");
    }

    public static byte[] ebmlEncode(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[(i - i2) - 1] = (byte) ((int) ((j >>> (i2 * 8)) & 255));
        }
        bArr[0] = (byte) (bArr[0] | (128 >>> (i - 1)));
        return bArr;
    }

    public static int ebmlLength(long j) {
        if (j == 0) {
            return 1;
        }
        int i = 8;
        while (i > 0 && (ebmlLengthMasks[i] & j) == 0) {
            i--;
        }
        return i;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("0x%02x ", new Object[]{Integer.valueOf(b & 255)}));
        }
        return sb.toString();
    }

    public static byte[] ebmlEncode(long j) {
        return ebmlEncode(j, ebmlLength(j));
    }
}
