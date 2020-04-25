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

/* renamed from: e.a.x0.e.b.v0 */
/* compiled from: FlowableElementAtSingle */
public final class C12870v0<T> extends C5928k0<T> implements C12393b<T> {

    /* renamed from: N */
    final T f37027N;

    /* renamed from: a */
    final C5929l<T> f37028a;

    /* renamed from: b */
    final long f37029b;

    /* renamed from: e.a.x0.e.b.v0$a */
    /* compiled from: FlowableElementAtSingle */
    static final class C12871a<T> implements C12297q<T>, C12314c {

        /* renamed from: N */
        final T f37030N;

        /* renamed from: O */
        C14063d f37031O;

        /* renamed from: P */
        long f37032P;

        /* renamed from: Q */
        boolean f37033Q;

        /* renamed from: a */
        final C12292n0<? super T> f37034a;

        /* renamed from: b */
        final long f37035b;

        C12871a(C12292n0<? super T> n0Var, long j, T t) {
            this.f37034a = n0Var;
            this.f37035b = j;
            this.f37030N = t;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37031O, dVar)) {
                this.f37031O = dVar;
                this.f37034a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37031O == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f37031O.cancel();
            this.f37031O = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f37031O = C13742j.CANCELLED;
            if (!this.f37033Q) {
                this.f37033Q = true;
                T t = this.f37030N;
                if (t != null) {
                    this.f37034a.onSuccess(t);
                } else {
                    this.f37034a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f37033Q) {
                C12205a.m54894b(th);
                return;
            }
            this.f37033Q = true;
            this.f37031O = C13742j.CANCELLED;
            this.f37034a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37033Q) {
                long j = this.f37032P;
                if (j == this.f37035b) {
                    this.f37033Q = true;
                    this.f37031O.cancel();
                    this.f37031O = C13742j.CANCELLED;
                    this.f37034a.onSuccess(t);
                    return;
                }
                this.f37032P = j + 1;
            }
        }
    }

    public C12870v0(C5929l<T> lVar, long j, T t) {
        this.f37028a = lVar;
        this.f37029b = j;
        this.f37027N = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f37028a.mo24393a((C12297q<? super T>) new C12871a<Object>(n0Var, this.f37029b, this.f37027N));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        C12836t0 t0Var = new C12836t0(this.f37028a, this.f37029b, this.f37027N, true);
        return C12205a.m54871a((C5929l<T>) t0Var);
    }
}
