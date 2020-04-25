package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.c0 */
/* compiled from: SortedList */
public class C1684c0<T> {

    /* renamed from: j */
    public static final int f6468j = -1;

    /* renamed from: k */
    private static final int f6469k = 10;

    /* renamed from: l */
    private static final int f6470l = 10;

    /* renamed from: m */
    private static final int f6471m = 1;

    /* renamed from: n */
    private static final int f6472n = 2;

    /* renamed from: o */
    private static final int f6473o = 4;

    /* renamed from: a */
    T[] f6474a;

    /* renamed from: b */
    private T[] f6475b;

    /* renamed from: c */
    private int f6476c;

    /* renamed from: d */
    private int f6477d;

    /* renamed from: e */
    private int f6478e;

    /* renamed from: f */
    private C1686b f6479f;

    /* renamed from: g */
    private C1685a f6480g;

    /* renamed from: h */
    private int f6481h;

    /* renamed from: i */
    private final Class<T> f6482i;

    /* renamed from: androidx.recyclerview.widget.c0$a */
    /* compiled from: SortedList */
    public static class C1685a<T2> extends C1686b<T2> {

        /* renamed from: a */
        final C1686b<T2> f6483a;

        /* renamed from: b */
        private final C1702f f6484b = new C1702f(this.f6483a);

        public C1685a(C1686b<T2> bVar) {
            this.f6483a = bVar;
        }

        /* renamed from: a */
        public void mo7718a(int i, int i2) {
            this.f6484b.mo7718a(i, i2);
        }

        /* renamed from: b */
        public void mo7720b(int i, int i2) {
            this.f6484b.mo7720b(i, i2);
        }

        /* renamed from: c */
        public void mo7721c(int i, int i2) {
            this.f6484b.mo7721c(i, i2);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f6483a.compare(t2, t22);
        }

        /* renamed from: d */
        public void mo7759d(int i, int i2) {
            this.f6484b.mo7719a(i, i2, null);
        }

        /* renamed from: a */
        public void mo7719a(int i, int i2, Object obj) {
            this.f6484b.mo7719a(i, i2, obj);
        }

        /* renamed from: b */
        public boolean mo7756b(T2 t2, T2 t22) {
            return this.f6483a.mo7756b(t2, t22);
        }

        @C0195i0
        /* renamed from: c */
        public Object mo7757c(T2 t2, T2 t22) {
            return this.f6483a.mo7757c(t2, t22);
        }

        /* renamed from: a */
        public boolean mo7755a(T2 t2, T2 t22) {
            return this.f6483a.mo7755a(t2, t22);
        }

        /* renamed from: a */
        public void mo7754a() {
            this.f6484b.mo7798a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.c0$b */
    /* compiled from: SortedList */
    public static abstract class C1686b<T2> implements Comparator<T2>, C1765t {
        /* renamed from: a */
        public void mo7719a(int i, int i2, Object obj) {
            mo7759d(i, i2);
        }

        /* renamed from: a */
        public abstract boolean mo7755a(T2 t2, T2 t22);

        /* renamed from: b */
        public abstract boolean mo7756b(T2 t2, T2 t22);

        @C0195i0
        /* renamed from: c */
        public Object mo7757c(T2 t2, T2 t22) {
            return null;
        }

        public abstract int compare(T2 t2, T2 t22);

        /* renamed from: d */
        public abstract void mo7759d(int i, int i2);
    }

    public C1684c0(@C0193h0 Class<T> cls, @C0193h0 C1686b<T> bVar) {
        this(cls, bVar, 10);
    }

    /* renamed from: c */
    private void m9119c(T[] tArr) {
        if (tArr.length >= 1) {
            int f = m9124f(tArr);
            if (this.f6481h == 0) {
                this.f6474a = tArr;
                this.f6481h = f;
                this.f6479f.mo7720b(0, f);
            } else {
                m9116a(tArr, f);
            }
        }
    }

    /* renamed from: e */
    private void m9123e(@C0193h0 T[] tArr) {
        boolean z = !(this.f6479f instanceof C1685a);
        if (z) {
            mo7739a();
        }
        this.f6476c = 0;
        this.f6477d = this.f6481h;
        this.f6475b = this.f6474a;
        this.f6478e = 0;
        int f = m9124f(tArr);
        this.f6474a = (Object[]) Array.newInstance(this.f6482i, f);
        while (true) {
            if (this.f6478e >= f && this.f6476c >= this.f6477d) {
                break;
            }
            int i = this.f6476c;
            int i2 = this.f6477d;
            if (i >= i2) {
                int i3 = this.f6478e;
                int i4 = f - i3;
                System.arraycopy(tArr, i3, this.f6474a, i3, i4);
                this.f6478e += i4;
                this.f6481h += i4;
                this.f6479f.mo7720b(i3, i4);
                break;
            }
            int i5 = this.f6478e;
            if (i5 >= f) {
                int i6 = i2 - i;
                this.f6481h -= i6;
                this.f6479f.mo7721c(i5, i6);
                break;
            }
            T t = this.f6475b[i];
            T t2 = tArr[i5];
            int compare = this.f6479f.compare(t, t2);
            if (compare < 0) {
                m9122e();
            } else if (compare > 0) {
                m9120d(t2);
            } else if (!this.f6479f.mo7756b(t, t2)) {
                m9122e();
                m9120d(t2);
            } else {
                T[] tArr2 = this.f6474a;
                int i7 = this.f6478e;
                tArr2[i7] = t2;
                this.f6476c++;
                this.f6478e = i7 + 1;
                if (!this.f6479f.mo7755a(t, t2)) {
                    C1686b bVar = this.f6479f;
                    bVar.mo7719a(this.f6478e - 1, 1, bVar.mo7757c(t, t2));
                }
            }
        }
        this.f6475b = null;
        if (z) {
            mo7751c();
        }
    }

    /* renamed from: f */
    private int m9124f(@C0193h0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f6479f);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f6479f.compare(tArr[i2], t) == 0) {
                int a = m9113a(t, tArr, i2, i);
                if (a != -1) {
                    tArr[a] = t;
                } else {
                    if (i != i3) {
                        tArr[i] = t;
                    }
                    i++;
                }
            } else {
                if (i != i3) {
                    tArr[i] = t;
                }
                i2 = i;
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int mo7737a(T t) {
        m9125f();
        return m9112a(t, true);
    }

    /* renamed from: b */
    public void mo7749b(@C0193h0 T[] tArr, boolean z) {
        m9125f();
        if (z) {
            m9123e(tArr);
        } else {
            m9123e(m9121d(tArr));
        }
    }

    /* renamed from: d */
    public int mo7753d() {
        return this.f6481h;
    }

    public C1684c0(@C0193h0 Class<T> cls, @C0193h0 C1686b<T> bVar, int i) {
        this.f6482i = cls;
        this.f6474a = (Object[]) Array.newInstance(cls, i);
        this.f6479f = bVar;
        this.f6481h = 0;
    }

    /* renamed from: d */
    private void m9120d(T t) {
        T[] tArr = this.f6474a;
        int i = this.f6478e;
        tArr[i] = t;
        this.f6478e = i + 1;
        this.f6481h++;
        this.f6479f.mo7720b(this.f6478e - 1, 1);
    }

    /* renamed from: a */
    public void mo7743a(@C0193h0 T[] tArr, boolean z) {
        m9125f();
        if (tArr.length != 0) {
            if (z) {
                m9119c(tArr);
            } else {
                m9119c((T[]) m9121d(tArr));
            }
        }
    }

    /* renamed from: b */
    public void mo7748b(@C0193h0 T... tArr) {
        mo7749b(tArr, false);
    }

    /* renamed from: b */
    public void mo7747b(@C0193h0 Collection<T> collection) {
        mo7749b((T[]) collection.toArray((Object[]) Array.newInstance(this.f6482i, collection.size())), true);
    }

    /* renamed from: d */
    private T[] m9121d(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(this.f6482i, tArr.length);
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    /* renamed from: b */
    private boolean m9118b(T t, boolean z) {
        int a = m9114a(t, this.f6474a, 0, this.f6481h, 2);
        if (a == -1) {
            return false;
        }
        m9115a(a, z);
        return true;
    }

    /* renamed from: a */
    public void mo7742a(@C0193h0 T... tArr) {
        mo7743a(tArr, false);
    }

    /* renamed from: a */
    public void mo7741a(@C0193h0 Collection<T> collection) {
        mo7743a((T[]) collection.toArray((Object[]) Array.newInstance(this.f6482i, collection.size())), true);
    }

    /* renamed from: c */
    public void mo7751c() {
        m9125f();
        C1686b bVar = this.f6479f;
        if (bVar instanceof C1685a) {
            ((C1685a) bVar).mo7754a();
        }
        C1686b bVar2 = this.f6479f;
        C1685a aVar = this.f6480g;
        if (bVar2 == aVar) {
            this.f6479f = aVar.f6483a;
        }
    }

    /* renamed from: b */
    public void mo7746b(int i) {
        m9125f();
        Object a = mo7738a(i);
        m9115a(i, false);
        int a2 = m9112a((T) a, false);
        if (i != a2) {
            this.f6479f.mo7718a(i, a2);
        }
    }

    /* renamed from: a */
    private int m9113a(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f6479f.mo7756b(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    private void m9125f() {
        if (this.f6475b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* renamed from: a */
    private void m9116a(T[] tArr, int i) {
        boolean z = !(this.f6479f instanceof C1685a);
        if (z) {
            mo7739a();
        }
        this.f6475b = this.f6474a;
        int i2 = 0;
        this.f6476c = 0;
        int i3 = this.f6481h;
        this.f6477d = i3;
        this.f6474a = (Object[]) Array.newInstance(this.f6482i, i3 + i + 10);
        this.f6478e = 0;
        while (true) {
            if (this.f6476c >= this.f6477d && i2 >= i) {
                break;
            }
            int i4 = this.f6476c;
            int i5 = this.f6477d;
            if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f6474a, this.f6478e, i6);
                this.f6478e += i6;
                this.f6481h += i6;
                this.f6479f.mo7720b(this.f6478e - i6, i6);
                break;
            } else if (i2 == i) {
                int i7 = i5 - i4;
                System.arraycopy(this.f6475b, i4, this.f6474a, this.f6478e, i7);
                this.f6478e += i7;
                break;
            } else {
                T t = this.f6475b[i4];
                T t2 = tArr[i2];
                int compare = this.f6479f.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f6474a;
                    int i8 = this.f6478e;
                    this.f6478e = i8 + 1;
                    tArr2[i8] = t2;
                    this.f6481h++;
                    i2++;
                    this.f6479f.mo7720b(this.f6478e - 1, 1);
                } else if (compare != 0 || !this.f6479f.mo7756b(t, t2)) {
                    T[] tArr3 = this.f6474a;
                    int i9 = this.f6478e;
                    this.f6478e = i9 + 1;
                    tArr3[i9] = t;
                    this.f6476c++;
                } else {
                    T[] tArr4 = this.f6474a;
                    int i10 = this.f6478e;
                    this.f6478e = i10 + 1;
                    tArr4[i10] = t2;
                    i2++;
                    this.f6476c++;
                    if (!this.f6479f.mo7755a(t, t2)) {
                        C1686b bVar = this.f6479f;
                        bVar.mo7719a(this.f6478e - 1, 1, bVar.mo7757c(t, t2));
                    }
                }
            }
        }
        this.f6475b = null;
        if (z) {
            mo7751c();
        }
    }

    /* renamed from: c */
    public boolean mo7752c(T t) {
        m9125f();
        return m9118b(t, true);
    }

    /* renamed from: b */
    public int mo7744b(T t) {
        if (this.f6475b != null) {
            int a = m9114a(t, this.f6474a, 0, this.f6478e, 4);
            if (a != -1) {
                return a;
            }
            int a2 = m9114a(t, this.f6475b, this.f6476c, this.f6477d, 4);
            if (a2 != -1) {
                return (a2 - this.f6476c) + this.f6478e;
            }
            return -1;
        }
        return m9114a(t, this.f6474a, 0, this.f6481h, 4);
    }

    /* renamed from: c */
    public T mo7750c(int i) {
        m9125f();
        T a = mo7738a(i);
        m9115a(i, true);
        return a;
    }

    /* renamed from: b */
    private void m9117b(int i, T t) {
        int i2 = this.f6481h;
        if (i <= i2) {
            T[] tArr = this.f6474a;
            if (i2 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.f6482i, tArr.length + 10);
                System.arraycopy(this.f6474a, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.f6474a, i, tArr2, i + 1, this.f6481h - i);
                this.f6474a = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.f6474a[i] = t;
            }
            this.f6481h++;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cannot add item to ");
        sb.append(i);
        sb.append(" because size is ");
        sb.append(this.f6481h);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: b */
    public void mo7745b() {
        m9125f();
        int i = this.f6481h;
        if (i != 0) {
            Arrays.fill(this.f6474a, 0, i, null);
            this.f6481h = 0;
            this.f6479f.mo7721c(0, i);
        }
    }

    /* renamed from: e */
    private void m9122e() {
        this.f6481h--;
        this.f6476c++;
        this.f6479f.mo7721c(this.f6478e, 1);
    }

    /* renamed from: a */
    public void mo7739a() {
        m9125f();
        C1686b bVar = this.f6479f;
        if (!(bVar instanceof C1685a)) {
            if (this.f6480g == null) {
                this.f6480g = new C1685a(bVar);
            }
            this.f6479f = this.f6480g;
        }
    }

    /* renamed from: a */
    private int m9112a(T t, boolean z) {
        int a = m9114a(t, this.f6474a, 0, this.f6481h, 1);
        if (a == -1) {
            a = 0;
        } else if (a < this.f6481h) {
            T t2 = this.f6474a[a];
            if (this.f6479f.mo7756b(t2, t)) {
                if (this.f6479f.mo7755a(t2, t)) {
                    this.f6474a[a] = t;
                    return a;
                }
                this.f6474a[a] = t;
                C1686b bVar = this.f6479f;
                bVar.mo7719a(a, 1, bVar.mo7757c(t2, t));
                return a;
            }
        }
        m9117b(a, t);
        if (z) {
            this.f6479f.mo7720b(a, 1);
        }
        return a;
    }

    /* renamed from: a */
    private void m9115a(int i, boolean z) {
        T[] tArr = this.f6474a;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f6481h - i) - 1);
        this.f6481h--;
        this.f6474a[this.f6481h] = null;
        if (z) {
            this.f6479f.mo7721c(i, 1);
        }
    }

    /* renamed from: a */
    public void mo7740a(int i, T t) {
        m9125f();
        T a = mo7738a(i);
        boolean z = a == t || !this.f6479f.mo7755a(a, t);
        if (a == t || this.f6479f.compare(a, t) != 0) {
            if (z) {
                C1686b bVar = this.f6479f;
                bVar.mo7719a(i, 1, bVar.mo7757c(a, t));
            }
            m9115a(i, false);
            int a2 = m9112a(t, false);
            if (i != a2) {
                this.f6479f.mo7718a(i, a2);
            }
            return;
        }
        this.f6474a[i] = t;
        if (z) {
            C1686b bVar2 = this.f6479f;
            bVar2.mo7719a(i, 1, bVar2.mo7757c(a, t));
        }
    }

    /* renamed from: a */
    public T mo7738a(int i) throws IndexOutOfBoundsException {
        if (i >= this.f6481h || i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Asked to get item at ");
            sb.append(i);
            sb.append(" but size is ");
            sb.append(this.f6481h);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        T[] tArr = this.f6475b;
        if (tArr != null) {
            int i2 = this.f6478e;
            if (i >= i2) {
                return tArr[(i - i2) + this.f6476c];
            }
        }
        return this.f6474a[i];
    }

    /* renamed from: a */
    private int m9114a(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f6479f.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare != 0) {
                i2 = i4;
            } else if (this.f6479f.mo7756b(t2, t)) {
                return i4;
            } else {
                int a = m9111a(t, i4, i, i2);
                if (i3 == 1 && a == -1) {
                    a = i4;
                }
                return a;
            }
        }
        if (i3 != 1) {
            i = -1;
        }
        return i;
    }

    /* renamed from: a */
    private int m9111a(T t, int i, int i2, int i3) {
        T t2;
        int i4 = i - 1;
        while (i4 >= i2) {
            T t3 = this.f6474a[i4];
            if (this.f6479f.compare(t3, t) != 0) {
                break;
            } else if (this.f6479f.mo7756b(t3, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        do {
            i++;
            if (i < i3) {
                t2 = this.f6474a[i];
                if (this.f6479f.compare(t2, t) != 0) {
                }
            }
            return -1;
        } while (!this.f6479f.mo7756b(t2, t));
        return i;
    }
}
