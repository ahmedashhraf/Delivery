package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.f */
/* compiled from: FlowableAll */
public final class C12590f<T> extends C12511a<T, Boolean> {

    /* renamed from: N */
    final C12342r<? super T> f36045N;

    /* renamed from: e.a.x0.e.b.f$a */
    /* compiled from: FlowableAll */
    static final class C12591a<T> extends C13738f<Boolean> implements C12297q<T> {
        private static final long serialVersionUID = -3521127104134758517L;

        /* renamed from: V */
        final C12342r<? super T> f36046V;

        /* renamed from: W */
        C14063d f36047W;

        /* renamed from: X */
        boolean f36048X;

        C12591a(C14062c<? super Boolean> cVar, C12342r<? super T> rVar) {
            super(cVar);
            this.f36046V = rVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36047W, dVar)) {
                this.f36047W = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36047W.cancel();
        }

        public void onComplete() {
            if (!this.f36048X) {
                this.f36048X = true;
                mo43123c(Boolean.valueOf(true));
            }
        }

        public void onError(Throwable th) {
            if (this.f36048X) {
                C12205a.m54894b(th);
                return;
            }
            this.f36048X = true;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36048X) {
                try {
                    if (!this.f36046V.mo41812b(t)) {
                        this.f36048X = true;
                        this.f36047W.cancel();
                        mo43123c(Boolean.valueOf(false));
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f36047W.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12590f(C5929l<T> lVar, C12342r<? super T> rVar) {
        super(lVar);
        this.f36045N = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super Boolean> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12591a<Object>(cVar, this.f36045N));
    }
}
