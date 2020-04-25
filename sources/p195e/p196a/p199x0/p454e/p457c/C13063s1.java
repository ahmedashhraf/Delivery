package p195e.p196a.p199x0.p454e.p457c;

import java.util.Arrays;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.s1 */
/* compiled from: MaybeZipIterable */
public final class C13063s1<T, R> extends C5931s<R> {

    /* renamed from: a */
    final Iterable<? extends C5941y<? extends T>> f37583a;

    /* renamed from: b */
    final C12339o<? super Object[], ? extends R> f37584b;

    /* renamed from: e.a.x0.e.c.s1$a */
    /* compiled from: MaybeZipIterable */
    final class C13064a implements C12339o<T, R> {
        C13064a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C13063s1.this.f37584b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public C13063s1(Iterable<? extends C5941y<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        this.f37583a = iterable;
        this.f37584b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        C5941y[] yVarArr = new C5941y[8];
        try {
            C5941y[] yVarArr2 = yVarArr;
            int i = 0;
            for (C5941y yVar : this.f37583a) {
                if (yVar == null) {
                    C12348e.m55478a((Throwable) new NullPointerException("One of the sources is null"), vVar);
                    return;
                }
                if (i == yVarArr2.length) {
                    yVarArr2 = (C5941y[]) Arrays.copyOf(yVarArr2, (i >> 2) + i);
                }
                int i2 = i + 1;
                yVarArr2[i] = yVar;
                i = i2;
            }
            if (i == 0) {
                C12348e.m55474a(vVar);
            } else if (i == 1) {
                yVarArr2[0].mo24639a(new C13071a(vVar, new C13064a()));
            } else {
                C13058b bVar = new C13058b(vVar, i, this.f37584b);
                vVar.mo41931a(bVar);
                for (int i3 = 0; i3 < i && !bVar.mo41878d(); i3++) {
                    yVarArr2[i3].mo24639a(bVar.f37572N[i3]);
                }
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55478a(th, vVar);
        }
    }
}
