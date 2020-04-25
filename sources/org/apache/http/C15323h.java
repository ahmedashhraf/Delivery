package org.apache.http;

import java.io.IOException;

/* renamed from: org.apache.http.h */
/* compiled from: HttpConnection */
public interface C15323h {
    void close() throws IOException;

    C15348i getMetrics();

    int getSocketTimeout();

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int i);

    void shutdown() throws IOException;
}
