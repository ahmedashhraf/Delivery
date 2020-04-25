package org.apache.http;

import java.io.IOException;

/* renamed from: org.apache.http.g */
/* compiled from: HttpClientConnection */
public interface C15316g extends C15323h {
    /* renamed from: a */
    C15466r mo47177a() throws HttpException, IOException;

    /* renamed from: a */
    void mo47179a(C15466r rVar) throws HttpException, IOException;

    /* renamed from: a */
    boolean mo47180a(int i) throws IOException;

    void flush() throws IOException;

    void sendRequestEntity(C15452k kVar) throws HttpException, IOException;

    void sendRequestHeader(C15463o oVar) throws HttpException, IOException;
}
