package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.m3 */
/* compiled from: ObservableSwitchMap */
public final class C13315m3<T, R> extends C13131a<T, R> {

    /* renamed from: N */
    final int f38481N;

    /* renamed from: O */
    final boolean f38482O;

    /* renamed from: b */
    final C12339o<? super T, ? extends C5926g0<? extends R>> f38483b;

    /* renamed from: e.a.x0.e.e.m3$a */
    /* compiled from: ObservableSwitchMap */
    static final class C13316a<T, R> extends AtomicReference<C12314c> implements C12280i0<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: N */
        final int f38484N;

        /* renamed from: O */
        volatile C12406o<R> f38485O;

        /* renamed from: P */
        volatile boolean f38486P;

        /* renamed from: a */
        final C13317b<T, R> f38487a;

        /* renamed from: b */
        final long f38488b;

        C13316a(C13317b<T, R> bVar, long j, int i) {
            this.f38487a = bVar;
            this.f38488b = j;
            this.f38484N = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                if (cVar instanceof C12401j) {
                    C12401j jVar = (C12401j) cVar;
                    int a = jVar.mo41855a(3);
                    if (a == 1) {
                        this.f38485O = jVar;
                        this.f38486P = true;
                        this.f38487a.mo42807e();
                        return;
                    } else if (a == 2) {
                        this.f38485O = jVar;
                        return;
                    }
                }
                this.f38485O = new C13663c(this.f38484N);
            }
        }

        public void onComplete() {
            if (this.f38488b == this.f38487a.f38497U) {
                this.f38486P = true;
                this.f38487a.mo42807e();
            }
        }

        public void onError(Throwable th) {
            this.f38487a.mo42806a(this, th);
        }

        /* renamed from: a */
        public void mo33453a(R r) {
            if (this.f38488b == this.f38487a.f38497U) {
                if (r != null) {
                    this.f38485O.offer(r);
                }
                this.f38487a.mo42807e();
            }
        }

        /* renamed from: a */
        public void mo42804a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }
    }

    /* renamed from: e.a.x0.e.e.m3$b */
    /* compiled from: ObservableSwitchMap */
    static final class C13317b<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {

        /* renamed from: V */
        static final C13316a<Object, Object> f38489V = new C13316a<>(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: N */
        final int f38490N;

        /* renamed from: O */
        final boolean f38491O;

        /* renamed from: P */
        final C13746c f38492P;

        /* renamed from: Q */
        volatile boolean f38493Q;

        /* renamed from: R */
        volatile boolean f38494R;

        /* renamed from: S */
        C12314c f38495S;

        /* renamed from: T */
        final AtomicReference<C13316a<T, R>> f38496T = new AtomicReference<>();

        /* renamed from: U */
        volatile long f38497U;

        /* renamed from: a */
        final C12280i0<? super R> f38498a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C5926g0<? extends R>> f38499b;

        static {
            f38489V.mo42804a();
        }

        C13317b(C12280i0<? super R> i0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, int i, boolean z) {
            this.f38498a = i0Var;
            this.f38499b = oVar;
            this.f38490N = i;
            this.f38491O = z;
            this.f38492P = new C13746c();
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38495S, cVar)) {
                this.f38495S = cVar;
                this.f38498a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38494R;
        }

        public void dispose() {
            if (!this.f38494R) {
                this.f38494R = true;
                this.f38495S.dispose();
                mo42805a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x000f A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42807e() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                e.a.i0<? super R> r0 = r13.f38498a
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.m3$a<T, R>> r1 = r13.f38496T
                boolean r2 = r13.f38491O
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.f38494R
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.f38493Q
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                e.a.x0.j.c r1 = r13.f38492P
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                e.a.x0.j.c r7 = r13.f38492P
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                e.a.x0.j.c r1 = r13.f38492P
                java.lang.Throwable r1 = r1.mo43143d()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                e.a.x0.e.e.m3$a r5 = (p195e.p196a.p199x0.p454e.p459e.C13315m3.C13316a) r5
                if (r5 == 0) goto L_0x00e9
                e.a.x0.c.o<R> r7 = r5.f38485O
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f38486P
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                e.a.x0.j.c r10 = r13.f38492P
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                e.a.x0.j.c r1 = r13.f38492P
                java.lang.Throwable r1 = r1.mo43143d()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.f38494R
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                e.a.x0.j.c r10 = r13.f38492P
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                e.a.x0.j.c r1 = r13.f38492P
                java.lang.Throwable r1 = r1.mo43143d()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f38486P
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r8)
                e.a.x0.j.c r11 = r13.f38492P
                r11.mo43142a(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.mo42805a()
                e.a.u0.c r8 = r13.f38495S
                r8.dispose()
                r13.f38493Q = r3
                goto L_0x00d0
            L_0x00cd:
                r5.mo42804a()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.mo33453a(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13315m3.C13317b.mo42807e():void");
        }

        public void onComplete() {
            if (!this.f38493Q) {
                this.f38493Q = true;
                mo42807e();
            }
        }

        public void onError(Throwable th) {
            if (this.f38493Q || !this.f38492P.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f38491O) {
                mo42805a();
            }
            this.f38493Q = true;
            mo42807e();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            long j = this.f38497U + 1;
            this.f38497U = j;
            C13316a aVar = (C13316a) this.f38496T.get();
            if (aVar != null) {
                aVar.mo42804a();
            }
            try {
                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38499b.apply(t), "The ObservableSource returned is null");
                C13316a aVar2 = new C13316a(this, j, this.f38490N);
                while (true) {
                    C13316a<Object, Object> aVar3 = (C13316a) this.f38496T.get();
                    if (aVar3 != f38489V) {
                        if (this.f38496T.compareAndSet(aVar3, aVar2)) {
                            g0Var.mo23893a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f38495S.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42805a() {
            C13316a<Object, Object> aVar = (C13316a) this.f38496T.get();
            C13316a<Object, Object> aVar2 = f38489V;
            if (aVar != aVar2) {
                C13316a<Object, Object> aVar3 = (C13316a) this.f38496T.getAndSet(aVar2);
                if (aVar3 != f38489V && aVar3 != null) {
                    aVar3.mo42804a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42806a(C13316a<T, R> aVar, Throwable th) {
            if (aVar.f38488b != this.f38497U || !this.f38492P.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f38491O) {
                this.f38495S.dispose();
            }
            aVar.f38486P = true;
            mo42807e();
        }
    }

    public C13315m3(C5926g0<T> g0Var, C12339o<? super T, ? extends C5926g0<? extends R>> oVar, int i, boolean z) {
        super(g0Var);
        this.f38483b = oVar;
        this.f38481N = i;
        this.f38482O = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        if (!C13478x2.m58082a(this.f37851a, i0Var, this.f38483b)) {
            this.f37851a.mo23893a(new C13317b(i0Var, this.f38483b, this.f38481N, this.f38482O));
        }
    }
}
