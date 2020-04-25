package androidx.collection;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.collection.f */
/* compiled from: LongSparseArray */
public class C0642f<E> implements Cloneable {

    /* renamed from: P */
    private static final Object f2528P = new Object();

    /* renamed from: N */
    private Object[] f2529N;

    /* renamed from: O */
    private int f2530O;

    /* renamed from: a */
    private boolean f2531a;

    /* renamed from: b */
    private long[] f2532b;

    public C0642f() {
        this(10);
    }

    /* renamed from: a */
    public boolean mo3275a(long j, E e, E e2) {
        int d = mo3288d(j);
        if (d >= 0) {
            E e3 = this.f2529N[d];
            if (e3 == e || (e != null && e.equals(e3))) {
                this.f2529N[d] = e2;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public E mo3278b(long j, E e) {
        int a = C0641e.m3425a(this.f2532b, this.f2530O, j);
        if (a >= 0) {
            E[] eArr = this.f2529N;
            if (eArr[a] != f2528P) {
                return eArr[a];
            }
        }
        return e;
    }

    @C0195i0
    /* renamed from: c */
    public E mo3283c(long j) {
        return mo3278b(j, null);
    }

    @C0195i0
    /* renamed from: d */
    public E mo3289d(long j, E e) {
        E c = mo3283c(j);
        if (c == null) {
            mo3284c(j, e);
        }
        return c;
    }

    /* renamed from: e */
    public void mo3290e(long j) {
        int a = C0641e.m3425a(this.f2532b, this.f2530O, j);
        if (a >= 0) {
            Object[] objArr = this.f2529N;
            Object obj = objArr[a];
            Object obj2 = f2528P;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f2531a = true;
            }
        }
    }

    @C0195i0
    /* renamed from: f */
    public E mo3292f(long j, E e) {
        int d = mo3288d(j);
        if (d < 0) {
            return null;
        }
        E[] eArr = this.f2529N;
        E e2 = eArr[d];
        eArr[d] = e;
        return e2;
    }

    public String toString() {
        if (mo3287d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2530O * 28);
        sb.append('{');
        for (int i = 0; i < this.f2530O; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3270a(i));
            sb.append('=');
            Object c = mo3282c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0642f(int i) {
        this.f2531a = false;
        if (i == 0) {
            this.f2532b = C0641e.f2526b;
            this.f2529N = C0641e.f2527c;
            return;
        }
        int c = C0641e.m3428c(i);
        this.f2532b = new long[c];
        this.f2529N = new Object[c];
    }

    /* renamed from: c */
    public void mo3284c(long j, E e) {
        int a = C0641e.m3425a(this.f2532b, this.f2530O, j);
        if (a >= 0) {
            this.f2529N[a] = e;
        } else {
            int i = a ^ -1;
            if (i < this.f2530O) {
                Object[] objArr = this.f2529N;
                if (objArr[i] == f2528P) {
                    this.f2532b[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f2531a && this.f2530O >= this.f2532b.length) {
                m3429e();
                i = C0641e.m3425a(this.f2532b, this.f2530O, j) ^ -1;
            }
            int i2 = this.f2530O;
            if (i2 >= this.f2532b.length) {
                int c = C0641e.m3428c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f2532b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f2529N;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f2532b = jArr;
                this.f2529N = objArr2;
            }
            int i3 = this.f2530O;
            if (i3 - i != 0) {
                long[] jArr3 = this.f2532b;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f2529N;
                System.arraycopy(objArr4, i, objArr4, i4, this.f2530O - i);
            }
            this.f2532b[i] = j;
            this.f2529N[i] = e;
            this.f2530O++;
        }
    }

    public C0642f<E> clone() {
        try {
            C0642f<E> fVar = (C0642f) super.clone();
            fVar.f2532b = (long[]) this.f2532b.clone();
            fVar.f2529N = (Object[]) this.f2529N.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public int mo3287d() {
        if (this.f2531a) {
            m3429e();
        }
        return this.f2530O;
    }

    @Deprecated
    /* renamed from: b */
    public void mo3281b(long j) {
        mo3290e(j);
    }

    /* renamed from: a */
    public void mo3273a(@C0193h0 C0642f<? extends E> fVar) {
        int d = fVar.mo3287d();
        for (int i = 0; i < d; i++) {
            mo3284c(fVar.mo3270a(i), fVar.mo3282c(i));
        }
    }

    /* renamed from: b */
    public void mo3280b(int i) {
        Object[] objArr = this.f2529N;
        Object obj = objArr[i];
        Object obj2 = f2528P;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2531a = true;
        }
    }

    /* renamed from: e */
    public boolean mo3291e(long j, Object obj) {
        int d = mo3288d(j);
        if (d >= 0) {
            Object c = mo3282c(d);
            if (obj == c || (obj != null && obj.equals(c))) {
                mo3280b(d);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo3288d(long j) {
        if (this.f2531a) {
            m3429e();
        }
        return C0641e.m3425a(this.f2532b, this.f2530O, j);
    }

    /* renamed from: a */
    public long mo3270a(int i) {
        if (this.f2531a) {
            m3429e();
        }
        return this.f2532b[i];
    }

    /* renamed from: b */
    public int mo3277b(E e) {
        if (this.f2531a) {
            m3429e();
        }
        for (int i = 0; i < this.f2530O; i++) {
            if (this.f2529N[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private void m3429e() {
        int i = this.f2530O;
        long[] jArr = this.f2532b;
        Object[] objArr = this.f2529N;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2528P) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2531a = false;
        this.f2530O = i2;
    }

    /* renamed from: a */
    public void mo3271a(int i, E e) {
        if (this.f2531a) {
            m3429e();
        }
        this.f2529N[i] = e;
    }

    /* renamed from: b */
    public void mo3279b() {
        int i = this.f2530O;
        Object[] objArr = this.f2529N;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2530O = 0;
        this.f2531a = false;
    }

    /* renamed from: a */
    public boolean mo3274a(long j) {
        return mo3288d(j) >= 0;
    }

    /* renamed from: a */
    public boolean mo3276a(E e) {
        return mo3277b(e) >= 0;
    }

    /* renamed from: a */
    public void mo3272a(long j, E e) {
        int i = this.f2530O;
        if (i == 0 || j > this.f2532b[i - 1]) {
            if (this.f2531a && this.f2530O >= this.f2532b.length) {
                m3429e();
            }
            int i2 = this.f2530O;
            if (i2 >= this.f2532b.length) {
                int c = C0641e.m3428c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f2532b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2529N;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2532b = jArr;
                this.f2529N = objArr;
            }
            this.f2532b[i2] = j;
            this.f2529N[i2] = e;
            this.f2530O = i2 + 1;
            return;
        }
        mo3284c(j, e);
    }

    /* renamed from: c */
    public boolean mo3285c() {
        return mo3287d() == 0;
    }

    /* renamed from: c */
    public E mo3282c(int i) {
        if (this.f2531a) {
            m3429e();
        }
        return this.f2529N[i];
    }
}
