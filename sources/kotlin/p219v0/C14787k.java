package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collection;
import java.util.Iterator;
import kotlin.p214b1.p216u.C14444h;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14485t;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.k */
/* compiled from: Collections.kt */
final class C14787k<T> implements Collection<T>, C14464a {
    @C6003d

    /* renamed from: a */
    private final T[] f43039a;

    /* renamed from: b */
    private final boolean f43040b;

    public C14787k(@C6003d T[] tArr, boolean z) {
        C14445h0.m62478f(tArr, "values");
        this.f43039a = tArr;
        this.f43040b = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo46200b() {
        return this.f43039a.length;
    }

    @C6003d
    /* renamed from: c */
    public final T[] mo46201c() {
        return this.f43039a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C14794o.m64564a(this.f43039a, obj);
    }

    public boolean containsAll(@C6003d Collection<? extends Object> collection) {
        C14445h0.m62478f(collection, MessengerShareContentUtility.ELEMENTS);
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo46205e() {
        return this.f43040b;
    }

    public boolean isEmpty() {
        return this.f43039a.length == 0;
    }

    @C6003d
    public Iterator<T> iterator() {
        return C14444h.m62443a(this.f43039a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46200b();
    }

    @C6003d
    public final Object[] toArray() {
        return C6129u.m28150b(this.f43039a, this.f43040b);
    }

    public <T> T[] toArray(T[] tArr) {
        return C14485t.m62653a(this, tArr);
    }
}
