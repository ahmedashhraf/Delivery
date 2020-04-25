package org.apache.http.p541f0.p542m;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.p217i1.C14662d0;
import org.apache.commons.logging.C15089a;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.f0.m.m */
/* compiled from: Wire */
public class C15280m {

    /* renamed from: a */
    private final C15089a f44261a;

    public C15280m(C15089a aVar) {
        this.f44261a = aVar;
    }

    /* renamed from: a */
    private void m67677a(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.f44261a.mo46776a(sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append(C14662d0.f42850a);
            sb.insert(0, C14662d0.f42850a);
            sb.insert(0, str);
            this.f44261a.mo46776a(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo47298b(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            m67677a(">> ", inputStream);
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    /* renamed from: b */
    public void mo47301b(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            m67677a(">> ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    /* renamed from: b */
    public void mo47300b(byte[] bArr) throws IOException {
        if (bArr != null) {
            m67677a(">> ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    /* renamed from: b */
    public void mo47297b(int i) throws IOException {
        mo47300b(new byte[]{(byte) i});
    }

    /* renamed from: b */
    public void mo47299b(String str) throws IOException {
        if (str != null) {
            mo47300b(str.getBytes());
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    /* renamed from: a */
    public boolean mo47296a() {
        return this.f44261a.mo46785d();
    }

    /* renamed from: a */
    public void mo47292a(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            m67677a("<< ", inputStream);
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    /* renamed from: a */
    public void mo47295a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            m67677a("<< ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    /* renamed from: a */
    public void mo47294a(byte[] bArr) throws IOException {
        if (bArr != null) {
            m67677a("<< ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    /* renamed from: a */
    public void mo47291a(int i) throws IOException {
        mo47294a(new byte[]{(byte) i});
    }

    /* renamed from: a */
    public void mo47293a(String str) throws IOException {
        if (str != null) {
            mo47294a(str.getBytes());
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }
}
