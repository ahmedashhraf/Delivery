package p195e.p196a.p199x0.p454e.p459e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.a4 */
/* compiled from: ObservableToListSingle */
public final class C13143a4<T, U extends Collection<? super T>> extends C5928k0<U> implements C12395d<U> {

    /* renamed from: a */
    final C5926g0<T> f37898a;

    /* renamed from: b */
    final Callable<U> f37899b;

    /* renamed from: e.a.x0.e.e.a4$a */
    /* compiled from: ObservableToListSingle */
    static final class C13144a<T, U extends Collection<? super T>> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f37900N;

        /* renamed from: a */
        final C12292n0<? super U> f37901a;

        /* renamed from: b */
        U f37902b;

        C13144a(C12292n0<? super U> n0Var, U u) {
            this.f37901a = n0Var;
            this.f37902b = u;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f37900N, cVar)) {
                this.f37900N = cVar;
                this.f37901a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37900N.mo41878d();
        }

        public void dispose() {
            this.f37900N.dispose();
        }

        public void onComplete() {
            U u = this.f37902b;
            this.f37902b = null;
            this.f37901a.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.f37902b = null;
            this.f37901a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37902b.add(t);
        }
    }

    public C13143a4(C5926g0<T> g0Var, int i) {
        this.f37898a = g0Var;
        this.f37899b = C12351a.m55512a(i);
    }

    /* renamed from: a */
    public C5923b0<U> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13508z3<T>(this.f37898a, this.f37899b));
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super U> n0Var) {
        try {
            this.f37898a.mo23893a(new C13144a(n0Var, (Collection) C12390b.m55563a(this.f37899b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }

    public C13143a4(C5926g0<T> g0Var, Callable<U> callable) {
        this.f37898a = g0Var;
        this.f37899b = callable;
    }
}
