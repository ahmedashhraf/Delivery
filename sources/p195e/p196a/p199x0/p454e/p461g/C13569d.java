package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12290m0;
import p195e.p196a.C12292n0;
import p195e.p196a.C12294o0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12345b;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.d */
/* compiled from: SingleCreate */
public final class C13569d<T> extends C5928k0<T> {

    /* renamed from: a */
    final C12294o0<T> f39322a;

    /* renamed from: e.a.x0.e.g.d$a */
    /* compiled from: SingleCreate */
    static final class C13570a<T> extends AtomicReference<C12314c> implements C12290m0<T>, C12314c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C12292n0<? super T> f39323a;

        C13570a(C12292n0<? super T> n0Var) {
            this.f39323a = n0Var;
        }

        /* renamed from: a */
        public boolean mo42037a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                C12314c cVar = (C12314c) getAndSet(dVar);
                if (cVar != C12347d.DISPOSED) {
                    try {
                        this.f39323a.onError(th);
                        return true;
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo42038d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            if (!mo42037a(th)) {
                C12205a.m54894b(th);
            }
        }

        public void onSuccess(T t) {
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                C12314c cVar = (C12314c) getAndSet(dVar);
                if (cVar != C12347d.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f39323a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f39323a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo42035a(C12314c cVar) {
            C12347d.m55467b(this, cVar);
        }

        /* renamed from: a */
        public void mo42036a(C12330f fVar) {
            mo42035a((C12314c) new C12345b(fVar));
        }
    }

    public C13569d(C12294o0<T> o0Var) {
        this.f39322a = o0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C13570a aVar = new C13570a(n0Var);
        n0Var.mo41974a(aVar);
        try {
            this.f39322a.mo42048a(aVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            aVar.onError(th);
        }
    }
}
