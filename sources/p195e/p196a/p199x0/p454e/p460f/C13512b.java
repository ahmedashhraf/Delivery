package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p454e.p456b.C12886w;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.f.b */
/* compiled from: ParallelConcatMap */
public final class C13512b<T, R> extends C5922b<R> {

    /* renamed from: a */
    final C5922b<T> f39133a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C6007b<? extends R>> f39134b;

    /* renamed from: c */
    final int f39135c;

    /* renamed from: d */
    final C13753j f39136d;

    public C13512b(C5922b<T> bVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, C13753j jVar) {
        this.f39133a = bVar;
        this.f39134b = (C12339o) C12390b.m55563a(oVar, "mapper");
        this.f39135c = i;
        this.f39136d = (C13753j) C12390b.m55563a(jVar, "errorMode");
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39133a.mo23713a();
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super R>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                cVarArr2[i] = C12886w.m56699a(cVarArr[i], this.f39134b, this.f39135c, this.f39136d);
            }
            this.f39133a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }
}
