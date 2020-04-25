package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12268f;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.d.a0 */
/* compiled from: SubscriberCompletableObserver */
public final class C12408a0<T> implements C12268f, C14063d {

    /* renamed from: a */
    final C14062c<? super T> f35552a;

    /* renamed from: b */
    C12314c f35553b;

    public C12408a0(C14062c<? super T> cVar) {
        this.f35552a = cVar;
    }

    /* renamed from: a */
    public void mo41921a(C12314c cVar) {
        if (C12347d.m55464a(this.f35553b, cVar)) {
            this.f35553b = cVar;
            this.f35552a.mo41788a((C14063d) this);
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
    }

    public void cancel() {
        this.f35553b.dispose();
    }

    public void onComplete() {
        this.f35552a.onComplete();
    }

    public void onError(Throwable th) {
        this.f35552a.onError(th);
    }
}
