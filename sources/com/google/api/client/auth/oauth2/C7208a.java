package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.C7222j.C7223a;
import com.google.api.client.auth.oauth2.C7222j.C7224b;
import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7308w;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p143g.C6404o0;
import p076c.p112d.p134b.p135a.p143g.C6435u;
import p076c.p112d.p134b.p135a.p143g.C6436w;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6427d;
import p076c.p112d.p134b.p135a.p143g.p270t0.C6428e;

/* renamed from: com.google.api.client.auth.oauth2.a */
/* compiled from: AuthorizationCodeFlow */
public class C7208a {

    /* renamed from: a */
    private final C7223a f20354a;

    /* renamed from: b */
    private final C7253a0 f20355b;

    /* renamed from: c */
    private final C6290d f20356c;

    /* renamed from: d */
    private final String f20357d;

    /* renamed from: e */
    private final C7298p f20358e;

    /* renamed from: f */
    private final String f20359f;

    /* renamed from: g */
    private final String f20360g;
    @C2766f
    @Deprecated

    /* renamed from: h */
    private final C7226l f20361h;
    @C2766f

    /* renamed from: i */
    private final C6427d<C7231q> f20362i;

    /* renamed from: j */
    private final C7308w f20363j;

    /* renamed from: k */
    private final C6391l f20364k;

    /* renamed from: l */
    private final Collection<String> f20365l;

    /* renamed from: m */
    private final C7210b f20366m;

    /* renamed from: n */
    private final Collection<C7225k> f20367n;

    /* renamed from: com.google.api.client.auth.oauth2.a$a */
    /* compiled from: AuthorizationCodeFlow */
    public static class C7209a {

        /* renamed from: a */
        C7223a f20368a;

        /* renamed from: b */
        C7253a0 f20369b;

        /* renamed from: c */
        C6290d f20370c;

        /* renamed from: d */
        C7274j f20371d;

        /* renamed from: e */
        C7298p f20372e;

        /* renamed from: f */
        String f20373f;

        /* renamed from: g */
        String f20374g;
        @C2766f
        @Deprecated

        /* renamed from: h */
        C7226l f20375h;
        @C2766f

        /* renamed from: i */
        C6427d<C7231q> f20376i;

        /* renamed from: j */
        C7308w f20377j;

        /* renamed from: k */
        Collection<String> f20378k = C6436w.m29853a();

        /* renamed from: l */
        C6391l f20379l = C6391l.f17814a;

        /* renamed from: m */
        C7210b f20380m;

        /* renamed from: n */
        Collection<C7225k> f20381n = C6436w.m29853a();

        public C7209a(C7223a aVar, C7253a0 a0Var, C6290d dVar, C7274j jVar, C7298p pVar, String str, String str2) {
            mo25202a(aVar);
            mo25205a(a0Var);
            mo25197a(dVar);
            mo25206a(jVar);
            mo25207a(pVar);
            mo25212b(str);
            mo25209a(str2);
        }

        /* renamed from: a */
        public C7208a mo25211a() {
            return new C7208a(this);
        }

        /* renamed from: b */
        public C7209a mo25212b(String str) {
            this.f20373f = (String) C6381h0.m29663a(str);
            return this;
        }

        /* renamed from: c */
        public final C7298p mo28658c() {
            return this.f20372e;
        }

        /* renamed from: d */
        public final String mo28659d() {
            return this.f20373f;
        }

        /* renamed from: e */
        public final C6391l mo28660e() {
            return this.f20379l;
        }

        /* renamed from: f */
        public final C7210b mo28661f() {
            return this.f20380m;
        }

        @C2766f
        /* renamed from: g */
        public final C6427d<C7231q> mo28662g() {
            return this.f20376i;
        }

        @C2766f
        @Deprecated
        /* renamed from: h */
        public final C7226l mo28663h() {
            return this.f20375h;
        }

        /* renamed from: i */
        public final C6290d mo28664i() {
            return this.f20370c;
        }

        /* renamed from: j */
        public final C7223a mo28665j() {
            return this.f20368a;
        }

        /* renamed from: k */
        public final Collection<C7225k> mo28666k() {
            return this.f20381n;
        }

        /* renamed from: l */
        public final C7308w mo28667l() {
            return this.f20377j;
        }

        /* renamed from: m */
        public final Collection<String> mo28668m() {
            return this.f20378k;
        }

        /* renamed from: n */
        public final C7274j mo28669n() {
            return this.f20371d;
        }

        /* renamed from: o */
        public final C7253a0 mo28670o() {
            return this.f20369b;
        }

        /* renamed from: a */
        public C7209a mo25202a(C7223a aVar) {
            this.f20368a = (C7223a) C6381h0.m29663a(aVar);
            return this;
        }

        /* renamed from: b */
        public final String mo28657b() {
            return this.f20374g;
        }

        /* renamed from: a */
        public C7209a mo25205a(C7253a0 a0Var) {
            this.f20369b = (C7253a0) C6381h0.m29663a(a0Var);
            return this;
        }

        /* renamed from: b */
        public C7209a mo25213b(Collection<String> collection) {
            this.f20378k = (Collection) C6381h0.m29663a(collection);
            return this;
        }

        /* renamed from: a */
        public C7209a mo25197a(C6290d dVar) {
            this.f20370c = (C6290d) C6381h0.m29663a(dVar);
            return this;
        }

        /* renamed from: a */
        public C7209a mo25206a(C7274j jVar) {
            this.f20371d = (C7274j) C6381h0.m29663a(jVar);
            return this;
        }

        /* renamed from: a */
        public C7209a mo25207a(C7298p pVar) {
            this.f20372e = pVar;
            return this;
        }

        /* renamed from: a */
        public C7209a mo25209a(String str) {
            this.f20374g = (String) C6381h0.m29663a(str);
            return this;
        }

        /* renamed from: a */
        public C7209a mo25198a(C6391l lVar) {
            this.f20379l = (C6391l) C6381h0.m29663a(lVar);
            return this;
        }

        @C2766f
        @Deprecated
        /* renamed from: a */
        public C7209a mo25204a(C7226l lVar) {
            C6381h0.m29666a(this.f20376i == null);
            this.f20375h = lVar;
            return this;
        }

        @C2766f
        /* renamed from: a */
        public C7209a mo25200a(C6428e eVar) throws IOException {
            return mo25199a(C7231q.m34785a(eVar));
        }

        @C2766f
        /* renamed from: a */
        public C7209a mo25199a(C6427d<C7231q> dVar) {
            C6381h0.m29666a(this.f20375h == null);
            this.f20376i = dVar;
            return this;
        }

        /* renamed from: a */
        public C7209a mo25208a(C7308w wVar) {
            this.f20377j = wVar;
            return this;
        }

        /* renamed from: a */
        public C7209a mo25201a(C7210b bVar) {
            this.f20380m = bVar;
            return this;
        }

        /* renamed from: a */
        public C7209a mo25203a(C7225k kVar) {
            this.f20381n.add(C6381h0.m29663a(kVar));
            return this;
        }

        /* renamed from: a */
        public C7209a mo25210a(Collection<C7225k> collection) {
            this.f20381n = (Collection) C6381h0.m29663a(collection);
            return this;
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.a$b */
    /* compiled from: AuthorizationCodeFlow */
    public interface C7210b {
        /* renamed from: a */
        void mo28671a(C7222j jVar, C7236t tVar) throws IOException;
    }

    public C7208a(C7223a aVar, C7253a0 a0Var, C6290d dVar, C7274j jVar, C7298p pVar, String str, String str2) {
        C7209a aVar2 = new C7209a(aVar, a0Var, dVar, jVar, pVar, str, str2);
        this(aVar2);
    }

    /* renamed from: c */
    private C7222j m34549c(String str) {
        C7224b a = new C7224b(this.f20354a).mo25270a(this.f20355b).mo25267a(this.f20356c).mo25275a(this.f20357d).mo25272a(this.f20358e).mo25273a(this.f20363j).mo25268a(this.f20364k);
        C6427d<C7231q> dVar = this.f20362i;
        if (dVar != null) {
            a.mo25269a((C7225k) new C7228n(str, dVar));
        } else {
            C7226l lVar = this.f20361h;
            if (lVar != null) {
                a.mo25269a((C7225k) new C7227m(str, lVar));
            }
        }
        a.mo28708f().addAll(this.f20367n);
        return a.mo25279a();
    }

    /* renamed from: a */
    public C7222j mo28641a(C7236t tVar, String str) throws IOException {
        C7222j a = m34549c(str).mo25252a(tVar);
        C7226l lVar = this.f20361h;
        if (lVar != null) {
            lVar.mo28715b(str, a);
        }
        C6427d<C7231q> dVar = this.f20362i;
        if (dVar != null) {
            dVar.mo25866a(str, new C7231q(a));
        }
        C7210b bVar = this.f20366m;
        if (bVar != null) {
            bVar.mo28671a(a, tVar);
        }
        return a;
    }

    /* renamed from: b */
    public C7213d mo25193b(String str) {
        return new C7213d(this.f20355b, this.f20356c, new C7274j(this.f20357d), str).m34633a(this.f20358e).m34634a(this.f20363j).m34636a(this.f20365l);
    }

    /* renamed from: d */
    public final C6391l mo28646d() {
        return this.f20364k;
    }

    @C2766f
    /* renamed from: e */
    public final C6427d<C7231q> mo28647e() {
        return this.f20362i;
    }

    @C2766f
    @Deprecated
    /* renamed from: f */
    public final C7226l mo28648f() {
        return this.f20361h;
    }

    /* renamed from: g */
    public final C6290d mo28649g() {
        return this.f20356c;
    }

    /* renamed from: h */
    public final C7223a mo28650h() {
        return this.f20354a;
    }

    /* renamed from: i */
    public final Collection<C7225k> mo28651i() {
        return this.f20367n;
    }

    /* renamed from: j */
    public final C7308w mo28652j() {
        return this.f20363j;
    }

    /* renamed from: k */
    public final Collection<String> mo28653k() {
        return this.f20365l;
    }

    /* renamed from: l */
    public final String mo28654l() {
        return C6435u.m29851a(' ').mo25875a((Iterable<?>) this.f20365l);
    }

    /* renamed from: m */
    public final String mo28655m() {
        return this.f20357d;
    }

    /* renamed from: n */
    public final C7253a0 mo28656n() {
        return this.f20355b;
    }

    /* renamed from: o */
    public C7211b mo25194o() {
        return new C7211b(this.f20360g, this.f20359f).m34606b(this.f20365l);
    }

    protected C7208a(C7209a aVar) {
        this.f20354a = (C7223a) C6381h0.m29663a(aVar.f20368a);
        this.f20355b = (C7253a0) C6381h0.m29663a(aVar.f20369b);
        this.f20356c = (C6290d) C6381h0.m29663a(aVar.f20370c);
        this.f20357d = ((C7274j) C6381h0.m29663a(aVar.f20371d)).mo28930d();
        this.f20358e = aVar.f20372e;
        this.f20359f = (String) C6381h0.m29663a(aVar.f20373f);
        this.f20360g = (String) C6381h0.m29663a(aVar.f20374g);
        this.f20363j = aVar.f20377j;
        this.f20361h = aVar.f20375h;
        this.f20362i = aVar.f20376i;
        this.f20365l = Collections.unmodifiableCollection(aVar.f20378k);
        this.f20364k = (C6391l) C6381h0.m29663a(aVar.f20379l);
        this.f20366m = aVar.f20380m;
        this.f20367n = Collections.unmodifiableCollection(aVar.f20381n);
    }

    /* renamed from: b */
    public final C7298p mo28644b() {
        return this.f20358e;
    }

    /* renamed from: a */
    public C7222j mo28642a(String str) throws IOException {
        if (C6404o0.m29729a(str)) {
            return null;
        }
        if (this.f20362i == null && this.f20361h == null) {
            return null;
        }
        C7222j c = m34549c(str);
        C6427d<C7231q> dVar = this.f20362i;
        if (dVar != null) {
            C7231q qVar = (C7231q) dVar.mo25867b(str);
            if (qVar == null) {
                return null;
            }
            c.mo25254a(qVar.mo28727a());
            c.mo25257b(qVar.mo28731e());
            c.mo25253a(qVar.mo28730d());
        } else if (!this.f20361h.mo28714a(str, c)) {
            return null;
        }
        return c;
    }

    /* renamed from: c */
    public final String mo28645c() {
        return this.f20359f;
    }

    /* renamed from: a */
    public final String mo28643a() {
        return this.f20360g;
    }
}
