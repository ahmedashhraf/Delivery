package p195e.p196a.p199x0.p453d;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.s */
/* compiled from: InnerQueuedObserver */
public final class C12426s<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: N */
    C12406o<T> f35591N;

    /* renamed from: O */
    volatile boolean f35592O;

    /* renamed from: P */
    int f35593P;

    /* renamed from: a */
    final C12427t<T> f35594a;

    /* renamed from: b */
    final int f35595b;

    public C12426s(C12427t<T> tVar, int i) {
        this.f35594a = tVar;
        this.f35595b = i;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (C12347d.m55468c(this, cVar)) {
            if (cVar instanceof C12401j) {
                C12401j jVar = (C12401j) cVar;
                int a = jVar.mo41855a(3);
                if (a == 1) {
                    this.f35593P = a;
                    this.f35591N = jVar;
                    this.f35592O = true;
                    this.f35594a.mo42180a(this);
                    return;
                } else if (a == 2) {
                    this.f35593P = a;
                    this.f35591N = jVar;
                    return;
                }
            }
            this.f35591N = C13769v.m58780a(-this.f35595b);
        }
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return C12347d.m55463a((C12314c) get());
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    /* renamed from: e */
    public boolean mo42176e() {
        return this.f35592O;
    }

    /* renamed from: f */
    public C12406o<T> mo42177f() {
        return this.f35591N;
    }

    /* renamed from: g */
    public void mo42178g() {
        this.f35592O = true;
    }

    public void onComplete() {
        this.f35594a.mo42180a(this);
    }

    public void onError(Throwable th) {
        this.f35594a.mo42182a(this, th);
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        if (this.f35593P == 0) {
            this.f35594a.mo42181a(this, t);
        } else {
            this.f35594a.mo42179a();
        }
    }

    /* renamed from: a */
    public int mo42175a() {
        return this.f35593P;
    }
}
