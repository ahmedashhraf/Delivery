package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.v2 */
/* compiled from: FlowableReduce */
public final class C12874v2<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12327c<T, T, T> f37058N;

    /* renamed from: e.a.x0.e.b.v2$a */
    /* compiled from: FlowableReduce */
    static final class C12875a<T> extends C13738f<T> implements C12297q<T> {
        private static final long serialVersionUID = -4663883003264602070L;

        /* renamed from: V */
        final C12327c<T, T, T> f37059V;

        /* renamed from: W */
        C14063d f37060W;

        C12875a(C14062c<? super T> cVar, C12327c<T, T, T> cVar2) {
            super(cVar);
            this.f37059V = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37060W, dVar)) {
                this.f37060W = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f37060W.cancel();
            this.f37060W = C13742j.CANCELLED;
        }

        public void onComplete() {
            C14063d dVar = this.f37060W;
            C13742j jVar = C13742j.CANCELLED;
            if (dVar != jVar) {
                this.f37060W = jVar;
                T t = this.f39782b;
                if (t != null) {
                    mo43123c(t);
                } else {
                    this.f39781a.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            C14063d dVar = this.f37060W;
            C13742j jVar = C13742j.CANCELLED;
            if (dVar == jVar) {
                C12205a.m54894b(th);
                return;
            }
            this.f37060W = jVar;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f37060W != C13742j.CANCELLED) {
                T t2 = this.f39782b;
                if (t2 == null) {
                    this.f39782b = t;
                } else {
                    try {
                        this.f39782b = C12390b.m55563a(this.f37059V.mo35569a(t2, t), "The reducer returned a null value");
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f37060W.cancel();
                        onError(th);
                    }
                }
            }
        }
    }

    public C12874v2(C5929l<T> lVar, C12327c<T, T, T> cVar) {
        super(lVar);
        this.f37058N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12875a<Object>(cVar, this.f37058N));
    }
}
