package org.jcodec.codecs.wav;

import java.io.IOException;
import java.io.InputStream;

public abstract class ReaderLE {
    public static int readInt(InputStream inputStream) throws IOException {
        long read = (long) inputStream.read();
        long read2 = (long) inputStream.read();
        long read3 = (long) inputStream.read();
        long read4 = (long) inputStream.read();
        if (read4 == -1 || read3 == -1 || read2 == -1 || read == -1) {
            return -1;
        }
        return (int) ((read4 << 24) + (read3 << 16) + (read2 << 8) + read);
    }

    public static long readLong(InputStream inputStream) throws IOException {
        long read = (long) inputStream.read();
        long read2 = (long) inputStream.read();
        long read3 = (long) inputStream.read();
        long read4 = (long) inputStream.read();
        long read5 = (long) inputStream.read();
        long read6 = (long) inputStream.read();
        long read7 = (long) inputStream.read();
        long read8 = (long) inputStream.read();
        if (read8 == -1 || read7 == -1 || read6 == -1 || read5 == -1 || read4 == -1 || read3 == -1 || read2 == -1 || read == -1) {
            return -1;
        }
        return (long) ((int) ((read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read));
    }

    public static short readShort(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 == -1 || read == -1) {
            return -1;
        }
        return (short) ((read2 << 8) + read);
    }
}
