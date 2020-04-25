package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12297q;
import p195e.p196a.C5923b0;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.e.g1 */
/* compiled from: ObservableFromPublisher */
public final class C13220g1<T> extends C5923b0<T> {

    /* renamed from: a */
    final C6007b<? extends T> f38154a;

    /* renamed from: e.a.x0.e.e.g1$a */
    /* compiled from: ObservableFromPublisher */
    static final class C13221a<T> implements C12297q<T>, C12314c {

        /* renamed from: a */
        final C12280i0<? super T> f38155a;

        /* renamed from: b */
        C14063d f38156b;

        C13221a(C12280i0<? super T> i0Var) {
            this.f38155a = i0Var;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f38155a.mo33453a(t);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38156b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f38156b.cancel();
            this.f38156b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f38155a.onComplete();
        }

        public void onError(Throwable th) {
            this.f38155a.onError(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f38156b, dVar)) {
                this.f38156b = dVar;
                this.f38155a.mo34123a((C12314c) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }
    }

    public C13220g1(C6007b<? extends T> bVar) {
        this.f38154a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f38154a.mo24397a(new C13221a(i0Var));
    }
}
