package androidx.collection;

/* renamed from: androidx.collection.c */
/* compiled from: CircularArray */
public final class C0639c<E> {

    /* renamed from: a */
    private E[] f2517a;

    /* renamed from: b */
    private int f2518b;

    /* renamed from: c */
    private int f2519c;

    /* renamed from: d */
    private int f2520d;

    public C0639c() {
        this(8);
    }

    /* renamed from: h */
    private void m3397h() {
        E[] eArr = this.f2517a;
        int length = eArr.length;
        int i = this.f2518b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f2517a, 0, eArr2, i2, this.f2518b);
            this.f2517a = eArr2;
            this.f2518b = 0;
            this.f2519c = length;
            this.f2520d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo3248a(E e) {
        this.f2518b = (this.f2518b - 1) & this.f2520d;
        E[] eArr = this.f2517a;
        int i = this.f2518b;
        eArr[i] = e;
        if (i == this.f2519c) {
            m3397h();
        }
    }

    /* renamed from: b */
    public void mo3251b(E e) {
        E[] eArr = this.f2517a;
        int i = this.f2519c;
        eArr[i] = e;
        this.f2519c = this.f2520d & (i + 1);
        if (this.f2519c == this.f2518b) {
            m3397h();
        }
    }

    /* renamed from: c */
    public void mo3253c(int i) {
        if (i > 0) {
            if (i <= mo3257g()) {
                int length = this.f2517a.length;
                int i2 = this.f2518b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                for (int i3 = this.f2518b; i3 < length; i3++) {
                    this.f2517a[i3] = null;
                }
                int i4 = this.f2518b;
                int i5 = length - i4;
                int i6 = i - i5;
                this.f2518b = this.f2520d & (i4 + i5);
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        this.f2517a[i7] = null;
                    }
                    this.f2518b = i6;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public boolean mo3254d() {
        return this.f2518b == this.f2519c;
    }

    /* renamed from: e */
    public E mo3255e() {
        int i = this.f2518b;
        if (i != this.f2519c) {
            E[] eArr = this.f2517a;
            E e = eArr[i];
            eArr[i] = null;
            this.f2518b = (i + 1) & this.f2520d;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public E mo3256f() {
        int i = this.f2518b;
        int i2 = this.f2519c;
        if (i != i2) {
            int i3 = this.f2520d & (i2 - 1);
            E[] eArr = this.f2517a;
            E e = eArr[i3];
            eArr[i3] = null;
            this.f2519c = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo3257g() {
        return (this.f2519c - this.f2518b) & this.f2520d;
    }

    public C0639c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.f2520d = i - 1;
            this.f2517a = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: a */
    public void mo3247a() {
        mo3253c(mo3257g());
    }

    /* renamed from: b */
    public void mo3250b(int i) {
        int i2;
        if (i > 0) {
            if (i <= mo3257g()) {
                int i3 = 0;
                int i4 = this.f2519c;
                if (i < i4) {
                    i3 = i4 - i;
                }
                int i5 = i3;
                while (true) {
                    i2 = this.f2519c;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f2517a[i5] = null;
                    i5++;
                }
                int i6 = i2 - i3;
                int i7 = i - i6;
                this.f2519c = i2 - i6;
                if (i7 > 0) {
                    this.f2519c = this.f2517a.length;
                    int i8 = this.f2519c - i7;
                    for (int i9 = i8; i9 < this.f2519c; i9++) {
                        this.f2517a[i9] = null;
                    }
                    this.f2519c = i8;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public E mo3246a(int i) {
        if (i < 0 || i >= mo3257g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f2517a[this.f2520d & (this.f2518b + i)];
    }

    /* renamed from: c */
    public E mo3252c() {
        int i = this.f2518b;
        int i2 = this.f2519c;
        if (i != i2) {
            return this.f2517a[(i2 - 1) & this.f2520d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: b */
    public E mo3249b() {
        int i = this.f2518b;
        if (i != this.f2519c) {
            return this.f2517a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
