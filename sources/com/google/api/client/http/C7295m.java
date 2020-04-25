package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C6397m0;

/* renamed from: com.google.api.client.http.m */
/* compiled from: HttpContent */
public interface C7295m extends C6397m0 {
    /* renamed from: a */
    boolean mo25633a();

    /* renamed from: b */
    long mo25634b() throws IOException;

    String getType();

    void writeTo(OutputStream outputStream) throws IOException;
}
