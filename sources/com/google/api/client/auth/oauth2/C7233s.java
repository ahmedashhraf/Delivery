package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7270h0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6413s;
import p076c.p112d.p134b.p135a.p143g.C6435u;

/* renamed from: com.google.api.client.auth.oauth2.s */
/* compiled from: TokenRequest */
public class C7233s extends C6413s {

    /* renamed from: N */
    C7308w f20435N;

    /* renamed from: O */
    C7298p f20436O;

    /* renamed from: P */
    private final C7253a0 f20437P;

    /* renamed from: Q */
    private final C6290d f20438Q;

    /* renamed from: R */
    private C7274j f20439R;
    @C2768v("scope")

    /* renamed from: S */
    private String f20440S;
    @C2768v("grant_type")

    /* renamed from: T */
    private String f20441T;

    /* renamed from: com.google.api.client.auth.oauth2.s$a */
    /* compiled from: TokenRequest */
    class C7234a implements C7308w {

        /* renamed from: com.google.api.client.auth.oauth2.s$a$a */
        /* compiled from: TokenRequest */
        class C7235a implements C7298p {

            /* renamed from: a */
            final /* synthetic */ C7298p f20443a;

            C7235a(C7298p pVar) {
                this.f20443a = pVar;
            }

            /* renamed from: a */
            public void mo25080a(C7305u uVar) throws IOException {
                C7298p pVar = this.f20443a;
                if (pVar != null) {
                    pVar.mo25080a(uVar);
                }
                C7298p pVar2 = C7233s.this.f20436O;
                if (pVar2 != null) {
                    pVar2.mo25080a(uVar);
                }
            }
        }

        C7234a() {
        }

        /* renamed from: b */
        public void mo25083b(C7305u uVar) throws IOException {
            C7308w wVar = C7233s.this.f20435N;
            if (wVar != null) {
                wVar.mo25083b(uVar);
            }
            uVar.mo29086a((C7298p) new C7235a(uVar.mo29113k()));
        }
    }

    public C7233s(C7253a0 a0Var, C6290d dVar, C7274j jVar, String str) {
        this.f20437P = (C7253a0) C6381h0.m29663a(a0Var);
        this.f20438Q = (C6290d) C6381h0.m29663a(dVar);
        mo25227a(jVar);
        mo25230a(str);
    }

    /* renamed from: a */
    public C7233s mo25229a(C7308w wVar) {
        this.f20435N = wVar;
        return this;
    }

    /* renamed from: d */
    public final C7309x mo28741d() throws IOException {
        C7305u b = this.f20437P.mo28858a((C7308w) new C7234a()).mo29136b(this.f20439R, new C7270h0(this));
        b.mo29079a((C6372e0) new C6292f(this.f20438Q));
        b.mo29108f(false);
        C7309x a = b.mo29092a();
        if (a.mo29158o()) {
            return a;
        }
        throw TokenResponseException.m34547a(this.f20438Q, a);
    }

    /* renamed from: e */
    public final C7298p mo28742e() {
        return this.f20436O;
    }

    public C7236t execute() throws IOException {
        return (C7236t) mo28741d().mo29141a(C7236t.class);
    }

    /* renamed from: f */
    public final String mo28743f() {
        return this.f20441T;
    }

    /* renamed from: g */
    public final C6290d mo28744g() {
        return this.f20438Q;
    }

    /* renamed from: h */
    public final C7308w mo28745h() {
        return this.f20435N;
    }

    /* renamed from: i */
    public final String mo28746i() {
        return this.f20440S;
    }

    /* renamed from: j */
    public final C7274j mo28747j() {
        return this.f20439R;
    }

    /* renamed from: l */
    public final C7253a0 mo28748l() {
        return this.f20437P;
    }

    /* renamed from: a */
    public C7233s mo25228a(C7298p pVar) {
        this.f20436O = pVar;
        return this;
    }

    /* renamed from: b */
    public C7233s m34807b(String str, Object obj) {
        return (C7233s) super.mo25098b(str, obj);
    }

    /* renamed from: a */
    public C7233s mo25227a(C7274j jVar) {
        this.f20439R = jVar;
        C6381h0.m29666a(jVar.mo28937g() == null);
        return this;
    }

    /* renamed from: a */
    public C7233s mo25231a(Collection<String> collection) {
        this.f20440S = collection == null ? null : C6435u.m29851a(' ').mo25875a((Iterable<?>) collection);
        return this;
    }

    /* renamed from: a */
    public C7233s mo25230a(String str) {
        this.f20441T = (String) C6381h0.m29663a(str);
        return this;
    }
}
