package p195e.p196a.p199x0.p200j;

/* renamed from: e.a.x0.j.s */
/* compiled from: OpenHashSet */
public final class C13766s<T> {

    /* renamed from: f */
    private static final int f39811f = -1640531527;

    /* renamed from: a */
    final float f39812a;

    /* renamed from: b */
    int f39813b;

    /* renamed from: c */
    int f39814c;

    /* renamed from: d */
    int f39815d;

    /* renamed from: e */
    T[] f39816e;

    public C13766s() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    static int m58763a(int i) {
        int i2 = i * f39811f;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo43161a(T t) {
        T t2;
        T[] tArr = this.f39816e;
        int i = this.f39813b;
        int a = m58763a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f39814c + 1;
        this.f39814c = i2;
        if (i2 >= this.f39815d) {
            mo43163b();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo43164b(T t) {
        T t2;
        T[] tArr = this.f39816e;
        int i = this.f39813b;
        int a = m58763a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo43160a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo43160a(a, tArr, i);
    }

    /* renamed from: c */
    public int mo43165c() {
        return this.f39814c;
    }

    public C13766s(int i) {
        this(i, 0.75f);
    }

    public C13766s(int i, float f) {
        this.f39812a = f;
        int b = C13767t.m58771b(i);
        this.f39813b = b - 1;
        this.f39815d = (int) (f * ((float) b));
        this.f39816e = new Object[b];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43163b() {
        T[] tArr = this.f39816e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f39814c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m58763a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f39813b = i2;
                this.f39815d = (int) (((float) i) * this.f39812a);
                this.f39816e = tArr2;
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo43160a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f39814c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m58763a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public Object[] mo43162a() {
        return this.f39816e;
    }
}
