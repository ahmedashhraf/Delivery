package kotlin.p219v0;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.C6096e0;
import kotlin.p214b1.p216u.p500n1.C14465b;

@C6096e0(version = "1.1")
/* renamed from: kotlin.v0.f */
/* compiled from: AbstractMutableCollection.kt */
public abstract class C14771f<E> extends AbstractCollection<E> implements Collection<E>, C14465b {
    protected C14771f() {
    }

    public abstract boolean add(E e);

    /* renamed from: b */
    public abstract int mo46161b();

    public final /* bridge */ int size() {
        return mo46161b();
    }
}
