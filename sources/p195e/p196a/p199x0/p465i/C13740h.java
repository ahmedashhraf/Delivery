package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12403l;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.i.h */
/* compiled from: ScalarSubscription */
public final class C13740h<T> extends AtomicInteger implements C12403l<T> {

    /* renamed from: N */
    static final int f39783N = 0;

    /* renamed from: O */
    static final int f39784O = 1;

    /* renamed from: P */
    static final int f39785P = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: a */
    final T f39786a;

    /* renamed from: b */
    final C14062c<? super T> f39787b;

    public C13740h(C14062c<? super T> cVar, T t) {
        this.f39787b = cVar;
        this.f39786a = t;
    }

    /* renamed from: a */
    public int mo41855a(int i) {
        return i & 1;
    }

    /* renamed from: a */
    public boolean mo43127a() {
        return get() == 2;
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        if (C13742j.m58678b(j) && compareAndSet(0, 1)) {
            C14062c<? super T> cVar = this.f39787b;
            cVar.mo41789a(this.f39786a);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @C5938g
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f39786a;
    }

    /* renamed from: a */
    public boolean mo42104a(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
