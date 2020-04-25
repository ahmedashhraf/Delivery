package p195e.p196a.p199x0.p464h;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.f */
/* compiled from: BlockingSubscriber */
public final class C13717f<T> extends AtomicReference<C14063d> implements C12297q<T>, C14063d {

    /* renamed from: b */
    public static final Object f39683b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* renamed from: a */
    final Queue<Object> f39684a;

    public C13717f(Queue<Object> queue) {
        this.f39684a = queue;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58680c(this, dVar)) {
            this.f39684a.offer(C13761q.m58742a((C14063d) this));
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        ((C14063d) get()).mo41813c(j);
    }

    public void cancel() {
        if (C13742j.m58674a((AtomicReference<C14063d>) this)) {
            this.f39684a.offer(f39683b);
        }
    }

    public void onComplete() {
        this.f39684a.offer(C13761q.m58750d());
    }

    public void onError(Throwable th) {
        this.f39684a.offer(C13761q.m58743a(th));
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        this.f39684a.offer(C13761q.m58756i(t));
    }

    /* renamed from: a */
    public boolean mo43093a() {
        return get() == C13742j.CANCELLED;
    }
}
