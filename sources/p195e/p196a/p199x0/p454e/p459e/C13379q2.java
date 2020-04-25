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

/* renamed from: e.a.x0.e.e.q2 */
/* compiled from: ObservableRepeatWhen */
public final class C13379q2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12339o<? super C5923b0<Object>, ? extends C5926g0<?>> f38682b;

    /* renamed from: e.a.x0.e.e.q2$a */
    /* compiled from: ObservableRepeatWhen */
    static final class C13380a<T> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: N */
        final C13746c f38683N = new C13746c();

        /* renamed from: O */
        final C12265i<Object> f38684O;

        /* renamed from: P */
        final C13381a f38685P = new C13381a<>();

        /* renamed from: Q */
        final AtomicReference<C12314c> f38686Q = new AtomicReference<>();

        /* renamed from: R */
        final C5926g0<T> f38687R;

        /* renamed from: S */
        volatile boolean f38688S;

        /* renamed from: a */
        final C12280i0<? super T> f38689a;

        /* renamed from: b */
        final AtomicInteger f38690b = new AtomicInteger();

        /* renamed from: e.a.x0.e.e.q2$a$a */
        /* compiled from: ObservableRepeatWhen */
        final class C13381a extends AtomicReference<C12314c> implements C12280i0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            C13381a() {
            }

            /* renamed from: a */
            public void mo34123a(C12314c cVar) {
                C12347d.m55468c(this, cVar);
            }

            public void onComplete() {
                C13380a.this.mo42849a();
            }

            public void onError(Throwable th) {
                C13380a.this.mo42850a(th);
            }

            /* renamed from: a */
            public void mo33453a(Object obj) {
                C13380a.this.mo42851e();
            }
        }

        C13380a(C12280i0<? super T> i0Var, C12265i<Object> iVar, C5926g0<T> g0Var) {
            this.f38689a = i0Var;
            this.f38684O = iVar;
            this.f38687R = g0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55466a(this.f38686Q, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f38686Q.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f38686Q);
            C12347d.m55465a((AtomicReference<C12314c>) this.f38685P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42851e() {
            mo42852f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42852f() {
            if (this.f38690b.getAndIncrement() == 0) {
                while (!mo41878d()) {
                    if (!this.f38688S) {
                        this.f38688S = true;
                        this.f38687R.mo23893a(this);
                    }
                    if (this.f38690b.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public void onComplete() {
            this.f38688S = false;
            this.f38684O.mo33453a(Integer.valueOf(0));
        }

        public void onError(Throwable th) {
            C12347d.m55465a((AtomicReference<C12314c>) this.f38685P);
            C13756l.m58726a(this.f38689a, th, (AtomicInteger) this, this.f38683N);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            C13756l.m58725a(this.f38689a, t, (AtomicInteger) this, this.f38683N);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42850a(Throwable th) {
            C12347d.m55465a(this.f38686Q);
            C13756l.m58726a(this.f38689a, th, (AtomicInteger) this, this.f38683N);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42849a() {
            C12347d.m55465a(this.f38686Q);
            C13756l.m58727a(this.f38689a, (AtomicInteger) this, this.f38683N);
        }
    }

    public C13379q2(C5926g0<T> g0Var, C12339o<? super C5923b0<Object>, ? extends C5926g0<?>> oVar) {
        super(g0Var);
        this.f38682b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12265i T = C12252e.m55181U().mo41985T();
        try {
            C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38682b.apply(T), "The handler returned a null ObservableSource");
            C13380a aVar = new C13380a(i0Var, T, this.f37851a);
            i0Var.mo34123a((C12314c) aVar);
            g0Var.mo23893a(aVar.f38685P);
            aVar.mo42852f();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
