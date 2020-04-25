package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13789g;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.h.l */
/* compiled from: LambdaSubscriber */
public final class C13723l<T> extends AtomicReference<C14063d> implements C12297q<T>, C14063d, C12314c, C13789g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: N */
    final C12325a f39701N;

    /* renamed from: O */
    final C12331g<? super C14063d> f39702O;

    /* renamed from: a */
    final C12331g<? super T> f39703a;

    /* renamed from: b */
    final C12331g<? super Throwable> f39704b;

    public C13723l(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12331g<? super C14063d> gVar3) {
        this.f39703a = gVar;
        this.f39704b = gVar2;
        this.f39701N = aVar;
        this.f39702O = gVar3;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58680c(this, dVar)) {
            try {
                this.f39702O.mo33410c(this);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        ((C14063d) get()).mo41813c(j);
    }

    public void cancel() {
        C13742j.m58674a((AtomicReference<C14063d>) this);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == C13742j.CANCELLED;
    }

    public void dispose() {
        cancel();
    }

    public void onComplete() {
        Object obj = get();
        C13742j jVar = C13742j.CANCELLED;
        if (obj != jVar) {
            lazySet(jVar);
            try {
                this.f39701N.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        C13742j jVar = C13742j.CANCELLED;
        if (obj != jVar) {
            lazySet(jVar);
            try {
                this.f39704b.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C12205a.m54894b((Throwable) new CompositeException(th, th2));
            }
        } else {
            C12205a.m54894b(th);
        }
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!mo41878d()) {
            try {
                this.f39703a.mo33410c(t);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                ((C14063d) get()).cancel();
                onError(th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo42160a() {
        return this.f39704b != C12351a.f35506f;
    }
}
