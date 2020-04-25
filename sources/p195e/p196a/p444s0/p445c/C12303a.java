package p195e.p196a.p444s0.p445c;

import java.util.concurrent.Callable;
import p195e.p196a.C12282j0;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.s0.c.a */
/* compiled from: RxAndroidPlugins */
public final class C12303a {

    /* renamed from: a */
    private static volatile C12339o<Callable<C12282j0>, C12282j0> f35484a;

    /* renamed from: b */
    private static volatile C12339o<C12282j0, C12282j0> f35485b;

    private C12303a() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static void m55385a(C12339o<Callable<C12282j0>, C12282j0> oVar) {
        f35484a = oVar;
    }

    /* renamed from: b */
    public static C12282j0 m55386b(Callable<C12282j0> callable) {
        if (callable != null) {
            C12339o<Callable<C12282j0>, C12282j0> oVar = f35484a;
            if (oVar == null) {
                return m55382a(callable);
            }
            return m55381a(oVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: c */
    public static void m55389c() {
        m55385a(null);
        m55388b(null);
    }

    /* renamed from: a */
    public static C12282j0 m55380a(C12282j0 j0Var) {
        if (j0Var != null) {
            C12339o<C12282j0, C12282j0> oVar = f35485b;
            if (oVar == null) {
                return j0Var;
            }
            return (C12282j0) m55384a(oVar, (T) j0Var);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public static C12339o<Callable<C12282j0>, C12282j0> m55383a() {
        return f35484a;
    }

    /* renamed from: b */
    public static void m55388b(C12339o<C12282j0, C12282j0> oVar) {
        f35485b = oVar;
    }

    /* renamed from: a */
    static C12282j0 m55382a(Callable<C12282j0> callable) {
        try {
            C12282j0 j0Var = (C12282j0) callable.call();
            if (j0Var != null) {
                return j0Var;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C14398a.m62356a(th);
        }
    }

    /* renamed from: b */
    public static C12339o<C12282j0, C12282j0> m55387b() {
        return f35485b;
    }

    /* renamed from: a */
    static C12282j0 m55381a(C12339o<Callable<C12282j0>, C12282j0> oVar, Callable<C12282j0> callable) {
        C12282j0 j0Var = (C12282j0) m55384a(oVar, (T) callable);
        if (j0Var != null) {
            return j0Var;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    static <T, R> R m55384a(C12339o<T, R> oVar, T t) {
        try {
            return oVar.apply(t);
        } catch (Throwable th) {
            throw C14398a.m62356a(th);
        }
    }
}
