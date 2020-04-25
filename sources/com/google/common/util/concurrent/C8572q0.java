package com.google.common.util.concurrent;

import com.google.common.base.C5827t;
import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import com.google.common.collect.C7660d4;
import com.google.common.collect.C8145s3;
import com.google.common.collect.C8257x2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p278e.C6602d;

@C2775a
/* renamed from: com.google.common.util.concurrent.q0 */
/* compiled from: Striped */
public abstract class C8572q0<L> {

    /* renamed from: a */
    private static final int f22555a = 1024;

    /* renamed from: b */
    private static final C7344g0<ReadWriteLock> f22556b = new C8577e();

    /* renamed from: c */
    private static final int f22557c = -1;

    /* renamed from: com.google.common.util.concurrent.q0$a */
    /* compiled from: Striped */
    static class C8573a implements C7344g0<Lock> {
        C8573a() {
        }

        public Lock get() {
            return new C8580h();
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$b */
    /* compiled from: Striped */
    static class C8574b implements C7344g0<Lock> {
        C8574b() {
        }

        public Lock get() {
            return new ReentrantLock(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$c */
    /* compiled from: Striped */
    static class C8575c implements C7344g0<Semaphore> {

        /* renamed from: a */
        final /* synthetic */ int f22558a;

        C8575c(int i) {
            this.f22558a = i;
        }

        public Semaphore get() {
            return new C8581i(this.f22558a);
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$d */
    /* compiled from: Striped */
    static class C8576d implements C7344g0<Semaphore> {

        /* renamed from: a */
        final /* synthetic */ int f22559a;

        C8576d(int i) {
            this.f22559a = i;
        }

        public Semaphore get() {
            return new Semaphore(this.f22559a, false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$e */
    /* compiled from: Striped */
    static class C8577e implements C7344g0<ReadWriteLock> {
        C8577e() {
        }

        public ReadWriteLock get() {
            return new ReentrantReadWriteLock();
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$f */
    /* compiled from: Striped */
    private static class C8578f<L> extends C8582j<L> {

        /* renamed from: e */
        private final Object[] f22560e;

        /* synthetic */ C8578f(int i, C7344g0 g0Var, C8573a aVar) {
            this(i, g0Var);
        }

        /* renamed from: a */
        public L mo31891a(int i) {
            return this.f22560e[i];
        }

        private C8578f(int i, C7344g0<L> g0Var) {
            super(i);
            int i2 = 0;
            C7397x.m35671a(i <= 1073741824, (Object) "Stripes must be <= 2^30)");
            this.f22560e = new Object[(this.f22570d + 1)];
            while (true) {
                Object[] objArr = this.f22560e;
                if (i2 < objArr.length) {
                    objArr[i2] = g0Var.get();
                    i2++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public int mo31889a() {
            return this.f22560e.length;
        }
    }

    @C2778d
    /* renamed from: com.google.common.util.concurrent.q0$g */
    /* compiled from: Striped */
    static class C8579g<L> extends C8582j<L> {

        /* renamed from: e */
        final ConcurrentMap<Integer, L> f22561e;

        /* renamed from: f */
        final C7344g0<L> f22562f;

        /* renamed from: g */
        final int f22563g;

        C8579g(int i, C7344g0<L> g0Var) {
            super(i);
            int i2 = this.f22570d;
            this.f22563g = i2 == -1 ? Integer.MAX_VALUE : i2 + 1;
            this.f22562f = g0Var;
            this.f22561e = new C7660d4().m36633f().mo29954c();
        }

        /* renamed from: a */
        public L mo31891a(int i) {
            if (this.f22563g != Integer.MAX_VALUE) {
                C7397x.m35663a(i, mo31889a());
            }
            L l = this.f22561e.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            Object obj = this.f22562f.get();
            return C5827t.m25564b(this.f22561e.putIfAbsent(Integer.valueOf(i), obj), obj);
        }

        /* renamed from: a */
        public int mo31889a() {
            return this.f22563g;
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$h */
    /* compiled from: Striped */
    private static class C8580h extends ReentrantLock {

        /* renamed from: N */
        long f22564N;

        /* renamed from: a */
        long f22565a;

        /* renamed from: b */
        long f22566b;

        C8580h() {
            super(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$i */
    /* compiled from: Striped */
    private static class C8581i extends Semaphore {

        /* renamed from: N */
        long f22567N;

        /* renamed from: a */
        long f22568a;

        /* renamed from: b */
        long f22569b;

        C8581i(int i) {
            super(i, false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.q0$j */
    /* compiled from: Striped */
    private static abstract class C8582j<L> extends C8572q0<L> {

        /* renamed from: d */
        final int f22570d;

        C8582j(int i) {
            int i2;
            super(null);
            C7397x.m35671a(i > 0, (Object) "Stripes must be positive");
            if (i > 1073741824) {
                i2 = -1;
            } else {
                i2 = C8572q0.m40439d(i) - 1;
            }
            this.f22570d = i2;
        }

        /* renamed from: a */
        public final L mo31892a(Object obj) {
            return mo31891a(mo31893b(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo31893b(Object obj) {
            return C8572q0.m40444i(obj.hashCode()) & this.f22570d;
        }
    }

    @C2778d
    /* renamed from: com.google.common.util.concurrent.q0$k */
    /* compiled from: Striped */
    static class C8583k<L> extends C8582j<L> {

        /* renamed from: e */
        final AtomicReferenceArray<C8584a<? extends L>> f22571e;

        /* renamed from: f */
        final C7344g0<L> f22572f;

        /* renamed from: g */
        final int f22573g;

        /* renamed from: h */
        final ReferenceQueue<L> f22574h = new ReferenceQueue<>();

        /* renamed from: com.google.common.util.concurrent.q0$k$a */
        /* compiled from: Striped */
        private static final class C8584a<L> extends WeakReference<L> {

            /* renamed from: a */
            final int f22575a;

            C8584a(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.f22575a = i;
            }
        }

        C8583k(int i, C7344g0<L> g0Var) {
            super(i);
            int i2 = this.f22570d;
            this.f22573g = i2 == -1 ? Integer.MAX_VALUE : i2 + 1;
            this.f22571e = new AtomicReferenceArray<>(this.f22573g);
            this.f22572f = g0Var;
        }

        /* renamed from: b */
        private void m40456b() {
            while (true) {
                Reference poll = this.f22574h.poll();
                if (poll != null) {
                    C8584a aVar = (C8584a) poll;
                    this.f22571e.compareAndSet(aVar.f22575a, aVar, null);
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public L mo31891a(int i) {
            L l;
            L l2;
            if (this.f22573g != Integer.MAX_VALUE) {
                C7397x.m35663a(i, mo31889a());
            }
            C8584a aVar = (C8584a) this.f22571e.get(i);
            if (aVar == null) {
                l = null;
            } else {
                l = aVar.get();
            }
            if (l != null) {
                return l;
            }
            L l3 = this.f22572f.get();
            C8584a aVar2 = new C8584a(l3, i, this.f22574h);
            while (!this.f22571e.compareAndSet(i, aVar, aVar2)) {
                aVar = (C8584a) this.f22571e.get(i);
                if (aVar == null) {
                    l2 = null;
                    continue;
                } else {
                    l2 = aVar.get();
                    continue;
                }
                if (l2 != null) {
                    return l2;
                }
            }
            m40456b();
            return l3;
        }

        /* renamed from: a */
        public int mo31889a() {
            return this.f22573g;
        }
    }

    /* synthetic */ C8572q0(C8573a aVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m40439d(int i) {
        return 1 << C6602d.m31377b(i, RoundingMode.CEILING);
    }

    /* renamed from: e */
    public static C8572q0<Lock> m40440e(int i) {
        return m40435a(i, (C7344g0<L>) new C8574b<L>());
    }

    /* renamed from: f */
    public static C8572q0<ReadWriteLock> m40441f(int i) {
        return m40435a(i, f22556b);
    }

    /* renamed from: g */
    public static C8572q0<Lock> m40442g(int i) {
        return new C8578f(i, new C8573a(), null);
    }

    /* renamed from: h */
    public static C8572q0<ReadWriteLock> m40443h(int i) {
        return new C8578f(i, f22556b, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m40444i(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* renamed from: a */
    public abstract int mo31889a();

    /* renamed from: a */
    public Iterable<L> mo31890a(Iterable<?> iterable) {
        Object[] b = C8145s3.m39027b(iterable, Object.class);
        if (b.length == 0) {
            return C8257x2.m39412m();
        }
        int[] iArr = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            iArr[i] = mo31893b(b[i]);
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        b[0] = mo31891a(i2);
        for (int i3 = 1; i3 < b.length; i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                b[i3] = b[i3 - 1];
            } else {
                b[i3] = mo31891a(i4);
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(Arrays.asList(b));
    }

    /* renamed from: a */
    public abstract L mo31891a(int i);

    /* renamed from: a */
    public abstract L mo31892a(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo31893b(Object obj);

    private C8572q0() {
    }

    /* renamed from: b */
    public static C8572q0<Semaphore> m40437b(int i, int i2) {
        return new C8578f(i, new C8575c(i2), null);
    }

    /* renamed from: a */
    private static <L> C8572q0<L> m40435a(int i, C7344g0<L> g0Var) {
        return i < 1024 ? new C8583k(i, g0Var) : new C8579g(i, g0Var);
    }

    /* renamed from: a */
    public static C8572q0<Semaphore> m40434a(int i, int i2) {
        return m40435a(i, (C7344g0<L>) new C8576d<L>(i2));
    }
}
