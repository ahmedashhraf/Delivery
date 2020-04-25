package org.apache.http.p541f0;

import java.io.IOException;
import org.apache.http.C15316g;
import org.apache.http.C15348i;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15467s;
import org.apache.http.HttpException;
import org.apache.http.p541f0.p544n.C15295a;
import org.apache.http.p541f0.p544n.C15296b;
import org.apache.http.p541f0.p544n.C15297c;
import org.apache.http.p541f0.p544n.C15298d;
import org.apache.http.p541f0.p545o.C15308j;
import org.apache.http.p541f0.p545o.C15309k;
import org.apache.http.p546g0.C15317a;
import org.apache.http.p546g0.C15318b;
import org.apache.http.p546g0.C15319c;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.a */
/* compiled from: AbstractHttpClientConnection */
public abstract class C15251a implements C15316g {

    /* renamed from: N */
    private C15321e f44176N = null;

    /* renamed from: O */
    private C15322f f44177O = null;

    /* renamed from: P */
    private C15317a f44178P = null;

    /* renamed from: Q */
    private C15318b f44179Q = null;

    /* renamed from: R */
    private C15319c f44180R = null;

    /* renamed from: S */
    private C15259i f44181S = null;

    /* renamed from: a */
    private final C15296b f44182a = mo47186l();

    /* renamed from: b */
    private final C15295a f44183b = mo47185k();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15318b mo47175a(C15321e eVar, C15467s sVar, C15357i iVar) {
        return new C15309k(eVar, null, sVar, iVar);
    }

    public void flush() throws IOException {
        mo47184j();
        mo47188n();
    }

    public C15348i getMetrics() {
        return this.f44181S;
    }

    public boolean isStale() {
        if (!isOpen() || mo47189o()) {
            return true;
        }
        try {
            this.f44176N.mo47266a(1);
            return mo47189o();
        } catch (IOException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo47184j() throws IllegalStateException;

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C15295a mo47185k() {
        return new C15295a(new C15297c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C15296b mo47186l() {
        return new C15296b(new C15298d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C15467s mo47187m() {
        return new C15256f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo47188n() throws IOException {
        this.f44177O.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo47189o() {
        C15317a aVar = this.f44178P;
        return aVar != null && aVar.mo47412a();
    }

    public void sendRequestEntity(C15452k kVar) throws HttpException, IOException {
        if (kVar != null) {
            mo47184j();
            if (kVar.mo46951g() != null) {
                this.f44182a.mo47366a(this.f44177O, kVar, kVar.mo46951g());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    public void sendRequestHeader(C15463o oVar) throws HttpException, IOException {
        if (oVar != null) {
            mo47184j();
            this.f44180R.mo47368a(oVar);
            this.f44181S.mo47223e();
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15319c mo47176a(C15322f fVar, C15357i iVar) {
        return new C15308j(fVar, null, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47178a(C15321e eVar, C15322f fVar, C15357i iVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        } else if (fVar != null) {
            this.f44176N = eVar;
            this.f44177O = fVar;
            if (eVar instanceof C15317a) {
                this.f44178P = (C15317a) eVar;
            }
            this.f44179Q = mo47175a(eVar, mo47187m(), iVar);
            this.f44180R = mo47176a(fVar, iVar);
            this.f44181S = new C15259i(eVar.getMetrics(), fVar.getMetrics());
        } else {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
    }

    /* renamed from: a */
    public boolean mo47180a(int i) throws IOException {
        mo47184j();
        return this.f44176N.mo47266a(i);
    }

    /* renamed from: a */
    public C15466r mo47177a() throws HttpException, IOException {
        mo47184j();
        C15466r rVar = (C15466r) this.f44179Q.mo47367a();
        if (rVar.mo47468l().mo46913c() >= 200) {
            this.f44181S.mo47224f();
        }
        return rVar;
    }

    /* renamed from: a */
    public void mo47179a(C15466r rVar) throws HttpException, IOException {
        if (rVar != null) {
            mo47184j();
            rVar.mo47462a(this.f44183b.mo47363a(this.f44176N, rVar));
            return;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
