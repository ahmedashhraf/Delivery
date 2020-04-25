package org.apache.http.p540e0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.e0.b */
/* compiled from: BasicHttpEntity */
public class C15239b extends C15238a {

    /* renamed from: O */
    private InputStream f44159O;

    /* renamed from: P */
    private boolean f44160P;

    /* renamed from: Q */
    private long f44161Q = -1;

    /* renamed from: a */
    public void mo47166a(long j) {
        this.f44161Q = j;
    }

    public InputStream getContent() throws IllegalStateException {
        InputStream inputStream = this.f44159O;
        if (inputStream == null) {
            throw new IllegalStateException("Content has not been provided");
        } else if (!this.f44160P) {
            this.f44160P = true;
            return inputStream;
        } else {
            throw new IllegalStateException("Content has been consumed");
        }
    }

    public long getContentLength() {
        return this.f44161Q;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return !this.f44160P && this.f44159O != null;
    }

    /* renamed from: j */
    public void mo46986j() throws IOException {
        InputStream inputStream = this.f44159O;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream content = getContent();
            byte[] bArr = new byte[2048];
            while (true) {
                int read = content.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* renamed from: a */
    public void mo47167a(InputStream inputStream) {
        this.f44159O = inputStream;
        this.f44160P = false;
    }
}
