package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15116a;
import org.apache.http.C15423j;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.HttpException;
import org.apache.http.auth.C15121d;
import org.apache.http.client.C15135a;
import org.apache.http.client.C15136b;
import org.apache.http.client.C15137c;
import org.apache.http.client.C15138d;
import org.apache.http.client.C15139e;
import org.apache.http.client.C15140f;
import org.apache.http.client.C15141g;
import org.apache.http.client.C15142h;
import org.apache.http.client.C15143i;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.p530k.C15155k;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15183g;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.cookie.C15230i;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15426b;
import org.apache.http.p549j0.C15428c;
import org.apache.http.p549j0.C15431f;
import org.apache.http.p549j0.C15434i;
import org.apache.http.p549j0.C15435j;

@C6146d
/* renamed from: org.apache.http.impl.client.b */
/* compiled from: AbstractHttpClient */
public abstract class C15370b implements C15138d {

    /* renamed from: a */
    private final C15089a f44456a = C15096h.m66940c(getClass());
    @C6143a("this")

    /* renamed from: b */
    private C15357i f44457b;
    @C6143a("this")

    /* renamed from: c */
    private C15435j f44458c;
    @C6143a("this")

    /* renamed from: d */
    private C15179c f44459d;
    @C6143a("this")

    /* renamed from: e */
    private C15116a f44460e;
    @C6143a("this")

    /* renamed from: f */
    private C15183g f44461f;
    @C6143a("this")

    /* renamed from: g */
    private C15230i f44462g;
    @C6143a("this")

    /* renamed from: h */
    private C15121d f44463h;
    @C6143a("this")

    /* renamed from: i */
    private C15426b f44464i;
    @C6143a("this")

    /* renamed from: j */
    private C15139e f44465j;
    @C6143a("this")

    /* renamed from: k */
    private C15140f f44466k;
    @C6143a("this")

    /* renamed from: l */
    private C15135a f44467l;
    @C6143a("this")

    /* renamed from: m */
    private C15135a f44468m;
    @C6143a("this")

    /* renamed from: n */
    private C15136b f44469n;
    @C6143a("this")

    /* renamed from: o */
    private C15137c f44470o;
    @C6143a("this")

    /* renamed from: p */
    private C15204d f44471p;
    @C6143a("this")

    /* renamed from: q */
    private C15143i f44472q;

    protected C15370b(C15179c cVar, C15357i iVar) {
        this.f44457b = iVar;
        this.f44459d = cVar;
    }

    /* renamed from: A */
    public final synchronized C15139e mo47578A() {
        if (this.f44465j == null) {
            this.f44465j = mo47621m();
        }
        return this.f44465j;
    }

    /* renamed from: B */
    public final synchronized C15135a mo47579B() {
        if (this.f44468m == null) {
            this.f44468m = mo47623o();
        }
        return this.f44468m;
    }

    /* renamed from: C */
    public final synchronized C15140f mo47580C() {
        if (this.f44466k == null) {
            this.f44466k = mo47624p();
        }
        return this.f44466k;
    }

    /* renamed from: D */
    public final synchronized C15435j mo47581D() {
        if (this.f44458c == null) {
            this.f44458c = mo47625q();
        }
        return this.f44458c;
    }

    /* renamed from: E */
    public synchronized int mo47582E() {
        return mo47634z().mo47706e();
    }

    /* renamed from: F */
    public synchronized int mo47583F() {
        return mo47634z().mo47696b();
    }

    /* renamed from: G */
    public final synchronized C15204d mo47584G() {
        if (this.f44471p == null) {
            this.f44471p = mo47622n();
        }
        return this.f44471p;
    }

    /* renamed from: H */
    public final synchronized C15135a mo47585H() {
        if (this.f44467l == null) {
            this.f44467l = mo47626r();
        }
        return this.f44467l;
    }

    /* renamed from: I */
    public final synchronized C15143i mo47586I() {
        if (this.f44472q == null) {
            this.f44472q = mo47627s();
        }
        return this.f44472q;
    }

    /* renamed from: a */
    public synchronized void mo47602a(C15357i iVar) {
        this.f44457b = iVar;
    }

    /* renamed from: b */
    public synchronized void mo47610b(C15135a aVar) {
        this.f44467l = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C15121d mo47611c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C15179c mo47612d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C15183g mo47613e();

    public final C15466r execute(C15155k kVar) throws IOException, ClientProtocolException {
        return execute(kVar, (C15431f) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C15116a mo47614f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C15230i mo47615g();

    public final synchronized C15179c getConnectionManager() {
        if (this.f44459d == null) {
            this.f44459d = mo47612d();
        }
        return this.f44459d;
    }

    public final synchronized C15357i getParams() {
        if (this.f44457b == null) {
            this.f44457b = mo47619k();
        }
        return this.f44457b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C15136b mo47616h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C15137c mo47617i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C15431f mo47618j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C15357i mo47619k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C15426b mo47620l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C15139e mo47621m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C15204d mo47622n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C15135a mo47623o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract C15140f mo47624p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C15435j mo47625q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C15135a mo47626r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract C15143i mo47627s();

    /* renamed from: t */
    public final synchronized C15121d mo47628t() {
        if (this.f44463h == null) {
            this.f44463h = mo47611c();
        }
        return this.f44463h;
    }

    /* renamed from: u */
    public final synchronized C15183g mo47629u() {
        if (this.f44461f == null) {
            this.f44461f = mo47613e();
        }
        return this.f44461f;
    }

    /* renamed from: v */
    public final synchronized C15116a mo47630v() {
        if (this.f44460e == null) {
            this.f44460e = mo47614f();
        }
        return this.f44460e;
    }

    /* renamed from: w */
    public final synchronized C15230i mo47631w() {
        if (this.f44462g == null) {
            this.f44462g = mo47615g();
        }
        return this.f44462g;
    }

    /* renamed from: x */
    public final synchronized C15136b mo47632x() {
        if (this.f44469n == null) {
            this.f44469n = mo47616h();
        }
        return this.f44469n;
    }

    /* renamed from: y */
    public final synchronized C15137c mo47633y() {
        if (this.f44470o == null) {
            this.f44470o = mo47617i();
        }
        return this.f44470o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final synchronized C15426b mo47634z() {
        if (this.f44464i == null) {
            this.f44464i = mo47620l();
        }
        return this.f44464i;
    }

    public final C15466r execute(C15155k kVar, C15431f fVar) throws IOException, ClientProtocolException {
        if (kVar != null) {
            return execute(m68089a(kVar), (C15463o) kVar, fVar);
        }
        throw new IllegalArgumentException("Request must not be null.");
    }

    /* renamed from: a */
    public synchronized void mo47592a(C15121d dVar) {
        this.f44463h = dVar;
    }

    /* renamed from: b */
    public synchronized C15468t mo47607b(int i) {
        return mo47634z().mo47688a(i);
    }

    /* renamed from: b */
    public synchronized void mo47608b() {
        mo47634z().mo47705d();
    }

    public final C15466r execute(C15460l lVar, C15463o oVar) throws IOException, ClientProtocolException {
        return execute(lVar, oVar, (C15431f) null);
    }

    /* renamed from: a */
    public synchronized void mo47601a(C15230i iVar) {
        this.f44462g = iVar;
    }

    public final C15466r execute(C15460l lVar, C15463o oVar, C15431f fVar) throws IOException, ClientProtocolException {
        C15431f fVar2;
        C15141g a;
        C15463o oVar2 = oVar;
        C15431f fVar3 = fVar;
        if (oVar2 != null) {
            synchronized (this) {
                C15431f j = mo47618j();
                if (fVar3 == null) {
                    fVar2 = j;
                } else {
                    fVar2 = new C15428c(fVar3, j);
                }
                a = mo25674a(mo47581D(), getConnectionManager(), mo47630v(), mo47629u(), mo47584G(), mo47634z().mo47708g(), mo47578A(), mo47580C(), mo47585H(), mo47579B(), mo47586I(), mo47587a(oVar2));
            }
            try {
                return a.execute(lVar, oVar2, fVar2);
            } catch (HttpException e) {
                throw new ClientProtocolException((Throwable) e);
            }
        } else {
            throw new IllegalArgumentException("Request must not be null.");
        }
    }

    /* renamed from: b */
    public synchronized void mo47609b(Class<? extends C15468t> cls) {
        mo47634z().mo47689a((Class) cls);
    }

    /* renamed from: a */
    public synchronized void mo47591a(C15116a aVar) {
        this.f44460e = aVar;
    }

    /* renamed from: a */
    public synchronized void mo47599a(C15183g gVar) {
        this.f44461f = gVar;
    }

    /* renamed from: a */
    public synchronized void mo47596a(C15139e eVar) {
        this.f44465j = eVar;
    }

    /* renamed from: a */
    public synchronized void mo47597a(C15140f fVar) {
        this.f44466k = fVar;
    }

    public <T> T execute(C15155k kVar, C15142h<? extends T> hVar) throws IOException, ClientProtocolException {
        return execute(kVar, hVar, (C15431f) null);
    }

    /* renamed from: a */
    public synchronized void mo47593a(C15135a aVar) {
        this.f44468m = aVar;
    }

    public <T> T execute(C15155k kVar, C15142h<? extends T> hVar, C15431f fVar) throws IOException, ClientProtocolException {
        return execute(m68089a(kVar), kVar, hVar, fVar);
    }

    /* renamed from: a */
    public synchronized void mo47594a(C15136b bVar) {
        this.f44469n = bVar;
    }

    public <T> T execute(C15460l lVar, C15463o oVar, C15142h<? extends T> hVar) throws IOException, ClientProtocolException {
        return execute(lVar, oVar, hVar, null);
    }

    public <T> T execute(C15460l lVar, C15463o oVar, C15142h<? extends T> hVar, C15431f fVar) throws IOException, ClientProtocolException {
        if (hVar != null) {
            C15466r execute = execute(lVar, oVar, fVar);
            try {
                T a = hVar.mo46944a(execute);
                C15423j g = execute.mo47466g();
                if (g != null) {
                    g.mo46986j();
                }
                return a;
            } catch (Throwable th) {
                this.f44456a.mo46782c("Error consuming content after an exception.", th);
            }
        } else {
            throw new IllegalArgumentException("Response handler must not be null.");
        }
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof IOException) {
            throw th;
        } else {
            throw new UndeclaredThrowableException(th);
        }
    }

    /* renamed from: a */
    public synchronized void mo47595a(C15137c cVar) {
        this.f44470o = cVar;
    }

    /* renamed from: a */
    public synchronized void mo47600a(C15204d dVar) {
        this.f44471p = dVar;
    }

    /* renamed from: a */
    public synchronized void mo47598a(C15143i iVar) {
        this.f44472q = iVar;
    }

    /* renamed from: a */
    public synchronized void mo47605a(C15468t tVar) {
        mo47634z().mo47701b(tVar);
    }

    /* renamed from: a */
    public synchronized void mo47606a(C15468t tVar, int i) {
        mo47634z().mo47702b(tVar, i);
    }

    /* renamed from: a */
    public synchronized void mo47603a(C15465q qVar) {
        mo47634z().mo47699b(qVar);
    }

    /* renamed from: a */
    public synchronized void mo47604a(C15465q qVar, int i) {
        mo47634z().mo47700b(qVar, i);
    }

    /* renamed from: a */
    public synchronized C15465q mo47588a(int i) {
        return mo47634z().mo47697b(i);
    }

    /* renamed from: a */
    public synchronized void mo47589a() {
        mo47634z().mo47703c();
    }

    /* renamed from: a */
    public synchronized void mo47590a(Class<? extends C15465q> cls) {
        mo47634z().mo47698b((Class) cls);
    }

    /* renamed from: a */
    private C15460l m68089a(C15155k kVar) {
        URI k = kVar.mo46958k();
        if (k.isAbsolute()) {
            return new C15460l(k.getHost(), k.getPort(), k.getScheme());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15141g mo25674a(C15435j jVar, C15179c cVar, C15116a aVar, C15183g gVar, C15204d dVar, C15434i iVar, C15139e eVar, C15140f fVar, C15135a aVar2, C15135a aVar3, C15143i iVar2, C15357i iVar3) {
        C15380l lVar = new C15380l(this.f44456a, jVar, cVar, aVar, gVar, dVar, iVar, eVar, fVar, aVar2, aVar3, iVar2, iVar3);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15357i mo47587a(C15463o oVar) {
        return new C15374f(null, getParams(), oVar.getParams(), null);
    }
}
