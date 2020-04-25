package kotlin;

import java.io.Serializable;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.k0 */
/* compiled from: Lazy.kt */
final class C14727k0<T> implements C14730m<T>, Serializable {

    /* renamed from: N */
    private final Object f42975N;

    /* renamed from: a */
    private C6069a<? extends T> f42976a;

    /* renamed from: b */
    private volatile Object f42977b;

    public C14727k0(@C6003d C6069a<? extends T> aVar, @C6004e Object obj) {
        C14445h0.m62478f(aVar, "initializer");
        this.f42976a = aVar;
        this.f42977b = C14735o0.f42982a;
        if (obj == 0) {
            obj = this;
        }
        this.f42975N = obj;
    }

    private final Object writeReplace() {
        return new C14723j(getValue());
    }

    /* renamed from: a */
    public boolean mo45671a() {
        return this.f42977b != C14735o0.f42982a;
    }

    public T getValue() {
        T t;
        T t2 = this.f42977b;
        if (t2 != C14735o0.f42982a) {
            return t2;
        }
        synchronized (this.f42975N) {
            t = this.f42977b;
            if (t == C14735o0.f42982a) {
                C6069a<? extends T> aVar = this.f42976a;
                if (aVar == null) {
                    C14445h0.m62474e();
                }
                t = aVar.mo24947p();
                this.f42977b = t;
                this.f42976a = null;
            }
        }
        return t;
    }

    @C6003d
    public String toString() {
        return mo45671a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C14727k0(C6069a aVar, Object obj, int i, C14487u uVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(aVar, obj);
    }
}
