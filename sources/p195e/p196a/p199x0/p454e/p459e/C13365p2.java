package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12329e;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.p2 */
/* compiled from: ObservableRepeatUntil */
public final class C13365p2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12329e f38619b;

    /* renamed from: e.a.x0.e.e.p2$a */
    /* compiled from: ObservableRepeatUntil */
    static final class C13366a<T> extends AtomicInteger implements C12280i0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: N */
        final C5926g0<? extends T> f38620N;

        /* renamed from: O */
        final C12329e f38621O;

        /* renamed from: a */
        final C12280i0<? super T> f38622a;

        /* renamed from: b */
        final C12350g f38623b;

        C13366a(C12280i0<? super T> i0Var, C12329e eVar, C12350g gVar, C5926g0<? extends T> g0Var) {
            this.f38622a = i0Var;
            this.f38623b = gVar;
            this.f38620N = g0Var;
            this.f38621O = eVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f38623b.mo42109a(cVar);
        }

        public void onComplete() {
            try {
                if (this.f38621O.mo42090a()) {
                    this.f38622a.onComplete();
                } else {
                    mo42836a();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f38622a.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f38622a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38622a.mo33453a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42836a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f38620N.mo23893a(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    public C13365p2(C5923b0<T> b0Var, C12329e eVar) {
        super(b0Var);
        this.f38619b = eVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12350g gVar = new C12350g();
        i0Var.mo34123a((C12314c) gVar);
        new C13366a(i0Var, this.f38619b, gVar, this.f37851a).mo42836a();
    }
}
