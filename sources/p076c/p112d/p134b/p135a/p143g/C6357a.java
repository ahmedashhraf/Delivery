package p076c.p112d.p134b.p135a.p143g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: c.d.b.a.g.a */
/* compiled from: ArrayMap */
public class C6357a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    int f17764a;

    /* renamed from: b */
    private Object[] f17765b;

    /* renamed from: c.d.b.a.g.a$a */
    /* compiled from: ArrayMap */
    final class C6358a implements Entry<K, V> {

        /* renamed from: a */
        private int f17766a;

        C6358a(int i) {
            this.f17766a = i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!C6373f0.m29651a(getKey(), entry.getKey()) || !C6373f0.m29651a(getValue(), entry.getValue())) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return C6357a.this.mo25721b(this.f17766a);
        }

        public V getValue() {
            return C6357a.this.mo25724c(this.f17766a);
        }

        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public V setValue(V v) {
            return C6357a.this.mo25717a(this.f17766a, v);
        }
    }

    /* renamed from: c.d.b.a.g.a$b */
    /* compiled from: ArrayMap */
    final class C6359b implements Iterator<Entry<K, V>> {

        /* renamed from: a */
        private boolean f17769a;

        /* renamed from: b */
        private int f17770b;

        C6359b() {
        }

        public boolean hasNext() {
            return this.f17770b < C6357a.this.f17764a;
        }

        public void remove() {
            int i = this.f17770b - 1;
            if (this.f17769a || i < 0) {
                throw new IllegalArgumentException();
            }
            C6357a.this.mo25729d(i);
            this.f17769a = true;
        }

        public Entry<K, V> next() {
            int i = this.f17770b;
            C6357a aVar = C6357a.this;
            if (i != aVar.f17764a) {
                this.f17770b = i + 1;
                return new C6358a(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c.d.b.a.g.a$c */
    /* compiled from: ArrayMap */
    final class C6360c extends AbstractSet<Entry<K, V>> {
        C6360c() {
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C6359b();
        }

        public int size() {
            return C6357a.this.f17764a;
        }
    }

    /* renamed from: a */
    public static <K, V> C6357a<K, V> m29609a(Object... objArr) {
        C6357a<K, V> e = m29613e(1);
        int length = objArr.length;
        if (1 != length % 2) {
            e.f17764a = objArr.length / 2;
            Object[] objArr2 = new Object[length];
            e.f17765b = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return e;
        }
        String valueOf = String.valueOf(String.valueOf(objArr[length - 1]));
        StringBuilder sb = new StringBuilder(valueOf.length() + 28);
        sb.append("missing value for last key: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static <K, V> C6357a<K, V> m29612c() {
        return new C6357a<>();
    }

    /* renamed from: e */
    public static <K, V> C6357a<K, V> m29613e(int i) {
        C6357a<K, V> c = m29612c();
        c.mo25719a(i);
        return c;
    }

    /* renamed from: f */
    private V m29614f(int i) {
        int i2 = this.f17764a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V h = m29616h(i + 1);
        Object[] objArr = this.f17765b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f17764a--;
        m29610b(i2 - 2, null, null);
        return h;
    }

    /* renamed from: g */
    private void m29615g(int i) {
        if (i == 0) {
            this.f17765b = null;
            return;
        }
        int i2 = this.f17764a;
        Object[] objArr = this.f17765b;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.f17765b = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    /* renamed from: h */
    private V m29616h(int i) {
        if (i < 0) {
            return null;
        }
        return this.f17765b[i];
    }

    /* renamed from: b */
    public final K mo25721b(int i) {
        if (i < 0 || i >= this.f17764a) {
            return null;
        }
        return this.f17765b[i << 1];
    }

    public void clear() {
        this.f17764a = 0;
        this.f17765b = null;
    }

    public final boolean containsKey(Object obj) {
        return -2 != m29611c(obj);
    }

    public final boolean containsValue(Object obj) {
        int i = this.f17764a << 1;
        Object[] objArr = this.f17765b;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final V mo25729d(int i) {
        return m29614f(i << 1);
    }

    public final Set<Entry<K, V>> entrySet() {
        return new C6360c();
    }

    public final V get(Object obj) {
        return m29616h(m29611c(obj) + 1);
    }

    public final V put(K k, V v) {
        int b = mo25720b(k);
        if (b == -1) {
            b = this.f17764a;
        }
        return mo25718a(b, k, v);
    }

    public final V remove(Object obj) {
        return m29614f(m29611c(obj));
    }

    public final int size() {
        return this.f17764a;
    }

    /* renamed from: c */
    public final V mo25724c(int i) {
        if (i < 0 || i >= this.f17764a) {
            return null;
        }
        return m29616h((i << 1) + 1);
    }

    public C6357a<K, V> clone() {
        try {
            C6357a<K, V> aVar = (C6357a) super.clone();
            Object[] objArr = this.f17765b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f17765b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo25723b(K k, V v) {
        mo25718a(this.f17764a, k, v);
    }

    /* renamed from: c */
    private int m29611c(Object obj) {
        int i = this.f17764a << 1;
        Object[] objArr = this.f17765b;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    /* renamed from: b */
    public final int mo25720b(K k) {
        return m29611c((Object) k) >> 1;
    }

    /* renamed from: b */
    public final void mo25722b() {
        m29615g(this.f17764a << 1);
    }

    /* renamed from: b */
    private void m29610b(int i, K k, V v) {
        Object[] objArr = this.f17765b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    /* renamed from: a */
    public final V mo25718a(int i, K k, V v) {
        if (i >= 0) {
            int i2 = i + 1;
            mo25719a(i2);
            int i3 = i << 1;
            V h = m29616h(i3 + 1);
            m29610b(i3, k, v);
            if (i2 > this.f17764a) {
                this.f17764a = i2;
            }
            return h;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final V mo25717a(int i, V v) {
        int i2 = this.f17764a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V h = m29616h(i3);
        this.f17765b[i3] = v;
        return h;
    }

    /* renamed from: a */
    public final void mo25719a(int i) {
        int i2;
        if (i >= 0) {
            Object[] objArr = this.f17765b;
            int i3 = i << 1;
            if (objArr == null) {
                i2 = 0;
            } else {
                i2 = objArr.length;
            }
            if (i3 > i2) {
                int i4 = ((i2 / 2) * 3) + 1;
                if (i4 % 2 != 0) {
                    i4++;
                }
                if (i4 >= i3) {
                    i3 = i4;
                }
                m29615g(i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
