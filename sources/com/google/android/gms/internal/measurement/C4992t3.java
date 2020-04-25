package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4992t3 extends C4991t2<Double> implements C4912p4<Double>, C4726d6, RandomAccess {

    /* renamed from: O */
    private static final C4992t3 f14410O;

    /* renamed from: N */
    private int f14411N;

    /* renamed from: b */
    private double[] f14412b;

    static {
        C4992t3 t3Var = new C4992t3(new double[0], 0);
        f14410O = t3Var;
        t3Var.mo19361d();
    }

    C4992t3() {
        this(new double[10], 0);
    }

    /* renamed from: e */
    private final void m21583e(int i) {
        if (i < 0 || i >= this.f14411N) {
            throw new IndexOutOfBoundsException(m21584f(i));
        }
    }

    /* renamed from: f */
    private final String m21584f(int i) {
        int i2 = this.f14411N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo19685a(double d) {
        mo19681b();
        int i = this.f14411N;
        double[] dArr = this.f14412b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f14412b = dArr2;
        }
        double[] dArr3 = this.f14412b;
        int i2 = this.f14411N;
        this.f14411N = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14411N;
            if (i <= i2) {
                double[] dArr = this.f14412b;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f14412b, i, dArr2, i + 1, this.f14411N - i);
                    this.f14412b = dArr2;
                }
                this.f14412b[i] = doubleValue;
                this.f14411N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m21584f(i));
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo19681b();
        C4819j4.m20394a(collection);
        if (!(collection instanceof C4992t3)) {
            return super.addAll(collection);
        }
        C4992t3 t3Var = (C4992t3) collection;
        int i = t3Var.f14411N;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14411N;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f14412b;
            if (i3 > dArr.length) {
                this.f14412b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(t3Var.f14412b, 0, this.f14412b, this.f14411N, t3Var.f14411N);
            this.f14411N = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4992t3)) {
            return super.equals(obj);
        }
        C4992t3 t3Var = (C4992t3) obj;
        if (this.f14411N != t3Var.f14411N) {
            return false;
        }
        double[] dArr = t3Var.f14412b;
        for (int i = 0; i < this.f14411N; i++) {
            if (Double.doubleToLongBits(this.f14412b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m21583e(i);
        return Double.valueOf(this.f14412b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14411N; i2++) {
            i = (i * 31) + C4819j4.m20392a(Double.doubleToLongBits(this.f14412b[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo19681b();
        for (int i = 0; i < this.f14411N; i++) {
            if (obj.equals(Double.valueOf(this.f14412b[i]))) {
                double[] dArr = this.f14412b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f14411N - i) - 1);
                this.f14411N--;
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
            double[] dArr = this.f14412b;
            System.arraycopy(dArr, i2, dArr, i, this.f14411N - i2);
            this.f14411N -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo19681b();
        m21583e(i);
        double[] dArr = this.f14412b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f14411N;
    }

    private C4992t3(double[] dArr, int i) {
        this.f14412b = dArr;
        this.f14411N = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        m21583e(i);
        double[] dArr = this.f14412b;
        double d = dArr[i];
        int i2 = this.f14411N;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f14411N--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: a */
    public final /* synthetic */ C4912p4 mo18907a(int i) {
        if (i >= this.f14411N) {
            return new C4992t3(Arrays.copyOf(this.f14412b, i), this.f14411N);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo19685a(((Double) obj).doubleValue());
        return true;
    }
}
