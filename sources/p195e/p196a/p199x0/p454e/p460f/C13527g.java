package p195e.p196a.p199x0.p454e.p460f;

import p195e.p196a.p197a1.C5922b;
import p205i.p211e.C14062c;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.f.g */
/* compiled from: ParallelFromArray */
public final class C13527g<T> extends C5922b<T> {

    /* renamed from: a */
    final C6007b<T>[] f39173a;

    public C13527g(C6007b<T>[] bVarArr) {
        this.f39173a = bVarArr;
    }

    /* renamed from: a */
    public int mo23713a() {
        return this.f39173a.length;
    }

    /* renamed from: a */
    public void mo23740a(C14062c<? super T>[] cVarArr) {
        if (mo23749b((C14062c<?>[]) cVarArr)) {
            int length = cVarArr.length;
            for (int i = 0; i < length; i++) {
                this.f39173a[i].mo24397a(cVarArr[i]);
            }
        }
    }
}
