package p195e.p196a.p441d1;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p195e.p196a.C12282j0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p463g.C13665b;
import p195e.p196a.p199x0.p463g.C13670d;
import p195e.p196a.p199x0.p463g.C13679g;
import p195e.p196a.p199x0.p463g.C13683h;
import p195e.p196a.p199x0.p463g.C13693p;
import p195e.p196a.p199x0.p463g.C13705r;
import p195e.p196a.p199x0.p463g.C13707s;
import p195e.p196a.p439b1.C12205a;

/* renamed from: e.a.d1.b */
/* compiled from: Schedulers */
public final class C12228b {
    @C5937f

    /* renamed from: a */
    static final C12282j0 f35331a = C12205a.m54908e((Callable<C12282j0>) new C12236h<C12282j0>());
    @C5937f

    /* renamed from: b */
    static final C12282j0 f35332b = C12205a.m54889b((Callable<C12282j0>) new C12230b<C12282j0>());
    @C5937f

    /* renamed from: c */
    static final C12282j0 f35333c = C12205a.m54896c((Callable<C12282j0>) new C12231c<C12282j0>());
    @C5937f

    /* renamed from: d */
    static final C12282j0 f35334d = C13707s.m58559f();
    @C5937f

    /* renamed from: e */
    static final C12282j0 f35335e = C12205a.m54903d((Callable<C12282j0>) new C12234f<C12282j0>());

    /* renamed from: e.a.d1.b$a */
    /* compiled from: Schedulers */
    static final class C12229a {

        /* renamed from: a */
        static final C12282j0 f35336a = new C13665b();

        C12229a() {
        }
    }

    /* renamed from: e.a.d1.b$b */
    /* compiled from: Schedulers */
    static final class C12230b implements Callable<C12282j0> {
        C12230b() {
        }

        public C12282j0 call() throws Exception {
            return C12229a.f35336a;
        }
    }

    /* renamed from: e.a.d1.b$c */
    /* compiled from: Schedulers */
    static final class C12231c implements Callable<C12282j0> {
        C12231c() {
        }

        public C12282j0 call() throws Exception {
            return C12232d.f35337a;
        }
    }

    /* renamed from: e.a.d1.b$d */
    /* compiled from: Schedulers */
    static final class C12232d {

        /* renamed from: a */
        static final C12282j0 f35337a = new C13679g();

        C12232d() {
        }
    }

    /* renamed from: e.a.d1.b$e */
    /* compiled from: Schedulers */
    static final class C12233e {

        /* renamed from: a */
        static final C12282j0 f35338a = new C13683h();

        C12233e() {
        }
    }

    /* renamed from: e.a.d1.b$f */
    /* compiled from: Schedulers */
    static final class C12234f implements Callable<C12282j0> {
        C12234f() {
        }

        public C12282j0 call() throws Exception {
            return C12233e.f35338a;
        }
    }

    /* renamed from: e.a.d1.b$g */
    /* compiled from: Schedulers */
    static final class C12235g {

        /* renamed from: a */
        static final C12282j0 f35339a = new C13705r();

        C12235g() {
        }
    }

    /* renamed from: e.a.d1.b$h */
    /* compiled from: Schedulers */
    static final class C12236h implements Callable<C12282j0> {
        C12236h() {
        }

        public C12282j0 call() throws Exception {
            return C12235g.f35339a;
        }
    }

    private C12228b() {
        throw new IllegalStateException("No instances!");
    }

    @C5937f
    /* renamed from: a */
    public static C12282j0 m55092a() {
        return C12205a.m54866a(f35332b);
    }

    @C5937f
    /* renamed from: b */
    public static C12282j0 m55094b() {
        return C12205a.m54888b(f35333c);
    }

    @C5937f
    /* renamed from: c */
    public static C12282j0 m55095c() {
        return C12205a.m54895c(f35335e);
    }

    /* renamed from: d */
    public static void m55096d() {
        m55092a().mo42024b();
        m55094b().mo42024b();
        m55095c().mo42024b();
        m55097e().mo42024b();
        m55099g().mo42024b();
        C13693p.m58533a();
    }

    @C5937f
    /* renamed from: e */
    public static C12282j0 m55097e() {
        return C12205a.m54902d(f35331a);
    }

    /* renamed from: f */
    public static void m55098f() {
        m55092a().mo42025c();
        m55094b().mo42025c();
        m55095c().mo42025c();
        m55097e().mo42025c();
        m55099g().mo42025c();
        C13693p.m58536b();
    }

    @C5937f
    /* renamed from: g */
    public static C12282j0 m55099g() {
        return f35334d;
    }

    @C5937f
    /* renamed from: a */
    public static C12282j0 m55093a(@C5937f Executor executor) {
        return new C13670d(executor);
    }
}
