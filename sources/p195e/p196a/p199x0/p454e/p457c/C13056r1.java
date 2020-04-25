package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.r1 */
/* compiled from: MaybeZipArray */
public final class C13056r1<T, R> extends C5931s<R> {

    /* renamed from: a */
    final C5941y<? extends T>[] f37569a;

    /* renamed from: b */
    final C12339o<? super Object[], ? extends R> f37570b;

    /* renamed from: e.a.x0.e.c.r1$a */
    /* compiled from: MaybeZipArray */
    final class C13057a implements C12339o<T, R> {
        C13057a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C13056r1.this.f37570b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: e.a.x0.e.c.r1$b */
    /* compiled from: MaybeZipArray */
    static final class C13058b<T, R> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: N */
        final C13059c<T>[] f37572N;

        /* renamed from: O */
        final Object[] f37573O;

        /* renamed from: a */
        final C12321v<? super R> f37574a;

        /* renamed from: b */
        final C12339o<? super Object[], ? extends R> f37575b;

        C13058b(C12321v<? super R> vVar, int i, C12339o<? super Object[], ? extends R> oVar) {
            super(i);
            this.f37574a = vVar;
            this.f37575b = oVar;
            C13059c<T>[] cVarArr = new C13059c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C13059c<>(this, i2);
            }
            this.f37572N = cVarArr;
            this.f37573O = new Object[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42590a(T t, int i) {
            this.f37573O[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f37574a.onSuccess(C12390b.m55563a(this.f37575b.apply(this.f37573O), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f37574a.onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42592b(int i) {
            if (getAndSet(0) > 0) {
                mo42589a(i);
                this.f37574a.onComplete();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() <= 0;
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C13059c<T> a : this.f37572N) {
                    a.mo42593a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42589a(int i) {
            C13059c<T>[] cVarArr = this.f37572N;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo42593a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo42593a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42591a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo42589a(i);
                this.f37574a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.e.c.r1$c */
    /* compiled from: MaybeZipArray */
    static final class C13059c<T> extends AtomicReference<C12314c> implements C12321v<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final C13058b<T, ?> f37576a;

        /* renamed from: b */
        final int f37577b;

        C13059c(C13058b<T, ?> bVar, int i) {
            this.f37576a = bVar;
            this.f37577b = i;
        }

        /* renamed from: a */
        public void mo42593a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            this.f37576a.mo42592b(this.f37577b);
        }

        public void onError(Throwable th) {
            this.f37576a.mo42591a(th, this.f37577b);
        }

        public void onSuccess(T t) {
            this.f37576a.mo42590a(t, this.f37577b);
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }
    }

    public C13056r1(C5941y<? extends T>[] yVarArr, C12339o<? super Object[], ? extends R> oVar) {
        this.f37569a = yVarArr;
        this.f37570b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super R> vVar) {
        C5941y<? extends T>[] yVarArr = this.f37569a;
        int length = yVarArr.length;
        int i = 0;
        if (length == 1) {
            yVarArr[0].mo24639a(new C13071a(vVar, new C13057a()));
            return;
        }
        C13058b bVar = new C13058b(vVar, length, this.f37570b);
        vVar.mo41931a(bVar);
        while (i < length && !bVar.mo41878d()) {
            C5941y<? extends T> yVar = yVarArr[i];
            if (yVar == null) {
                bVar.mo42591a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                yVar.mo24639a(bVar.f37572N[i]);
                i++;
            }
        }
    }
}
