package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C12321v;
import p195e.p196a.C5929l;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p464h.C13730s;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.b0 */
/* compiled from: FlowableConcatWithMaybe */
public final class C12525b0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5941y<? extends T> f35858N;

    /* renamed from: e.a.x0.e.b.b0$a */
    /* compiled from: FlowableConcatWithMaybe */
    static final class C12526a<T> extends C13730s<T, T> implements C12321v<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* renamed from: R */
        final AtomicReference<C12314c> f35859R = new AtomicReference<>();

        /* renamed from: S */
        C5941y<? extends T> f35860S;

        /* renamed from: T */
        boolean f35861T;

        C12526a(C14062c<? super T> cVar, C5941y<? extends T> yVar) {
            super(cVar);
            this.f35860S = yVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this.f35859R, cVar);
        }

        public void cancel() {
            super.cancel();
            C12347d.m55465a(this.f35859R);
        }

        public void onComplete() {
            if (this.f35861T) {
                this.f39761a.onComplete();
                return;
            }
            this.f35861T = true;
            this.f39762b = C13742j.CANCELLED;
            C5941y<? extends T> yVar = this.f35860S;
            this.f35860S = null;
            yVar.mo24639a(this);
        }

        public void onError(Throwable th) {
            this.f39761a.onError(th);
        }

        public void onSuccess(T t) {
            mo43114c(t);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39760O++;
            this.f39761a.mo41789a(t);
        }
    }

    public C12525b0(C5929l<T> lVar, C5941y<? extends T> yVar) {
        super(lVar);
        this.f35858N = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12526a<Object>(cVar, this.f35858N));
    }
}
