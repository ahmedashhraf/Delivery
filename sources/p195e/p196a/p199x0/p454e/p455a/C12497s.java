package p195e.p196a.p199x0.p454e.p455a;

import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5925c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.a.s */
/* compiled from: CompletableFromPublisher */
public final class C12497s<T> extends C5925c {

    /* renamed from: a */
    final C6007b<T> f35788a;

    /* renamed from: e.a.x0.e.a.s$a */
    /* compiled from: CompletableFromPublisher */
    static final class C12498a<T> implements C12297q<T>, C12314c {

        /* renamed from: a */
        final C12268f f35789a;

        /* renamed from: b */
        C14063d f35790b;

        C12498a(C12268f fVar) {
            this.f35789a = fVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35790b, dVar)) {
                this.f35790b = dVar;
                this.f35789a.mo41921a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35790b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f35790b.cancel();
            this.f35790b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f35789a.onComplete();
        }

        public void onError(Throwable th) {
            this.f35789a.onError(th);
        }
    }

    public C12497s(C6007b<T> bVar) {
        this.f35788a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        this.f35788a.mo24397a(new C12498a(fVar));
    }
}
