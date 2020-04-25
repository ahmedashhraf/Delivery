package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.k3 */
/* compiled from: ObservableSubscribeOn */
public final class C13290k3<T> extends C13131a<T, T> {

    /* renamed from: b */
    final C12282j0 f38409b;

    /* renamed from: e.a.x0.e.e.k3$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C13291a<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C12280i0<? super T> f38410a;

        /* renamed from: b */
        final AtomicReference<C12314c> f38411b = new AtomicReference<>();

        C13291a(C12280i0<? super T> i0Var) {
            this.f38410a = i0Var;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38411b, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42793b(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) get());
        }

        public void dispose() {
            C12347d.m55465a(this.f38411b);
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f38410a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38410a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38410a.mo33453a(t);
        }
    }

    /* renamed from: e.a.x0.e.e.k3$b */
    /* compiled from: ObservableSubscribeOn */
    final class C13292b implements Runnable {

        /* renamed from: a */
        private final C13291a<T> f38412a;

        C13292b(C13291a<T> aVar) {
            this.f38412a = aVar;
        }

        public void run() {
            C13290k3.this.f37851a.mo23893a(this.f38412a);
        }
    }

    public C13290k3(C5926g0<T> g0Var, C12282j0 j0Var) {
        super(g0Var);
        this.f38409b = j0Var;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13291a aVar = new C13291a(i0Var);
        i0Var.mo34123a((C12314c) aVar);
        aVar.mo42793b(this.f38409b.mo42021a((Runnable) new C13292b(aVar)));
    }
}
