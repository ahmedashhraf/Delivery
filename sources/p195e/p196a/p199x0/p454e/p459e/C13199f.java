package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.f */
/* compiled from: ObservableAll */
public final class C13199f<T> extends C13131a<T, Boolean> {

    /* renamed from: b */
    final C12342r<? super T> f38095b;

    /* renamed from: e.a.x0.e.e.f$a */
    /* compiled from: ObservableAll */
    static final class C13200a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38096N;

        /* renamed from: O */
        boolean f38097O;

        /* renamed from: a */
        final C12280i0<? super Boolean> f38098a;

        /* renamed from: b */
        final C12342r<? super T> f38099b;

        C13200a(C12280i0<? super Boolean> i0Var, C12342r<? super T> rVar) {
            this.f38098a = i0Var;
            this.f38099b = rVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38096N, cVar)) {
                this.f38096N = cVar;
                this.f38098a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38096N.mo41878d();
        }

        public void dispose() {
            this.f38096N.dispose();
        }

        public void onComplete() {
            if (!this.f38097O) {
                this.f38097O = true;
                this.f38098a.mo33453a(Boolean.valueOf(true));
                this.f38098a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38097O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38097O = true;
            this.f38098a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38097O) {
                try {
                    if (!this.f38099b.mo41812b(t)) {
                        this.f38097O = true;
                        this.f38096N.dispose();
                        this.f38098a.mo33453a(Boolean.valueOf(false));
                        this.f38098a.onComplete();
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38096N.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13199f(C5926g0<T> g0Var, C12342r<? super T> rVar) {
        super(g0Var);
        this.f38095b = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super Boolean> i0Var) {
        this.f37851a.mo23893a(new C13200a(i0Var, this.f38095b));
    }
}
