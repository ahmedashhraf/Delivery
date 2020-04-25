package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.Callable;
import p195e.p196a.C12268f;
import p195e.p196a.C12292n0;
import p195e.p196a.C5927i;
import p195e.p196a.C5928k0;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.n0 */
/* compiled from: CompletableToSingle */
public final class C12488n0<T> extends C5928k0<T> {

    /* renamed from: N */
    final T f35770N;

    /* renamed from: a */
    final C5927i f35771a;

    /* renamed from: b */
    final Callable<? extends T> f35772b;

    /* renamed from: e.a.x0.e.a.n0$a */
    /* compiled from: CompletableToSingle */
    final class C12489a implements C12268f {

        /* renamed from: a */
        private final C12292n0<? super T> f35773a;

        C12489a(C12292n0<? super T> n0Var) {
            this.f35773a = n0Var;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35773a.mo41974a(cVar);
        }

        public void onComplete() {
            T t;
            C12488n0 n0Var = C12488n0.this;
            Callable<? extends T> callable = n0Var.f35772b;
            if (callable != null) {
                try {
                    t = callable.call();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f35773a.onError(th);
                    return;
                }
            } else {
                t = n0Var.f35770N;
            }
            if (t == null) {
                this.f35773a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f35773a.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f35773a.onError(th);
        }
    }

    public C12488n0(C5927i iVar, Callable<? extends T> callable, T t) {
        this.f35771a = iVar;
        this.f35770N = t;
        this.f35772b = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        this.f35771a.mo24122a(new C12489a(n0Var));
    }
}
