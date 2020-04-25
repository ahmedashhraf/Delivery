package kotlin;

import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6055e(name = "LazyKt")
/* renamed from: kotlin.o */
/* compiled from: Lazy.kt */
public final class C14734o {
    @C6003d
    /* renamed from: a */
    public static final <T> C14730m<T> m63887a(T t) {
        return new C14723j(t);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14730m<T> m63889a(@C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(aVar, "initializer");
        return new C14727k0(aVar, null, 2, null);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14730m<T> m63890a(@C6003d C14736p pVar, @C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(pVar, "mode");
        C14445h0.m62478f(aVar, "initializer");
        int i = C14732n.f42981a[pVar.ordinal()];
        if (i == 1) {
            return new C14727k0(aVar, null, 2, null);
        }
        if (i == 2) {
            return new C14500d0(aVar);
        }
        if (i == 3) {
            return new C14739q0(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14730m<T> m63888a(@C6004e Object obj, @C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(aVar, "initializer");
        return new C14727k0(aVar, obj);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T m63886a(@C6003d C14730m<? extends T> mVar, Object obj, C14557l<?> lVar) {
        C14445h0.m62478f(mVar, "$receiver");
        return mVar.getValue();
    }
}
