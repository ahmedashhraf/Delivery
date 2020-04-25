package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6397m0;

/* renamed from: com.google.api.client.http.o */
/* compiled from: HttpEncodingStreamingContent */
public final class C7297o implements C6397m0 {

    /* renamed from: a */
    private final C6397m0 f20623a;

    /* renamed from: b */
    private final C7296n f20624b;

    public C7297o(C6397m0 m0Var, C7296n nVar) {
        this.f20623a = (C6397m0) C6381h0.m29663a(m0Var);
        this.f20624b = (C7296n) C6381h0.m29663a(nVar);
    }

    /* renamed from: c */
    public C6397m0 mo28998c() {
        return this.f20623a;
    }

    /* renamed from: d */
    public C7296n mo28999d() {
        return this.f20624b;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.f20624b.mo28922a(this.f20623a, outputStream);
    }
}
