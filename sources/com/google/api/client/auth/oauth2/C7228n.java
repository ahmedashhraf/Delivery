package com.google.api.client.auth.oauth2;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6427d;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6428e;

@C2766f
/* renamed from: com.google.api.client.auth.oauth2.n */
/* compiled from: DataStoreCredentialRefreshListener */
public final class C7228n implements C7225k {

    /* renamed from: a */
    private final C6427d<C7231q> f20422a;

    /* renamed from: b */
    private final String f20423b;

    public C7228n(String str, C6428e eVar) throws IOException {
        this(str, C7231q.m34785a(eVar));
    }

    /* renamed from: a */
    public void mo28713a(C7222j jVar, C7236t tVar) throws IOException {
        mo28720a(jVar);
    }

    public C7228n(String str, C6427d<C7231q> dVar) {
        this.f20423b = (String) C6381h0.m29663a(str);
        this.f20422a = (C6427d) C6381h0.m29663a(dVar);
    }

    /* renamed from: a */
    public void mo28712a(C7222j jVar, C7232r rVar) throws IOException {
        mo28720a(jVar);
    }

    /* renamed from: a */
    public C6427d<C7231q> mo28719a() {
        return this.f20422a;
    }

    /* renamed from: a */
    public void mo28720a(C7222j jVar) throws IOException {
        this.f20422a.mo25866a(this.f20423b, new C7231q(jVar));
    }
}
