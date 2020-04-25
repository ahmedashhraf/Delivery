package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.g4 */
/* compiled from: FlowableTakeUntilPredicate */
public final class C12626g4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12342r<? super T> f36148N;

    /* renamed from: e.a.x0.e.b.g4$a */
    /* compiled from: FlowableTakeUntilPredicate */
    static final class C12627a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f36149N;

        /* renamed from: O */
        boolean f36150O;

        /* renamed from: a */
        final C14062c<? super T> f36151a;

        /* renamed from: b */
        final C12342r<? super T> f36152b;

        C12627a(C14062c<? super T> cVar, C12342r<? super T> rVar) {
            this.f36151a = cVar;
            this.f36152b = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36149N, dVar)) {
                this.f36149N = dVar;
                this.f36151a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36149N.mo41813c(j);
        }

        public void cancel() {
            this.f36149N.cancel();
        }

        public void onComplete() {
            if (!this.f36150O) {
                this.f36150O = true;
                this.f36151a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f36150O) {
                this.f36150O = true;
                this.f36151a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36150O) {
                this.f36151a.mo41789a(t);
                try {
                    if (this.f36152b.mo41812b(t)) {
                        this.f36150O = true;
                        this.f36149N.cancel();
                        this.f36151a.onComplete();
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36149N.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12626g4(C5929l<T> lVar, C12342r<? super T> rVar) {
        super(lVar);
        this.f36148N = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12627a<Object>(cVar, this.f36148N));
    }
}
