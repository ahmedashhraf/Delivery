package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p464h.C13730s;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.c0 */
/* compiled from: FlowableConcatWithSingle */
public final class C12539c0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5930q0<? extends T> f35896N;

    /* renamed from: e.a.x0.e.b.c0$a */
    /* compiled from: FlowableConcatWithSingle */
    static final class C12540a<T> extends C13730s<T, T> implements C12292n0<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* renamed from: R */
        final AtomicReference<C12314c> f35897R = new AtomicReference<>();

        /* renamed from: S */
        C5930q0<? extends T> f35898S;

        C12540a(C14062c<? super T> cVar, C5930q0<? extends T> q0Var) {
            super(cVar);
            this.f35898S = q0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55468c(this.f35897R, cVar);
        }

        public void cancel() {
            super.cancel();
            C12347d.m55465a(this.f35897R);
        }

        public void onComplete() {
            this.f39762b = C13742j.CANCELLED;
            C5930q0<? extends T> q0Var = this.f35898S;
            this.f35898S = null;
            q0Var.mo24192a(this);
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

    public C12539c0(C5929l<T> lVar, C5930q0<? extends T> q0Var) {
        super(lVar);
        this.f35896N = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12540a<Object>(cVar, this.f35896N));
    }
}
