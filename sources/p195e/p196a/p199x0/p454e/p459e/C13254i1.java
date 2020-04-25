package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C12287k;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.i1 */
/* compiled from: ObservableGenerate */
public final class C13254i1<T, S> extends C5923b0<T> {

    /* renamed from: N */
    final C12331g<? super S> f38277N;

    /* renamed from: a */
    final Callable<S> f38278a;

    /* renamed from: b */
    final C12327c<S, C12287k<T>, S> f38279b;

    /* renamed from: e.a.x0.e.e.i1$a */
    /* compiled from: ObservableGenerate */
    static final class C13255a<T, S> implements C12287k<T>, C12314c {

        /* renamed from: N */
        final C12331g<? super S> f38280N;

        /* renamed from: O */
        S f38281O;

        /* renamed from: P */
        volatile boolean f38282P;

        /* renamed from: Q */
        boolean f38283Q;

        /* renamed from: R */
        boolean f38284R;

        /* renamed from: a */
        final C12280i0<? super T> f38285a;

        /* renamed from: b */
        final C12327c<S, ? super C12287k<T>, S> f38286b;

        C13255a(C12280i0<? super T> i0Var, C12327c<S, ? super C12287k<T>, S> cVar, C12331g<? super S> gVar, S s) {
            this.f38285a = i0Var;
            this.f38286b = cVar;
            this.f38280N = gVar;
            this.f38281O = s;
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (this.f38283Q) {
                return;
            }
            if (this.f38284R) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f38284R = true;
                this.f38285a.mo33453a(t);
            }
        }

        /* renamed from: b */
        public void mo42764b() {
            S s = this.f38281O;
            if (this.f38282P) {
                this.f38281O = null;
                m57503b(s);
                return;
            }
            C12327c<S, ? super C12287k<T>, S> cVar = this.f38286b;
            while (!this.f38282P) {
                this.f38284R = false;
                try {
                    s = cVar.mo35569a(s, this);
                    if (this.f38283Q) {
                        this.f38282P = true;
                        this.f38281O = null;
                        m57503b(s);
                        return;
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38281O = null;
                    this.f38282P = true;
                    onError(th);
                    m57503b(s);
                    return;
                }
            }
            this.f38281O = null;
            m57503b(s);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38282P;
        }

        public void dispose() {
            this.f38282P = true;
        }

        public void onComplete() {
            if (!this.f38283Q) {
                this.f38283Q = true;
                this.f38285a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38283Q) {
                C12205a.m54894b(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f38283Q = true;
            this.f38285a.onError(th);
        }

        /* renamed from: b */
        private void m57503b(S s) {
            try {
                this.f38280N.mo33410c(s);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public C13254i1(Callable<S> callable, C12327c<S, C12287k<T>, S> cVar, C12331g<? super S> gVar) {
        this.f38278a = callable;
        this.f38279b = cVar;
        this.f38277N = gVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        try {
            C13255a aVar = new C13255a(i0Var, this.f38279b, this.f38277N, this.f38278a.call());
            i0Var.mo34123a((C12314c) aVar);
            aVar.mo42764b();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
