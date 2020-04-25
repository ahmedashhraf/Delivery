package p195e.p196a.p199x0.p453d;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.i */
/* compiled from: BlockingObserver */
public final class C12416i<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {

    /* renamed from: b */
    public static final Object f35563b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* renamed from: a */
    final Queue<Object> f35564a;

    public C12416i(Queue<Object> queue) {
        this.f35564a = queue;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        C12347d.m55468c(this, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C12347d.DISPOSED;
    }

    public void dispose() {
        if (C12347d.m55465a((AtomicReference<C12314c>) this)) {
            this.f35564a.offer(f35563b);
        }
    }

    public void onComplete() {
        this.f35564a.offer(C13761q.m58750d());
    }

    public void onError(Throwable th) {
        this.f35564a.offer(C13761q.m58743a(th));
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        this.f35564a.offer(C13761q.m58756i(t));
    }
}
