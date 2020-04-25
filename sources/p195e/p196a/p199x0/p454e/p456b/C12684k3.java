package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.k3 */
/* compiled from: FlowableScan */
public final class C12684k3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12327c<T, T, T> f36330N;

    /* renamed from: e.a.x0.e.b.k3$a */
    /* compiled from: FlowableScan */
    static final class C12685a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f36331N;

        /* renamed from: O */
        T f36332O;

        /* renamed from: P */
        boolean f36333P;

        /* renamed from: a */
        final C14062c<? super T> f36334a;

        /* renamed from: b */
        final C12327c<T, T, T> f36335b;

        C12685a(C14062c<? super T> cVar, C12327c<T, T, T> cVar2) {
            this.f36334a = cVar;
            this.f36335b = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36331N, dVar)) {
                this.f36331N = dVar;
                this.f36334a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f36331N.mo41813c(j);
        }

        public void cancel() {
            this.f36331N.cancel();
        }

        public void onComplete() {
            if (!this.f36333P) {
                this.f36333P = true;
                this.f36334a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36333P) {
                C12205a.m54894b(th);
                return;
            }
            this.f36333P = true;
            this.f36334a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36333P) {
                C14062c<? super T> cVar = this.f36334a;
                T t2 = this.f36332O;
                if (t2 == null) {
                    this.f36332O = t;
                    cVar.mo41789a(t);
                } else {
                    try {
                        T a = C12390b.m55563a(this.f36335b.mo35569a(t2, t), "The value returned by the accumulator is null");
                        this.f36332O = a;
                        cVar.mo41789a(a);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        this.f36331N.cancel();
                        onError(th);
                    }
                }
            }
        }
    }

    public C12684k3(C5929l<T> lVar, C12327c<T, T, T> cVar) {
        super(lVar);
        this.f36330N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12685a<Object>(cVar, this.f36330N));
    }
}
