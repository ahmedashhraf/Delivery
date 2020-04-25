package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.C15133c;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15457e;

/* renamed from: org.apache.http.f0.o.e */
/* compiled from: ChunkedInputStream */
public class C15303e extends InputStream {

    /* renamed from: N */
    private int f44328N;

    /* renamed from: O */
    private int f44329O;

    /* renamed from: P */
    private boolean f44330P = true;

    /* renamed from: Q */
    private boolean f44331Q = false;

    /* renamed from: R */
    private boolean f44332R = false;

    /* renamed from: S */
    private C15133c[] f44333S = new C15133c[0];

    /* renamed from: a */
    private C15321e f44334a;

    /* renamed from: b */
    private final C15454b f44335b;

    public C15303e(C15321e eVar) {
        if (eVar != null) {
            this.f44334a = eVar;
            this.f44329O = 0;
            this.f44335b = new C15454b(16);
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    /* renamed from: d */
    private int m67789d() throws IOException {
        if (!this.f44330P) {
            int read = this.f44334a.read();
            int read2 = this.f44334a.read();
            if (!(read == 13 && read2 == 10)) {
                throw new MalformedChunkCodingException("CRLF expected at end of chunk");
            }
        }
        this.f44335b.mo47768c();
        if (this.f44334a.mo47265a(this.f44335b) == -1) {
            return 0;
        }
        int c = this.f44335b.mo47767c(59);
        if (c < 0) {
            c = this.f44335b.mo47772f();
        }
        try {
            return Integer.parseInt(this.f44335b.mo47765b(0, c), 16);
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header");
        }
    }

    /* renamed from: e */
    private void m67790e() throws IOException {
        this.f44328N = m67789d();
        int i = this.f44328N;
        if (i >= 0) {
            this.f44330P = false;
            this.f44329O = 0;
            if (i == 0) {
                this.f44331Q = true;
                m67791f();
                return;
            }
            return;
        }
        throw new MalformedChunkCodingException("Negative chunk size");
    }

    /* renamed from: f */
    private void m67791f() throws IOException {
        try {
            this.f44333S = C15299a.m67772a(this.f44334a, -1, -1, null);
        } catch (HttpException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid footer: ");
            stringBuffer.append(e.getMessage());
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException(stringBuffer.toString());
            C15457e.m68503a(malformedChunkCodingException, e);
            throw malformedChunkCodingException;
        }
    }

    /* renamed from: a */
    public C15133c[] mo47375a() {
        return (C15133c[]) this.f44333S.clone();
    }

    public void close() throws IOException {
        if (!this.f44332R) {
            try {
                if (!this.f44331Q) {
                    m67788a(this);
                }
            } finally {
                this.f44331Q = true;
                this.f44332R = true;
            }
        }
    }

    public int read() throws IOException {
        if (this.f44332R) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f44331Q) {
            return -1;
        } else {
            if (this.f44329O >= this.f44328N) {
                m67790e();
                if (this.f44331Q) {
                    return -1;
                }
            }
            int read = this.f44334a.read();
            if (read != -1) {
                this.f44329O++;
            }
            return read;
        }
    }

    /* renamed from: a */
    static void m67788a(InputStream inputStream) throws IOException {
        do {
        } while (inputStream.read(new byte[1024]) >= 0);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f44332R) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f44331Q) {
            return -1;
        } else {
            if (this.f44329O >= this.f44328N) {
                m67790e();
                if (this.f44331Q) {
                    return -1;
                }
            }
            int read = this.f44334a.read(bArr, i, Math.min(i2, this.f44328N - this.f44329O));
            if (read != -1) {
                this.f44329O += read;
                return read;
            }
            throw new MalformedChunkCodingException("Truncated chunk");
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
