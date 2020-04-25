package kotlin;

import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;

/* renamed from: kotlin.g0 */
/* compiled from: Standard.kt */
class C14574g0 {
    @C6041f
    /* renamed from: a */
    private static final Void m63103a() {
        throw new C14743v(null, 1, null);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> T m63106b(T t, C6080l<? super T, C14737p0> lVar) {
        lVar.invoke(t);
        return t;
    }

    @C6041f
    /* renamed from: c */
    private static final <T, R> R m63107c(T t, C6080l<? super T, ? extends R> lVar) {
        return lVar.invoke(t);
    }

    @C6041f
    /* renamed from: d */
    private static final <T, R> R m63108d(T t, C6080l<? super T, ? extends R> lVar) {
        return lVar.invoke(t);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: e */
    private static final <T> T m63109e(T t, C6080l<? super T, Boolean> lVar) {
        if (((Boolean) lVar.invoke(t)).booleanValue()) {
            return t;
        }
        return null;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: f */
    private static final <T> T m63110f(T t, C6080l<? super T, Boolean> lVar) {
        if (!((Boolean) lVar.invoke(t)).booleanValue()) {
            return t;
        }
        return null;
    }

    @C6041f
    /* renamed from: g */
    private static final <T, R> R m63111g(T t, C6080l<? super T, ? extends R> lVar) {
        return lVar.invoke(t);
    }

    @C6041f
    /* renamed from: a */
    private static final Void m63104a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append(str);
        throw new C14743v(sb.toString());
    }

    @C6041f
    /* renamed from: a */
    private static final <R> R m63102a(C6069a<? extends R> aVar) {
        return aVar.mo24947p();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final <T> T m63101a(T t, C6080l<? super T, C14737p0> lVar) {
        lVar.invoke(t);
        return t;
    }

    @C6041f
    /* renamed from: a */
    private static final void m63105a(int i, C6080l<? super Integer, C14737p0> lVar) {
        for (int i2 = 0; i2 < i; i2++) {
            lVar.invoke(Integer.valueOf(i2));
        }
    }
}
