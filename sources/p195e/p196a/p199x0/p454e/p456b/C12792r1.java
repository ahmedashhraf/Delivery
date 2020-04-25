package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.r1 */
/* compiled from: FlowableIgnoreElementsCompletable */
public final class C12792r1<T> extends C5925c implements C12393b<T> {

    /* renamed from: a */
    final C5929l<T> f36735a;

    /* renamed from: e.a.x0.e.b.r1$a */
    /* compiled from: FlowableIgnoreElementsCompletable */
    static final class C12793a<T> implements C12297q<T>, C12314c {

        /* renamed from: a */
        final C12268f f36736a;

        /* renamed from: b */
        C14063d f36737b;

        C12793a(C12268f fVar) {
            this.f36736a = fVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36737b, dVar)) {
                this.f36737b = dVar;
                this.f36736a.mo41921a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36737b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36737b.cancel();
            this.f36737b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f36737b = C13742j.CANCELLED;
            this.f36736a.onComplete();
        }

        public void onError(Throwable th) {
            this.f36737b = C13742j.CANCELLED;
            this.f36736a.onError(th);
        }
    }

    public C12792r1(C5929l<T> lVar) {
        this.f36735a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f36735a.mo24393a((C12297q<? super T>) new C12793a<Object>(fVar));
    }

    /* renamed from: b */
    public C5929l<T> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12778q1<T>(this.f36735a));
    }
}
