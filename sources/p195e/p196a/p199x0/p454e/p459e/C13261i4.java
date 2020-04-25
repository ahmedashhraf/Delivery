package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p467z0.C13795m;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.i4 */
/* compiled from: ObservableWithLatestFrom */
public final class C13261i4<T, U, R> extends C13131a<T, R> {

    /* renamed from: N */
    final C5926g0<? extends U> f38304N;

    /* renamed from: b */
    final C12327c<? super T, ? super U, ? extends R> f38305b;

    /* renamed from: e.a.x0.e.e.i4$a */
    /* compiled from: ObservableWithLatestFrom */
    final class C13262a implements C12280i0<U> {

        /* renamed from: a */
        private final C13263b<T, U, R> f38306a;

        C13262a(C13263b<T, U, R> bVar) {
            this.f38306a = bVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38306a.mo42767b(cVar);
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f38306a.mo42766a(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            this.f38306a.lazySet(u);
        }
    }

    /* renamed from: e.a.x0.e.e.i4$b */
    /* compiled from: ObservableWithLatestFrom */
    static final class C13263b<T, U, R> extends AtomicReference<U> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: N */
        final AtomicReference<C12314c> f38308N = new AtomicReference<>();

        /* renamed from: O */
        final AtomicReference<C12314c> f38309O = new AtomicReference<>();

        /* renamed from: a */
        final C12280i0<? super R> f38310a;

        /* renamed from: b */
        final C12327c<? super T, ? super U, ? extends R> f38311b;

        C13263b(C12280i0<? super R> i0Var, C12327c<? super T, ? super U, ? extends R> cVar) {
            this.f38310a = i0Var;
            this.f38311b = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38308N, cVar);
        }

        /* renamed from: b */
        public boolean mo42767b(C12314c cVar) {
            return C12347d.m55468c(this.f38309O, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f38308N.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f38308N);
            C12347d.m55465a(this.f38309O);
        }

        public void onComplete() {
            C12347d.m55465a(this.f38309O);
            this.f38310a.onComplete();
        }

        public void onError(Throwable th) {
            C12347d.m55465a(this.f38309O);
            this.f38310a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.f38310a.mo33453a(C12390b.m55563a(this.f38311b.mo35569a(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    dispose();
                    this.f38310a.onError(th);
                }
            }
        }

        /* renamed from: a */
        public void mo42766a(Throwable th) {
            C12347d.m55465a(this.f38308N);
            this.f38310a.onError(th);
        }
    }

    public C13261i4(C5926g0<T> g0Var, C12327c<? super T, ? super U, ? extends R> cVar, C5926g0<? extends U> g0Var2) {
        super(g0Var);
        this.f38305b = cVar;
        this.f38304N = g0Var2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        C13795m mVar = new C13795m(i0Var);
        C13263b bVar = new C13263b(mVar, this.f38305b);
        mVar.mo34123a((C12314c) bVar);
        this.f38304N.mo23893a(new C13262a(bVar));
        this.f37851a.mo23893a(bVar);
    }
}
