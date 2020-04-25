package org.apache.http.p541f0.p542m;

import java.io.IOException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p546g0.C15320d;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p550k0.C15454b;

@C6144b
/* renamed from: org.apache.http.f0.m.j */
/* compiled from: LoggingSessionOutputBuffer */
public class C15273j implements C15322f {

    /* renamed from: a */
    private final C15322f f44241a;

    /* renamed from: b */
    private final C15280m f44242b;

    public C15273j(C15322f fVar, C15280m mVar) {
        this.f44241a = fVar;
        this.f44242b = mVar;
    }

    /* renamed from: a */
    public void mo47273a(C15454b bVar) throws IOException {
        this.f44241a.mo47273a(bVar);
        if (this.f44242b.mo47296a()) {
            String str = new String(bVar.mo47763a(), 0, bVar.mo47772f());
            C15280m mVar = this.f44242b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            mVar.mo47299b(sb.toString());
        }
    }

    public void flush() throws IOException {
        this.f44241a.flush();
    }

    public C15320d getMetrics() {
        return this.f44241a.getMetrics();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f44241a.write(bArr, i, i2);
        if (this.f44242b.mo47296a()) {
            this.f44242b.mo47301b(bArr, i, i2);
        }
    }

    public void write(int i) throws IOException {
        this.f44241a.write(i);
        if (this.f44242b.mo47296a()) {
            this.f44242b.mo47297b(i);
        }
    }

    /* renamed from: a */
    public void mo47272a(String str) throws IOException {
        this.f44241a.mo47272a(str);
        if (this.f44242b.mo47296a()) {
            C15280m mVar = this.f44242b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            mVar.mo47299b(sb.toString());
        }
    }

    public void write(byte[] bArr) throws IOException {
        this.f44241a.write(bArr);
        if (this.f44242b.mo47296a()) {
            this.f44242b.mo47300b(bArr);
        }
    }
}
