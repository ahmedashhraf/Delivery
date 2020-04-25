package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13735c;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.f1 */
/* compiled from: FlowableFlattenIterable */
public final class C12602f1<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends Iterable<? extends R>> f36066N;

    /* renamed from: O */
    final int f36067O;

    /* renamed from: e.a.x0.e.b.f1$a */
    /* compiled from: FlowableFlattenIterable */
    static final class C12603a<T, R> extends C13735c<R> implements C12297q<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: N */
        final int f36068N;

        /* renamed from: O */
        final int f36069O;

        /* renamed from: P */
        final AtomicLong f36070P = new AtomicLong();

        /* renamed from: Q */
        C14063d f36071Q;

        /* renamed from: R */
        C12406o<T> f36072R;

        /* renamed from: S */
        volatile boolean f36073S;

        /* renamed from: T */
        volatile boolean f36074T;

        /* renamed from: U */
        final AtomicReference<Throwable> f36075U = new AtomicReference<>();

        /* renamed from: V */
        Iterator<? extends R> f36076V;

        /* renamed from: W */
        int f36077W;

        /* renamed from: X */
        int f36078X;

        /* renamed from: a */
        final C14062c<? super R> f36079a;

        /* renamed from: b */
        final C12339o<? super T, ? extends Iterable<? extends R>> f36080b;

        C12603a(C14062c<? super R> cVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar, int i) {
            this.f36079a = cVar;
            this.f36080b = oVar;
            this.f36068N = i;
            this.f36069O = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f36071Q, dVar)) {
                this.f36071Q = dVar;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f36078X = a;
                        this.f36072R = lVar;
                        this.f36073S = true;
                        this.f36079a.mo41788a((C14063d) this);
                        return;
                    } else if (a == 2) {
                        this.f36078X = a;
                        this.f36072R = lVar;
                        this.f36079a.mo41788a((C14063d) this);
                        dVar.mo41813c((long) this.f36068N);
                        return;
                    }
                }
                this.f36072R = new C13662b(this.f36068N);
                this.f36079a.mo41788a((C14063d) this);
                dVar.mo41813c((long) this.f36068N);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f36070P, j);
                mo42301a();
            }
        }

        public void cancel() {
            if (!this.f36074T) {
                this.f36074T = true;
                this.f36071Q.cancel();
                if (getAndIncrement() == 0) {
                    this.f36072R.clear();
                }
            }
        }

        public void clear() {
            this.f36076V = null;
            this.f36072R.clear();
        }

        public boolean isEmpty() {
            return this.f36076V == null && this.f36072R.isEmpty();
        }

        public void onComplete() {
            if (!this.f36073S) {
                this.f36073S = true;
                mo42301a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36073S || !C13754k.m58722a(this.f36075U, th)) {
                C12205a.m54894b(th);
                return;
            }
            this.f36073S = true;
            mo42301a();
        }

        @C5938g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f36076V;
            while (true) {
                if (it != null) {
                    break;
                }
                Object poll = this.f36072R.poll();
                if (poll != null) {
                    it = ((Iterable) this.f36080b.apply(poll)).iterator();
                    if (it.hasNext()) {
                        this.f36076V = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R a = C12390b.m55563a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f36076V = null;
            }
            return a;
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36073S) {
                if (this.f36078X != 0 || this.f36072R.offer(t)) {
                    mo42301a();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0121, code lost:
            if (r6 == null) goto L_0x012c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42301a() {
            /*
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                i.e.c<? super R> r2 = r1.f36079a
                e.a.x0.c.o<T> r3 = r1.f36072R
                int r0 = r1.f36078X
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L_0x0015
                r0 = 1
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.util.Iterator<? extends R> r6 = r1.f36076V
                r7 = 0
                r8 = 1
            L_0x001a:
                if (r6 != 0) goto L_0x0080
                boolean r9 = r1.f36073S
                java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0062 }
                if (r10 != 0) goto L_0x0026
                r11 = 1
                goto L_0x0027
            L_0x0026:
                r11 = 0
            L_0x0027:
                boolean r9 = r1.mo42303a(r9, r11, r2, r3)
                if (r9 == 0) goto L_0x002e
                return
            L_0x002e:
                if (r10 == 0) goto L_0x0080
                e.a.w0.o<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.f36080b     // Catch:{ all -> 0x004a }
                java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x004a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x004a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004a }
                boolean r9 = r6.hasNext()     // Catch:{ all -> 0x004a }
                if (r9 != 0) goto L_0x0047
                r1.mo42302a(r0)
                r6 = r7
                goto L_0x001a
            L_0x0047:
                r1.f36076V = r6
                goto L_0x0080
            L_0x004a:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                i.e.d r3 = r1.f36071Q
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.f36075U
                p195e.p196a.p199x0.p200j.C13754k.m58722a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                java.lang.Throwable r0 = p195e.p196a.p199x0.p200j.C13754k.m58720a(r0)
                r2.onError(r0)
                return
            L_0x0062:
                r0 = move-exception
                r4 = r0
                p212io.reactivex.exceptions.C14398a.m62357b(r4)
                i.e.d r0 = r1.f36071Q
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                p195e.p196a.p199x0.p200j.C13754k.m58722a(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                java.lang.Throwable r0 = p195e.p196a.p199x0.p200j.C13754k.m58720a(r0)
                r1.f36076V = r7
                r3.clear()
                r2.onError(r0)
                return
            L_0x0080:
                if (r6 == 0) goto L_0x0124
                java.util.concurrent.atomic.AtomicLong r9 = r1.f36070P
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L_0x008b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f6
                boolean r15 = r1.f36073S
                boolean r15 = r1.mo42303a(r15, r4, r2, r3)
                if (r15 == 0) goto L_0x0098
                return
            L_0x0098:
                java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00dc }
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = p195e.p196a.p199x0.p451b.C12390b.m55563a(r15, r5)     // Catch:{ all -> 0x00dc }
                r2.mo41789a(r5)
                boolean r5 = r1.f36073S
                boolean r5 = r1.mo42303a(r5, r4, r2, r3)
                if (r5 == 0) goto L_0x00ae
                return
            L_0x00ae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch:{ all -> 0x00c1 }
                if (r5 != 0) goto L_0x00bf
                r1.mo42302a(r0)
                r1.f36076V = r7
                r6 = r7
                goto L_0x00f6
            L_0x00bf:
                r5 = 1
                goto L_0x008b
            L_0x00c1:
                r0 = move-exception
                r3 = r0
                p212io.reactivex.exceptions.C14398a.m62357b(r3)
                r1.f36076V = r7
                i.e.d r0 = r1.f36071Q
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                p195e.p196a.p199x0.p200j.C13754k.m58722a(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                java.lang.Throwable r0 = p195e.p196a.p199x0.p200j.C13754k.m58720a(r0)
                r2.onError(r0)
                return
            L_0x00dc:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r1.f36076V = r7
                i.e.d r3 = r1.f36071Q
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.f36075U
                p195e.p196a.p199x0.p200j.C13754k.m58722a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f36075U
                java.lang.Throwable r0 = p195e.p196a.p199x0.p200j.C13754k.m58720a(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x010e
                boolean r5 = r1.f36073S
                boolean r15 = r3.isEmpty()
                if (r15 == 0) goto L_0x0106
                if (r6 != 0) goto L_0x0106
                r15 = 1
                goto L_0x0107
            L_0x0106:
                r15 = 0
            L_0x0107:
                boolean r5 = r1.mo42303a(r5, r15, r2, r3)
                if (r5 == 0) goto L_0x010e
                return
            L_0x010e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                java.util.concurrent.atomic.AtomicLong r5 = r1.f36070P
                long r9 = -r13
                r5.addAndGet(r9)
            L_0x0121:
                if (r6 != 0) goto L_0x0124
                goto L_0x012c
            L_0x0124:
                int r5 = -r8
                int r8 = r1.addAndGet(r5)
                if (r8 != 0) goto L_0x012c
                return
            L_0x012c:
                r5 = 1
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12602f1.C12603a.mo42301a():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42302a(boolean z) {
            if (z) {
                int i = this.f36077W + 1;
                if (i == this.f36069O) {
                    this.f36077W = 0;
                    this.f36071Q.mo41813c((long) i);
                    return;
                }
                this.f36077W = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42303a(boolean z, boolean z2, C14062c<?> cVar, C12406o<?> oVar) {
            if (this.f36074T) {
                this.f36076V = null;
                oVar.clear();
                return true;
            }
            if (z) {
                if (((Throwable) this.f36075U.get()) != null) {
                    Throwable a = C13754k.m58720a(this.f36075U);
                    this.f36076V = null;
                    oVar.clear();
                    cVar.onError(a);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            return ((i & 1) == 0 || this.f36078X != 1) ? 0 : 1;
        }
    }

    public C12602f1(C5929l<T> lVar, C12339o<? super T, ? extends Iterable<? extends R>> oVar, int i) {
        super(lVar);
        this.f36066N = oVar;
        this.f36067O = i;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C5929l<T> lVar = this.f35814b;
        if (lVar instanceof Callable) {
            try {
                Object call = ((Callable) lVar).call();
                if (call == null) {
                    C13739g.m58654a(cVar);
                    return;
                }
                try {
                    C12663j1.m56130a(cVar, ((Iterable) this.f36066N.apply(call)).iterator());
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C13739g.m58655a(th, cVar);
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C13739g.m58655a(th2, cVar);
            }
        } else {
            lVar.mo24393a((C12297q<? super T>) new C12603a<Object>(cVar, this.f36066N, this.f36067O));
        }
    }
}
