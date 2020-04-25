package p195e.p196a.p199x0.p465i;

import p195e.p196a.p198t0.C5938g;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.i.f */
/* compiled from: DeferredScalarSubscription */
public class C13738f<T> extends C13735c<T> {

    /* renamed from: N */
    static final int f39773N = 0;

    /* renamed from: O */
    static final int f39774O = 1;

    /* renamed from: P */
    static final int f39775P = 2;

    /* renamed from: Q */
    static final int f39776Q = 3;

    /* renamed from: R */
    static final int f39777R = 4;

    /* renamed from: S */
    static final int f39778S = 8;

    /* renamed from: T */
    static final int f39779T = 16;

    /* renamed from: U */
    static final int f39780U = 32;
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: a */
    protected final C14062c<? super T> f39781a;

    /* renamed from: b */
    protected T f39782b;

    public C13738f(C14062c<? super T> cVar) {
        this.f39781a = cVar;
    }

    /* renamed from: a */
    public final int mo41855a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: c */
    public final void mo41813c(long j) {
        if (C13742j.m58678b(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.f39782b;
                            if (t != null) {
                                this.f39782b = null;
                                C14062c<? super T> cVar = this.f39781a;
                                cVar.mo41789a(t);
                                if (get() != 4) {
                                    cVar.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void cancel() {
        set(4);
        this.f39782b = null;
    }

    public final void clear() {
        lazySet(32);
        this.f39782b = null;
    }

    /* renamed from: d */
    public final boolean mo43124d() {
        return get() == 4;
    }

    /* renamed from: e */
    public final boolean mo43125e() {
        return getAndSet(4) != 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    @C5938g
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f39782b;
        this.f39782b = null;
        return t;
    }

    /* renamed from: c */
    public final void mo43123c(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C14062c<? super T> cVar = this.f39781a;
                    cVar.mo41789a(t);
                    if (get() != 4) {
                        cVar.onComplete();
                    }
                    return;
                }
                this.f39782b = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f39782b = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f39782b = t;
        lazySet(16);
        C14062c<? super T> cVar2 = this.f39781a;
        cVar2.mo41789a(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
