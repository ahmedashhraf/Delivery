package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.w3 */
/* compiled from: FlowableSkipWhile */
public final class C12898w3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12342r<? super T> f37146N;

    /* renamed from: e.a.x0.e.b.w3$a */
    /* compiled from: FlowableSkipWhile */
    static final class C12899a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f37147N;

        /* renamed from: O */
        boolean f37148O;

        /* renamed from: a */
        final C14062c<? super T> f37149a;

        /* renamed from: b */
        final C12342r<? super T> f37150b;

        C12899a(C14062c<? super T> cVar, C12342r<? super T> rVar) {
            this.f37149a = cVar;
            this.f37150b = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37147N, dVar)) {
                this.f37147N = dVar;
                this.f37149a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f37147N.mo41813c(j);
        }

        public void cancel() {
            this.f37147N.cancel();
        }

        public void onComplete() {
            this.f37149a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37149a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f37148O) {
                this.f37149a.mo41789a(t);
            } else {
                try {
                    if (this.f37150b.mo41812b(t)) {
                        this.f37147N.mo41813c(1);
                    } else {
                        this.f37148O = true;
                        this.f37149a.mo41789a(t);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f37147N.cancel();
                    this.f37149a.onError(th);
                }
            }
        }
    }

    public C12898w3(C5929l<T> lVar, C12342r<? super T> rVar) {
        super(lVar);
        this.f37146N = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12899a<Object>(cVar, this.f37146N));
    }
}
