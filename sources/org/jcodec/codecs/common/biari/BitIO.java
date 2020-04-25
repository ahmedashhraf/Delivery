package org.jcodec.codecs.common.biari;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BitIO {

    public interface InputBits {
        int getBit() throws IOException;
    }

    public interface OutputBits {
        void flush() throws IOException;

        void putBit(int i) throws IOException;
    }

    public static class StreamInputBits implements InputBits {
        private int bit = 8;
        private int cur;

        /* renamed from: in */
        private InputStream f44717in;

        public StreamInputBits(InputStream inputStream) {
            this.f44717in = inputStream;
        }

        public int getBit() throws IOException {
            if (this.bit > 7) {
                this.cur = this.f44717in.read();
                if (this.cur == -1) {
                    return -1;
                }
                this.bit = 0;
            }
            int i = this.cur;
            int i2 = this.bit;
            this.bit = i2 + 1;
            return (i >> (7 - i2)) & 1;
        }
    }

    public static class StreamOutputBits implements OutputBits {
        private int bit;
        private int cur;
        private OutputStream out;

        public StreamOutputBits(OutputStream outputStream) {
            this.out = outputStream;
        }

        public void flush() throws IOException {
            if (this.bit > 0) {
                this.out.write(this.cur);
            }
        }

        public void putBit(int i) throws IOException {
            if (this.bit > 7) {
                this.out.write(this.cur);
                this.cur = 0;
                this.bit = 0;
            }
            int i2 = this.cur;
            int i3 = i & 1;
            int i4 = this.bit;
            this.bit = i4 + 1;
            this.cur = (i3 << (7 - i4)) | i2;
        }
    }

    /* renamed from: org.jcodec.codecs.common.biari.BitIO$a */
    static class C15488a extends OutputStream {

        /* renamed from: a */
        int f44718a;

        /* renamed from: b */
        final /* synthetic */ byte[] f44719b;

        C15488a(byte[] bArr) {
            this.f44719b = bArr;
        }

        public void write(int i) throws IOException {
            int i2 = this.f44718a;
            byte[] bArr = this.f44719b;
            if (i2 < bArr.length) {
                this.f44718a = i2 + 1;
                bArr[i2] = (byte) i;
                return;
            }
            throw new IOException("Buffer is full");
        }
    }

    public static byte[] compressBits(int[] iArr) {
        byte[] bArr = new byte[((iArr.length >> 3) + 1)];
        OutputBits outputFromArray = outputFromArray(bArr);
        try {
            for (int putBit : iArr) {
                outputFromArray.putBit(putBit);
            }
        } catch (IOException unused) {
        }
        return bArr;
    }

    public static int[] decompressBits(byte[] bArr) {
        int[] iArr = new int[(bArr.length << 3)];
        InputBits inputFromArray = inputFromArray(bArr);
        int i = 0;
        while (true) {
            try {
                int bit = inputFromArray.getBit();
                if (bit == -1) {
                    break;
                }
                iArr[i] = bit;
                i++;
            } catch (IOException unused) {
            }
        }
        return iArr;
    }

    public static InputBits inputFromArray(byte[] bArr) {
        return new StreamInputBits(new ByteArrayInputStream(bArr));
    }

    public static InputBits inputFromStream(InputStream inputStream) {
        return new StreamInputBits(inputStream);
    }

    public static OutputBits outputFromArray(byte[] bArr) {
        return new StreamOutputBits(new C15488a(bArr));
    }

    public static OutputBits outputFromStream(OutputStream outputStream) {
        return new StreamOutputBits(outputStream);
    }
}
