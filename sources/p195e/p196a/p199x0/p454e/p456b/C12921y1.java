package p195e.p196a.p199x0.p454e.p456b;

import java.util.NoSuchElementException;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.y1 */
/* compiled from: FlowableLastSingle */
public final class C12921y1<T> extends C5928k0<T> {

    /* renamed from: a */
    final C6007b<T> f37221a;

    /* renamed from: b */
    final T f37222b;

    /* renamed from: e.a.x0.e.b.y1$a */
    /* compiled from: FlowableLastSingle */
    static final class C12922a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        C14063d f37223N;

        /* renamed from: O */
        T f37224O;

        /* renamed from: a */
        final C12292n0<? super T> f37225a;

        /* renamed from: b */
        final T f37226b;

        C12922a(C12292n0<? super T> n0Var, T t) {
            this.f37225a = n0Var;
            this.f37226b = t;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37223N, dVar)) {
                this.f37223N = dVar;
                this.f37225a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37223N == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f37223N.cancel();
            this.f37223N = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f37223N = C13742j.CANCELLED;
            T t = this.f37224O;
            if (t != null) {
                this.f37224O = null;
                this.f37225a.onSuccess(t);
                return;
            }
            T t2 = this.f37226b;
            if (t2 != null) {
                this.f37225a.onSuccess(t2);
            } else {
                this.f37225a.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f37223N = C13742j.CANCELLED;
            this.f37224O = null;
            this.f37225a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37224O = t;
        }
    }

    public C12921y1(C6007b<T> bVar, T t) {
        this.f37221a = bVar;
        this.f37222b = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f37221a.mo24397a(new C12922a(n0Var, this.f37222b));
    }
}
