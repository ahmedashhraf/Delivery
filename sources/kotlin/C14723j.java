package kotlin;

import java.io.Serializable;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.j */
/* compiled from: Lazy.kt */
final class C14723j<T> implements C14730m<T>, Serializable {

    /* renamed from: a */
    private final T f42967a;

    public C14723j(T t) {
        this.f42967a = t;
    }

    /* renamed from: a */
    public boolean mo45671a() {
        return true;
    }

    public T getValue() {
        return this.f42967a;
    }

    @C6003d
    public String toString() {
        return String.valueOf(getValue());
    }
}
