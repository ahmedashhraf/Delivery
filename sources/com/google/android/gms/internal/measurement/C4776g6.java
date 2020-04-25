package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4776g6<E> extends C4991t2<E> implements RandomAccess {

    /* renamed from: O */
    private static final C4776g6<Object> f14143O;

    /* renamed from: N */
    private int f14144N;

    /* renamed from: b */
    private E[] f14145b;

    static {
        C4776g6<Object> g6Var = new C4776g6<>(new Object[0], 0);
        f14143O = g6Var;
        g6Var.mo19361d();
    }

    C4776g6() {
        this(new Object[10], 0);
    }

    /* renamed from: c */
    public static <E> C4776g6<E> m20237c() {
        return f14143O;
    }

    /* renamed from: e */
    private final void m20238e(int i) {
        if (i < 0 || i >= this.f14144N) {
            throw new IndexOutOfBoundsException(m20239f(i));
        }
    }

    /* renamed from: f */
    private final String m20239f(int i) {
        int i2 = this.f14144N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4912p4 mo18907a(int i) {
        if (i >= this.f14144N) {
            return new C4776g6(Arrays.copyOf(this.f14145b, i), this.f14144N);
        }
        throw new IllegalArgumentException();
    }

    public final boolean add(E e) {
        mo19681b();
        int i = this.f14144N;
        E[] eArr = this.f14145b;
        if (i == eArr.length) {
            this.f14145b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14145b;
        int i2 = this.f14144N;
        this.f14144N = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        m20238e(i);
        return this.f14145b[i];
    }

    public final E remove(int i) {
        mo19681b();
        m20238e(i);
        E[] eArr = this.f14145b;
        E e = eArr[i];
        int i2 = this.f14144N;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f14144N--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo19681b();
        m20238e(i);
        E[] eArr = this.f14145b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f14144N;
    }

    private C4776g6(E[] eArr, int i) {
        this.f14145b = eArr;
        this.f14144N = i;
    }

    public final void add(int i, E e) {
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14144N;
            if (i <= i2) {
                E[] eArr = this.f14145b;
                if (i2 < eArr.length) {
                    System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
                } else {
                    E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(eArr, 0, eArr2, 0, i);
                    System.arraycopy(this.f14145b, i, eArr2, i + 1, this.f14144N - i);
                    this.f14145b = eArr2;
                }
                this.f14145b[i] = e;
                this.f14144N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m20239f(i));
    }
}
