package p195e.p196a.p467z0;

import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.z0.l */
/* compiled from: SafeObserver */
public final class C13794l<T> implements C12280i0<T>, C12314c {

    /* renamed from: N */
    boolean f39845N;

    /* renamed from: a */
    final C12280i0<? super T> f39846a;

    /* renamed from: b */
    C12314c f39847b;

    public C13794l(@C5937f C12280i0<? super T> i0Var) {
        this.f39846a = i0Var;
    }

    /* renamed from: a */
    public void mo34123a(@C5937f C12314c cVar) {
        if (C12347d.m55464a(this.f39847b, cVar)) {
            this.f39847b = cVar;
            try {
                this.f39846a.mo34123a((C12314c) this);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b((Throwable) new CompositeException(th, th));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43263b() {
        this.f39845N = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f39846a.mo34123a((C12314c) C12348e.INSTANCE);
            try {
                this.f39846a.onError(nullPointerException);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th2));
        }
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39847b.mo41878d();
    }

    public void dispose() {
        this.f39847b.dispose();
    }

    public void onComplete() {
        if (!this.f39845N) {
            this.f39845N = true;
            if (this.f39847b == null) {
                mo43262a();
                return;
            }
            try {
                this.f39846a.onComplete();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(@C5937f Throwable th) {
        if (this.f39845N) {
            C12205a.m54894b(th);
            return;
        }
        this.f39845N = true;
        if (this.f39847b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f39846a.mo34123a((C12314c) C12348e.INSTANCE);
                try {
                    this.f39846a.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    C12205a.m54894b((Throwable) new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C12205a.m54894b((Throwable) new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f39846a.onError(th);
            } catch (Throwable th4) {
                C14398a.m62357b(th4);
                C12205a.m54894b((Throwable) new CompositeException(th, th4));
            }
        }
    }

    /* renamed from: a */
    public void mo33453a(@C5937f T t) {
        if (!this.f39845N) {
            if (this.f39847b == null) {
                mo43263b();
            } else if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f39847b.dispose();
                    onError(nullPointerException);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    onError(new CompositeException(nullPointerException, th));
                }
            } else {
                try {
                    this.f39846a.mo33453a(t);
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    onError(new CompositeException(th, th2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43262a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f39846a.mo34123a((C12314c) C12348e.INSTANCE);
            try {
                this.f39846a.onError(nullPointerException);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th2));
        }
    }
}
