package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7308w;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.d */
/* compiled from: AuthorizationCodeTokenRequest */
public class C7213d extends C7233s {
    @C2768v

    /* renamed from: U */
    private String f20387U;
    @C2768v("redirect_uri")

    /* renamed from: V */
    private String f20388V;

    public C7213d(C7253a0 a0Var, C6290d dVar, C7274j jVar, String str) {
        super(a0Var, dVar, jVar, "authorization_code");
        mo25232b(str);
    }

    /* renamed from: c */
    public C7213d mo25233c(String str) {
        this.f20388V = str;
        return this;
    }

    /* renamed from: m */
    public final String mo28680m() {
        return this.f20387U;
    }

    /* renamed from: n */
    public final String mo28681n() {
        return this.f20388V;
    }

    /* renamed from: b */
    public C7213d mo25232b(String str) {
        this.f20387U = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: b */
    public C7213d m34639b(String str, Object obj) {
        return (C7213d) super.mo25098b(str, obj);
    }

    /* renamed from: a */
    public C7213d m34634a(C7308w wVar) {
        return (C7213d) super.mo25229a(wVar);
    }

    /* renamed from: a */
    public C7213d m34632a(C7274j jVar) {
        return (C7213d) super.mo25227a(jVar);
    }

    /* renamed from: a */
    public C7213d m34636a(Collection<String> collection) {
        return (C7213d) super.mo25231a(collection);
    }

    /* renamed from: a */
    public C7213d m34635a(String str) {
        return (C7213d) super.mo25230a(str);
    }

    /* renamed from: a */
    public C7213d m34633a(C7298p pVar) {
        return (C7213d) super.mo25228a(pVar);
    }
}
