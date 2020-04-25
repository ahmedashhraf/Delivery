package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.a */
/* compiled from: SingleAmb */
public final class C13559a<T> extends C5928k0<T> {

    /* renamed from: a */
    private final C5930q0<? extends T>[] f39296a;

    /* renamed from: b */
    private final Iterable<? extends C5930q0<? extends T>> f39297b;

    /* renamed from: e.a.x0.e.g.a$a */
    /* compiled from: SingleAmb */
    static final class C13560a<T> extends AtomicBoolean implements C12292n0<T> {
        private static final long serialVersionUID = -1944085461036028108L;

        /* renamed from: a */
        final C12313b f39298a;

        /* renamed from: b */
        final C12292n0<? super T> f39299b;

        C13560a(C12292n0<? super T> n0Var, C12313b bVar) {
            this.f39299b = n0Var;
            this.f39298a = bVar;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39298a.mo42072b(cVar);
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f39298a.dispose();
                this.f39299b.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                this.f39298a.dispose();
                this.f39299b.onSuccess(t);
            }
        }
    }

    public C13559a(C5930q0<? extends T>[] q0VarArr, Iterable<? extends C5930q0<? extends T>> iterable) {
        this.f39296a = q0VarArr;
        this.f39297b = iterable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        int i;
        C5930q0<? extends T>[] q0VarArr = this.f39296a;
        String str = "One of the sources is null";
        if (q0VarArr == null) {
            q0VarArr = new C5930q0[8];
            try {
                i = 0;
                for (C5930q0<? extends T> q0Var : this.f39297b) {
                    if (q0Var == null) {
                        C12348e.m55477a((Throwable) new NullPointerException(str), n0Var);
                        return;
                    }
                    if (i == q0VarArr.length) {
                        C5930q0<? extends T>[] q0VarArr2 = new C5930q0[((i >> 2) + i)];
                        System.arraycopy(q0VarArr, 0, q0VarArr2, 0, i);
                        q0VarArr = q0VarArr2;
                    }
                    int i2 = i + 1;
                    q0VarArr[i] = q0Var;
                    i = i2;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55477a(th, n0Var);
                return;
            }
        } else {
            i = q0VarArr.length;
        }
        C12313b bVar = new C12313b();
        C13560a aVar = new C13560a(n0Var, bVar);
        n0Var.mo41974a(bVar);
        int i3 = 0;
        while (i3 < i) {
            C5930q0<? extends T> q0Var2 = q0VarArr[i3];
            if (!aVar.get()) {
                if (q0Var2 == null) {
                    bVar.dispose();
                    NullPointerException nullPointerException = new NullPointerException(str);
                    if (aVar.compareAndSet(false, true)) {
                        n0Var.onError(nullPointerException);
                    } else {
                        C12205a.m54894b((Throwable) nullPointerException);
                    }
                    return;
                }
                q0Var2.mo24192a(aVar);
                i3++;
            } else {
                return;
            }
        }
    }
}
