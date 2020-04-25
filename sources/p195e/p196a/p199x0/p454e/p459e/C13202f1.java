package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12410c;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.f1 */
/* compiled from: ObservableFromIterable */
public final class C13202f1<T> extends C5923b0<T> {

    /* renamed from: a */
    final Iterable<? extends T> f38101a;

    /* renamed from: e.a.x0.e.e.f1$a */
    /* compiled from: ObservableFromIterable */
    static final class C13203a<T> extends C12410c<T> {

        /* renamed from: N */
        volatile boolean f38102N;

        /* renamed from: O */
        boolean f38103O;

        /* renamed from: P */
        boolean f38104P;

        /* renamed from: Q */
        boolean f38105Q;

        /* renamed from: a */
        final C12280i0<? super T> f38106a;

        /* renamed from: b */
        final Iterator<? extends T> f38107b;

        C13203a(C12280i0<? super T> i0Var, Iterator<? extends T> it) {
            this.f38106a = i0Var;
            this.f38107b = it;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42729a() {
            while (!mo41878d()) {
                try {
                    this.f38106a.mo33453a(C12390b.m55563a(this.f38107b.next(), "The iterator returned a null value"));
                    if (!mo41878d()) {
                        try {
                            if (!this.f38107b.hasNext()) {
                                if (!mo41878d()) {
                                    this.f38106a.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            this.f38106a.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f38106a.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f38104P = true;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38102N;
        }

        public void dispose() {
            this.f38102N = true;
        }

        public boolean isEmpty() {
            return this.f38104P;
        }

        @C5938g
        public T poll() {
            if (this.f38104P) {
                return null;
            }
            if (!this.f38105Q) {
                this.f38105Q = true;
            } else if (!this.f38107b.hasNext()) {
                this.f38104P = true;
                return null;
            }
            return C12390b.m55563a(this.f38107b.next(), "The iterator returned a null value");
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f38103O = true;
            return 1;
        }
    }

    public C13202f1(Iterable<? extends T> iterable) {
        this.f38101a = iterable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            Iterator it = this.f38101a.iterator();
            try {
                if (!it.hasNext()) {
                    C12348e.m55473a(i0Var);
                    return;
                }
                C13203a aVar = new C13203a(i0Var, it);
                i0Var.mo34123a((C12314c) aVar);
                if (!aVar.f38103O) {
                    aVar.mo42729a();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a(th, i0Var);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55476a(th2, i0Var);
        }
    }
}
