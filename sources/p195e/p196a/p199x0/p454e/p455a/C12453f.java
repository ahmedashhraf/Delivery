package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12242e;
import p195e.p196a.C12268f;
import p195e.p196a.C12277g;
import p195e.p196a.C5925c;
import p195e.p196a.p199x0.p450a.C12345b;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.f */
/* compiled from: CompletableCreate */
public final class C12453f extends C5925c {

    /* renamed from: a */
    final C12277g f35690a;

    /* renamed from: e.a.x0.e.a.f$a */
    /* compiled from: CompletableCreate */
    static final class C12454a extends AtomicReference<C12314c> implements C12242e, C12314c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C12268f f35691a;

        C12454a(C12268f fVar) {
            this.f35691a = fVar;
        }

        /* renamed from: a */
        public boolean mo41893a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12347d dVar = C12347d.DISPOSED;
            if (obj != dVar) {
                C12314c cVar = (C12314c) getAndSet(dVar);
                if (cVar != C12347d.DISPOSED) {
                    try {
                        this.f35691a.onError(th);
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
        public boolean mo41894d() {
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
                        this.f35691a.onComplete();
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo41893a(th)) {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo41891a(C12314c cVar) {
            C12347d.m55467b(this, cVar);
        }

        /* renamed from: a */
        public void mo41892a(C12330f fVar) {
            mo41891a((C12314c) new C12345b(fVar));
        }
    }

    public C12453f(C12277g gVar) {
        this.f35690a = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        C12454a aVar = new C12454a(fVar);
        fVar.mo41921a(aVar);
        try {
            this.f35690a.mo42016a(aVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            aVar.onError(th);
        }
    }
}
