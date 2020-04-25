package kotlin.p219v0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.b0 */
/* compiled from: Collections.kt */
public final class C14750b0 implements ListIterator, C14464a {

    /* renamed from: a */
    public static final C14750b0 f42997a = new C14750b0();

    private C14750b0() {
    }

    /* renamed from: a */
    public void mo46014a(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public void mo46016b(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    public Void next() {
        throw new NoSuchElementException();
    }

    @C6003d
    public Void previous() {
        throw new NoSuchElementException();
    }
}
