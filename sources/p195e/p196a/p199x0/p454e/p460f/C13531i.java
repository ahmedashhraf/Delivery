package p195e.p196a.p199x0.p454e.p460f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.f.i */
/* compiled from: ParallelJoin */
public final class C13531i<T> extends C5929l<T> {

    /* renamed from: N */
    final int f39194N;

    /* renamed from: O */
    final boolean f39195O;

    /* renamed from: b */
    final C5922b<? extends T> f39196b;

    /* renamed from: e.a.x0.e.f.i$a */
    /* compiled from: ParallelJoin */
    static final class C13532a<T> extends AtomicReference<C14063d> implements C12297q<T> {
        private static final long serialVersionUID = 8410034718427740355L;

        /* renamed from: N */
        final int f39197N;

        /* renamed from: O */
        long f39198O;

        /* renamed from: P */
        volatile C12405n<T> f39199P;

        /* renamed from: a */
        final C13534c<T> f39200a;

        /* renamed from: b */
        final int f39201b;

        C13532a(C13534c<T> cVar, int i) {
            this.f39200a = cVar;
            this.f39201b = i;
            this.f39197N = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, (long) this.f39201b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12405n<T> mo42963d() {
            C12405n<T> nVar = this.f39199P;
            if (nVar != null) {
                return nVar;
            }
            C13662b bVar = new C13662b(this.f39201b);
            this.f39199P = bVar;
            return bVar;
        }

        /* renamed from: e */
        public void mo42964e() {
            long j = this.f39198O + 1;
            if (j == ((long) this.f39197N)) {
                this.f39198O = 0;
                ((C14063d) get()).mo41813c(j);
                return;
            }
            this.f39198O = j;
        }

        public void onComplete() {
            this.f39200a.mo42968f();
        }

        public void onError(Throwable th) {
            this.f39200a.mo42966a(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f39200a.mo42965a(this, t);
        }

        /* renamed from: a */
        public void mo42961a(long j) {
            long j2 = this.f39198O + j;
            if (j2 >= ((long) this.f39197N)) {
                this.f39198O = 0;
                ((C14063d) get()).mo41813c(j2);
                return;
            }
            this.f39198O = j2;
        }

        /* renamed from: a */
        public boolean mo42962a() {
            return C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    /* renamed from: e.a.x0.e.f.i$b */
    /* compiled from: ParallelJoin */
    static final class C13533b<T> extends C13534c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        C13533b(C14062c<? super T> cVar, int i, int i2) {
            super(cVar, i, i2);
        }

        /* renamed from: a */
        public void mo42965a(C13532a<T> aVar, T t) {
            String str = "Queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f39203O.get() != 0) {
                    this.f39206a.mo41789a(t);
                    if (this.f39203O.get() != Long.MAX_VALUE) {
                        this.f39203O.decrementAndGet();
                    }
                    aVar.mo42961a(1);
                } else if (!aVar.mo42963d().offer(t)) {
                    mo42970a();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException(str);
                    if (this.f39202N.compareAndSet(null, missingBackpressureException)) {
                        this.f39206a.onError(missingBackpressureException);
                    } else {
                        C12205a.m54894b((Throwable) missingBackpressureException);
                    }
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!aVar.mo42963d().offer(t)) {
                mo42970a();
                mo42966a(new MissingBackpressureException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo42969g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42967e() {
            if (getAndIncrement() == 0) {
                mo42969g();
            }
        }

        /* renamed from: f */
        public void mo42968f() {
            this.f39205Q.decrementAndGet();
            mo42967e();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            if (r13 == false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
            if (r11 == false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
            r3.onComplete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
            if (r11 == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
            r10 = r14;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42969g() {
            /*
                r17 = this;
                r0 = r17
                e.a.x0.e.f.i$a<T>[] r1 = r0.f39207b
                int r2 = r1.length
                i.e.c<? super T> r3 = r0.f39206a
                r5 = 1
            L_0x0008:
                java.util.concurrent.atomic.AtomicLong r6 = r0.f39203O
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L_0x0011:
                int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x006d
                boolean r13 = r0.f39204P
                if (r13 == 0) goto L_0x001d
                r17.mo42971d()
                return
            L_0x001d:
                e.a.x0.j.c r13 = r0.f39202N
                java.lang.Object r13 = r13.get()
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto L_0x002e
                r17.mo42971d()
                r3.onError(r13)
                return
            L_0x002e:
                java.util.concurrent.atomic.AtomicInteger r13 = r0.f39205Q
                int r13 = r13.get()
                if (r13 != 0) goto L_0x0038
                r13 = 1
                goto L_0x0039
            L_0x0038:
                r13 = 0
            L_0x0039:
                r14 = r10
                r10 = 0
                r11 = 1
            L_0x003c:
                int r4 = r1.length
                if (r10 >= r4) goto L_0x005f
                r4 = r1[r10]
                e.a.x0.c.n<T> r12 = r4.f39199P
                if (r12 == 0) goto L_0x005c
                java.lang.Object r12 = r12.poll()
                if (r12 == 0) goto L_0x005c
                r3.mo41789a(r12)
                r4.mo42964e()
                r11 = 1
                long r11 = r11 + r14
                int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x005a
                r10 = r11
                goto L_0x006d
            L_0x005a:
                r14 = r11
                r11 = 0
            L_0x005c:
                int r10 = r10 + 1
                goto L_0x003c
            L_0x005f:
                if (r13 == 0) goto L_0x0067
                if (r11 == 0) goto L_0x0067
                r3.onComplete()
                return
            L_0x0067:
                if (r11 == 0) goto L_0x006b
                r10 = r14
                goto L_0x006d
            L_0x006b:
                r10 = r14
                goto L_0x0011
            L_0x006d:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x00b4
                boolean r4 = r0.f39204P
                if (r4 == 0) goto L_0x0079
                r17.mo42971d()
                return
            L_0x0079:
                e.a.x0.j.c r4 = r0.f39202N
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L_0x008a
                r17.mo42971d()
                r3.onError(r4)
                return
            L_0x008a:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.f39205Q
                int r4 = r4.get()
                if (r4 != 0) goto L_0x0094
                r4 = 1
                goto L_0x0095
            L_0x0094:
                r4 = 0
            L_0x0095:
                r12 = 0
            L_0x0096:
                if (r12 >= r2) goto L_0x00aa
                r13 = r1[r12]
                e.a.x0.c.n<T> r13 = r13.f39199P
                if (r13 == 0) goto L_0x00a7
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L_0x00a7
                r16 = 0
                goto L_0x00ac
            L_0x00a7:
                int r12 = r12 + 1
                goto L_0x0096
            L_0x00aa:
                r16 = 1
            L_0x00ac:
                if (r4 == 0) goto L_0x00b4
                if (r16 == 0) goto L_0x00b4
                r3.onComplete()
                return
            L_0x00b4:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x00c7
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x00c7
                java.util.concurrent.atomic.AtomicLong r4 = r0.f39203O
                long r6 = -r10
                r4.addAndGet(r6)
            L_0x00c7:
                int r4 = r17.get()
                if (r4 != r5) goto L_0x00d5
                int r4 = -r5
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto L_0x00d5
                return
            L_0x00d5:
                r5 = r4
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13531i.C13533b.mo42969g():void");
        }

        /* renamed from: a */
        public void mo42966a(Throwable th) {
            if (this.f39202N.compareAndSet(null, th)) {
                mo42970a();
                mo42967e();
            } else if (th != this.f39202N.get()) {
                C12205a.m54894b(th);
            }
        }
    }

    /* renamed from: e.a.x0.e.f.i$c */
    /* compiled from: ParallelJoin */
    static abstract class C13534c<T> extends AtomicInteger implements C14063d {
        private static final long serialVersionUID = 3100232009247827843L;

        /* renamed from: N */
        final C13746c f39202N = new C13746c();

        /* renamed from: O */
        final AtomicLong f39203O = new AtomicLong();

        /* renamed from: P */
        volatile boolean f39204P;

        /* renamed from: Q */
        final AtomicInteger f39205Q = new AtomicInteger();

        /* renamed from: a */
        final C14062c<? super T> f39206a;

        /* renamed from: b */
        final C13532a<T>[] f39207b;

        C13534c(C14062c<? super T> cVar, int i, int i2) {
            this.f39206a = cVar;
            C13532a<T>[] aVarArr = new C13532a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C13532a<>(this, i2);
            }
            this.f39207b = aVarArr;
            this.f39205Q.lazySet(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42970a() {
            int i = 0;
            while (true) {
                C13532a<T>[] aVarArr = this.f39207b;
                if (i < aVarArr.length) {
                    aVarArr[i].mo42962a();
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42965a(C13532a<T> aVar, T t);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42966a(Throwable th);

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f39203O, j);
                mo42967e();
            }
        }

        public void cancel() {
            if (!this.f39204P) {
                this.f39204P = true;
                mo42970a();
                if (getAndIncrement() == 0) {
                    mo42971d();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42971d() {
            int i = 0;
            while (true) {
                C13532a<T>[] aVarArr = this.f39207b;
                if (i < aVarArr.length) {
                    aVarArr[i].f39199P = null;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42967e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract void mo42968f();
    }

    /* renamed from: e.a.x0.e.f.i$d */
    /* compiled from: ParallelJoin */
    static final class C13535d<T> extends C13534c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        C13535d(C14062c<? super T> cVar, int i, int i2) {
            super(cVar, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42965a(C13532a<T> aVar, T t) {
            String str = "Queue full?!";
            if (get() != 0 || !compareAndSet(0, 1)) {
                if (!aVar.mo42963d().offer(t) && aVar.mo42962a()) {
                    this.f39202N.mo43142a(new MissingBackpressureException(str));
                    this.f39205Q.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                if (this.f39203O.get() != 0) {
                    this.f39206a.mo41789a(t);
                    if (this.f39203O.get() != Long.MAX_VALUE) {
                        this.f39203O.decrementAndGet();
                    }
                    aVar.mo42961a(1);
                } else if (!aVar.mo42963d().offer(t)) {
                    aVar.mo42962a();
                    this.f39202N.mo43142a(new MissingBackpressureException(str));
                    this.f39205Q.decrementAndGet();
                    mo42972g();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo42972g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42967e() {
            if (getAndIncrement() == 0) {
                mo42972g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42968f() {
            this.f39205Q.decrementAndGet();
            mo42967e();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            if (r13 == false) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
            if (r11 == false) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
            if (((java.lang.Throwable) r0.f39202N.get()) == null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
            r3.onError(r0.f39202N.mo43143d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
            r3.onComplete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
            if (r11 == false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
            r10 = r14;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42972g() {
            /*
                r17 = this;
                r0 = r17
                e.a.x0.e.f.i$a<T>[] r1 = r0.f39207b
                int r2 = r1.length
                i.e.c<? super T> r3 = r0.f39206a
                r5 = 1
            L_0x0008:
                java.util.concurrent.atomic.AtomicLong r6 = r0.f39203O
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L_0x0011:
                int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x006f
                boolean r13 = r0.f39204P
                if (r13 == 0) goto L_0x001d
                r17.mo42971d()
                return
            L_0x001d:
                java.util.concurrent.atomic.AtomicInteger r13 = r0.f39205Q
                int r13 = r13.get()
                if (r13 != 0) goto L_0x0027
                r13 = 1
                goto L_0x0028
            L_0x0027:
                r13 = 0
            L_0x0028:
                r14 = r10
                r10 = 0
                r11 = 1
            L_0x002b:
                if (r10 >= r2) goto L_0x004d
                r4 = r1[r10]
                e.a.x0.c.n<T> r12 = r4.f39199P
                if (r12 == 0) goto L_0x004a
                java.lang.Object r12 = r12.poll()
                if (r12 == 0) goto L_0x004a
                r3.mo41789a(r12)
                r4.mo42964e()
                r11 = 1
                long r11 = r11 + r14
                int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x0048
                r10 = r11
                goto L_0x006f
            L_0x0048:
                r14 = r11
                r11 = 0
            L_0x004a:
                int r10 = r10 + 1
                goto L_0x002b
            L_0x004d:
                if (r13 == 0) goto L_0x0069
                if (r11 == 0) goto L_0x0069
                e.a.x0.j.c r1 = r0.f39202N
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0065
                e.a.x0.j.c r1 = r0.f39202N
                java.lang.Throwable r1 = r1.mo43143d()
                r3.onError(r1)
                goto L_0x0068
            L_0x0065:
                r3.onComplete()
            L_0x0068:
                return
            L_0x0069:
                if (r11 == 0) goto L_0x006d
                r10 = r14
                goto L_0x006f
            L_0x006d:
                r10 = r14
                goto L_0x0011
            L_0x006f:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x00b9
                boolean r4 = r0.f39204P
                if (r4 == 0) goto L_0x007b
                r17.mo42971d()
                return
            L_0x007b:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.f39205Q
                int r4 = r4.get()
                if (r4 != 0) goto L_0x0085
                r4 = 1
                goto L_0x0086
            L_0x0085:
                r4 = 0
            L_0x0086:
                r12 = 0
            L_0x0087:
                if (r12 >= r2) goto L_0x009b
                r13 = r1[r12]
                e.a.x0.c.n<T> r13 = r13.f39199P
                if (r13 == 0) goto L_0x0098
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L_0x0098
                r16 = 0
                goto L_0x009d
            L_0x0098:
                int r12 = r12 + 1
                goto L_0x0087
            L_0x009b:
                r16 = 1
            L_0x009d:
                if (r4 == 0) goto L_0x00b9
                if (r16 == 0) goto L_0x00b9
                e.a.x0.j.c r1 = r0.f39202N
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x00b5
                e.a.x0.j.c r1 = r0.f39202N
                java.lang.Throwable r1 = r1.mo43143d()
                r3.onError(r1)
                goto L_0x00b8
            L_0x00b5:
                r3.onComplete()
            L_0x00b8:
                return
            L_0x00b9:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x00cc
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x00cc
                java.util.concurrent.atomic.AtomicLong r4 = r0.f39203O
                long r6 = -r10
                r4.addAndGet(r6)
            L_0x00cc:
                int r4 = r17.get()
                if (r4 != r5) goto L_0x00da
                int r4 = -r5
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto L_0x00da
                return
            L_0x00da:
                r5 = r4
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p460f.C13531i.C13535d.mo42972g():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42966a(Throwable th) {
            this.f39202N.mo43142a(th);
            this.f39205Q.decrementAndGet();
            mo42967e();
        }
    }

    public C13531i(C5922b<? extends T> bVar, int i, boolean z) {
        this.f39196b = bVar;
        this.f39194N = i;
        this.f39195O = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13534c cVar2;
        if (this.f39195O) {
            cVar2 = new C13535d(cVar, this.f39196b.mo23713a(), this.f39194N);
        } else {
            cVar2 = new C13533b(cVar, this.f39196b.mo23713a(), this.f39194N);
        }
        cVar.mo41788a((C14063d) cVar2);
        this.f39196b.mo23740a((C14062c<? super T>[]) cVar2.f39207b);
    }
}
