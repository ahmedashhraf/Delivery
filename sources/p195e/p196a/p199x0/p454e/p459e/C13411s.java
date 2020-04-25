package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;

/* renamed from: e.a.x0.e.e.s */
/* compiled from: ObservableCollect */
public final class C13411s<T, U> extends C13131a<T, U> {

    /* renamed from: N */
    final C12326b<? super U, ? super T> f38794N;

    /* renamed from: b */
    final Callable<? extends U> f38795b;

    /* renamed from: e.a.x0.e.e.s$a */
    /* compiled from: ObservableCollect */
    static final class C13412a<T, U> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final U f38796N;

        /* renamed from: O */
        C12314c f38797O;

        /* renamed from: P */
        boolean f38798P;

        /* renamed from: a */
        final C12280i0<? super U> f38799a;

        /* renamed from: b */
        final C12326b<? super U, ? super T> f38800b;

        C13412a(C12280i0<? super U> i0Var, U u, C12326b<? super U, ? super T> bVar) {
            this.f38799a = i0Var;
            this.f38800b = bVar;
            this.f38796N = u;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38797O, cVar)) {
                this.f38797O = cVar;
                this.f38799a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38797O.mo41878d();
        }

        public void dispose() {
            this.f38797O.dispose();
        }

        public void onComplete() {
            if (!this.f38798P) {
                this.f38798P = true;
                this.f38799a.mo33453a(this.f38796N);
                this.f38799a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38798P) {
                C12205a.m54894b(th);
                return;
            }
            this.f38798P = true;
            this.f38799a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38798P) {
                try {
                    this.f38800b.mo42088a(this.f38796N, t);
                } catch (Throwable th) {
                    this.f38797O.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13411s(C5926g0<T> g0Var, Callable<? extends U> callable, C12326b<? super U, ? super T> bVar) {
        super(g0Var);
        this.f38795b = callable;
        this.f38794N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        try {
            this.f37851a.mo23893a(new C13412a(i0Var, C12390b.m55563a(this.f38795b.call(), "The initialSupplier returned a null value"), this.f38794N));
        } catch (Throwable th) {
            C12348e.m55476a(th, i0Var);
        }
    }
}
