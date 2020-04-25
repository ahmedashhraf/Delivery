package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.o2 */
/* compiled from: ObservableRepeat */
public final class C13355o2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final long f38593b;

    /* renamed from: e.a.x0.e.e.o2$a */
    /* compiled from: ObservableRepeat */
    static final class C13356a<T> extends AtomicInteger implements C12280i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C5926g0<? extends T> f38594N;

        /* renamed from: O */
        long f38595O;

        /* renamed from: a */
        final C12280i0<? super T> f38596a;

        /* renamed from: b */
        final C12350g f38597b;

        C13356a(C12280i0<? super T> i0Var, long j, C12350g gVar, C5926g0<? extends T> g0Var) {
            this.f38596a = i0Var;
            this.f38597b = gVar;
            this.f38594N = g0Var;
            this.f38595O = j;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38597b.mo42109a(cVar);
        }

        public void onComplete() {
            long j = this.f38595O;
            if (j != Long.MAX_VALUE) {
                this.f38595O = j - 1;
            }
            if (j != 0) {
                mo42831a();
            } else {
                this.f38596a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f38596a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38596a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42831a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f38597b.mo41878d()) {
                    this.f38594N.mo23893a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C13355o2(C5923b0<T> b0Var, long j) {
        super(b0Var);
        this.f38593b = j;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12350g gVar = new C12350g();
        i0Var.mo34123a((C12314c) gVar);
        long j = this.f38593b;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        C13356a aVar = new C13356a(i0Var, j2, gVar, this.f37851a);
        aVar.mo42831a();
    }
}
