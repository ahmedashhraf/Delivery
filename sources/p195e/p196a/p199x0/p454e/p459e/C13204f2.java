package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.e.f2 */
/* compiled from: ObservableOnErrorReturn */
public final class C13204f2<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12339o<? super Throwable, ? extends T> f38108b;

    /* renamed from: e.a.x0.e.e.f2$a */
    /* compiled from: ObservableOnErrorReturn */
    static final class C13205a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        C12314c f38109N;

        /* renamed from: a */
        final C12280i0<? super T> f38110a;

        /* renamed from: b */
        final C12339o<? super Throwable, ? extends T> f38111b;

        C13205a(C12280i0<? super T> i0Var, C12339o<? super Throwable, ? extends T> oVar) {
            this.f38110a = i0Var;
            this.f38111b = oVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38109N, cVar)) {
                this.f38109N = cVar;
                this.f38110a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38109N.mo41878d();
        }

        public void dispose() {
            this.f38109N.dispose();
        }

        public void onComplete() {
            this.f38110a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f38111b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f38110a.onError(nullPointerException);
                    return;
                }
                this.f38110a.mo33453a(apply);
                this.f38110a.onComplete();
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f38110a.onError(new CompositeException(th, th2));
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38110a.mo33453a(t);
        }
    }

    public C13204f2(C5926g0<T> g0Var, C12339o<? super Throwable, ? extends T> oVar) {
        super(g0Var);
        this.f38108b = oVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13205a(i0Var, this.f38108b));
    }
}
