package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12311u;
import p195e.p196a.C12321v;
import p195e.p196a.C12324w;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12345b;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.j */
/* compiled from: MaybeCreate */
public final class C13006j<T> extends C5931s<T> {

    /* renamed from: a */
    final C12324w<T> f37482a;

    /* renamed from: e.a.x0.e.c.j$a */
    /* compiled from: MaybeCreate */
    static final class C13007a<T> extends AtomicReference<C12314c> implements C12311u<T>, C12314c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C12321v<? super T> f37483a;

        C13007a(C12321v<? super T> vVar) {
            this.f37483a = vVar;
        }

        /* renamed from: a */
        public boolean mo42060a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                C12314c cVar = (C12314c) getAndSet(dVar);
                if (cVar != C12347d.DISPOSED) {
                    try {
                        this.f37483a.onError(th);
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
        public boolean mo42061d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                C12314c cVar = (C12314c) getAndSet(dVar);
                if (cVar != C12347d.DISPOSED) {
                    try {
                        this.f37483a.onComplete();
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo42060a(th)) {
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
                            this.f37483a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f37483a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo42058a(C12314c cVar) {
            C12347d.m55467b(this, cVar);
        }

        /* renamed from: a */
        public void mo42059a(C12330f fVar) {
            mo42058a((C12314c) new C12345b(fVar));
        }
    }

    public C13006j(C12324w<T> wVar) {
        this.f37482a = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        C13007a aVar = new C13007a(vVar);
        vVar.mo41931a(aVar);
        try {
            this.f37482a.mo42087a(aVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            aVar.onError(th);
        }
    }
}
