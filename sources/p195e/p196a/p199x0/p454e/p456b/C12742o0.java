package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p464h.C13712a;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p449w0.C12328d;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;

/* renamed from: e.a.x0.e.b.o0 */
/* compiled from: FlowableDistinctUntilChanged */
public final class C12742o0<T, K> extends C12511a<T, T> {

    /* renamed from: N */
    final C12339o<? super T, K> f36562N;

    /* renamed from: O */
    final C12328d<? super K, ? super K> f36563O;

    /* renamed from: e.a.x0.e.b.o0$a */
    /* compiled from: FlowableDistinctUntilChanged */
    static final class C12743a<T, K> extends C13712a<T, T> {

        /* renamed from: Q */
        final C12339o<? super T, K> f36564Q;

        /* renamed from: R */
        final C12328d<? super K, ? super K> f36565R;

        /* renamed from: S */
        K f36566S;

        /* renamed from: T */
        boolean f36567T;

        C12743a(C12392a<? super T> aVar, C12339o<? super T, K> oVar, C12328d<? super K, ? super K> dVar) {
            super(aVar);
            this.f36564Q = oVar;
            this.f36565R = dVar;
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
                return this.f39672a.mo42138b(t);
            }
            try {
                K apply = this.f36564Q.apply(t);
                if (this.f36567T) {
                    boolean a = this.f36565R.mo42089a(this.f36566S, apply);
                    this.f36566S = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f36567T = true;
                    this.f36566S = apply;
                }
                this.f39672a.mo41789a(t);
                return true;
            } catch (Throwable th) {
                mo43085a(th);
                return true;
            }
        }

        @C5938g
        public T poll() throws Exception {
            while (true) {
                T poll = this.f39669N.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f36564Q.apply(poll);
                if (!this.f36567T) {
                    this.f36567T = true;
                    this.f36566S = apply;
                    return poll;
                } else if (!this.f36565R.mo42089a(this.f36566S, apply)) {
                    this.f36566S = apply;
                    return poll;
                } else {
                    this.f36566S = apply;
                    if (this.f39671P != 1) {
                        this.f39673b.mo41813c(1);
                    }
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43086b(i);
        }
    }

    /* renamed from: e.a.x0.e.b.o0$b */
    /* compiled from: FlowableDistinctUntilChanged */
    static final class C12744b<T, K> extends C13713b<T, T> implements C12392a<T> {

        /* renamed from: Q */
        final C12339o<? super T, K> f36568Q;

        /* renamed from: R */
        final C12328d<? super K, ? super K> f36569R;

        /* renamed from: S */
        K f36570S;

        /* renamed from: T */
        boolean f36571T;

        C12744b(C14062c<? super T> cVar, C12339o<? super T, K> oVar, C12328d<? super K, ? super K> dVar) {
            super(cVar);
            this.f36568Q = oVar;
            this.f36569R = dVar;
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
                this.f39677a.mo41789a(t);
                return true;
            }
            try {
                K apply = this.f36568Q.apply(t);
                if (this.f36571T) {
                    boolean a = this.f36569R.mo42089a(this.f36570S, apply);
                    this.f36570S = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f36571T = true;
                    this.f36570S = apply;
                }
                this.f39677a.mo41789a(t);
                return true;
            } catch (Throwable th) {
                mo43089a(th);
                return true;
            }
        }

        @C5938g
        public T poll() throws Exception {
            while (true) {
                T poll = this.f39674N.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f36568Q.apply(poll);
                if (!this.f36571T) {
                    this.f36571T = true;
                    this.f36570S = apply;
                    return poll;
                } else if (!this.f36569R.mo42089a(this.f36570S, apply)) {
                    this.f36570S = apply;
                    return poll;
                } else {
                    this.f36570S = apply;
                    if (this.f39676P != 1) {
                        this.f39678b.mo41813c(1);
                    }
                }
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12742o0(C5929l<T> lVar, C12339o<? super T, K> oVar, C12328d<? super K, ? super K> dVar) {
        super(lVar);
        this.f36562N = oVar;
        this.f36563O = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12743a<Object>((C12392a) cVar, this.f36562N, this.f36563O));
            return;
        }
        this.f35814b.mo24393a((C12297q<? super T>) new C12744b<Object>(cVar, this.f36562N, this.f36563O));
    }
}
