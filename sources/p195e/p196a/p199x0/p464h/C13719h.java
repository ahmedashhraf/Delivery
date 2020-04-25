package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.h.h */
/* compiled from: ForEachWhileSubscriber */
public final class C13719h<T> extends AtomicReference<C14063d> implements C12297q<T>, C12314c {
    private static final long serialVersionUID = -4403180040475402120L;

    /* renamed from: N */
    final C12325a f39687N;

    /* renamed from: O */
    boolean f39688O;

    /* renamed from: a */
    final C12342r<? super T> f39689a;

    /* renamed from: b */
    final C12331g<? super Throwable> f39690b;

    public C13719h(C12342r<? super T> rVar, C12331g<? super Throwable> gVar, C12325a aVar) {
        this.f39689a = rVar;
        this.f39690b = gVar;
        this.f39687N = aVar;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return C13742j.m58672a((C14063d) get());
    }

    public void dispose() {
        C13742j.m58674a((AtomicReference<C14063d>) this);
    }

    public void onComplete() {
        if (!this.f39688O) {
            this.f39688O = true;
            try {
                this.f39687N.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f39688O) {
            C12205a.m54894b(th);
            return;
        }
        this.f39688O = true;
        try {
            this.f39690b.mo33410c(th);
        } catch (Throwable th2) {
            C14398a.m62357b(th2);
            C12205a.m54894b((Throwable) new CompositeException(th, th2));
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!this.f39688O) {
            try {
                if (!this.f39689a.mo41812b(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dispose();
                onError(th);
            }
        }
    }
}
