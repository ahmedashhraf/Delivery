package androidx.collection;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: androidx.collection.h */
/* compiled from: SimpleArrayMap */
public class C0649h<K, V> {

    /* renamed from: O */
    private static final boolean f2548O = false;

    /* renamed from: P */
    private static final String f2549P = "ArrayMap";

    /* renamed from: Q */
    private static final boolean f2550Q = true;

    /* renamed from: R */
    private static final int f2551R = 4;

    /* renamed from: S */
    private static final int f2552S = 10;
    @C0195i0

    /* renamed from: T */
    static Object[] f2553T;

    /* renamed from: U */
    static int f2554U;
    @C0195i0

    /* renamed from: V */
    static Object[] f2555V;

    /* renamed from: W */
    static int f2556W;

    /* renamed from: N */
    int f2557N;

    /* renamed from: a */
    int[] f2558a;

    /* renamed from: b */
    Object[] f2559b;

    public C0649h() {
        this.f2558a = C0641e.f2525a;
        this.f2559b = C0641e.f2527c;
        this.f2557N = 0;
    }

    /* renamed from: a */
    private static int m3471a(int[] iArr, int i, int i2) {
        try {
            return C0641e.m3424a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private void m3473e(int i) {
        Class<C0649h> cls = C0649h.class;
        if (i == 8) {
            synchronized (cls) {
                if (f2555V != null) {
                    Object[] objArr = f2555V;
                    this.f2559b = objArr;
                    f2555V = (Object[]) objArr[0];
                    this.f2558a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2556W--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f2553T != null) {
                    Object[] objArr2 = f2553T;
                    this.f2559b = objArr2;
                    f2553T = (Object[]) objArr2[0];
                    this.f2558a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2554U--;
                    return;
                }
            }
        }
        this.f2558a = new int[i];
        this.f2559b = new Object[(i << 1)];
    }

    /* renamed from: b */
    public int mo3360b(@C0195i0 Object obj) {
        return obj == null ? mo3355a() : mo3356a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo3362c(Object obj) {
        int i = this.f2557N * 2;
        Object[] objArr = this.f2559b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.f2557N;
        if (i > 0) {
            int[] iArr = this.f2558a;
            Object[] objArr = this.f2559b;
            this.f2558a = C0641e.f2525a;
            this.f2559b = C0641e.f2527c;
            this.f2557N = 0;
            m3472a(iArr, objArr, i);
        }
        if (this.f2557N > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@C0195i0 Object obj) {
        return mo3360b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo3362c(obj) >= 0;
    }

    /* renamed from: d */
    public V mo3367d(int i) {
        return this.f2559b[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0649h) {
            C0649h hVar = (C0649h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f2557N) {
                try {
                    Object b = mo3361b(i);
                    Object d = mo3367d(i);
                    Object obj2 = hVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !hVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f2557N) {
                try {
                    Object b2 = mo3361b(i2);
                    Object d2 = mo3367d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @C0195i0
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int b = mo3360b(obj);
        return b >= 0 ? this.f2559b[(b << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f2558a;
        Object[] objArr = this.f2559b;
        int i = this.f2557N;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f2557N <= 0;
    }

    @C0195i0
    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2557N;
        if (k == null) {
            i2 = mo3355a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo3356a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f2559b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f2558a.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f2558a;
            Object[] objArr = this.f2559b;
            m3473e(i6);
            if (i3 == this.f2557N) {
                int[] iArr2 = this.f2558a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2559b, 0, objArr.length);
                }
                m3472a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2558a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f2559b;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f2557N - i5) << 1);
        }
        int i8 = this.f2557N;
        if (i3 == i8) {
            int[] iArr4 = this.f2558a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f2559b;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f2557N = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @C0195i0
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    @C0195i0
    public V remove(Object obj) {
        int b = mo3360b(obj);
        if (b >= 0) {
            return mo3363c(b);
        }
        return null;
    }

    @C0195i0
    public V replace(K k, V v) {
        int b = mo3360b((Object) k);
        if (b >= 0) {
            return mo3357a(b, v);
        }
        return null;
    }

    public int size() {
        return this.f2557N;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2557N * 28);
        sb.append('{');
        for (int i = 0; i < this.f2557N; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo3361b(i);
            String str = "(this Map)";
            if (b != this) {
                sb.append(b);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object d = mo3367d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public K mo3361b(int i) {
        return this.f2559b[i << 1];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3356a(Object obj, int i) {
        int i2 = this.f2557N;
        if (i2 == 0) {
            return -1;
        }
        int a = m3471a(this.f2558a, i2, i);
        if (a < 0 || obj.equals(this.f2559b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2558a[i3] == i) {
            if (obj.equals(this.f2559b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2558a[i4] == i) {
            if (obj.equals(this.f2559b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean remove(Object obj, Object obj2) {
        int b = mo3360b(obj);
        if (b >= 0) {
            Object d = mo3367d(b);
            if (obj2 == d || (obj2 != null && obj2.equals(d))) {
                mo3363c(b);
                return true;
            }
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int b = mo3360b((Object) k);
        if (b >= 0) {
            V d = mo3367d(b);
            if (d == v || (v != null && v.equals(d))) {
                mo3357a(b, v2);
                return true;
            }
        }
        return false;
    }

    public C0649h(int i) {
        if (i == 0) {
            this.f2558a = C0641e.f2525a;
            this.f2559b = C0641e.f2527c;
        } else {
            m3473e(i);
        }
        this.f2557N = 0;
    }

    /* renamed from: c */
    public V mo3363c(int i) {
        int i2;
        V[] vArr = this.f2559b;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f2557N;
        if (i4 <= 1) {
            m3472a(this.f2558a, (Object[]) vArr, i4);
            this.f2558a = C0641e.f2525a;
            this.f2559b = C0641e.f2527c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f2558a;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f2558a;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f2559b;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f2559b;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f2558a;
                Object[] objArr3 = this.f2559b;
                m3473e(i5);
                if (i4 == this.f2557N) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f2558a, 0, i);
                        System.arraycopy(objArr3, 0, this.f2559b, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f2558a, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f2559b, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f2557N) {
            this.f2557N = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public C0649h(C0649h<K, V> hVar) {
        this();
        if (hVar != null) {
            mo3359a(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3355a() {
        int i = this.f2557N;
        if (i == 0) {
            return -1;
        }
        int a = m3471a(this.f2558a, i, 0);
        if (a < 0 || this.f2559b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2558a[i2] == 0) {
            if (this.f2559b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2558a[i3] == 0) {
            if (this.f2559b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private static void m3472a(int[] iArr, Object[] objArr, int i) {
        Class<C0649h> cls = C0649h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f2556W < 10) {
                    objArr[0] = f2555V;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2555V = objArr;
                    f2556W++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f2554U < 10) {
                    objArr[0] = f2553T;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2553T = objArr;
                    f2554U++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3358a(int i) {
        int i2 = this.f2557N;
        int[] iArr = this.f2558a;
        if (iArr.length < i) {
            Object[] objArr = this.f2559b;
            m3473e(i);
            if (this.f2557N > 0) {
                System.arraycopy(iArr, 0, this.f2558a, 0, i2);
                System.arraycopy(objArr, 0, this.f2559b, 0, i2 << 1);
            }
            m3472a(iArr, objArr, i2);
        }
        if (this.f2557N != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public V mo3357a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f2559b;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo3359a(@C0193h0 C0649h<? extends K, ? extends V> hVar) {
        int i = hVar.f2557N;
        mo3358a(this.f2557N + i);
        if (this.f2557N != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(hVar.mo3361b(i2), hVar.mo3367d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(hVar.f2558a, 0, this.f2558a, 0, i);
            System.arraycopy(hVar.f2559b, 0, this.f2559b, 0, i << 1);
            this.f2557N = i;
        }
    }
}
