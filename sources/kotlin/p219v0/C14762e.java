package kotlin.p219v0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 **\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001*B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00142\u000b\u0010\u001c\u001a\u00078\u0001¢\u0006\u0002\b\u001dH\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\rH\u0016J#\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010 H\u0002J\u001c\u0010'\u001a\u00020(2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b8\b@\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006+"}, mo24990d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "Lkotlin/UnsafeVariance;", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.e */
/* compiled from: AbstractMap.kt */
public abstract class C14762e<K, V> implements Map<K, V>, C14464a {

    /* renamed from: N */
    public static final C14763a f43009N = new C14763a(null);

    /* renamed from: a */
    private volatile Set<? extends K> f43010a;

    /* renamed from: b */
    private volatile Collection<? extends V> f43011b;

    /* renamed from: kotlin.v0.e$a */
    /* compiled from: AbstractMap.kt */
    public static final class C14763a {
        private C14763a() {
        }

        /* renamed from: a */
        public final int mo46129a(@C6003d Entry<?, ?> entry) {
            C14445h0.m62478f(entry, "e");
            Object key = entry.getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @C6003d
        /* renamed from: b */
        public final String mo46131b(@C6003d Entry<?, ?> entry) {
            C14445h0.m62478f(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        public /* synthetic */ C14763a(C14487u uVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo46130a(@C6003d Entry<?, ?> entry, @C6004e Object obj) {
            C14445h0.m62478f(entry, "e");
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry2 = (Entry) obj;
            if (C14445h0.m62463a(entry.getKey(), entry2.getKey()) && C14445h0.m62463a(entry.getValue(), entry2.getValue())) {
                z = true;
            }
            return z;
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo24990d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "(Lkotlin/collections/AbstractMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.v0.e$b */
    /* compiled from: AbstractMap.kt */
    public static final class C14764b extends C14784j<K> {

        /* renamed from: b */
        final /* synthetic */ C14762e f43012b;

        /* renamed from: kotlin.v0.e$b$a */
        /* compiled from: AbstractMap.kt */
        public static final class C14765a implements Iterator<K>, C14464a {

            /* renamed from: a */
            final /* synthetic */ Iterator f43013a;

            C14765a(Iterator it) {
                this.f43013a = it;
            }

            public boolean hasNext() {
                return this.f43013a.hasNext();
            }

            public K next() {
                return ((Entry) this.f43013a.next()).getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C14764b(C14762e eVar) {
            this.f43012b = eVar;
        }

        /* renamed from: b */
        public int mo45907b() {
            return this.f43012b.size();
        }

        public boolean contains(Object obj) {
            return this.f43012b.containsKey(obj);
        }

        @C6003d
        public Iterator<K> iterator() {
            return new C14765a(this.f43012b.entrySet().iterator());
        }
    }

    /* renamed from: kotlin.v0.e$c */
    /* compiled from: AbstractMap.kt */
    static final class C14766c extends C14448i0 implements C6080l<Entry<? extends K, ? extends V>, String> {

        /* renamed from: a */
        final /* synthetic */ C14762e f43014a;

        C14766c(C14762e eVar) {
            this.f43014a = eVar;
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d Entry<? extends K, ? extends V> entry) {
            C14445h0.m62478f(entry, "it");
            return this.f43014a.m63997b(entry);
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\u00020\b2\u000b\u0010\t\u001a\u00078\u0000¢\u0006\u0002\b\nH\u0002¢\u0006\u0002\u0010\u000bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo24990d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "(Lkotlin/collections/AbstractMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "Lkotlin/UnsafeVariance;", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.v0.e$d */
    /* compiled from: AbstractMap.kt */
    public static final class C14767d extends C14744a<V> {

        /* renamed from: a */
        final /* synthetic */ C14762e f43015a;

        /* renamed from: kotlin.v0.e$d$a */
        /* compiled from: AbstractMap.kt */
        public static final class C14768a implements Iterator<V>, C14464a {

            /* renamed from: a */
            final /* synthetic */ Iterator f43016a;

            C14768a(Iterator it) {
                this.f43016a = it;
            }

            public boolean hasNext() {
                return this.f43016a.hasNext();
            }

            public V next() {
                return ((Entry) this.f43016a.next()).getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C14767d(C14762e eVar) {
            this.f43015a = eVar;
        }

        /* renamed from: b */
        public int mo45907b() {
            return this.f43015a.size();
        }

        public boolean contains(Object obj) {
            return this.f43015a.containsValue(obj);
        }

        @C6003d
        public Iterator<V> iterator() {
            return new C14768a(this.f43015a.entrySet().iterator());
        }
    }

    protected C14762e() {
    }

    /* renamed from: a */
    public abstract Set mo46109a();

    @C6003d
    /* renamed from: b */
    public Set<K> mo46111b() {
        if (this.f43010a == null) {
            this.f43010a = new C14764b(this);
        }
        Set<? extends K> set = this.f43010a;
        if (set == null) {
            C14445h0.m62474e();
        }
        return set;
    }

    /* renamed from: c */
    public int mo46112c() {
        return entrySet().size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return m63998b((K) obj) != null;
    }

    public boolean containsValue(Object obj) {
        Set<Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Entry value : entrySet) {
            if (C14445h0.m62463a(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @C6003d
    /* renamed from: d */
    public Collection<V> mo46116d() {
        if (this.f43011b == null) {
            this.f43011b = new C14767d(this);
        }
        Collection<? extends V> collection = this.f43011b;
        if (collection == null) {
            C14445h0.m62474e();
        }
        return collection;
    }

    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return mo46109a();
    }

    public boolean equals(@C6004e Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!mo46110a((Entry) it.next())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    @C6004e
    public V get(Object obj) {
        Entry b = m63998b((K) obj);
        if (b != null) {
            return b.getValue();
        }
        return null;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo46111b();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46112c();
    }

    @C6003d
    public String toString() {
        return C14848z.m65690a(entrySet(), ", ", "{", "}", 0, null, new C14766c(this), 24, null);
    }

    public final /* bridge */ Collection<V> values() {
        return mo46116d();
    }

    /* renamed from: c */
    private final String m63999c(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* renamed from: a */
    public final boolean mo46110a(@C6004e Entry<?, ?> entry) {
        if (!(entry instanceof Entry)) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj = get(key);
        if (!C14445h0.m62463a(value, obj)) {
            return false;
        }
        if (obj != null || containsKey(key)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m63997b(Entry<? extends K, ? extends V> entry) {
        StringBuilder sb = new StringBuilder();
        sb.append(m63999c(entry.getKey()));
        sb.append("=");
        sb.append(m63999c(entry.getValue()));
        return sb.toString();
    }

    /* renamed from: b */
    private final Entry<K, V> m63998b(K k) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C14445h0.m62463a(((Entry) obj).getKey(), (Object) k)) {
                break;
            }
        }
        return (Entry) obj;
    }
}
