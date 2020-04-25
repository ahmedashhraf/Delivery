package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p464h.C13712a;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.y0 */
/* compiled from: FlowableFilter */
public final class C12918y0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12342r<? super T> f37218N;

    /* renamed from: e.a.x0.e.b.y0$a */
    /* compiled from: FlowableFilter */
    static final class C12919a<T> extends C13712a<T, T> {

        /* renamed from: Q */
        final C12342r<? super T> f37219Q;

        C12919a(C12392a<? super T> aVar, C12342r<? super T> rVar) {
            super(aVar);
            this.f37219Q = rVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t)) {
                this.f39673b.mo41813c(1);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (this.f39670O) {
                return false;
            }
            if (this.f39671P != 0) {
                return this.f39672a.mo42138b(null);
            }
            boolean z = true;
            try {
                if (!this.f37219Q.mo41812b(t) || !this.f39672a.mo42138b(t)) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                mo43085a(th);
                return true;
            }
        }

        @C5938g
        public T poll() throws Exception {
            C12403l<T> lVar = this.f39669N;
            C12342r<? super T> rVar = this.f37219Q;
            while (true) {
                T poll = lVar.poll();
                if (poll == null) {
                    return null;
                }
                if (rVar.mo41812b(poll)) {
                    return poll;
                }
                if (this.f39671P == 2) {
                    lVar.mo41813c(1);
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43086b(i);
        }
    }

    /* renamed from: e.a.x0.e.b.y0$b */
    /* compiled from: FlowableFilter */
    static final class C12920b<T> extends C13713b<T, T> implements C12392a<T> {

        /* renamed from: Q */
        final C12342r<? super T> f37220Q;

        C12920b(C14062c<? super T> cVar, C12342r<? super T> rVar) {
            super(cVar);
            this.f37220Q = rVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t)) {
                this.f39678b.mo41813c(1);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (this.f39675O) {
                return false;
            }
            if (this.f39676P != 0) {
                this.f39677a.mo41789a(null);
                return true;
            }
            try {
                boolean b = this.f37220Q.mo41812b(t);
                if (b) {
                    this.f39677a.mo41789a(t);
                }
                return b;
            } catch (Throwable th) {
                mo43089a(th);
                return true;
            }
        }

        @C5938g
        public T poll() throws Exception {
            C12403l<T> lVar = this.f39674N;
            C12342r<? super T> rVar = this.f37220Q;
            while (true) {
                T poll = lVar.poll();
                if (poll == null) {
                    return null;
                }
                if (rVar.mo41812b(poll)) {
                    return poll;
                }
                if (this.f39676P == 2) {
                    lVar.mo41813c(1);
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12918y0(C5929l<T> lVar, C12342r<? super T> rVar) {
        super(lVar);
        this.f37218N = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12919a<Object>((C12392a) cVar, this.f37218N));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12920b<Object>(cVar, this.f37218N));
        }
    }
}
