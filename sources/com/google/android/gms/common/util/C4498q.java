package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p201f.p202a.C5952h;

@C4056a
@C4312d0
@Deprecated
/* renamed from: com.google.android.gms.common.util.q */
public final class C4498q {
    private C4498q() {
    }

    @C4056a
    /* renamed from: a */
    public static void m19396a(@C5952h Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @C4056a
    @Deprecated
    /* renamed from: b */
    public static byte[] m19400b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4300a0.m18620a(inputStream);
        C4300a0.m18620a(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19395a(@C5952h ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19397a(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static long m19392a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m19393a(inputStream, outputStream, false);
    }

    @Deprecated
    /* renamed from: a */
    private static long m19393a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m19394a(inputStream, outputStream, z, 1024);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static long m19394a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m19396a((Closeable) inputStream);
                    m19396a((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static byte[] m19398a(InputStream inputStream) throws IOException {
        return m19399a(inputStream, true);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static byte[] m19399a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m19393a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
