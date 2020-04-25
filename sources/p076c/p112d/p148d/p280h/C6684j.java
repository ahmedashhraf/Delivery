package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.j */
/* compiled from: TypeParameter */
public abstract class C6684j<T> extends C6683i<T> {

    /* renamed from: a */
    final TypeVariable<?> f18662a;

    protected C6684j() {
        Type a = mo26814a();
        C7397x.m35672a(a instanceof TypeVariable, "%s should be a type variable.", a);
        this.f18662a = (TypeVariable) a;
    }

    public final boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6684j)) {
            return false;
        }
        return this.f18662a.equals(((C6684j) obj).f18662a);
    }

    public final int hashCode() {
        return this.f18662a.hashCode();
    }

    public String toString() {
        return this.f18662a.toString();
    }
}
