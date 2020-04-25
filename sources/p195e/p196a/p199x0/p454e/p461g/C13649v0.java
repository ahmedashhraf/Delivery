package p195e.p196a.p199x0.p454e.p461g;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.v0 */
/* compiled from: SingleZipIterable */
public final class C13649v0<T, R> extends C5928k0<R> {

    /* renamed from: a */
    final Iterable<? extends C5930q0<? extends T>> f39487a;

    /* renamed from: b */
    final C12339o<? super Object[], ? extends R> f39488b;

    /* renamed from: e.a.x0.e.g.v0$a */
    /* compiled from: SingleZipIterable */
    final class C13650a implements C12339o<T, R> {
        C13650a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C13649v0.this.f39488b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public C13649v0(Iterable<? extends C5930q0<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        this.f39487a = iterable;
        this.f39488b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        C5930q0[] q0VarArr = new C5930q0[8];
        try {
            C5930q0[] q0VarArr2 = q0VarArr;
            int i = 0;
            for (C5930q0 q0Var : this.f39487a) {
                if (q0Var == null) {
                    C12348e.m55477a((Throwable) new NullPointerException("One of the sources is null"), n0Var);
                    return;
                }
                if (i == q0VarArr2.length) {
                    q0VarArr2 = (C5930q0[]) Arrays.copyOf(q0VarArr2, (i >> 2) + i);
                }
                int i2 = i + 1;
                q0VarArr2[i] = q0Var;
                i = i2;
            }
            if (i == 0) {
                C12348e.m55477a((Throwable) new NoSuchElementException(), n0Var);
            } else if (i == 1) {
                q0VarArr2[0].mo24192a(new C13591a(n0Var, new C13650a()));
            } else {
                C13644b bVar = new C13644b(n0Var, i, this.f39488b);
                n0Var.mo41974a(bVar);
                for (int i3 = 0; i3 < i && !bVar.mo41878d(); i3++) {
                    q0VarArr2[i3].mo24192a(bVar.f39475N[i3]);
                }
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55477a(th, n0Var);
        }
    }
}
