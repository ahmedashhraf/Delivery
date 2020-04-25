package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12326b;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.s */
/* compiled from: FlowableCollect */
public final class C12804s<T, U> extends C12511a<T, U> {

    /* renamed from: N */
    final Callable<? extends U> f36800N;

    /* renamed from: O */
    final C12326b<? super U, ? super T> f36801O;

    /* renamed from: e.a.x0.e.b.s$a */
    /* compiled from: FlowableCollect */
    static final class C12805a<T, U> extends C13738f<U> implements C12297q<T> {
        private static final long serialVersionUID = -3589550218733891694L;

        /* renamed from: V */
        final C12326b<? super U, ? super T> f36802V;

        /* renamed from: W */
        final U f36803W;

        /* renamed from: X */
        C14063d f36804X;

        /* renamed from: Y */
        boolean f36805Y;

        C12805a(C14062c<? super U> cVar, U u, C12326b<? super U, ? super T> bVar) {
            super(cVar);
            this.f36802V = bVar;
            this.f36803W = u;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36804X, dVar)) {
                this.f36804X = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36804X.cancel();
        }

        public void onComplete() {
            if (!this.f36805Y) {
                this.f36805Y = true;
                mo43123c(this.f36803W);
            }
        }

        public void onError(Throwable th) {
            if (this.f36805Y) {
                C12205a.m54894b(th);
                return;
            }
            this.f36805Y = true;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36805Y) {
                try {
                    this.f36802V.mo42088a(this.f36803W, t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36804X.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12804s(C5929l<T> lVar, Callable<? extends U> callable, C12326b<? super U, ? super T> bVar) {
        super(lVar);
        this.f36800N = callable;
        this.f36801O = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        try {
            this.f35814b.mo24393a((C12297q<? super T>) new C12805a<Object>(cVar, C12390b.m55563a(this.f36800N.call(), "The initial value supplied is null"), this.f36801O));
        } catch (Throwable th) {
            C13739g.m58655a(th, cVar);
        }
    }
}
