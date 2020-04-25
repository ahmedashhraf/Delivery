package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.x2 */
/* compiled from: ObservableScalarXMap */
public final class C13478x2 {

    /* renamed from: e.a.x0.e.e.x2$a */
    /* compiled from: ObservableScalarXMap */
    public static final class C13479a<T> extends AtomicInteger implements C12401j<T>, Runnable {

        /* renamed from: N */
        static final int f39035N = 0;

        /* renamed from: O */
        static final int f39036O = 1;

        /* renamed from: P */
        static final int f39037P = 2;

        /* renamed from: Q */
        static final int f39038Q = 3;
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: a */
        final C12280i0<? super T> f39039a;

        /* renamed from: b */
        final T f39040b;

        public C13479a(C12280i0<? super T> i0Var, T t) {
            this.f39039a = i0Var;
            this.f39040b = t;
        }

        /* renamed from: a */
        public boolean mo42104a(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public void clear() {
            lazySet(3);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == 3;
        }

        public void dispose() {
            set(3);
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @C5938g
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f39040b;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f39039a.mo33453a(this.f39040b);
                if (get() == 2) {
                    lazySet(3);
                    this.f39039a.onComplete();
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }
    }

    /* renamed from: e.a.x0.e.e.x2$b */
    /* compiled from: ObservableScalarXMap */
    static final class C13480b<T, R> extends C5923b0<R> {

        /* renamed from: a */
        final T f39041a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends R>> f39042b;

        C13480b(T t, C12339o<? super T, ? extends C5926g0<? extends R>> oVar) {
            this.f39041a = t;
            this.f39042b = oVar;
        }

        /* renamed from: e */
        public void mo23995e(C12280i0<? super R> i0Var) {
            try {
                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f39042b.apply(this.f39041a), "The mapper returned a null ObservableSource");
                if (g0Var instanceof Callable) {
                    try {
                        Object call = ((Callable) g0Var).call();
                        if (call == null) {
                            C12348e.m55473a(i0Var);
                            return;
                        }
                        C13479a aVar = new C13479a(i0Var, call);
                        i0Var.mo34123a((C12314c) aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12348e.m55476a(th, i0Var);
                    }
                } else {
                    g0Var.mo23893a(i0Var);
                }
            } catch (Throwable th2) {
                C12348e.m55476a(th2, i0Var);
            }
        }
    }

    private C13478x2() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, R> boolean m58082a(C5926g0<T> g0Var, C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar) {
        if (!(g0Var instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) g0Var).call();
            if (call == null) {
                C12348e.m55473a(i0Var);
                return true;
            }
            try {
                C5926g0 g0Var2 = (C5926g0) C12390b.m55563a(oVar.apply(call), "The mapper returned a null ObservableSource");
                if (g0Var2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) g0Var2).call();
                        if (call2 == null) {
                            C12348e.m55473a(i0Var);
                            return true;
                        }
                        C13479a aVar = new C13479a(i0Var, call2);
                        i0Var.mo34123a((C12314c) aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12348e.m55476a(th, i0Var);
                        return true;
                    }
                } else {
                    g0Var2.mo23893a(i0Var);
                }
                return true;
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C12348e.m55476a(th2, i0Var);
                return true;
            }
        } catch (Throwable th3) {
            C14398a.m62357b(th3);
            C12348e.m55476a(th3, i0Var);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C5923b0<U> m58081a(T t, C12339o<? super T, ? extends C5926g0<? extends U>> oVar) {
        return C12205a.m54862a((C5923b0<T>) new C13480b<T>(t, oVar));
    }
}
