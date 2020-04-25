package kotlin.p219v0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p214b1.p216u.p500n1.C14464a;

/* renamed from: kotlin.v0.c */
/* compiled from: AbstractIterator.kt */
public abstract class C14752c<T> implements Iterator<T>, C14464a {

    /* renamed from: a */
    private C14778g1 f42998a = C14778g1.NotReady;

    /* renamed from: b */
    private T f42999b;

    /* renamed from: d */
    private final boolean m63946d() {
        this.f42998a = C14778g1.Failed;
        mo45765b();
        return this.f42998a == C14778g1.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo45765b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46025b(T t) {
        this.f42999b = t;
        this.f42998a = C14778g1.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo46026c() {
        this.f42998a = C14778g1.Done;
    }

    public boolean hasNext() {
        if (this.f42998a != C14778g1.Failed) {
            int i = C14749b.f42996a[this.f42998a.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m63946d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f42998a = C14778g1.NotReady;
            return this.f42999b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
