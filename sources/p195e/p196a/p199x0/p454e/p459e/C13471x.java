package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.x */
/* compiled from: ObservableConcatWithCompletable */
public final class C13471x<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C5927i f39013b;

    /* renamed from: e.a.x0.e.e.x$a */
    /* compiled from: ObservableConcatWithCompletable */
    static final class C13472a<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12268f, C12314c {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: N */
        boolean f39014N;

        /* renamed from: a */
        final C12280i0<? super T> f39015a;

        /* renamed from: b */
        C5927i f39016b;

        C13472a(C12280i0<? super T> i0Var, C5927i iVar) {
            this.f39015a = i0Var;
            this.f39016b = iVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar) && !this.f39014N) {
                this.f39015a.mo34123a((C12314c) this);
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
            if (this.f39014N) {
                this.f39015a.onComplete();
                return;
            }
            this.f39014N = true;
            C12347d.m55466a((AtomicReference<C12314c>) this, (C12314c) null);
            C5927i iVar = this.f39016b;
            this.f39016b = null;
            iVar.mo24122a(this);
        }

        public void onError(Throwable th) {
            this.f39015a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f39015a.mo33453a(t);
        }
    }

    public C13471x(C5923b0<T> b0Var, C5927i iVar) {
        super(b0Var);
        this.f39013b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f37851a.mo23893a(new C13472a(i0Var, this.f39013b));
    }
}
