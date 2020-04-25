package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.k0 */
/* compiled from: FlowableDelaySubscriptionOther */
public final class C12676k0<T, U> extends C5929l<T> {

    /* renamed from: N */
    final C6007b<U> f36304N;

    /* renamed from: b */
    final C6007b<? extends T> f36305b;

    /* renamed from: e.a.x0.e.b.k0$a */
    /* compiled from: FlowableDelaySubscriptionOther */
    final class C12677a implements C12297q<U> {

        /* renamed from: N */
        boolean f36306N;

        /* renamed from: a */
        final C13741i f36308a;

        /* renamed from: b */
        final C14062c<? super T> f36309b;

        /* renamed from: e.a.x0.e.b.k0$a$a */
        /* compiled from: FlowableDelaySubscriptionOther */
        final class C12678a implements C14063d {

            /* renamed from: a */
            private final C14063d f36310a;

            C12678a(C14063d dVar) {
                this.f36310a = dVar;
            }

            /* renamed from: c */
            public void mo41813c(long j) {
            }

            public void cancel() {
                this.f36310a.cancel();
            }
        }

        /* renamed from: e.a.x0.e.b.k0$a$b */
        /* compiled from: FlowableDelaySubscriptionOther */
        final class C12679b implements C12297q<T> {
            C12679b() {
            }

            /* renamed from: a */
            public void mo41788a(C14063d dVar) {
                C12677a.this.f36308a.mo43130b(dVar);
            }

            public void onComplete() {
                C12677a.this.f36309b.onComplete();
            }

            public void onError(Throwable th) {
                C12677a.this.f36309b.onError(th);
            }

            /* renamed from: a */
            public void mo41789a(T t) {
                C12677a.this.f36309b.mo41789a(t);
            }
        }

        C12677a(C13741i iVar, C14062c<? super T> cVar) {
            this.f36308a = iVar;
            this.f36309b = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f36308a.mo43130b((C14063d) new C12678a(dVar));
            dVar.mo41813c(Long.MAX_VALUE);
        }

        public void onComplete() {
            if (!this.f36306N) {
                this.f36306N = true;
                C12676k0.this.f36305b.mo24397a(new C12679b());
            }
        }

        public void onError(Throwable th) {
            if (this.f36306N) {
                C12205a.m54894b(th);
                return;
            }
            this.f36306N = true;
            this.f36309b.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(U u) {
            onComplete();
        }
    }

    public C12676k0(C6007b<? extends T> bVar, C6007b<U> bVar2) {
        this.f36305b = bVar;
        this.f36304N = bVar2;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13741i iVar = new C13741i();
        cVar.mo41788a((C14063d) iVar);
        this.f36304N.mo24397a(new C12677a(iVar, cVar));
    }
}
