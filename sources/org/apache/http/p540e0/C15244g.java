package org.apache.http.p540e0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.e0.g */
/* compiled from: EntityTemplate */
public class C15244g extends C15238a {

    /* renamed from: O */
    private final C15243f f44166O;

    public C15244g(C15243f fVar) {
        if (fVar != null) {
            this.f44166O = fVar;
            return;
        }
        throw new IllegalArgumentException("Content producer may not be null");
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException("Entity template does not implement getContent()");
    }

    public long getContentLength() {
        return -1;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return true;
    }

    /* renamed from: j */
    public void mo46986j() throws IOException {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            this.f44166O.writeTo(outputStream);
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }
}
