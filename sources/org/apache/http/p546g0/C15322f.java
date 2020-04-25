package org.apache.http.p546g0;

import java.io.IOException;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.g0.f */
/* compiled from: SessionOutputBuffer */
public interface C15322f {
    /* renamed from: a */
    void mo47272a(String str) throws IOException;

    /* renamed from: a */
    void mo47273a(C15454b bVar) throws IOException;

    void flush() throws IOException;

    C15320d getMetrics();

    void write(int i) throws IOException;

    void write(byte[] bArr) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
