package com.google.api.client.auth.oauth2;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
@Deprecated
/* renamed from: com.google.api.client.auth.oauth2.m */
/* compiled from: CredentialStoreRefreshListener */
public final class C7227m implements C7225k {

    /* renamed from: a */
    private final C7226l f20420a;

    /* renamed from: b */
    private final String f20421b;

    public C7227m(String str, C7226l lVar) {
        this.f20421b = (String) C6381h0.m29663a(str);
        this.f20420a = (C7226l) C6381h0.m29663a(lVar);
    }

    /* renamed from: a */
    public void mo28713a(C7222j jVar, C7236t tVar) throws IOException {
        mo28718a(jVar);
    }

    /* renamed from: a */
    public void mo28712a(C7222j jVar, C7232r rVar) throws IOException {
        mo28718a(jVar);
    }

    /* renamed from: a */
    public C7226l mo28717a() {
        return this.f20420a;
    }

    /* renamed from: a */
    public void mo28718a(C7222j jVar) throws IOException {
        this.f20420a.mo28715b(this.f20421b, jVar);
    }
}
