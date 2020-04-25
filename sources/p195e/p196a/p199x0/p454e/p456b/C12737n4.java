package p195e.p196a.p199x0.p454e.p456b;

import java.util.Collection;
import java.util.concurrent.Callable;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13738f;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.n4 */
/* compiled from: FlowableToList */
public final class C12737n4<T, U extends Collection<? super T>> extends C12511a<T, U> {

    /* renamed from: N */
    final Callable<U> f36551N;

    /* renamed from: e.a.x0.e.b.n4$a */
    /* compiled from: FlowableToList */
    static final class C12738a<T, U extends Collection<? super T>> extends C13738f<U> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: V */
        C14063d f36552V;

        /* JADX WARNING: type inference failed for: r2v0, types: [T, U] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=U, code=null, for r2v0, types: [T, U] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C12738a(p205i.p211e.C14062c<? super U> r1, U r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                r0.f39782b = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12737n4.C12738a.<init>(i.e.c, java.util.Collection):void");
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36552V, dVar)) {
                this.f36552V = dVar;
                this.f39781a.mo41788a((C14063d) this);
                dVar.mo41813c(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f36552V.cancel();
        }

        public void onComplete() {
            mo43123c(this.f39782b);
        }

        public void onError(Throwable th) {
            this.f39782b = null;
            this.f39781a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            Collection collection = (Collection) this.f39782b;
            if (collection != null) {
                collection.add(t);
            }
        }
    }

    public C12737n4(C5929l<T> lVar, Callable<U> callable) {
        super(lVar);
        this.f36551N = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super U> cVar) {
        try {
            this.f35814b.mo24393a((C12297q<? super T>) new C12738a<Object>(cVar, (Collection) C12390b.m55563a(this.f36551N.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
