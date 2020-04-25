package kotlin;

import java.io.Serializable;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.q0 */
/* compiled from: Lazy.kt */
public final class C14739q0<T> implements C14730m<T>, Serializable {

    /* renamed from: a */
    private C6069a<? extends T> f42984a;

    /* renamed from: b */
    private Object f42985b = C14735o0.f42982a;

    public C14739q0(@C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(aVar, "initializer");
        this.f42984a = aVar;
    }

    private final Object writeReplace() {
        return new C14723j(getValue());
    }

    /* renamed from: a */
    public boolean mo45671a() {
        return this.f42985b != C14735o0.f42982a;
    }

    public T getValue() {
        if (this.f42985b == C14735o0.f42982a) {
            C6069a<? extends T> aVar = this.f42984a;
            if (aVar == null) {
                C14445h0.m62474e();
            }
            this.f42985b = aVar.mo24947p();
            this.f42984a = null;
        }
        return this.f42985b;
    }

    @C6003d
    public String toString() {
        return mo45671a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
