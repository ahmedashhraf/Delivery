package p195e.p196a.p443f1;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.f1.d */
/* compiled from: SafeSubscriber */
public final class C12273d<T> implements C12297q<T>, C14063d {

    /* renamed from: N */
    boolean f35453N;

    /* renamed from: a */
    final C14062c<? super T> f35454a;

    /* renamed from: b */
    C14063d f35455b;

    public C12273d(C14062c<? super T> cVar) {
        this.f35454a = cVar;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f35455b, dVar)) {
            this.f35455b = dVar;
            try {
                this.f35454a.mo41788a((C14063d) this);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b((Throwable) new CompositeException(th, th));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo42003b() {
        this.f35453N = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f35454a.mo41788a((C14063d) C13739g.INSTANCE);
            try {
                this.f35454a.onError(nullPointerException);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(nullPointerException, th2));
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        try {
            this.f35455b.mo41813c(j);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b((Throwable) new CompositeException(th, th));
        }
    }

    public void cancel() {
        try {
            this.f35455b.cancel();
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
        }
    }

    public void onComplete() {
        if (!this.f35453N) {
            this.f35453N = true;
            if (this.f35455b == null) {
                mo42002a();
                return;
            }
            try {
                this.f35454a.onComplete();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f35453N) {
            C12205a.m54894b(th);
            return;
        }
        this.f35453N = true;
        if (this.f35455b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f35454a.mo41788a((C14063d) C13739g.INSTANCE);
                try {
                    this.f35454a.onError(new CompositeException(th, nullPointerException));
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
                this.f35454a.onError(th);
            } catch (Throwable th4) {
                C14398a.m62357b(th4);
                C12205a.m54894b((Throwable) new CompositeException(th, th4));
            }
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!this.f35453N) {
            if (this.f35455b == null) {
                mo42003b();
            } else if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f35455b.cancel();
                    onError(nullPointerException);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    onError(new CompositeException(nullPointerException, th));
                }
            } else {
                try {
                    this.f35454a.mo41789a(t);
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    onError(new CompositeException(th, th2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42002a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f35454a.mo41788a((C14063d) C13739g.INSTANCE);
            try {
                this.f35454a.onError(nullPointerException);
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
