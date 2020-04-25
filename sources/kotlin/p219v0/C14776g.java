package kotlin.p219v0;

import java.util.AbstractList;
import java.util.List;
import kotlin.C6096e0;
import kotlin.p214b1.p216u.p500n1.C14468e;

@C6096e0(version = "1.1")
/* renamed from: kotlin.v0.g */
/* compiled from: AbstractMutableList.kt */
public abstract class C14776g<E> extends AbstractList<E> implements List<E>, C14468e {
    protected C14776g() {
    }

    public abstract void add(int i, E e);

    /* renamed from: b */
    public abstract int mo46168b();

    /* renamed from: b */
    public abstract E mo46169b(int i);

    public final /* bridge */ E remove(int i) {
        return mo46169b(i);
    }

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return mo46168b();
    }
}
