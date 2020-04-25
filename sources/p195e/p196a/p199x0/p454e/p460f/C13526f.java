package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p454e.p456b.C12930z0;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.f.f */
/* compiled from: ParallelFlatMap */
public final class C13526f<T, R> extends C5922b<R> {

    /* renamed from: a */
    final C5922b<T> f39168a;

    /* renamed from: b */
    final C12339o<? super T, ? extends C6007b<? extends R>> f39169b;

    /* renamed from: c */
    final boolean f39170c;

    /* renamed from: d */
    final int f39171d;

    /* renamed from: e */
    final int f39172e;

    public C13526f(C5922b<T> bVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z, int i, int i2) {
        this.f39168a = bVar;
        this.f39169b = oVar;
        this.f39170c = z;
        this.f39171d = i;
        this.f39172e = i2;
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39168a.mo23713a();
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super R>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            C14062c[] cVarArr2 = new C14062c[length];
            for (int i = 0; i < length; i++) {
                cVarArr2[i] = C12930z0.m56805a(cVarArr[i], this.f39169b, this.f39170c, this.f39171d, this.f39172e);
            }
            this.f39168a.mo23740a((C14062c<? super T>[]) cVarArr2);
        }
    }
}
