package p195e.p196a.p199x0.p462f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13767t;
import p195e.p196a.p199x0.p452c.C12405n;

/* renamed from: e.a.x0.f.c */
/* compiled from: SpscLinkedArrayQueue */
public final class C13663c<T> implements C12405n<T> {

    /* renamed from: T */
    static final int f39526T = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: U */
    private static final Object f39527U = new Object();

    /* renamed from: N */
    long f39528N;

    /* renamed from: O */
    final int f39529O;

    /* renamed from: P */
    AtomicReferenceArray<Object> f39530P;

    /* renamed from: Q */
    final int f39531Q;

    /* renamed from: R */
    AtomicReferenceArray<Object> f39532R;

    /* renamed from: S */
    final AtomicLong f39533S = new AtomicLong();

    /* renamed from: a */
    final AtomicLong f39534a = new AtomicLong();

    /* renamed from: b */
    int f39535b;

    public C13663c(int i) {
        int b = C13767t.m58771b(Math.max(8, i));
        int i2 = b - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b + 1);
        this.f39530P = atomicReferenceArray;
        this.f39529O = i2;
        m58451a(b);
        this.f39532R = atomicReferenceArray;
        this.f39531Q = i2;
        this.f39528N = (long) (i2 - 1);
        m58460b(0);
    }

    /* renamed from: a */
    private boolean m58456a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m58453a(atomicReferenceArray, i, (Object) t);
        m58460b(j + 1);
        return true;
    }

    /* renamed from: b */
    private static int m58457b(int i) {
        return i;
    }

    /* renamed from: b */
    private AtomicReferenceArray<Object> m58459b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m58457b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m58449a(atomicReferenceArray, b);
        m58453a(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: c */
    private long m58461c() {
        return this.f39533S.get();
    }

    /* renamed from: d */
    private long m58462d() {
        return this.f39534a.get();
    }

    /* renamed from: e */
    private long m58463e() {
        return this.f39533S.get();
    }

    /* renamed from: f */
    private long m58464f() {
        return this.f39534a.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m58464f() == m58463e();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f39530P;
            long d = m58462d();
            int i = this.f39529O;
            int a = m58448a(d, i);
            if (d < this.f39528N) {
                return m58456a(atomicReferenceArray, t, d, a);
            }
            long j = ((long) this.f39535b) + d;
            if (m58449a(atomicReferenceArray, m58448a(j, i)) == null) {
                this.f39528N = j - 1;
                return m58456a(atomicReferenceArray, t, d, a);
            } else if (m58449a(atomicReferenceArray, m58448a(1 + d, i)) == null) {
                return m58456a(atomicReferenceArray, t, d, a);
            } else {
                m58454a(atomicReferenceArray, d, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    @C5938g
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f39532R;
        long c = m58461c();
        int i = this.f39531Q;
        int a = m58448a(c, i);
        T a2 = m58449a(atomicReferenceArray, a);
        boolean z = a2 == f39527U;
        if (a2 != null && !z) {
            m58453a(atomicReferenceArray, a, (Object) null);
            m58452a(c + 1);
            return a2;
        } else if (z) {
            return m58458b(m58459b(atomicReferenceArray, i + 1), c, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private void m58454a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f39530P = atomicReferenceArray2;
        this.f39528N = (j2 + j) - 1;
        m58453a(atomicReferenceArray2, i, (Object) t);
        m58455a(atomicReferenceArray, atomicReferenceArray2);
        m58453a(atomicReferenceArray, i, f39527U);
        m58460b(j + 1);
    }

    /* renamed from: b */
    private T m58458b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f39532R = atomicReferenceArray;
        int a = m58448a(j, i);
        T a2 = m58449a(atomicReferenceArray, a);
        if (a2 != null) {
            m58453a(atomicReferenceArray, a, (Object) null);
            m58452a(j + 1);
        }
        return a2;
    }

    /* renamed from: b */
    public int mo43035b() {
        long e = m58463e();
        while (true) {
            long f = m58464f();
            long e2 = m58463e();
            if (e == e2) {
                return (int) (f - e2);
            }
            e = e2;
        }
    }

    /* renamed from: a */
    private void m58455a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m58453a(atomicReferenceArray, m58457b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: b */
    private void m58460b(long j) {
        this.f39534a.lazySet(j);
    }

    /* renamed from: a */
    public T mo43034a() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f39532R;
        long c = m58461c();
        int i = this.f39531Q;
        T a = m58449a(atomicReferenceArray, m58448a(c, i));
        return a == f39527U ? m58450a(m58459b(atomicReferenceArray, i + 1), c, i) : a;
    }

    /* renamed from: a */
    private T m58450a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f39532R = atomicReferenceArray;
        return m58449a(atomicReferenceArray, m58448a(j, i));
    }

    /* renamed from: a */
    private void m58451a(int i) {
        this.f39535b = Math.min(i / 4, f39526T);
    }

    /* renamed from: a */
    private void m58452a(long j) {
        this.f39533S.lazySet(j);
    }

    /* renamed from: a */
    private static int m58448a(long j, int i) {
        return m58457b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m58453a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m58449a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    public boolean mo42104a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f39530P;
        long f = m58464f();
        int i = this.f39529O;
        long j = 2 + f;
        if (m58449a(atomicReferenceArray, m58448a(j, i)) == null) {
            int a = m58448a(f, i);
            m58453a(atomicReferenceArray, a + 1, (Object) t2);
            m58453a(atomicReferenceArray, a, (Object) t);
            m58460b(j);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f39530P = atomicReferenceArray2;
            int a2 = m58448a(f, i);
            m58453a(atomicReferenceArray2, a2 + 1, (Object) t2);
            m58453a(atomicReferenceArray2, a2, (Object) t);
            m58455a(atomicReferenceArray, atomicReferenceArray2);
            m58453a(atomicReferenceArray, a2, f39527U);
            m58460b(j);
        }
        return true;
    }
}
