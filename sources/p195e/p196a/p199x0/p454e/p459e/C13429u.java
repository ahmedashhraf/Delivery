package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.u */
/* compiled from: ObservableCombineLatest */
public final class C13429u<T, R> extends C5923b0<R> {

    /* renamed from: N */
    final C12339o<? super Object[], ? extends R> f38847N;

    /* renamed from: O */
    final int f38848O;

    /* renamed from: P */
    final boolean f38849P;

    /* renamed from: a */
    final C5926g0<? extends T>[] f38850a;

    /* renamed from: b */
    final Iterable<? extends C5926g0<? extends T>> f38851b;

    /* renamed from: e.a.x0.e.e.u$a */
    /* compiled from: ObservableCombineLatest */
    static final class C13430a<T, R> extends AtomicReference<C12314c> implements C12280i0<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: a */
        final C13431b<T, R> f38852a;

        /* renamed from: b */
        final int f38853b;

        C13430a(C13431b<T, R> bVar, int i) {
            this.f38852a = bVar;
            this.f38853b = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f38852a.mo42893a(this.f38853b);
        }

        public void onError(Throwable th) {
            this.f38852a.mo42895a(this.f38853b, th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38852a.mo42894a(this.f38853b, t);
        }

        /* renamed from: a */
        public void mo42891a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }
    }

    /* renamed from: e.a.x0.e.e.u$b */
    /* compiled from: ObservableCombineLatest */
    static final class C13431b<T, R> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: N */
        final C13430a<T, R>[] f38854N;

        /* renamed from: O */
        Object[] f38855O;

        /* renamed from: P */
        final C13663c<Object[]> f38856P;

        /* renamed from: Q */
        final boolean f38857Q;

        /* renamed from: R */
        volatile boolean f38858R;

        /* renamed from: S */
        volatile boolean f38859S;

        /* renamed from: T */
        final C13746c f38860T = new C13746c();

        /* renamed from: U */
        int f38861U;

        /* renamed from: V */
        int f38862V;

        /* renamed from: a */
        final C12280i0<? super R> f38863a;

        /* renamed from: b */
        final C12339o<? super Object[], ? extends R> f38864b;

        C13431b(C12280i0<? super R> i0Var, C12339o<? super Object[], ? extends R> oVar, int i, int i2, boolean z) {
            this.f38863a = i0Var;
            this.f38864b = oVar;
            this.f38857Q = z;
            this.f38855O = new Object[i];
            C13430a<T, R>[] aVarArr = new C13430a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C13430a<>(this, i3);
            }
            this.f38854N = aVarArr;
            this.f38856P = new C13663c<>(i2);
        }

        /* renamed from: a */
        public void mo42897a(C5926g0<? extends T>[] g0VarArr) {
            C13430a<T, R>[] aVarArr = this.f38854N;
            int length = aVarArr.length;
            this.f38863a.mo34123a((C12314c) this);
            for (int i = 0; i < length && !this.f38859S && !this.f38858R; i++) {
                g0VarArr[i].mo23893a(aVarArr[i]);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38858R;
        }

        public void dispose() {
            if (!this.f38858R) {
                this.f38858R = true;
                mo42892a();
                if (getAndIncrement() == 0) {
                    mo42896a(this.f38856P);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42898e() {
            if (getAndIncrement() == 0) {
                C13663c<Object[]> cVar = this.f38856P;
                C12280i0<? super R> i0Var = this.f38863a;
                boolean z = this.f38857Q;
                int i = 1;
                while (!this.f38858R) {
                    if (z || this.f38860T.get() == null) {
                        boolean z2 = this.f38859S;
                        Object[] objArr = (Object[]) cVar.poll();
                        boolean z3 = objArr == null;
                        if (z2 && z3) {
                            mo42896a(cVar);
                            Throwable d = this.f38860T.mo43143d();
                            if (d == null) {
                                i0Var.onComplete();
                            } else {
                                i0Var.onError(d);
                            }
                            return;
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                i0Var.mo33453a(C12390b.m55563a(this.f38864b.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                this.f38860T.mo43142a(th);
                                mo42892a();
                                mo42896a(cVar);
                                i0Var.onError(this.f38860T.mo43143d());
                                return;
                            }
                        }
                    } else {
                        mo42892a();
                        mo42896a(cVar);
                        i0Var.onError(this.f38860T.mo43143d());
                        return;
                    }
                }
                mo42896a(cVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42892a() {
            for (C13430a<T, R> a : this.f38854N) {
                a.mo42891a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42896a(C13663c<?> cVar) {
            synchronized (this) {
                this.f38855O = null;
            }
            cVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo42898e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42894a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f38855O     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f38861U     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f38861U = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                e.a.x0.f.c<java.lang.Object[]> r4 = r3.f38856P     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo42898e()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13429u.C13431b.mo42894a(int, java.lang.Object):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42895a(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                e.a.x0.j.c r0 = r2.f38860T
                boolean r0 = r0.mo43142a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f38857Q
                r0 = 1
                if (r4 == 0) goto L_0x002c
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f38855O     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x0029 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f38862V     // Catch:{ all -> 0x0029 }
                int r1 = r1 + r0
                r2.f38862V = r1     // Catch:{ all -> 0x0029 }
                int r4 = r4.length     // Catch:{ all -> 0x0029 }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f38859S = r0     // Catch:{ all -> 0x0029 }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x002d
            L_0x0029:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r3
            L_0x002c:
                r3 = 1
            L_0x002d:
                if (r3 == 0) goto L_0x0032
                r2.mo42892a()
            L_0x0032:
                r2.mo42898e()
                goto L_0x0039
            L_0x0036:
                p195e.p196a.p439b1.C12205a.m54894b(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13429u.C13431b.mo42895a(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            mo42892a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            mo42898e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42893a(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f38855O     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f38862V     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f38862V = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f38859S = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.mo42892a()
            L_0x0021:
                r3.mo42898e()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13429u.C13431b.mo42893a(int):void");
        }
    }

    public C13429u(C5926g0<? extends T>[] g0VarArr, Iterable<? extends C5926g0<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f38850a = g0VarArr;
        this.f38851b = iterable;
        this.f38847N = oVar;
        this.f38848O = i;
        this.f38849P = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        int i;
        C5926g0<? extends T>[] g0VarArr = this.f38850a;
        if (g0VarArr == null) {
            g0VarArr = new C5923b0[8];
            i = 0;
            for (C5926g0<? extends T> g0Var : this.f38851b) {
                if (i == g0VarArr.length) {
                    C5926g0<? extends T>[] g0VarArr2 = new C5926g0[((i >> 2) + i)];
                    System.arraycopy(g0VarArr, 0, g0VarArr2, 0, i);
                    g0VarArr = g0VarArr2;
                }
                int i2 = i + 1;
                g0VarArr[i] = g0Var;
                i = i2;
            }
        } else {
            i = g0VarArr.length;
        }
        int i3 = i;
        if (i3 == 0) {
            C12348e.m55473a(i0Var);
            return;
        }
        C13431b bVar = new C13431b(i0Var, this.f38847N, i3, this.f38848O, this.f38849P);
        bVar.mo42897a(g0VarArr);
    }
}
