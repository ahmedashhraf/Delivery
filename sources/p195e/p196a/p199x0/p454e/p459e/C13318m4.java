package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.m4 */
/* compiled from: ObserverResourceWrapper */
public final class C13318m4<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {
    private static final long serialVersionUID = -8612022020200669122L;

    /* renamed from: a */
    final C12280i0<? super T> f38500a;

    /* renamed from: b */
    final AtomicReference<C12314c> f38501b = new AtomicReference<>();

    public C13318m4(C12280i0<? super T> i0Var) {
        this.f38500a = i0Var;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (C12347d.m55468c(this.f38501b, cVar)) {
            this.f38500a.mo34123a((C12314c) this);
        }
    }

    /* renamed from: b */
    public void mo42808b(C12314c cVar) {
        C12347d.m55467b(this, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f38501b.get() == C12347d.DISPOSED;
    }

    public void dispose() {
        C12347d.m55465a(this.f38501b);
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        dispose();
        this.f38500a.onComplete();
    }

    public void onError(Throwable th) {
        dispose();
        this.f38500a.onError(th);
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        this.f38500a.mo33453a(t);
    }
}
