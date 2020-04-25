package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.u */
/* compiled from: SubscriberResourceWrapper */
public final class C13732u<T> extends AtomicReference<C12314c> implements C12297q<T>, C12314c, C14063d {
    private static final long serialVersionUID = -8612022020200669122L;

    /* renamed from: a */
    final C14062c<? super T> f39769a;

    /* renamed from: b */
    final AtomicReference<C14063d> f39770b = new AtomicReference<>();

    public C13732u(C14062c<? super T> cVar) {
        this.f39769a = cVar;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58680c(this.f39770b, dVar)) {
            this.f39769a.mo41788a((C14063d) this);
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        if (C13742j.m58678b(j)) {
            ((C14063d) this.f39770b.get()).mo41813c(j);
        }
    }

    public void cancel() {
        dispose();
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39770b.get() == C13742j.CANCELLED;
    }

    public void dispose() {
        C13742j.m58674a(this.f39770b);
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public void onComplete() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
        this.f39769a.onComplete();
    }

    public void onError(Throwable th) {
        C12347d.m55465a((AtomicReference<C12314c>) this);
        this.f39769a.onError(th);
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        this.f39769a.mo41789a(t);
    }

    /* renamed from: a */
    public void mo43115a(C12314c cVar) {
        C12347d.m55467b(this, cVar);
    }
}
