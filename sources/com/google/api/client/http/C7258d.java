package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.d */
/* compiled from: BasicAuthentication */
public final class C7258d implements C7308w, C7298p {

    /* renamed from: a */
    private final String f20547a;

    /* renamed from: b */
    private final String f20548b;

    public C7258d(String str, String str2) {
        this.f20547a = (String) C6381h0.m29663a(str);
        this.f20548b = (String) C6381h0.m29663a(str2);
    }

    /* renamed from: a */
    public void mo25080a(C7305u uVar) throws IOException {
        uVar.mo29111i().mo29007a(this.f20547a, this.f20548b);
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) throws IOException {
        uVar.mo29086a((C7298p) this);
    }

    /* renamed from: a */
    public String mo28870a() {
        return this.f20548b;
    }

    /* renamed from: b */
    public String mo28871b() {
        return this.f20547a;
    }
}
