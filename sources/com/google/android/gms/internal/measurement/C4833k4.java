package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4833k4 extends C4991t2<Integer> implements C4886n4, C4726d6, RandomAccess {

    /* renamed from: O */
    private static final C4833k4 f14239O;

    /* renamed from: N */
    private int f14240N;

    /* renamed from: b */
    private int[] f14241b;

    static {
        C4833k4 k4Var = new C4833k4(new int[0], 0);
        f14239O = k4Var;
        k4Var.mo19361d();
    }

    C4833k4() {
        this(new int[10], 0);
    }

    /* renamed from: c */
    public static C4833k4 m20484c() {
        return f14239O;
    }

    /* renamed from: d */
    private final String m20486d(int i) {
        int i2 = this.f14240N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14240N;
            if (i <= i2) {
                int[] iArr = this.f14241b;
                if (i2 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                } else {
                    int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f14241b, i, iArr2, i + 1, this.f14240N - i);
                    this.f14241b = iArr2;
                }
                this.f14241b[i] = intValue;
                this.f14240N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m20486d(i));
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo19681b();
        C4819j4.m20394a(collection);
        if (!(collection instanceof C4833k4)) {
            return super.addAll(collection);
        }
        C4833k4 k4Var = (C4833k4) collection;
        int i = k4Var.f14240N;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14240N;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f14241b;
            if (i3 > iArr.length) {
                this.f14241b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(k4Var.f14241b, 0, this.f14241b, this.f14240N, k4Var.f14240N);
            this.f14240N = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void mo19167b(int i) {
        mo19681b();
        int i2 = this.f14240N;
        int[] iArr = this.f14241b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f14241b = iArr2;
        }
        int[] iArr3 = this.f14241b;
        int i3 = this.f14240N;
        this.f14240N = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: e */
    public final C4886n4 mo18907a(int i) {
        if (i >= this.f14240N) {
            return new C4833k4(Arrays.copyOf(this.f14241b, i), this.f14240N);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4833k4)) {
            return super.equals(obj);
        }
        C4833k4 k4Var = (C4833k4) obj;
        if (this.f14240N != k4Var.f14240N) {
            return false;
        }
        int[] iArr = k4Var.f14241b;
        for (int i = 0; i < this.f14240N; i++) {
            if (this.f14241b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo19169f(int i) {
        m20485c(i);
        return this.f14241b[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo19169f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14240N; i2++) {
            i = (i * 31) + this.f14241b[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo19681b();
        for (int i = 0; i < this.f14240N; i++) {
            if (obj.equals(Integer.valueOf(this.f14241b[i]))) {
                int[] iArr = this.f14241b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f14240N - i) - 1);
                this.f14240N--;
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
            int[] iArr = this.f14241b;
            System.arraycopy(iArr, i2, iArr, i, this.f14240N - i2);
            this.f14240N -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo19681b();
        m20485c(i);
        int[] iArr = this.f14241b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f14240N;
    }

    private C4833k4(int[] iArr, int i) {
        this.f14241b = iArr;
        this.f14240N = i;
    }

    /* renamed from: c */
    private final void m20485c(int i) {
        if (i < 0 || i >= this.f14240N) {
            throw new IndexOutOfBoundsException(m20486d(i));
        }
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        m20485c(i);
        int[] iArr = this.f14241b;
        int i2 = iArr[i];
        int i3 = this.f14240N;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f14240N--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo19167b(((Integer) obj).intValue());
        return true;
    }
}
