package p195e.p196a.p199x0.p454e.p459e;

import java.util.Iterator;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.l4 */
/* compiled from: ObservableZipIterable */
public final class C13305l4<T, U, V> extends C5923b0<V> {

    /* renamed from: N */
    final C12327c<? super T, ? super U, ? extends V> f38450N;

    /* renamed from: a */
    final C5923b0<? extends T> f38451a;

    /* renamed from: b */
    final Iterable<U> f38452b;

    /* renamed from: e.a.x0.e.e.l4$a */
    /* compiled from: ObservableZipIterable */
    static final class C13306a<T, U, V> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final C12327c<? super T, ? super U, ? extends V> f38453N;

        /* renamed from: O */
        C12314c f38454O;

        /* renamed from: P */
        boolean f38455P;

        /* renamed from: a */
        final C12280i0<? super V> f38456a;

        /* renamed from: b */
        final Iterator<U> f38457b;

        C13306a(C12280i0<? super V> i0Var, Iterator<U> it, C12327c<? super T, ? super U, ? extends V> cVar) {
            this.f38456a = i0Var;
            this.f38457b = it;
            this.f38453N = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38454O, cVar)) {
                this.f38454O = cVar;
                this.f38456a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38454O.mo41878d();
        }

        public void dispose() {
            this.f38454O.dispose();
        }

        public void onComplete() {
            if (!this.f38455P) {
                this.f38455P = true;
                this.f38456a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f38455P) {
                C12205a.m54894b(th);
                return;
            }
            this.f38455P = true;
            this.f38456a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38455P) {
                try {
                    try {
                        this.f38456a.mo33453a(C12390b.m55563a(this.f38453N.mo35569a(t, C12390b.m55563a(this.f38457b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.f38457b.hasNext()) {
                                this.f38455P = true;
                                this.f38454O.dispose();
                                this.f38456a.onComplete();
                            }
                        } catch (Throwable th) {
                            C14398a.m62357b(th);
                            mo42802a(th);
                        }
                    } catch (Throwable th2) {
                        C14398a.m62357b(th2);
                        mo42802a(th2);
                    }
                } catch (Throwable th3) {
                    C14398a.m62357b(th3);
                    mo42802a(th3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42802a(Throwable th) {
            this.f38455P = true;
            this.f38454O.dispose();
            this.f38456a.onError(th);
        }
    }

    public C13305l4(C5923b0<? extends T> b0Var, Iterable<U> iterable, C12327c<? super T, ? super U, ? extends V> cVar) {
        this.f38451a = b0Var;
        this.f38452b = iterable;
        this.f38450N = cVar;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super V> i0Var) {
        try {
            Iterator it = (Iterator) C12390b.m55563a(this.f38452b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    C12348e.m55473a(i0Var);
                } else {
                    this.f38451a.mo23893a((C12280i0<? super T>) new C13306a<Object>(i0Var, it, this.f38450N));
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a(th, i0Var);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12348e.m55476a(th2, i0Var);
        }
    }
}
