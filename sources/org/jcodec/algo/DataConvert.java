package org.jcodec.algo;

public class DataConvert {
    public static int[] from16BE(byte[] bArr) {
        int[] iArr = new int[(bArr.length >> 1)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            iArr[i] = ((bArr[i2] & 255) << 8) | (bArr[i3] & 255);
            i++;
            i2 = i4;
        }
        return iArr;
    }

    public static int[] from16LE(byte[] bArr) {
        int[] iArr = new int[(bArr.length >> 1)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            iArr[i] = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
            i++;
            i2 = i4;
        }
        return iArr;
    }

    public static int[] from24BE(byte[] bArr) {
        int[] iArr = new int[(bArr.length / 3)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
            int i5 = i4 + 1;
            iArr[i] = b | (bArr[i4] & 255);
            i++;
            i2 = i5;
        }
        return iArr;
    }

    public static int[] from24LE(byte[] bArr) {
        int[] iArr = new int[(bArr.length / 3)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            byte b = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
            int i5 = i4 + 1;
            iArr[i] = b | ((bArr[i4] & 255) << 16);
            i++;
            i2 = i5;
        }
        return iArr;
    }

    public static int[] fromByte(byte[] bArr, int i, boolean z) {
        if (i == 24) {
            if (z) {
                return from24BE(bArr);
            }
            return from24LE(bArr);
        } else if (i != 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("Conversion from ");
            sb.append(i);
            sb.append("bit ");
            sb.append(z ? "big endian" : "little endian");
            sb.append(" is not supported.");
            throw new IllegalArgumentException(sb.toString());
        } else if (z) {
            return from16BE(bArr);
        } else {
            return from16LE(bArr);
        }
    }

    public static byte[] to16BE(int[] iArr) {
        byte[] bArr = new byte[(iArr.length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) ((iArr[i2] >> 8) & 255);
            i = i3 + 1;
            bArr[i3] = (byte) (iArr[i2] & 255);
        }
        return bArr;
    }

    public static byte[] to16LE(int[] iArr) {
        byte[] bArr = new byte[(iArr.length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) (iArr[i2] & 255);
            i = i3 + 1;
            bArr[i3] = (byte) ((iArr[i2] >> 8) & 255);
        }
        return bArr;
    }

    public static byte[] to24BE(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 3)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((iArr[i] >> 16) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((iArr[i] >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (iArr[i] & 255);
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static byte[] to24LE(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 3)];
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) (iArr[i] & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((iArr[i] >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((iArr[i] >> 16) & 255);
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static byte[] toByte(int[] iArr, int i, boolean z) {
        if (i == 24) {
            if (z) {
                return to24BE(iArr);
            }
            return to24LE(iArr);
        } else if (i != 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("Conversion to ");
            sb.append(i);
            sb.append("bit ");
            sb.append(z ? "big endian" : "little endian");
            sb.append(" is not supported.");
            throw new IllegalArgumentException(sb.toString());
        } else if (z) {
            return to16BE(iArr);
        } else {
            return to16LE(iArr);
        }
    }
}
