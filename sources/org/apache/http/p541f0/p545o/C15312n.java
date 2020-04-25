package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p546g0.C15321e;

/* renamed from: org.apache.http.f0.o.n */
/* compiled from: IdentityInputStream */
public class C15312n extends InputStream {

    /* renamed from: a */
    private final C15321e f44355a;

    /* renamed from: b */
    private boolean f44356b = false;

    public C15312n(C15321e eVar) {
        if (eVar != null) {
            this.f44355a = eVar;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public int available() throws IOException {
        return (this.f44356b || !this.f44355a.mo47266a(10)) ? 0 : 1;
    }

    public void close() throws IOException {
        this.f44356b = true;
    }

    public int read() throws IOException {
        if (this.f44356b) {
            return -1;
        }
        return this.f44355a.read();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f44356b) {
            return -1;
        }
        return this.f44355a.read(bArr, i, i2);
    }
}
