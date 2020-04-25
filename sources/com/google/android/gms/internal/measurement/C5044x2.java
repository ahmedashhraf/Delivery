package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5044x2 extends C4991t2<Boolean> implements C4912p4<Boolean>, C4726d6, RandomAccess {

    /* renamed from: O */
    private static final C5044x2 f14502O;

    /* renamed from: N */
    private int f14503N;

    /* renamed from: b */
    private boolean[] f14504b;

    static {
        C5044x2 x2Var = new C5044x2(new boolean[0], 0);
        f14502O = x2Var;
        x2Var.mo19361d();
    }

    C5044x2() {
        this(new boolean[10], 0);
    }

    /* renamed from: e */
    private final void m21770e(int i) {
        if (i < 0 || i >= this.f14503N) {
            throw new IndexOutOfBoundsException(m21771f(i));
        }
    }

    /* renamed from: f */
    private final String m21771f(int i) {
        int i2 = this.f14503N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo19735a(boolean z) {
        mo19681b();
        int i = this.f14503N;
        boolean[] zArr = this.f14504b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f14504b = zArr2;
        }
        boolean[] zArr3 = this.f14504b;
        int i2 = this.f14503N;
        this.f14503N = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14503N;
            if (i <= i2) {
                boolean[] zArr = this.f14504b;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f14504b, i, zArr2, i + 1, this.f14503N - i);
                    this.f14504b = zArr2;
                }
                this.f14504b[i] = booleanValue;
                this.f14503N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m21771f(i));
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo19681b();
        C4819j4.m20394a(collection);
        if (!(collection instanceof C5044x2)) {
            return super.addAll(collection);
        }
        C5044x2 x2Var = (C5044x2) collection;
        int i = x2Var.f14503N;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14503N;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f14504b;
            if (i3 > zArr.length) {
                this.f14504b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(x2Var.f14504b, 0, this.f14504b, this.f14503N, x2Var.f14503N);
            this.f14503N = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5044x2)) {
            return super.equals(obj);
        }
        C5044x2 x2Var = (C5044x2) obj;
        if (this.f14503N != x2Var.f14503N) {
            return false;
        }
        boolean[] zArr = x2Var.f14504b;
        for (int i = 0; i < this.f14503N; i++) {
            if (this.f14504b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m21770e(i);
        return Boolean.valueOf(this.f14504b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14503N; i2++) {
            i = (i * 31) + C4819j4.m20393a(this.f14504b[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo19681b();
        for (int i = 0; i < this.f14503N; i++) {
            if (obj.equals(Boolean.valueOf(this.f14504b[i]))) {
                boolean[] zArr = this.f14504b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f14503N - i) - 1);
                this.f14503N--;
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
            boolean[] zArr = this.f14504b;
            System.arraycopy(zArr, i2, zArr, i, this.f14503N - i2);
            this.f14503N -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19681b();
        m21770e(i);
        boolean[] zArr = this.f14504b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f14503N;
    }

    private C5044x2(boolean[] zArr, int i) {
        this.f14504b = zArr;
        this.f14503N = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        m21770e(i);
        boolean[] zArr = this.f14504b;
        boolean z = zArr[i];
        int i2 = this.f14503N;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f14503N--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final /* synthetic */ C4912p4 mo18907a(int i) {
        if (i >= this.f14503N) {
            return new C5044x2(Arrays.copyOf(this.f14504b, i), this.f14503N);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo19735a(((Boolean) obj).booleanValue());
        return true;
    }
}
