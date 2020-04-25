package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12341q;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.s0 */
/* compiled from: FlowableDoOnLifecycle */
public final class C12806s0<T> extends C12511a<T, T> {

    /* renamed from: N */
    private final C12331g<? super C14063d> f36806N;

    /* renamed from: O */
    private final C12341q f36807O;

    /* renamed from: P */
    private final C12325a f36808P;

    /* renamed from: e.a.x0.e.b.s0$a */
    /* compiled from: FlowableDoOnLifecycle */
    static final class C12807a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        final C12341q f36809N;

        /* renamed from: O */
        final C12325a f36810O;

        /* renamed from: P */
        C14063d f36811P;

        /* renamed from: a */
        final C14062c<? super T> f36812a;

        /* renamed from: b */
        final C12331g<? super C14063d> f36813b;

        C12807a(C14062c<? super T> cVar, C12331g<? super C14063d> gVar, C12341q qVar, C12325a aVar) {
            this.f36812a = cVar;
            this.f36813b = gVar;
            this.f36810O = aVar;
            this.f36809N = qVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            try {
                this.f36813b.mo33410c(dVar);
                if (C13742j.m58673a(this.f36811P, dVar)) {
                    this.f36811P = dVar;
                    this.f36812a.mo41788a((C14063d) this);
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                dVar.cancel();
                this.f36811P = C13742j.CANCELLED;
                C13739g.m58655a(th, this.f36812a);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            try {
                this.f36809N.mo42100a(j);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f36811P.mo41813c(j);
        }

        public void cancel() {
            try {
                this.f36810O.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f36811P.cancel();
        }

        public void onComplete() {
            if (this.f36811P != C13742j.CANCELLED) {
                this.f36812a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36811P != C13742j.CANCELLED) {
                this.f36812a.onError(th);
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36812a.mo41789a(t);
        }
    }

    public C12806s0(C5929l<T> lVar, C12331g<? super C14063d> gVar, C12341q qVar, C12325a aVar) {
        super(lVar);
        this.f36806N = gVar;
        this.f36807O = qVar;
        this.f36808P = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12807a<Object>(cVar, this.f36806N, this.f36807O, this.f36808P));
    }
}
