package p195e.p196a.p199x0.p454e.p457c;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12321v;
import p195e.p196a.C5931s;
import p195e.p196a.C5941y;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.c.b */
/* compiled from: MaybeAmb */
public final class C12948b<T> extends C5931s<T> {

    /* renamed from: a */
    private final C5941y<? extends T>[] f37342a;

    /* renamed from: b */
    private final Iterable<? extends C5941y<? extends T>> f37343b;

    /* renamed from: e.a.x0.e.c.b$a */
    /* compiled from: MaybeAmb */
    static final class C12949a<T> extends AtomicBoolean implements C12321v<T>, C12314c {
        private static final long serialVersionUID = -7044685185359438206L;

        /* renamed from: a */
        final C12321v<? super T> f37344a;

        /* renamed from: b */
        final C12313b f37345b = new C12313b();

        C12949a(C12321v<? super T> vVar) {
            this.f37344a = vVar;
        }

        /* renamed from: a */
        public void mo41931a(C12314c cVar) {
            this.f37345b.mo42072b(cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f37345b.dispose();
            }
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f37345b.dispose();
                this.f37344a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f37345b.dispose();
                this.f37344a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                this.f37345b.dispose();
                this.f37344a.onSuccess(t);
            }
        }
    }

    public C12948b(C5941y<? extends T>[] yVarArr, Iterable<? extends C5941y<? extends T>> iterable) {
        this.f37342a = yVarArr;
        this.f37343b = iterable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        int i;
        C5941y<? extends T>[] yVarArr = this.f37342a;
        int i2 = 0;
        if (yVarArr == null) {
            yVarArr = new C5941y[8];
            try {
                i = 0;
                for (C5941y<? extends T> yVar : this.f37343b) {
                    if (yVar == null) {
                        C12348e.m55478a((Throwable) new NullPointerException("One of the sources is null"), vVar);
                        return;
                    }
                    if (i == yVarArr.length) {
                        C5941y<? extends T>[] yVarArr2 = new C5941y[((i >> 2) + i)];
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, i);
                        yVarArr = yVarArr2;
                    }
                    int i3 = i + 1;
                    yVarArr[i] = yVar;
                    i = i3;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55478a(th, vVar);
                return;
            }
        } else {
            i = yVarArr.length;
        }
        C12949a aVar = new C12949a(vVar);
        vVar.mo41931a(aVar);
        while (i2 < i) {
            C5941y<? extends T> yVar2 = yVarArr[i2];
            if (!aVar.mo41878d()) {
                if (yVar2 == null) {
                    aVar.onError(new NullPointerException("One of the MaybeSources is null"));
                    return;
                } else {
                    yVar2.mo24639a(aVar);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (i == 0) {
            vVar.onComplete();
        }
    }
}
