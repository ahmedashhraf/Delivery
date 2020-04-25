package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.x1 */
/* compiled from: ObservableMapNotification */
public final class C13476x1<T, R> extends C13131a<T, C5926g0<? extends R>> {

    /* renamed from: N */
    final C12339o<? super Throwable, ? extends C5926g0<? extends R>> f39027N;

    /* renamed from: O */
    final Callable<? extends C5926g0<? extends R>> f39028O;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<? extends R>> f39029b;

    /* renamed from: e.a.x0.e.e.x1$a */
    /* compiled from: ObservableMapNotification */
    static final class C13477a<T, R> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final C12339o<? super Throwable, ? extends C5926g0<? extends R>> f39030N;

        /* renamed from: O */
        final Callable<? extends C5926g0<? extends R>> f39031O;

        /* renamed from: P */
        C12314c f39032P;

        /* renamed from: a */
        final C12280i0<? super C5926g0<? extends R>> f39033a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends R>> f39034b;

        C13477a(C12280i0<? super C5926g0<? extends R>> i0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, C12339o<? super Throwable, ? extends C5926g0<? extends R>> oVar2, Callable<? extends C5926g0<? extends R>> callable) {
            this.f39033a = i0Var;
            this.f39034b = oVar;
            this.f39030N = oVar2;
            this.f39031O = callable;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39032P, cVar)) {
                this.f39032P = cVar;
                this.f39033a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39032P.mo41878d();
        }

        public void dispose() {
            this.f39032P.dispose();
        }

        public void onComplete() {
            try {
                this.f39033a.mo33453a((C5926g0) C12390b.m55563a(this.f39031O.call(), "The onComplete ObservableSource returned is null"));
                this.f39033a.onComplete();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39033a.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                this.f39033a.mo33453a((C5926g0) C12390b.m55563a(this.f39030N.apply(th), "The onError ObservableSource returned is null"));
                this.f39033a.onComplete();
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39033a.onError(new CompositeException(th, th2));
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            try {
                this.f39033a.mo33453a((C5926g0) C12390b.m55563a(this.f39034b.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39033a.onError(th);
            }
        }
    }

    public C13476x1(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, C12339o<? super Throwable, ? extends C5926g0<? extends R>> oVar2, Callable<? extends C5926g0<? extends R>> callable) {
        super(g0Var);
        this.f39029b = oVar;
        this.f39027N = oVar2;
        this.f39028O = callable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super C5926g0<? extends R>> i0Var) {
        this.f37851a.mo23893a(new C13477a(i0Var, this.f39029b, this.f39027N, this.f39028O));
    }
}
