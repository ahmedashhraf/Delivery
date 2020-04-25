package androidx.collection;

/* renamed from: androidx.collection.d */
/* compiled from: CircularIntArray */
public final class C0640d {

    /* renamed from: a */
    private int[] f2521a;

    /* renamed from: b */
    private int f2522b;

    /* renamed from: c */
    private int f2523c;

    /* renamed from: d */
    private int f2524d;

    public C0640d() {
        this(8);
    }

    /* renamed from: h */
    private void m3410h() {
        int[] iArr = this.f2521a;
        int length = iArr.length;
        int i = this.f2522b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f2521a, 0, iArr2, i2, this.f2522b);
            this.f2521a = iArr2;
            this.f2522b = 0;
            this.f2523c = length;
            this.f2524d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo3259a(int i) {
        this.f2522b = (this.f2522b - 1) & this.f2524d;
        int[] iArr = this.f2521a;
        int i2 = this.f2522b;
        iArr[i2] = i;
        if (i2 == this.f2523c) {
            m3410h();
        }
    }

    /* renamed from: b */
    public void mo3261b(int i) {
        int[] iArr = this.f2521a;
        int i2 = this.f2523c;
        iArr[i2] = i;
        this.f2523c = this.f2524d & (i2 + 1);
        if (this.f2523c == this.f2522b) {
            m3410h();
        }
    }

    /* renamed from: c */
    public int mo3262c() {
        int i = this.f2522b;
        int i2 = this.f2523c;
        if (i != i2) {
            return this.f2521a[(i2 - 1) & this.f2524d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public void mo3264d(int i) {
        if (i > 0) {
            if (i <= mo3269g()) {
                this.f2523c = this.f2524d & (this.f2523c - i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: e */
    public int mo3266e() {
        int i = this.f2522b;
        if (i != this.f2523c) {
            int i2 = this.f2521a[i];
            this.f2522b = (i + 1) & this.f2524d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int mo3268f() {
        int i = this.f2522b;
        int i2 = this.f2523c;
        if (i != i2) {
            int i3 = this.f2524d & (i2 - 1);
            int i4 = this.f2521a[i3];
            this.f2523c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo3269g() {
        return (this.f2523c - this.f2522b) & this.f2524d;
    }

    public C0640d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.f2524d = i - 1;
            this.f2521a = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: c */
    public int mo3263c(int i) {
        if (i < 0 || i >= mo3269g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f2521a[this.f2524d & (this.f2522b + i)];
    }

    /* renamed from: d */
    public boolean mo3265d() {
        return this.f2522b == this.f2523c;
    }

    /* renamed from: a */
    public void mo3258a() {
        this.f2523c = this.f2522b;
    }

    /* renamed from: b */
    public int mo3260b() {
        int i = this.f2522b;
        if (i != this.f2523c) {
            return this.f2521a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: e */
    public void mo3267e(int i) {
        if (i > 0) {
            if (i <= mo3269g()) {
                this.f2522b = this.f2524d & (this.f2522b + i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
