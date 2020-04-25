package org.apache.http.p541f0.p542m;

import java.io.IOException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p546g0.C15320d;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p550k0.C15454b;

@C6144b
/* renamed from: org.apache.http.f0.m.i */
/* compiled from: LoggingSessionInputBuffer */
public class C15272i implements C15321e {

    /* renamed from: a */
    private final C15321e f44239a;

    /* renamed from: b */
    private final C15280m f44240b;

    public C15272i(C15321e eVar, C15280m mVar) {
        this.f44239a = eVar;
        this.f44240b = mVar;
    }

    /* renamed from: a */
    public boolean mo47266a(int i) throws IOException {
        return this.f44239a.mo47266a(i);
    }

    public C15320d getMetrics() {
        return this.f44239a.getMetrics();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f44239a.read(bArr, i, i2);
        if (this.f44240b.mo47296a() && read > 0) {
            this.f44240b.mo47295a(bArr, i, read);
        }
        return read;
    }

    public String readLine() throws IOException {
        String readLine = this.f44239a.readLine();
        if (this.f44240b.mo47296a() && readLine != null) {
            C15280m mVar = this.f44240b;
            StringBuilder sb = new StringBuilder();
            sb.append(readLine);
            sb.append("[EOL]");
            mVar.mo47293a(sb.toString());
        }
        return readLine;
    }

    /* renamed from: a */
    public int mo47265a(C15454b bVar) throws IOException {
        int a = this.f44239a.mo47265a(bVar);
        if (this.f44240b.mo47296a() && a >= 0) {
            String str = new String(bVar.mo47763a(), bVar.mo47772f() - a, a);
            C15280m mVar = this.f44240b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[EOL]");
            mVar.mo47293a(sb.toString());
        }
        return a;
    }

    public int read() throws IOException {
        int read = this.f44239a.read();
        if (this.f44240b.mo47296a() && read != -1) {
            this.f44240b.mo47291a(read);
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.f44239a.read(bArr);
        if (this.f44240b.mo47296a() && read > 0) {
            this.f44240b.mo47295a(bArr, 0, read);
        }
        return read;
    }
}
