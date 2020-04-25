package p195e.p196a.p199x0.p454e.p459e;

import java.util.NoSuchElementException;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.q0 */
/* compiled from: ObservableElementAt */
public final class C13375q0<T> extends C13131a<T, T> {

    /* renamed from: N */
    final T f38663N;

    /* renamed from: O */
    final boolean f38664O;

    /* renamed from: b */
    final long f38665b;

    /* renamed from: e.a.x0.e.e.q0$a */
    /* compiled from: ObservableElementAt */
    static final class C13376a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final T f38666N;

        /* renamed from: O */
        final boolean f38667O;

        /* renamed from: P */
        C12314c f38668P;

        /* renamed from: Q */
        long f38669Q;

        /* renamed from: R */
        boolean f38670R;

        /* renamed from: a */
        final C12280i0<? super T> f38671a;

        /* renamed from: b */
        final long f38672b;

        C13376a(C12280i0<? super T> i0Var, long j, T t, boolean z) {
            this.f38671a = i0Var;
            this.f38672b = j;
            this.f38666N = t;
            this.f38667O = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38668P, cVar)) {
                this.f38668P = cVar;
                this.f38671a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38668P.mo41878d();
        }

        public void dispose() {
            this.f38668P.dispose();
        }

        public void onComplete() {
            if (!this.f38670R) {
                this.f38670R = true;
                T t = this.f38666N;
                if (t != null || !this.f38667O) {
                    if (t != null) {
                        this.f38671a.mo33453a(t);
                    }
                    this.f38671a.onComplete();
                    return;
                }
                this.f38671a.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.f38670R) {
                C12205a.m54894b(th);
                return;
            }
            this.f38670R = true;
            this.f38671a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38670R) {
                long j = this.f38669Q;
                if (j == this.f38672b) {
                    this.f38670R = true;
                    this.f38668P.dispose();
                    this.f38671a.mo33453a(t);
                    this.f38671a.onComplete();
                    return;
                }
                this.f38669Q = j + 1;
            }
        }
    }

    public C13375q0(C5926g0<T> g0Var, long j, T t, boolean z) {
        super(g0Var);
        this.f38665b = j;
        this.f38663N = t;
        this.f38664O = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C5926g0<T> g0Var = this.f37851a;
        C13376a aVar = new C13376a(i0Var, this.f38665b, this.f38663N, this.f38664O);
        g0Var.mo23893a(aVar);
    }
}
