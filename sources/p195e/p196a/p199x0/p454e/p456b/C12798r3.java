package p195e.p196a.p199x0.p454e.p456b;

import java.util.NoSuchElementException;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.r3 */
/* compiled from: FlowableSingleSingle */
public final class C12798r3<T> extends C5928k0<T> implements C12393b<T> {

    /* renamed from: a */
    final C5929l<T> f36758a;

    /* renamed from: b */
    final T f36759b;

    /* renamed from: e.a.x0.e.b.r3$a */
    /* compiled from: FlowableSingleSingle */
    static final class C12799a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        C14063d f36760N;

        /* renamed from: O */
        boolean f36761O;

        /* renamed from: P */
        T f36762P;

        /* renamed from: a */
        final C12292n0<? super T> f36763a;

        /* renamed from: b */
        final T f36764b;

        C12799a(C12292n0<? super T> n0Var, T t) {
            this.f36763a = n0Var;
            this.f36764b = t;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36760N, dVar)) {
                this.f36760N = dVar;
                this.f36763a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36760N == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36760N.cancel();
            this.f36760N = C13742j.CANCELLED;
        }

        public void onComplete() {
            if (!this.f36761O) {
                this.f36761O = true;
                this.f36760N = C13742j.CANCELLED;
                T t = this.f36762P;
                this.f36762P = null;
                if (t == null) {
                    t = this.f36764b;
                }
                if (t != null) {
                    this.f36763a.onSuccess(t);
                } else {
                    this.f36763a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36761O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36761O = true;
            this.f36760N = C13742j.CANCELLED;
            this.f36763a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36761O) {
                if (this.f36762P != null) {
                    this.f36761O = true;
                    this.f36760N.cancel();
                    this.f36760N = C13742j.CANCELLED;
                    this.f36763a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f36762P = t;
            }
        }
    }

    public C12798r3(C5929l<T> lVar, T t) {
        this.f36758a = lVar;
        this.f36759b = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f36758a.mo24393a((C12297q<? super T>) new C12799a<Object>(n0Var, this.f36759b));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12765p3<T>(this.f36758a, this.f36759b, true));
    }
}
