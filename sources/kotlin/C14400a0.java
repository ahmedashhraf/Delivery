package kotlin;

import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6069a;

/* renamed from: kotlin.a0 */
/* compiled from: Preconditions.kt */
class C14400a0 extends C14907z {
    @C6041f
    /* renamed from: a */
    private static final void m62361a(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @C6041f
    /* renamed from: b */
    private static final void m62365b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @C6041f
    /* renamed from: c */
    private static final <T> T m62367c(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @C6041f
    /* renamed from: a */
    private static final void m62362a(boolean z, C6069a<? extends Object> aVar) {
        if (!z) {
            throw new IllegalStateException(aVar.mo24947p().toString());
        }
    }

    @C6041f
    /* renamed from: b */
    private static final void m62366b(boolean z, C6069a<? extends Object> aVar) {
        if (!z) {
            throw new IllegalArgumentException(aVar.mo24947p().toString());
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T m62359a(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @C6041f
    /* renamed from: b */
    private static final <T> T m62363b(T t, C6069a<? extends Object> aVar) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(aVar.mo24947p().toString());
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T m62360a(T t, C6069a<? extends Object> aVar) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(aVar.mo24947p().toString());
    }

    @C6041f
    /* renamed from: b */
    private static final Void m62364b(Object obj) {
        throw new IllegalStateException(obj.toString());
    }
}
