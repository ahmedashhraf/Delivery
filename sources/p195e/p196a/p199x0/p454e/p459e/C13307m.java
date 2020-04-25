package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.m */
/* compiled from: ObservableBuffer */
public final class C13307m<T, U extends Collection<? super T>> extends C13131a<T, U> {

    /* renamed from: N */
    final int f38458N;

    /* renamed from: O */
    final Callable<U> f38459O;

    /* renamed from: b */
    final int f38460b;

    /* renamed from: e.a.x0.e.e.m$a */
    /* compiled from: ObservableBuffer */
    static final class C13308a<T, U extends Collection<? super T>> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final Callable<U> f38461N;

        /* renamed from: O */
        U f38462O;

        /* renamed from: P */
        int f38463P;

        /* renamed from: Q */
        C12314c f38464Q;

        /* renamed from: a */
        final C12280i0<? super U> f38465a;

        /* renamed from: b */
        final int f38466b;

        C13308a(C12280i0<? super U> i0Var, int i, Callable<U> callable) {
            this.f38465a = i0Var;
            this.f38466b = i;
            this.f38461N = callable;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42803a() {
            try {
                this.f38462O = (Collection) C12390b.m55563a(this.f38461N.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f38462O = null;
                C12314c cVar = this.f38464Q;
                if (cVar == null) {
                    C12348e.m55476a(th, this.f38465a);
                } else {
                    cVar.dispose();
                    this.f38465a.onError(th);
                }
                return false;
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38464Q.mo41878d();
        }

        public void dispose() {
            this.f38464Q.dispose();
        }

        public void onComplete() {
            U u = this.f38462O;
            if (u != null) {
                this.f38462O = null;
                if (!u.isEmpty()) {
                    this.f38465a.mo33453a(u);
                }
                this.f38465a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f38462O = null;
            this.f38465a.onError(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38464Q, cVar)) {
                this.f38464Q = cVar;
                this.f38465a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            U u = this.f38462O;
            if (u != null) {
                u.add(t);
                int i = this.f38463P + 1;
                this.f38463P = i;
                if (i >= this.f38466b) {
                    this.f38465a.mo33453a(u);
                    this.f38463P = 0;
                    mo42803a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.m$b */
    /* compiled from: ObservableBuffer */
    static final class C13309b<T, U extends Collection<? super T>> extends AtomicBoolean implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: N */
        final int f38467N;

        /* renamed from: O */
        final Callable<U> f38468O;

        /* renamed from: P */
        C12314c f38469P;

        /* renamed from: Q */
        final ArrayDeque<U> f38470Q = new ArrayDeque<>();

        /* renamed from: R */
        long f38471R;

        /* renamed from: a */
        final C12280i0<? super U> f38472a;

        /* renamed from: b */
        final int f38473b;

        C13309b(C12280i0<? super U> i0Var, int i, int i2, Callable<U> callable) {
            this.f38472a = i0Var;
            this.f38473b = i;
            this.f38467N = i2;
            this.f38468O = callable;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38469P, cVar)) {
                this.f38469P = cVar;
                this.f38472a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38469P.mo41878d();
        }

        public void dispose() {
            this.f38469P.dispose();
        }

        public void onComplete() {
            while (!this.f38470Q.isEmpty()) {
                this.f38472a.mo33453a(this.f38470Q.poll());
            }
            this.f38472a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38470Q.clear();
            this.f38472a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = this.f38471R;
            this.f38471R = 1 + j;
            if (j % ((long) this.f38467N) == 0) {
                try {
                    this.f38470Q.offer((Collection) C12390b.m55563a(this.f38468O.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.f38470Q.clear();
                    this.f38469P.dispose();
                    this.f38472a.onError(th);
                    return;
                }
            }
            Iterator it = this.f38470Q.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f38473b <= collection.size()) {
                    it.remove();
                    this.f38472a.mo33453a(collection);
                }
            }
        }
    }

    public C13307m(C5926g0<T> g0Var, int i, int i2, Callable<U> callable) {
        super(g0Var);
        this.f38460b = i;
        this.f38458N = i2;
        this.f38459O = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        int i = this.f38458N;
        int i2 = this.f38460b;
        if (i == i2) {
            C13308a aVar = new C13308a(i0Var, i2, this.f38459O);
            if (aVar.mo42803a()) {
                this.f37851a.mo23893a(aVar);
                return;
            }
            return;
        }
        this.f37851a.mo23893a(new C13309b(i0Var, i2, i, this.f38459O));
    }
}
