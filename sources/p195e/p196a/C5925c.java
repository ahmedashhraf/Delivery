package p195e.p196a;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.p198t0.C5932a;
import p195e.p196a.p198t0.C5933b;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5939h;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p452c.C12394c;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p199x0.p453d.C12415h;
import p195e.p196a.p199x0.p453d.C12417j;
import p195e.p196a.p199x0.p453d.C12422o;
import p195e.p196a.p199x0.p454e.p455a.C12434a;
import p195e.p196a.p199x0.p454e.p455a.C12436a0;
import p195e.p196a.p199x0.p454e.p455a.C12438b;
import p195e.p196a.p199x0.p454e.p455a.C12440b0;
import p195e.p196a.p199x0.p454e.p455a.C12441c;
import p195e.p196a.p199x0.p454e.p455a.C12444c0;
import p195e.p196a.p199x0.p454e.p455a.C12446d;
import p195e.p196a.p199x0.p454e.p455a.C12448d0;
import p195e.p196a.p199x0.p454e.p455a.C12449e;
import p195e.p196a.p199x0.p454e.p455a.C12451e0;
import p195e.p196a.p199x0.p454e.p455a.C12453f;
import p195e.p196a.p199x0.p454e.p455a.C12455f0;
import p195e.p196a.p199x0.p454e.p455a.C12457g;
import p195e.p196a.p199x0.p454e.p455a.C12458g0;
import p195e.p196a.p199x0.p454e.p455a.C12460h;
import p195e.p196a.p199x0.p454e.p455a.C12464h0;
import p195e.p196a.p199x0.p454e.p455a.C12467i;
import p195e.p196a.p199x0.p454e.p455a.C12469i0;
import p195e.p196a.p199x0.p454e.p455a.C12471j;
import p195e.p196a.p199x0.p454e.p455a.C12473j0;
import p195e.p196a.p199x0.p454e.p455a.C12477k;
import p195e.p196a.p199x0.p454e.p455a.C12479k0;
import p195e.p196a.p199x0.p454e.p455a.C12481l;
import p195e.p196a.p199x0.p454e.p455a.C12483l0;
import p195e.p196a.p199x0.p454e.p455a.C12484m;
import p195e.p196a.p199x0.p454e.p455a.C12485m0;
import p195e.p196a.p199x0.p454e.p455a.C12487n;
import p195e.p196a.p199x0.p454e.p455a.C12488n0;
import p195e.p196a.p199x0.p454e.p455a.C12490o;
import p195e.p196a.p199x0.p454e.p455a.C12491o0;
import p195e.p196a.p199x0.p454e.p455a.C12493p;
import p195e.p196a.p199x0.p454e.p455a.C12494q;
import p195e.p196a.p199x0.p454e.p455a.C12495r;
import p195e.p196a.p199x0.p454e.p455a.C12497s;
import p195e.p196a.p199x0.p454e.p455a.C12499t;
import p195e.p196a.p199x0.p454e.p455a.C12500u;
import p195e.p196a.p199x0.p454e.p455a.C12502v;
import p195e.p196a.p199x0.p454e.p455a.C12503w;
import p195e.p196a.p199x0.p454e.p455a.C12505x;
import p195e.p196a.p199x0.p454e.p455a.C12506y;
import p195e.p196a.p199x0.p454e.p455a.C12509z;
import p195e.p196a.p199x0.p454e.p456b.C12676k0;
import p195e.p196a.p199x0.p454e.p457c.C13008j0;
import p195e.p196a.p199x0.p454e.p457c.C13034o;
import p195e.p196a.p199x0.p454e.p459e.C13234h0;
import p195e.p196a.p199x0.p454e.p461g.C13585g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12328d;
import p195e.p196a.p449w0.C12329e;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p449w0.C12342r;
import p195e.p196a.p467z0.C13796n;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.c */
/* compiled from: Completable */
public abstract class C5925c implements C5927i {
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26564a(C5927i... iVarArr) {
        C12390b.m55563a(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return m26589q();
        }
        if (iVarArr.length == 1) {
            return m26587g(iVarArr[0]);
        }
        return C12205a.m54863a((C5925c) new C12434a(iVarArr, null));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static C5925c m26571b(C5927i... iVarArr) {
        C12390b.m55563a(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return m26589q();
        }
        if (iVarArr.length == 1) {
            return m26587g(iVarArr[0]);
        }
        return C12205a.m54863a((C5925c) new C12446d(iVarArr));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static C5925c m26574c(C6007b<? extends C5927i> bVar) {
        return m26556a(bVar, 2);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public static C5925c m26581d(Callable<?> callable) {
        C12390b.m55563a(callable, "callable is null");
        return C12205a.m54863a((C5925c) new C12494q(callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: e */
    public static C5925c m26584e(C6007b<? extends C5927i> bVar) {
        return m26557a(bVar, Integer.MAX_VALUE, false);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: f */
    public static C5925c m26585f(C5927i iVar) {
        C12390b.m55563a(iVar, "source is null");
        if (!(iVar instanceof C5925c)) {
            return C12205a.m54863a((C5925c) new C12502v(iVar));
        }
        throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public static C5925c m26588g(C12325a aVar) {
        C12390b.m55563a(aVar, "run is null");
        return C12205a.m54863a((C5925c) new C12493p(aVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: q */
    public static C5925c m26589q() {
        return C12205a.m54863a(C12484m.f35765a);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: r */
    public static C5925c m26590r() {
        return C12205a.m54863a(C12448d0.f35680a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo24134b(C12268f fVar);

    @C5935d
    @C5939h("none")
    /* renamed from: h */
    public final C5925c mo24153h() {
        return mo24113a(C12351a.m55514b());
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: i */
    public final C5925c mo24154i() {
        return C12205a.m54863a((C5925c) new C12467i(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: j */
    public final C5925c mo24155j() {
        return m26579d((C6007b<T>) mo24159n().mo24245B());
    }

    @C5935d
    @C5939h("none")
    /* renamed from: k */
    public final C5925c mo24156k() {
        return m26579d((C6007b<T>) mo24159n().mo24250D());
    }

    @C5939h("none")
    /* renamed from: l */
    public final C12314c mo24157l() {
        C12422o oVar = new C12422o();
        mo24122a((C12268f) oVar);
        return oVar;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: m */
    public final C13796n<Void> mo24158m() {
        C13796n<Void> nVar = new C13796n<>();
        mo24122a((C12268f) nVar);
        return nVar;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: n */
    public final <T> C5929l<T> mo24159n() {
        if (this instanceof C12393b) {
            return ((C12393b) this).mo42139b();
        }
        return C12205a.m54871a((C5929l<T>) new C12483l0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: o */
    public final <T> C5931s<T> mo24160o() {
        if (this instanceof C12394c) {
            return ((C12394c) this).mo42140c();
        }
        return C12205a.m54873a((C5931s<T>) new C13008j0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: p */
    public final <T> C5923b0<T> mo24161p() {
        if (this instanceof C12395d) {
            return ((C12395d) this).mo42141a();
        }
        return C12205a.m54862a((C5923b0<T>) new C12485m0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static C5925c m26577c(Callable<? extends Throwable> callable) {
        C12390b.m55563a(callable, "errorSupplier is null");
        return C12205a.m54863a((C5925c) new C12490o(callable));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: e */
    public static C5925c m26583e(long j, TimeUnit timeUnit) {
        return m26573c(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: d */
    public static <T> C5925c m26579d(C6007b<T> bVar) {
        C12390b.m55563a(bVar, "publisher is null");
        return C12205a.m54863a((C5925c) new C12497s(bVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public static C5925c m26587g(C5927i iVar) {
        C12390b.m55563a(iVar, "source is null");
        if (iVar instanceof C5925c) {
            return C12205a.m54863a((C5925c) iVar);
        }
        return C12205a.m54863a((C5925c) new C12502v(iVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final Throwable mo24149e() {
        C12415h hVar = new C12415h();
        mo24122a((C12268f) hVar);
        return hVar.mo42156b();
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static C5925c m26578c(C5927i... iVarArr) {
        C12390b.m55563a(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return m26589q();
        }
        if (iVarArr.length == 1) {
            return m26587g(iVarArr[0]);
        }
        return C12205a.m54863a((C5925c) new C12509z(iVarArr));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public static C5925c m26582d(C5927i... iVarArr) {
        C12390b.m55563a(iVarArr, "sources is null");
        return C12205a.m54863a((C5925c) new C12436a0(iVarArr));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: f */
    public static C5925c m26586f(C6007b<? extends C5927i> bVar) {
        return m26557a(bVar, Integer.MAX_VALUE, true);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final C5925c mo24148e(C12325a aVar) {
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar2 = C12351a.f35503c;
        return m26555a(d, d2, aVar2, aVar, aVar2, aVar2);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: f */
    public final C5925c mo24150f() {
        return C12205a.m54863a((C5925c) new C12438b(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26558a(Iterable<? extends C5927i> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54863a((C5925c) new C12434a(null, iterable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static C5925c m26569b(Iterable<? extends C5927i> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54863a((C5925c) new C12449e(iterable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public static C5925c m26580d(Iterable<? extends C5927i> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54863a((C5925c) new C12440b0(iterable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final C5925c mo24147e(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26571b(iVar, this);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: f */
    public final C12314c mo24151f(C12325a aVar) {
        C12390b.m55563a(aVar, "onComplete is null");
        C12417j jVar = new C12417j(aVar);
        mo24122a((C12268f) jVar);
        return jVar;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public final C5925c mo24152g() {
        return C12205a.m54863a((C5925c) new C12503w(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static C5925c m26556a(C6007b<? extends C5927i> bVar, int i) {
        C12390b.m55563a(bVar, "sources is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54863a((C5925c) new C12441c(bVar, i));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static C5925c m26570b(Callable<? extends C5927i> callable) {
        C12390b.m55563a(callable, "completableSupplier");
        return C12205a.m54863a((C5925c) new C12457g(callable));
    }

    @C5939h("none")
    /* renamed from: d */
    public final void mo24146d() {
        C12415h hVar = new C12415h();
        mo24122a((C12268f) hVar);
        hVar.mo42153a();
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static C5925c m26576c(Iterable<? extends C5927i> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54863a((C5925c) new C12444c0(iterable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static <T> C5925c m26566b(C5926g0<T> g0Var) {
        C12390b.m55563a(g0Var, "observable is null");
        return C12205a.m54863a((C5925c) new C12495r(g0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26554a(C12277g gVar) {
        C12390b.m55563a(gVar, "source is null");
        return C12205a.m54863a((C5925c) new C12453f(gVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static C5925c m26575c(C6007b<? extends C5927i> bVar, int i) {
        return m26557a(bVar, i, true);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final C5925c mo24144d(C12325a aVar) {
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar2 = C12351a.f35503c;
        return m26555a(d, d2, aVar2, aVar2, aVar2, aVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static <T> C5925c m26567b(C5930q0<T> q0Var) {
        C12390b.m55563a(q0Var, "single is null");
        return C12205a.m54863a((C5925c) new C12500u(q0Var));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: c */
    public static C5925c m26573c(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54863a((C5925c) new C12479k0(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final C5925c mo24143d(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26578c(this, iVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26560a(Throwable th) {
        C12390b.m55563a(th, "error is null");
        return C12205a.m54863a((C5925c) new C12487n(th));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static C5925c m26568b(C6007b<? extends C5927i> bVar, int i) {
        return m26557a(bVar, i, false);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: d */
    public final C5925c mo24142d(long j, TimeUnit timeUnit) {
        return m26565b(j, timeUnit, C12228b.m55092a(), null);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26563a(Future<?> future) {
        C12390b.m55563a(future, "future is null");
        return m26588g(C12351a.m55493a(future));
    }

    /* renamed from: b */
    private static NullPointerException m26572b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5925c mo24136c(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26571b(this, iVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final <U> U mo24145d(C12339o<? super C5925c, U> oVar) {
        try {
            return ((C12339o) C12390b.m55563a(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            throw C13754k.m58724c(th);
        }
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static C5925c m26559a(Runnable runnable) {
        C12390b.m55563a(runnable, "run is null");
        return C12205a.m54863a((C5925c) new C12499t(runnable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24126b(C5927i iVar) {
        return mo24136c(iVar);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: c */
    public final C5925c mo24135c(long j, TimeUnit timeUnit) {
        return mo24103a(j, timeUnit, C12228b.m55092a(), false);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final Throwable mo24133b(long j, TimeUnit timeUnit) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12415h hVar = new C12415h();
        mo24122a((C12268f) hVar);
        return hVar.mo42157b(j, timeUnit);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5925c mo24138c(C12325a aVar) {
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar2 = C12351a.f35503c;
        return m26555a(d, d2, aVar, aVar2, aVar2, aVar2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    private static C5925c m26557a(C6007b<? extends C5927i> bVar, int i, boolean z) {
        C12390b.m55563a(bVar, "sources is null");
        C12390b.m55558a(i, "maxConcurrency");
        return C12205a.m54863a((C5925c) new C12506y(bVar, i, z));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5925c mo24139c(C12331g<? super C12314c> gVar) {
        C12331g d = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        return m26555a(gVar, d, aVar, aVar, aVar, aVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5925c mo24140c(C12339o<? super C5929l<Throwable>, ? extends C6007b<?>> oVar) {
        return m26579d((C6007b<T>) mo24159n().mo24243A(oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final <E extends C12268f> E mo24141c(E e) {
        mo24122a((C12268f) e);
        return e;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <R> C5925c m26561a(Callable<R> callable, C12339o<? super R, ? extends C5927i> oVar, C12331g<? super R> gVar) {
        return m26562a(callable, oVar, gVar, true);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24129b(C12331g<? super Throwable> gVar) {
        C12390b.m55563a(gVar, "onEvent is null");
        return C12205a.m54863a((C5925c) new C12481l(this, gVar));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: c */
    public final C5925c mo24137c(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54863a((C5925c) new C12471j(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <R> C5925c m26562a(Callable<R> callable, C12339o<? super R, ? extends C5927i> oVar, C12331g<? super R> gVar, boolean z) {
        C12390b.m55563a(callable, "resourceSupplier is null");
        C12390b.m55563a(oVar, "completableFunction is null");
        C12390b.m55563a(gVar, "disposer is null");
        return C12205a.m54863a((C5925c) new C12491o0(callable, oVar, gVar, z));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24128b(C12325a aVar) {
        C12390b.m55563a(aVar, "onFinally is null");
        return C12205a.m54863a((C5925c) new C12477k(this, aVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24130b(C12339o<? super C5929l<Object>, ? extends C6007b<?>> oVar) {
        return m26579d((C6007b<T>) mo24159n().mo24606y(oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24105a(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26564a(this, iVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24124b(long j) {
        return m26579d((C6007b<T>) mo24159n().mo24486e(j));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24131b(C12342r<? super Throwable> rVar) {
        return m26579d((C6007b<T>) mo24159n().mo24493e(rVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5923b0<T> mo24097a(C5926g0<T> g0Var) {
        C12390b.m55563a(g0Var, "next is null");
        return C12205a.m54862a((C5923b0<T>) new C13234h0<T>(g0Var, mo24161p()));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <T> C5929l<T> mo24132b(C6007b<T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return mo24159n().mo24555j(bVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <T> C5929l<T> mo24117a(C6007b<T> bVar) {
        C12390b.m55563a(bVar, "next is null");
        return C12205a.m54871a((C5929l<T>) new C12676k0<T>(bVar, mo24159n()));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: b */
    public final C5925c mo24127b(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54863a((C5925c) new C12469i0(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5928k0<T> mo24114a(C5930q0<T> q0Var) {
        C12390b.m55563a(q0Var, "next is null");
        return C12205a.m54870a((C5928k0<T>) new C13585g<T>(q0Var, this));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: b */
    public final C5925c mo24125b(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m26565b(j, timeUnit, j0Var, null);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: b */
    private C5925c m26565b(long j, TimeUnit timeUnit, C12282j0 j0Var, C5927i iVar) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12473j0 j0Var2 = new C12473j0(this, j, timeUnit, j0Var, iVar);
        return C12205a.m54863a((C5925c) j0Var2);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5931s<T> mo24118a(C5941y<T> yVar) {
        C12390b.m55563a(yVar, "next is null");
        return C12205a.m54873a((C5931s<T>) new C13034o<T>(yVar, this));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <R> R mo24121a(@C5937f C12225d<? extends R> dVar) {
        return ((C12225d) C12390b.m55563a(dVar, "converter is null")).mo41859a(this);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final boolean mo24123a(long j, TimeUnit timeUnit) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12415h hVar = new C12415h();
        mo24122a((C12268f) hVar);
        return hVar.mo42155a(j, timeUnit);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24107a(C12281j jVar) {
        return m26587g(((C12281j) C12390b.m55563a(jVar, "transformer is null")).mo42019a(this));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5925c mo24101a(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24103a(j, timeUnit, j0Var, false);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5925c mo24103a(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12460h hVar = new C12460h(this, j, timeUnit, j0Var, z);
        return C12205a.m54863a((C5925c) hVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24111a(C12331g<? super Throwable> gVar) {
        C12331g d = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        return m26555a(d, gVar, aVar, aVar, aVar, aVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    private C5925c m26555a(C12331g<? super C12314c> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2, C12325a aVar3, C12325a aVar4) {
        C12390b.m55563a(gVar, "onSubscribe is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        C12390b.m55563a(aVar2, "onTerminate is null");
        C12390b.m55563a(aVar3, "onAfterTerminate is null");
        C12390b.m55563a(aVar4, "onDispose is null");
        C12458g0 g0Var = new C12458g0(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4);
        return C12205a.m54863a((C5925c) g0Var);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24108a(C12325a aVar) {
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar2 = C12351a.f35503c;
        return m26555a(d, d2, aVar2, aVar2, aVar, aVar2);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24104a(C12278h hVar) {
        C12390b.m55563a(hVar, "onLift is null");
        return C12205a.m54863a((C5925c) new C12505x(this, hVar));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5925c mo24106a(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54863a((C5925c) new C12451e0(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24113a(C12342r<? super Throwable> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54863a((C5925c) new C12455f0(this, rVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24112a(C12339o<? super Throwable, ? extends C5927i> oVar) {
        C12390b.m55563a(oVar, "errorMapper is null");
        return C12205a.m54863a((C5925c) new C12464h0(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24098a(long j) {
        return m26579d((C6007b<T>) mo24159n().mo24468d(j));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24110a(C12329e eVar) {
        return m26579d((C6007b<T>) mo24159n().mo24326a(eVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24109a(C12328d<? super Integer, ? super Throwable> dVar) {
        return m26579d((C6007b<T>) mo24159n().mo24420b(dVar));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5925c mo24099a(long j, C12342r<? super Throwable> rVar) {
        return m26579d((C6007b<T>) mo24159n().mo24299a(j, rVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5923b0<T> mo24096a(C5923b0<T> b0Var) {
        C12390b.m55563a(b0Var, "other is null");
        return b0Var.mo23947c((C5926g0<? extends T>) mo24161p());
    }

    @C5939h("none")
    /* renamed from: a */
    public final void mo24122a(C12268f fVar) {
        C12390b.m55563a(fVar, "s is null");
        try {
            mo24134b(C12205a.m54864a(this, fVar));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
            throw m26572b(th);
        }
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C12314c mo24119a(C12325a aVar, C12331g<? super Throwable> gVar) {
        C12390b.m55563a(gVar, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        C12417j jVar = new C12417j(gVar, aVar);
        mo24122a((C12268f) jVar);
        return jVar;
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: a */
    public final C5925c mo24100a(long j, TimeUnit timeUnit, C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26565b(j, timeUnit, C12228b.m55092a(), iVar);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5925c mo24102a(long j, TimeUnit timeUnit, C12282j0 j0Var, C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return m26565b(j, timeUnit, j0Var, iVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5928k0<T> mo24116a(Callable<? extends T> callable) {
        C12390b.m55563a(callable, "completionValueSupplier is null");
        return C12205a.m54870a((C5928k0<T>) new C12488n0<T>(this, callable, null));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <T> C5928k0<T> mo24115a(T t) {
        C12390b.m55563a(t, "completionValue is null");
        return C12205a.m54870a((C5928k0<T>) new C12488n0<T>(this, null, t));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C13796n<Void> mo24120a(boolean z) {
        C13796n<Void> nVar = new C13796n<>();
        if (z) {
            nVar.cancel();
        }
        mo24122a((C12268f) nVar);
        return nVar;
    }
}
