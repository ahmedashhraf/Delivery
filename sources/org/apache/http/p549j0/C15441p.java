package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15116a;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15467s;
import org.apache.http.C15469u;
import org.apache.http.C15470v;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.p540e0.C15241d;
import org.apache.http.p548i0.C15353e;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15455c;

/* renamed from: org.apache.http.j0.p */
/* compiled from: HttpService */
public class C15441p {

    /* renamed from: a */
    private C15357i f44607a = null;

    /* renamed from: b */
    private C15434i f44608b = null;

    /* renamed from: c */
    private C15438m f44609c = null;

    /* renamed from: d */
    private C15116a f44610d = null;

    /* renamed from: e */
    private C15467s f44611e = null;

    /* renamed from: f */
    private C15433h f44612f = null;

    public C15441p(C15434i iVar, C15116a aVar, C15467s sVar) {
        mo47734a(iVar);
        mo47731a(aVar);
        mo47737a(sVar);
    }

    /* renamed from: a */
    public void mo47734a(C15434i iVar) {
        if (iVar != null) {
            this.f44608b = iVar;
            return;
        }
        throw new IllegalArgumentException("HTTP processor may not be null");
    }

    /* renamed from: a */
    public void mo47731a(C15116a aVar) {
        if (aVar != null) {
            this.f44610d = aVar;
            return;
        }
        throw new IllegalArgumentException("Connection reuse strategy may not be null");
    }

    /* renamed from: a */
    public void mo47737a(C15467s sVar) {
        if (sVar != null) {
            this.f44611e = sVar;
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }

    /* renamed from: a */
    public void mo47735a(C15438m mVar) {
        this.f44609c = mVar;
    }

    /* renamed from: a */
    public void mo47733a(C15433h hVar) {
        this.f44612f = hVar;
    }

    /* renamed from: a */
    public C15357i mo47729a() {
        return this.f44607a;
    }

    /* renamed from: a */
    public void mo47732a(C15357i iVar) {
        this.f44607a = iVar;
    }

    /* renamed from: a */
    public void mo47738a(C15469u uVar, C15431f fVar) throws IOException, HttpException {
        C15466r rVar;
        fVar.mo47686a(C15429d.f44564a, uVar);
        try {
            C15463o j = uVar.mo47200j();
            j.mo47416a((C15357i) new C15353e(j.getParams(), this.f44607a));
            C15473y b = j.mo46956h().mo46854b();
            if (!b.mo47796d(C15471w.f44689R)) {
                b = C15471w.f44689R;
            }
            rVar = null;
            if (j instanceof C15452k) {
                if (((C15452k) j).mo46952i()) {
                    C15466r a = this.f44611e.mo47213a(b, 100, fVar);
                    a.mo47416a((C15357i) new C15353e(a.getParams(), this.f44607a));
                    if (this.f44612f != null) {
                        try {
                            this.f44612f.mo47716a(j, a, fVar);
                        } catch (HttpException e) {
                            C15466r a2 = this.f44611e.mo47213a(C15471w.f44688Q, 500, fVar);
                            a2.mo47416a((C15357i) new C15353e(a2.getParams(), this.f44607a));
                            mo47730a(e, a2);
                            a = a2;
                        }
                    }
                    if (a.mo47468l().mo46913c() < 200) {
                        uVar.mo47198c(a);
                        uVar.flush();
                        uVar.mo47196a((C15452k) j);
                    } else {
                        rVar = a;
                    }
                } else {
                    uVar.mo47196a((C15452k) j);
                }
            }
            if (rVar == null) {
                rVar = this.f44611e.mo47213a(b, 200, fVar);
                rVar.mo47416a((C15357i) new C15353e(rVar.getParams(), this.f44607a));
                fVar.mo47686a(C15429d.f44565b, j);
                fVar.mo47686a(C15429d.f44566c, rVar);
                this.f44608b.mo46975a(j, fVar);
                mo47736a(j, rVar, fVar);
            }
            if (j instanceof C15452k) {
                C15423j g = ((C15452k) j).mo46951g();
                if (g != null) {
                    g.mo46986j();
                }
            }
        } catch (HttpException e2) {
            rVar = this.f44611e.mo47213a(C15471w.f44688Q, 500, fVar);
            rVar.mo47416a((C15357i) new C15353e(rVar.getParams(), this.f44607a));
            mo47730a(e2, rVar);
        }
        this.f44608b.mo46976a(rVar, fVar);
        uVar.mo47198c(rVar);
        uVar.mo47197b(rVar);
        uVar.flush();
        if (!this.f44610d.mo46853a(rVar, fVar)) {
            uVar.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47730a(HttpException httpException, C15466r rVar) {
        if (httpException instanceof MethodNotSupportedException) {
            rVar.mo47459a((int) C15470v.f44654Q);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            rVar.mo47459a((int) C15470v.f44658U);
        } else if (httpException instanceof ProtocolException) {
            rVar.mo47459a(400);
        } else {
            rVar.mo47459a(500);
        }
        C15241d dVar = new C15241d(C15455c.m68495a(httpException.getMessage()));
        dVar.mo47162b("text/plain; charset=US-ASCII");
        rVar.mo47462a((C15423j) dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47736a(C15463o oVar, C15466r rVar, C15431f fVar) throws HttpException, IOException {
        C15436k kVar;
        if (this.f44609c != null) {
            kVar = this.f44609c.lookup(oVar.mo46956h().mo46856f());
        } else {
            kVar = null;
        }
        if (kVar != null) {
            kVar.mo47723a(oVar, rVar, fVar);
        } else {
            rVar.mo47459a((int) C15470v.f44654Q);
        }
    }
}
