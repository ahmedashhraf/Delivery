package p195e.p196a.p440c1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.c1.e */
/* compiled from: ReplayProcessor */
public final class C12214e<T> extends C12211c<T> {

    /* renamed from: P */
    private static final Object[] f35281P = new Object[0];

    /* renamed from: Q */
    static final C12217c[] f35282Q = new C12217c[0];

    /* renamed from: R */
    static final C12217c[] f35283R = new C12217c[0];

    /* renamed from: N */
    boolean f35284N;

    /* renamed from: O */
    final AtomicReference<C12217c<T>[]> f35285O = new AtomicReference<>(f35282Q);

    /* renamed from: b */
    final C12216b<T> f35286b;

    /* renamed from: e.a.c1.e$a */
    /* compiled from: ReplayProcessor */
    static final class C12215a<T> extends AtomicReference<C12215a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: a */
        final T f35287a;

        C12215a(T t) {
            this.f35287a = t;
        }
    }

    /* renamed from: e.a.c1.e$b */
    /* compiled from: ReplayProcessor */
    interface C12216b<T> {
        /* renamed from: a */
        void mo41834a();

        /* renamed from: a */
        void mo41835a(C12217c<T> cVar);

        /* renamed from: a */
        void mo41836a(T t);

        /* renamed from: a */
        void mo41837a(Throwable th);

        /* renamed from: a */
        T[] mo41838a(T[] tArr);

        /* renamed from: e */
        void mo41839e();

        Throwable getError();

        @C5938g
        T getValue();

        boolean isDone();

        int size();
    }

    /* renamed from: e.a.c1.e$c */
    /* compiled from: ReplayProcessor */
    static final class C12217c<T> extends AtomicInteger implements C14063d {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: N */
        Object f35288N;

        /* renamed from: O */
        final AtomicLong f35289O = new AtomicLong();

        /* renamed from: P */
        volatile boolean f35290P;

        /* renamed from: Q */
        long f35291Q;

        /* renamed from: a */
        final C14062c<? super T> f35292a;

        /* renamed from: b */
        final C12214e<T> f35293b;

        C12217c(C14062c<? super T> cVar, C12214e<T> eVar) {
            this.f35292a = cVar;
            this.f35293b = eVar;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f35289O, j);
                this.f35293b.f35286b.mo41835a(this);
            }
        }

        public void cancel() {
            if (!this.f35290P) {
                this.f35290P = true;
                this.f35293b.mo41828b(this);
            }
        }
    }

    /* renamed from: e.a.c1.e$d */
    /* compiled from: ReplayProcessor */
    static final class C12218d<T> implements C12216b<T> {

        /* renamed from: a */
        final int f35294a;

        /* renamed from: b */
        final long f35295b;

        /* renamed from: c */
        final TimeUnit f35296c;

        /* renamed from: d */
        final C12282j0 f35297d;

        /* renamed from: e */
        int f35298e;

        /* renamed from: f */
        volatile C12220f<T> f35299f;

        /* renamed from: g */
        C12220f<T> f35300g;

        /* renamed from: h */
        Throwable f35301h;

        /* renamed from: i */
        volatile boolean f35302i;

        C12218d(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f35294a = C12390b.m55558a(i, "maxSize");
            this.f35295b = C12390b.m55561a(j, "maxAge");
            this.f35296c = (TimeUnit) C12390b.m55563a(timeUnit, "unit is null");
            this.f35297d = (C12282j0) C12390b.m55563a(j0Var, "scheduler is null");
            C12220f<T> fVar = new C12220f<>(null, 0);
            this.f35300g = fVar;
            this.f35299f = fVar;
        }

        /* renamed from: a */
        public void mo41834a() {
            if (this.f35299f.f35309a != null) {
                C12220f<T> fVar = new C12220f<>(null, 0);
                fVar.lazySet(this.f35299f.get());
                this.f35299f = fVar;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12220f<T> mo41845b() {
            C12220f<T> fVar;
            C12220f<T> fVar2 = this.f35299f;
            long a = this.f35297d.mo41870a(this.f35296c) - this.f35295b;
            Object obj = fVar2.get();
            while (true) {
                C12220f<T> fVar3 = (C12220f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 == null || fVar2.f35310b > a) {
                    return fVar;
                }
                obj = fVar2.get();
            }
            return fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo41846c() {
            int i = this.f35298e;
            if (i > this.f35294a) {
                this.f35298e = i - 1;
                this.f35299f = (C12220f) this.f35299f.get();
            }
            long a = this.f35297d.mo41870a(this.f35296c) - this.f35295b;
            C12220f<T> fVar = this.f35299f;
            while (true) {
                C12220f<T> fVar2 = (C12220f) fVar.get();
                if (fVar2 == null) {
                    this.f35299f = fVar;
                    return;
                } else if (fVar2.f35310b > a) {
                    this.f35299f = fVar;
                    return;
                } else {
                    fVar = fVar2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo41847d() {
            long a = this.f35297d.mo41870a(this.f35296c) - this.f35295b;
            C12220f<T> fVar = this.f35299f;
            while (true) {
                C12220f<T> fVar2 = (C12220f) fVar.get();
                if (fVar2 == null) {
                    if (fVar.f35309a != null) {
                        this.f35299f = new C12220f<>(null, 0);
                        return;
                    } else {
                        this.f35299f = fVar;
                        return;
                    }
                } else if (fVar2.f35310b <= a) {
                    fVar = fVar2;
                } else if (fVar.f35309a != null) {
                    C12220f<T> fVar3 = new C12220f<>(null, 0);
                    fVar3.lazySet(fVar.get());
                    this.f35299f = fVar3;
                    return;
                } else {
                    this.f35299f = fVar;
                    return;
                }
            }
        }

        /* renamed from: e */
        public void mo41839e() {
            mo41847d();
            this.f35302i = true;
        }

        public Throwable getError() {
            return this.f35301h;
        }

        @C5938g
        public T getValue() {
            C12220f<T> fVar = this.f35299f;
            while (true) {
                C12220f<T> fVar2 = (C12220f) fVar.get();
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            if (fVar.f35310b < this.f35297d.mo41870a(this.f35296c) - this.f35295b) {
                return null;
            }
            return fVar.f35309a;
        }

        public boolean isDone() {
            return this.f35302i;
        }

        public int size() {
            return mo41844a(mo41845b());
        }

        /* renamed from: a */
        public void mo41836a(T t) {
            C12220f<T> fVar = new C12220f<>(t, this.f35297d.mo41870a(this.f35296c));
            C12220f<T> fVar2 = this.f35300g;
            this.f35300g = fVar;
            this.f35298e++;
            fVar2.set(fVar);
            mo41846c();
        }

        /* renamed from: a */
        public void mo41837a(Throwable th) {
            mo41847d();
            this.f35301h = th;
            this.f35302i = true;
        }

        /* renamed from: a */
        public T[] mo41838a(T[] tArr) {
            C12220f b = mo41845b();
            int a = mo41844a(b);
            if (a != 0) {
                if (tArr.length < a) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
                }
                for (int i = 0; i != a; i++) {
                    b = (C12220f) b.get();
                    tArr[i] = b.f35309a;
                }
                if (tArr.length > a) {
                    tArr[a] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        /* renamed from: a */
        public void mo41835a(C12217c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                C14062c<? super T> cVar2 = cVar.f35292a;
                C12220f fVar = (C12220f) cVar.f35288N;
                if (fVar == null) {
                    fVar = mo41845b();
                }
                long j = cVar.f35291Q;
                int i = 1;
                do {
                    long j2 = cVar.f35289O.get();
                    while (j != j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        }
                        boolean z = this.f35302i;
                        C12220f fVar2 = (C12220f) fVar.get();
                        boolean z2 = fVar2 == null;
                        if (z && z2) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th = this.f35301h;
                            if (th == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th);
                            }
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar2.mo41789a(fVar2.f35309a);
                            j++;
                            fVar = fVar2;
                        }
                    }
                    if (j == j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        } else if (this.f35302i && fVar.get() == null) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th2 = this.f35301h;
                            if (th2 == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th2);
                            }
                            return;
                        }
                    }
                    cVar.f35288N = fVar;
                    cVar.f35291Q = j;
                    i = cVar.addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo41844a(C12220f<T> fVar) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                fVar = (C12220f) fVar.get();
                if (fVar == null) {
                    break;
                }
                i++;
            }
            return i;
        }
    }

    /* renamed from: e.a.c1.e$e */
    /* compiled from: ReplayProcessor */
    static final class C12219e<T> implements C12216b<T> {

        /* renamed from: a */
        final int f35303a;

        /* renamed from: b */
        int f35304b;

        /* renamed from: c */
        volatile C12215a<T> f35305c;

        /* renamed from: d */
        C12215a<T> f35306d;

        /* renamed from: e */
        Throwable f35307e;

        /* renamed from: f */
        volatile boolean f35308f;

        C12219e(int i) {
            this.f35303a = C12390b.m55558a(i, "maxSize");
            C12215a<T> aVar = new C12215a<>(null);
            this.f35306d = aVar;
            this.f35305c = aVar;
        }

        /* renamed from: a */
        public void mo41836a(T t) {
            C12215a<T> aVar = new C12215a<>(t);
            C12215a<T> aVar2 = this.f35306d;
            this.f35306d = aVar;
            this.f35304b++;
            aVar2.set(aVar);
            mo41848b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo41848b() {
            int i = this.f35304b;
            if (i > this.f35303a) {
                this.f35304b = i - 1;
                this.f35305c = (C12215a) this.f35305c.get();
            }
        }

        /* renamed from: e */
        public void mo41839e() {
            mo41834a();
            this.f35308f = true;
        }

        public Throwable getError() {
            return this.f35307e;
        }

        public T getValue() {
            C12215a<T> aVar = this.f35305c;
            while (true) {
                C12215a<T> aVar2 = (C12215a) aVar.get();
                if (aVar2 == null) {
                    return aVar.f35287a;
                }
                aVar = aVar2;
            }
        }

        public boolean isDone() {
            return this.f35308f;
        }

        public int size() {
            C12215a<T> aVar = this.f35305c;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                aVar = (C12215a) aVar.get();
                if (aVar == null) {
                    break;
                }
                i++;
            }
            return i;
        }

        /* renamed from: a */
        public void mo41837a(Throwable th) {
            this.f35307e = th;
            mo41834a();
            this.f35308f = true;
        }

        /* renamed from: a */
        public void mo41834a() {
            if (this.f35305c.f35287a != null) {
                C12215a<T> aVar = new C12215a<>(null);
                aVar.lazySet(this.f35305c.get());
                this.f35305c = aVar;
            }
        }

        /* renamed from: a */
        public T[] mo41838a(T[] tArr) {
            C12215a<T> aVar = this.f35305c;
            C12215a<T> aVar2 = aVar;
            int i = 0;
            while (true) {
                aVar2 = (C12215a) aVar2.get();
                if (aVar2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                aVar = (C12215a) aVar.get();
                tArr[i2] = aVar.f35287a;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        /* renamed from: a */
        public void mo41835a(C12217c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                C14062c<? super T> cVar2 = cVar.f35292a;
                C12215a<T> aVar = (C12215a) cVar.f35288N;
                if (aVar == null) {
                    aVar = this.f35305c;
                }
                long j = cVar.f35291Q;
                int i = 1;
                do {
                    long j2 = cVar.f35289O.get();
                    while (j != j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        }
                        boolean z = this.f35308f;
                        C12215a<T> aVar2 = (C12215a) aVar.get();
                        boolean z2 = aVar2 == null;
                        if (z && z2) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th = this.f35307e;
                            if (th == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th);
                            }
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar2.mo41789a(aVar2.f35287a);
                            j++;
                            aVar = aVar2;
                        }
                    }
                    if (j == j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        } else if (this.f35308f && aVar.get() == null) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th2 = this.f35307e;
                            if (th2 == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th2);
                            }
                            return;
                        }
                    }
                    cVar.f35288N = aVar;
                    cVar.f35291Q = j;
                    i = cVar.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* renamed from: e.a.c1.e$f */
    /* compiled from: ReplayProcessor */
    static final class C12220f<T> extends AtomicReference<C12220f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: a */
        final T f35309a;

        /* renamed from: b */
        final long f35310b;

        C12220f(T t, long j) {
            this.f35309a = t;
            this.f35310b = j;
        }
    }

    /* renamed from: e.a.c1.e$g */
    /* compiled from: ReplayProcessor */
    static final class C12221g<T> implements C12216b<T> {

        /* renamed from: a */
        final List<T> f35311a;

        /* renamed from: b */
        Throwable f35312b;

        /* renamed from: c */
        volatile boolean f35313c;

        /* renamed from: d */
        volatile int f35314d;

        C12221g(int i) {
            this.f35311a = new ArrayList(C12390b.m55558a(i, "capacityHint"));
        }

        /* renamed from: a */
        public void mo41834a() {
        }

        /* renamed from: a */
        public void mo41836a(T t) {
            this.f35311a.add(t);
            this.f35314d++;
        }

        /* renamed from: e */
        public void mo41839e() {
            this.f35313c = true;
        }

        public Throwable getError() {
            return this.f35312b;
        }

        @C5938g
        public T getValue() {
            int i = this.f35314d;
            if (i == 0) {
                return null;
            }
            return this.f35311a.get(i - 1);
        }

        public boolean isDone() {
            return this.f35313c;
        }

        public int size() {
            return this.f35314d;
        }

        /* renamed from: a */
        public void mo41837a(Throwable th) {
            this.f35312b = th;
            this.f35313c = true;
        }

        /* renamed from: a */
        public T[] mo41838a(T[] tArr) {
            int i = this.f35314d;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f35311a;
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        /* renamed from: a */
        public void mo41835a(C12217c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                List<T> list = this.f35311a;
                C14062c<? super T> cVar2 = cVar.f35292a;
                Integer num = (Integer) cVar.f35288N;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    cVar.f35288N = Integer.valueOf(0);
                }
                long j = cVar.f35291Q;
                int i2 = 1;
                do {
                    long j2 = cVar.f35289O.get();
                    while (j != j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        }
                        boolean z = this.f35313c;
                        int i3 = this.f35314d;
                        if (z && i == i3) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th = this.f35312b;
                            if (th == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th);
                            }
                            return;
                        } else if (i == i3) {
                            break;
                        } else {
                            cVar2.mo41789a(list.get(i));
                            i++;
                            j++;
                        }
                    }
                    if (j == j2) {
                        if (cVar.f35290P) {
                            cVar.f35288N = null;
                            return;
                        }
                        boolean z2 = this.f35313c;
                        int i4 = this.f35314d;
                        if (z2 && i == i4) {
                            cVar.f35288N = null;
                            cVar.f35290P = true;
                            Throwable th2 = this.f35312b;
                            if (th2 == null) {
                                cVar2.onComplete();
                            } else {
                                cVar2.onError(th2);
                            }
                            return;
                        }
                    }
                    cVar.f35288N = Integer.valueOf(i);
                    cVar.f35291Q = j;
                    i2 = cVar.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    C12214e(C12216b<T> bVar) {
        this.f35286b = bVar;
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public static <T> C12214e<T> m55007b(long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        C12218d dVar = new C12218d(i, j, timeUnit, j0Var);
        return new C12214e<>(dVar);
    }

    @C5935d
    @C5937f
    /* renamed from: f0 */
    public static <T> C12214e<T> m55008f0() {
        return new C12214e<>(new C12221g(16));
    }

    /* renamed from: g0 */
    static <T> C12214e<T> m55009g0() {
        return new C12214e<>(new C12219e(Integer.MAX_VALUE));
    }

    @C5935d
    @C5937f
    /* renamed from: m */
    public static <T> C12214e<T> m55010m(int i) {
        return new C12214e<>(new C12221g(i));
    }

    @C5935d
    @C5937f
    /* renamed from: n */
    public static <T> C12214e<T> m55011n(int i) {
        return new C12214e<>(new C12219e(i));
    }

    @C5935d
    @C5937f
    /* renamed from: r */
    public static <T> C12214e<T> m55012r(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12218d dVar = new C12218d(Integer.MAX_VALUE, j, timeUnit, j0Var);
        return new C12214e<>(dVar);
    }

    @C5938g
    /* renamed from: U */
    public Throwable mo41783U() {
        C12216b<T> bVar = this.f35286b;
        if (bVar.isDone()) {
            return bVar.getError();
        }
        return null;
    }

    /* renamed from: V */
    public boolean mo41784V() {
        C12216b<T> bVar = this.f35286b;
        return bVar.isDone() && bVar.getError() == null;
    }

    /* renamed from: W */
    public boolean mo41785W() {
        return ((C12217c[]) this.f35285O.get()).length != 0;
    }

    /* renamed from: X */
    public boolean mo41786X() {
        C12216b<T> bVar = this.f35286b;
        return bVar.isDone() && bVar.getError() != null;
    }

    @C5936e
    /* renamed from: Z */
    public void mo41825Z() {
        this.f35286b.mo41834a();
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f35284N) {
            dVar.cancel();
        } else {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: a0 */
    public T mo41827a0() {
        return this.f35286b.getValue();
    }

    /* renamed from: b0 */
    public Object[] mo41829b0() {
        Object[] c = mo41830c(f35281P);
        return c == f35281P ? new Object[0] : c;
    }

    /* renamed from: c */
    public T[] mo41830c(T[] tArr) {
        return this.f35286b.mo41838a(tArr);
    }

    /* renamed from: c0 */
    public boolean mo41831c0() {
        return this.f35286b.size() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d0 */
    public int mo41832d0() {
        return this.f35286b.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12217c cVar2 = new C12217c(cVar, this);
        cVar.mo41788a((C14063d) cVar2);
        if (!mo41826a(cVar2) || !cVar2.f35290P) {
            this.f35286b.mo41835a(cVar2);
        } else {
            mo41828b(cVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public int mo41833e0() {
        return ((C12217c[]) this.f35285O.get()).length;
    }

    public void onComplete() {
        if (!this.f35284N) {
            this.f35284N = true;
            C12216b<T> bVar = this.f35286b;
            bVar.mo41839e();
            for (C12217c a : (C12217c[]) this.f35285O.getAndSet(f35283R)) {
                bVar.mo41835a(a);
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35284N) {
            C12205a.m54894b(th);
            return;
        }
        this.f35284N = true;
        C12216b<T> bVar = this.f35286b;
        bVar.mo41837a(th);
        for (C12217c a : (C12217c[]) this.f35285O.getAndSet(f35283R)) {
            bVar.mo41835a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41828b(C12217c<T> cVar) {
        C12217c<T>[] cVarArr;
        C12217c[] cVarArr2;
        do {
            cVarArr = (C12217c[]) this.f35285O.get();
            if (cVarArr != f35283R && cVarArr != f35282Q) {
                int length = cVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cVarArr[i2] == cVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cVarArr2 = f35282Q;
                    } else {
                        C12217c[] cVarArr3 = new C12217c[(length - 1)];
                        System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                        System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                        cVarArr2 = cVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f35285O.compareAndSet(cVarArr, cVarArr2));
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35284N) {
            C12216b<T> bVar = this.f35286b;
            bVar.mo41836a(t);
            for (C12217c a : (C12217c[]) this.f35285O.get()) {
                bVar.mo41835a(a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41826a(C12217c<T> cVar) {
        C12217c[] cVarArr;
        C12217c[] cVarArr2;
        do {
            cVarArr = (C12217c[]) this.f35285O.get();
            if (cVarArr == f35283R) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new C12217c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.f35285O.compareAndSet(cVarArr, cVarArr2));
        return true;
    }
}
