package org.apache.http.p546g0;

import java.io.IOException;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.g0.e */
/* compiled from: SessionInputBuffer */
public interface C15321e {
    /* renamed from: a */
    int mo47265a(C15454b bVar) throws IOException;

    /* renamed from: a */
    boolean mo47266a(int i) throws IOException;

    C15320d getMetrics();

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    String readLine() throws IOException;
}
