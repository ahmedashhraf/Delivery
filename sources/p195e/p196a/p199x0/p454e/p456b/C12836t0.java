package p195e.p196a.p199x0.p454e.p456b;

import java.util.NoSuchElementException;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.t0 */
/* compiled from: FlowableElementAt */
public final class C12836t0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final long f36891N;

    /* renamed from: O */
    final T f36892O;

    /* renamed from: P */
    final boolean f36893P;

    /* renamed from: e.a.x0.e.b.t0$a */
    /* compiled from: FlowableElementAt */
    static final class C12837a<T> extends C13738f<T> implements C12297q<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: V */
        final long f36894V;

        /* renamed from: W */
        final T f36895W;

        /* renamed from: X */
        final boolean f36896X;

        /* renamed from: Y */
        C14063d f36897Y;

        /* renamed from: Z */
        long f36898Z;

        /* renamed from: a0 */
        boolean f36899a0;

        C12837a(C14062c<? super T> cVar, long j, T t, boolean z) {
            super(cVar);
            this.f36894V = j;
            this.f36895W = t;
            this.f36896X = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36897Y, dVar)) {
                this.f36897Y = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36897Y.cancel();
        }

        public void onComplete() {
            if (!this.f36899a0) {
                this.f36899a0 = true;
                T t = this.f36895W;
                if (t != null) {
                    mo43123c(t);
                } else if (this.f36896X) {
                    this.f39781a.onError(new NoSuchElementException());
                } else {
                    this.f39781a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36899a0) {
                C12205a.m54894b(th);
                return;
            }
            this.f36899a0 = true;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36899a0) {
                long j = this.f36898Z;
                if (j == this.f36894V) {
                    this.f36899a0 = true;
                    this.f36897Y.cancel();
                    mo43123c(t);
                    return;
                }
                this.f36898Z = j + 1;
            }
        }
    }

    public C12836t0(C5929l<T> lVar, long j, T t, boolean z) {
        super(lVar);
        this.f36891N = j;
        this.f36892O = t;
        this.f36893P = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12837a aVar = new C12837a(cVar, this.f36891N, this.f36892O, this.f36893P);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
