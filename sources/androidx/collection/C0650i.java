package androidx.collection;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.collection.i */
/* compiled from: SparseArrayCompat */
public class C0650i<E> implements Cloneable {

    /* renamed from: P */
    private static final Object f2560P = new Object();

    /* renamed from: N */
    private Object[] f2561N;

    /* renamed from: O */
    private int f2562O;

    /* renamed from: a */
    private boolean f2563a;

    /* renamed from: b */
    private int[] f2564b;

    public C0650i() {
        this(10);
    }

    /* renamed from: a */
    public void mo3381a(int i, int i2) {
        int min = Math.min(this.f2562O, i2 + i);
        while (i < min) {
            mo3402g(i);
            i++;
        }
    }

    /* renamed from: b */
    public E mo3388b(int i, E e) {
        int a = C0641e.m3424a(this.f2564b, this.f2562O, i);
        if (a >= 0) {
            E[] eArr = this.f2561N;
            if (eArr[a] != f2560P) {
                return eArr[a];
            }
        }
        return e;
    }

    @C0195i0
    /* renamed from: c */
    public E mo3391c(int i) {
        return mo3388b(i, null);
    }

    @C0195i0
    /* renamed from: d */
    public E mo3397d(int i, E e) {
        E c = mo3391c(i);
        if (c == null) {
            mo3392c(i, e);
        }
        return c;
    }

    /* renamed from: e */
    public boolean mo3399e(int i, Object obj) {
        int d = mo3396d(i);
        if (d >= 0) {
            Object h = mo3404h(d);
            if (obj == h || (obj != null && obj.equals(h))) {
                mo3402g(d);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo3401f(int i) {
        int a = C0641e.m3424a(this.f2564b, this.f2562O, i);
        if (a >= 0) {
            Object[] objArr = this.f2561N;
            Object obj = objArr[a];
            Object obj2 = f2560P;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f2563a = true;
            }
        }
    }

    /* renamed from: g */
    public void mo3402g(int i) {
        Object[] objArr = this.f2561N;
        Object obj = objArr[i];
        Object obj2 = f2560P;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2563a = true;
        }
    }

    /* renamed from: h */
    public E mo3404h(int i) {
        if (this.f2563a) {
            m3484e();
        }
        return this.f2561N[i];
    }

    public String toString() {
        if (mo3395d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2562O * 28);
        sb.append('{');
        for (int i = 0; i < this.f2562O; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo3398e(i));
            sb.append('=');
            Object h = mo3404h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0650i(int i) {
        this.f2563a = false;
        if (i == 0) {
            this.f2564b = C0641e.f2525a;
            this.f2561N = C0641e.f2527c;
            return;
        }
        int b = C0641e.m3427b(i);
        this.f2564b = new int[b];
        this.f2561N = new Object[b];
    }

    /* renamed from: c */
    public void mo3392c(int i, E e) {
        int a = C0641e.m3424a(this.f2564b, this.f2562O, i);
        if (a >= 0) {
            this.f2561N[a] = e;
        } else {
            int i2 = a ^ -1;
            if (i2 < this.f2562O) {
                Object[] objArr = this.f2561N;
                if (objArr[i2] == f2560P) {
                    this.f2564b[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f2563a && this.f2562O >= this.f2564b.length) {
                m3484e();
                i2 = C0641e.m3424a(this.f2564b, this.f2562O, i) ^ -1;
            }
            int i3 = this.f2562O;
            if (i3 >= this.f2564b.length) {
                int b = C0641e.m3427b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f2564b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f2561N;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f2564b = iArr;
                this.f2561N = objArr2;
            }
            int i4 = this.f2562O;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f2564b;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f2561N;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f2562O - i2);
            }
            this.f2564b[i2] = i;
            this.f2561N[i2] = e;
            this.f2562O++;
        }
    }

    public C0650i<E> clone() {
        try {
            C0650i<E> iVar = (C0650i) super.clone();
            iVar.f2564b = (int[]) this.f2564b.clone();
            iVar.f2561N = (Object[]) this.f2561N.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public boolean mo3385a(int i, E e, E e2) {
        int d = mo3396d(i);
        if (d >= 0) {
            E e3 = this.f2561N[d];
            if (e3 == e || (e != null && e.equals(e3))) {
                this.f2561N[d] = e2;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo3395d() {
        if (this.f2563a) {
            m3484e();
        }
        return this.f2562O;
    }

    @Deprecated
    /* renamed from: b */
    public void mo3390b(int i) {
        mo3401f(i);
    }

    /* renamed from: g */
    public void mo3403g(int i, E e) {
        if (this.f2563a) {
            m3484e();
        }
        this.f2561N[i] = e;
    }

    /* renamed from: e */
    private void m3484e() {
        int i = this.f2562O;
        int[] iArr = this.f2564b;
        Object[] objArr = this.f2561N;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2560P) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2563a = false;
        this.f2562O = i2;
    }

    /* renamed from: b */
    public int mo3387b(E e) {
        if (this.f2563a) {
            m3484e();
        }
        for (int i = 0; i < this.f2562O; i++) {
            if (this.f2561N[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @C0195i0
    /* renamed from: f */
    public E mo3400f(int i, E e) {
        int d = mo3396d(i);
        if (d < 0) {
            return null;
        }
        E[] eArr = this.f2561N;
        E e2 = eArr[d];
        eArr[d] = e;
        return e2;
    }

    /* renamed from: d */
    public int mo3396d(int i) {
        if (this.f2563a) {
            m3484e();
        }
        return C0641e.m3424a(this.f2564b, this.f2562O, i);
    }

    /* renamed from: a */
    public void mo3383a(@C0193h0 C0650i<? extends E> iVar) {
        int d = iVar.mo3395d();
        for (int i = 0; i < d; i++) {
            mo3392c(iVar.mo3398e(i), iVar.mo3404h(i));
        }
    }

    /* renamed from: a */
    public boolean mo3384a(int i) {
        return mo3396d(i) >= 0;
    }

    /* renamed from: b */
    public void mo3389b() {
        int i = this.f2562O;
        Object[] objArr = this.f2561N;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2562O = 0;
        this.f2563a = false;
    }

    /* renamed from: a */
    public boolean mo3386a(E e) {
        return mo3387b(e) >= 0;
    }

    /* renamed from: a */
    public void mo3382a(int i, E e) {
        int i2 = this.f2562O;
        if (i2 == 0 || i > this.f2564b[i2 - 1]) {
            if (this.f2563a && this.f2562O >= this.f2564b.length) {
                m3484e();
            }
            int i3 = this.f2562O;
            if (i3 >= this.f2564b.length) {
                int b = C0641e.m3427b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f2564b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2561N;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2564b = iArr;
                this.f2561N = objArr;
            }
            this.f2564b[i3] = i;
            this.f2561N[i3] = e;
            this.f2562O = i3 + 1;
            return;
        }
        mo3392c(i, e);
    }

    /* renamed from: e */
    public int mo3398e(int i) {
        if (this.f2563a) {
            m3484e();
        }
        return this.f2564b[i];
    }

    /* renamed from: c */
    public boolean mo3393c() {
        return mo3395d() == 0;
    }
}
