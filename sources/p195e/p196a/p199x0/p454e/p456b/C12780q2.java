package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13730s;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.q2 */
/* compiled from: FlowableOnErrorReturn */
public final class C12780q2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super Throwable, ? extends T> f36690N;

    /* renamed from: e.a.x0.e.b.q2$a */
    /* compiled from: FlowableOnErrorReturn */
    static final class C12781a<T> extends C13730s<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* renamed from: R */
        final C12339o<? super Throwable, ? extends T> f36691R;

        C12781a(C14062c<? super T> cVar, C12339o<? super Throwable, ? extends T> oVar) {
            super(cVar);
            this.f36691R = oVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39760O++;
            this.f39761a.mo41789a(t);
        }

        public void onComplete() {
            this.f39761a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                mo43114c(C12390b.m55563a(this.f36691R.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39761a.onError(new CompositeException(th, th2));
            }
        }
    }

    public C12780q2(C5929l<T> lVar, C12339o<? super Throwable, ? extends T> oVar) {
        super(lVar);
        this.f36690N = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12781a<Object>(cVar, this.f36690N));
    }
}
