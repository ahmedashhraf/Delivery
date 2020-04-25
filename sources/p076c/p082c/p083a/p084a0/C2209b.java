package p076c.p082c.p083a.p084a0;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.c.a.a0.b */
/* compiled from: ContentLengthInputStream */
public final class C2209b extends FilterInputStream {

    /* renamed from: N */
    private static final String f8755N = "ContentLengthStream";

    /* renamed from: O */
    private static final int f8756O = -1;

    /* renamed from: a */
    private final long f8757a;

    /* renamed from: b */
    private int f8758b;

    C2209b(InputStream inputStream, long j) {
        super(inputStream);
        this.f8757a = j;
    }

    /* renamed from: a */
    public static InputStream m11312a(InputStream inputStream, String str) {
        return m11311a(inputStream, (long) m11313b(str));
    }

    /* renamed from: b */
    private static int m11313b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable(f8755N, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to parse content length header: ");
                    sb.append(str);
                    sb.toString();
                }
            }
        }
        return -1;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f8757a - ((long) this.f8758b), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        return m11310a(super.read());
    }

    /* renamed from: a */
    public static InputStream m11311a(InputStream inputStream, long j) {
        return new C2209b(inputStream, j);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private int m11310a(int i) throws IOException {
        if (i >= 0) {
            this.f8758b += i;
        } else if (this.f8757a - ((long) this.f8758b) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f8757a);
            sb.append(", but read: ");
            sb.append(this.f8758b);
            throw new IOException(sb.toString());
        }
        return i;
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m11310a(super.read(bArr, i, i2));
    }
}
