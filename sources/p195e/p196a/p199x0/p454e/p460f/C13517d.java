package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.d */
/* compiled from: ParallelFilter */
public final class C13517d<T> extends C5922b<T> {

    /* renamed from: a */
    final C5922b<T> f39151a;

    /* renamed from: b */
    final C12342r<? super T> f39152b;

    /* renamed from: e.a.x0.e.f.d$a */
    /* compiled from: ParallelFilter */
    static abstract class C13518a<T> implements C12392a<T>, C14063d {

        /* renamed from: N */
        boolean f39153N;

        /* renamed from: a */
        final C12342r<? super T> f39154a;

        /* renamed from: b */
        C14063d f39155b;

        C13518a(C12342r<? super T> rVar) {
            this.f39154a = rVar;
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            if (!mo42138b(t) && !this.f39153N) {
                this.f39155b.mo41813c(1);
            }
        }

        /* renamed from: c */
        public final void mo41813c(long j) {
            this.f39155b.mo41813c(j);
        }

        public final void cancel() {
            this.f39155b.cancel();
        }
    }

    /* renamed from: e.a.x0.e.f.d$b */
    /* compiled from: ParallelFilter */
    static final class C13519b<T> extends C13518a<T> {

        /* renamed from: O */
        final C12392a<? super T> f39156O;

        C13519b(C12392a<? super T> aVar, C12342r<? super T> rVar) {
            super(rVar);
            this.f39156O = aVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39155b, dVar)) {
                this.f39155b = dVar;
                this.f39156O.mo41788a(this);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (!this.f39153N) {
                try {
                    if (this.f39154a.mo41812b(t)) {
                        return this.f39156O.mo42138b(t);
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }

        public void onComplete() {
            if (!this.f39153N) {
                this.f39153N = true;
                this.f39156O.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39153N) {
                C12205a.m54894b(th);
                return;
            }
            this.f39153N = true;
            this.f39156O.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.f.d$c */
    /* compiled from: ParallelFilter */
    static final class C13520c<T> extends C13518a<T> {

        /* renamed from: O */
        final C14062c<? super T> f39157O;

        C13520c(C14062c<? super T> cVar, C12342r<? super T> rVar) {
            super(rVar);
            this.f39157O = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39155b, dVar)) {
                this.f39155b = dVar;
                this.f39157O.mo41788a((C14063d) this);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (!this.f39153N) {
                try {
                    if (this.f39154a.mo41812b(t)) {
                        this.f39157O.mo41789a(t);
                        return true;
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }

        public void onComplete() {
            if (!this.f39153N) {
                this.f39153N = true;
                this.f39157O.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39153N) {
                C12205a.m54894b(th);
                return;
            }
            this.f39153N = true;
            this.f39157O.onError(th);
        }
    }

    public C13517d(C5922b<T> bVar, C12342r<? super T> rVar) {
        this.f39151a = bVar;
        this.f39152b = rVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                C12392a aVar = cVarArr[i];
                if (aVar instanceof C12392a) {
                    cVarArr2[i] = new C13519b(aVar, this.f39152b);
                } else {
                    cVarArr2[i] = new C13520c(aVar, this.f39152b);
                }
            }
            this.f39151a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39151a.mo23713a();
    }
}
