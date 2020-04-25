package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12407a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.k0 */
/* compiled from: ObservableDistinct */
public final class C13281k0<T, K> extends C13131a<T, T> {

    /* renamed from: N */
    final Callable<? extends Collection<? super K>> f38372N;

    /* renamed from: b */
    final C12339o<? super T, K> f38373b;

    /* renamed from: e.a.x0.e.e.k0$a */
    /* compiled from: ObservableDistinct */
    static final class C13282a<T, K> extends C12407a<T, T> {

        /* renamed from: Q */
        final Collection<? super K> f38374Q;

        /* renamed from: R */
        final C12339o<? super T, K> f38375R;

        C13282a(C12280i0<? super T> i0Var, C12339o<? super T, K> oVar, Collection<? super K> collection) {
            super(i0Var);
            this.f38375R = oVar;
            this.f38374Q = collection;
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f35548O) {
                if (this.f35549P == 0) {
                    try {
                        if (this.f38374Q.add(C12390b.m55563a(this.f38375R.apply(t), "The keySelector returned a null key"))) {
                            this.f35550a.mo33453a(t);
                        }
                    } catch (Throwable th) {
                        mo42149a(th);
                    }
                } else {
                    this.f35550a.mo33453a(null);
                }
            }
        }

        public void clear() {
            this.f38374Q.clear();
            super.clear();
        }

        public void onComplete() {
            if (!this.f35548O) {
                this.f35548O = true;
                this.f38374Q.clear();
                this.f35550a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35548O) {
                C12205a.m54894b(th);
                return;
            }
            this.f35548O = true;
            this.f38374Q.clear();
            this.f35550a.onError(th);
        }

        @C5938g
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f35547N.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f38374Q.add(C12390b.m55563a(this.f38375R.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo42150b(i);
        }
    }

    public C13281k0(C5926g0<T> g0Var, C12339o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(g0Var);
        this.f38373b = oVar;
        this.f38372N = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            this.f37851a.mo23893a(new C13282a(i0Var, this.f38373b, (Collection) C12390b.m55563a(this.f38372N.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
