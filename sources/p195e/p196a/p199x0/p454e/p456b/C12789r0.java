package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p464h.C13712a;
import p195e.p196a.p199x0.p464h.C13713b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.r0 */
/* compiled from: FlowableDoOnEach */
public final class C12789r0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12331g<? super T> f36723N;

    /* renamed from: O */
    final C12331g<? super Throwable> f36724O;

    /* renamed from: P */
    final C12325a f36725P;

    /* renamed from: Q */
    final C12325a f36726Q;

    /* renamed from: e.a.x0.e.b.r0$a */
    /* compiled from: FlowableDoOnEach */
    static final class C12790a<T> extends C13712a<T, T> {

        /* renamed from: Q */
        final C12331g<? super T> f36727Q;

        /* renamed from: R */
        final C12331g<? super Throwable> f36728R;

        /* renamed from: S */
        final C12325a f36729S;

        /* renamed from: T */
        final C12325a f36730T;

        C12790a(C12392a<? super T> aVar, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar2, C12325a aVar3) {
            super(aVar);
            this.f36727Q = gVar;
            this.f36728R = gVar2;
            this.f36729S = aVar2;
            this.f36730T = aVar3;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39670O) {
                if (this.f39671P != 0) {
                    this.f39672a.mo41789a(null);
                    return;
                }
                try {
                    this.f36727Q.mo33410c(t);
                    this.f39672a.mo41789a(t);
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
                this.f36727Q.mo33410c(t);
                return this.f39672a.mo42138b(t);
            } catch (Throwable th) {
                mo43085a(th);
                return false;
            }
        }

        public void onComplete() {
            if (!this.f39670O) {
                try {
                    this.f36729S.run();
                    this.f39670O = true;
                    this.f39672a.onComplete();
                    try {
                        this.f36730T.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12205a.m54894b(th);
                    }
                } catch (Throwable th2) {
                    mo43085a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f39670O) {
                C12205a.m54894b(th);
                return;
            }
            boolean z = true;
            this.f39670O = true;
            try {
                this.f36728R.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39672a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f39672a.onError(th);
            }
            try {
                this.f36730T.run();
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C12205a.m54894b(th3);
            }
        }

        @C5938g
        public T poll() throws Exception {
            try {
                T poll = this.f39669N.poll();
                if (poll != null) {
                    try {
                        this.f36727Q.mo33410c(poll);
                        this.f36730T.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f39671P == 1) {
                    this.f36729S.run();
                    this.f36730T.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43086b(i);
        }
    }

    /* renamed from: e.a.x0.e.b.r0$b */
    /* compiled from: FlowableDoOnEach */
    static final class C12791b<T> extends C13713b<T, T> {

        /* renamed from: Q */
        final C12331g<? super T> f36731Q;

        /* renamed from: R */
        final C12331g<? super Throwable> f36732R;

        /* renamed from: S */
        final C12325a f36733S;

        /* renamed from: T */
        final C12325a f36734T;

        C12791b(C14062c<? super T> cVar, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2) {
            super(cVar);
            this.f36731Q = gVar;
            this.f36732R = gVar2;
            this.f36733S = aVar;
            this.f36734T = aVar2;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39675O) {
                if (this.f39676P != 0) {
                    this.f39677a.mo41789a(null);
                    return;
                }
                try {
                    this.f36731Q.mo33410c(t);
                    this.f39677a.mo41789a(t);
                } catch (Throwable th) {
                    mo43089a(th);
                }
            }
        }

        public void onComplete() {
            if (!this.f39675O) {
                try {
                    this.f36733S.run();
                    this.f39675O = true;
                    this.f39677a.onComplete();
                    try {
                        this.f36734T.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12205a.m54894b(th);
                    }
                } catch (Throwable th2) {
                    mo43089a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f39675O) {
                C12205a.m54894b(th);
                return;
            }
            boolean z = true;
            this.f39675O = true;
            try {
                this.f36732R.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                this.f39677a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f39677a.onError(th);
            }
            try {
                this.f36734T.run();
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C12205a.m54894b(th3);
            }
        }

        @C5938g
        public T poll() throws Exception {
            try {
                T poll = this.f39674N.poll();
                if (poll != null) {
                    try {
                        this.f36731Q.mo33410c(poll);
                        this.f36734T.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f39676P == 1) {
                    this.f36733S.run();
                    this.f36734T.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return mo43090b(i);
        }
    }

    public C12789r0(C5929l<T> lVar, C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2) {
        super(lVar);
        this.f36723N = gVar;
        this.f36724O = gVar2;
        this.f36725P = aVar;
        this.f36726Q = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            C5929l<T> lVar = this.f35814b;
            C12790a aVar = new C12790a((C12392a) cVar, this.f36723N, this.f36724O, this.f36725P, this.f36726Q);
            lVar.mo24393a((C12297q<? super T>) aVar);
            return;
        }
        C5929l<T> lVar2 = this.f35814b;
        C12791b bVar = new C12791b(cVar, this.f36723N, this.f36724O, this.f36725P, this.f36726Q);
        lVar2.mo24393a((C12297q<? super T>) bVar);
    }
}
