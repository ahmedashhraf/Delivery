package androidx.collection;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.b */
/* compiled from: ArraySet */
public final class C0637b<E> implements Collection<E>, Set<E> {

    /* renamed from: P */
    private static final boolean f2502P = false;

    /* renamed from: Q */
    private static final String f2503Q = "ArraySet";

    /* renamed from: R */
    private static final int[] f2504R = new int[0];

    /* renamed from: S */
    private static final Object[] f2505S = new Object[0];

    /* renamed from: T */
    private static final int f2506T = 4;

    /* renamed from: U */
    private static final int f2507U = 10;
    @C0195i0

    /* renamed from: V */
    private static Object[] f2508V;

    /* renamed from: W */
    private static int f2509W;
    @C0195i0

    /* renamed from: X */
    private static Object[] f2510X;

    /* renamed from: Y */
    private static int f2511Y;

    /* renamed from: N */
    int f2512N;

    /* renamed from: O */
    private C0643g<E, E> f2513O;

    /* renamed from: a */
    private int[] f2514a;

    /* renamed from: b */
    Object[] f2515b;

    /* renamed from: androidx.collection.b$a */
    /* compiled from: ArraySet */
    class C0638a extends C0643g<E, E> {
        C0638a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo3216a(int i, int i2) {
            return C0637b.this.f2515b[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo3221b(Object obj) {
            return C0637b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo3223c() {
            return C0637b.this.f2512N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo3215a(Object obj) {
            return C0637b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo3222b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3220a(E e, E e2) {
            C0637b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo3217a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3219a(int i) {
            C0637b.this.mo3229c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3218a() {
            C0637b.this.clear();
        }
    }

    public C0637b() {
        this(0);
    }

    /* renamed from: a */
    private static void m3378a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0637b.class) {
                if (f2511Y < 10) {
                    objArr[0] = f2510X;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2510X = objArr;
                    f2511Y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0637b.class) {
                if (f2509W < 10) {
                    objArr[0] = f2508V;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2508V = objArr;
                    f2509W++;
                }
            }
        }
    }

    /* renamed from: c */
    private int m3380c() {
        int i = this.f2512N;
        if (i == 0) {
            return -1;
        }
        int a = C0641e.m3424a(this.f2514a, i, 0);
        if (a < 0 || this.f2515b[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2514a[i2] == 0) {
            if (this.f2515b[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2514a[i3] == 0) {
            if (this.f2515b[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private int m3381d(Object obj, int i) {
        int i2 = this.f2512N;
        if (i2 == 0) {
            return -1;
        }
        int a = C0641e.m3424a(this.f2514a, i2, i);
        if (a < 0 || obj.equals(this.f2515b[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2514a[i3] == i) {
            if (obj.equals(this.f2515b[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2514a[i4] == i) {
            if (obj.equals(this.f2515b[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: g */
    private void m3382g(int i) {
        if (i == 8) {
            synchronized (C0637b.class) {
                if (f2510X != null) {
                    Object[] objArr = f2510X;
                    this.f2515b = objArr;
                    f2510X = (Object[]) objArr[0];
                    this.f2514a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2511Y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0637b.class) {
                if (f2508V != null) {
                    Object[] objArr2 = f2508V;
                    this.f2515b = objArr2;
                    f2508V = (Object[]) objArr2[0];
                    this.f2514a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2509W--;
                    return;
                }
            }
        }
        this.f2514a = new int[i];
        this.f2515b = new Object[i];
    }

    public boolean add(@C0195i0 E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m3380c();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m3381d(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f2512N;
        if (i4 >= this.f2514a.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f2514a;
            Object[] objArr = this.f2515b;
            m3382g(i5);
            int[] iArr2 = this.f2514a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2515b, 0, objArr.length);
            }
            m3378a(iArr, objArr, this.f2512N);
        }
        int i6 = this.f2512N;
        if (i3 < i6) {
            int[] iArr3 = this.f2514a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2515b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2512N - i3);
        }
        this.f2514a[i3] = i;
        this.f2515b[i3] = e;
        this.f2512N++;
        return true;
    }

    public boolean addAll(@C0193h0 Collection<? extends E> collection) {
        mo3227b(this.f2512N + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public void mo3227b(int i) {
        int[] iArr = this.f2514a;
        if (iArr.length < i) {
            Object[] objArr = this.f2515b;
            m3382g(i);
            int i2 = this.f2512N;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2514a, 0, i2);
                System.arraycopy(objArr, 0, this.f2515b, 0, this.f2512N);
            }
            m3378a(iArr, objArr, this.f2512N);
        }
    }

    public void clear() {
        int i = this.f2512N;
        if (i != 0) {
            m3378a(this.f2514a, this.f2515b, i);
            this.f2514a = f2504R;
            this.f2515b = f2505S;
            this.f2512N = 0;
        }
    }

    public boolean contains(@C0195i0 Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(@C0193h0 Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f2512N) {
                try {
                    if (!set.contains(mo3233d(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f2514a;
        int i = 0;
        for (int i2 = 0; i2 < this.f2512N; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(@C0195i0 Object obj) {
        return obj == null ? m3380c() : m3381d(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f2512N <= 0;
    }

    public Iterator<E> iterator() {
        return m3379b().mo3297e().iterator();
    }

    public boolean remove(@C0195i0 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo3229c(indexOf);
        return true;
    }

    public boolean removeAll(@C0193h0 Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(@C0193h0 Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2512N - 1; i >= 0; i--) {
            if (!collection.contains(this.f2515b[i])) {
                mo3229c(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f2512N;
    }

    @C0193h0
    public Object[] toArray() {
        int i = this.f2512N;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2515b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2512N * 14);
        sb.append('{');
        for (int i = 0; i < this.f2512N; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object d = mo3233d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0637b(int i) {
        if (i == 0) {
            this.f2514a = f2504R;
            this.f2515b = f2505S;
        } else {
            m3382g(i);
        }
        this.f2512N = 0;
    }

    @C0193h0
    public <T> T[] toArray(@C0193h0 T[] tArr) {
        if (tArr.length < this.f2512N) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2512N);
        }
        System.arraycopy(this.f2515b, 0, tArr, 0, this.f2512N);
        int length = tArr.length;
        int i = this.f2512N;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public C0637b(@C0195i0 C0637b<E> bVar) {
        this();
        if (bVar != null) {
            mo3224a(bVar);
        }
    }

    /* renamed from: b */
    public boolean mo3228b(@C0193h0 C0637b<? extends E> bVar) {
        int i = bVar.f2512N;
        int i2 = this.f2512N;
        for (int i3 = 0; i3 < i; i3++) {
            remove(bVar.mo3233d(i3));
        }
        if (i2 != this.f2512N) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public E mo3229c(int i) {
        E[] eArr = this.f2515b;
        E e = eArr[i];
        int i2 = this.f2512N;
        if (i2 <= 1) {
            m3378a(this.f2514a, eArr, i2);
            this.f2514a = f2504R;
            this.f2515b = f2505S;
            this.f2512N = 0;
        } else {
            int[] iArr = this.f2514a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f2512N--;
                int i4 = this.f2512N;
                if (i < i4) {
                    int[] iArr2 = this.f2514a;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f2515b;
                    System.arraycopy(objArr, i5, objArr, i, this.f2512N - i);
                }
                this.f2515b[this.f2512N] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f2514a;
                Object[] objArr2 = this.f2515b;
                m3382g(i3);
                this.f2512N--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f2514a, 0, i);
                    System.arraycopy(objArr2, 0, this.f2515b, 0, i);
                }
                int i6 = this.f2512N;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f2514a, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f2515b, i, this.f2512N - i);
                }
            }
        }
        return e;
    }

    @C0195i0
    /* renamed from: d */
    public E mo3233d(int i) {
        return this.f2515b[i];
    }

    public C0637b(@C0195i0 Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: b */
    private C0643g<E, E> m3379b() {
        if (this.f2513O == null) {
            this.f2513O = new C0638a();
        }
        return this.f2513O;
    }

    /* renamed from: a */
    public void mo3224a(@C0193h0 C0637b<? extends E> bVar) {
        int i = bVar.f2512N;
        mo3227b(this.f2512N + i);
        if (this.f2512N != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(bVar.mo3233d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(bVar.f2514a, 0, this.f2514a, 0, i);
            System.arraycopy(bVar.f2515b, 0, this.f2515b, 0, i);
            this.f2512N = i;
        }
    }
}
