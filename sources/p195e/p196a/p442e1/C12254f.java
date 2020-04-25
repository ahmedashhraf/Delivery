package p195e.p196a.p442e1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.e1.f */
/* compiled from: ReplaySubject */
public final class C12254f<T> extends C12265i<T> {

    /* renamed from: O */
    static final C12257c[] f35397O = new C12257c[0];

    /* renamed from: P */
    static final C12257c[] f35398P = new C12257c[0];

    /* renamed from: Q */
    private static final Object[] f35399Q = new Object[0];

    /* renamed from: N */
    boolean f35400N;

    /* renamed from: a */
    final C12256b<T> f35401a;

    /* renamed from: b */
    final AtomicReference<C12257c<T>[]> f35402b = new AtomicReference<>(f35397O);

    /* renamed from: e.a.e1.f$a */
    /* compiled from: ReplaySubject */
    static final class C12255a<T> extends AtomicReference<C12255a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: a */
        final T f35403a;

        C12255a(T t) {
            this.f35403a = t;
        }
    }

    /* renamed from: e.a.e1.f$b */
    /* compiled from: ReplaySubject */
    interface C12256b<T> {
        /* renamed from: a */
        void mo41959a();

        /* renamed from: a */
        void mo41960a(C12257c<T> cVar);

        /* renamed from: a */
        void mo41961a(Object obj);

        /* renamed from: a */
        T[] mo41962a(T[] tArr);

        void add(T t);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @C5938g
        T getValue();

        int size();
    }

    /* renamed from: e.a.e1.f$c */
    /* compiled from: ReplaySubject */
    static final class C12257c<T> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: N */
        Object f35404N;

        /* renamed from: O */
        volatile boolean f35405O;

        /* renamed from: a */
        final C12280i0<? super T> f35406a;

        /* renamed from: b */
        final C12254f<T> f35407b;

        C12257c(C12280i0<? super T> i0Var, C12254f<T> fVar) {
            this.f35406a = i0Var;
            this.f35407b = fVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35405O;
        }

        public void dispose() {
            if (!this.f35405O) {
                this.f35405O = true;
                this.f35407b.mo41956b(this);
            }
        }
    }

    /* renamed from: e.a.e1.f$d */
    /* compiled from: ReplaySubject */
    static final class C12258d<T> extends AtomicReference<Object> implements C12256b<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* renamed from: N */
        final TimeUnit f35408N;

        /* renamed from: O */
        final C12282j0 f35409O;

        /* renamed from: P */
        int f35410P;

        /* renamed from: Q */
        volatile C12260f<Object> f35411Q;

        /* renamed from: R */
        C12260f<Object> f35412R;

        /* renamed from: S */
        volatile boolean f35413S;

        /* renamed from: a */
        final int f35414a;

        /* renamed from: b */
        final long f35415b;

        C12258d(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f35414a = C12390b.m55558a(i, "maxSize");
            this.f35415b = C12390b.m55561a(j, "maxAge");
            this.f35408N = (TimeUnit) C12390b.m55563a(timeUnit, "unit is null");
            this.f35409O = (C12282j0) C12390b.m55563a(j0Var, "scheduler is null");
            C12260f<Object> fVar = new C12260f<>(null, 0);
            this.f35412R = fVar;
            this.f35411Q = fVar;
        }

        /* renamed from: a */
        public void mo41961a(Object obj) {
            C12260f<Object> fVar = new C12260f<>(obj, Long.MAX_VALUE);
            C12260f<Object> fVar2 = this.f35412R;
            this.f35412R = fVar;
            this.f35410P++;
            fVar2.lazySet(fVar);
            mo41971f();
            this.f35413S = true;
        }

        public void add(T t) {
            C12260f<Object> fVar = new C12260f<>(t, this.f35409O.mo41870a(this.f35408N));
            C12260f<Object> fVar2 = this.f35412R;
            this.f35412R = fVar;
            this.f35410P++;
            fVar2.set(fVar);
            mo41970e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12260f<Object> mo41969d() {
            C12260f<Object> fVar;
            C12260f<Object> fVar2 = this.f35411Q;
            long a = this.f35409O.mo41870a(this.f35408N) - this.f35415b;
            Object obj = fVar2.get();
            while (true) {
                C12260f<Object> fVar3 = (C12260f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 == null || fVar2.f35422b > a) {
                    return fVar;
                }
                obj = fVar2.get();
            }
            return fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo41970e() {
            int i = this.f35410P;
            if (i > this.f35414a) {
                this.f35410P = i - 1;
                this.f35411Q = (C12260f) this.f35411Q.get();
            }
            long a = this.f35409O.mo41870a(this.f35408N) - this.f35415b;
            C12260f<Object> fVar = this.f35411Q;
            while (true) {
                C12260f<Object> fVar2 = (C12260f) fVar.get();
                if (fVar2 == null) {
                    this.f35411Q = fVar;
                    return;
                } else if (fVar2.f35422b > a) {
                    this.f35411Q = fVar;
                    return;
                } else {
                    fVar = fVar2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo41971f() {
            long a = this.f35409O.mo41870a(this.f35408N) - this.f35415b;
            C12260f<Object> fVar = this.f35411Q;
            while (true) {
                C12260f<Object> fVar2 = (C12260f) fVar.get();
                if (fVar2.get() == null) {
                    if (fVar.f35421a != null) {
                        C12260f<Object> fVar3 = new C12260f<>(null, 0);
                        fVar3.lazySet(fVar.get());
                        this.f35411Q = fVar3;
                        return;
                    }
                    this.f35411Q = fVar;
                    return;
                } else if (fVar2.f35422b <= a) {
                    fVar = fVar2;
                } else if (fVar.f35421a != null) {
                    C12260f<Object> fVar4 = new C12260f<>(null, 0);
                    fVar4.lazySet(fVar.get());
                    this.f35411Q = fVar4;
                    return;
                } else {
                    this.f35411Q = fVar;
                    return;
                }
            }
        }

        @C5938g
        public T getValue() {
            C12260f<Object> fVar = this.f35411Q;
            C12260f<Object> fVar2 = null;
            while (true) {
                C12260f<Object> fVar3 = (C12260f) fVar.get();
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar;
                fVar = fVar3;
            }
            if (fVar.f35422b < this.f35409O.mo41870a(this.f35408N) - this.f35415b) {
                return null;
            }
            T t = fVar.f35421a;
            if (t == null) {
                return null;
            }
            if (C13761q.m58752e(t) || C13761q.m58754g(t)) {
                return fVar2.f35421a;
            }
            return t;
        }

        public int size() {
            return mo41968a(mo41969d());
        }

        /* renamed from: a */
        public void mo41959a() {
            C12260f<Object> fVar = this.f35411Q;
            if (fVar.f35421a != null) {
                C12260f<Object> fVar2 = new C12260f<>(null, 0);
                fVar2.lazySet(fVar.get());
                this.f35411Q = fVar2;
            }
        }

        /* renamed from: a */
        public T[] mo41962a(T[] tArr) {
            C12260f d = mo41969d();
            int a = mo41968a(d);
            if (a != 0) {
                if (tArr.length < a) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
                }
                for (int i = 0; i != a; i++) {
                    d = (C12260f) d.get();
                    tArr[i] = d.f35421a;
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
        public void mo41960a(C12257c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                C12280i0<? super T> i0Var = cVar.f35406a;
                C12260f fVar = (C12260f) cVar.f35404N;
                if (fVar == null) {
                    fVar = mo41969d();
                }
                int i = 1;
                while (!cVar.f35405O) {
                    while (!cVar.f35405O) {
                        C12260f fVar2 = (C12260f) fVar.get();
                        if (fVar2 != null) {
                            T t = fVar2.f35421a;
                            if (!this.f35413S || fVar2.get() != null) {
                                i0Var.mo33453a(t);
                                fVar = fVar2;
                            } else {
                                if (C13761q.m58752e(t)) {
                                    i0Var.onComplete();
                                } else {
                                    i0Var.onError(C13761q.m58746b(t));
                                }
                                cVar.f35404N = null;
                                cVar.f35405O = true;
                                return;
                            }
                        } else if (fVar.get() == null) {
                            cVar.f35404N = fVar;
                            i = cVar.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                    cVar.f35404N = null;
                    return;
                }
                cVar.f35404N = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo41968a(C12260f<Object> fVar) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C12260f<Object> fVar2 = (C12260f) fVar.get();
                if (fVar2 == null) {
                    T t = fVar.f35421a;
                    return (C13761q.m58752e(t) || C13761q.m58754g(t)) ? i - 1 : i;
                }
                i++;
                fVar = fVar2;
            }
            return i;
        }
    }

    /* renamed from: e.a.e1.f$e */
    /* compiled from: ReplaySubject */
    static final class C12259e<T> extends AtomicReference<Object> implements C12256b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* renamed from: N */
        volatile C12255a<Object> f35416N;

        /* renamed from: O */
        C12255a<Object> f35417O;

        /* renamed from: P */
        volatile boolean f35418P;

        /* renamed from: a */
        final int f35419a;

        /* renamed from: b */
        int f35420b;

        C12259e(int i) {
            this.f35419a = C12390b.m55558a(i, "maxSize");
            C12255a<Object> aVar = new C12255a<>(null);
            this.f35417O = aVar;
            this.f35416N = aVar;
        }

        /* renamed from: a */
        public void mo41961a(Object obj) {
            C12255a<Object> aVar = new C12255a<>(obj);
            C12255a<Object> aVar2 = this.f35417O;
            this.f35417O = aVar;
            this.f35420b++;
            aVar2.lazySet(aVar);
            mo41959a();
            this.f35418P = true;
        }

        public void add(T t) {
            C12255a<Object> aVar = new C12255a<>(t);
            C12255a<Object> aVar2 = this.f35417O;
            this.f35417O = aVar;
            this.f35420b++;
            aVar2.set(aVar);
            mo41972d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo41972d() {
            int i = this.f35420b;
            if (i > this.f35419a) {
                this.f35420b = i - 1;
                this.f35416N = (C12255a) this.f35416N.get();
            }
        }

        @C5938g
        public T getValue() {
            C12255a<Object> aVar = this.f35416N;
            C12255a<Object> aVar2 = null;
            while (true) {
                C12255a<Object> aVar3 = (C12255a) aVar.get();
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar;
                aVar = aVar3;
            }
            T t = aVar.f35403a;
            if (t == null) {
                return null;
            }
            if (C13761q.m58752e(t) || C13761q.m58754g(t)) {
                return aVar2.f35403a;
            }
            return t;
        }

        public int size() {
            C12255a<Object> aVar = this.f35416N;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C12255a<Object> aVar2 = (C12255a) aVar.get();
                if (aVar2 == null) {
                    T t = aVar.f35403a;
                    return (C13761q.m58752e(t) || C13761q.m58754g(t)) ? i - 1 : i;
                }
                i++;
                aVar = aVar2;
            }
            return i;
        }

        /* renamed from: a */
        public void mo41959a() {
            C12255a<Object> aVar = this.f35416N;
            if (aVar.f35403a != null) {
                C12255a<Object> aVar2 = new C12255a<>(null);
                aVar2.lazySet(aVar.get());
                this.f35416N = aVar2;
            }
        }

        /* renamed from: a */
        public T[] mo41962a(T[] tArr) {
            C12255a<Object> aVar = this.f35416N;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
                }
                for (int i = 0; i != size; i++) {
                    aVar = (C12255a) aVar.get();
                    tArr[i] = aVar.f35403a;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        /* renamed from: a */
        public void mo41960a(C12257c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                C12280i0<? super T> i0Var = cVar.f35406a;
                C12255a<Object> aVar = (C12255a) cVar.f35404N;
                if (aVar == null) {
                    aVar = this.f35416N;
                }
                int i = 1;
                while (!cVar.f35405O) {
                    C12255a<Object> aVar2 = (C12255a) aVar.get();
                    if (aVar2 != null) {
                        T t = aVar2.f35403a;
                        if (!this.f35418P || aVar2.get() != null) {
                            i0Var.mo33453a(t);
                            aVar = aVar2;
                        } else {
                            if (C13761q.m58752e(t)) {
                                i0Var.onComplete();
                            } else {
                                i0Var.onError(C13761q.m58746b(t));
                            }
                            cVar.f35404N = null;
                            cVar.f35405O = true;
                            return;
                        }
                    } else if (aVar.get() != null) {
                        continue;
                    } else {
                        cVar.f35404N = aVar;
                        i = cVar.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                cVar.f35404N = null;
            }
        }
    }

    /* renamed from: e.a.e1.f$f */
    /* compiled from: ReplaySubject */
    static final class C12260f<T> extends AtomicReference<C12260f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: a */
        final T f35421a;

        /* renamed from: b */
        final long f35422b;

        C12260f(T t, long j) {
            this.f35421a = t;
            this.f35422b = j;
        }
    }

    /* renamed from: e.a.e1.f$g */
    /* compiled from: ReplaySubject */
    static final class C12261g<T> extends AtomicReference<Object> implements C12256b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: N */
        volatile int f35423N;

        /* renamed from: a */
        final List<Object> f35424a;

        /* renamed from: b */
        volatile boolean f35425b;

        C12261g(int i) {
            this.f35424a = new ArrayList(C12390b.m55558a(i, "capacityHint"));
        }

        /* renamed from: a */
        public void mo41959a() {
        }

        /* renamed from: a */
        public void mo41961a(Object obj) {
            this.f35424a.add(obj);
            mo41959a();
            this.f35423N++;
            this.f35425b = true;
        }

        public void add(T t) {
            this.f35424a.add(t);
            this.f35423N++;
        }

        @C5938g
        public T getValue() {
            int i = this.f35423N;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.f35424a;
            T t = list.get(i - 1);
            if (!C13761q.m58752e(t) && !C13761q.m58754g(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return list.get(i - 2);
        }

        public int size() {
            int i = this.f35423N;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.f35424a.get(i2);
            return (C13761q.m58752e(obj) || C13761q.m58754g(obj)) ? i2 : i;
        }

        /* renamed from: a */
        public T[] mo41962a(T[] tArr) {
            int i = this.f35423N;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f35424a;
            Object obj = list.get(i - 1);
            if (C13761q.m58752e(obj) || C13761q.m58754g(obj)) {
                i--;
                if (i == 0) {
                    if (tArr.length != 0) {
                        tArr[0] = null;
                    }
                    return tArr;
                }
            }
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
        public void mo41960a(C12257c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                List<Object> list = this.f35424a;
                C12280i0<? super T> i0Var = cVar.f35406a;
                Integer num = (Integer) cVar.f35404N;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    cVar.f35404N = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!cVar.f35405O) {
                    int i3 = this.f35423N;
                    while (i3 != i) {
                        if (cVar.f35405O) {
                            cVar.f35404N = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.f35425b) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.f35423N;
                                if (i4 == i3) {
                                    if (C13761q.m58752e(obj)) {
                                        i0Var.onComplete();
                                    } else {
                                        i0Var.onError(C13761q.m58746b(obj));
                                    }
                                    cVar.f35404N = null;
                                    cVar.f35405O = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        i0Var.mo33453a(obj);
                        i++;
                    }
                    if (i == this.f35423N) {
                        cVar.f35404N = Integer.valueOf(i);
                        i2 = cVar.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                cVar.f35404N = null;
            }
        }
    }

    C12254f(C12256b<T> bVar) {
        this.f35401a = bVar;
    }

    @C5935d
    @C5937f
    /* renamed from: a0 */
    public static <T> C12254f<T> m55195a0() {
        return new C12254f<>(new C12261g(16));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public static <T> C12254f<T> m55196b(long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        C12258d dVar = new C12258d(i, j, timeUnit, j0Var);
        return new C12254f<>(dVar);
    }

    /* renamed from: b0 */
    static <T> C12254f<T> m55197b0() {
        return new C12254f<>(new C12259e(Integer.MAX_VALUE));
    }

    @C5935d
    @C5937f
    /* renamed from: i */
    public static <T> C12254f<T> m55198i(int i) {
        return new C12254f<>(new C12261g(i));
    }

    @C5935d
    @C5937f
    /* renamed from: j */
    public static <T> C12254f<T> m55199j(int i) {
        return new C12254f<>(new C12259e(i));
    }

    @C5935d
    @C5937f
    /* renamed from: r */
    public static <T> C12254f<T> m55200r(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12258d dVar = new C12258d(Integer.MAX_VALUE, j, timeUnit, j0Var);
        return new C12254f<>(dVar);
    }

    @C5938g
    /* renamed from: P */
    public Throwable mo41897P() {
        Object obj = this.f35401a.get();
        if (C13761q.m58754g(obj)) {
            return C13761q.m58746b(obj);
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo41898Q() {
        return C13761q.m58752e(this.f35401a.get());
    }

    /* renamed from: R */
    public boolean mo41899R() {
        return ((C12257c[]) this.f35402b.get()).length != 0;
    }

    /* renamed from: S */
    public boolean mo41900S() {
        return C13761q.m58754g(this.f35401a.get());
    }

    @C5936e
    /* renamed from: U */
    public void mo41949U() {
        this.f35401a.mo41959a();
    }

    @C5938g
    /* renamed from: V */
    public T mo41950V() {
        return this.f35401a.getValue();
    }

    /* renamed from: W */
    public Object[] mo41951W() {
        Object[] c = mo41957c(f35399Q);
        return c == f35399Q ? new Object[0] : c;
    }

    /* renamed from: X */
    public boolean mo41952X() {
        return this.f35401a.size() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public int mo41953Y() {
        return ((C12257c[]) this.f35402b.get()).length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public int mo41954Z() {
        return this.f35401a.size();
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        if (this.f35400N) {
            cVar.dispose();
        }
    }

    /* renamed from: c */
    public T[] mo41957c(T[] tArr) {
        return this.f35401a.mo41962a(tArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12257c cVar = new C12257c(i0Var, this);
        i0Var.mo34123a((C12314c) cVar);
        if (!cVar.f35405O) {
            if (!mo41955a(cVar) || !cVar.f35405O) {
                this.f35401a.mo41960a(cVar);
            } else {
                mo41956b(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C12257c<T>[] mo41958o(Object obj) {
        if (this.f35401a.compareAndSet(null, obj)) {
            return (C12257c[]) this.f35402b.getAndSet(f35398P);
        }
        return f35398P;
    }

    public void onComplete() {
        if (!this.f35400N) {
            this.f35400N = true;
            Object d = C13761q.m58750d();
            C12256b<T> bVar = this.f35401a;
            bVar.mo41961a(d);
            for (C12257c a : mo41958o(d)) {
                bVar.mo41960a(a);
            }
        }
    }

    public void onError(Throwable th) {
        C12390b.m55563a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f35400N) {
            C12205a.m54894b(th);
            return;
        }
        this.f35400N = true;
        Object a = C13761q.m58743a(th);
        C12256b<T> bVar = this.f35401a;
        bVar.mo41961a(a);
        for (C12257c a2 : mo41958o(a)) {
            bVar.mo41960a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41956b(C12257c<T> cVar) {
        C12257c<T>[] cVarArr;
        C12257c[] cVarArr2;
        do {
            cVarArr = (C12257c[]) this.f35402b.get();
            if (cVarArr != f35398P && cVarArr != f35397O) {
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
                        cVarArr2 = f35397O;
                    } else {
                        C12257c[] cVarArr3 = new C12257c[(length - 1)];
                        System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                        System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                        cVarArr2 = cVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f35402b.compareAndSet(cVarArr, cVarArr2));
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        C12390b.m55563a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f35400N) {
            C12256b<T> bVar = this.f35401a;
            bVar.add(t);
            for (C12257c a : (C12257c[]) this.f35402b.get()) {
                bVar.mo41960a(a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo41955a(C12257c<T> cVar) {
        C12257c[] cVarArr;
        C12257c[] cVarArr2;
        do {
            cVarArr = (C12257c[]) this.f35402b.get();
            if (cVarArr == f35398P) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new C12257c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.f35402b.compareAndSet(cVarArr, cVarArr2));
        return true;
    }
}
