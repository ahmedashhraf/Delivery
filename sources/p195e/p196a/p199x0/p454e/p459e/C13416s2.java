package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.s2 */
/* compiled from: ObservableRetryBiPredicate */
public final class C13416s2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12328d<? super Integer, ? super Throwable> f38811b;

    /* renamed from: e.a.x0.e.e.s2$a */
    /* compiled from: ObservableRetryBiPredicate */
    static final class C13417a<T> extends AtomicInteger implements C12280i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C5926g0<? extends T> f38812N;

        /* renamed from: O */
        final C12328d<? super Integer, ? super Throwable> f38813O;

        /* renamed from: P */
        int f38814P;

        /* renamed from: a */
        final C12280i0<? super T> f38815a;

        /* renamed from: b */
        final C12350g f38816b;

        C13417a(C12280i0<? super T> i0Var, C12328d<? super Integer, ? super Throwable> dVar, C12350g gVar, C5926g0<? extends T> g0Var) {
            this.f38815a = i0Var;
            this.f38816b = gVar;
            this.f38812N = g0Var;
            this.f38813O = dVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38816b.mo42110b(cVar);
        }

        public void onComplete() {
            this.f38815a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                C12328d<? super Integer, ? super Throwable> dVar = this.f38813O;
                int i = this.f38814P + 1;
                this.f38814P = i;
                if (!dVar.mo42089a(Integer.valueOf(i), th)) {
                    this.f38815a.onError(th);
                } else {
                    mo42889a();
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f38815a.onError(new CompositeException(th, th2));
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38815a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42889a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f38816b.mo41878d()) {
                    this.f38812N.mo23893a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C13416s2(C5923b0<T> b0Var, C12328d<? super Integer, ? super Throwable> dVar) {
        super(b0Var);
        this.f38811b = dVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12350g gVar = new C12350g();
        i0Var.mo34123a((C12314c) gVar);
        new C13417a(i0Var, this.f38811b, gVar, this.f37851a).mo42889a();
    }
}
