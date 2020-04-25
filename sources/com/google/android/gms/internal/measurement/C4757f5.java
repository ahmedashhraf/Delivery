package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4757f5 extends C4991t2<Long> implements C4931q4, C4726d6, RandomAccess {

    /* renamed from: O */
    private static final C4757f5 f14097O;

    /* renamed from: N */
    private int f14098N;

    /* renamed from: b */
    private long[] f14099b;

    static {
        C4757f5 f5Var = new C4757f5(new long[0], 0);
        f14097O = f5Var;
        f5Var.mo19361d();
    }

    C4757f5() {
        this(new long[10], 0);
    }

    /* renamed from: b */
    private final void m20130b(int i) {
        if (i < 0 || i >= this.f14098N) {
            throw new IndexOutOfBoundsException(m20132c(i));
        }
    }

    /* renamed from: c */
    public static C4757f5 m20131c() {
        return f14097O;
    }

    /* renamed from: a */
    public final void mo18982a(long j) {
        mo19681b();
        int i = this.f14098N;
        long[] jArr = this.f14099b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f14099b = jArr2;
        }
        long[] jArr3 = this.f14099b;
        int i2 = this.f14098N;
        this.f14098N = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14098N;
            if (i <= i2) {
                long[] jArr = this.f14099b;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f14099b, i, jArr2, i + 1, this.f14098N - i);
                    this.f14099b = jArr2;
                }
                this.f14099b[i] = longValue;
                this.f14098N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m20132c(i));
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo19681b();
        C4819j4.m20394a(collection);
        if (!(collection instanceof C4757f5)) {
            return super.addAll(collection);
        }
        C4757f5 f5Var = (C4757f5) collection;
        int i = f5Var.f14098N;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14098N;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f14099b;
            if (i3 > jArr.length) {
                this.f14099b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(f5Var.f14099b, 0, this.f14099b, this.f14098N, f5Var.f14098N);
            this.f14098N = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: e */
    public final long mo18983e(int i) {
        m20130b(i);
        return this.f14099b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4757f5)) {
            return super.equals(obj);
        }
        C4757f5 f5Var = (C4757f5) obj;
        if (this.f14098N != f5Var.f14098N) {
            return false;
        }
        long[] jArr = f5Var.f14099b;
        for (int i = 0; i < this.f14098N; i++) {
            if (this.f14099b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C4931q4 mo18907a(int i) {
        if (i >= this.f14098N) {
            return new C4757f5(Arrays.copyOf(this.f14099b, i), this.f14098N);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo18983e(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14098N; i2++) {
            i = (i * 31) + C4819j4.m20392a(this.f14099b[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo19681b();
        for (int i = 0; i < this.f14098N; i++) {
            if (obj.equals(Long.valueOf(this.f14099b[i]))) {
                long[] jArr = this.f14099b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f14098N - i) - 1);
                this.f14098N--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo19681b();
        if (i2 >= i) {
            long[] jArr = this.f14099b;
            System.arraycopy(jArr, i2, jArr, i, this.f14098N - i2);
            this.f14098N -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo19681b();
        m20130b(i);
        long[] jArr = this.f14099b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f14098N;
    }

    private C4757f5(long[] jArr, int i) {
        this.f14099b = jArr;
        this.f14098N = i;
    }

    /* renamed from: c */
    private final String m20132c(int i) {
        int i2 = this.f14098N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        m20130b(i);
        long[] jArr = this.f14099b;
        long j = jArr[i];
        int i2 = this.f14098N;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f14098N--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo18982a(((Long) obj).longValue());
        return true;
    }
}
