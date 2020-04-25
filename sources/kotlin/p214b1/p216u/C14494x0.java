package kotlin.p214b1.p216u;

import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.b1.u.x0 */
/* compiled from: PrimitiveSpreadBuilders.kt */
public abstract class C14494x0<T> {

    /* renamed from: a */
    private int f42628a;

    /* renamed from: b */
    private final T[] f42629b = new Object[this.f42630c];

    /* renamed from: c */
    private final int f42630c;

    public C14494x0(int i) {
        this.f42630c = i;
    }

    /* renamed from: c */
    private static /* synthetic */ void mo45577c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo45659a() {
        return this.f42628a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo45663b() {
        int i = this.f42630c - 1;
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                T t = this.f42629b[i3];
                i2 += t != null ? mo45575b(t) : 1;
                if (i3 == i) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo45575b(@C6003d T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45661a(int i) {
        this.f42628a = i;
    }

    /* renamed from: a */
    public final void mo45662a(@C6003d T t) {
        C14445h0.m62478f(t, "spreadArgument");
        T[] tArr = this.f42629b;
        int i = this.f42628a;
        this.f42628a = i + 1;
        tArr[i] = t;
    }

    /* access modifiers changed from: protected */
    @C6003d
    /* renamed from: a */
    public final T mo45660a(@C6003d T t, @C6003d T t2) {
        int i;
        C14445h0.m62478f(t, "values");
        C14445h0.m62478f(t2, "result");
        int i2 = this.f42630c - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.f42629b[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int b = mo45575b(t3);
                    System.arraycopy(t3, 0, t2, i, b);
                    i += b;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.f42630c;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }
}
