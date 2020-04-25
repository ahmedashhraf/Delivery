package p195e.p196a.p439b1;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.C5923b0;
import p195e.p196a.C5925c;
import p195e.p196a.C5928k0;
import p195e.p196a.C5929l;
import p195e.p196a.C5931s;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p198t0.C5934c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p463g.C13665b;
import p195e.p196a.p199x0.p463g.C13679g;
import p195e.p196a.p199x0.p463g.C13683h;
import p195e.p196a.p199x0.p463g.C13705r;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12329e;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p466y0.C13772a;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.CompositeException;
import p212io.reactivex.exceptions.MissingBackpressureException;
import p212io.reactivex.exceptions.OnErrorNotImplementedException;
import p212io.reactivex.exceptions.UndeliverableException;

/* renamed from: e.a.b1.a */
/* compiled from: RxJavaPlugins */
public final class C12205a {
    @C5938g

    /* renamed from: a */
    static volatile C12331g<? super Throwable> f35225a;
    @C5938g

    /* renamed from: b */
    static volatile C12339o<? super Runnable, ? extends Runnable> f35226b;
    @C5938g

    /* renamed from: c */
    static volatile C12339o<? super Callable<C12282j0>, ? extends C12282j0> f35227c;
    @C5938g

    /* renamed from: d */
    static volatile C12339o<? super Callable<C12282j0>, ? extends C12282j0> f35228d;
    @C5938g

    /* renamed from: e */
    static volatile C12339o<? super Callable<C12282j0>, ? extends C12282j0> f35229e;
    @C5938g

    /* renamed from: f */
    static volatile C12339o<? super Callable<C12282j0>, ? extends C12282j0> f35230f;
    @C5938g

    /* renamed from: g */
    static volatile C12339o<? super C12282j0, ? extends C12282j0> f35231g;
    @C5938g

    /* renamed from: h */
    static volatile C12339o<? super C12282j0, ? extends C12282j0> f35232h;
    @C5938g

    /* renamed from: i */
    static volatile C12339o<? super C12282j0, ? extends C12282j0> f35233i;
    @C5938g

    /* renamed from: j */
    static volatile C12339o<? super C12282j0, ? extends C12282j0> f35234j;
    @C5938g

    /* renamed from: k */
    static volatile C12339o<? super C5929l, ? extends C5929l> f35235k;
    @C5938g

    /* renamed from: l */
    static volatile C12339o<? super C12322a, ? extends C12322a> f35236l;
    @C5938g

    /* renamed from: m */
    static volatile C12339o<? super C5923b0, ? extends C5923b0> f35237m;
    @C5938g

    /* renamed from: n */
    static volatile C12339o<? super C13772a, ? extends C13772a> f35238n;
    @C5938g

    /* renamed from: o */
    static volatile C12339o<? super C5931s, ? extends C5931s> f35239o;
    @C5938g

    /* renamed from: p */
    static volatile C12339o<? super C5928k0, ? extends C5928k0> f35240p;
    @C5938g

    /* renamed from: q */
    static volatile C12339o<? super C5925c, ? extends C5925c> f35241q;
    @C5938g

    /* renamed from: r */
    static volatile C12339o<? super C5922b, ? extends C5922b> f35242r;
    @C5938g

    /* renamed from: s */
    static volatile C12327c<? super C5929l, ? super C14062c, ? extends C14062c> f35243s;
    @C5938g

    /* renamed from: t */
    static volatile C12327c<? super C5931s, ? super C12321v, ? extends C12321v> f35244t;
    @C5938g

    /* renamed from: u */
    static volatile C12327c<? super C5923b0, ? super C12280i0, ? extends C12280i0> f35245u;
    @C5938g

    /* renamed from: v */
    static volatile C12327c<? super C5928k0, ? super C12292n0, ? extends C12292n0> f35246v;
    @C5938g

    /* renamed from: w */
    static volatile C12327c<? super C5925c, ? super C12268f, ? extends C12268f> f35247w;
    @C5938g

    /* renamed from: x */
    static volatile C12329e f35248x;

    /* renamed from: y */
    static volatile boolean f35249y;

    /* renamed from: z */
    static volatile boolean f35250z;

    private C12205a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: A */
    public static void m54857A() {
        f35249y = true;
    }

    /* renamed from: B */
    public static boolean m54858B() {
        C12329e eVar = f35248x;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo42090a();
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    /* renamed from: C */
    public static void m54859C() {
        m54884a(null);
        m54933p(null);
        m54885a(null);
        m54893b(null);
        m54913f(null);
        m54900c(null);
        m54935q(null);
        m54911e(null);
        m54915g(null);
        m54907d(null);
        m54923k(null);
        m54892b(null);
        m54927m(null);
        m54906d(null);
        m54931o(null);
        m54910e(null);
        m54917h(null);
        m54882a(null);
        m54919i(null);
        m54921j(null);
        m54925l(null);
        m54899c(null);
        m54929n(null);
        m54886a(false);
        m54883a((C12329e) null);
    }

    /* renamed from: D */
    static void m54860D() {
        f35249y = false;
    }

    /* renamed from: a */
    public static void m54886a(boolean z) {
        if (!f35249y) {
            f35250z = z;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5938g
    /* renamed from: b */
    public static C12331g<? super Throwable> m54891b() {
        return f35225a;
    }

    @C5938g
    /* renamed from: c */
    public static C12339o<? super Callable<C12282j0>, ? extends C12282j0> m54898c() {
        return f35227c;
    }

    @C5938g
    /* renamed from: d */
    public static C12339o<? super Callable<C12282j0>, ? extends C12282j0> m54905d() {
        return f35229e;
    }

    @C5938g
    /* renamed from: e */
    public static C12339o<? super Callable<C12282j0>, ? extends C12282j0> m54909e() {
        return f35230f;
    }

    @C5938g
    /* renamed from: f */
    public static C12339o<? super Callable<C12282j0>, ? extends C12282j0> m54912f() {
        return f35228d;
    }

    @C5938g
    /* renamed from: g */
    public static C12339o<? super C12282j0, ? extends C12282j0> m54914g() {
        return f35233i;
    }

    @C5938g
    /* renamed from: h */
    public static C12339o<? super C12282j0, ? extends C12282j0> m54916h() {
        return f35234j;
    }

    /* renamed from: i */
    public static void m54919i(@C5938g C12339o<? super C12322a, ? extends C12322a> oVar) {
        if (!f35249y) {
            f35236l = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5938g
    /* renamed from: j */
    public static C12339o<? super C5925c, ? extends C5925c> m54920j() {
        return f35241q;
    }

    @C5938g
    /* renamed from: k */
    public static C12327c<? super C5925c, ? super C12268f, ? extends C12268f> m54922k() {
        return f35247w;
    }

    @C5938g
    /* renamed from: l */
    public static C12339o<? super C12322a, ? extends C12322a> m54924l() {
        return f35236l;
    }

    @C5938g
    /* renamed from: m */
    public static C12339o<? super C13772a, ? extends C13772a> m54926m() {
        return f35238n;
    }

    @C5938g
    /* renamed from: n */
    public static C12339o<? super C5929l, ? extends C5929l> m54928n() {
        return f35235k;
    }

    @C5938g
    /* renamed from: o */
    public static C12327c<? super C5929l, ? super C14062c, ? extends C14062c> m54930o() {
        return f35243s;
    }

    /* renamed from: p */
    public static void m54933p(@C5938g C12339o<? super Runnable, ? extends Runnable> oVar) {
        if (!f35249y) {
            f35226b = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: q */
    public static void m54935q(@C5938g C12339o<? super C12282j0, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35232h = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5938g
    /* renamed from: r */
    public static C12339o<? super C5923b0, ? extends C5923b0> m54936r() {
        return f35237m;
    }

    @C5938g
    /* renamed from: s */
    public static C12327c<? super C5923b0, ? super C12280i0, ? extends C12280i0> m54937s() {
        return f35245u;
    }

    @C5934c
    @C5938g
    /* renamed from: t */
    public static C12339o<? super C5922b, ? extends C5922b> m54938t() {
        return f35242r;
    }

    @C5938g
    /* renamed from: u */
    public static C12339o<? super C5928k0, ? extends C5928k0> m54939u() {
        return f35240p;
    }

    @C5938g
    /* renamed from: v */
    public static C12327c<? super C5928k0, ? super C12292n0, ? extends C12292n0> m54940v() {
        return f35246v;
    }

    @C5938g
    /* renamed from: w */
    public static C12339o<? super Runnable, ? extends Runnable> m54941w() {
        return f35226b;
    }

    @C5938g
    /* renamed from: x */
    public static C12339o<? super C12282j0, ? extends C12282j0> m54942x() {
        return f35232h;
    }

    /* renamed from: y */
    public static boolean m54943y() {
        return f35250z;
    }

    /* renamed from: z */
    public static boolean m54944z() {
        return f35249y;
    }

    @C5937f
    /* renamed from: b */
    public static C12282j0 m54889b(@C5937f Callable<C12282j0> callable) {
        C12390b.m55563a(callable, "Scheduler Callable can't be null");
        C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar = f35227c;
        if (oVar == null) {
            return m54868a(callable);
        }
        return m54867a(oVar, callable);
    }

    @C5937f
    /* renamed from: c */
    public static C12282j0 m54896c(@C5937f Callable<C12282j0> callable) {
        C12390b.m55563a(callable, "Scheduler Callable can't be null");
        C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar = f35229e;
        if (oVar == null) {
            return m54868a(callable);
        }
        return m54867a(oVar, callable);
    }

    @C5937f
    /* renamed from: d */
    public static C12282j0 m54903d(@C5937f Callable<C12282j0> callable) {
        C12390b.m55563a(callable, "Scheduler Callable can't be null");
        C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar = f35230f;
        if (oVar == null) {
            return m54868a(callable);
        }
        return m54867a(oVar, callable);
    }

    @C5937f
    /* renamed from: e */
    public static C12282j0 m54908e(@C5937f Callable<C12282j0> callable) {
        C12390b.m55563a(callable, "Scheduler Callable can't be null");
        C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar = f35228d;
        if (oVar == null) {
            return m54868a(callable);
        }
        return m54867a(oVar, callable);
    }

    /* renamed from: f */
    public static void m54913f(@C5938g C12339o<? super C12282j0, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35233i = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: g */
    public static void m54915g(@C5938g C12339o<? super C12282j0, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35234j = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: h */
    public static void m54917h(@C5938g C12339o<? super C5925c, ? extends C5925c> oVar) {
        if (!f35249y) {
            f35241q = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: j */
    public static void m54921j(@C5938g C12339o<? super C13772a, ? extends C13772a> oVar) {
        if (!f35249y) {
            f35238n = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: k */
    public static void m54923k(@C5938g C12339o<? super C5929l, ? extends C5929l> oVar) {
        if (!f35249y) {
            f35235k = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: l */
    public static void m54925l(@C5938g C12339o<? super C5931s, ? extends C5931s> oVar) {
        if (!f35249y) {
            f35239o = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: m */
    public static void m54927m(@C5938g C12339o<? super C5923b0, ? extends C5923b0> oVar) {
        if (!f35249y) {
            f35237m = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5934c
    /* renamed from: n */
    public static void m54929n(@C5938g C12339o<? super C5922b, ? extends C5922b> oVar) {
        if (!f35249y) {
            f35242r = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: o */
    public static void m54931o(@C5938g C12339o<? super C5928k0, ? extends C5928k0> oVar) {
        if (!f35249y) {
            f35240p = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5938g
    /* renamed from: a */
    public static C12339o<? super C12282j0, ? extends C12282j0> m54876a() {
        return f35231g;
    }

    @C5938g
    /* renamed from: i */
    public static C12329e m54918i() {
        return f35248x;
    }

    @C5938g
    /* renamed from: p */
    public static C12339o<? super C5931s, ? extends C5931s> m54932p() {
        return f35239o;
    }

    @C5938g
    /* renamed from: q */
    public static C12327c<? super C5931s, ? super C12321v, ? extends C12321v> m54934q() {
        return f35244t;
    }

    @C5937f
    /* renamed from: a */
    public static C12282j0 m54866a(@C5937f C12282j0 j0Var) {
        C12339o<? super C12282j0, ? extends C12282j0> oVar = f35231g;
        if (oVar == null) {
            return j0Var;
        }
        return (C12282j0) m54880a(oVar, (T) j0Var);
    }

    /* renamed from: b */
    public static void m54894b(@C5937f Throwable th) {
        C12331g<? super Throwable> gVar = f35225a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m54887a(th)) {
            th = new UndeliverableException(th);
        }
        if (gVar != null) {
            try {
                gVar.mo33410c(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m54901c(th2);
            }
        }
        th.printStackTrace();
        m54901c(th);
    }

    /* renamed from: c */
    static void m54901c(@C5937f Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @C5937f
    /* renamed from: d */
    public static C12282j0 m54902d(@C5937f C12282j0 j0Var) {
        C12339o<? super C12282j0, ? extends C12282j0> oVar = f35232h;
        if (oVar == null) {
            return j0Var;
        }
        return (C12282j0) m54880a(oVar, (T) j0Var);
    }

    /* renamed from: e */
    public static void m54911e(@C5938g C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35228d = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    static boolean m54887a(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m54907d(@C5938g C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35230f = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: c */
    public static C12282j0 m54895c(@C5937f C12282j0 j0Var) {
        C12339o<? super C12282j0, ? extends C12282j0> oVar = f35234j;
        if (oVar == null) {
            return j0Var;
        }
        return (C12282j0) m54880a(oVar, (T) j0Var);
    }

    /* renamed from: e */
    public static void m54910e(@C5938g C12327c<? super C5928k0, ? super C12292n0, ? extends C12292n0> cVar) {
        if (!f35249y) {
            f35246v = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: c */
    public static void m54900c(@C5938g C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35229e = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: d */
    public static void m54906d(@C5938g C12327c<? super C5923b0, ? super C12280i0, ? extends C12280i0> cVar) {
        if (!f35249y) {
            f35245u = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: a */
    public static Runnable m54881a(@C5937f Runnable runnable) {
        C12390b.m55563a(runnable, "run is null");
        C12339o<? super Runnable, ? extends Runnable> oVar = f35226b;
        if (oVar == null) {
            return runnable;
        }
        return (Runnable) m54880a(oVar, (T) runnable);
    }

    /* renamed from: c */
    public static void m54899c(@C5938g C12327c<? super C5931s, C12321v, ? extends C12321v> cVar) {
        if (!f35249y) {
            f35244t = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: d */
    public static C12282j0 m54904d(@C5937f ThreadFactory threadFactory) {
        return new C13705r((ThreadFactory) C12390b.m55563a(threadFactory, "threadFactory is null"));
    }

    @C5937f
    /* renamed from: b */
    public static C12282j0 m54888b(@C5937f C12282j0 j0Var) {
        C12339o<? super C12282j0, ? extends C12282j0> oVar = f35233i;
        if (oVar == null) {
            return j0Var;
        }
        return (C12282j0) m54880a(oVar, (T) j0Var);
    }

    /* renamed from: a */
    public static void m54885a(@C5938g C12339o<? super C12282j0, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35231g = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: b */
    public static void m54893b(@C5938g C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar) {
        if (!f35249y) {
            f35227c = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: c */
    public static C12282j0 m54897c(@C5937f ThreadFactory threadFactory) {
        return new C13683h((ThreadFactory) C12390b.m55563a(threadFactory, "threadFactory is null"));
    }

    /* renamed from: a */
    public static void m54884a(@C5938g C12331g<? super Throwable> gVar) {
        if (!f35249y) {
            f35225a = gVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: b */
    public static void m54892b(@C5938g C12327c<? super C5929l, ? super C14062c, ? extends C14062c> cVar) {
        if (!f35249y) {
            f35243s = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static void m54882a(@C5938g C12327c<? super C5925c, ? super C12268f, ? extends C12268f> cVar) {
        if (!f35249y) {
            f35247w = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: b */
    public static C12282j0 m54890b(@C5937f ThreadFactory threadFactory) {
        return new C13679g((ThreadFactory) C12390b.m55563a(threadFactory, "threadFactory is null"));
    }

    @C5937f
    /* renamed from: a */
    public static <T> C14062c<? super T> m54878a(@C5937f C5929l<T> lVar, @C5937f C14062c<? super T> cVar) {
        C12327c<? super C5929l, ? super C14062c, ? extends C14062c> cVar2 = f35243s;
        return cVar2 != null ? (C14062c) m54879a(cVar2, lVar, cVar) : cVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12280i0<? super T> m54865a(@C5937f C5923b0<T> b0Var, @C5937f C12280i0<? super T> i0Var) {
        C12327c<? super C5923b0, ? super C12280i0, ? extends C12280i0> cVar = f35245u;
        return cVar != null ? (C12280i0) m54879a(cVar, b0Var, i0Var) : i0Var;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12292n0<? super T> m54872a(@C5937f C5928k0<T> k0Var, @C5937f C12292n0<? super T> n0Var) {
        C12327c<? super C5928k0, ? super C12292n0, ? extends C12292n0> cVar = f35246v;
        return cVar != null ? (C12292n0) m54879a(cVar, k0Var, n0Var) : n0Var;
    }

    @C5937f
    /* renamed from: a */
    public static C12268f m54864a(@C5937f C5925c cVar, @C5937f C12268f fVar) {
        C12327c<? super C5925c, ? super C12268f, ? extends C12268f> cVar2 = f35247w;
        return cVar2 != null ? (C12268f) m54879a(cVar2, cVar, fVar) : fVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12321v<? super T> m54875a(@C5937f C5931s<T> sVar, @C5937f C12321v<? super T> vVar) {
        C12327c<? super C5931s, ? super C12321v, ? extends C12321v> cVar = f35244t;
        return cVar != null ? (C12321v) m54879a(cVar, sVar, vVar) : vVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C5931s<T> m54873a(@C5937f C5931s<T> sVar) {
        C12339o<? super C5931s, ? extends C5931s> oVar = f35239o;
        return oVar != null ? (C5931s) m54880a(oVar, (T) sVar) : sVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C5929l<T> m54871a(@C5937f C5929l<T> lVar) {
        C12339o<? super C5929l, ? extends C5929l> oVar = f35235k;
        return oVar != null ? (C5929l) m54880a(oVar, (T) lVar) : lVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C12322a<T> m54874a(@C5937f C12322a<T> aVar) {
        C12339o<? super C12322a, ? extends C12322a> oVar = f35236l;
        return oVar != null ? (C12322a) m54880a(oVar, (T) aVar) : aVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C5923b0<T> m54862a(@C5937f C5923b0<T> b0Var) {
        C12339o<? super C5923b0, ? extends C5923b0> oVar = f35237m;
        return oVar != null ? (C5923b0) m54880a(oVar, (T) b0Var) : b0Var;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C13772a<T> m54877a(@C5937f C13772a<T> aVar) {
        C12339o<? super C13772a, ? extends C13772a> oVar = f35238n;
        return oVar != null ? (C13772a) m54880a(oVar, (T) aVar) : aVar;
    }

    @C5937f
    /* renamed from: a */
    public static <T> C5928k0<T> m54870a(@C5937f C5928k0<T> k0Var) {
        C12339o<? super C5928k0, ? extends C5928k0> oVar = f35240p;
        return oVar != null ? (C5928k0) m54880a(oVar, (T) k0Var) : k0Var;
    }

    @C5937f
    /* renamed from: a */
    public static C5925c m54863a(@C5937f C5925c cVar) {
        C12339o<? super C5925c, ? extends C5925c> oVar = f35241q;
        return oVar != null ? (C5925c) m54880a(oVar, (T) cVar) : cVar;
    }

    @C5934c
    @C5937f
    /* renamed from: a */
    public static <T> C5922b<T> m54861a(@C5937f C5922b<T> bVar) {
        C12339o<? super C5922b, ? extends C5922b> oVar = f35242r;
        return oVar != null ? (C5922b) m54880a(oVar, (T) bVar) : bVar;
    }

    /* renamed from: a */
    public static void m54883a(@C5938g C12329e eVar) {
        if (!f35249y) {
            f35248x = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @C5937f
    /* renamed from: a */
    public static C12282j0 m54869a(@C5937f ThreadFactory threadFactory) {
        return new C13665b((ThreadFactory) C12390b.m55563a(threadFactory, "threadFactory is null"));
    }

    @C5937f
    /* renamed from: a */
    static <T, R> R m54880a(@C5937f C12339o<T, R> oVar, @C5937f T t) {
        try {
            return oVar.apply(t);
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    @C5937f
    /* renamed from: a */
    static <T, U, R> R m54879a(@C5937f C12327c<T, U, R> cVar, @C5937f T t, @C5937f U u) {
        try {
            return cVar.mo35569a(t, u);
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    @C5937f
    /* renamed from: a */
    static C12282j0 m54868a(@C5937f Callable<C12282j0> callable) {
        try {
            return (C12282j0) C12390b.m55563a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    @C5937f
    /* renamed from: a */
    static C12282j0 m54867a(@C5937f C12339o<? super Callable<C12282j0>, ? extends C12282j0> oVar, Callable<C12282j0> callable) {
        return (C12282j0) C12390b.m55563a(m54880a(oVar, (T) callable), "Scheduler Callable result can't be null");
    }
}
