package p195e.p196a.p199x0.p454e.p461g;

import java.util.NoSuchElementException;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.g.b0 */
/* compiled from: SingleFromPublisher */
public final class C13564b0<T> extends C5928k0<T> {

    /* renamed from: a */
    final C6007b<? extends T> f39310a;

    /* renamed from: e.a.x0.e.g.b0$a */
    /* compiled from: SingleFromPublisher */
    static final class C13565a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        T f39311N;

        /* renamed from: O */
        boolean f39312O;

        /* renamed from: P */
        volatile boolean f39313P;

        /* renamed from: a */
        final C12292n0<? super T> f39314a;

        /* renamed from: b */
        C14063d f39315b;

        C13565a(C12292n0<? super T> n0Var) {
            this.f39314a = n0Var;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39315b, dVar)) {
                this.f39315b = dVar;
                this.f39314a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39313P;
        }

        public void dispose() {
            this.f39313P = true;
            this.f39315b.cancel();
        }

        public void onComplete() {
            if (!this.f39312O) {
                this.f39312O = true;
                T t = this.f39311N;
                this.f39311N = null;
                if (t == null) {
                    this.f39314a.onError(new NoSuchElementException("The source Publisher is empty"));
                } else {
                    this.f39314a.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f39312O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39312O = true;
            this.f39311N = null;
            this.f39314a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39312O) {
                if (this.f39311N != null) {
                    this.f39315b.cancel();
                    this.f39312O = true;
                    this.f39311N = null;
                    this.f39314a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                } else {
                    this.f39311N = t;
                }
            }
        }
    }

    public C13564b0(C6007b<? extends T> bVar) {
        this.f39310a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f39310a.mo24397a(new C13565a(n0Var));
    }
}
