package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4724d4 extends C4991t2<Float> implements C4912p4<Float>, C4726d6, RandomAccess {

    /* renamed from: O */
    private static final C4724d4 f14041O;

    /* renamed from: N */
    private int f14042N;

    /* renamed from: b */
    private float[] f14043b;

    static {
        C4724d4 d4Var = new C4724d4(new float[0], 0);
        f14041O = d4Var;
        d4Var.mo19361d();
    }

    C4724d4() {
        this(new float[10], 0);
    }

    /* renamed from: e */
    private final void m20016e(int i) {
        if (i < 0 || i >= this.f14042N) {
            throw new IndexOutOfBoundsException(m20017f(i));
        }
    }

    /* renamed from: f */
    private final String m20017f(int i) {
        int i2 = this.f14042N;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo18908a(float f) {
        mo19681b();
        int i = this.f14042N;
        float[] fArr = this.f14043b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f14043b = fArr2;
        }
        float[] fArr3 = this.f14043b;
        int i2 = this.f14042N;
        this.f14042N = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo19681b();
        if (i >= 0) {
            int i2 = this.f14042N;
            if (i <= i2) {
                float[] fArr = this.f14043b;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f14043b, i, fArr2, i + 1, this.f14042N - i);
                    this.f14043b = fArr2;
                }
                this.f14043b[i] = floatValue;
                this.f14042N++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m20017f(i));
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo19681b();
        C4819j4.m20394a(collection);
        if (!(collection instanceof C4724d4)) {
            return super.addAll(collection);
        }
        C4724d4 d4Var = (C4724d4) collection;
        int i = d4Var.f14042N;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14042N;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f14043b;
            if (i3 > fArr.length) {
                this.f14043b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(d4Var.f14043b, 0, this.f14043b, this.f14042N, d4Var.f14042N);
            this.f14042N = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4724d4)) {
            return super.equals(obj);
        }
        C4724d4 d4Var = (C4724d4) obj;
        if (this.f14042N != d4Var.f14042N) {
            return false;
        }
        float[] fArr = d4Var.f14043b;
        for (int i = 0; i < this.f14042N; i++) {
            if (Float.floatToIntBits(this.f14043b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m20016e(i);
        return Float.valueOf(this.f14043b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14042N; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f14043b[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo19681b();
        for (int i = 0; i < this.f14042N; i++) {
            if (obj.equals(Float.valueOf(this.f14043b[i]))) {
                float[] fArr = this.f14043b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f14042N - i) - 1);
                this.f14042N--;
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
            float[] fArr = this.f14043b;
            System.arraycopy(fArr, i2, fArr, i, this.f14042N - i2);
            this.f14042N -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo19681b();
        m20016e(i);
        float[] fArr = this.f14043b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f14042N;
    }

    private C4724d4(float[] fArr, int i) {
        this.f14043b = fArr;
        this.f14042N = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        m20016e(i);
        float[] fArr = this.f14043b;
        float f = fArr[i];
        int i2 = this.f14042N;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f14042N--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: a */
    public final /* synthetic */ C4912p4 mo18907a(int i) {
        if (i >= this.f14042N) {
            return new C4724d4(Arrays.copyOf(this.f14043b, i), this.f14042N);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo18908a(((Float) obj).floatValue());
        return true;
    }
}
