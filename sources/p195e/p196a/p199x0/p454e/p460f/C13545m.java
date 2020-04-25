package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.Callable;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13718g;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.m */
/* compiled from: ParallelReduce */
public final class C13545m<T, R> extends C5922b<R> {

    /* renamed from: a */
    final C5922b<? extends T> f39245a;

    /* renamed from: b */
    final Callable<R> f39246b;

    /* renamed from: c */
    final C12327c<R, ? super T, R> f39247c;

    /* renamed from: e.a.x0.e.f.m$a */
    /* compiled from: ParallelReduce */
    static final class C13546a<T, R> extends C13718g<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;

        /* renamed from: X */
        final C12327c<R, ? super T, R> f39248X;

        /* renamed from: Y */
        R f39249Y;

        /* renamed from: Z */
        boolean f39250Z;

        C13546a(C14062c<? super R> cVar, R r, C12327c<R, ? super T, R> cVar2) {
            super(cVar);
            this.f39249Y = r;
            this.f39248X = cVar2;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f39685V, dVar)) {
                this.f39685V = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f39685V.cancel();
        }

        public void onComplete() {
            if (!this.f39250Z) {
                this.f39250Z = true;
                R r = this.f39249Y;
                this.f39249Y = null;
                mo43123c(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f39250Z) {
                C12205a.m54894b(th);
                return;
            }
            this.f39250Z = true;
            this.f39249Y = null;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39250Z) {
                try {
                    this.f39249Y = C12390b.m55563a(this.f39248X.mo35569a(this.f39249Y, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
        }
    }

    public C13545m(C5922b<? extends T> bVar, Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        this.f39245a = bVar;
        this.f39246b = callable;
        this.f39247c = cVar;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super R>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            int i = 0;
            while (i < length) {
                try {
                    cVarArr2[i] = new C13546a(cVarArr[i], C12390b.m55563a(this.f39246b.call(), "The initialSupplier returned a null value"), this.f39247c);
                    i++;
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    mo42973a(cVarArr, th);
                    return;
                }
            }
            this.f39245a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42973a(C14062c<?>[] cVarArr, Throwable th) {
        for (C14062c<?> a : cVarArr) {
            C13739g.m58655a(th, a);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39245a.mo23713a();
    }
}
