package p076c.p112d.p134b.p135a.p143g;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: c.d.b.a.g.s */
/* compiled from: GenericData */
public class C6413s extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: a */
    Map<String, Object> f17874a;

    /* renamed from: b */
    final C6387k f17875b;

    /* renamed from: c.d.b.a.g.s$a */
    /* compiled from: GenericData */
    final class C6414a implements Iterator<Entry<String, Object>> {

        /* renamed from: N */
        private final Iterator<Entry<String, Object>> f17876N;

        /* renamed from: a */
        private boolean f17878a;

        /* renamed from: b */
        private final Iterator<Entry<String, Object>> f17879b;

        C6414a(C6403c cVar) {
            this.f17879b = cVar.iterator();
            this.f17876N = C6413s.this.f17874a.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f17879b.hasNext() || this.f17876N.hasNext();
        }

        public void remove() {
            if (this.f17878a) {
                this.f17876N.remove();
            }
            this.f17879b.remove();
        }

        public Entry<String, Object> next() {
            if (!this.f17878a) {
                if (this.f17879b.hasNext()) {
                    return (Entry) this.f17879b.next();
                }
                this.f17878a = true;
            }
            return (Entry) this.f17876N.next();
        }
    }

    /* renamed from: c.d.b.a.g.s$b */
    /* compiled from: GenericData */
    final class C6415b extends AbstractSet<Entry<String, Object>> {

        /* renamed from: a */
        private final C6403c f17880a;

        C6415b() {
            this.f17880a = new C6400o(C6413s.this, C6413s.this.f17875b.mo25770b()).entrySet();
        }

        public void clear() {
            C6413s.this.f17874a.clear();
            this.f17880a.clear();
        }

        public Iterator<Entry<String, Object>> iterator() {
            return new C6414a(this.f17880a);
        }

        public int size() {
            return C6413s.this.f17874a.size() + this.f17880a.size();
        }
    }

    /* renamed from: c.d.b.a.g.s$c */
    /* compiled from: GenericData */
    public enum C6416c {
        IGNORE_CASE
    }

    public C6413s() {
        this(EnumSet.noneOf(C6416c.class));
    }

    /* renamed from: a */
    public final Object put(String str, Object obj) {
        C6412r b = this.f17875b.mo25769b(str);
        if (b != null) {
            Object a = b.mo25829a((Object) this);
            b.mo25830a((Object) this, obj);
            return a;
        }
        if (this.f17875b.mo25770b()) {
            str = str.toLowerCase();
        }
        return this.f17874a.put(str, obj);
    }

    /* renamed from: b */
    public C6413s mo25098b(String str, Object obj) {
        C6412r b = this.f17875b.mo25769b(str);
        if (b != null) {
            b.mo25830a((Object) this, obj);
        } else {
            if (this.f17875b.mo25770b()) {
                str = str.toLowerCase();
            }
            this.f17874a.put(str, obj);
        }
        return this;
    }

    /* renamed from: c */
    public final Map<String, Object> mo25841c() {
        return this.f17874a;
    }

    public Set<Entry<String, Object>> entrySet() {
        return new C6415b();
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C6412r b = this.f17875b.mo25769b(str);
        if (b != null) {
            return b.mo25829a((Object) this);
        }
        if (this.f17875b.mo25770b()) {
            str = str.toLowerCase();
        }
        return this.f17874a.get(str);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            mo25098b((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f17875b.mo25769b(str) == null) {
            if (this.f17875b.mo25770b()) {
                str = str.toLowerCase();
            }
            return this.f17874a.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public C6413s(EnumSet<C6416c> enumSet) {
        this.f17874a = C6357a.m29612c();
        this.f17875b = C6387k.m29692a(getClass(), enumSet.contains(C6416c.IGNORE_CASE));
    }

    public C6413s clone() {
        try {
            C6413s sVar = (C6413s) super.clone();
            C6398n.m29719a((Object) this, (Object) sVar);
            sVar.f17874a = (Map) C6398n.m29715a(this.f17874a);
            return sVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final C6387k mo25840b() {
        return this.f17875b;
    }

    /* renamed from: a */
    public final void mo25839a(Map<String, Object> map) {
        this.f17874a = map;
    }
}
