package org.jcodec.codecs.wav;

import java.io.IOException;
import java.io.InputStream;

public abstract class StringReader {
    public static String readString(InputStream inputStream, int i) throws IOException {
        byte[] sureRead = sureRead(inputStream, i);
        if (sureRead == null) {
            return null;
        }
        return new String(sureRead);
    }

    public static byte[] sureRead(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        if (sureRead(inputStream, bArr, bArr.length) == i) {
            return bArr;
        }
        return null;
    }

    public static void sureSkip(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            j -= inputStream.skip(j);
        }
    }

    public static int sureRead(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        return i2;
    }
}
