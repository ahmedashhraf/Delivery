package kotlin.p219v0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.d0 */
/* compiled from: Maps.kt */
final class C14760d0 implements Map, Serializable, C14464a {

    /* renamed from: a */
    public static final C14760d0 f43008a = new C14760d0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C14760d0() {
    }

    private final Object readResolve() {
        return f43008a;
    }

    /* renamed from: a */
    public Void mo46088a(Object obj, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    /* renamed from: a */
    public Set<Entry> mo46089a() {
        return C14769e0.f43017a;
    }

    /* renamed from: a */
    public boolean mo46090a(@C6003d Void voidR) {
        C14445h0.m62478f(voidR, "value");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@C6004e Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo46090a((Void) obj);
        }
        return false;
    }

    @C6003d
    /* renamed from: d */
    public Set<Object> mo46094d() {
        return C14769e0.f43017a;
    }

    /* renamed from: e */
    public int mo46095e() {
        return 0;
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return mo46089a();
    }

    public boolean equals(@C6004e Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @C6003d
    /* renamed from: f */
    public Collection mo46098f() {
        return C14753c0.f43000a;
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    @C6004e
    public Void get(@C6004e Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo46094d();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46095e();
    }

    @C6003d
    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo46098f();
    }
}
