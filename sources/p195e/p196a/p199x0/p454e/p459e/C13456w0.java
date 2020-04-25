package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.w0 */
/* compiled from: ObservableFlatMap */
public final class C13456w0<T, U> extends C13131a<T, U> {

    /* renamed from: N */
    final boolean f38960N;

    /* renamed from: O */
    final int f38961O;

    /* renamed from: P */
    final int f38962P;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<? extends U>> f38963b;

    /* renamed from: e.a.x0.e.e.w0$a */
    /* compiled from: ObservableFlatMap */
    static final class C13457a<T, U> extends AtomicReference<C12314c> implements C12280i0<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: N */
        volatile boolean f38964N;

        /* renamed from: O */
        volatile C12406o<U> f38965O;

        /* renamed from: P */
        int f38966P;

        /* renamed from: a */
        final long f38967a;

        /* renamed from: b */
        final C13458b<T, U> f38968b;

        C13457a(C13458b<T, U> bVar, long j) {
            this.f38967a = j;
            this.f38968b = bVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar) && (cVar instanceof C12401j)) {
                C12401j jVar = (C12401j) cVar;
                int a = jVar.mo41855a(7);
                if (a == 1) {
                    this.f38966P = a;
                    this.f38965O = jVar;
                    this.f38964N = true;
                    this.f38968b.mo42923f();
                } else if (a == 2) {
                    this.f38966P = a;
                    this.f38965O = jVar;
                }
            }
        }

        public void onComplete() {
            this.f38964N = true;
            this.f38968b.mo42923f();
        }

        public void onError(Throwable th) {
            if (this.f38968b.f38976S.mo43142a(th)) {
                C13458b<T, U> bVar = this.f38968b;
                if (!bVar.f38971N) {
                    bVar.mo42922e();
                }
                this.f38964N = true;
                this.f38968b.mo42923f();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(U u) {
            if (this.f38966P == 0) {
                this.f38968b.mo42917a(u, this);
            } else {
                this.f38968b.mo42923f();
            }
        }

        /* renamed from: a */
        public void mo42915a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }
    }

    /* renamed from: e.a.x0.e.e.w0$b */
    /* compiled from: ObservableFlatMap */
    static final class C13458b<T, U> extends AtomicInteger implements C12314c, C12280i0<T> {

        /* renamed from: b0 */
        static final C13457a<?, ?>[] f38969b0 = new C13457a[0];

        /* renamed from: c0 */
        static final C13457a<?, ?>[] f38970c0 = new C13457a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: N */
        final boolean f38971N;

        /* renamed from: O */
        final int f38972O;

        /* renamed from: P */
        final int f38973P;

        /* renamed from: Q */
        volatile C12405n<U> f38974Q;

        /* renamed from: R */
        volatile boolean f38975R;

        /* renamed from: S */
        final C13746c f38976S = new C13746c();

        /* renamed from: T */
        volatile boolean f38977T;

        /* renamed from: U */
        final AtomicReference<C13457a<?, ?>[]> f38978U;

        /* renamed from: V */
        C12314c f38979V;

        /* renamed from: W */
        long f38980W;

        /* renamed from: X */
        long f38981X;

        /* renamed from: Y */
        int f38982Y;

        /* renamed from: Z */
        Queue<C5926g0<? extends U>> f38983Z;

        /* renamed from: a */
        final C12280i0<? super U> f38984a;

        /* renamed from: a0 */
        int f38985a0;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends U>> f38986b;

        C13458b(C12280i0<? super U> i0Var, C12339o<? super T, ? extends C5926g0<? extends U>> oVar, boolean z, int i, int i2) {
            this.f38984a = i0Var;
            this.f38986b = oVar;
            this.f38971N = z;
            this.f38972O = i;
            this.f38973P = i2;
            if (i != Integer.MAX_VALUE) {
                this.f38983Z = new ArrayDeque(i);
            }
            this.f38978U = new AtomicReference<>(f38969b0);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38979V, cVar)) {
                this.f38979V = cVar;
                this.f38984a.mo34123a((C12314c) this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42921b(C13457a<T, U> aVar) {
            C13457a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C13457a[]) this.f38978U.get();
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
                            obj = f38969b0;
                        } else {
                            C13457a[] aVarArr2 = new C13457a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f38978U.compareAndSet(aVarArr, obj));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38977T;
        }

        public void dispose() {
            if (!this.f38977T) {
                this.f38977T = true;
                if (mo42922e()) {
                    Throwable d = this.f38976S.mo43143d();
                    if (d != null && d != C13754k.f39801a) {
                        C12205a.m54894b(d);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo42922e() {
            this.f38979V.dispose();
            C13457a<?, ?>[] aVarArr = (C13457a[]) this.f38978U.get();
            C13457a<?, ?>[] aVarArr2 = f38970c0;
            if (aVarArr != aVarArr2) {
                C13457a<?, ?>[] aVarArr3 = (C13457a[]) this.f38978U.getAndSet(aVarArr2);
                if (aVarArr3 != f38970c0) {
                    for (C13457a<?, ?> a : aVarArr3) {
                        a.mo42915a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42923f() {
            if (getAndIncrement() == 0) {
                mo42924g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b7, code lost:
            if (r12 != null) goto L_0x00a5;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42924g() {
            /*
                r14 = this;
                e.a.i0<? super U> r0 = r14.f38984a
                r1 = 1
                r2 = 1
            L_0x0004:
                boolean r3 = r14.mo42918a()
                if (r3 == 0) goto L_0x000b
                return
            L_0x000b:
                e.a.x0.c.n<U> r3 = r14.f38974Q
                if (r3 == 0) goto L_0x0023
            L_0x000f:
                boolean r4 = r14.mo42918a()
                if (r4 == 0) goto L_0x0016
                return
            L_0x0016:
                java.lang.Object r4 = r3.poll()
                if (r4 != 0) goto L_0x001f
                if (r4 != 0) goto L_0x000f
                goto L_0x0023
            L_0x001f:
                r0.mo33453a(r4)
                goto L_0x000f
            L_0x0023:
                boolean r3 = r14.f38975R
                e.a.x0.c.n<U> r4 = r14.f38974Q
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.w0$a<?, ?>[]> r5 = r14.f38978U
                java.lang.Object r5 = r5.get()
                e.a.x0.e.e.w0$a[] r5 = (p195e.p196a.p199x0.p454e.p459e.C13456w0.C13457a[]) r5
                int r6 = r5.length
                int r7 = r14.f38972O
                r8 = 2147483647(0x7fffffff, float:NaN)
                r9 = 0
                if (r7 == r8) goto L_0x0044
                monitor-enter(r14)
                java.util.Queue<e.a.g0<? extends U>> r7 = r14.f38983Z     // Catch:{ all -> 0x0041 }
                int r7 = r7.size()     // Catch:{ all -> 0x0041 }
                monitor-exit(r14)     // Catch:{ all -> 0x0041 }
                goto L_0x0045
            L_0x0041:
                r0 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x0041 }
                throw r0
            L_0x0044:
                r7 = 0
            L_0x0045:
                if (r3 == 0) goto L_0x0067
                if (r4 == 0) goto L_0x004f
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L_0x0067
            L_0x004f:
                if (r6 != 0) goto L_0x0067
                if (r7 != 0) goto L_0x0067
                e.a.x0.j.c r1 = r14.f38976S
                java.lang.Throwable r1 = r1.mo43143d()
                java.lang.Throwable r2 = p195e.p196a.p199x0.p200j.C13754k.f39801a
                if (r1 == r2) goto L_0x0066
                if (r1 != 0) goto L_0x0063
                r0.onComplete()
                goto L_0x0066
            L_0x0063:
                r0.onError(r1)
            L_0x0066:
                return
            L_0x0067:
                if (r6 == 0) goto L_0x0106
                long r3 = r14.f38981X
                int r7 = r14.f38982Y
                if (r6 <= r7) goto L_0x0077
                r10 = r5[r7]
                long r10 = r10.f38967a
                int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r12 == 0) goto L_0x0098
            L_0x0077:
                if (r6 > r7) goto L_0x007a
                r7 = 0
            L_0x007a:
                r10 = r7
                r7 = 0
            L_0x007c:
                if (r7 >= r6) goto L_0x008f
                r11 = r5[r10]
                long r11 = r11.f38967a
                int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r13 != 0) goto L_0x0087
                goto L_0x008f
            L_0x0087:
                int r10 = r10 + 1
                if (r10 != r6) goto L_0x008c
                r10 = 0
            L_0x008c:
                int r7 = r7 + 1
                goto L_0x007c
            L_0x008f:
                r14.f38982Y = r10
                r3 = r5[r10]
                long r3 = r3.f38967a
                r14.f38981X = r3
                r7 = r10
            L_0x0098:
                r3 = 0
                r4 = 0
            L_0x009a:
                if (r3 >= r6) goto L_0x00fd
                boolean r10 = r14.mo42918a()
                if (r10 == 0) goto L_0x00a3
                return
            L_0x00a3:
                r10 = r5[r7]
            L_0x00a5:
                boolean r11 = r14.mo42918a()
                if (r11 == 0) goto L_0x00ac
                return
            L_0x00ac:
                e.a.x0.c.o<U> r11 = r10.f38965O
                if (r11 != 0) goto L_0x00b1
                goto L_0x00b9
            L_0x00b1:
                java.lang.Object r12 = r11.poll()     // Catch:{ all -> 0x00e2 }
                if (r12 != 0) goto L_0x00d8
                if (r12 != 0) goto L_0x00a5
            L_0x00b9:
                boolean r11 = r10.f38964N
                e.a.x0.c.o<U> r12 = r10.f38965O
                if (r11 == 0) goto L_0x00d2
                if (r12 == 0) goto L_0x00c7
                boolean r11 = r12.isEmpty()
                if (r11 == 0) goto L_0x00d2
            L_0x00c7:
                r14.mo42921b(r10)
                boolean r4 = r14.mo42918a()
                if (r4 == 0) goto L_0x00d1
                return
            L_0x00d1:
                r4 = 1
            L_0x00d2:
                int r7 = r7 + 1
                if (r7 != r6) goto L_0x00fb
                r7 = 0
                goto L_0x00fb
            L_0x00d8:
                r0.mo33453a(r12)
                boolean r12 = r14.mo42918a()
                if (r12 == 0) goto L_0x00b1
                return
            L_0x00e2:
                r4 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                r10.mo42915a()
                e.a.x0.j.c r11 = r14.f38976S
                r11.mo43142a(r4)
                boolean r4 = r14.mo42918a()
                if (r4 == 0) goto L_0x00f5
                return
            L_0x00f5:
                r14.mo42921b(r10)
                int r3 = r3 + 1
                r4 = 1
            L_0x00fb:
                int r3 = r3 + r1
                goto L_0x009a
            L_0x00fd:
                r14.f38982Y = r7
                r3 = r5[r7]
                long r5 = r3.f38967a
                r14.f38981X = r5
                goto L_0x0107
            L_0x0106:
                r4 = 0
            L_0x0107:
                if (r4 == 0) goto L_0x0129
                int r3 = r14.f38972O
                if (r3 == r8) goto L_0x0004
                monitor-enter(r14)
                java.util.Queue<e.a.g0<? extends U>> r3 = r14.f38983Z     // Catch:{ all -> 0x0126 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0126 }
                e.a.g0 r3 = (p195e.p196a.C5926g0) r3     // Catch:{ all -> 0x0126 }
                if (r3 != 0) goto L_0x0120
                int r3 = r14.f38985a0     // Catch:{ all -> 0x0126 }
                int r3 = r3 - r1
                r14.f38985a0 = r3     // Catch:{ all -> 0x0126 }
                monitor-exit(r14)     // Catch:{ all -> 0x0126 }
                goto L_0x0004
            L_0x0120:
                monitor-exit(r14)     // Catch:{ all -> 0x0126 }
                r14.mo42916a(r3)
                goto L_0x0004
            L_0x0126:
                r0 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x0126 }
                throw r0
            L_0x0129:
                int r2 = -r2
                int r2 = r14.addAndGet(r2)
                if (r2 != 0) goto L_0x0004
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13456w0.C13458b.mo42924g():void");
        }

        public void onComplete() {
            if (!this.f38975R) {
                this.f38975R = true;
                mo42923f();
            }
        }

        public void onError(Throwable th) {
            if (this.f38975R) {
                C12205a.m54894b(th);
                return;
            }
            if (this.f38976S.mo43142a(th)) {
                this.f38975R = true;
                mo42923f();
            } else {
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38975R) {
                try {
                    C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38986b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f38972O != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f38985a0 == this.f38972O) {
                                this.f38983Z.offer(g0Var);
                                return;
                            }
                            this.f38985a0++;
                        }
                    }
                    mo42916a(g0Var);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38979V.dispose();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42916a(C5926g0<? extends U> g0Var) {
            C5926g0<? extends U> g0Var2;
            while (g0Var instanceof Callable) {
                if (mo42920a((Callable) g0Var) && this.f38972O != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        g0Var2 = (C5926g0) this.f38983Z.poll();
                        if (g0Var2 == null) {
                            this.f38985a0--;
                            z = true;
                        }
                    }
                    if (z) {
                        mo42923f();
                        return;
                    }
                    g0Var = g0Var2;
                } else {
                    return;
                }
            }
            long j = this.f38980W;
            this.f38980W = 1 + j;
            C13457a aVar = new C13457a(this, j);
            if (mo42919a(aVar)) {
                g0Var.mo23893a(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42919a(C13457a<T, U> aVar) {
            C13457a<?, ?>[] aVarArr;
            C13457a[] aVarArr2;
            do {
                aVarArr = (C13457a[]) this.f38978U.get();
                if (aVarArr == f38970c0) {
                    aVar.mo42915a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13457a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f38978U.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42920a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C12405n<U> nVar = this.f38974Q;
                    if (nVar == null) {
                        int i = this.f38972O;
                        if (i == Integer.MAX_VALUE) {
                            nVar = new C13663c<>(this.f38973P);
                        } else {
                            nVar = new C13662b<>(i);
                        }
                        this.f38974Q = nVar;
                    }
                    if (!nVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f38984a.mo33453a(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo42924g();
                return true;
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f38976S.mo43142a(th);
                mo42923f();
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42917a(U u, C13457a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12406o oVar = aVar.f38965O;
                if (oVar == null) {
                    oVar = new C13663c(this.f38973P);
                    aVar.f38965O = oVar;
                }
                oVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f38984a.mo33453a(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo42924g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42918a() {
            if (this.f38977T) {
                return true;
            }
            Throwable th = (Throwable) this.f38976S.get();
            if (this.f38971N || th == null) {
                return false;
            }
            mo42922e();
            Throwable d = this.f38976S.mo43143d();
            if (d != C13754k.f39801a) {
                this.f38984a.onError(d);
            }
            return true;
        }
    }

    public C13456w0(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<? extends U>> oVar, boolean z, int i, int i2) {
        super(g0Var);
        this.f38963b = oVar;
        this.f38960N = z;
        this.f38961O = i;
        this.f38962P = i2;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super U> i0Var) {
        if (!C13478x2.m58082a(this.f37851a, i0Var, this.f38963b)) {
            C5926g0<T> g0Var = this.f37851a;
            C13458b bVar = new C13458b(i0Var, this.f38963b, this.f38960N, this.f38961O, this.f38962P);
            g0Var.mo23893a(bVar);
        }
    }
}
