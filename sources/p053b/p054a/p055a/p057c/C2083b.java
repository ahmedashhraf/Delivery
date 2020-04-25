package p053b.p054a.p055a.p057c;

import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: b.a.a.c.b */
/* compiled from: SafeIterableMap */
public class C2083b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: N */
    private WeakHashMap<C2089f<K, V>, Boolean> f7949N = new WeakHashMap<>();

    /* renamed from: O */
    private int f7950O = 0;

    /* renamed from: a */
    C2086c<K, V> f7951a;

    /* renamed from: b */
    private C2086c<K, V> f7952b;

    /* renamed from: b.a.a.c.b$a */
    /* compiled from: SafeIterableMap */
    static class C2084a<K, V> extends C2088e<K, V> {
        C2084a(C2086c<K, V> cVar, C2086c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2086c<K, V> mo9069b(C2086c<K, V> cVar) {
            return cVar.f7954O;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C2086c<K, V> mo9070c(C2086c<K, V> cVar) {
            return cVar.f7953N;
        }
    }

    /* renamed from: b.a.a.c.b$b */
    /* compiled from: SafeIterableMap */
    private static class C2085b<K, V> extends C2088e<K, V> {
        C2085b(C2086c<K, V> cVar, C2086c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2086c<K, V> mo9069b(C2086c<K, V> cVar) {
            return cVar.f7953N;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C2086c<K, V> mo9070c(C2086c<K, V> cVar) {
            return cVar.f7954O;
        }
    }

    /* renamed from: b.a.a.c.b$c */
    /* compiled from: SafeIterableMap */
    static class C2086c<K, V> implements Entry<K, V> {

        /* renamed from: N */
        C2086c<K, V> f7953N;

        /* renamed from: O */
        C2086c<K, V> f7954O;
        @C0193h0

        /* renamed from: a */
        final K f7955a;
        @C0193h0

        /* renamed from: b */
        final V f7956b;

        C2086c(@C0193h0 K k, @C0193h0 V v) {
            this.f7955a = k;
            this.f7956b = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2086c)) {
                return false;
            }
            C2086c cVar = (C2086c) obj;
            if (!this.f7955a.equals(cVar.f7955a) || !this.f7956b.equals(cVar.f7956b)) {
                z = false;
            }
            return z;
        }

        @C0193h0
        public K getKey() {
            return this.f7955a;
        }

        @C0193h0
        public V getValue() {
            return this.f7956b;
        }

        public int hashCode() {
            return this.f7955a.hashCode() ^ this.f7956b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7955a);
            sb.append("=");
            sb.append(this.f7956b);
            return sb.toString();
        }
    }

    /* renamed from: b.a.a.c.b$d */
    /* compiled from: SafeIterableMap */
    private class C2087d implements Iterator<Entry<K, V>>, C2089f<K, V> {

        /* renamed from: a */
        private C2086c<K, V> f7958a;

        /* renamed from: b */
        private boolean f7959b = true;

        C2087d() {
        }

        /* renamed from: a */
        public void mo9077a(@C0193h0 C2086c<K, V> cVar) {
            C2086c<K, V> cVar2 = this.f7958a;
            if (cVar == cVar2) {
                this.f7958a = cVar2.f7954O;
                this.f7959b = this.f7958a == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f7959b) {
                if (C2083b.this.f7951a == null) {
                    z = false;
                }
                return z;
            }
            C2086c<K, V> cVar = this.f7958a;
            if (cVar == null || cVar.f7953N == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            if (this.f7959b) {
                this.f7959b = false;
                this.f7958a = C2083b.this.f7951a;
            } else {
                C2086c<K, V> cVar = this.f7958a;
                this.f7958a = cVar != null ? cVar.f7953N : null;
            }
            return this.f7958a;
        }
    }

    /* renamed from: b.a.a.c.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C2088e<K, V> implements Iterator<Entry<K, V>>, C2089f<K, V> {

        /* renamed from: a */
        C2086c<K, V> f7960a;

        /* renamed from: b */
        C2086c<K, V> f7961b;

        C2088e(C2086c<K, V> cVar, C2086c<K, V> cVar2) {
            this.f7960a = cVar2;
            this.f7961b = cVar;
        }

        /* renamed from: b */
        private C2086c<K, V> m10843b() {
            C2086c<K, V> cVar = this.f7961b;
            C2086c<K, V> cVar2 = this.f7960a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo9070c(cVar);
        }

        /* renamed from: a */
        public void mo9077a(@C0193h0 C2086c<K, V> cVar) {
            if (this.f7960a == cVar && cVar == this.f7961b) {
                this.f7961b = null;
                this.f7960a = null;
            }
            C2086c<K, V> cVar2 = this.f7960a;
            if (cVar2 == cVar) {
                this.f7960a = mo9069b(cVar2);
            }
            if (this.f7961b == cVar) {
                this.f7961b = m10843b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C2086c<K, V> mo9069b(C2086c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C2086c<K, V> mo9070c(C2086c<K, V> cVar);

        public boolean hasNext() {
            return this.f7961b != null;
        }

        public Entry<K, V> next() {
            C2086c<K, V> cVar = this.f7961b;
            this.f7961b = m10843b();
            return cVar;
        }
    }

    /* renamed from: b.a.a.c.b$f */
    /* compiled from: SafeIterableMap */
    interface C2089f<K, V> {
        /* renamed from: a */
        void mo9077a(@C0193h0 C2086c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2086c<K, V> mo9054a(K k) {
        C2086c<K, V> cVar = this.f7951a;
        while (cVar != null && !cVar.f7955a.equals(k)) {
            cVar = cVar.f7953N;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo9055b(@C0193h0 K k, @C0193h0 V v) {
        C2086c a = mo9054a(k);
        if (a != null) {
            return a.f7956b;
        }
        mo9059a(k, v);
        return null;
    }

    /* renamed from: c */
    public C2087d mo9061c() {
        C2087d dVar = new C2087d<>();
        this.f7949N.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    public Iterator<Entry<K, V>> descendingIterator() {
        C2085b bVar = new C2085b(this.f7952b, this.f7951a);
        this.f7949N.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    /* renamed from: e */
    public Entry<K, V> mo9063e() {
        return this.f7952b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2083b)) {
            return false;
        }
        C2083b bVar = (C2083b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    @C0193h0
    public Iterator<Entry<K, V>> iterator() {
        C2084a aVar = new C2084a(this.f7951a, this.f7952b);
        this.f7949N.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(@C0193h0 K k) {
        C2086c a = mo9054a(k);
        if (a == null) {
            return null;
        }
        this.f7950O--;
        if (!this.f7949N.isEmpty()) {
            for (C2089f a2 : this.f7949N.keySet()) {
                a2.mo9077a(a);
            }
        }
        C2086c<K, V> cVar = a.f7954O;
        if (cVar != null) {
            cVar.f7953N = a.f7953N;
        } else {
            this.f7951a = a.f7953N;
        }
        C2086c<K, V> cVar2 = a.f7953N;
        if (cVar2 != null) {
            cVar2.f7954O = a.f7954O;
        } else {
            this.f7952b = a.f7954O;
        }
        a.f7953N = null;
        a.f7954O = null;
        return a.f7956b;
    }

    public int size() {
        return this.f7950O;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2086c<K, V> mo9059a(@C0193h0 K k, @C0193h0 V v) {
        C2086c<K, V> cVar = new C2086c<>(k, v);
        this.f7950O++;
        C2086c<K, V> cVar2 = this.f7952b;
        if (cVar2 == null) {
            this.f7951a = cVar;
            this.f7952b = this.f7951a;
            return cVar;
        }
        cVar2.f7953N = cVar;
        cVar.f7954O = cVar2;
        this.f7952b = cVar;
        return cVar;
    }

    /* renamed from: b */
    public Entry<K, V> mo9060b() {
        return this.f7951a;
    }
}
