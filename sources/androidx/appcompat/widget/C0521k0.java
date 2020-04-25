package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k0 */
/* compiled from: RtlSpacingHelper */
class C0521k0 {

    /* renamed from: i */
    public static final int f2070i = Integer.MIN_VALUE;

    /* renamed from: a */
    private int f2071a = 0;

    /* renamed from: b */
    private int f2072b = 0;

    /* renamed from: c */
    private int f2073c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2074d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2075e = 0;

    /* renamed from: f */
    private int f2076f = 0;

    /* renamed from: g */
    private boolean f2077g = false;

    /* renamed from: h */
    private boolean f2078h = false;

    C0521k0() {
    }

    /* renamed from: a */
    public int mo2743a() {
        return this.f2077g ? this.f2071a : this.f2072b;
    }

    /* renamed from: b */
    public int mo2746b() {
        return this.f2071a;
    }

    /* renamed from: c */
    public int mo2748c() {
        return this.f2072b;
    }

    /* renamed from: d */
    public int mo2749d() {
        return this.f2077g ? this.f2072b : this.f2071a;
    }

    /* renamed from: a */
    public void mo2744a(int i, int i2) {
        this.f2078h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2075e = i;
            this.f2071a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2076f = i2;
            this.f2072b = i2;
        }
    }

    /* renamed from: b */
    public void mo2747b(int i, int i2) {
        this.f2073c = i;
        this.f2074d = i2;
        this.f2078h = true;
        if (this.f2077g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2071a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2072b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2071a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2072b = i2;
        }
    }

    /* renamed from: a */
    public void mo2745a(boolean z) {
        if (z != this.f2077g) {
            this.f2077g = z;
            if (!this.f2078h) {
                this.f2071a = this.f2075e;
                this.f2072b = this.f2076f;
            } else if (z) {
                int i = this.f2074d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f2075e;
                }
                this.f2071a = i;
                int i2 = this.f2073c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f2076f;
                }
                this.f2072b = i2;
            } else {
                int i3 = this.f2073c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f2075e;
                }
                this.f2071a = i3;
                int i4 = this.f2074d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f2076f;
                }
                this.f2072b = i4;
            }
        }
    }
}
