package p195e.p196a.p199x0.p450a;

import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.a.e */
/* compiled from: EmptyDisposable */
public enum C12348e implements C12401j<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m55473a(C12280i0<?> i0Var) {
        i0Var.mo34123a((C12314c) INSTANCE);
        i0Var.onComplete();
    }

    /* renamed from: a */
    public int mo41855a(int i) {
        return i & 2;
    }

    public void clear() {
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this == INSTANCE;
    }

    public void dispose() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @C5938g
    public Object poll() throws Exception {
        return null;
    }

    /* renamed from: a */
    public static void m55474a(C12321v<?> vVar) {
        vVar.mo41931a(INSTANCE);
        vVar.onComplete();
    }

    /* renamed from: a */
    public static void m55476a(Throwable th, C12280i0<?> i0Var) {
        i0Var.mo34123a((C12314c) INSTANCE);
        i0Var.onError(th);
    }

    /* renamed from: a */
    public static void m55472a(C12268f fVar) {
        fVar.mo41921a(INSTANCE);
        fVar.onComplete();
    }

    /* renamed from: a */
    public static void m55475a(Throwable th, C12268f fVar) {
        fVar.mo41921a(INSTANCE);
        fVar.onError(th);
    }

    /* renamed from: a */
    public static void m55477a(Throwable th, C12292n0<?> n0Var) {
        n0Var.mo41974a(INSTANCE);
        n0Var.onError(th);
    }

    /* renamed from: a */
    public static void m55478a(Throwable th, C12321v<?> vVar) {
        vVar.mo41931a(INSTANCE);
        vVar.onError(th);
    }

    /* renamed from: a */
    public boolean mo42104a(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
