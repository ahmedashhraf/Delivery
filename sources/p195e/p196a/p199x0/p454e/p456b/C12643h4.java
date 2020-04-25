package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.h4 */
/* compiled from: FlowableTakeWhile */
public final class C12643h4<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12342r<? super T> f36208N;

    /* renamed from: e.a.x0.e.b.h4$a */
    /* compiled from: FlowableTakeWhile */
    static final class C12644a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f36209N;

        /* renamed from: O */
        boolean f36210O;

        /* renamed from: a */
        final C14062c<? super T> f36211a;

        /* renamed from: b */
        final C12342r<? super T> f36212b;

        C12644a(C14062c<? super T> cVar, C12342r<? super T> rVar) {
            this.f36211a = cVar;
            this.f36212b = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36209N, dVar)) {
                this.f36209N = dVar;
                this.f36211a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36209N.mo41813c(j);
        }

        public void cancel() {
            this.f36209N.cancel();
        }

        public void onComplete() {
            if (!this.f36210O) {
                this.f36210O = true;
                this.f36211a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36210O) {
                C12205a.m54894b(th);
                return;
            }
            this.f36210O = true;
            this.f36211a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36210O) {
                try {
                    if (!this.f36212b.mo41812b(t)) {
                        this.f36210O = true;
                        this.f36209N.cancel();
                        this.f36211a.onComplete();
                        return;
                    }
                    this.f36211a.mo41789a(t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36209N.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12643h4(C5929l<T> lVar, C12342r<? super T> rVar) {
        super(lVar);
        this.f36208N = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12644a<Object>(cVar, this.f36208N));
    }
}
