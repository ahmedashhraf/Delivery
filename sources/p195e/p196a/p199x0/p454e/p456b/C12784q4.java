package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.q4 */
/* compiled from: FlowableUsing */
public final class C12784q4<T, D> extends C5929l<T> {

    /* renamed from: N */
    final C12339o<? super D, ? extends C6007b<? extends T>> f36697N;

    /* renamed from: O */
    final C12331g<? super D> f36698O;

    /* renamed from: P */
    final boolean f36699P;

    /* renamed from: b */
    final Callable<? extends D> f36700b;

    /* renamed from: e.a.x0.e.b.q4$a */
    /* compiled from: FlowableUsing */
    static final class C12785a<T, D> extends AtomicBoolean implements C12297q<T>, C14063d {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: N */
        final C12331g<? super D> f36701N;

        /* renamed from: O */
        final boolean f36702O;

        /* renamed from: P */
        C14063d f36703P;

        /* renamed from: a */
        final C14062c<? super T> f36704a;

        /* renamed from: b */
        final D f36705b;

        C12785a(C14062c<? super T> cVar, D d, C12331g<? super D> gVar, boolean z) {
            this.f36704a = cVar;
            this.f36705b = d;
            this.f36701N = gVar;
            this.f36702O = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36703P, dVar)) {
                this.f36703P = dVar;
                this.f36704a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36703P.mo41813c(j);
        }

        public void cancel() {
            mo42426a();
            this.f36703P.cancel();
        }

        public void onComplete() {
            if (this.f36702O) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f36701N.mo33410c(this.f36705b);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36704a.onError(th);
                        return;
                    }
                }
                this.f36703P.cancel();
                this.f36704a.onComplete();
            } else {
                this.f36704a.onComplete();
                this.f36703P.cancel();
                mo42426a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36702O) {
                Throwable th2 = null;
                if (compareAndSet(false, true)) {
                    try {
                        this.f36701N.mo33410c(this.f36705b);
                    } catch (Throwable th3) {
                        th2 = th3;
                        C14398a.m62357b(th2);
                    }
                }
                this.f36703P.cancel();
                if (th2 != null) {
                    this.f36704a.onError(new CompositeException(th, th2));
                    return;
                }
                this.f36704a.onError(th);
                return;
            }
            this.f36704a.onError(th);
            this.f36703P.cancel();
            mo42426a();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36704a.mo41789a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42426a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f36701N.mo33410c(this.f36705b);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C12205a.m54894b(th);
                }
            }
        }
    }

    public C12784q4(Callable<? extends D> callable, C12339o<? super D, ? extends C6007b<? extends T>> oVar, C12331g<? super D> gVar, boolean z) {
        this.f36700b = callable;
        this.f36697N = oVar;
        this.f36698O = gVar;
        this.f36699P = z;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            Object call = this.f36700b.call();
            try {
                ((C6007b) C12390b.m55563a(this.f36697N.apply(call), "The sourceSupplier returned a null Publisher")).mo24397a(new C12785a(cVar, call, this.f36698O, this.f36699P));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C13739g.m58655a((Throwable) new CompositeException(th, th), cVar);
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C13739g.m58655a(th2, cVar);
        }
    }
}
