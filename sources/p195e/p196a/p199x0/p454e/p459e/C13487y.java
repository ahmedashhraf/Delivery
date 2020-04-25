package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.y */
/* compiled from: ObservableConcatWithMaybe */
public final class C13487y<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5941y<? extends T> f39065b;

    /* renamed from: e.a.x0.e.e.y$a */
    /* compiled from: ObservableConcatWithMaybe */
    static final class C13488a<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12321v<T>, C12314c {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: N */
        boolean f39066N;

        /* renamed from: a */
        final C12280i0<? super T> f39067a;

        /* renamed from: b */
        C5941y<? extends T> f39068b;

        C13488a(C12280i0<? super T> i0Var, C5941y<? extends T> yVar) {
            this.f39067a = i0Var;
            this.f39068b = yVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar) && !this.f39066N) {
                this.f39067a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            if (this.f39066N) {
                this.f39067a.onComplete();
                return;
            }
            this.f39066N = true;
            C12347d.m55466a((AtomicReference<C12314c>) this, (C12314c) null);
            C5941y<? extends T> yVar = this.f39068b;
            this.f39068b = null;
            yVar.mo24639a(this);
        }

        public void onError(Throwable th) {
            this.f39067a.onError(th);
        }

        public void onSuccess(T t) {
            this.f39067a.mo33453a(t);
            this.f39067a.onComplete();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f39067a.mo33453a(t);
        }
    }

    public C13487y(C5923b0<T> b0Var, C5941y<? extends T> yVar) {
        super(b0Var);
        this.f39065b = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13488a(i0Var, this.f39065b));
    }
}
