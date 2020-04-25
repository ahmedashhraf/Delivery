package org.apache.http.p540e0;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.e0.j */
/* compiled from: InputStreamEntity */
public class C15247j extends C15238a {

    /* renamed from: R */
    private static final int f44169R = 2048;

    /* renamed from: O */
    private final InputStream f44170O;

    /* renamed from: P */
    private final long f44171P;

    /* renamed from: Q */
    private boolean f44172Q = false;

    public C15247j(InputStream inputStream, long j) {
        if (inputStream != null) {
            this.f44170O = inputStream;
            this.f44171P = j;
            return;
        }
        throw new IllegalArgumentException("Source input stream may not be null");
    }

    public InputStream getContent() throws IOException {
        return this.f44170O;
    }

    public long getContentLength() {
        return this.f44171P;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return !this.f44172Q;
    }

    /* renamed from: j */
    public void mo46986j() throws IOException {
        this.f44172Q = true;
        this.f44170O.close();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream inputStream = this.f44170O;
            byte[] bArr = new byte[2048];
            long j = this.f44171P;
            if (j < 0) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } else {
                while (j > 0) {
                    int read2 = inputStream.read(bArr, 0, (int) Math.min(PlaybackStateCompat.f474i0, j));
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    j -= (long) read2;
                }
            }
            this.f44172Q = true;
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }
}
