package org.apache.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.j */
/* compiled from: HttpEntity */
public interface C15423j {
    /* renamed from: b */
    C15133c mo47161b();

    /* renamed from: c */
    boolean mo47164c();

    InputStream getContent() throws IOException, IllegalStateException;

    long getContentLength();

    C15133c getContentType();

    boolean isRepeatable();

    boolean isStreaming();

    /* renamed from: j */
    void mo46986j() throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
