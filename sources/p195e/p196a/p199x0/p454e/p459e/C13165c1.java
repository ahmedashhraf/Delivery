package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p453d.C12410c;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.c1 */
/* compiled from: ObservableFromArray */
public final class C13165c1<T> extends C5923b0<T> {

    /* renamed from: a */
    final T[] f37964a;

    /* renamed from: e.a.x0.e.e.c1$a */
    /* compiled from: ObservableFromArray */
    static final class C13166a<T> extends C12410c<T> {

        /* renamed from: N */
        int f37965N;

        /* renamed from: O */
        boolean f37966O;

        /* renamed from: P */
        volatile boolean f37967P;

        /* renamed from: a */
        final C12280i0<? super T> f37968a;

        /* renamed from: b */
        final T[] f37969b;

        C13166a(C12280i0<? super T> i0Var, T[] tArr) {
            this.f37968a = i0Var;
            this.f37969b = tArr;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f37966O = true;
            return 1;
        }

        public void clear() {
            this.f37965N = this.f37969b.length;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37967P;
        }

        public void dispose() {
            this.f37967P = true;
        }

        public boolean isEmpty() {
            return this.f37965N == this.f37969b.length;
        }

        @C5938g
        public T poll() {
            int i = this.f37965N;
            T[] tArr = this.f37969b;
            if (i == tArr.length) {
                return null;
            }
            this.f37965N = i + 1;
            return C12390b.m55563a(tArr[i], "The array element is null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42697a() {
            T[] tArr = this.f37969b;
            int length = tArr.length;
            for (int i = 0; i < length && !mo41878d(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C12280i0<? super T> i0Var = this.f37968a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The ");
                    sb.append(i);
                    sb.append("th element is null");
                    i0Var.onError(new NullPointerException(sb.toString()));
                    return;
                }
                this.f37968a.mo33453a(t);
            }
            if (!mo41878d()) {
                this.f37968a.onComplete();
            }
        }
    }

    public C13165c1(T[] tArr) {
        this.f37964a = tArr;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C13166a aVar = new C13166a(i0Var, this.f37964a);
        i0Var.mo34123a((C12314c) aVar);
        if (!aVar.f37966O) {
            aVar.mo42697a();
        }
    }
}
