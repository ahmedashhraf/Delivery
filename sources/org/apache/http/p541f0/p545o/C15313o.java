package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p546g0.C15322f;

/* renamed from: org.apache.http.f0.o.o */
/* compiled from: IdentityOutputStream */
public class C15313o extends OutputStream {

    /* renamed from: a */
    private final C15322f f44357a;

    /* renamed from: b */
    private boolean f44358b = false;

    public C15313o(C15322f fVar) {
        if (fVar != null) {
            this.f44357a = fVar;
            return;
        }
        throw new IllegalArgumentException("Session output buffer may not be null");
    }

    public void close() throws IOException {
        if (!this.f44358b) {
            this.f44358b = true;
            this.f44357a.flush();
        }
    }

    public void flush() throws IOException {
        this.f44357a.flush();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f44358b) {
            this.f44357a.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (!this.f44358b) {
            this.f44357a.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
