package org.apache.http.p541f0;

import java.io.IOException;
import org.apache.http.C15348i;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15464p;
import org.apache.http.C15466r;
import org.apache.http.C15469u;
import org.apache.http.HttpException;
import org.apache.http.p541f0.p544n.C15295a;
import org.apache.http.p541f0.p544n.C15296b;
import org.apache.http.p541f0.p544n.C15297c;
import org.apache.http.p541f0.p544n.C15298d;
import org.apache.http.p541f0.p545o.C15307i;
import org.apache.http.p541f0.p545o.C15310l;
import org.apache.http.p546g0.C15317a;
import org.apache.http.p546g0.C15318b;
import org.apache.http.p546g0.C15319c;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.b */
/* compiled from: AbstractHttpServerConnection */
public abstract class C15252b implements C15469u {

    /* renamed from: N */
    private C15321e f44184N = null;

    /* renamed from: O */
    private C15322f f44185O = null;

    /* renamed from: P */
    private C15317a f44186P = null;

    /* renamed from: Q */
    private C15318b f44187Q = null;

    /* renamed from: R */
    private C15319c f44188R = null;

    /* renamed from: S */
    private C15259i f44189S = null;

    /* renamed from: a */
    private final C15296b f44190a = mo47202l();

    /* renamed from: b */
    private final C15295a f44191b = mo47201k();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15318b mo47192a(C15321e eVar, C15464p pVar, C15357i iVar) {
        return new C15307i(eVar, null, pVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47194a() throws IllegalStateException;

    /* renamed from: b */
    public void mo47197b(C15466r rVar) throws HttpException, IOException {
        if (rVar.mo47466g() != null) {
            this.f44190a.mo47366a(this.f44185O, rVar, rVar.mo47466g());
        }
    }

    /* renamed from: c */
    public void mo47198c(C15466r rVar) throws HttpException, IOException {
        if (rVar != null) {
            mo47194a();
            this.f44188R.mo47368a(rVar);
            if (rVar.mo47468l().mo46913c() >= 200) {
                this.f44189S.mo47224f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    public void flush() throws IOException {
        mo47194a();
        mo47204n();
    }

    public C15348i getMetrics() {
        return this.f44189S;
    }

    public boolean isStale() {
        if (!isOpen() || mo47205o()) {
            return true;
        }
        try {
            this.f44184N.mo47266a(1);
            return mo47205o();
        } catch (IOException unused) {
            return true;
        }
    }

    /* renamed from: j */
    public C15463o mo47200j() throws HttpException, IOException {
        mo47194a();
        C15463o oVar = (C15463o) this.f44187Q.mo47367a();
        this.f44189S.mo47223e();
        return oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C15295a mo47201k() {
        return new C15295a(new C15297c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C15296b mo47202l() {
        return new C15296b(new C15298d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C15464p mo47203m() {
        return new C15255e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo47204n() throws IOException {
        this.f44185O.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo47205o() {
        C15317a aVar = this.f44186P;
        return aVar != null && aVar.mo47412a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15319c mo47193a(C15322f fVar, C15357i iVar) {
        return new C15310l(fVar, null, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47195a(C15321e eVar, C15322f fVar, C15357i iVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        } else if (fVar != null) {
            this.f44184N = eVar;
            this.f44185O = fVar;
            if (eVar instanceof C15317a) {
                this.f44186P = (C15317a) eVar;
            }
            this.f44187Q = mo47192a(eVar, mo47203m(), iVar);
            this.f44188R = mo47193a(fVar, iVar);
            this.f44189S = new C15259i(eVar.getMetrics(), fVar.getMetrics());
        } else {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
    }

    /* renamed from: a */
    public void mo47196a(C15452k kVar) throws HttpException, IOException {
        if (kVar != null) {
            mo47194a();
            kVar.mo46949a(this.f44191b.mo47363a(this.f44184N, kVar));
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
