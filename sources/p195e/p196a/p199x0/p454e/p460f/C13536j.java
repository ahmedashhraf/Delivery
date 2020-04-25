package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.C12297q;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.j */
/* compiled from: ParallelMap */
public final class C13536j<T, R> extends C5922b<R> {

    /* renamed from: a */
    final C5922b<T> f39208a;

    /* renamed from: b */
    final C12339o<? super T, ? extends R> f39209b;

    /* renamed from: e.a.x0.e.f.j$a */
    /* compiled from: ParallelMap */
    static final class C13537a<T, R> implements C12392a<T>, C14063d {

        /* renamed from: N */
        C14063d f39210N;

        /* renamed from: O */
        boolean f39211O;

        /* renamed from: a */
        final C12392a<? super R> f39212a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f39213b;

        C13537a(C12392a<? super R> aVar, C12339o<? super T, ? extends R> oVar) {
            this.f39212a = aVar;
            this.f39213b = oVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39210N, dVar)) {
                this.f39210N = dVar;
                this.f39212a.mo41788a(this);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (this.f39211O) {
                return false;
            }
            try {
                return this.f39212a.mo42138b(C12390b.m55563a(this.f39213b.apply(t), "The mapper returned a null value"));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cancel();
                onError(th);
                return false;
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39210N.mo41813c(j);
        }

        public void cancel() {
            this.f39210N.cancel();
        }

        public void onComplete() {
            if (!this.f39211O) {
                this.f39211O = true;
                this.f39212a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39211O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39211O = true;
            this.f39212a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39211O) {
                try {
                    this.f39212a.mo41789a(C12390b.m55563a(this.f39213b.apply(t), "The mapper returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.f.j$b */
    /* compiled from: ParallelMap */
    static final class C13538b<T, R> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f39214N;

        /* renamed from: O */
        boolean f39215O;

        /* renamed from: a */
        final C14062c<? super R> f39216a;

        /* renamed from: b */
        final C12339o<? super T, ? extends R> f39217b;

        C13538b(C14062c<? super R> cVar, C12339o<? super T, ? extends R> oVar) {
            this.f39216a = cVar;
            this.f39217b = oVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39214N, dVar)) {
                this.f39214N = dVar;
                this.f39216a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f39214N.mo41813c(j);
        }

        public void cancel() {
            this.f39214N.cancel();
        }

        public void onComplete() {
            if (!this.f39215O) {
                this.f39215O = true;
                this.f39216a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39215O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39215O = true;
            this.f39216a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39215O) {
                try {
                    this.f39216a.mo41789a(C12390b.m55563a(this.f39217b.apply(t), "The mapper returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
        }
    }

    public C13536j(C5922b<T> bVar, C12339o<? super T, ? extends R> oVar) {
        this.f39208a = bVar;
        this.f39209b = oVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super R>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                C12392a aVar = cVarArr[i];
                if (aVar instanceof C12392a) {
                    cVarArr2[i] = new C13537a(aVar, this.f39209b);
                } else {
                    cVarArr2[i] = new C13538b(aVar, this.f39209b);
                }
            }
            this.f39208a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39208a.mo23713a();
    }
}
