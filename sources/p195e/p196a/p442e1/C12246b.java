package p195e.p196a.p442e1;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13743a.C13744a;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.b */
/* compiled from: BehaviorSubject */
public final class C12246b<T> extends C12265i<T> {

    /* renamed from: S */
    private static final Object[] f35360S = new Object[0];

    /* renamed from: T */
    static final C12247a[] f35361T = new C12247a[0];

    /* renamed from: U */
    static final C12247a[] f35362U = new C12247a[0];

    /* renamed from: N */
    final ReadWriteLock f35363N;

    /* renamed from: O */
    final Lock f35364O;

    /* renamed from: P */
    final Lock f35365P;

    /* renamed from: Q */
    final AtomicReference<Throwable> f35366Q;

    /* renamed from: R */
    long f35367R;

    /* renamed from: a */
    final AtomicReference<Object> f35368a;

    /* renamed from: b */
    final AtomicReference<C12247a<T>[]> f35369b;

    /* renamed from: e.a.e1.b$a */
    /* compiled from: BehaviorSubject */
    static final class C12247a<T> implements C12314c, C13744a<Object> {

        /* renamed from: N */
        boolean f35370N;

        /* renamed from: O */
        boolean f35371O;

        /* renamed from: P */
        C13743a<Object> f35372P;

        /* renamed from: Q */
        boolean f35373Q;

        /* renamed from: R */
        volatile boolean f35374R;

        /* renamed from: S */
        long f35375S;

        /* renamed from: a */
        final C12280i0<? super T> f35376a;

        /* renamed from: b */
        final C12246b<T> f35377b;

        C12247a(C12280i0<? super T> i0Var, C12246b<T> bVar) {
            this.f35376a = i0Var;
            this.f35377b = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (mo41812b(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo41920b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41918a() {
            /*
                r4 = this;
                boolean r0 = r4.f35374R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f35374R     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f35370N     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                e.a.e1.b<T> r0 = r4.f35377b     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f35364O     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f35367R     // Catch:{ all -> 0x003e }
                r4.f35375S = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f35368a     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f35371O = r2     // Catch:{ all -> 0x003e }
                r4.f35370N = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.mo41812b(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo41920b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p442e1.C12246b.C12247a.mo41918a():void");
        }

        /* renamed from: b */
        public boolean mo41812b(Object obj) {
            return this.f35374R || C13761q.m58744a(obj, this.f35376a);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35374R;
        }

        public void dispose() {
            if (!this.f35374R) {
                this.f35374R = true;
                this.f35377b.mo41914b(this);
            }
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.a.a(e.a.x0.j.a$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo43134a((p195e.p196a.p199x0.p200j.C13743a.C13744a) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41920b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f35374R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                e.a.x0.j.a<java.lang.Object> r0 = r2.f35372P     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f35371O = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f35372P = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo43134a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                goto L_0x001b
            L_0x001a:
                throw r0
            L_0x001b:
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p442e1.C12246b.C12247a.mo41920b():void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f35373Q = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41919a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f35374R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f35373Q
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f35374R     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f35375S     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f35371O     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                e.a.x0.j.a<java.lang.Object> r5 = r3.f35372P     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                e.a.x0.j.a r5 = new e.a.x0.j.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f35372P = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo43135a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f35370N = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f35373Q = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.mo41812b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p442e1.C12246b.C12247a.mo41919a(java.lang.Object, long):void");
        }
    }

    C12246b() {
        this.f35363N = new ReentrantReadWriteLock();
        this.f35364O = this.f35363N.readLock();
        this.f35365P = this.f35363N.writeLock();
        this.f35369b = new AtomicReference<>(f35361T);
        this.f35368a = new AtomicReference<>();
        this.f35366Q = new AtomicReference<>();
    }

    @C5935d
    @C5937f
    /* renamed from: Y */
    public static <T> C12246b<T> m55134Y() {
        return new C12246b<>();
    }

    @C5935d
    @C5937f
    /* renamed from: q */
    public static <T> C12246b<T> m55135q(T t) {
        return new C12246b<>(t);
    }

    @C5938g
    /* renamed from: P */
    public Throwable mo41897P() {
        Object obj = this.f35368a.get();
        if (C13761q.m58754g(obj)) {
            return C13761q.m58746b(obj);
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return C13761q.m58752e(this.f35368a.get());
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return ((C12247a[]) this.f35369b.get()).length != 0;
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return C13761q.m58754g(this.f35368a.get());
    }

    @C5938g
    /* renamed from: U */
    public T mo41909U() {
        Object obj = this.f35368a.get();
        if (C13761q.m58752e(obj) || C13761q.m58754g(obj)) {
            return null;
        }
        return C13761q.m58751d(obj);
    }

    /* renamed from: V */
    public Object[] mo41910V() {
        Object[] c = mo41915c(f35360S);
        return c == f35360S ? new Object[0] : c;
    }

    /* renamed from: W */
    public boolean mo41911W() {
        Object obj = this.f35368a.get();
        return obj != null && !C13761q.m58752e(obj) && !C13761q.m58754g(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public int mo41912X() {
        return ((C12247a[]) this.f35369b.get()).length;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (this.f35366Q.get() != null) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41914b(C12247a<T> aVar) {
        C12247a<T>[] aVarArr;
        C12247a[] aVarArr2;
        do {
            aVarArr = (C12247a[]) this.f35369b.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f35361T;
                    } else {
                        C12247a[] aVarArr3 = new C12247a[(length - 1)];
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
        } while (!this.f35369b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: c */
    public T[] mo41915c(T[] tArr) {
        Object obj = this.f35368a.get();
        if (obj == null || C13761q.m58752e(obj) || C13761q.m58754g(obj)) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        T d = C13761q.m58751d(obj);
        if (tArr.length != 0) {
            tArr[0] = d;
            if (tArr.length != 1) {
                tArr[1] = null;
            }
        } else {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
            tArr[0] = d;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12247a aVar = new C12247a(i0Var, this);
        i0Var.mo34123a((C12314c) aVar);
        if (!mo41913a(aVar)) {
            Throwable th = (Throwable) this.f35366Q.get();
            if (th == C13754k.f39801a) {
                i0Var.onComplete();
            } else {
                i0Var.onError(th);
            }
        } else if (aVar.f35374R) {
            mo41914b(aVar);
        } else {
            aVar.mo41918a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo41916o(Object obj) {
        this.f35365P.lock();
        this.f35367R++;
        this.f35368a.lazySet(obj);
        this.f35365P.unlock();
    }

    public void onComplete() {
        if (this.f35366Q.compareAndSet(null, C13754k.f39801a)) {
            Object d = C13761q.m58750d();
            for (C12247a a : mo41917p(d)) {
                a.mo41919a(d, this.f35367R);
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35366Q.compareAndSet(null, th)) {
            C12205a.m54894b(th);
            return;
        }
        Object a = C13761q.m58743a(th);
        for (C12247a a2 : mo41917p(a)) {
            a2.mo41919a(a, this.f35367R);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public C12247a<T>[] mo41917p(Object obj) {
        C12247a<T>[] aVarArr = (C12247a[]) this.f35369b.getAndSet(f35362U);
        if (aVarArr != f35362U) {
            mo41916o(obj);
        }
        return aVarArr;
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35366Q.get() == null) {
            Object i = C13761q.m58756i(t);
            mo41916o(i);
            for (C12247a a : (C12247a[]) this.f35369b.get()) {
                a.mo41919a(i, this.f35367R);
            }
        }
    }

    C12246b(T t) {
        this();
        this.f35368a.lazySet(C12390b.m55563a(t, "defaultValue is null"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41913a(C12247a<T> aVar) {
        C12247a[] aVarArr;
        C12247a[] aVarArr2;
        do {
            aVarArr = (C12247a[]) this.f35369b.get();
            if (aVarArr == f35362U) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12247a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35369b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
