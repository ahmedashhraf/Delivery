package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.C12297q;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12341q;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.f.l */
/* compiled from: ParallelPeek */
public final class C13543l<T> extends C5922b<T> {

    /* renamed from: a */
    final C5922b<T> f39232a;

    /* renamed from: b */
    final C12331g<? super T> f39233b;

    /* renamed from: c */
    final C12331g<? super T> f39234c;

    /* renamed from: d */
    final C12331g<? super Throwable> f39235d;

    /* renamed from: e */
    final C12325a f39236e;

    /* renamed from: f */
    final C12325a f39237f;

    /* renamed from: g */
    final C12331g<? super C14063d> f39238g;

    /* renamed from: h */
    final C12341q f39239h;

    /* renamed from: i */
    final C12325a f39240i;

    /* renamed from: e.a.x0.e.f.l$a */
    /* compiled from: ParallelPeek */
    static final class C13544a<T> implements C12297q<T>, C14063d {

        /* renamed from: N */
        C14063d f39241N;

        /* renamed from: O */
        boolean f39242O;

        /* renamed from: a */
        final C14062c<? super T> f39243a;

        /* renamed from: b */
        final C13543l<T> f39244b;

        C13544a(C14062c<? super T> cVar, C13543l<T> lVar) {
            this.f39243a = cVar;
            this.f39244b = lVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39241N, dVar)) {
                this.f39241N = dVar;
                try {
                    this.f39244b.f39238g.mo33410c(dVar);
                    this.f39243a.mo41788a((C14063d) this);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    dVar.cancel();
                    this.f39243a.mo41788a((C14063d) C13739g.INSTANCE);
                    onError(th);
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            try {
                this.f39244b.f39239h.mo42100a(j);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f39241N.mo41813c(j);
        }

        public void cancel() {
            try {
                this.f39244b.f39240i.run();
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
            this.f39241N.cancel();
        }

        public void onComplete() {
            if (!this.f39242O) {
                this.f39242O = true;
                try {
                    this.f39244b.f39236e.run();
                    this.f39243a.onComplete();
                    try {
                        this.f39244b.f39237f.run();
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        C12205a.m54894b(th);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    this.f39243a.onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f39242O) {
                C12205a.m54894b(th);
                return;
            }
            this.f39242O = true;
            try {
                this.f39244b.f39235d.mo33410c(th);
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                th = new CompositeException(th, th2);
            }
            this.f39243a.onError(th);
            try {
                this.f39244b.f39237f.run();
            } catch (Throwable th3) {
                C14398a.m62357b(th3);
                C12205a.m54894b(th3);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39242O) {
                try {
                    this.f39244b.f39233b.mo33410c(t);
                    this.f39243a.mo41789a(t);
                    try {
                        this.f39244b.f39234c.mo33410c(t);
                    } catch (Throwable th) {
                        C14398a.m62357b(th);
                        onError(th);
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    onError(th2);
                }
            }
        }
    }

    public C13543l(C5922b<T> bVar, C12331g<? super T> gVar, C12331g<? super T> gVar2, C12331g<? super Throwable> gVar3, C12325a aVar, C12325a aVar2, C12331g<? super C14063d> gVar4, C12341q qVar, C12325a aVar3) {
        this.f39232a = bVar;
        this.f39233b = (C12331g) C12390b.m55563a(gVar, "onNext is null");
        this.f39234c = (C12331g) C12390b.m55563a(gVar2, "onAfterNext is null");
        this.f39235d = (C12331g) C12390b.m55563a(gVar3, "onError is null");
        this.f39236e = (C12325a) C12390b.m55563a(aVar, "onComplete is null");
        this.f39237f = (C12325a) C12390b.m55563a(aVar2, "onAfterTerminated is null");
        this.f39238g = (C12331g) C12390b.m55563a(gVar4, "onSubscribe is null");
        this.f39239h = (C12341q) C12390b.m55563a(qVar, "onRequest is null");
        this.f39240i = (C12325a) C12390b.m55563a(aVar3, "onCancel is null");
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                cVarArr2[i] = new C13544a(cVarArr[i], this);
            }
            this.f39232a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39232a.mo23713a();
    }
}
