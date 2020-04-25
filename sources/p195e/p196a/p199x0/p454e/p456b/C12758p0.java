package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p464h.C13712a;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;

@C5936e
/* renamed from: e.a.x0.e.b.p0 */
/* compiled from: FlowableDoAfterNext */
public final class C12758p0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12331g<? super T> f36619N;

    /* renamed from: e.a.x0.e.b.p0$a */
    /* compiled from: FlowableDoAfterNext */
    static final class C12759a<T> extends C13712a<T, T> {

        /* renamed from: Q */
        final C12331g<? super T> f36620Q;

        C12759a(C12392a<? super T> aVar, C12331g<? super T> gVar) {
            super(aVar);
            this.f36620Q = gVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39672a.mo41789a(t);
            if (this.f39671P == 0) {
                try {
                    this.f36620Q.mo33410c(t);
                } catch (Throwable th) {
                    mo43085a(th);
                }
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            boolean b = this.f39672a.mo42138b(t);
            try {
                this.f36620Q.mo33410c(t);
            } catch (Throwable th) {
                mo43085a(th);
            }
            return b;
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f39669N.poll();
            if (poll != null) {
                this.f36620Q.mo33410c(poll);
            }
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43086b(i);
        }
    }

    /* renamed from: e.a.x0.e.b.p0$b */
    /* compiled from: FlowableDoAfterNext */
    static final class C12760b<T> extends C13713b<T, T> {

        /* renamed from: Q */
        final C12331g<? super T> f36621Q;

        C12760b(C14062c<? super T> cVar, C12331g<? super T> gVar) {
            super(cVar);
            this.f36621Q = gVar;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39675O) {
                this.f39677a.mo41789a(t);
                if (this.f39676P == 0) {
                    try {
                        this.f36621Q.mo33410c(t);
                    } catch (Throwable th) {
                        mo43089a(th);
                    }
                }
            }
        }

        @C5938g
        public T poll() throws Exception {
            T poll = this.f39674N.poll();
            if (poll != null) {
                this.f36621Q.mo33410c(poll);
            }
            return poll;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12758p0(C5929l<T> lVar, C12331g<? super T> gVar) {
        super(lVar);
        this.f36619N = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12759a<Object>((C12392a) cVar, this.f36619N));
        } else {
            this.f35814b.mo24393a((C12297q<? super T>) new C12760b<Object>(cVar, this.f36619N));
        }
    }
}
