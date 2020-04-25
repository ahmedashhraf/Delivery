package p195e.p196a;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.p198t0.C5932a;
import p195e.p196a.p198t0.C5933b;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5939h;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12393b;
import p195e.p196a.p199x0.p452c.C12394c;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p199x0.p453d.C12411d;
import p195e.p196a.p199x0.p453d.C12415h;
import p195e.p196a.p199x0.p453d.C12418k;
import p195e.p196a.p199x0.p453d.C12425r;
import p195e.p196a.p199x0.p454e.p455a.C12483l0;
import p195e.p196a.p199x0.p454e.p455a.C12500u;
import p195e.p196a.p199x0.p454e.p456b.C12557d1;
import p195e.p196a.p199x0.p454e.p456b.C12798r3;
import p195e.p196a.p199x0.p454e.p456b.C12886w;
import p195e.p196a.p199x0.p454e.p456b.C12929z;
import p195e.p196a.p199x0.p454e.p457c.C13024m0;
import p195e.p196a.p199x0.p454e.p457c.C13084y;
import p195e.p196a.p199x0.p454e.p459e.C13194e3;
import p195e.p196a.p199x0.p454e.p459e.C13440v;
import p195e.p196a.p199x0.p454e.p461g.C13559a;
import p195e.p196a.p199x0.p454e.p461g.C13561a0;
import p195e.p196a.p199x0.p454e.p461g.C13562b;
import p195e.p196a.p199x0.p454e.p461g.C13564b0;
import p195e.p196a.p199x0.p454e.p461g.C13566c;
import p195e.p196a.p199x0.p454e.p461g.C13568c0;
import p195e.p196a.p199x0.p454e.p461g.C13569d;
import p195e.p196a.p199x0.p454e.p461g.C13571d0;
import p195e.p196a.p199x0.p454e.p461g.C13573e;
import p195e.p196a.p199x0.p454e.p461g.C13574e0;
import p195e.p196a.p199x0.p454e.p461g.C13580f;
import p195e.p196a.p199x0.p454e.p461g.C13584f0;
import p195e.p196a.p199x0.p454e.p461g.C13585g;
import p195e.p196a.p199x0.p454e.p461g.C13587g0;
import p195e.p196a.p199x0.p454e.p461g.C13588h;
import p195e.p196a.p199x0.p454e.p461g.C13590h0;
import p195e.p196a.p199x0.p454e.p461g.C13592i;
import p195e.p196a.p199x0.p454e.p461g.C13594i0;
import p195e.p196a.p199x0.p454e.p461g.C13595j;
import p195e.p196a.p199x0.p454e.p461g.C13597j0;
import p195e.p196a.p199x0.p454e.p461g.C13599k;
import p195e.p196a.p199x0.p454e.p461g.C13601k0;
import p195e.p196a.p199x0.p454e.p461g.C13603l;
import p195e.p196a.p199x0.p454e.p461g.C13605l0;
import p195e.p196a.p199x0.p454e.p461g.C13607m;
import p195e.p196a.p199x0.p454e.p461g.C13609m0;
import p195e.p196a.p199x0.p454e.p461g.C13611n;
import p195e.p196a.p199x0.p454e.p461g.C13613n0;
import p195e.p196a.p199x0.p454e.p461g.C13616o;
import p195e.p196a.p199x0.p454e.p461g.C13618o0;
import p195e.p196a.p199x0.p454e.p461g.C13621p;
import p195e.p196a.p199x0.p454e.p461g.C13623p0;
import p195e.p196a.p199x0.p454e.p461g.C13625q;
import p195e.p196a.p199x0.p454e.p461g.C13627q0;
import p195e.p196a.p199x0.p454e.p461g.C13629r;
import p195e.p196a.p199x0.p454e.p461g.C13631r0;
import p195e.p196a.p199x0.p454e.p461g.C13633s;
import p195e.p196a.p199x0.p454e.p461g.C13635s0;
import p195e.p196a.p199x0.p454e.p461g.C13637t;
import p195e.p196a.p199x0.p454e.p461g.C13639t0;
import p195e.p196a.p199x0.p454e.p461g.C13641u;
import p195e.p196a.p199x0.p454e.p461g.C13642u0;
import p195e.p196a.p199x0.p454e.p461g.C13646v;
import p195e.p196a.p199x0.p454e.p461g.C13649v0;
import p195e.p196a.p199x0.p454e.p461g.C13651w;
import p195e.p196a.p199x0.p454e.p461g.C13653x;
import p195e.p196a.p199x0.p454e.p461g.C13655y;
import p195e.p196a.p199x0.p454e.p461g.C13657z;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12326b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12328d;
import p195e.p196a.p449w0.C12329e;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12332h;
import p195e.p196a.p449w0.C12333i;
import p195e.p196a.p449w0.C12334j;
import p195e.p196a.p449w0.C12335k;
import p195e.p196a.p449w0.C12336l;
import p195e.p196a.p449w0.C12337m;
import p195e.p196a.p449w0.C12338n;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p449w0.C12342r;
import p195e.p196a.p467z0.C13796n;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.k0 */
/* compiled from: Single */
public abstract class C5928k0<T> implements C5930q0<T> {
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26670a(Iterable<? extends C5930q0<? extends T>> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54870a((C5928k0<T>) new C13559a<T>(null, iterable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26691b(Iterable<? extends C5930q0<? extends T>> iterable) {
        return m26699c((C6007b<? extends C5930q0<? extends T>>) C5929l.m26898f(iterable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26699c(C6007b<? extends C5930q0<? extends T>> bVar) {
        return m26684a(bVar, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: d */
    public static <T> C5928k0<T> m26703d(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "publisher is null");
        return C12205a.m54870a((C5928k0<T>) new C13564b0<T>(bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public static <T> C5929l<T> m26706e(C6007b<? extends C5930q0<? extends T>> bVar) {
        C12390b.m55563a(bVar, "sources is null");
        C12557d1 d1Var = new C12557d1(bVar, C13574e0.m58311b(), false, Integer.MAX_VALUE, C5929l.m26793R());
        return C12205a.m54871a((C5929l<T>) d1Var);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: f */
    public static <T> C5928k0<T> m26707f(C5930q0<? extends C5930q0<? extends T>> q0Var) {
        C12390b.m55563a(q0Var, "source is null");
        return C12205a.m54870a((C5928k0<T>) new C13646v<T>(q0Var, C12351a.m55521e()));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public static <T> C5928k0<T> m26709g(C5930q0<T> q0Var) {
        C12390b.m55563a(q0Var, "onSubscribe is null");
        if (!(q0Var instanceof C5928k0)) {
            return C12205a.m54870a((C5928k0<T>) new C13568c0<T>(q0Var));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }

    @C5935d
    @C5939h("none")
    /* renamed from: h */
    public static <T> C5928k0<T> m26710h(C5930q0<T> q0Var) {
        C12390b.m55563a(q0Var, "source is null");
        if (q0Var instanceof C5928k0) {
            return C12205a.m54870a((C5928k0) q0Var);
        }
        return C12205a.m54870a((C5928k0<T>) new C13568c0<T>(q0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: r */
    public static <T> C5928k0<T> m26711r() {
        return C12205a.m54870a(C13594i0.f39364a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo24206b(@C5937f C12292n0<? super T> n0Var);

    @C5935d
    @C5939h("none")
    /* renamed from: i */
    public final C5928k0<T> mo24229i(C12339o<? super Throwable, ? extends C5930q0<? extends T>> oVar) {
        C12390b.m55563a(oVar, "resumeFunctionInCaseOfError is null");
        return C12205a.m54870a((C5928k0<T>) new C13605l0<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: j */
    public final C5928k0<T> mo24232j(C12339o<Throwable, ? extends T> oVar) {
        C12390b.m55563a(oVar, "resumeFunction is null");
        return C12205a.m54870a((C5928k0<T>) new C13601k0<T>(this, oVar, null));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: k */
    public final C5929l<T> mo24233k(C12339o<? super C5929l<Object>, ? extends C6007b<?>> oVar) {
        return mo24239n().mo24606y(oVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: l */
    public final C5928k0<T> mo24235l(C12339o<? super C5929l<Throwable>, ? extends C6007b<?>> oVar) {
        return m26659a(mo24239n().mo24243A(oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: m */
    public final <R> R mo24238m(C12339o<? super C5928k0<T>, R> oVar) {
        try {
            return ((C12339o) C12390b.m55563a(oVar, "convert is null")).apply(this);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            throw C13754k.m58724c(th);
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: n */
    public final C5929l<T> mo24239n() {
        if (this instanceof C12393b) {
            return ((C12393b) this).mo42139b();
        }
        return C12205a.m54871a((C5929l<T>) new C13627q0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: o */
    public final Future<T> mo24240o() {
        return (Future) mo24213c((E) new C12425r());
    }

    @C5935d
    @C5939h("none")
    /* renamed from: p */
    public final C5931s<T> mo24241p() {
        if (this instanceof C12394c) {
            return ((C12394c) this).mo42140c();
        }
        return C12205a.m54873a((C5931s<T>) new C13024m0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: q */
    public final C5923b0<T> mo24242q() {
        if (this instanceof C12395d) {
            return ((C12395d) this).mo42141a();
        }
        return C12205a.m54862a((C5923b0<T>) new C13631r0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static <T> C5923b0<T> m26685b(C5926g0<? extends C5930q0<? extends T>> g0Var) {
        C12390b.m55563a(g0Var, "sources is null");
        return C12205a.m54862a((C5923b0<T>) new C13440v<T>(g0Var, C13574e0.m58312c(), 2, C13753j.IMMEDIATE));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static <T> C5928k0<T> m26695c(Callable<? extends T> callable) {
        C12390b.m55563a(callable, "callable is null");
        return C12205a.m54870a((C5928k0<T>) new C13561a0<T>(callable));
    }

    @C5939h("none")
    /* renamed from: k */
    public final C12314c mo24234k() {
        return mo24189a(C12351a.m55520d(), C12351a.f35506f);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: l */
    public final C13796n<T> mo24236l() {
        C13796n<T> nVar = new C13796n<>();
        mo24192a((C12292n0<? super T>) nVar);
        return nVar;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26680a(C5930q0<? extends T>... q0VarArr) {
        if (q0VarArr.length == 0) {
            return m26688b(C13574e0.m58310a());
        }
        if (q0VarArr.length == 1) {
            return m26710h(q0VarArr[0]);
        }
        return C12205a.m54870a((C5928k0<T>) new C13559a<T>(q0VarArr, null));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5929l<T> m26705d(Iterable<? extends C5930q0<? extends T>> iterable) {
        return m26708f((C6007b<? extends C5930q0<? extends T>>) C5929l.m26898f(iterable));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public static <T> C5929l<T> m26708f(C6007b<? extends C5930q0<? extends T>> bVar) {
        C12390b.m55563a(bVar, "sources is null");
        C12557d1 d1Var = new C12557d1(bVar, C13574e0.m58311b(), true, Integer.MAX_VALUE, C5929l.m26793R());
        return C12205a.m54871a((C5929l<T>) d1Var);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final C5928k0<T> mo24219e() {
        return C12205a.m54870a((C5928k0<T>) new C13562b<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final C5929l<T> mo24230i() {
        return mo24239n().mo24245B();
    }

    @C5935d
    @C5939h("none")
    /* renamed from: j */
    public final C5928k0<T> mo24231j() {
        return m26659a(mo24239n().mo24250D());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26692b(C5930q0<? extends T>... q0VarArr) {
        return C12205a.m54871a((C5929l<T>) new C12886w<T>(C5929l.m26871b((T[]) q0VarArr), C13574e0.m58311b(), 2, C13753j.BOUNDARY));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static <T> C5928k0<T> m26693c(C5926g0<? extends T> g0Var) {
        C12390b.m55563a(g0Var, "observableSource is null");
        return C12205a.m54870a((C5928k0<T>) new C13194e3<T>(g0Var, null));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5929l<T> m26704d(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        return m26708f((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2}));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final <R> C5929l<R> mo24221e(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24239n().mo24586o(oVar);
    }

    @C5935d
    @C5939h("none")
    @Deprecated
    /* renamed from: m */
    public final C5925c mo24237m() {
        return C12205a.m54863a((C5925c) new C12500u(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static <T> C5928k0<T> m26688b(Callable<? extends Throwable> callable) {
        C12390b.m55563a(callable, "errorSupplier is null");
        return C12205a.m54870a((C5928k0<T>) new C13641u<T>(callable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final C12314c mo24222e(C12331g<? super T> gVar) {
        return mo24189a(gVar, C12351a.f35506f);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: f */
    public final C5928k0<T> mo24223f() {
        return C12205a.m54870a((C5928k0<T>) new C13571d0<T>(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public final <U> C5923b0<U> mo24225g(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54862a((C5923b0<T>) new C13655y<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: h */
    public final <R> C5928k0<R> mo24228h(C12339o<? super T, ? extends R> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54870a((C5928k0<T>) new C13590h0<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public static <T> C5928k0<T> m26694c(T t) {
        C12390b.m55563a(t, "value is null");
        return C12205a.m54870a((C5928k0<T>) new C13584f0<T>(t));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: e */
    public final <E> C5928k0<T> mo24220e(C5930q0<? extends E> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return mo24202b((C6007b<E>) new C13627q0<E>(q0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final <U> C5929l<U> mo24224f(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C13653x<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26689b(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        return m26706e((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3}));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: d */
    public static C5928k0<Long> m26701d(long j, TimeUnit timeUnit) {
        return m26702d(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    /* renamed from: g */
    public final C5925c mo24226g() {
        return C12205a.m54863a((C5925c) new C12500u(this));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: h */
    public final C5928k0<T> mo24227h() {
        return C12205a.m54870a((C5928k0<T>) new C13599k<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26684a(C6007b<? extends C5930q0<? extends T>> bVar, int i) {
        C12390b.m55563a(bVar, "sources is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C12929z<T>(bVar, C13574e0.m58311b(), i, C13753j.IMMEDIATE));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26700c(Iterable<? extends C5930q0<? extends T>> iterable) {
        return m26706e((C6007b<? extends C5930q0<? extends T>>) C5929l.m26898f(iterable));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: d */
    public static C5928k0<Long> m26702d(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54870a((C5928k0<T>) new C13623p0<T>(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26696c(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        return m26706e((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2}));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26681a(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        return m26699c((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2}));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26690b(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3, C5930q0<? extends T> q0Var4) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        return m26706e((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4}));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final C5928k0<T> mo24216d(C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "onSuccess is null");
        return C12205a.m54870a((C5928k0<T>) new C13633s<T>(this, gVar));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26697c(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        return m26708f((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3}));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final <R> C5923b0<R> mo24215d(C12339o<? super T, ? extends C5926g0<? extends R>> oVar) {
        return mo24242q().mo24072o(oVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26682a(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        return m26699c((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3}));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: d */
    public final T mo24218d() {
        C12415h hVar = new C12415h();
        mo24192a((C12292n0<? super T>) hVar);
        return hVar.mo42153a();
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public static <T> C5928k0<Boolean> m26687b(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2) {
        C12390b.m55563a(q0Var, "first is null");
        C12390b.m55563a(q0Var2, "second is null");
        return C12205a.m54870a((C5928k0<T>) new C13637t<T>(q0Var, q0Var2));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26698c(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3, C5930q0<? extends T> q0Var4) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        return m26708f((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4}));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24217d(C5930q0<? extends T> q0Var) {
        return m26696c((C5930q0<? extends T>) this, q0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26683a(C5930q0<? extends T> q0Var, C5930q0<? extends T> q0Var2, C5930q0<? extends T> q0Var3, C5930q0<? extends T> q0Var4) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        return m26699c((C6007b<? extends C5930q0<? extends T>>) C5929l.m26871b((T[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4}));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24204b(C5930q0<? extends T> q0Var) {
        return m26681a((C5930q0<? extends T>) this, q0Var);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: b */
    public final C5928k0<T> mo24195b(long j, TimeUnit timeUnit) {
        return mo24196b(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: b */
    public final C5928k0<T> mo24196b(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24169a((C5926g0<U>) C5923b0.m26207q(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final <U> C5928k0<T> mo24210c(C5930q0<U> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return C12205a.m54870a((C5928k0<T>) new C13595j<T>(this, q0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24199b(C12325a aVar) {
        C12390b.m55563a(aVar, "onFinally is null");
        return C12205a.m54870a((C5928k0<T>) new C13611n<T>(this, aVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26660a(C12294o0<T> o0Var) {
        C12390b.m55563a(o0Var, "source is null");
        return C12205a.m54870a((C5928k0<T>) new C13569d<T>(o0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5928k0<T> mo24212c(C12331g<? super C12314c> gVar) {
        C12390b.m55563a(gVar, "onSubscribe is null");
        return C12205a.m54870a((C5928k0<T>) new C13629r<T>(this, gVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24200b(C12331g<? super Throwable> gVar) {
        C12390b.m55563a(gVar, "onError is null");
        return C12205a.m54870a((C5928k0<T>) new C13621p<T>(this, gVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26673a(Callable<? extends C5930q0<? extends T>> callable) {
        C12390b.m55563a(callable, "singleSupplier is null");
        return C12205a.m54870a((C5928k0<T>) new C13573e<T>(callable));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final C5928k0<T> mo24211c(C12325a aVar) {
        C12390b.m55563a(aVar, "onDispose is null");
        return C12205a.m54870a((C5928k0<T>) new C13616o<T>(this, aVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5925c mo24193b(C12339o<? super T, ? extends C5927i> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54863a((C5925c) new C13651w(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26672a(Throwable th) {
        C12390b.m55563a(th, "error is null");
        return m26688b(C12351a.m55516b(th));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final <R> C5931s<R> mo24214c(C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54873a((C5931s<T>) new C13657z<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24203b(T t) {
        C12390b.m55563a(t, "value is null");
        return C12205a.m54870a((C5928k0<T>) new C13601k0<T>(this, null, t));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26676a(Future<? extends T> future) {
        return m26659a(C5929l.m26841a(future));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: c */
    public final <E extends C12292n0<? super T>> E mo24213c(E e) {
        mo24192a((C12292n0<? super T>) e);
        return e;
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T> C5928k0<T> m26677a(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return m26659a(C5929l.m26842a(future, j, timeUnit));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24194b(long j) {
        return m26659a(mo24239n().mo24486e(j));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: c */
    public final C5928k0<T> mo24207c(long j, TimeUnit timeUnit) {
        return m26686b(j, timeUnit, C12228b.m55092a(), null);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public static <T> C5928k0<T> m26678a(Future<? extends T> future, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m26659a(C5929l.m26843a(future, j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24201b(C12342r<? super Throwable> rVar) {
        return m26659a(mo24239n().mo24493e(rVar));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: c */
    public final C5928k0<T> mo24208c(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m26686b(j, timeUnit, j0Var, null);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public static <T> C5928k0<T> m26679a(Future<? extends T> future, C12282j0 j0Var) {
        return m26659a(C5929l.m26844a(future, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C12314c mo24205b(C12326b<? super T, ? super Throwable> bVar) {
        C12390b.m55563a(bVar, "onCallback is null");
        C12411d dVar = new C12411d(bVar);
        mo24192a((C12292n0<? super T>) dVar);
        return dVar;
    }

    @C5936e
    @C5935d
    @C5939h("custom")
    /* renamed from: c */
    public final C5928k0<T> mo24209c(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54870a((C5928k0<T>) new C13635s0<T>(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T, U> C5928k0<T> m26674a(Callable<U> callable, C12339o<? super U, ? extends C5930q0<? extends T>> oVar, C12331g<? super U> gVar) {
        return m26675a(callable, oVar, gVar, true);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T, U> C5928k0<T> m26675a(Callable<U> callable, C12339o<? super U, ? extends C5930q0<? extends T>> oVar, C12331g<? super U> gVar, boolean z) {
        C12390b.m55563a(callable, "resourceSupplier is null");
        C12390b.m55563a(oVar, "singleFunction is null");
        C12390b.m55563a(gVar, "disposer is null");
        return C12205a.m54870a((C5928k0<T>) new C13639t0<T>(callable, oVar, gVar, z));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: b */
    public final C5928k0<T> mo24198b(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54870a((C5928k0<T>) new C13609m0<T>(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: b */
    public final C5928k0<T> mo24197b(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return mo24202b((C6007b<E>) new C12483l0<E>(iVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T, R> C5928k0<R> m26671a(Iterable<? extends C5930q0<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        C12390b.m55563a(oVar, "zipper is null");
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54870a((C5928k0<T>) new C13649v0<T>(iterable, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <E> C5928k0<T> mo24202b(C6007b<E> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return C12205a.m54870a((C5928k0<T>) new C13613n0<T>(this, bVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, R> C5928k0<R> m26668a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C12327c<? super T1, ? super T2, ? extends R> cVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        return m26669a(C12351a.m55498a(cVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2});
    }

    /* renamed from: b */
    private C5928k0<T> m26686b(long j, TimeUnit timeUnit, C12282j0 j0Var, C5930q0<? extends T> q0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C13618o0 o0Var = new C13618o0(this, j, timeUnit, j0Var, q0Var);
        return C12205a.m54870a((C5928k0<T>) o0Var);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, R> C5928k0<R> m26667a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C12332h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        return m26669a(C12351a.m55499a(hVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C5928k0<R> m26666a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C12333i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        return m26669a(C12351a.m55500a(iVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> C5928k0<R> m26665a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C5930q0<? extends T5> q0Var5, C12334j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        C12390b.m55563a(q0Var5, "source5 is null");
        return m26669a(C12351a.m55501a(jVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C5928k0<R> m26664a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C5930q0<? extends T5> q0Var5, C5930q0<? extends T6> q0Var6, C12335k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        C12390b.m55563a(q0Var5, "source5 is null");
        C12390b.m55563a(q0Var6, "source6 is null");
        return m26669a(C12351a.m55502a(kVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> C5928k0<R> m26663a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C5930q0<? extends T5> q0Var5, C5930q0<? extends T6> q0Var6, C5930q0<? extends T7> q0Var7, C12336l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        C12390b.m55563a(q0Var5, "source5 is null");
        C12390b.m55563a(q0Var6, "source6 is null");
        C12390b.m55563a(q0Var7, "source7 is null");
        return m26669a(C12351a.m55503a(lVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C5928k0<R> m26662a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C5930q0<? extends T5> q0Var5, C5930q0<? extends T6> q0Var6, C5930q0<? extends T7> q0Var7, C5930q0<? extends T8> q0Var8, C12337m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        C12390b.m55563a(q0Var5, "source5 is null");
        C12390b.m55563a(q0Var6, "source6 is null");
        C12390b.m55563a(q0Var7, "source7 is null");
        C12390b.m55563a(q0Var8, "source8 is null");
        return m26669a(C12351a.m55504a(mVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C5928k0<R> m26661a(C5930q0<? extends T1> q0Var, C5930q0<? extends T2> q0Var2, C5930q0<? extends T3> q0Var3, C5930q0<? extends T4> q0Var4, C5930q0<? extends T5> q0Var5, C5930q0<? extends T6> q0Var6, C5930q0<? extends T7> q0Var7, C5930q0<? extends T8> q0Var8, C5930q0<? extends T9> q0Var9, C12338n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C12390b.m55563a(q0Var, "source1 is null");
        C12390b.m55563a(q0Var2, "source2 is null");
        C12390b.m55563a(q0Var3, "source3 is null");
        C12390b.m55563a(q0Var4, "source4 is null");
        C12390b.m55563a(q0Var5, "source5 is null");
        C12390b.m55563a(q0Var6, "source6 is null");
        C12390b.m55563a(q0Var7, "source7 is null");
        C12390b.m55563a(q0Var8, "source8 is null");
        C12390b.m55563a(q0Var9, "source9 is null");
        return m26669a(C12351a.m55505a(nVar), (C5930q0<? extends T>[]) new C5930q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9});
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public static <T, R> C5928k0<R> m26669a(C12339o<? super Object[], ? extends R> oVar, C5930q0<? extends T>... q0VarArr) {
        C12390b.m55563a(oVar, "zipper is null");
        C12390b.m55563a(q0VarArr, "sources is null");
        if (q0VarArr.length == 0) {
            return m26672a((Throwable) new NoSuchElementException());
        }
        return C12205a.m54870a((C5928k0<T>) new C13642u0<T>(q0VarArr, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24174a(C5930q0<? extends T> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return m26680a((C5930q0<? extends T>[]) new C5930q0[]{this, q0Var});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <R> R mo24191a(@C5937f C12288l0<T, ? extends R> l0Var) {
        return ((C12288l0) C12390b.m55563a(l0Var, "converter is null")).mo42033a(this);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <R> C5928k0<R> mo24176a(C12299r0<? super T, ? extends R> r0Var) {
        return m26710h(((C12299r0) C12390b.m55563a(r0Var, "transformer is null")).mo42052a(this));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <U> C5928k0<U> mo24183a(Class<? extends U> cls) {
        C12390b.m55563a(cls, "clazz is null");
        return mo24228h(C12351a.m55506a(cls));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: a */
    public final C5928k0<T> mo24163a(long j, TimeUnit timeUnit) {
        return mo24166a(j, timeUnit, C12228b.m55092a(), false);
    }

    @C5936e
    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: a */
    public final C5928k0<T> mo24168a(long j, TimeUnit timeUnit, boolean z) {
        return mo24166a(j, timeUnit, C12228b.m55092a(), z);
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5928k0<T> mo24164a(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24166a(j, timeUnit, j0Var, false);
    }

    @C5936e
    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5928k0<T> mo24166a(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C13580f fVar = new C13580f(this, j, timeUnit, j0Var, z);
        return C12205a.m54870a((C5928k0<T>) fVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24170a(C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return C12205a.m54870a((C5928k0<T>) new C13585g<T>(this, iVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <U> C5928k0<T> mo24169a(C5926g0<U> g0Var) {
        C12390b.m55563a(g0Var, "other is null");
        return C12205a.m54870a((C5928k0<T>) new C13588h<T>(this, g0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U> C5928k0<T> mo24182a(C6007b<U> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return C12205a.m54870a((C5928k0<T>) new C13592i<T>(this, bVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24180a(C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "doAfterSuccess is null");
        return C12205a.m54870a((C5928k0<T>) new C13603l<T>(this, gVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24177a(C12325a aVar) {
        C12390b.m55563a(aVar, "onAfterTerminate is null");
        return C12205a.m54870a((C5928k0<T>) new C13607m<T>(this, aVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24178a(C12326b<? super T, ? super Throwable> bVar) {
        C12390b.m55563a(bVar, "onEvent is null");
        return C12205a.m54870a((C5928k0<T>) new C13625q<T>(this, bVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5931s<T> mo24188a(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54873a((C5931s<T>) new C13084y<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <R> C5928k0<R> mo24181a(C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54870a((C5928k0<T>) new C13646v<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <R> C5928k0<R> mo24173a(C12296p0<? extends R, ? super T> p0Var) {
        C12390b.m55563a(p0Var, "onLift is null");
        return C12205a.m54870a((C5928k0<T>) new C13587g0<T>(this, p0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<Boolean> mo24184a(Object obj) {
        return mo24185a(obj, C12390b.m55562a());
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<Boolean> mo24185a(Object obj, C12328d<Object, Object> dVar) {
        C12390b.m55563a(obj, "value is null");
        C12390b.m55563a(dVar, "comparer is null");
        return C12205a.m54870a((C5928k0<T>) new C13566c<T>(this, obj, dVar));
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5928k0<T> mo24171a(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54870a((C5928k0<T>) new C13597j0<T>(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24172a(C5928k0<? extends T> k0Var) {
        C12390b.m55563a(k0Var, "resumeSingleInCaseOfError is null");
        return mo24229i(C12351a.m55518c(k0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24186a(long j) {
        return mo24239n().mo24468d(j);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24187a(C12329e eVar) {
        return mo24239n().mo24326a(eVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24179a(C12328d<? super Integer, ? super Throwable> dVar) {
        return m26659a(mo24239n().mo24420b(dVar));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C5928k0<T> mo24162a(long j, C12342r<? super Throwable> rVar) {
        return m26659a(mo24239n().mo24299a(j, rVar));
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C12314c mo24189a(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2) {
        C12390b.m55563a(gVar, "onSuccess is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12418k kVar = new C12418k(gVar, gVar2);
        mo24192a((C12292n0<? super T>) kVar);
        return kVar;
    }

    @C5939h("none")
    /* renamed from: a */
    public final void mo24192a(C12292n0<? super T> n0Var) {
        C12390b.m55563a(n0Var, "subscriber is null");
        C12292n0 a = C12205a.m54872a(this, n0Var);
        C12390b.m55563a(a, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            mo24206b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @C5935d
    @C5939h("custom")
    /* renamed from: a */
    public final C5928k0<T> mo24165a(long j, TimeUnit timeUnit, C12282j0 j0Var, C5930q0<? extends T> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return m26686b(j, timeUnit, j0Var, q0Var);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    /* renamed from: a */
    public final C5928k0<T> mo24167a(long j, TimeUnit timeUnit, C5930q0<? extends T> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return m26686b(j, timeUnit, C12228b.m55092a(), q0Var);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final <U, R> C5928k0<R> mo24175a(C5930q0<U> q0Var, C12327c<? super T, ? super U, ? extends R> cVar) {
        return m26668a((C5930q0<? extends T1>) this, q0Var, cVar);
    }

    @C5935d
    @C5939h("none")
    /* renamed from: a */
    public final C13796n<T> mo24190a(boolean z) {
        C13796n<T> nVar = new C13796n<>();
        if (z) {
            nVar.cancel();
        }
        mo24192a((C12292n0<? super T>) nVar);
        return nVar;
    }

    /* renamed from: a */
    private static <T> C5928k0<T> m26659a(C5929l<T> lVar) {
        return C12205a.m54870a((C5928k0<T>) new C12798r3<T>(lVar, null));
    }
}
