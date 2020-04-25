package com.google.api.client.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C6423t;

/* renamed from: com.google.api.client.http.b */
/* compiled from: AbstractInputStreamContent */
public abstract class C7254b implements C7295m {

    /* renamed from: a */
    private String f20541a;

    /* renamed from: b */
    private boolean f20542b = true;

    public C7254b(String str) {
        mo28861a(str);
    }

    /* renamed from: a */
    public C7254b mo28861a(String str) {
        this.f20541a = str;
        return this;
    }

    /* renamed from: c */
    public final boolean mo28863c() {
        return this.f20542b;
    }

    /* renamed from: d */
    public abstract InputStream mo28864d() throws IOException;

    public String getType() {
        return this.f20541a;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        C6423t.m29818a(mo28864d(), outputStream, this.f20542b);
        outputStream.flush();
    }

    /* renamed from: a */
    public C7254b mo28862a(boolean z) {
        this.f20542b = z;
        return this;
    }
}
