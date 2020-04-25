package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.z3 */
/* compiled from: ObservableToList */
public final class C13508z3<T, U extends Collection<? super T>> extends C13131a<T, U> {

    /* renamed from: b */
    final Callable<U> f39123b;

    /* renamed from: e.a.x0.e.e.z3$a */
    /* compiled from: ObservableToList */
    static final class C13509a<T, U extends Collection<? super T>> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f39124N;

        /* renamed from: a */
        U f39125a;

        /* renamed from: b */
        final C12280i0<? super U> f39126b;

        C13509a(C12280i0<? super U> i0Var, U u) {
            this.f39126b = i0Var;
            this.f39125a = u;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39124N, cVar)) {
                this.f39124N = cVar;
                this.f39126b.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39124N.mo41878d();
        }

        public void dispose() {
            this.f39124N.dispose();
        }

        public void onComplete() {
            U u = this.f39125a;
            this.f39125a = null;
            this.f39126b.mo33453a(u);
            this.f39126b.onComplete();
        }

        public void onError(Throwable th) {
            this.f39125a = null;
            this.f39126b.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f39125a.add(t);
        }
    }

    public C13508z3(C5926g0<T> g0Var, int i) {
        super(g0Var);
        this.f39123b = C12351a.m55512a(i);
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        try {
            this.f37851a.mo23893a(new C13509a(i0Var, (Collection) C12390b.m55563a(this.f39123b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }

    public C13508z3(C5926g0<T> g0Var, Callable<U> callable) {
        super(g0Var);
        this.f39123b = callable;
    }
}
