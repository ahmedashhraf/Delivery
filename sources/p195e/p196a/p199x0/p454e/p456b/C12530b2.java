package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p464h.C13712a;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.b2 */
/* compiled from: FlowableMap */
public final class C12530b2<T, U> extends C12511a<T, U> {

    /* renamed from: N */
    final C12339o<? super T, ? extends U> f35875N;

    /* renamed from: e.a.x0.e.b.b2$a */
    /* compiled from: FlowableMap */
    static final class C12531a<T, U> extends C13712a<T, U> {

        /* renamed from: Q */
        final C12339o<? super T, ? extends U> f35876Q;

        C12531a(C12392a<? super U> aVar, C12339o<? super T, ? extends U> oVar) {
            super(aVar);
            this.f35876Q = oVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39670O) {
                if (this.f39671P != 0) {
                    this.f39672a.mo41789a(null);
                    return;
                }
                try {
                    this.f39672a.mo41789a(C12390b.m55563a(this.f35876Q.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo43085a(th);
                }
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (this.f39670O) {
                return false;
            }
            try {
                return this.f39672a.mo42138b(C12390b.m55563a(this.f35876Q.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo43085a(th);
                return true;
            }
        }

        @C5938g
        public U poll() throws Exception {
            Object poll = this.f39669N.poll();
            if (poll != null) {
                return C12390b.m55563a(this.f35876Q.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43086b(i);
        }
    }

    /* renamed from: e.a.x0.e.b.b2$b */
    /* compiled from: FlowableMap */
    static final class C12532b<T, U> extends C13713b<T, U> {

        /* renamed from: Q */
        final C12339o<? super T, ? extends U> f35877Q;

        C12532b(C14062c<? super U> cVar, C12339o<? super T, ? extends U> oVar) {
            super(cVar);
            this.f35877Q = oVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39675O) {
                if (this.f39676P != 0) {
                    this.f39677a.mo41789a(null);
                    return;
                }
                try {
                    this.f39677a.mo41789a(C12390b.m55563a(this.f35877Q.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo43089a(th);
                }
            }
        }

        @C5938g
        public U poll() throws Exception {
            Object poll = this.f39674N.poll();
            if (poll != null) {
                return C12390b.m55563a(this.f35877Q.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12530b2(C5929l<T> lVar, C12339o<? super T, ? extends U> oVar) {
        super(lVar);
        this.f35875N = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12531a<Object>((C12392a) cVar, this.f35875N));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12532b<Object>(cVar, this.f35875N));
        }
    }
}
