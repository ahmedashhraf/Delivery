package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7255b0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C6373f0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p143g.C6436w;

/* renamed from: com.google.api.client.auth.oauth2.j */
/* compiled from: Credential */
public class C7222j implements C7298p, C7308w, C7255b0 {

    /* renamed from: m */
    static final Logger f20399m = Logger.getLogger(C7222j.class.getName());

    /* renamed from: a */
    private final Lock f20400a;

    /* renamed from: b */
    private final C7223a f20401b;

    /* renamed from: c */
    private final C6391l f20402c;

    /* renamed from: d */
    private String f20403d;

    /* renamed from: e */
    private Long f20404e;

    /* renamed from: f */
    private String f20405f;

    /* renamed from: g */
    private final C7253a0 f20406g;

    /* renamed from: h */
    private final C7298p f20407h;

    /* renamed from: i */
    private final C6290d f20408i;

    /* renamed from: j */
    private final String f20409j;

    /* renamed from: k */
    private final Collection<C7225k> f20410k;

    /* renamed from: l */
    private final C7308w f20411l;

    /* renamed from: com.google.api.client.auth.oauth2.j$a */
    /* compiled from: Credential */
    public interface C7223a {
        /* renamed from: a */
        String mo28687a(C7305u uVar);

        /* renamed from: a */
        void mo28688a(C7305u uVar, String str) throws IOException;
    }

    /* renamed from: com.google.api.client.auth.oauth2.j$b */
    /* compiled from: Credential */
    public static class C7224b {

        /* renamed from: a */
        final C7223a f20412a;

        /* renamed from: b */
        C7253a0 f20413b;

        /* renamed from: c */
        C6290d f20414c;

        /* renamed from: d */
        C7274j f20415d;

        /* renamed from: e */
        C6391l f20416e = C6391l.f17814a;

        /* renamed from: f */
        C7298p f20417f;

        /* renamed from: g */
        C7308w f20418g;

        /* renamed from: h */
        Collection<C7225k> f20419h = C6436w.m29853a();

        public C7224b(C7223a aVar) {
            this.f20412a = (C7223a) C6381h0.m29663a(aVar);
        }

        /* renamed from: a */
        public C7222j mo25279a() {
            return new C7222j(this);
        }

        /* renamed from: b */
        public final C7298p mo28704b() {
            return this.f20417f;
        }

        /* renamed from: c */
        public final C6391l mo28705c() {
            return this.f20416e;
        }

        /* renamed from: d */
        public final C6290d mo28706d() {
            return this.f20414c;
        }

        /* renamed from: e */
        public final C7223a mo28707e() {
            return this.f20412a;
        }

        /* renamed from: f */
        public final Collection<C7225k> mo28708f() {
            return this.f20419h;
        }

        /* renamed from: g */
        public final C7308w mo28709g() {
            return this.f20418g;
        }

        /* renamed from: h */
        public final C7274j mo28710h() {
            return this.f20415d;
        }

        /* renamed from: i */
        public final C7253a0 mo28711i() {
            return this.f20413b;
        }

        /* renamed from: a */
        public C7224b mo25270a(C7253a0 a0Var) {
            this.f20413b = a0Var;
            return this;
        }

        /* renamed from: a */
        public C7224b mo25268a(C6391l lVar) {
            this.f20416e = (C6391l) C6381h0.m29663a(lVar);
            return this;
        }

        /* renamed from: a */
        public C7224b mo25267a(C6290d dVar) {
            this.f20414c = dVar;
            return this;
        }

        /* renamed from: a */
        public C7224b mo25271a(C7274j jVar) {
            this.f20415d = jVar;
            return this;
        }

        /* renamed from: a */
        public C7224b mo25275a(String str) {
            this.f20415d = str == null ? null : new C7274j(str);
            return this;
        }

        /* renamed from: a */
        public C7224b mo25272a(C7298p pVar) {
            this.f20417f = pVar;
            return this;
        }

        /* renamed from: a */
        public C7224b mo25273a(C7308w wVar) {
            this.f20418g = wVar;
            return this;
        }

        /* renamed from: a */
        public C7224b mo25269a(C7225k kVar) {
            this.f20419h.add(C6381h0.m29663a(kVar));
            return this;
        }

        /* renamed from: a */
        public C7224b mo25278a(Collection<C7225k> collection) {
            this.f20419h = (Collection) C6381h0.m29663a(collection);
            return this;
        }
    }

    public C7222j(C7223a aVar) {
        this(new C7224b(aVar));
    }

    /* renamed from: a */
    public void mo25080a(C7305u uVar) throws IOException {
        this.f20400a.lock();
        try {
            Long f = mo28695f();
            if (this.f20403d == null || (f != null && f.longValue() <= 60)) {
                mo28703n();
                if (this.f20403d == null) {
                    return;
                }
            }
            this.f20401b.mo28688a(uVar, this.f20403d);
            this.f20400a.unlock();
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) throws IOException {
        uVar.mo29086a((C7298p) this);
        uVar.mo29081a((C7255b0) this);
    }

    /* renamed from: c */
    public final C7298p mo28692c() {
        return this.f20407h;
    }

    /* renamed from: d */
    public final C6391l mo28693d() {
        return this.f20402c;
    }

    /* renamed from: e */
    public final Long mo28694e() {
        this.f20400a.lock();
        try {
            return this.f20404e;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: f */
    public final Long mo28695f() {
        Long valueOf;
        this.f20400a.lock();
        try {
            if (this.f20404e == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((this.f20404e.longValue() - this.f20402c.mo25628a()) / 1000);
            }
            return valueOf;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: g */
    public final C6290d mo28696g() {
        return this.f20408i;
    }

    /* renamed from: h */
    public final C7223a mo28697h() {
        return this.f20401b;
    }

    /* renamed from: i */
    public final Collection<C7225k> mo28698i() {
        return this.f20410k;
    }

    /* renamed from: j */
    public final String mo28699j() {
        this.f20400a.lock();
        try {
            return this.f20405f;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: k */
    public final C7308w mo28700k() {
        return this.f20411l;
    }

    /* renamed from: l */
    public final String mo28701l() {
        return this.f20409j;
    }

    /* renamed from: m */
    public final C7253a0 mo28702m() {
        return this.f20406g;
    }

    /* renamed from: n */
    public final boolean mo28703n() throws IOException {
        this.f20400a.lock();
        boolean z = true;
        try {
            C7236t a = mo25187a();
            if (a != null) {
                mo25252a(a);
                for (C7225k a2 : this.f20410k) {
                    a2.mo28713a(this, a);
                }
                this.f20400a.unlock();
                return true;
            }
        } catch (TokenResponseException e) {
            if (400 > e.mo28839e() || e.mo28839e() >= 500) {
                z = false;
            }
            if (e.mo28640h() != null && z) {
                mo25254a((String) null);
                mo25256b((Long) null);
            }
            for (C7225k a3 : this.f20410k) {
                a3.mo28712a(this, e.mo28640h());
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.f20400a.unlock();
            throw th;
        }
        this.f20400a.unlock();
        return false;
    }

    protected C7222j(C7224b bVar) {
        this.f20400a = new ReentrantLock();
        this.f20401b = (C7223a) C6381h0.m29663a(bVar.f20412a);
        this.f20406g = bVar.f20413b;
        this.f20408i = bVar.f20414c;
        C7274j jVar = bVar.f20415d;
        this.f20409j = jVar == null ? null : jVar.mo28930d();
        this.f20407h = bVar.f20417f;
        this.f20411l = bVar.f20418g;
        this.f20410k = Collections.unmodifiableCollection(bVar.f20419h);
        this.f20402c = (C6391l) C6381h0.m29663a(bVar.f20416e);
    }

    /* renamed from: b */
    public final String mo28691b() {
        this.f20400a.lock();
        try {
            return this.f20403d;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: b */
    public C7222j mo25257b(String str) {
        this.f20400a.lock();
        if (str != null) {
            try {
                C6381h0.m29667a((this.f20408i == null || this.f20406g == null || this.f20407h == null || this.f20409j == null) ? false : true, (Object) "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f20400a.unlock();
                throw th;
            }
        }
        this.f20405f = str;
        this.f20400a.unlock();
        return this;
    }

    /* renamed from: a */
    public boolean mo25648a(C7305u uVar, C7309x xVar, boolean z) {
        boolean z2;
        boolean z3;
        List h = xVar.mo29150g().mo29025h();
        boolean z4 = true;
        if (h != null) {
            Iterator it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (str.startsWith("Bearer ")) {
                    z3 = C7215f.f20395b.matcher(str).find();
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z2) {
            z3 = xVar.mo29153j() == 401;
        }
        if (z3) {
            try {
                this.f20400a.lock();
                if (C6373f0.m29651a(this.f20403d, this.f20401b.mo28687a(uVar)) && !mo28703n()) {
                    z4 = false;
                }
                this.f20400a.unlock();
                return z4;
            } catch (IOException e) {
                f20399m.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.f20400a.unlock();
                throw th;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C7222j mo25256b(Long l) {
        return mo25253a(l == null ? null : Long.valueOf(this.f20402c.mo25628a() + (l.longValue() * 1000)));
    }

    /* renamed from: a */
    public C7222j mo25254a(String str) {
        this.f20400a.lock();
        try {
            this.f20403d = str;
            return this;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: a */
    public C7222j mo25253a(Long l) {
        this.f20400a.lock();
        try {
            this.f20404e = l;
            return this;
        } finally {
            this.f20400a.unlock();
        }
    }

    /* renamed from: a */
    public C7222j mo25252a(C7236t tVar) {
        mo25254a(tVar.mo28749f());
        if (tVar.mo28751h() != null) {
            mo25257b(tVar.mo28751h());
        }
        mo25256b(tVar.mo28750g());
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7236t mo25187a() throws IOException {
        if (this.f20405f == null) {
            return null;
        }
        return new C7230p(this.f20406g, this.f20408i, new C7274j(this.f20409j), this.f20405f).m34776a(this.f20407h).m34777a(this.f20411l).execute();
    }
}
