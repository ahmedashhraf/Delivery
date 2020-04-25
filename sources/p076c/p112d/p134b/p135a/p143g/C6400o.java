package p076c.p112d.p134b.p135a.p143g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: c.d.b.a.g.o */
/* compiled from: DataMap */
final class C6400o extends AbstractMap<String, Object> {

    /* renamed from: a */
    final Object f17829a;

    /* renamed from: b */
    final C6387k f17830b;

    /* renamed from: c.d.b.a.g.o$a */
    /* compiled from: DataMap */
    final class C6401a implements Entry<String, Object> {

        /* renamed from: a */
        private Object f17832a;

        /* renamed from: b */
        private final C6412r f17833b;

        C6401a(C6412r rVar, Object obj) {
            this.f17833b = rVar;
            this.f17832a = C6381h0.m29663a(obj);
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
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                z = false;
            }
            return z;
        }

        public Object getValue() {
            return this.f17832a;
        }

        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f17832a;
            this.f17832a = C6381h0.m29663a(obj);
            this.f17833b.mo25830a(C6400o.this.f17829a, obj);
            return obj2;
        }

        public String getKey() {
            String e = this.f17833b.mo25834e();
            return C6400o.this.f17830b.mo25770b() ? e.toLowerCase() : e;
        }
    }

    /* renamed from: c.d.b.a.g.o$b */
    /* compiled from: DataMap */
    final class C6402b implements Iterator<Entry<String, Object>> {

        /* renamed from: N */
        private Object f17834N;

        /* renamed from: O */
        private boolean f17835O;

        /* renamed from: P */
        private boolean f17836P;

        /* renamed from: Q */
        private C6412r f17837Q;

        /* renamed from: a */
        private int f17839a = -1;

        /* renamed from: b */
        private C6412r f17840b;

        C6402b() {
        }

        public boolean hasNext() {
            if (!this.f17836P) {
                this.f17836P = true;
                this.f17834N = null;
                while (this.f17834N == null) {
                    int i = this.f17839a + 1;
                    this.f17839a = i;
                    if (i >= C6400o.this.f17830b.f17811d.size()) {
                        break;
                    }
                    C6387k kVar = C6400o.this.f17830b;
                    this.f17840b = kVar.mo25769b((String) kVar.f17811d.get(this.f17839a));
                    this.f17834N = this.f17840b.mo25829a(C6400o.this.f17829a);
                }
            }
            if (this.f17834N != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            C6381h0.m29669b(this.f17837Q != null && !this.f17835O);
            this.f17835O = true;
            this.f17837Q.mo25830a(C6400o.this.f17829a, (Object) null);
        }

        public Entry<String, Object> next() {
            if (hasNext()) {
                this.f17837Q = this.f17840b;
                Object obj = this.f17834N;
                this.f17836P = false;
                this.f17835O = false;
                this.f17840b = null;
                this.f17834N = null;
                return new C6401a(this.f17837Q, obj);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c.d.b.a.g.o$c */
    /* compiled from: DataMap */
    final class C6403c extends AbstractSet<Entry<String, Object>> {
        C6403c() {
        }

        public void clear() {
            for (String b : C6400o.this.f17830b.f17811d) {
                C6400o.this.f17830b.mo25769b(b).mo25830a(C6400o.this.f17829a, (Object) null);
            }
        }

        public boolean isEmpty() {
            for (String b : C6400o.this.f17830b.f17811d) {
                if (C6400o.this.f17830b.mo25769b(b).mo25829a(C6400o.this.f17829a) != null) {
                    return false;
                }
            }
            return true;
        }

        public int size() {
            int i = 0;
            for (String b : C6400o.this.f17830b.f17811d) {
                if (C6400o.this.f17830b.mo25769b(b).mo25829a(C6400o.this.f17829a) != null) {
                    i++;
                }
            }
            return i;
        }

        public C6402b iterator() {
            return new C6402b();
        }
    }

    C6400o(Object obj, boolean z) {
        this.f17829a = obj;
        this.f17830b = C6387k.m29692a(obj.getClass(), z);
        C6381h0.m29666a(!this.f17830b.mo25773e());
    }

    /* renamed from: a */
    public Object put(String str, Object obj) {
        C6412r b = this.f17830b.mo25769b(str);
        String valueOf = String.valueOf(str);
        String str2 = "no field of key ";
        C6381h0.m29664a(b, (Object) valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Object a = b.mo25829a(this.f17829a);
        b.mo25830a(this.f17829a, C6381h0.m29663a(obj));
        return a;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        C6412r b = this.f17830b.mo25769b((String) obj);
        if (b == null) {
            return null;
        }
        return b.mo25829a(this.f17829a);
    }

    public C6403c entrySet() {
        return new C6403c();
    }
}
