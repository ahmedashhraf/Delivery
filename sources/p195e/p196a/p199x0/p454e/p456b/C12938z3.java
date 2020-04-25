package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.z3 */
/* compiled from: FlowableSwitchMap */
public final class C12938z3<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C6007b<? extends R>> f37305N;

    /* renamed from: O */
    final int f37306O;

    /* renamed from: P */
    final boolean f37307P;

    /* renamed from: e.a.x0.e.b.z3$a */
    /* compiled from: FlowableSwitchMap */
    static final class C12939a<T, R> extends AtomicReference<C14063d> implements C12297q<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: N */
        final int f37308N;

        /* renamed from: O */
        volatile C12406o<R> f37309O;

        /* renamed from: P */
        volatile boolean f37310P;

        /* renamed from: Q */
        int f37311Q;

        /* renamed from: a */
        final C12940b<T, R> f37312a;

        /* renamed from: b */
        final long f37313b;

        C12939a(C12940b<T, R> bVar, long j, int i) {
            this.f37312a = bVar;
            this.f37313b = j;
            this.f37308N = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f37311Q = a;
                        this.f37309O = lVar;
                        this.f37310P = true;
                        this.f37312a.mo42556d();
                        return;
                    } else if (a == 2) {
                        this.f37311Q = a;
                        this.f37309O = lVar;
                        dVar.mo41813c((long) this.f37308N);
                        return;
                    }
                }
                this.f37309O = new C13662b(this.f37308N);
                dVar.mo41813c((long) this.f37308N);
            }
        }

        public void onComplete() {
            C12940b<T, R> bVar = this.f37312a;
            if (this.f37313b == bVar.f37323V) {
                this.f37310P = true;
                bVar.mo42556d();
            }
        }

        public void onError(Throwable th) {
            C12940b<T, R> bVar = this.f37312a;
            if (this.f37313b != bVar.f37323V || !bVar.f37318Q.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!bVar.f37316O) {
                bVar.f37320S.cancel();
            }
            this.f37310P = true;
            bVar.mo42556d();
        }

        /* renamed from: a */
        public void mo41789a(R r) {
            C12940b<T, R> bVar = this.f37312a;
            if (this.f37313b == bVar.f37323V) {
                if (this.f37311Q != 0 || this.f37309O.offer(r)) {
                    bVar.mo42556d();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        /* renamed from: a */
        public void mo42554a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    /* renamed from: e.a.x0.e.b.z3$b */
    /* compiled from: FlowableSwitchMap */
    static final class C12940b<T, R> extends AtomicInteger implements C12297q<T>, C14063d {

        /* renamed from: W */
        static final C12939a<Object, Object> f37314W = new C12939a<>(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: N */
        final int f37315N;

        /* renamed from: O */
        final boolean f37316O;

        /* renamed from: P */
        volatile boolean f37317P;

        /* renamed from: Q */
        final C13746c f37318Q;

        /* renamed from: R */
        volatile boolean f37319R;

        /* renamed from: S */
        C14063d f37320S;

        /* renamed from: T */
        final AtomicReference<C12939a<T, R>> f37321T = new AtomicReference<>();

        /* renamed from: U */
        final AtomicLong f37322U = new AtomicLong();

        /* renamed from: V */
        volatile long f37323V;

        /* renamed from: a */
        final C14062c<? super R> f37324a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<? extends R>> f37325b;

        static {
            f37314W.mo42554a();
        }

        C12940b(C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
            this.f37324a = cVar;
            this.f37325b = oVar;
            this.f37315N = i;
            this.f37316O = z;
            this.f37318Q = new C13746c();
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37320S, dVar)) {
                this.f37320S = dVar;
                this.f37324a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37322U, j);
                if (this.f37323V == 0) {
                    this.f37320S.mo41813c(Long.MAX_VALUE);
                } else {
                    mo42556d();
                }
            }
        }

        public void cancel() {
            if (!this.f37319R) {
                this.f37319R = true;
                this.f37320S.cancel();
                mo42555a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e5, code lost:
            r14 = true;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42556d() {
            /*
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                i.e.c<? super R> r2 = r1.f37324a
                r4 = 1
            L_0x000c:
                boolean r0 = r1.f37319R
                r5 = 0
                if (r0 == 0) goto L_0x0017
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                r0.lazySet(r5)
                return
            L_0x0017:
                boolean r0 = r1.f37317P
                if (r0 == 0) goto L_0x0062
                boolean r0 = r1.f37316O
                if (r0 == 0) goto L_0x003f
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0062
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x003b
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                goto L_0x003e
            L_0x003b:
                r2.onComplete()
            L_0x003e:
                return
            L_0x003f:
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0056
                r17.mo42555a()
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x0056:
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0062
                r2.onComplete()
                return
            L_0x0062:
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                java.lang.Object r0 = r0.get()
                r6 = r0
                e.a.x0.e.b.z3$a r6 = (p195e.p196a.p199x0.p454e.p456b.C12938z3.C12939a) r6
                if (r6 == 0) goto L_0x0071
                e.a.x0.c.o<R> r0 = r6.f37309O
                r7 = r0
                goto L_0x0072
            L_0x0071:
                r7 = r5
            L_0x0072:
                if (r7 == 0) goto L_0x013f
                boolean r0 = r6.f37310P
                if (r0 == 0) goto L_0x00ad
                boolean r0 = r1.f37316O
                if (r0 != 0) goto L_0x00a0
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0093
                r17.mo42555a()
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x0093:
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L_0x00ad
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                r0.compareAndSet(r6, r5)
                goto L_0x000c
            L_0x00a0:
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L_0x00ad
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                r0.compareAndSet(r6, r5)
                goto L_0x000c
            L_0x00ad:
                java.util.concurrent.atomic.AtomicLong r0 = r1.f37322U
                long r8 = r0.get()
                r10 = 0
                r12 = r10
            L_0x00b6:
                r14 = 0
                int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r0 == 0) goto L_0x011b
                boolean r0 = r1.f37319R
                if (r0 == 0) goto L_0x00c0
                return
            L_0x00c0:
                boolean r0 = r6.f37310P
                java.lang.Object r15 = r7.poll()     // Catch:{ all -> 0x00c7 }
                goto L_0x00d6
            L_0x00c7:
                r0 = move-exception
                r15 = r0
                p212io.reactivex.exceptions.C14398a.m62357b(r15)
                r6.mo42554a()
                e.a.x0.j.c r0 = r1.f37318Q
                r0.mo43142a(r15)
                r15 = r5
                r0 = 1
            L_0x00d6:
                if (r15 != 0) goto L_0x00db
                r16 = 1
                goto L_0x00dd
            L_0x00db:
                r16 = 0
            L_0x00dd:
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r3 = r1.f37321T
                java.lang.Object r3 = r3.get()
                if (r6 == r3) goto L_0x00e7
            L_0x00e5:
                r14 = 1
                goto L_0x011b
            L_0x00e7:
                if (r0 == 0) goto L_0x0111
                boolean r0 = r1.f37316O
                if (r0 != 0) goto L_0x0109
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0101
                e.a.x0.j.c r0 = r1.f37318Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x0101:
                if (r16 == 0) goto L_0x0111
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                r0.compareAndSet(r6, r5)
                goto L_0x00e5
            L_0x0109:
                if (r16 == 0) goto L_0x0111
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.z3$a<T, R>> r0 = r1.f37321T
                r0.compareAndSet(r6, r5)
                goto L_0x00e5
            L_0x0111:
                if (r16 == 0) goto L_0x0114
                goto L_0x011b
            L_0x0114:
                r2.mo41789a(r15)
                r14 = 1
                long r12 = r12 + r14
                goto L_0x00b6
            L_0x011b:
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 == 0) goto L_0x013b
                boolean r0 = r1.f37319R
                if (r0 != 0) goto L_0x013b
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 == 0) goto L_0x0132
                java.util.concurrent.atomic.AtomicLong r0 = r1.f37322U
                long r7 = -r12
                r0.addAndGet(r7)
            L_0x0132:
                java.lang.Object r0 = r6.get()
                i.e.d r0 = (p205i.p211e.C14063d) r0
                r0.mo41813c(r12)
            L_0x013b:
                if (r14 == 0) goto L_0x013f
                goto L_0x000c
            L_0x013f:
                int r0 = -r4
                int r4 = r1.addAndGet(r0)
                if (r4 != 0) goto L_0x000c
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12938z3.C12940b.mo42556d():void");
        }

        public void onComplete() {
            if (!this.f37317P) {
                this.f37317P = true;
                mo42556d();
            }
        }

        public void onError(Throwable th) {
            if (this.f37317P || !this.f37318Q.mo43142a(th)) {
                C12205a.m54894b(th);
                return;
            }
            if (!this.f37316O) {
                mo42555a();
            }
            this.f37317P = true;
            mo42556d();
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f37317P) {
                long j = this.f37323V + 1;
                this.f37323V = j;
                C12939a aVar = (C12939a) this.f37321T.get();
                if (aVar != null) {
                    aVar.mo42554a();
                }
                try {
                    C6007b bVar = (C6007b) C12390b.m55563a(this.f37325b.apply(t), "The publisher returned is null");
                    C12939a aVar2 = new C12939a(this, j, this.f37315N);
                    while (true) {
                        C12939a<Object, Object> aVar3 = (C12939a) this.f37321T.get();
                        if (aVar3 != f37314W) {
                            if (this.f37321T.compareAndSet(aVar3, aVar2)) {
                                bVar.mo24397a(aVar2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f37320S.cancel();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42555a() {
            C12939a<Object, Object> aVar = (C12939a) this.f37321T.get();
            C12939a<Object, Object> aVar2 = f37314W;
            if (aVar != aVar2) {
                C12939a<Object, Object> aVar3 = (C12939a) this.f37321T.getAndSet(aVar2);
                if (aVar3 != f37314W && aVar3 != null) {
                    aVar3.mo42554a();
                }
            }
        }
    }

    public C12938z3(C5929l<T> lVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
        super(lVar);
        this.f37305N = oVar;
        this.f37306O = i;
        this.f37307P = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        if (!C12671j3.m56158a(this.f35814b, cVar, this.f37305N)) {
            this.f35814b.mo24393a((C12297q<? super T>) new C12940b<Object>(cVar, this.f37305N, this.f37306O, this.f37307P));
        }
    }
}
