package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p442e1.C12265i;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.u2 */
/* compiled from: ObservableRetryWhen */
public final class C13435u2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12339o<? super C5923b0<Throwable>, ? extends C5926g0<?>> f38872b;

    /* renamed from: e.a.x0.e.e.u2$a */
    /* compiled from: ObservableRetryWhen */
    static final class C13436a<T> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: N */
        final C13746c f38873N = new C13746c();

        /* renamed from: O */
        final C12265i<Throwable> f38874O;

        /* renamed from: P */
        final C13437a f38875P = new C13437a<>();

        /* renamed from: Q */
        final AtomicReference<C12314c> f38876Q = new AtomicReference<>();

        /* renamed from: R */
        final C5926g0<T> f38877R;

        /* renamed from: S */
        volatile boolean f38878S;

        /* renamed from: a */
        final C12280i0<? super T> f38879a;

        /* renamed from: b */
        final AtomicInteger f38880b = new AtomicInteger();

        /* renamed from: e.a.x0.e.e.u2$a$a */
        /* compiled from: ObservableRetryWhen */
        final class C13437a extends AtomicReference<C12314c> implements C12280i0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            C13437a() {
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                C13436a.this.mo42899a();
            }

            public void onError(Throwable th) {
                C13436a.this.mo42900a(th);
            }

            /* renamed from: a */
            public void mo33453a(Object obj) {
                C13436a.this.mo42901e();
            }
        }

        C13436a(C12280i0<? super T> i0Var, C12265i<Throwable> iVar, C5926g0<T> g0Var) {
            this.f38879a = i0Var;
            this.f38874O = iVar;
            this.f38877R = g0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55466a(this.f38876Q, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f38876Q.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f38876Q);
            C12347d.m55465a((AtomicReference<C12314c>) this.f38875P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42901e() {
            mo42902f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42902f() {
            if (this.f38880b.getAndIncrement() == 0) {
                while (!mo41878d()) {
                    if (!this.f38878S) {
                        this.f38878S = true;
                        this.f38877R.mo23893a(this);
                    }
                    if (this.f38880b.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public void onComplete() {
            C12347d.m55465a((AtomicReference<C12314c>) this.f38875P);
            C13756l.m58727a(this.f38879a, (AtomicInteger) this, this.f38873N);
        }

        public void onError(Throwable th) {
            this.f38878S = false;
            this.f38874O.mo33453a(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13756l.m58725a(this.f38879a, t, (AtomicInteger) this, this.f38873N);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42900a(Throwable th) {
            C12347d.m55465a(this.f38876Q);
            C13756l.m58726a(this.f38879a, th, (AtomicInteger) this, this.f38873N);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42899a() {
            C12347d.m55465a(this.f38876Q);
            C13756l.m58727a(this.f38879a, (AtomicInteger) this, this.f38873N);
        }
    }

    public C13435u2(C5926g0<T> g0Var, C12339o<? super C5923b0<Throwable>, ? extends C5926g0<?>> oVar) {
        super(g0Var);
        this.f38872b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12265i T = C12252e.m55181U().mo41985T();
        try {
            C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38872b.apply(T), "The handler returned a null ObservableSource");
            C13436a aVar = new C13436a(i0Var, T, this.f37851a);
            i0Var.mo34123a((C12314c) aVar);
            g0Var.mo23893a(aVar.f38875P);
            aVar.mo42902f();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
