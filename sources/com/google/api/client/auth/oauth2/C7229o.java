package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7308w;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.o */
/* compiled from: PasswordTokenRequest */
public class C7229o extends C7233s {
    @C2768v

    /* renamed from: U */
    private String f20424U;
    @C2768v

    /* renamed from: V */
    private String f20425V;

    public C7229o(C7253a0 a0Var, C6290d dVar, C7274j jVar, String str, String str2) {
        super(a0Var, dVar, jVar, "password");
        mo28722c(str);
        mo28721b(str2);
    }

    /* renamed from: c */
    public C7229o mo28722c(String str) {
        this.f20424U = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: m */
    public final String mo28723m() {
        return this.f20425V;
    }

    /* renamed from: n */
    public final String mo28724n() {
        return this.f20424U;
    }

    /* renamed from: b */
    public C7229o mo28721b(String str) {
        this.f20425V = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: b */
    public C7229o m34765b(String str, Object obj) {
        return (C7229o) super.mo25098b(str, obj);
    }

    /* renamed from: a */
    public C7229o m34760a(C7308w wVar) {
        return (C7229o) super.mo25229a(wVar);
    }

    /* renamed from: a */
    public C7229o m34758a(C7274j jVar) {
        return (C7229o) super.mo25227a(jVar);
    }

    /* renamed from: a */
    public C7229o m34762a(Collection<String> collection) {
        return (C7229o) super.mo25231a(collection);
    }

    /* renamed from: a */
    public C7229o m34761a(String str) {
        return (C7229o) super.mo25230a(str);
    }

    /* renamed from: a */
    public C7229o m34759a(C7298p pVar) {
        return (C7229o) super.mo25228a(pVar);
    }
}
