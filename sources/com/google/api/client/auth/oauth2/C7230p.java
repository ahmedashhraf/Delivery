package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7308w;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.p */
/* compiled from: RefreshTokenRequest */
public class C7230p extends C7233s {
    @C2768v("refresh_token")

    /* renamed from: U */
    private String f20426U;

    public C7230p(C7253a0 a0Var, C6290d dVar, C7274j jVar, String str) {
        super(a0Var, dVar, jVar, "refresh_token");
        mo25332b(str);
    }

    /* renamed from: m */
    public final String mo28725m() {
        return this.f20426U;
    }

    /* renamed from: b */
    public C7230p mo25332b(String str) {
        this.f20426U = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: b */
    public C7230p m34782b(String str, Object obj) {
        return (C7230p) super.mo25098b(str, obj);
    }

    /* renamed from: a */
    public C7230p m34777a(C7308w wVar) {
        return (C7230p) super.mo25229a(wVar);
    }

    /* renamed from: a */
    public C7230p m34775a(C7274j jVar) {
        return (C7230p) super.mo25227a(jVar);
    }

    /* renamed from: a */
    public C7230p m34779a(Collection<String> collection) {
        return (C7230p) super.mo25231a(collection);
    }

    /* renamed from: a */
    public C7230p m34778a(String str) {
        return (C7230p) super.mo25230a(str);
    }

    /* renamed from: a */
    public C7230p m34776a(C7298p pVar) {
        return (C7230p) super.mo25228a(pVar);
    }
}
