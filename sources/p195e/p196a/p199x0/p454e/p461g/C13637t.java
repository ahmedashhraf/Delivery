package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.t */
/* compiled from: SingleEquals */
public final class C13637t<T> extends C5928k0<Boolean> {

    /* renamed from: a */
    final C5930q0<? extends T> f39456a;

    /* renamed from: b */
    final C5930q0<? extends T> f39457b;

    /* renamed from: e.a.x0.e.g.t$a */
    /* compiled from: SingleEquals */
    static class C13638a<T> implements C12292n0<T> {

        /* renamed from: N */
        final Object[] f39458N;

        /* renamed from: O */
        final C12292n0<? super Boolean> f39459O;

        /* renamed from: P */
        final AtomicInteger f39460P;

        /* renamed from: a */
        final int f39461a;

        /* renamed from: b */
        final C12313b f39462b;

        C13638a(int i, C12313b bVar, Object[] objArr, C12292n0<? super Boolean> n0Var, AtomicInteger atomicInteger) {
            this.f39461a = i;
            this.f39462b = bVar;
            this.f39458N = objArr;
            this.f39459O = n0Var;
            this.f39460P = atomicInteger;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39462b.mo42072b(cVar);
        }

        public void onError(Throwable th) {
            int i;
            do {
                i = this.f39460P.get();
                if (i >= 2) {
                    C12205a.m54894b(th);
                    return;
                }
            } while (!this.f39460P.compareAndSet(i, 2));
            this.f39462b.dispose();
            this.f39459O.onError(th);
        }

        public void onSuccess(T t) {
            this.f39458N[this.f39461a] = t;
            if (this.f39460P.incrementAndGet() == 2) {
                C12292n0<? super Boolean> n0Var = this.f39459O;
                Object[] objArr = this.f39458N;
                n0Var.onSuccess(Boolean.valueOf(C12390b.m55564a(objArr[0], objArr[1])));
            }
        }
    }

    public C13637t(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2) {
        this.f39456a = q0Var;
        this.f39457b = q0Var2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        C12313b bVar = new C12313b();
        n0Var.mo41974a(bVar);
        C5930q0<? extends T> q0Var = this.f39456a;
        C12313b bVar2 = bVar;
        Object[] objArr2 = objArr;
        C12292n0<? super Boolean> n0Var2 = n0Var;
        AtomicInteger atomicInteger2 = atomicInteger;
        C13638a aVar = new C13638a(0, bVar2, objArr2, n0Var2, atomicInteger2);
        q0Var.mo24192a(aVar);
        C5930q0<? extends T> q0Var2 = this.f39457b;
        C13638a aVar2 = new C13638a(1, bVar2, objArr2, n0Var2, atomicInteger2);
        q0Var2.mo24192a(aVar2);
    }
}
