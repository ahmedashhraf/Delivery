package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p214b1.p216u.C14485t;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\t2\u000b\u0010\n\u001a\u00078\u0000¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b0\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H¦\u0002J\u0015\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0014¢\u0006\u0002\u0010\u0015J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0013\"\u0004\b\u0001\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0013H\u0014¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, mo24990d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "Lkotlin/UnsafeVariance;", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.a */
/* compiled from: AbstractCollection.kt */
public abstract class C14744a<E> implements Collection<E>, C14464a {

    /* renamed from: kotlin.v0.a$a */
    /* compiled from: AbstractCollection.kt */
    static final class C14745a extends C14448i0 implements C6080l<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ C14744a f42988a;

        C14745a(C14744a aVar) {
            this.f42988a = aVar;
            super(1);
        }

        @C6003d
        public final CharSequence invoke(E e) {
            return e == this.f42988a ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C14744a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo45907b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C14445h0.m62463a(a, obj)) {
                return true;
            }
        }
        return false;
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

    public boolean isEmpty() {
        return size() == 0;
    }

    @C6003d
    public abstract Iterator<E> iterator();

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
        return mo45907b();
    }

    @C6003d
    public Object[] toArray() {
        return C14485t.m62651a(this);
    }

    @C6003d
    public String toString() {
        return C14848z.m65690a(this, ", ", "[", "]", 0, null, new C14745a(this), 24, null);
    }

    @C6003d
    public <T> T[] toArray(@C6003d T[] tArr) {
        C14445h0.m62478f(tArr, "array");
        T[] a = C14485t.m62653a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
