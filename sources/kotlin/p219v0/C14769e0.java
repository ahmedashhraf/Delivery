package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14485t;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.e0 */
/* compiled from: Sets.kt */
public final class C14769e0 implements Set, Serializable, C14464a {

    /* renamed from: a */
    public static final C14769e0 f43017a = new C14769e0();
    private static final long serialVersionUID = 3406603774387020532L;

    private C14769e0() {
    }

    private final Object readResolve() {
        return f43017a;
    }

    /* renamed from: a */
    public int mo46139a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo46140a(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo46143b(@C6003d Void voidR) {
        C14445h0.m62478f(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo46143b((Void) obj);
        }
        return false;
    }

    public boolean containsAll(@C6003d Collection collection) {
        C14445h0.m62478f(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    public boolean equals(@C6004e Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    @C6003d
    public Iterator iterator() {
        return C14750b0.f42997a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46139a();
    }

    public Object[] toArray() {
        return C14485t.m62651a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C14485t.m62653a(this, tArr);
    }

    @C6003d
    public String toString() {
        return "[]";
    }
}
