package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p439b1.C12205a;

/* renamed from: e.a.x0.d.l */
/* compiled from: DeferredScalarDisposable */
public class C12419l<T> extends C12409b<T> {

    /* renamed from: N */
    static final int f35569N = 2;

    /* renamed from: O */
    static final int f35570O = 4;

    /* renamed from: P */
    static final int f35571P = 8;

    /* renamed from: Q */
    static final int f35572Q = 16;

    /* renamed from: R */
    static final int f35573R = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a */
    protected final C12280i0<? super T> f35574a;

    /* renamed from: b */
    protected T f35575b;

    public C12419l(C12280i0<? super T> i0Var) {
        this.f35574a = i0Var;
    }

    /* renamed from: a */
    public final int mo41855a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: b */
    public final void mo42163b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C12280i0<? super T> i0Var = this.f35574a;
            if (i == 8) {
                this.f35575b = t;
                lazySet(16);
                i0Var.mo33453a(null);
            } else {
                lazySet(2);
                i0Var.mo33453a(t);
            }
            if (get() != 4) {
                i0Var.onComplete();
            }
        }
    }

    public final void clear() {
        lazySet(32);
        this.f35575b = null;
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return get() == 4;
    }

    public void dispose() {
        set(4);
        this.f35575b = null;
    }

    /* renamed from: e */
    public final boolean mo42164e() {
        return getAndSet(4) != 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    @C5938g
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f35575b;
        this.f35575b = null;
        lazySet(32);
        return t;
    }

    /* renamed from: a */
    public final void mo42162a(Throwable th) {
        if ((get() & 54) != 0) {
            C12205a.m54894b(th);
            return;
        }
        lazySet(2);
        this.f35574a.onError(th);
    }

    /* renamed from: a */
    public final void mo42161a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f35574a.onComplete();
        }
    }
}
