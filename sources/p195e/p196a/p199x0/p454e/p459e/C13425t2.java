package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.t2 */
/* compiled from: ObservableRetryPredicate */
public final class C13425t2<T> extends C13131a<T, T> {

    /* renamed from: N */
    final long f38835N;

    /* renamed from: b */
    final C12342r<? super Throwable> f38836b;

    /* renamed from: e.a.x0.e.e.t2$a */
    /* compiled from: ObservableRetryPredicate */
    static final class C13426a<T> extends AtomicInteger implements C12280i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C5926g0<? extends T> f38837N;

        /* renamed from: O */
        final C12342r<? super Throwable> f38838O;

        /* renamed from: P */
        long f38839P;

        /* renamed from: a */
        final C12280i0<? super T> f38840a;

        /* renamed from: b */
        final C12350g f38841b;

        C13426a(C12280i0<? super T> i0Var, long j, C12342r<? super Throwable> rVar, C12350g gVar, C5926g0<? extends T> g0Var) {
            this.f38840a = i0Var;
            this.f38841b = gVar;
            this.f38837N = g0Var;
            this.f38838O = rVar;
            this.f38839P = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38841b.mo42110b(cVar);
        }

        public void onComplete() {
            this.f38840a.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.f38839P;
            if (j != Long.MAX_VALUE) {
                this.f38839P = j - 1;
            }
            if (j == 0) {
                this.f38840a.onError(th);
            } else {
                try {
                    if (!this.f38838O.mo41812b(th)) {
                        this.f38840a.onError(th);
                        return;
                    }
                    mo42890a();
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f38840a.onError(new CompositeException(th, th2));
                }
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38840a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42890a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f38841b.mo41878d()) {
                    this.f38837N.mo23893a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C13425t2(C5923b0<T> b0Var, long j, C12342r<? super Throwable> rVar) {
        super(b0Var);
        this.f38836b = rVar;
        this.f38835N = j;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12350g gVar = new C12350g();
        i0Var.mo34123a((C12314c) gVar);
        C13426a aVar = new C13426a(i0Var, this.f38835N, this.f38836b, gVar, this.f37851a);
        aVar.mo42890a();
    }
}
