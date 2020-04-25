package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12292n0;
import p195e.p196a.C12297q;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13745b;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.o4 */
/* compiled from: FlowableToListSingle */
public final class C12753o4<T, U extends Collection<? super T>> extends C5928k0<U> implements C12393b<U> {

    /* renamed from: a */
    final C5929l<T> f36606a;

    /* renamed from: b */
    final Callable<U> f36607b;

    /* renamed from: e.a.x0.e.b.o4$a */
    /* compiled from: FlowableToListSingle */
    static final class C12754a<T, U extends Collection<? super T>> implements C12297q<T>, C12314c {

        /* renamed from: N */
        U f36608N;

        /* renamed from: a */
        final C12292n0<? super U> f36609a;

        /* renamed from: b */
        C14063d f36610b;

        C12754a(C12292n0<? super U> n0Var, U u) {
            this.f36609a = n0Var;
            this.f36608N = u;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36610b, dVar)) {
                this.f36610b = dVar;
                this.f36609a.mo41974a(this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36610b == C13742j.CANCELLED;
        }

        public void dispose() {
            this.f36610b.cancel();
            this.f36610b = C13742j.CANCELLED;
        }

        public void onComplete() {
            this.f36610b = C13742j.CANCELLED;
            this.f36609a.onSuccess(this.f36608N);
        }

        public void onError(Throwable th) {
            this.f36608N = null;
            this.f36610b = C13742j.CANCELLED;
            this.f36609a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f36608N.add(t);
        }
    }

    public C12753o4(C5929l<T> lVar) {
        this(lVar, C13745b.m58690d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super U> n0Var) {
        try {
            this.f36606a.mo24393a((C12297q<? super T>) new C12754a<Object>(n0Var, (Collection) C12390b.m55563a(this.f36607b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }

    public C12753o4(C5929l<T> lVar, Callable<U> callable) {
        this.f36606a = lVar;
        this.f36607b = callable;
    }

    /* renamed from: b */
    public C5929l<U> mo42139b() {
        return C12205a.m54871a((C5929l<T>) new C12737n4<T>(this.f36606a, this.f36607b));
    }
}
