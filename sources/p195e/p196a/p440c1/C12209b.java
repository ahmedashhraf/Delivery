package p195e.p196a.p440c1;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13743a;
import p195e.p196a.p199x0.p200j.C13743a.C13744a;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.c1.b */
/* compiled from: BehaviorProcessor */
public final class C12209b<T> extends C12211c<T> {

    /* renamed from: T */
    static final Object[] f35257T = new Object[0];

    /* renamed from: U */
    static final C12210a[] f35258U = new C12210a[0];

    /* renamed from: V */
    static final C12210a[] f35259V = new C12210a[0];

    /* renamed from: N */
    final ReadWriteLock f35260N;

    /* renamed from: O */
    final Lock f35261O;

    /* renamed from: P */
    final Lock f35262P;

    /* renamed from: Q */
    final AtomicReference<Object> f35263Q;

    /* renamed from: R */
    final AtomicReference<Throwable> f35264R;

    /* renamed from: S */
    long f35265S;

    /* renamed from: b */
    final AtomicReference<C12210a<T>[]> f35266b;

    /* renamed from: e.a.c1.b$a */
    /* compiled from: BehaviorProcessor */
    static final class C12210a<T> extends AtomicLong implements C14063d, C13744a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* renamed from: N */
        boolean f35267N;

        /* renamed from: O */
        boolean f35268O;

        /* renamed from: P */
        C13743a<Object> f35269P;

        /* renamed from: Q */
        boolean f35270Q;

        /* renamed from: R */
        volatile boolean f35271R;

        /* renamed from: S */
        long f35272S;

        /* renamed from: a */
        final C14062c<? super T> f35273a;

        /* renamed from: b */
        final C12209b<T> f35274b;

        C12210a(C14062c<? super T> cVar, C12209b<T> bVar) {
            this.f35273a = cVar;
            this.f35274b = bVar;
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
            mo41814d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41810a() {
            /*
                r4 = this;
                boolean r0 = r4.f35271R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f35271R     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f35267N     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                e.a.c1.b<T> r0 = r4.f35274b     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f35261O     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f35265S     // Catch:{ all -> 0x003e }
                r4.f35272S = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f35263Q     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f35268O = r2     // Catch:{ all -> 0x003e }
                r4.f35267N = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.mo41812b(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo41814d()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p440c1.C12209b.C12210a.mo41810a():void");
        }

        /* renamed from: b */
        public boolean mo41812b(Object obj) {
            if (this.f35271R) {
                return true;
            }
            if (C13761q.m58752e(obj)) {
                this.f35273a.onComplete();
                return true;
            } else if (C13761q.m58754g(obj)) {
                this.f35273a.onError(C13761q.m58746b(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.f35273a.mo41789a(C13761q.m58751d(obj));
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                    return false;
                }
                cancel();
                this.f35273a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            if (!this.f35271R) {
                this.f35271R = true;
                this.f35274b.mo41803b(this);
            }
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.a.a(e.a.x0.j.a$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo43134a((p195e.p196a.p199x0.p200j.C13743a.C13744a) r2);
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41814d() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f35271R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                e.a.x0.j.a<java.lang.Object> r0 = r2.f35269P     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f35268O = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f35269P = r1     // Catch:{ all -> 0x0017 }
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
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p440c1.C12209b.C12210a.mo41814d():void");
        }

        /* renamed from: e */
        public boolean mo41815e() {
            return get() == 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f35270Q = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41811a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f35271R
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f35270Q
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f35271R     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f35272S     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f35268O     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                e.a.x0.j.a<java.lang.Object> r5 = r3.f35269P     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                e.a.x0.j.a r5 = new e.a.x0.j.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f35269P = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo43135a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f35267N = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f35270Q = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.mo41812b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p440c1.C12209b.C12210a.mo41811a(java.lang.Object, long):void");
        }
    }

    C12209b() {
        this.f35263Q = new AtomicReference<>();
        this.f35260N = new ReentrantReadWriteLock();
        this.f35261O = this.f35260N.readLock();
        this.f35262P = this.f35260N.writeLock();
        this.f35266b = new AtomicReference<>(f35258U);
        this.f35264R = new AtomicReference<>();
    }

    @C5935d
    @C5937f
    /* renamed from: d0 */
    public static <T> C12209b<T> m54960d0() {
        return new C12209b<>();
    }

    @C5935d
    @C5937f
    /* renamed from: s */
    public static <T> C12209b<T> m54961s(T t) {
        C12390b.m55563a(t, "defaultValue is null");
        return new C12209b<>(t);
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        Object obj = this.f35263Q.get();
        if (C13761q.m58754g(obj)) {
            return C13761q.m58746b(obj);
        }
        return null;
    }

    /* renamed from: V */
    public boolean mo41784V() {
        return C13761q.m58752e(this.f35263Q.get());
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return ((C12210a[]) this.f35266b.get()).length != 0;
    }

    /* renamed from: X */
    public boolean mo41786X() {
        return C13761q.m58754g(this.f35263Q.get());
    }

    @C5938g
    /* renamed from: Z */
    public T mo41800Z() {
        Object obj = this.f35263Q.get();
        if (C13761q.m58752e(obj) || C13761q.m58754g(obj)) {
            return null;
        }
        return C13761q.m58751d(obj);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f35264R.get() != null) {
            dVar.cancel();
        } else {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: a0 */
    public Object[] mo41802a0() {
        Object[] c = mo41805c(f35257T);
        return c == f35257T ? new Object[0] : c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41803b(C12210a<T> aVar) {
        C12210a<T>[] aVarArr;
        C12210a[] aVarArr2;
        do {
            aVarArr = (C12210a[]) this.f35266b.get();
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
                        aVarArr2 = f35258U;
                    } else {
                        C12210a[] aVarArr3 = new C12210a[(length - 1)];
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
        } while (!this.f35266b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: b0 */
    public boolean mo41804b0() {
        Object obj = this.f35263Q.get();
        return obj != null && !C13761q.m58752e(obj) && !C13761q.m58754g(obj);
    }

    /* renamed from: c */
    public T[] mo41805c(T[] tArr) {
        Object obj = this.f35263Q.get();
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

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public int mo41806c0() {
        return ((C12210a[]) this.f35266b.get()).length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12210a aVar = new C12210a(cVar, this);
        cVar.mo41788a((C14063d) aVar);
        if (!mo41801a(aVar)) {
            Throwable th = (Throwable) this.f35264R.get();
            if (th == C13754k.f39801a) {
                cVar.onComplete();
            } else {
                cVar.onError(th);
            }
        } else if (aVar.f35271R) {
            mo41803b(aVar);
        } else {
            aVar.mo41810a();
        }
    }

    public void onComplete() {
        if (this.f35264R.compareAndSet(null, C13754k.f39801a)) {
            Object d = C13761q.m58750d();
            for (C12210a a : mo41809r(d)) {
                a.mo41811a(d, this.f35265S);
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35264R.compareAndSet(null, th)) {
            C12205a.m54894b(th);
            return;
        }
        Object a = C13761q.m58743a(th);
        for (C12210a a2 : mo41809r(a)) {
            a2.mo41811a(a, this.f35265S);
        }
    }

    @C5936e
    /* renamed from: p */
    public boolean mo41807p(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        C12210a[] aVarArr = (C12210a[]) this.f35266b.get();
        for (C12210a e : aVarArr) {
            if (e.mo41815e()) {
                return false;
            }
        }
        Object i = C13761q.m58756i(t);
        mo41808q(i);
        for (C12210a a : aVarArr) {
            a.mo41811a(i, this.f35265S);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo41808q(Object obj) {
        Lock lock = this.f35262P;
        lock.lock();
        this.f35265S++;
        this.f35263Q.lazySet(obj);
        lock.unlock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C12210a<T>[] mo41809r(Object obj) {
        C12210a<T>[] aVarArr = (C12210a[]) this.f35266b.get();
        C12210a<T>[] aVarArr2 = f35259V;
        if (aVarArr != aVarArr2) {
            aVarArr = (C12210a[]) this.f35266b.getAndSet(aVarArr2);
            if (aVarArr != f35259V) {
                mo41808q(obj);
            }
        }
        return aVarArr;
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35264R.get() == null) {
            Object i = C13761q.m58756i(t);
            mo41808q(i);
            for (C12210a a : (C12210a[]) this.f35266b.get()) {
                a.mo41811a(i, this.f35265S);
            }
        }
    }

    C12209b(T t) {
        this();
        this.f35263Q.lazySet(C12390b.m55563a(t, "defaultValue is null"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41801a(C12210a<T> aVar) {
        C12210a[] aVarArr;
        C12210a[] aVarArr2;
        do {
            aVarArr = (C12210a[]) this.f35266b.get();
            if (aVarArr == f35259V) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12210a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f35266b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
