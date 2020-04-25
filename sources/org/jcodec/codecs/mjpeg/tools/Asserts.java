package org.jcodec.codecs.mjpeg.tools;

public class Asserts {
    public static void assertEpsilonEquals(int[] iArr, int[] iArr2, int i) {
        if (iArr.length == iArr2.length) {
            int i2 = 0;
            while (i2 < iArr.length) {
                if (Math.abs(iArr[i2] - iArr2[i2]) <= i) {
                    i2++;
                } else {
                    throw new IllegalStateException("array element out of expected diff range");
                }
            }
            return;
        }
        throw new IllegalStateException("arrays of different size");
    }

    public static void assertEquals(int i, int i2) {
        if (i != i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("assert failed: ");
            sb.append(i);
            sb.append(" != ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void assertInRange(String str, int i, int i2, int i3) {
        if (i3 < i || i3 > i2) {
            throw new IllegalStateException(str);
        }
    }

    public static void assertEpsilonEquals(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length == bArr2.length) {
            int i2 = 0;
            while (i2 < bArr.length) {
                int i3 = (bArr[i2] & 255) - (bArr2[i2] & 255);
                if (Math.abs(i3) <= i) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("array element out of expected diff range: ");
                    sb.append(Math.abs(i3));
                    throw new IllegalStateException(sb.toString());
                }
            }
            return;
        }
        throw new IllegalStateException("arrays of different size");
    }
}
