package androidx.constraintlayout.solver;

/* renamed from: androidx.constraintlayout.solver.f */
/* compiled from: Pools */
final class C0657f {

    /* renamed from: a */
    private static final boolean f2636a = false;

    /* renamed from: androidx.constraintlayout.solver.f$a */
    /* compiled from: Pools */
    interface C0658a<T> {
        /* renamed from: a */
        T mo3491a();

        /* renamed from: a */
        void mo3492a(T[] tArr, int i);

        boolean release(T t);
    }

    /* renamed from: androidx.constraintlayout.solver.f$b */
    /* compiled from: Pools */
    static class C0659b<T> implements C0658a<T> {

        /* renamed from: a */
        private final Object[] f2637a;

        /* renamed from: b */
        private int f2638b;

        C0659b(int i) {
            if (i > 0) {
                this.f2637a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo3491a() {
            int i = this.f2638b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f2637a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f2638b = i - 1;
            return t;
        }

        public boolean release(T t) {
            int i = this.f2638b;
            Object[] objArr = this.f2637a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2638b = i + 1;
            return true;
        }

        /* renamed from: a */
        public void mo3492a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f2638b;
                Object[] objArr = this.f2637a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f2638b = i3 + 1;
                }
            }
        }

        /* renamed from: a */
        private boolean m3615a(T t) {
            for (int i = 0; i < this.f2638b; i++) {
                if (this.f2637a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    private C0657f() {
    }
}
