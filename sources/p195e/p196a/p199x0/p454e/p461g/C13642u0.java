package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.u0 */
/* compiled from: SingleZipArray */
public final class C13642u0<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final C5930q0<? extends T>[] f39472a;

    /* renamed from: b */
    final C12339o<? super Object[], ? extends R> f39473b;

    /* renamed from: e.a.x0.e.g.u0$a */
    /* compiled from: SingleZipArray */
    final class C13643a implements C12339o<T, R> {
        C13643a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C13642u0.this.f39473b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: e.a.x0.e.g.u0$b */
    /* compiled from: SingleZipArray */
    static final class C13644b<T, R> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: N */
        final C13645c<T>[] f39475N;

        /* renamed from: O */
        final Object[] f39476O;

        /* renamed from: a */
        final C12292n0<? super R> f39477a;

        /* renamed from: b */
        final C12339o<? super Object[], ? extends R> f39478b;

        C13644b(C12292n0<? super R> n0Var, int i, C12339o<? super Object[], ? extends R> oVar) {
            super(i);
            this.f39477a = n0Var;
            this.f39478b = oVar;
            C13645c<T>[] cVarArr = new C13645c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C13645c<>(this, i2);
            }
            this.f39475N = cVarArr;
            this.f39476O = new Object[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43013a(T t, int i) {
            this.f39476O[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f39477a.onSuccess(C12390b.m55563a(this.f39478b.apply(this.f39476O), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f39477a.onError(th);
                }
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() <= 0;
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C13645c<T> a : this.f39475N) {
                    a.mo43015a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43012a(int i) {
            C13645c<T>[] cVarArr = this.f39475N;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo43015a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo43015a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43014a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo43012a(i);
                this.f39477a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.g.u0$c */
    /* compiled from: SingleZipArray */
    static final class C13645c<T> extends AtomicReference<C12314c> implements C12292n0<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final C13644b<T, ?> f39479a;

        /* renamed from: b */
        final int f39480b;

        C13645c(C13644b<T, ?> bVar, int i) {
            this.f39479a = bVar;
            this.f39480b = i;
        }

        /* renamed from: a */
        public void mo43015a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onError(Throwable th) {
            this.f39479a.mo43014a(th, this.f39480b);
        }

        public void onSuccess(T t) {
            this.f39479a.mo43013a(t, this.f39480b);
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }
    }

    public C13642u0(C5930q0<? extends T>[] q0VarArr, C12339o<? super Object[], ? extends R> oVar) {
        this.f39472a = q0VarArr;
        this.f39473b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        C5930q0<? extends T>[] q0VarArr = this.f39472a;
        int length = q0VarArr.length;
        int i = 0;
        if (length == 1) {
            q0VarArr[0].mo24192a(new C13591a(n0Var, new C13643a()));
            return;
        }
        C13644b bVar = new C13644b(n0Var, length, this.f39473b);
        n0Var.mo41974a(bVar);
        while (i < length && !bVar.mo41878d()) {
            C5930q0<? extends T> q0Var = q0VarArr[i];
            if (q0Var == null) {
                bVar.mo43014a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                q0Var.mo24192a(bVar.f39475N[i]);
                i++;
            }
        }
    }
}
