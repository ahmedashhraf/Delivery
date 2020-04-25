package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.n0 */
/* compiled from: FlowableDistinct */
public final class C12726n0<T, K> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super T, K> f36498N;

    /* renamed from: O */
    final Callable<? extends Collection<? super K>> f36499O;

    /* renamed from: e.a.x0.e.b.n0$a */
    /* compiled from: FlowableDistinct */
    static final class C12727a<T, K> extends C13713b<T, T> {

        /* renamed from: Q */
        final Collection<? super K> f36500Q;

        /* renamed from: R */
        final C12339o<? super T, K> f36501R;

        C12727a(C14062c<? super T> cVar, C12339o<? super T, K> oVar, Collection<? super K> collection) {
            super(cVar);
            this.f36501R = oVar;
            this.f36500Q = collection;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39675O) {
                if (this.f39676P == 0) {
                    try {
                        if (this.f36500Q.add(C12390b.m55563a(this.f36501R.apply(t), "The keySelector returned a null key"))) {
                            this.f39677a.mo41789a(t);
                        } else {
                            this.f39678b.mo41813c(1);
                        }
                    } catch (Throwable th) {
                        mo43089a(th);
                    }
                } else {
                    this.f39677a.mo41789a(null);
                }
            }
        }

        public void clear() {
            this.f36500Q.clear();
            super.clear();
        }

        public void onComplete() {
            if (!this.f39675O) {
                this.f39675O = true;
                this.f36500Q.clear();
                this.f39677a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39675O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39675O = true;
            this.f36500Q.clear();
            this.f39677a.onError(th);
        }

        @C5938g
        public T poll() throws Exception {
            T poll;
            while (true) {
                poll = this.f39674N.poll();
                if (poll == null || this.f36500Q.add(C12390b.m55563a(this.f36501R.apply(poll), "The keySelector returned a null key"))) {
                    return poll;
                }
                if (this.f39676P == 2) {
                    this.f39678b.mo41813c(1);
                }
            }
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12726n0(C5929l<T> lVar, C12339o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(lVar);
        this.f36498N = oVar;
        this.f36499O = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            this.f35814b.mo24393a((C12297q<? super T>) new C12727a<Object>(cVar, this.f36498N, (Collection) C12390b.m55563a(this.f36499O.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
