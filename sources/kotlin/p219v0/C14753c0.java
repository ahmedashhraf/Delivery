package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14485t;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.c0 */
/* compiled from: Collections.kt */
public final class C14753c0 implements List, Serializable, RandomAccess, C14464a {

    /* renamed from: a */
    public static final C14753c0 f43000a = new C14753c0();
    private static final long serialVersionUID = -7390468764508069838L;

    private C14753c0() {
    }

    private final Object readResolve() {
        return f43000a;
    }

    /* renamed from: a */
    public void mo46030a(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: a */
    public boolean mo46031a(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void mo46036b(int i, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo46037b(@C6003d Void voidR) {
        C14445h0.m62478f(voidR, "element");
        return false;
    }

    /* renamed from: c */
    public int mo46038c(@C6003d Void voidR) {
        C14445h0.m62478f(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo46037b((Void) obj);
        }
        return false;
    }

    public boolean containsAll(@C6003d Collection collection) {
        C14445h0.m62478f(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    /* renamed from: d */
    public int mo46042d(@C6003d Void voidR) {
        C14445h0.m62478f(voidR, "element");
        return -1;
    }

    /* renamed from: e */
    public int mo46043e() {
        return 0;
    }

    public boolean equals(@C6004e Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo46038c((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    @C6003d
    public Iterator iterator() {
        return C14750b0.f42997a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo46042d((Void) obj);
        }
        return -1;
    }

    @C6003d
    public ListIterator listIterator() {
        return C14750b0.f42997a;
    }

    public Void remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46043e();
    }

    @C6003d
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
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

    @C6003d
    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C6003d
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C14750b0.f42997a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
