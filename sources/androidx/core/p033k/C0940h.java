package androidx.core.p033k;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.k.h */
/* compiled from: Pools */
public final class C0940h {

    /* renamed from: androidx.core.k.h$a */
    /* compiled from: Pools */
    public interface C0941a<T> {
        @C0195i0
        /* renamed from: a */
        T mo4743a();

        boolean release(@C0193h0 T t);
    }

    /* renamed from: androidx.core.k.h$b */
    /* compiled from: Pools */
    public static class C0942b<T> implements C0941a<T> {

        /* renamed from: a */
        private final Object[] f4273a;

        /* renamed from: b */
        private int f4274b;

        public C0942b(int i) {
            if (i > 0) {
                this.f4273a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo4743a() {
            int i = this.f4274b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f4273a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f4274b = i - 1;
            return t;
        }

        public boolean release(@C0193h0 T t) {
            if (!m5331a(t)) {
                int i = this.f4274b;
                Object[] objArr = this.f4273a;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.f4274b = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        /* renamed from: a */
        private boolean m5331a(@C0193h0 T t) {
            for (int i = 0; i < this.f4274b; i++) {
                if (this.f4273a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.core.k.h$c */
    /* compiled from: Pools */
    public static class C0943c<T> extends C0942b<T> {

        /* renamed from: c */
        private final Object f4275c = new Object();

        public C0943c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo4743a() {
            T a;
            synchronized (this.f4275c) {
                a = super.mo4743a();
            }
            return a;
        }

        public boolean release(@C0193h0 T t) {
            boolean release;
            synchronized (this.f4275c) {
                release = super.release(t);
            }
            return release;
        }
    }

    private C0940h() {
    }
}
