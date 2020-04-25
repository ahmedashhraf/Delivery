package org.jcodec.common;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class IOUtils {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return i;
            }
            outputStream.write(bArr, 0, read);
            i += read;
        }
    }

    public static int copyDumb(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = 0;
        while (true) {
            int read = inputStream.read();
            if (-1 == read) {
                return i;
            }
            outputStream.write(read);
            i++;
        }
    }

    public static void forceMkdir(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("File ");
                sb.append(file);
                sb.append(" exists and is ");
                sb.append("not a directory. Unable to create directory.");
                throw new IOException(sb.toString());
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to create directory ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        return NIOUtils.toArray(NIOUtils.fetchFrom(file));
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String toString(InputStream inputStream) throws IOException {
        return new String(toByteArray(inputStream));
    }

    public static void writeStringToFile(File file, String str) throws IOException {
        NIOUtils.writeTo(ByteBuffer.wrap(str.getBytes()), file);
    }
}
