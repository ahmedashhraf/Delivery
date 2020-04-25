package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.Callable;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p464h.C13718g;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12326b;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.a */
/* compiled from: ParallelCollect */
public final class C13510a<T, C> extends C5922b<C> {

    /* renamed from: a */
    final C5922b<? extends T> f39127a;

    /* renamed from: b */
    final Callable<? extends C> f39128b;

    /* renamed from: c */
    final C12326b<? super C, ? super T> f39129c;

    /* renamed from: e.a.x0.e.f.a$a */
    /* compiled from: ParallelCollect */
    static final class C13511a<T, C> extends C13718g<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;

        /* renamed from: X */
        final C12326b<? super C, ? super T> f39130X;

        /* renamed from: Y */
        C f39131Y;

        /* renamed from: Z */
        boolean f39132Z;

        C13511a(C14062c<? super C> cVar, C c, C12326b<? super C, ? super T> bVar) {
            super(cVar);
            this.f39131Y = c;
            this.f39130X = bVar;
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
            if (!this.f39132Z) {
                this.f39132Z = true;
                C c = this.f39131Y;
                this.f39131Y = null;
                mo43123c(c);
            }
        }

        public void onError(Throwable th) {
            if (this.f39132Z) {
                C12205a.m54894b(th);
                return;
            }
            this.f39132Z = true;
            this.f39131Y = null;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f39132Z) {
                try {
                    this.f39130X.mo42088a(this.f39131Y, t);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    cancel();
                    onError(th);
                }
            }
        }
    }

    public C13510a(C5922b<? extends T> bVar, Callable<? extends C> callable, C12326b<? super C, ? super T> bVar2) {
        this.f39127a = bVar;
        this.f39128b = callable;
        this.f39129c = bVar2;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super C>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            int i = 0;
            while (i < length) {
                try {
                    cVarArr2[i] = new C13511a(cVarArr[i], C12390b.m55563a(this.f39128b.call(), "The initialSupplier returned a null value"), this.f39129c);
                    i++;
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    mo42955a(cVarArr, th);
                    return;
                }
            }
            this.f39127a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42955a(C14062c<?>[] cVarArr, Throwable th) {
        for (C14062c<?> a : cVarArr) {
            C13739g.m58655a(th, a);
        }
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39127a.mo23713a();
    }
}
