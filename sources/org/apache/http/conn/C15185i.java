package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.conn.i */
/* compiled from: EofSensorInputStream */
public class C15185i extends InputStream implements C15184h {

    /* renamed from: N */
    private final C15186j f44073N;

    /* renamed from: a */
    protected InputStream f44074a;

    /* renamed from: b */
    private boolean f44075b;

    public C15185i(InputStream inputStream, C15186j jVar) {
        if (inputStream != null) {
            this.f44074a = inputStream;
            this.f44075b = false;
            this.f44073N = jVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped stream may not be null.");
    }

    /* renamed from: B */
    public void mo46983B() throws IOException {
        close();
    }

    /* renamed from: F */
    public void mo46984F() throws IOException {
        this.f44075b = true;
        mo47002a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo47000G() throws IOException {
        InputStream inputStream = this.f44074a;
        if (inputStream != null) {
            boolean z = true;
            try {
                if (this.f44073N != null) {
                    z = this.f44073N.mo46981b(inputStream);
                }
                if (z) {
                    this.f44074a.close();
                }
            } finally {
                this.f44074a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo47001H() throws IOException {
        if (!this.f44075b) {
            return this.f44074a != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47003a(int i) throws IOException {
        InputStream inputStream = this.f44074a;
        if (inputStream != null && i < 0) {
            boolean z = true;
            try {
                if (this.f44073N != null) {
                    z = this.f44073N.mo46980a(inputStream);
                }
                if (z) {
                    this.f44074a.close();
                }
            } finally {
                this.f44074a = null;
            }
        }
    }

    public int available() throws IOException {
        if (!mo47001H()) {
            return 0;
        }
        try {
            return this.f44074a.available();
        } catch (IOException e) {
            mo47002a();
            throw e;
        }
    }

    public void close() throws IOException {
        this.f44075b = true;
        mo47000G();
    }

    public int read() throws IOException {
        if (!mo47001H()) {
            return -1;
        }
        try {
            int read = this.f44074a.read();
            mo47003a(read);
            return read;
        } catch (IOException e) {
            mo47002a();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47002a() throws IOException {
        InputStream inputStream = this.f44074a;
        if (inputStream != null) {
            boolean z = true;
            try {
                if (this.f44073N != null) {
                    z = this.f44073N.mo46982c(inputStream);
                }
                if (z) {
                    this.f44074a.close();
                }
            } finally {
                this.f44074a = null;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!mo47001H()) {
            return -1;
        }
        try {
            int read = this.f44074a.read(bArr, i, i2);
            mo47003a(read);
            return read;
        } catch (IOException e) {
            mo47002a();
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        if (!mo47001H()) {
            return -1;
        }
        try {
            int read = this.f44074a.read(bArr);
            mo47003a(read);
            return read;
        } catch (IOException e) {
            mo47002a();
            throw e;
        }
    }
}
