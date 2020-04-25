package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12398g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p466y0.C13772a;

/* renamed from: e.a.x0.e.e.g2 */
/* compiled from: ObservablePublish */
public final class C13222g2<T> extends C13772a<T> implements C12398g<T> {

    /* renamed from: N */
    final C5926g0<T> f38157N;

    /* renamed from: a */
    final C5926g0<T> f38158a;

    /* renamed from: b */
    final AtomicReference<C13224b<T>> f38159b;

    /* renamed from: e.a.x0.e.e.g2$a */
    /* compiled from: ObservablePublish */
    static final class C13223a<T> extends AtomicReference<Object> implements C12314c {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: a */
        final C12280i0<? super T> f38160a;

        C13223a(C12280i0<? super T> i0Var) {
            this.f38160a = i0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42739a(C13224b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.mo42741b(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == this;
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C13224b) andSet).mo42741b(this);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.g2$b */
    /* compiled from: ObservablePublish */
    static final class C13224b<T> implements C12280i0<T>, C12314c {

        /* renamed from: P */
        static final C13223a[] f38161P = new C13223a[0];

        /* renamed from: Q */
        static final C13223a[] f38162Q = new C13223a[0];

        /* renamed from: N */
        final AtomicBoolean f38163N;

        /* renamed from: O */
        final AtomicReference<C12314c> f38164O = new AtomicReference<>();

        /* renamed from: a */
        final AtomicReference<C13224b<T>> f38165a;

        /* renamed from: b */
        final AtomicReference<C13223a<T>[]> f38166b = new AtomicReference<>(f38161P);

        C13224b(AtomicReference<C13224b<T>> atomicReference) {
            this.f38165a = atomicReference;
            this.f38163N = new AtomicBoolean();
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38164O, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42741b(C13223a<T> aVar) {
            C13223a[] aVarArr;
            C13223a[] aVarArr2;
            do {
                aVarArr = (C13223a[]) this.f38166b.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f38161P;
                        } else {
                            C13223a[] aVarArr3 = new C13223a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f38166b.compareAndSet(aVarArr, aVarArr2));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38166b.get() == f38162Q;
        }

        public void dispose() {
            if (((C13223a[]) this.f38166b.getAndSet(f38162Q)) != f38162Q) {
                this.f38165a.compareAndSet(this, null);
                C12347d.m55465a(this.f38164O);
            }
        }

        public void onComplete() {
            this.f38165a.compareAndSet(this, null);
            for (C13223a aVar : (C13223a[]) this.f38166b.getAndSet(f38162Q)) {
                aVar.f38160a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f38165a.compareAndSet(this, null);
            C13223a[] aVarArr = (C13223a[]) this.f38166b.getAndSet(f38162Q);
            if (aVarArr.length != 0) {
                for (C13223a aVar : aVarArr) {
                    aVar.f38160a.onError(th);
                }
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            for (C13223a aVar : (C13223a[]) this.f38166b.get()) {
                aVar.f38160a.mo33453a(t);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42740a(C13223a<T> aVar) {
            C13223a[] aVarArr;
            C13223a[] aVarArr2;
            do {
                aVarArr = (C13223a[]) this.f38166b.get();
                if (aVarArr == f38162Q) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13223a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f38166b.compareAndSet(aVarArr, aVarArr2));
            return true;
        }
    }

    /* renamed from: e.a.x0.e.e.g2$c */
    /* compiled from: ObservablePublish */
    static final class C13225c<T> implements C5926g0<T> {

        /* renamed from: a */
        private final AtomicReference<C13224b<T>> f38167a;

        C13225c(AtomicReference<C13224b<T>> atomicReference) {
            this.f38167a = atomicReference;
        }

        /* renamed from: a */
        public void mo23893a(C12280i0<? super T> i0Var) {
            C13223a aVar = new C13223a(i0Var);
            i0Var.mo34123a((C12314c) aVar);
            while (true) {
                C13224b bVar = (C13224b) this.f38167a.get();
                if (bVar == null || bVar.mo41878d()) {
                    C13224b bVar2 = new C13224b(this.f38167a);
                    if (!this.f38167a.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo42740a(aVar)) {
                    aVar.mo42739a(bVar);
                    return;
                }
            }
        }
    }

    private C13222g2(C5926g0<T> g0Var, C5926g0<T> g0Var2, AtomicReference<C13224b<T>> atomicReference) {
        this.f38157N = g0Var;
        this.f38158a = g0Var2;
        this.f38159b = atomicReference;
    }

    /* renamed from: w */
    public static <T> C13772a<T> m57425w(C5926g0<T> g0Var) {
        AtomicReference atomicReference = new AtomicReference();
        return C12205a.m54877a((C13772a<T>) new C13222g2<T>(new C13225c(atomicReference), g0Var, atomicReference));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f38157N.mo23893a(i0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42738k(p195e.p196a.p449w0.C12331g<? super p195e.p196a.p447u0.C12314c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.g2$b<T>> r0 = r4.f38159b
            java.lang.Object r0 = r0.get()
            e.a.x0.e.e.g2$b r0 = (p195e.p196a.p199x0.p454e.p459e.C13222g2.C13224b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.mo41878d()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            e.a.x0.e.e.g2$b r1 = new e.a.x0.e.e.g2$b
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.g2$b<T>> r2 = r4.f38159b
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.g2$b<T>> r2 = r4.f38159b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f38163N
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f38163N
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.mo33410c(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            e.a.g0<T> r5 = r4.f38158a
            r5.mo23893a(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p212io.reactivex.exceptions.C14398a.m62357b(r5)
            java.lang.RuntimeException r5 = p195e.p196a.p199x0.p200j.C13754k.m58724c(r5)
            goto L_0x004a
        L_0x0049:
            throw r5
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13222g2.mo42738k(e.a.w0.g):void");
    }

    public C5926g0<T> source() {
        return this.f38158a;
    }
}
