package com.facebook.common.util;

import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
    public static byte[] getBytesFromStream(InputStream inputStream) throws IOException {
        return getBytesFromStream(inputStream, inputStream.available());
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkArgument(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }

    public static byte[] getBytesFromStream(InputStream inputStream, int i) throws IOException {
        C34381 r0 = new ByteArrayOutputStream(i) {
            public byte[] toByteArray() {
                int i = this.count;
                byte[] bArr = this.buf;
                if (i == bArr.length) {
                    return bArr;
                }
                return super.toByteArray();
            }
        };
        ByteStreams.copy(inputStream, r0);
        return r0.toByteArray();
    }
}
