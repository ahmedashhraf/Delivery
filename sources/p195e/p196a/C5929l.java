package p195e.p196a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p198t0.C5932a;
import p195e.p196a.p198t0.C5933b;
import p195e.p196a.p198t0.C5934c;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5939h;
import p195e.p196a.p199x0.p200j.C13745b;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13757m;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12404m;
import p195e.p196a.p199x0.p454e.p456b.C12512a0;
import p195e.p196a.p199x0.p454e.p456b.C12517a2;
import p195e.p196a.p199x0.p454e.p456b.C12519a3;
import p195e.p196a.p199x0.p454e.p456b.C12521a4;
import p195e.p196a.p199x0.p454e.p456b.C12523b;
import p195e.p196a.p199x0.p454e.p456b.C12525b0;
import p195e.p196a.p199x0.p454e.p456b.C12527b1;
import p195e.p196a.p199x0.p454e.p456b.C12530b2;
import p195e.p196a.p199x0.p454e.p456b.C12533b3;
import p195e.p196a.p199x0.p454e.p456b.C12535b4;
import p195e.p196a.p199x0.p454e.p456b.C12537c;
import p195e.p196a.p199x0.p454e.p456b.C12539c0;
import p195e.p196a.p199x0.p454e.p456b.C12541c1;
import p195e.p196a.p199x0.p454e.p456b.C12544c2;
import p195e.p196a.p199x0.p454e.p456b.C12546c3;
import p195e.p196a.p199x0.p454e.p456b.C12550c4;
import p195e.p196a.p199x0.p454e.p456b.C12552d;
import p195e.p196a.p199x0.p454e.p456b.C12559d3;
import p195e.p196a.p199x0.p454e.p456b.C12575d4;
import p195e.p196a.p199x0.p454e.p456b.C12577e;
import p195e.p196a.p199x0.p454e.p456b.C12580e0;
import p195e.p196a.p199x0.p454e.p456b.C12582e1;
import p195e.p196a.p199x0.p454e.p456b.C12585e2;
import p195e.p196a.p199x0.p454e.p456b.C12587e3;
import p195e.p196a.p199x0.p454e.p456b.C12592f0;
import p195e.p196a.p199x0.p454e.p456b.C12602f1;
import p195e.p196a.p199x0.p454e.p456b.C12604f2;
import p195e.p196a.p199x0.p454e.p456b.C12607f3;
import p195e.p196a.p199x0.p454e.p456b.C12609f4;
import p195e.p196a.p199x0.p454e.p456b.C12612g;
import p195e.p196a.p199x0.p454e.p456b.C12614g0;
import p195e.p196a.p199x0.p454e.p456b.C12617g1;
import p195e.p196a.p199x0.p454e.p456b.C12621g2;
import p195e.p196a.p199x0.p454e.p456b.C12624g3;
import p195e.p196a.p199x0.p454e.p456b.C12626g4;
import p195e.p196a.p199x0.p454e.p456b.C12628h;
import p195e.p196a.p199x0.p454e.p456b.C12631h0;
import p195e.p196a.p199x0.p454e.p456b.C12634h1;
import p195e.p196a.p199x0.p454e.p456b.C12635h2;
import p195e.p196a.p199x0.p454e.p456b.C12638h3;
import p195e.p196a.p199x0.p454e.p456b.C12643h4;
import p195e.p196a.p199x0.p454e.p456b.C12647i0;
import p195e.p196a.p199x0.p454e.p456b.C12648i1;
import p195e.p196a.p199x0.p454e.p456b.C12649i2;
import p195e.p196a.p199x0.p454e.p456b.C12650i3;
import p195e.p196a.p199x0.p454e.p456b.C12654i4;
import p195e.p196a.p199x0.p454e.p456b.C12656j;
import p195e.p196a.p199x0.p454e.p456b.C12658j0;
import p195e.p196a.p199x0.p454e.p456b.C12663j1;
import p195e.p196a.p199x0.p454e.p456b.C12667j2;
import p195e.p196a.p199x0.p454e.p456b.C12671j3;
import p195e.p196a.p199x0.p454e.p456b.C12673j4;
import p195e.p196a.p199x0.p454e.p456b.C12676k0;
import p195e.p196a.p199x0.p454e.p456b.C12682k2;
import p195e.p196a.p199x0.p454e.p456b.C12684k3;
import p195e.p196a.p199x0.p454e.p456b.C12686k4;
import p195e.p196a.p199x0.p454e.p456b.C12691l;
import p195e.p196a.p199x0.p454e.p456b.C12692l0;
import p195e.p196a.p199x0.p454e.p456b.C12694l1;
import p195e.p196a.p199x0.p454e.p456b.C12695l2;
import p195e.p196a.p199x0.p454e.p456b.C12698l3;
import p195e.p196a.p199x0.p454e.p456b.C12700l4;
import p195e.p196a.p199x0.p454e.p456b.C12706m;
import p195e.p196a.p199x0.p454e.p456b.C12710m0;
import p195e.p196a.p199x0.p454e.p456b.C12712m1;
import p195e.p196a.p199x0.p454e.p456b.C12714m2;
import p195e.p196a.p199x0.p454e.p456b.C12720m4;
import p195e.p196a.p199x0.p454e.p456b.C12722n;
import p195e.p196a.p199x0.p454e.p456b.C12726n0;
import p195e.p196a.p199x0.p454e.p456b.C12728n1;
import p195e.p196a.p199x0.p454e.p456b.C12735n3;
import p195e.p196a.p199x0.p454e.p456b.C12739o;
import p195e.p196a.p199x0.p454e.p456b.C12742o0;
import p195e.p196a.p199x0.p454e.p456b.C12745o1;
import p195e.p196a.p199x0.p454e.p456b.C12750o2;
import p195e.p196a.p199x0.p454e.p456b.C12752o3;
import p195e.p196a.p199x0.p454e.p456b.C12753o4;
import p195e.p196a.p199x0.p454e.p456b.C12755p;
import p195e.p196a.p199x0.p454e.p456b.C12758p0;
import p195e.p196a.p199x0.p454e.p456b.C12761p1;
import p195e.p196a.p199x0.p454e.p456b.C12763p2;
import p195e.p196a.p199x0.p454e.p456b.C12767p4;
import p195e.p196a.p199x0.p454e.p456b.C12770q;
import p195e.p196a.p199x0.p454e.p456b.C12775q0;
import p195e.p196a.p199x0.p454e.p456b.C12778q1;
import p195e.p196a.p199x0.p454e.p456b.C12780q2;
import p195e.p196a.p199x0.p454e.p456b.C12782q3;
import p195e.p196a.p199x0.p454e.p456b.C12784q4;
import p195e.p196a.p199x0.p454e.p456b.C12786r;
import p195e.p196a.p199x0.p454e.p456b.C12789r0;
import p195e.p196a.p199x0.p454e.p456b.C12792r1;
import p195e.p196a.p199x0.p454e.p456b.C12794r2;
import p195e.p196a.p199x0.p454e.p456b.C12798r3;
import p195e.p196a.p199x0.p454e.p456b.C12800r4;
import p195e.p196a.p199x0.p454e.p456b.C12806s0;
import p195e.p196a.p199x0.p454e.p456b.C12808s1;
import p195e.p196a.p199x0.p454e.p456b.C12808s1.C12817i;
import p195e.p196a.p199x0.p454e.p456b.C12825s2;
import p195e.p196a.p199x0.p454e.p456b.C12829s3;
import p195e.p196a.p199x0.p454e.p456b.C12831s4;
import p195e.p196a.p199x0.p454e.p456b.C12834t;
import p195e.p196a.p199x0.p454e.p456b.C12838t1;
import p195e.p196a.p199x0.p454e.p456b.C12840t2;
import p195e.p196a.p199x0.p454e.p456b.C12844t3;
import p195e.p196a.p199x0.p454e.p456b.C12846t4;
import p195e.p196a.p199x0.p454e.p456b.C12851u;
import p195e.p196a.p199x0.p454e.p456b.C12855u0;
import p195e.p196a.p199x0.p454e.p456b.C12857u1;
import p195e.p196a.p199x0.p454e.p456b.C12859u2;
import p195e.p196a.p199x0.p454e.p456b.C12863u3;
import p195e.p196a.p199x0.p454e.p456b.C12865u4;
import p195e.p196a.p199x0.p454e.p456b.C12868v;
import p195e.p196a.p199x0.p454e.p456b.C12870v0;
import p195e.p196a.p199x0.p454e.p456b.C12872v1;
import p195e.p196a.p199x0.p454e.p456b.C12876v3;
import p195e.p196a.p199x0.p454e.p456b.C12879v4;
import p195e.p196a.p199x0.p454e.p456b.C12886w;
import p195e.p196a.p199x0.p454e.p456b.C12894w0;
import p195e.p196a.p199x0.p454e.p456b.C12895w1;
import p195e.p196a.p199x0.p454e.p456b.C12896w2;
import p195e.p196a.p199x0.p454e.p456b.C12898w3;
import p195e.p196a.p199x0.p454e.p456b.C12900w4;
import p195e.p196a.p199x0.p454e.p456b.C12903x;
import p195e.p196a.p199x0.p454e.p456b.C12905x0;
import p195e.p196a.p199x0.p454e.p456b.C12906x1;
import p195e.p196a.p199x0.p454e.p456b.C12908x2;
import p195e.p196a.p199x0.p454e.p456b.C12910x3;
import p195e.p196a.p199x0.p454e.p456b.C12913x4;
import p195e.p196a.p199x0.p454e.p456b.C12917y;
import p195e.p196a.p199x0.p454e.p456b.C12918y0;
import p195e.p196a.p199x0.p454e.p456b.C12921y1;
import p195e.p196a.p199x0.p454e.p456b.C12923y2;
import p195e.p196a.p199x0.p454e.p456b.C12924y3;
import p195e.p196a.p199x0.p454e.p456b.C12926y4;
import p195e.p196a.p199x0.p454e.p456b.C12930z0;
import p195e.p196a.p199x0.p454e.p456b.C12933z1;
import p195e.p196a.p199x0.p454e.p456b.C12938z3;
import p195e.p196a.p199x0.p454e.p456b.C12941z4;
import p195e.p196a.p199x0.p454e.p458d.C13094a;
import p195e.p196a.p199x0.p454e.p458d.C13097b;
import p195e.p196a.p199x0.p454e.p458d.C13100c;
import p195e.p196a.p199x0.p454e.p458d.C13103d;
import p195e.p196a.p199x0.p454e.p458d.C13106e;
import p195e.p196a.p199x0.p454e.p458d.C13109f;
import p195e.p196a.p199x0.p454e.p459e.C13220g1;
import p195e.p196a.p199x0.p463g.C13676e;
import p195e.p196a.p199x0.p464h.C13715d;
import p195e.p196a.p199x0.p464h.C13716e;
import p195e.p196a.p199x0.p464h.C13719h;
import p195e.p196a.p199x0.p464h.C13720i;
import p195e.p196a.p199x0.p464h.C13723l;
import p195e.p196a.p199x0.p464h.C13731t;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p441d1.C12241d;
import p195e.p196a.p443f1.C12273d;
import p195e.p196a.p443f1.C12275f;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p448v0.C12323b;
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
import p195e.p196a.p449w0.C12341q;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.l */
/* compiled from: Flowable */
public abstract class C5929l<T> implements C6007b<T> {

    /* renamed from: a */
    static final int f17183a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: R */
    public static int m26793R() {
        return f17183a;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: S */
    public static <T> C5929l<T> m26794S() {
        return C12205a.m54871a(C12894w0.f37137b);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: T */
    public static <T> C5929l<T> m26795T() {
        return C12205a.m54871a(C12649i2.f36221b);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public static <T> C5929l<T> m26845a(C6007b<? extends T>... bVarArr) {
        C12390b.m55563a(bVarArr, "sources is null");
        int length = bVarArr.length;
        if (length == 0) {
            return m26794S();
        }
        if (length == 1) {
            return m26913q(bVarArr[0]);
        }
        return C12205a.m54871a((C5929l<T>) new C12628h<T>(bVarArr, null));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public static <T> C5929l<T> m26862b(Iterable<? extends C6007b<? extends T>> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return C12205a.m54871a((C5929l<T>) new C12628h<T>(null, iterable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T, R> C5929l<R> m26883c(C6007b<? extends T>[] bVarArr, C12339o<? super Object[], ? extends R> oVar) {
        return m26870b(bVarArr, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5929l<T> m26892d(C6007b<? extends T>... bVarArr) {
        return m26799a(m26793R(), m26793R(), bVarArr);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public static <T> C5929l<T> m26894e(Iterable<? extends C6007b<? extends T>> iterable) {
        return m26824a(iterable, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public static <T> C5929l<T> m26899f(Callable<? extends T> callable) {
        C12390b.m55563a(callable, "supplier is null");
        return C12205a.m54871a((C5929l<T>) new C12634h1<T>(callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public static <T> C5929l<T> m26902g(Iterable<? extends C6007b<? extends T>> iterable) {
        return m26898f(iterable).mo24586o(C12351a.m55521e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: h */
    public static <T> C5929l<T> m26903h(Iterable<? extends C6007b<? extends T>> iterable) {
        return m26898f(iterable).mo24492e(C12351a.m55521e(), true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: k */
    public static <T> C5929l<T> m26904k(C12331g<C12287k<T>> gVar) {
        C12390b.m55563a(gVar, "generator is null");
        return m26838a(C12351a.m55524h(), C12808s1.m56519a(gVar), C12351a.m55520d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: n */
    public static <T> C5929l<T> m26905n(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26874c(bVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: o */
    public static <T> C5929l<T> m26906o(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26809a(bVar, m26793R(), true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: p */
    public static <T> C5929l<T> m26910p(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26808a(bVar, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: q */
    public static <T> C5929l<T> m26913q(C6007b<? extends T> bVar) {
        if (bVar instanceof C5929l) {
            return C12205a.m54871a((C5929l) bVar);
        }
        C12390b.m55563a(bVar, "publisher is null");
        return C12205a.m54871a((C5929l<T>) new C12694l1<T>(bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: r */
    public static <T> C5929l<T> m26914r(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26887d(bVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: s */
    public static <T> C5929l<T> m26915s(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26893e(bVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: t */
    public static <T> C5929l<T> m26916t(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26913q(bVar).mo24246B(C12351a.m55521e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: u */
    public static <T> C5929l<T> m26917u(C6007b<? extends C6007b<? extends T>> bVar) {
        return m26901g(bVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: v */
    public static <T> C5929l<T> m26918v(C6007b<T> bVar) {
        C12390b.m55563a(bVar, "onSubscribe is null");
        if (!(bVar instanceof C5929l)) {
            return C12205a.m54871a((C5929l<T>) new C12694l1<T>(bVar));
        }
        throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: A */
    public final C12322a<T> mo24244A() {
        return mo24511f(m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: B */
    public final C5929l<T> mo24245B() {
        return mo24468d(Long.MAX_VALUE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: C */
    public final C12322a<T> mo24248C() {
        return C12559d3.m55862a(this);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: D */
    public final C5929l<T> mo24250D() {
        return mo24299a(Long.MAX_VALUE, C12351a.m55514b());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: E */
    public final C5929l<T> mo24251E() {
        return C12205a.m54871a((C5929l<T>) new C12752o3<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: F */
    public final C5929l<T> mo24253F() {
        return mo24244A().mo42082W();
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: G */
    public final C5931s<T> mo24256G() {
        return C12205a.m54873a((C5931s<T>) new C12782q3<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: H */
    public final C5928k0<T> mo24257H() {
        return C12205a.m54870a((C5928k0<T>) new C12798r3<T>(this, null));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: I */
    public final C5929l<T> mo24259I() {
        return mo24270O().mo24239n().mo24598u(C12351a.m55507a(C12351a.m55522f())).mo24590q(C12351a.m55521e());
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: J */
    public final C12314c mo24262J() {
        return mo24384a(C12351a.m55520d(), C12351a.f35506f, C12351a.f35503c, (C12331g<? super C14063d>) C12817i.INSTANCE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: K */
    public final <R> R mo24264K(C12339o<? super C5929l<T>, R> oVar) {
        try {
            return ((C12339o) C12390b.m55563a(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            throw C13754k.m58724c(th);
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: L */
    public final C5929l<C12241d<T>> mo24266L() {
        return mo24378a(TimeUnit.MILLISECONDS, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: M */
    public final C5929l<C12241d<T>> mo24268M() {
        return mo24437b(TimeUnit.MILLISECONDS, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: N */
    public final Future<T> mo24269N() {
        return (Future) mo24512f((E) new C13720i());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: O */
    public final C5928k0<List<T>> mo24270O() {
        return C12205a.m54870a((C5928k0<T>) new C12753o4<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: P */
    public final C5923b0<T> mo24271P() {
        return C12205a.m54862a((C5923b0<T>) new C13220g1<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: Q */
    public final C5928k0<List<T>> mo24272Q() {
        return mo24405b(C12351a.m55522f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo24499e(C14062c<? super T> cVar);

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final C5929l<T> mo24538i() {
        return mo24447c(16);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final <R> C5929l<R> mo24553j(C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        return mo24460c(oVar, true, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: l */
    public final <U> C5929l<T> mo24569l(C12339o<? super T, ? extends C6007b<U>> oVar) {
        C12390b.m55563a(oVar, "itemDelayIndicator is null");
        return mo24586o(C12808s1.m56528b(oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: m */
    public final <K> C5929l<T> mo24576m(C12339o<? super T, K> oVar) {
        return mo24351a(oVar, C12351a.m55519c());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: w */
    public final C5929l<T> mo24601w() {
        return C12205a.m54871a((C5929l<T>) new C12714m2<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: x */
    public final C5929l<T> mo24603x() {
        return C12205a.m54871a((C5929l<T>) new C12750o2<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: y */
    public final C5929l<T> mo24605y() {
        return C12205a.m54871a((C5929l<T>) new C12710m0<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5934c
    @C5933b(C5932a.FULL)
    /* renamed from: z */
    public final C5922b<T> mo24607z() {
        return C5922b.m26041a((C6007b<? extends T>) this);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T, R> C5929l<R> m26880c(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        return m26866b(iterable, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5929l<T> m26889d(Iterable<? extends C6007b<? extends T>> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return m26898f(iterable).mo24476d(C12351a.m55521e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: e */
    public static <T> C5929l<T> m26895e(Callable<? extends Throwable> callable) {
        C12390b.m55563a(callable, "errorSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12905x0<T>(callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public static <T> C5929l<T> m26901g(C6007b<? extends C6007b<? extends T>> bVar, int i) {
        return m26913q(bVar).mo24563k(C12351a.m55521e(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: o */
    public static <T> C5929l<T> m26907o(T t) {
        C12390b.m55563a(t, "item is null");
        return C12205a.m54871a((C5929l<T>) new C12895w1<T>(t));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: p */
    public static C5929l<Long> m26908p(long j, TimeUnit timeUnit) {
        return m26886d(j, j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: A */
    public final C5929l<T> mo24243A(C12339o<? super C5929l<Throwable>, ? extends C6007b<?>> oVar) {
        C12390b.m55563a(oVar, "handler is null");
        return C12205a.m54871a((C5929l<T>) new C12624g3<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: B */
    public final <R> C5929l<R> mo24246B(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24554j(oVar, m26793R());
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: C */
    public final C5925c mo24247C(@C5937f C12339o<? super T, ? extends C5927i> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54863a((C5925c) new C13103d(this, oVar, false));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: D */
    public final C5925c mo24249D(@C5937f C12339o<? super T, ? extends C5927i> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54863a((C5925c) new C13103d(this, oVar, true));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: E */
    public final <R> C5929l<R> mo24252E(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24563k(oVar, m26793R());
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: F */
    public final <R> C5929l<R> mo24254F(@C5937f C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C13106e<T>(this, oVar, false));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: G */
    public final <R> C5929l<R> mo24255G(@C5937f C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C13106e<T>(this, oVar, true));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: H */
    public final <R> C5929l<R> mo24258H(@C5937f C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C13109f<T>(this, oVar, false));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: I */
    public final <R> C5929l<R> mo24260I(@C5937f C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C13109f<T>(this, oVar, true));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: J */
    public final <V> C5929l<T> mo24261J(C12339o<? super T, ? extends C6007b<V>> oVar) {
        return m26850b(null, oVar, null);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: L */
    public final <K> C5928k0<Map<K, T>> mo24265L(C12339o<? super T, ? extends K> oVar) {
        C12390b.m55563a(oVar, "keySelector is null");
        return mo24282a(C13757m.m58731d(), C12351a.m55494a(oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: M */
    public final <K> C5928k0<Map<K, Collection<T>>> mo24267M(C12339o<? super T, ? extends K> oVar) {
        return mo24277a(oVar, C12351a.m55521e(), C13757m.m58731d(), C13745b.m58691e());
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: h */
    public final void mo24537h() {
        C12691l.m56202a(this);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final <R> C5929l<R> mo24544i(C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        return mo24491e(oVar, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: j */
    public final C5928k0<Long> mo24548j() {
        return C12205a.m54870a((C5928k0<T>) new C12580e0<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: m */
    public final C5929l<T> mo24573m() {
        return mo24580n(C12351a.m55521e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: n */
    public final <K> C5929l<T> mo24580n(C12339o<? super T, K> oVar) {
        C12390b.m55563a(oVar, "keySelector is null");
        return C12205a.m54871a((C5929l<T>) new C12742o0<T>(this, oVar, C12390b.m55562a()));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: r */
    public final <R> C5929l<R> mo24592r(C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        return mo24508f(oVar, false, Integer.MAX_VALUE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: s */
    public final <R> C5929l<R> mo24593s(C12339o<? super T, ? extends C5930q0<? extends R>> oVar) {
        return mo24522g(oVar, false, Integer.MAX_VALUE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: t */
    public final <K> C5929l<C12323b<K, T>> mo24596t(C12339o<? super T, ? extends K> oVar) {
        return mo24349a(oVar, C12351a.m55521e(), false, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: u */
    public final <R> C5929l<R> mo24598u(C12339o<? super T, ? extends R> oVar) {
        C12390b.m55563a(oVar, "mapper is null");
        return C12205a.m54871a((C5929l<T>) new C12530b2<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: w */
    public final C5929l<T> mo24602w(C12339o<? super Throwable, ? extends T> oVar) {
        C12390b.m55563a(oVar, "valueSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12780q2<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: x */
    public final <R> C5929l<R> mo24604x(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar) {
        return mo24532h(oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: y */
    public final C5929l<T> mo24606y(C12339o<? super C5929l<Object>, ? extends C6007b<?>> oVar) {
        C12390b.m55563a(oVar, "handler is null");
        return C12205a.m54871a((C5929l<T>) new C12546c3<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: z */
    public final <R> C5929l<R> mo24608z(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar) {
        C12390b.m55563a(oVar, "selector is null");
        return C12559d3.m55861a(C12808s1.m56523a(this), oVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, R> C5929l<R> m26869b(C6007b<? extends T>[] bVarArr, C12339o<? super Object[], ? extends R> oVar) {
        return m26846a(bVarArr, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26878c(Iterable<? extends C6007b<? extends T>> iterable) {
        C12390b.m55563a(iterable, "sources is null");
        return m26898f(iterable).mo24335a(C12351a.m55521e(), 2, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public static <T> C5929l<T> m26898f(Iterable<? extends T> iterable) {
        C12390b.m55563a(iterable, "source is null");
        return C12205a.m54871a((C5929l<T>) new C12663j1<T>(iterable));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: p */
    public static C5929l<Long> m26909p(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m26886d(j, j, timeUnit, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: g */
    public final T mo24525g() {
        return mo24257H().mo24218d();
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: h */
    public final <R> C5929l<R> mo24531h(C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        return mo24426b(oVar, true, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final C5929l<T> mo24547i(T t) {
        C12390b.m55563a(t, "item is null");
        return mo24564k((C6007b<? extends T>) m26907o(t));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: j */
    public final C5928k0<T> mo24549j(T t) {
        return mo24276a(0, t);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: l */
    public final C5929l<T> mo24566l() {
        return mo24351a(C12351a.m55521e(), C12351a.m55519c());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: m */
    public final C5928k0<T> mo24572m(T t) {
        C12390b.m55563a(t, "defaultItem is null");
        return C12205a.m54870a((C5928k0<T>) new C12798r3<T>(this, t));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: r */
    public final C5928k0<Boolean> mo24591r() {
        return mo24278a(C12351a.m55509a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: s */
    public final C5931s<T> mo24594s() {
        return C12205a.m54873a((C5931s<T>) new C12906x1<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: t */
    public final C5928k0<T> mo24595t() {
        return C12205a.m54870a((C5928k0<T>) new C12921y1<T>(this, null));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, R> C5929l<R> m26865b(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        return m26825a(iterable, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: d */
    public static <T> C5929l<T> m26891d(Callable<? extends C6007b<? extends T>> callable) {
        C12390b.m55563a(callable, "supplier is null");
        return C12205a.m54871a((C5929l<T>) new C12647i0<T>(callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public static <T> C5929l<T> m26896e(C6007b<? extends T>... bVarArr) {
        return m26871b((T[]) bVarArr).mo24506f(C12351a.m55521e(), bVarArr.length);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: K */
    public final C12275f<T> mo24263K() {
        C12275f<T> fVar = new C12275f<>();
        mo24393a((C12297q<? super T>) fVar);
        return fVar;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: g */
    public final T mo24526g(T t) {
        return mo24572m(t).mo24218d();
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: h */
    public final C5928k0<Boolean> mo24528h(Object obj) {
        C12390b.m55563a(obj, "item is null");
        return mo24404b(C12351a.m55511a(obj));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final C5929l<T> mo24555j(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26868b((C6007b<? extends T>[]) new C6007b[]{bVar, this});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: l */
    public final C5929l<T> mo24571l(T t) {
        C12390b.m55563a(t, "item is null");
        return mo24602w(C12351a.m55518c(t));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: n */
    public final C5931s<T> mo24582n() {
        return mo24382a(0);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: o */
    public final C5928k0<T> mo24583o() {
        return mo24401b(0);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: p */
    public final C5925c mo24587p(C12339o<? super T, ? extends C5927i> oVar) {
        return mo24485e(oVar, false, Integer.MAX_VALUE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: u */
    public final C5929l<C12200a0<T>> mo24597u() {
        return C12205a.m54871a((C5929l<T>) new C12585e2<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, R> C5929l<R> m26849b(C12339o<? super Object[], ? extends R> oVar, C6007b<? extends T>... bVarArr) {
        return m26870b(bVarArr, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26874c(C6007b<? extends C6007b<? extends T>> bVar, int i) {
        return m26913q(bVar).mo24329a(C12351a.m55521e(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public static <T> C5929l<T> m26893e(C6007b<? extends C6007b<? extends T>> bVar, int i) {
        return m26913q(bVar).mo24479d(C12351a.m55521e(), true, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public static <T> C5929l<T> m26900f(C6007b<? extends T>... bVarArr) {
        return m26871b((T[]) bVarArr).mo24479d(C12351a.m55521e(), true, bVarArr.length);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: q */
    public static C5929l<Long> m26911q(long j, TimeUnit timeUnit) {
        return m26912q(j, timeUnit, C12228b.m55092a());
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final <R> C5929l<R> mo24520g(C12339o<? super T, ? extends C5941y<? extends R>> oVar) {
        return mo24477d(oVar, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: i */
    public final C5929l<T> mo24543i(C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "onDrop is null");
        return C12205a.m54871a((C5929l<T>) new C12714m2<T>(this, gVar));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: m */
    public final C5929l<T> mo24574m(long j, TimeUnit timeUnit) {
        return mo24410b(j, timeUnit);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: n */
    public final C5929l<T> mo24581n(T t) {
        C12390b.m55563a(t, "item is null");
        return m26868b((C6007b<? extends T>[]) new C6007b[]{m26907o(t), this});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: o */
    public final <R> C5929l<R> mo24586o(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24352a(oVar, false, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: p */
    public final C5929l<T> mo24588p() {
        return C12205a.m54871a((C5929l<T>) new C12761p1<T>(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: v */
    public final C5929l<T> mo24599v() {
        return mo24289a(m26793R(), false, true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26807a(C12339o<? super Object[], ? extends R> oVar, C6007b<? extends T>... bVarArr) {
        return m26846a(bVarArr, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, R> C5929l<R> m26870b(C6007b<? extends T>[] bVarArr, C12339o<? super Object[], ? extends R> oVar, int i) {
        C12390b.m55563a(bVarArr, "sources is null");
        C12390b.m55563a(oVar, "combiner is null");
        C12390b.m55558a(i, "bufferSize");
        if (bVarArr.length == 0) {
            return m26794S();
        }
        return C12205a.m54871a((C5929l<T>) new C12851u<T>(bVarArr, oVar, i, true));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26882c(C6007b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m26794S();
        }
        if (bVarArr.length == 1) {
            return m26913q(bVarArr[0]);
        }
        return C12205a.m54871a((C5929l<T>) new C12868v<T>(bVarArr, true));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: d */
    public static C5929l<Long> m26885d(long j, long j2, TimeUnit timeUnit) {
        return m26886d(j, j2, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public static <T> C5929l<T> m26897f(C6007b<? extends C6007b<? extends T>> bVar, int i) {
        return m26913q(bVar).mo24554j(C12351a.m55521e(), i);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: q */
    public static C5929l<Long> m26912q(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54871a((C5929l<T>) new C12720m4<T>(Math.max(0, j), timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: e */
    public final T mo24498e(T t) {
        C13716e eVar = new C13716e();
        mo24393a((C12297q<? super T>) eVar);
        Object a = eVar.mo43092a();
        return a != null ? a : t;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: g */
    public final C5929l<T> mo24519g(C12331g<? super C14063d> gVar) {
        return mo24327a(gVar, C12351a.f35507g, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: h */
    public final C12314c mo24535h(C12331g<? super T> gVar) {
        return mo24556j(gVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: j */
    public final C12314c mo24556j(C12331g<? super T> gVar) {
        return mo24384a(gVar, C12351a.f35506f, C12351a.f35503c, (C12331g<? super C14063d>) C12817i.INSTANCE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: k */
    public final <U> C5929l<T> mo24562k(C12339o<? super T, ? extends C6007b<U>> oVar) {
        C12390b.m55563a(oVar, "debounceIndicator is null");
        return C12205a.m54871a((C5929l<T>) new C12614g0<T>(this, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: l */
    public final <U> C5929l<T> mo24570l(C6007b<U> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12609f4<T>(this, bVar));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: m */
    public final C5929l<T> mo24575m(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24411b(j, timeUnit, j0Var);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: o */
    public final C5929l<C5929l<T>> mo24584o(long j, TimeUnit timeUnit) {
        return mo24308a(j, timeUnit, C12228b.m55092a(), Long.MAX_VALUE, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: v */
    public final C5929l<T> mo24600v(C12339o<? super Throwable, ? extends C6007b<? extends T>> oVar) {
        C12390b.m55563a(oVar, "resumeFunction is null");
        return C12205a.m54871a((C5929l<T>) new C12763p2<T>(this, oVar, false));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26846a(C6007b<? extends T>[] bVarArr, C12339o<? super Object[], ? extends R> oVar, int i) {
        C12390b.m55563a(bVarArr, "sources is null");
        if (bVarArr.length == 0) {
            return m26794S();
        }
        C12390b.m55563a(oVar, "combiner is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12851u<T>(bVarArr, oVar, i, false));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: d */
    public static C5929l<Long> m26886d(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12838t1 t1Var = new C12838t1(Math.max(0, j), Math.max(0, j2), timeUnit, j0Var);
        return C12205a.m54871a((C5929l<T>) t1Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: f */
    public final Iterable<T> mo24514f(T t) {
        return new C12552d(this, t);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final <U> C5929l<U> mo24521g(C12339o<? super T, ? extends Iterable<? extends U>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12602f1<T>(this, oVar, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: h */
    public final <R> C5929l<R> mo24532h(C12339o<? super C5929l<T>, ? extends C6007b<? extends R>> oVar, int i) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C12825s2<T>(this, oVar, i, false));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final <R> C5929l<R> mo24545i(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, int i) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55558a(i, "bufferSize");
        return C12559d3.m55861a(C12808s1.m56524a(this, i), oVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final <R> C5929l<R> mo24554j(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
        return mo24422b(oVar, i, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: m */
    public final <B> C5929l<C5929l<T>> mo24577m(C6007b<B> bVar) {
        return mo24429b(bVar, m26793R());
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: n */
    public final C5929l<T> mo24578n(long j, TimeUnit timeUnit) {
        return m26802a(j, timeUnit, null, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: o */
    public final C5929l<C5929l<T>> mo24585o(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24308a(j, timeUnit, j0Var, Long.MAX_VALUE, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: f */
    public final Iterable<T> mo24513f() {
        return new C12577e(this);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final C5929l<T> mo24550j(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0) {
            return C12205a.m54871a((C5929l<T>) new C12778q1<T>(this));
        } else {
            if (i == 1) {
                return C12205a.m54871a((C5929l<T>) new C12550c4<T>(this));
            }
            return C12205a.m54871a((C5929l<T>) new C12535b4<T>(this, i));
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: k */
    public final <T2> C5929l<T2> mo24559k() {
        return C12205a.m54871a((C5929l<T>) new C12692l0<T>(this));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: l */
    public final C5929l<T> mo24567l(long j, TimeUnit timeUnit) {
        return mo24501f(j, timeUnit);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: n */
    public final C5929l<T> mo24579n(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m26802a(j, timeUnit, null, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: e */
    public final Iterable<T> mo24497e() {
        return new C12537c(this);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final <U> C5929l<U> mo24505f(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        return mo24458c(oVar, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: k */
    public final C5928k0<T> mo24558k(T t) {
        C12390b.m55563a(t, "defaultItem");
        return C12205a.m54870a((C5928k0<T>) new C12921y1<T>(this, t));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: l */
    public final C5929l<T> mo24568l(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24502f(j, timeUnit, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: q */
    public final <U> C5929l<U> mo24590q(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        return mo24521g(oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5929l<T> m26887d(C6007b<? extends C6007b<? extends T>> bVar, int i) {
        return m26913q(bVar).mo24506f(C12351a.m55521e(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final <R> C5929l<R> mo24490e(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24330a(oVar, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: f */
    public final C5929l<T> mo24504f(C12331g<? super T> gVar) {
        C12331g d = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        return m26804a(gVar, d, aVar, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: g */
    public final <R> C5929l<R> mo24522g(C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        return C12205a.m54871a((C5929l<T>) new C12582e1<T>(this, oVar, z, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: h */
    public final C12322a<T> mo24536h(int i) {
        C12390b.m55558a(i, "bufferSize");
        return C12559d3.m55863a(this, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final C5929l<T> mo24539i(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0) {
            return C12205a.m54871a(this);
        } else {
            return C12205a.m54871a((C5929l<T>) new C12844t3<T>(this, i));
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: l */
    public final C5928k0<List<T>> mo24565l(int i) {
        return mo24281a(C12351a.m55522f(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: q */
    public final C5925c mo24589q() {
        return C12205a.m54863a((C5925c) new C12792r1(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T, S> C5929l<T> m26881c(Callable<S> callable, C12327c<S, C12287k<T>, S> cVar) {
        return m26838a(callable, cVar, C12351a.m55520d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T> C5928k0<Boolean> m26884d(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
        return m26798a(bVar, bVar2, C12390b.m55562a(), m26793R());
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final <R> C5929l<R> mo24491e(C12339o<? super T, ? extends C5930q0<? extends R>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13100c<T>(this, oVar, C13753j.IMMEDIATE, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final <R> C5929l<R> mo24506f(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
        return mo24352a(oVar, false, i, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: k */
    public final C5929l<T> mo24564k(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12924y3<T>(this, bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, R> C5929l<R> m26866b(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, int i) {
        C12390b.m55563a(iterable, "sources is null");
        C12390b.m55563a(oVar, "combiner is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12851u<T>(iterable, oVar, i, true));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26879c(Iterable<? extends C6007b<? extends T>> iterable, int i, int i2) {
        return m26898f(iterable).mo24352a(C12351a.m55521e(), true, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T, R> C5929l<R> m26890d(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar) {
        C12390b.m55563a(oVar, "zipper is null");
        C12390b.m55563a(iterable, "sources is null");
        C12926y4 y4Var = new C12926y4(null, iterable, oVar, m26793R(), false);
        return C12205a.m54871a((C5929l<T>) y4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: f */
    public final <R> C5929l<R> mo24508f(C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        return C12205a.m54871a((C5929l<T>) new C12541c1<T>(this, oVar, z, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: h */
    public final <U> C5929l<T> mo24534h(C6007b<U> bVar) {
        C12390b.m55563a(bVar, "sampler is null");
        return C12205a.m54871a((C5929l<T>) new C12638h3<T>(this, bVar, false));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final C5929l<T> mo24551j(long j, TimeUnit timeUnit) {
        return mo24413b(j, timeUnit, C12228b.m55092a(), false, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26825a(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, int i) {
        C12390b.m55563a(iterable, "sources is null");
        C12390b.m55563a(oVar, "combiner is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12851u<T>(iterable, oVar, i, false));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26873c(int i, int i2, C6007b<? extends T>... bVarArr) {
        return m26871b((T[]) bVarArr).mo24352a(C12351a.m55521e(), true, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final C5929l<T> mo24524g(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "next is null");
        return C12205a.m54871a((C5929l<T>) new C12763p2<T>(this, C12351a.m55518c(bVar), true));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final <U> C5929l<T> mo24546i(C6007b<U> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12876v3<T>(this, bVar));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: j */
    public final C5929l<T> mo24552j(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24413b(j, timeUnit, j0Var, false, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: k */
    public final <R> C5929l<R> mo24563k(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
        return mo24422b(oVar, i, true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26875c(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2}).mo24479d(C12351a.m55521e(), true, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: e */
    public final C5929l<T> mo24489e(C12331g<? super Throwable> gVar) {
        C12331g d = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        return m26804a(d, gVar, aVar, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: h */
    public final C5929l<T> mo24529h(long j, TimeUnit timeUnit) {
        return mo24312a(j, timeUnit, C12228b.m55092a(), false, m26793R());
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: k */
    public final C5929l<T> mo24560k(long j, TimeUnit timeUnit) {
        return mo24561k(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public static <T, R> C5929l<R> m26888d(C6007b<? extends C6007b<? extends T>> bVar, C12339o<? super Object[], ? extends R> oVar) {
        C12390b.m55563a(oVar, "zipper is null");
        return m26913q(bVar).mo24270O().mo24221e(C12808s1.m56530c(oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: e */
    public final C5929l<T> mo24488e(C12325a aVar) {
        return m26804a(C12351a.m55520d(), C12351a.m55497a(aVar), aVar, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final <K> C5929l<C12323b<K, T>> mo24507f(C12339o<? super T, ? extends K> oVar, boolean z) {
        return mo24349a(oVar, C12351a.m55521e(), z, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final C5929l<T> mo24515g(int i) {
        return mo24318a(C13676e.f39575b, true, i);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: h */
    public final C5929l<T> mo24530h(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24312a(j, timeUnit, j0Var, false, m26793R());
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: i */
    public final C5929l<T> mo24541i(long j, TimeUnit timeUnit) {
        return mo24570l((C6007b<U>) m26911q(j, timeUnit));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: k */
    public final C5929l<T> mo24561k(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12654i4 i4Var = new C12654i4(this, j, timeUnit, j0Var);
        return C12205a.m54871a((C5929l<T>) i4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26868b(C6007b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m26794S();
        }
        if (bVarArr.length == 1) {
            return m26913q(bVarArr[0]);
        }
        return C12205a.m54871a((C5929l<T>) new C12868v<T>(bVarArr, false));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final <R> C5929l<R> mo24492e(C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z) {
        return mo24352a(oVar, z, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final C5929l<T> mo24510f(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "next is null");
        return mo24600v(C12351a.m55518c(bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final C5929l<T> mo24517g(long j, TimeUnit timeUnit) {
        return mo24546i((C6007b<U>) m26911q(j, timeUnit));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: h */
    public final C5929l<T> mo24533h(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54871a((C5929l<T>) new C12643h4<T>(this, rVar));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: i */
    public final C5929l<T> mo24542i(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24570l((C6007b<U>) m26912q(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26805a(C12339o<? super Object[], ? extends R> oVar, int i, C6007b<? extends T>... bVarArr) {
        return m26870b(bVarArr, oVar, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26876c(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2, bVar3}).mo24479d(C12351a.m55521e(), true, 3);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: d */
    public final T mo24482d(T t) {
        C13715d dVar = new C13715d();
        mo24393a((C12297q<? super T>) dVar);
        Object a = dVar.mo43092a();
        return a != null ? a : t;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: e */
    public final C5925c mo24485e(C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        return C12205a.m54863a((C5925c) new C12527b1(this, oVar, z, i));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: g */
    public final C5929l<T> mo24518g(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24546i((C6007b<U>) m26912q(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: i */
    public final C5929l<C5929l<T>> mo24540i(long j) {
        return mo24292a(j, j, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, R> C5929l<R> m26811a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C12327c<? super T1, ? super T2, ? extends R> cVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26807a(C12351a.m55498a(cVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final C12322a<T> mo24511f(int i) {
        C12390b.m55558a(i, "bufferSize");
        return C12794r2.m56481a(this, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: g */
    public final C5929l<T> mo24516g(long j) {
        if (j >= 0) {
            return C12205a.m54871a((C5929l<T>) new C12521a4<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: h */
    public final C12275f<T> mo24527h(long j) {
        C12275f<T> fVar = new C12275f<>(j);
        mo24393a((C12297q<? super T>) fVar);
        return fVar;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: k */
    public final C5928k0<List<T>> mo24557k(int i) {
        C12390b.m55558a(i, "capacityHint");
        return C12205a.m54870a((C5928k0<T>) new C12753o4<T>(this, C12351a.m55512a(i)));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final <R> C5929l<R> mo24476d(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24335a(oVar, 2, true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C5929l<T> mo24494e(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26851b((C6007b<? extends T>) this, bVar);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: f */
    public final C5929l<T> mo24501f(long j, TimeUnit timeUnit) {
        return mo24502f(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: g */
    public final C5929l<T> mo24523g(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "stopPredicate is null");
        return C12205a.m54871a((C5929l<T>) new C12626g4<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26871b(T... tArr) {
        C12390b.m55563a(tArr, "items is null");
        if (tArr.length == 0) {
            return m26794S();
        }
        if (tArr.length == 1) {
            return m26907o(tArr[0]);
        }
        return C12205a.m54871a((C5929l<T>) new C12617g1<T>(tArr));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static <T> C5929l<T> m26877c(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3, C6007b<? extends T> bVar4) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2, bVar3, bVar4}).mo24479d(C12351a.m55521e(), true, 4);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final <R> C5929l<R> mo24477d(C12339o<? super T, ? extends C5941y<? extends R>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13097b<T>(this, oVar, C13753j.IMMEDIATE, i));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: f */
    public final C5929l<T> mo24502f(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12650i3 i3Var = new C12650i3(this, j, timeUnit, j0Var, false);
        return C12205a.m54871a((C5929l<T>) i3Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, R> C5929l<R> m26815a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C12332h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return m26807a(C12351a.m55499a(hVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3});
    }

    @C5935d
    @C5939h("none")
    @C5934c
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C5922b<T> mo24484e(int i) {
        C12390b.m55558a(i, "parallelism");
        return C5922b.m26042a((C6007b<? extends T>) this, i);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final <R> C5929l<R> mo24478d(C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z) {
        return mo24460c(oVar, z, 2);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C12322a<T> mo24495e(long j, TimeUnit timeUnit) {
        return mo24496e(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final C5929l<T> mo24500f(long j) {
        if (j <= 0) {
            return C12205a.m54871a(this);
        }
        return C12205a.m54871a((C5929l<T>) new C12829s3<T>(this, j));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final <U> C5929l<T> mo24480d(C6007b<U> bVar) {
        C12390b.m55563a(bVar, "subscriptionIndicator is null");
        return C12205a.m54871a((C5929l<T>) new C12676k0<T>(this, bVar));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C12322a<T> mo24496e(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55864a(this, j, timeUnit, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C5929l<R> m26817a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C12333i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return m26807a(C12351a.m55500a(iVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public static C5929l<Integer> m26872c(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return m26794S();
        } else {
            if (i2 == 1) {
                return m26907o((T) Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C12205a.m54871a((C5929l<T>) new C12840t2<T>(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: f */
    public final C5929l<T> mo24509f(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54871a((C5929l<T>) new C12898w3<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T, S> C5929l<T> m26867b(Callable<S> callable, C12326b<S, C12287k<T>> bVar) {
        C12390b.m55563a(bVar, "generator is null");
        return m26838a(callable, C12808s1.m56518a(bVar), C12351a.m55520d());
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24469d(long j, TimeUnit timeUnit) {
        return mo24470d(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24470d(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24480d((C6007b<U>) m26912q(j, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C5929l<T> mo24486e(long j) {
        return mo24299a(j, C12351a.m55514b());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: f */
    public final <E extends C14062c<? super T>> E mo24512f(E e) {
        mo24397a((C14062c<? super T>) e);
        return e;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: d */
    public final C5929l<T> mo24474d(C12325a aVar) {
        return m26804a(C12351a.m55520d(), C12351a.m55520d(), aVar, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: e */
    public final C5929l<T> mo24493e(C12342r<? super Throwable> rVar) {
        return mo24299a(Long.MAX_VALUE, rVar);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: f */
    public final C5929l<T> mo24503f(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54871a((C5929l<T>) new C12767p4<T>(this, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: d */
    public final C5929l<T> mo24475d(C12331g<? super C12200a0<T>> gVar) {
        C12390b.m55563a(gVar, "consumer is null");
        return m26804a(C12351a.m55517c(gVar), C12351a.m55513b(gVar), C12351a.m55492a(gVar), C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: e */
    public final C5929l<C12241d<T>> mo24487e(C12282j0 j0Var) {
        return mo24437b(TimeUnit.MILLISECONDS, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> C5929l<R> m26818a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C12334j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        return m26807a(C12351a.m55501a(jVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26864b(Iterable<? extends C6007b<? extends T>> iterable, int i, int i2) {
        return m26898f(iterable).mo24352a(C12351a.m55521e(), false, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: c */
    public final T mo24466c() {
        C13716e eVar = new C13716e();
        mo24393a((C12297q<? super T>) eVar);
        T a = eVar.mo43092a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26847b(int i, int i2, C6007b<? extends T>... bVarArr) {
        return m26871b((T[]) bVarArr).mo24352a(C12351a.m55521e(), false, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26851b(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2}).mo24479d(C12351a.m55521e(), false, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5929l<T> mo24447c(int i) {
        C12390b.m55558a(i, "initialCapacity");
        return C12205a.m54871a((C5929l<T>) new C12786r<T>(this, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final <R> C5929l<R> mo24479d(C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z, int i) {
        return mo24352a(oVar, z, i, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26853b(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2, bVar3}).mo24479d(C12351a.m55521e(), false, 3);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: d */
    public final C12314c mo24481d(C12342r<? super T> rVar) {
        return mo24386a(rVar, C12351a.f35506f, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C5929l<R> m26819a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C12335k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        return m26807a(C12351a.m55502a(kVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5925c mo24444c(C12339o<? super T, ? extends C5927i> oVar) {
        return mo24274a(oVar, true, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: d */
    public final C5929l<T> mo24467d(int i) {
        return mo24289a(i, false, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final <U> C5929l<U> mo24458c(C12339o<? super T, ? extends Iterable<? extends U>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C12602f1<T>(this, oVar, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24468d(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return m26794S();
        } else {
            return C12205a.m54871a((C5929l<T>) new C12519a3<T>(this, j));
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26855b(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3, C6007b<? extends T> bVar4) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return m26871b((T[]) new C6007b[]{bVar, bVar2, bVar3, bVar4}).mo24479d(C12351a.m55521e(), false, 4);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final <R> C5929l<R> mo24459c(C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z) {
        return mo24426b(oVar, z, 2);
    }

    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: d */
    public final void mo24483d(C14062c<? super T> cVar) {
        C12390b.m55563a(cVar, "s is null");
        if (cVar instanceof C12273d) {
            mo24393a((C12297q<? super T>) (C12273d) cVar);
        } else {
            mo24393a((C12297q<? super T>) new C12273d<Object>(cVar));
        }
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final <R> C5929l<R> mo24460c(C12339o<? super T, ? extends C5930q0<? extends R>> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13100c<T>(this, oVar, z ? C13753j.END : C13753j.BOUNDARY, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> C5929l<R> m26820a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C12336l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        return m26807a(C12351a.m55503a(lVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T> C5929l<T> m26863b(Iterable<? extends C6007b<? extends T>> iterable, int i) {
        return m26898f(iterable).mo24479d(C12351a.m55521e(), true, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5929l<T> mo24462c(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26810a((C6007b<? extends T>) this, bVar);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24472d(long j, TimeUnit timeUnit, boolean z) {
        return mo24413b(j, timeUnit, C12228b.m55092a(), z, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static C5929l<Long> m26848b(long j, long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        } else if (j2 == 0) {
            return m26794S();
        } else {
            if (j2 == 1) {
                return m26907o((T) Long.valueOf(j));
            }
            long j3 = (j2 - 1) + j;
            if (j <= 0 || j3 >= 0) {
                return C12205a.m54871a((C5929l<T>) new C12859u2<T>(j, j2));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: d */
    public final C5929l<T> mo24471d(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        return mo24413b(j, timeUnit, j0Var, z, m26793R());
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5929l<T> mo24451c(long j, TimeUnit timeUnit) {
        return mo24311a(j, timeUnit, C12228b.m55092a(), false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: d */
    public final C5929l<C12241d<T>> mo24473d(C12282j0 j0Var) {
        return mo24378a(TimeUnit.MILLISECONDS, j0Var);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5929l<T> mo24452c(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24311a(j, timeUnit, j0Var, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: c */
    public final C5929l<T> mo24457c(C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "onAfterNext is null");
        return C12205a.m54871a((C5929l<T>) new C12758p0<T>(this, gVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, R> C5929l<R> m26852b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C12327c<? super T1, ? super T2, ? extends R> cVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26806a(C12351a.m55498a(cVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: c */
    public final C5929l<T> mo24456c(C12325a aVar) {
        return mo24327a(C12351a.m55520d(), C12351a.f35507g, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C5929l<R> m26821a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C6007b<? extends T8> bVar8, C12337m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        C12390b.m55563a(bVar8, "source8 is null");
        return m26807a(C12351a.m55504a(mVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: c */
    public final C5929l<T> mo24464c(C14062c<? super T> cVar) {
        C12390b.m55563a(cVar, "subscriber is null");
        return m26804a(C12808s1.m56529c(cVar), C12808s1.m56527b(cVar), C12808s1.m56517a(cVar), C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, R> C5929l<R> m26854b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C12332h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return m26806a(C12351a.m55499a(hVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: c */
    public final C5929l<T> mo24461c(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54871a((C5929l<T>) new C12918y0<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, R> C5929l<R> m26856b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C12333i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return m26806a(C12351a.m55500a(iVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: c */
    public final C5929l<T> mo24448c(long j) {
        if (j >= 0) {
            return C12205a.m54871a((C5929l<T>) new C12517a2<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C5929l<R> m26822a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C6007b<? extends T8> bVar8, C6007b<? extends T9> bVar9, C12338n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        C12390b.m55563a(bVar8, "source8 is null");
        C12390b.m55563a(bVar9, "source9 is null");
        return m26807a(C12351a.m55505a(nVar), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: c */
    public final C5929l<T> mo24454c(long j, TimeUnit timeUnit, boolean z) {
        return mo24312a(j, timeUnit, C12228b.m55092a(), z, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: c */
    public final C5929l<T> mo24453c(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        return mo24312a(j, timeUnit, j0Var, z, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, T5, R> C5929l<R> m26857b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C12334j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        return m26806a(C12351a.m55501a(jVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5});
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: c */
    public final C5929l<T> mo24455c(@C5937f C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return mo24416b(j0Var, !(this instanceof C12592f0));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: c */
    public final <K, V> C5928k0<Map<K, Collection<V>>> mo24445c(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2) {
        return mo24277a(oVar, oVar2, C13757m.m58731d(), C13745b.m58691e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: c */
    public final <K, V> C5928k0<Map<K, Collection<V>>> mo24446c(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return mo24277a(oVar, oVar2, callable, C13745b.m58691e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, T5, T6, R> C5929l<R> m26858b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C12335k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        return m26806a(C12351a.m55502a(kVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6});
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: c */
    public final C5929l<C5929l<T>> mo24449c(long j, long j2, TimeUnit timeUnit) {
        return mo24295a(j, j2, timeUnit, C12228b.m55092a(), m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: c */
    public final C5929l<C5929l<T>> mo24450c(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24295a(j, j2, timeUnit, j0Var, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26810a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26868b((C6007b<? extends T>[]) new C6007b[]{bVar, bVar2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: c */
    public final <U, V> C5929l<C5929l<T>> mo24463c(C6007b<U> bVar, C12339o<? super U, ? extends C6007b<V>> oVar) {
        return mo24361a(bVar, oVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: c */
    public final <B> C5929l<C5929l<T>> mo24465c(Callable<? extends C6007b<B>> callable) {
        return mo24375a(callable, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26814a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return m26868b((C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, T5, T6, T7, R> C5929l<R> m26859b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C12336l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        return m26806a(C12351a.m55503a(lVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26816a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C6007b<? extends T> bVar3, C6007b<? extends T> bVar4) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return m26868b((C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26799a(int i, int i2, C6007b<? extends T>... bVarArr) {
        C12390b.m55563a(bVarArr, "sources is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C12903x xVar = new C12903x(new C12617g1(bVarArr), C12351a.m55521e(), i, i2, C13753j.IMMEDIATE);
        return C12205a.m54871a((C5929l<T>) xVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C5929l<R> m26860b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C6007b<? extends T8> bVar8, C12337m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        C12390b.m55563a(bVar8, "source8 is null");
        return m26806a(C12351a.m55504a(mVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26809a(C6007b<? extends C6007b<? extends T>> bVar, int i, boolean z) {
        return m26913q(bVar).mo24335a(C12351a.m55521e(), i, z);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26808a(C6007b<? extends C6007b<? extends T>> bVar, int i, int i2) {
        C12390b.m55563a(bVar, "sources is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C12917y yVar = new C12917y(bVar, C12351a.m55521e(), i, i2, C13753j.IMMEDIATE);
        return C12205a.m54871a((C5929l<T>) yVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26824a(Iterable<? extends C6007b<? extends T>> iterable, int i, int i2) {
        C12390b.m55563a(iterable, "sources is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C12903x xVar = new C12903x(new C12663j1(iterable), C12351a.m55521e(), i, i2, C13753j.IMMEDIATE);
        return C12205a.m54871a((C5929l<T>) xVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C5929l<R> m26861b(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C6007b<? extends T3> bVar3, C6007b<? extends T4> bVar4, C6007b<? extends T5> bVar5, C6007b<? extends T6> bVar6, C6007b<? extends T7> bVar7, C6007b<? extends T8> bVar8, C6007b<? extends T9> bVar9, C12338n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        C12390b.m55563a(bVar5, "source5 is null");
        C12390b.m55563a(bVar6, "source6 is null");
        C12390b.m55563a(bVar7, "source7 is null");
        C12390b.m55563a(bVar8, "source8 is null");
        C12390b.m55563a(bVar9, "source9 is null");
        return m26806a(C12351a.m55505a(nVar), false, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public static <T> C5929l<T> m26803a(C12293o<T> oVar, C12204b bVar) {
        C12390b.m55563a(oVar, "source is null");
        C12390b.m55563a(bVar, "mode is null");
        return C12205a.m54871a((C5929l<T>) new C12592f0<T>(oVar, bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public static <T> C5929l<T> m26836a(Throwable th) {
        C12390b.m55563a(th, "throwable is null");
        return m26895e(C12351a.m55516b(th));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26841a(Future<? extends T> future) {
        C12390b.m55563a(future, "future is null");
        return C12205a.m54871a((C5929l<T>) new C12648i1<T>(future, 0, null));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26842a(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C12390b.m55563a(future, "future is null");
        C12390b.m55563a(timeUnit, "unit is null");
        return C12205a.m54871a((C5929l<T>) new C12648i1<T>(future, j, timeUnit));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final C5928k0<Boolean> mo24404b(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54870a((C5928k0<T>) new C12656j<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final Iterable<T> mo24441b() {
        return mo24390a(m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26843a(Future<? extends T> future, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return m26842a(future, j, timeUnit).mo24455c(j0Var);
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final void mo24442b(C12331g<? super T> gVar) {
        C12691l.m56203a(this, gVar, C12351a.f35506f, C12351a.f35503c);
    }

    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: b */
    public final void mo24443b(C14062c<? super T> cVar) {
        C12691l.m56204a(this, cVar);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26844a(Future<? extends T> future, C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return m26841a(future).mo24455c(j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<List<T>> mo24407b(int i) {
        return mo24284a(i, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final <B> C5929l<List<T>> mo24428b(C6007b<B> bVar) {
        return mo24367a(bVar, C13745b.m58690d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, S> C5929l<T> m26837a(Callable<S> callable, C12326b<S, C12287k<T>> bVar, C12331g<? super S> gVar) {
        C12390b.m55563a(bVar, "generator is null");
        return m26838a(callable, C12808s1.m56518a(bVar), gVar);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5925c mo24399b(C12339o<? super T, ? extends C5927i> oVar) {
        return mo24400b(oVar, 2);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5925c mo24400b(C12339o<? super T, ? extends C5927i> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54863a((C5925c) new C13094a(this, oVar, C13753j.IMMEDIATE, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, S> C5929l<T> m26838a(Callable<S> callable, C12327c<S, C12287k<T>, S> cVar, C12331g<? super S> gVar) {
        C12390b.m55563a(callable, "initialState is null");
        C12390b.m55563a(cVar, "generator is null");
        C12390b.m55563a(gVar, "disposeState is null");
        return C12205a.m54871a((C5929l<T>) new C12712m1<T>(callable, cVar, gVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <R> C5929l<R> mo24425b(C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z) {
        return mo24331a(oVar, m26793R(), m26793R(), z);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <R> C5929l<R> mo24426b(C12339o<? super T, ? extends C5941y<? extends R>> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13097b<T>(this, oVar, z ? C13753j.END : C13753j.BOUNDARY, i));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public static C5929l<Long> m26800a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return m26801a(j, j2, j3, j4, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public static C5929l<Long> m26801a(long j, long j2, long j3, long j4, TimeUnit timeUnit, C12282j0 j0Var) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C12282j0 j0Var2 = j0Var;
        if (j5 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString());
        } else if (j5 == 0) {
            return m26794S().mo24452c(j6, timeUnit2, j0Var2);
        } else {
            long j7 = j + (j5 - 1);
            if (j <= 0 || j7 >= 0) {
                C12390b.m55563a(timeUnit2, "unit is null");
                C12390b.m55563a(j0Var2, "scheduler is null");
                C12857u1 u1Var = new C12857u1(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, j0Var);
                return C12205a.m54871a((C5929l<T>) u1Var);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final C5929l<T> mo24410b(long j, TimeUnit timeUnit) {
        return mo24411b(j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final C5929l<T> mo24411b(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12631h0 h0Var = new C12631h0(this, j, timeUnit, j0Var);
        return C12205a.m54871a((C5929l<T>) h0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final C5929l<T> mo24418b(C12325a aVar) {
        C12390b.m55563a(aVar, "onFinally is null");
        return C12205a.m54871a((C5929l<T>) new C12775q0<T>(this, aVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26827a(T t, T t2) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        return m26871b((T[]) new Object[]{t, t2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final C5928k0<T> mo24401b(long j) {
        if (j >= 0) {
            return C12205a.m54870a((C5928k0<T>) new C12870v0<T>(this, j, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26828a(T t, T t2, T t3) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        return m26871b((T[]) new Object[]{t, t2, t3});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <U, V> C5929l<V> mo24423b(C12339o<? super T, ? extends Iterable<? extends U>> oVar, C12327c<? super T, ? super U, ? extends V> cVar) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55563a(cVar, "resultSelector is null");
        return mo24344a(C12808s1.m56520a(oVar), cVar, false, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <U, V> C5929l<V> mo24424b(C12339o<? super T, ? extends Iterable<? extends U>> oVar, C12327c<? super T, ? super U, ? extends V> cVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55563a(cVar, "resultSelector is null");
        return mo24344a(C12808s1.m56520a(oVar), cVar, false, m26793R(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26829a(T t, T t2, T t3, T t4) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final <TRight, TLeftEnd, TRightEnd, R> C5929l<R> mo24432b(C6007b<? extends TRight> bVar, C12339o<? super T, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super T, ? super TRight, ? extends R> cVar) {
        C12390b.m55563a(bVar, "other is null");
        C12390b.m55563a(oVar, "leftEnd is null");
        C12390b.m55563a(oVar2, "rightEnd is null");
        C12390b.m55563a(cVar, "resultSelector is null");
        C12872v1 v1Var = new C12872v1(this, bVar, oVar, oVar2, cVar);
        return C12205a.m54871a((C5929l<T>) v1Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26830a(T t, T t2, T t3, T t4, T t5) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24417b(@C5937f C5930q0<? extends T> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12635h2<T>(this, q0Var));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24427b(@C5937f C5941y<? extends T> yVar) {
        C12390b.m55563a(yVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12621g2<T>(this, yVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26831a(T t, T t2, T t3, T t4, T t5, T t6) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        C12390b.m55563a(t6, "The sixth item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5, t6});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final C5929l<T> mo24415b(@C5937f C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12604f2<T>(this, iVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final <U> C5929l<U> mo24433b(Class<U> cls) {
        C12390b.m55563a(cls, "clazz is null");
        return mo24461c(C12351a.m55515b(cls)).mo24369a(cls);
    }

    @C5935d
    @C5939h("none")
    @C5934c
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5922b<T> mo24398b(int i, int i2) {
        C12390b.m55558a(i, "parallelism");
        C12390b.m55558a(i2, "prefetch");
        return C5922b.m26043a((C6007b<? extends T>) this, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26832a(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        C12390b.m55563a(t6, "The sixth item is null");
        C12390b.m55563a(t7, "The seventh item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C12322a<T> mo24440b(C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55867a(mo24248C(), j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24420b(C12328d<? super Integer, ? super Throwable> dVar) {
        C12390b.m55563a(dVar, "predicate is null");
        return C12205a.m54871a((C5929l<T>) new C12587e3<T>(this, dVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24421b(C12329e eVar) {
        C12390b.m55563a(eVar, "stop is null");
        return mo24299a(Long.MAX_VALUE, C12351a.m55510a(eVar));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final C5929l<T> mo24414b(long j, TimeUnit timeUnit, boolean z) {
        return mo24412b(j, timeUnit, C12228b.m55092a(), z);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final C5929l<T> mo24412b(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12650i3 i3Var = new C12650i3(this, j, timeUnit, j0Var, z);
        return C12205a.m54871a((C5929l<T>) i3Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26833a(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        C12390b.m55563a(t6, "The sixth item is null");
        C12390b.m55563a(t7, "The seventh item is null");
        C12390b.m55563a(t8, "The eighth item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24419b(C12327c<T, T, T> cVar) {
        C12390b.m55563a(cVar, "accumulator is null");
        return C12205a.m54871a((C5929l<T>) new C12684k3<T>(this, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <R> C5929l<R> mo24434b(R r, C12327c<R, ? super T, R> cVar) {
        C12390b.m55563a(r, "seed is null");
        return mo24435b(C12351a.m55516b(r), cVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <R> C5929l<R> mo24435b(Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        C12390b.m55563a(callable, "seedSupplier is null");
        C12390b.m55563a(cVar, "accumulator is null");
        return C12205a.m54871a((C5929l<T>) new C12698l3<T>(this, callable, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26834a(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        C12390b.m55563a(t6, "The sixth item is null");
        C12390b.m55563a(t7, "The seventh item is null");
        C12390b.m55563a(t8, "The eighth item is null");
        C12390b.m55563a(t9, "The ninth is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final C12314c mo24438b(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2) {
        return mo24384a(gVar, gVar2, C12351a.f35503c, (C12331g<? super C14063d>) C12817i.INSTANCE);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final C12314c mo24439b(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar) {
        return mo24384a(gVar, gVar2, aVar, (C12331g<? super C14063d>) C12817i.INSTANCE);
    }

    @C5936e
    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final C5929l<T> mo24416b(@C5937f C12282j0 j0Var, boolean z) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54871a((C5929l<T>) new C12910x3<T>(this, j0Var, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <R> C5929l<R> mo24422b(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "bufferSize");
        if (!(this instanceof C12404m)) {
            return C12205a.m54871a((C5929l<T>) new C12938z3<T>(this, oVar, i, z));
        }
        Object call = ((C12404m) this).call();
        if (call == null) {
            return m26794S();
        }
        return C12671j3.m56157a(call, oVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26835a(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C12390b.m55563a(t, "The first item is null");
        C12390b.m55563a(t2, "The second item is null");
        C12390b.m55563a(t3, "The third item is null");
        C12390b.m55563a(t4, "The fourth item is null");
        C12390b.m55563a(t5, "The fifth item is null");
        C12390b.m55563a(t6, "The sixth item is null");
        C12390b.m55563a(t7, "The seventh item is null");
        C12390b.m55563a(t8, "The eighth item is null");
        C12390b.m55563a(t9, "The ninth item is null");
        C12390b.m55563a(t10, "The tenth item is null");
        return m26871b((T[]) new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24408b(long j, long j2, TimeUnit timeUnit) {
        return mo24297a(j, j2, timeUnit, C12228b.m55092a(), false, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24409b(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24297a(j, j2, timeUnit, j0Var, false, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo24413b(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z, int i) {
        return mo24297a(Long.MAX_VALUE, j, timeUnit, j0Var, z, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final <U, V> C5929l<T> mo24431b(C6007b<U> bVar, C12339o<? super T, ? extends C6007b<V>> oVar) {
        C12390b.m55563a(bVar, "firstTimeoutIndicator is null");
        return m26850b(bVar, oVar, null);
    }

    /* renamed from: b */
    private <U, V> C5929l<T> m26850b(C6007b<U> bVar, C12339o<? super T, ? extends C6007b<V>> oVar, C6007b<? extends T> bVar2) {
        C12390b.m55563a(oVar, "itemTimeoutIndicator is null");
        return C12205a.m54871a((C5929l<T>) new C12686k4<T>(this, bVar, oVar, bVar2));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final C5929l<C12241d<T>> mo24436b(TimeUnit timeUnit) {
        return mo24437b(timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: b */
    public final C5929l<C12241d<T>> mo24437b(TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return mo24598u(C12351a.m55508a(timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5929l<T> m26823a(Iterable<? extends C6007b<? extends T>> iterable, int i) {
        return m26898f(iterable).mo24506f(C12351a.m55521e(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5928k0<Boolean> m26797a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C12328d<? super T, ? super T> dVar) {
        return m26798a(bVar, bVar2, dVar, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final <U extends Collection<? super T>> C5928k0<U> mo24406b(Callable<U> callable) {
        C12390b.m55563a(callable, "collectionSupplier is null");
        return C12205a.m54870a((C5928k0<T>) new C12753o4<T>(this, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5928k0<Boolean> m26798a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, C12328d<? super T, ? super T> dVar, int i) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(dVar, "isEqual is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54870a((C5928k0<T>) new C12735n3<T>(bVar, bVar2, dVar, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final <K, V> C5928k0<Map<K, V>> mo24402b(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(oVar2, "valueSelector is null");
        return mo24282a(C13757m.m58731d(), C12351a.m55495a(oVar, oVar2));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final <K, V> C5928k0<Map<K, V>> mo24403b(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(oVar2, "valueSelector is null");
        return mo24282a(callable, C12351a.m55495a(oVar, oVar2));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T> C5928k0<Boolean> m26796a(C6007b<? extends T> bVar, C6007b<? extends T> bVar2, int i) {
        return m26798a(bVar, bVar2, C12390b.m55562a(), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public static <T, D> C5929l<T> m26839a(Callable<? extends D> callable, C12339o<? super D, ? extends C6007b<? extends T>> oVar, C12331g<? super D> gVar) {
        return m26840a(callable, oVar, gVar, true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public static <T, D> C5929l<T> m26840a(Callable<? extends D> callable, C12339o<? super D, ? extends C6007b<? extends T>> oVar, C12331g<? super D> gVar, boolean z) {
        C12390b.m55563a(callable, "resourceSupplier is null");
        C12390b.m55563a(oVar, "sourceSupplier is null");
        C12390b.m55563a(gVar, "disposer is null");
        return C12205a.m54871a((C5929l<T>) new C12784q4<T>(callable, oVar, gVar, z));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: b */
    public final C5928k0<List<T>> mo24405b(Comparator<? super T> comparator) {
        C12390b.m55563a(comparator, "comparator is null");
        return mo24270O().mo24228h(C12351a.m55507a(comparator));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: b */
    public final <B> C5929l<C5929l<T>> mo24429b(C6007b<B> bVar, int i) {
        C12390b.m55563a(bVar, "boundaryIndicator is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12831s4<T>(this, bVar, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, R> C5929l<R> m26812a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C12327c<? super T1, ? super T2, ? extends R> cVar, boolean z) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26806a(C12351a.m55498a(cVar), z, m26793R(), (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final <U, R> C5929l<R> mo24430b(C6007b<? extends U> bVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26852b((C6007b<? extends T1>) this, bVar, cVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T1, T2, R> C5929l<R> m26813a(C6007b<? extends T1> bVar, C6007b<? extends T2> bVar2, C12327c<? super T1, ? super T2, ? extends R> cVar, boolean z, int i) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return m26806a(C12351a.m55498a(cVar), z, i, (C6007b<? extends T>[]) new C6007b[]{bVar, bVar2});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26806a(C12339o<? super Object[], ? extends R> oVar, boolean z, int i, C6007b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m26794S();
        }
        C12390b.m55563a(oVar, "zipper is null");
        C12390b.m55558a(i, "bufferSize");
        C12926y4 y4Var = new C12926y4(bVarArr, null, oVar, i, z);
        return C12205a.m54871a((C5929l<T>) y4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public static <T, R> C5929l<R> m26826a(Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "zipper is null");
        C12390b.m55563a(iterable, "sources is null");
        C12390b.m55558a(i, "bufferSize");
        C12926y4 y4Var = new C12926y4(null, iterable, oVar, i, z);
        return C12205a.m54871a((C5929l<T>) y4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5928k0<Boolean> mo24278a(C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate is null");
        return C12205a.m54870a((C5928k0<T>) new C12612g<T>(this, rVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24355a(C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26845a((C6007b<? extends T>[]) new C6007b[]{this, bVar});
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final <R> R mo24392a(@C5937f C12289m<T, ? extends R> mVar) {
        return ((C12289m) C12390b.m55563a(mVar, "converter is null")).mo42034a(this);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final T mo24391a() {
        C13715d dVar = new C13715d();
        mo24393a((C12297q<? super T>) dVar);
        T a = dVar.mo43092a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final void mo24394a(C12331g<? super T> gVar) {
        Iterator it = mo24441b().iterator();
        while (it.hasNext()) {
            try {
                gVar.mo33410c(it.next());
            } catch (Throwable th) {
                C14398a.m62357b(th);
                ((C12314c) it).dispose();
                throw C13754k.m58724c(th);
            }
        }
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final Iterable<T> mo24390a(int i) {
        C12390b.m55558a(i, "bufferSize");
        return new C12523b(this, i);
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final void mo24395a(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2) {
        C12691l.m56203a(this, gVar, gVar2, C12351a.f35503c);
    }

    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final void mo24396a(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar) {
        C12691l.m56203a(this, gVar, gVar2, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<List<T>> mo24284a(int i, int i2) {
        return mo24285a(i, i2, C13745b.m58690d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U extends Collection<? super T>> C5929l<U> mo24285a(int i, int i2, Callable<U> callable) {
        C12390b.m55558a(i, "count");
        C12390b.m55558a(i2, "skip");
        C12390b.m55563a(callable, "bufferSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12706m<T>(this, i, i2, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U extends Collection<? super T>> C5929l<U> mo24287a(int i, Callable<U> callable) {
        return mo24285a(i, i, callable);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24293a(long j, long j2, TimeUnit timeUnit) {
        return mo24296a(j, j2, timeUnit, C12228b.m55092a(), C13745b.m58690d());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24294a(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24296a(j, j2, timeUnit, j0Var, C13745b.m58690d());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <U extends Collection<? super T>> C5929l<U> mo24296a(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, Callable<U> callable) {
        TimeUnit timeUnit2 = timeUnit;
        C12390b.m55563a(timeUnit2, "unit is null");
        C12282j0 j0Var2 = j0Var;
        C12390b.m55563a(j0Var2, "scheduler is null");
        Callable<U> callable2 = callable;
        C12390b.m55563a(callable2, "bufferSupplier is null");
        C12770q qVar = new C12770q(this, j, j2, timeUnit2, j0Var2, callable2, Integer.MAX_VALUE, false);
        return C12205a.m54871a((C5929l<T>) qVar);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24300a(long j, TimeUnit timeUnit) {
        return mo24305a(j, timeUnit, C12228b.m55092a(), Integer.MAX_VALUE);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24301a(long j, TimeUnit timeUnit, int i) {
        return mo24305a(j, timeUnit, C12228b.m55092a(), i);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24305a(long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        return mo24306a(j, timeUnit, j0Var, i, C13745b.m58690d(), false);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <U extends Collection<? super T>> C5929l<U> mo24306a(long j, TimeUnit timeUnit, C12282j0 j0Var, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        C12390b.m55563a(timeUnit, "unit is null");
        C12282j0 j0Var2 = j0Var;
        C12390b.m55563a(j0Var2, "scheduler is null");
        Callable<U> callable2 = callable;
        C12390b.m55563a(callable2, "bufferSupplier is null");
        int i2 = i;
        C12390b.m55558a(i2, "count");
        C12770q qVar = new C12770q(this, j, j, timeUnit2, j0Var2, callable2, i2, z);
        return C12205a.m54871a((C5929l<T>) qVar);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<List<T>> mo24304a(long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return mo24306a(j, timeUnit, j0Var, Integer.MAX_VALUE, C13745b.m58690d(), false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <TOpening, TClosing> C5929l<List<T>> mo24319a(C5929l<? extends TOpening> lVar, C12339o<? super TOpening, ? extends C6007b<? extends TClosing>> oVar) {
        return mo24320a(lVar, oVar, C13745b.m58690d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <TOpening, TClosing, U extends Collection<? super T>> C5929l<U> mo24320a(C5929l<? extends TOpening> lVar, C12339o<? super TOpening, ? extends C6007b<? extends TClosing>> oVar, Callable<U> callable) {
        C12390b.m55563a(lVar, "openingIndicator is null");
        C12390b.m55563a(oVar, "closingIndicator is null");
        C12390b.m55563a(callable, "bufferSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12722n<T>(this, lVar, oVar, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <B> C5929l<List<T>> mo24356a(C6007b<B> bVar, int i) {
        C12390b.m55558a(i, "initialCapacity");
        return mo24367a(bVar, C12351a.m55512a(i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <B, U extends Collection<? super T>> C5929l<U> mo24367a(C6007b<B> bVar, Callable<U> callable) {
        C12390b.m55563a(bVar, "boundaryIndicator is null");
        C12390b.m55563a(callable, "bufferSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12755p<T>(this, bVar, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <B> C5929l<List<T>> mo24374a(Callable<? extends C6007b<B>> callable) {
        return mo24376a(callable, C13745b.m58690d());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <B, U extends Collection<? super T>> C5929l<U> mo24376a(Callable<? extends C6007b<B>> callable, Callable<U> callable2) {
        C12390b.m55563a(callable, "boundaryIndicatorSupplier is null");
        C12390b.m55563a(callable2, "bufferSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12739o<T>(this, callable, callable2));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <U> C5929l<U> mo24369a(Class<U> cls) {
        C12390b.m55563a(cls, "clazz is null");
        return mo24598u(C12351a.m55506a(cls));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final <U> C5928k0<U> mo24282a(Callable<? extends U> callable, C12326b<? super U, ? super T> bVar) {
        C12390b.m55563a(callable, "initialItemSupplier is null");
        C12390b.m55563a(bVar, "collector is null");
        return C12205a.m54870a((C5928k0<T>) new C12834t<T>(this, callable, bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final <U> C5928k0<U> mo24279a(U u, C12326b<? super U, ? super T> bVar) {
        C12390b.m55563a(u, "initialItem is null");
        return mo24282a(C12351a.m55516b(u), bVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <R> C5929l<R> mo24323a(C12298r<? super T, ? extends R> rVar) {
        return m26913q(((C12298r) C12390b.m55563a(rVar, "composer is null")).mo42051a(this));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24328a(C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo24329a(oVar, 2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24329a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        if (!(this instanceof C12404m)) {
            return C12205a.m54871a((C5929l<T>) new C12886w<T>(this, oVar, i, C13753j.IMMEDIATE));
        }
        Object call = ((C12404m) this).call();
        if (call == null) {
            return m26794S();
        }
        return C12671j3.m56157a(call, oVar);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5925c mo24273a(C12339o<? super T, ? extends C5927i> oVar, boolean z) {
        return mo24274a(oVar, z, 2);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5925c mo24274a(C12339o<? super T, ? extends C5927i> oVar, boolean z, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54863a((C5925c) new C13094a(this, oVar, z ? C13753j.END : C13753j.BOUNDARY, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24335a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        if (this instanceof C12404m) {
            Object call = ((C12404m) this).call();
            if (call == null) {
                return m26794S();
            }
            return C12671j3.m56157a(call, oVar);
        }
        return C12205a.m54871a((C5929l<T>) new C12886w<T>(this, oVar, i, z ? C13753j.END : C13753j.BOUNDARY));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24330a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, int i2) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C12903x xVar = new C12903x(this, oVar, i, i2, C13753j.IMMEDIATE);
        return C12205a.m54871a((C5929l<T>) xVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24331a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, int i2, boolean z) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C12903x xVar = new C12903x(this, oVar, i, i2, z ? C13753j.END : C13753j.BOUNDARY);
        return C12205a.m54871a((C5929l<T>) xVar);
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24322a(@C5937f C5930q0<? extends T> q0Var) {
        C12390b.m55563a(q0Var, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12539c0<T>(this, q0Var));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24354a(@C5937f C5941y<? extends T> yVar) {
        C12390b.m55563a(yVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12525b0<T>(this, yVar));
    }

    @C5936e
    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<T> mo24315a(@C5937f C5927i iVar) {
        C12390b.m55563a(iVar, "other is null");
        return C12205a.m54871a((C5929l<T>) new C12512a0<T>(this, iVar));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24314a(long j, TimeUnit timeUnit, boolean z) {
        return mo24311a(j, timeUnit, C12228b.m55092a(), z);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24311a(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12658j0 j0Var2 = new C12658j0(this, Math.max(0, j), timeUnit, j0Var, z);
        return C12205a.m54871a((C5929l<T>) j0Var2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, V> C5929l<T> mo24360a(C6007b<U> bVar, C12339o<? super T, ? extends C6007b<V>> oVar) {
        return mo24480d(bVar).mo24569l(oVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <K> C5929l<T> mo24351a(C12339o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(callable, "collectionSupplier is null");
        return C12205a.m54871a((C5929l<T>) new C12726n0<T>(this, oVar, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24325a(C12328d<? super T, ? super T> dVar) {
        C12390b.m55563a(dVar, "comparer is null");
        return C12205a.m54871a((C5929l<T>) new C12742o0<T>(this, C12351a.m55521e(), dVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<T> mo24324a(C12325a aVar) {
        return m26804a(C12351a.m55520d(), C12351a.m55520d(), C12351a.f35503c, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    private C5929l<T> m26804a(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12325a aVar2) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        C12390b.m55563a(aVar2, "onAfterTerminate is null");
        C12789r0 r0Var = new C12789r0(this, gVar, gVar2, aVar, aVar2);
        return C12205a.m54871a((C5929l<T>) r0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<T> mo24327a(C12331g<? super C14063d> gVar, C12341q qVar, C12325a aVar) {
        C12390b.m55563a(gVar, "onSubscribe is null");
        C12390b.m55563a(qVar, "onRequest is null");
        C12390b.m55563a(aVar, "onCancel is null");
        return C12205a.m54871a((C5929l<T>) new C12806s0<T>(this, gVar, qVar, aVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<T> mo24353a(C12341q qVar) {
        return mo24327a(C12351a.m55520d(), qVar, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5931s<T> mo24382a(long j) {
        if (j >= 0) {
            return C12205a.m54873a((C5931s<T>) new C12855u0<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5928k0<T> mo24276a(long j, T t) {
        if (j >= 0) {
            C12390b.m55563a(t, "defaultItem is null");
            return C12205a.m54870a((C5928k0<T>) new C12870v0<T>(this, j, t));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24352a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z, int i, int i2) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "bufferSize");
        if (this instanceof C12404m) {
            Object call = ((C12404m) this).call();
            if (call == null) {
                return m26794S();
            }
            return C12671j3.m56157a(call, oVar);
        }
        C12930z0 z0Var = new C12930z0(this, oVar, z, i, i2);
        return C12205a.m54871a((C5929l<T>) z0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24346a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, C12339o<? super Throwable, ? extends C6007b<? extends R>> oVar2, Callable<? extends C6007b<? extends R>> callable) {
        C12390b.m55563a(oVar, "onNextMapper is null");
        C12390b.m55563a(oVar2, "onErrorMapper is null");
        C12390b.m55563a(callable, "onCompleteSupplier is null");
        return m26914r((C6007b<? extends C6007b<? extends T>>) new C12544c2<Object>(this, oVar, oVar2, callable));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24347a(C12339o<? super T, ? extends C6007b<? extends R>> oVar, C12339o<Throwable, ? extends C6007b<? extends R>> oVar2, Callable<? extends C6007b<? extends R>> callable, int i) {
        C12390b.m55563a(oVar, "onNextMapper is null");
        C12390b.m55563a(oVar2, "onErrorMapper is null");
        C12390b.m55563a(callable, "onCompleteSupplier is null");
        return m26887d((C6007b<? extends C6007b<? extends T>>) new C12544c2<Object>(this, oVar, oVar2, callable), i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24340a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        return mo24344a(oVar, cVar, false, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24342a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return mo24344a(oVar, cVar, z, m26793R(), m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24343a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar, boolean z, int i) {
        return mo24344a(oVar, cVar, z, i, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24344a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar, boolean z, int i, int i2) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55563a(cVar, "combiner is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "bufferSize");
        return mo24352a(C12808s1.m56522a(oVar, cVar), z, i, i2);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24341a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar, int i) {
        return mo24344a(oVar, cVar, false, i, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: a */
    public final C12314c mo24385a(C12342r<? super T> rVar, C12331g<? super Throwable> gVar) {
        return mo24386a(rVar, gVar, C12351a.f35503c);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.NONE)
    /* renamed from: a */
    public final C12314c mo24386a(C12342r<? super T> rVar, C12331g<? super Throwable> gVar, C12325a aVar) {
        C12390b.m55563a(rVar, "onNext is null");
        C12390b.m55563a(gVar, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        C13719h hVar = new C13719h(rVar, gVar, aVar);
        mo24393a((C12297q<? super T>) hVar);
        return hVar;
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <K, V> C5929l<C12323b<K, V>> mo24345a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2) {
        return mo24349a(oVar, oVar2, false, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <K, V> C5929l<C12323b<K, V>> mo24348a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, boolean z) {
        return mo24349a(oVar, oVar2, z, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <K, V> C5929l<C12323b<K, V>> mo24349a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, boolean z, int i) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(oVar2, "valueSelector is null");
        C12390b.m55558a(i, "bufferSize");
        C12728n1 n1Var = new C12728n1(this, oVar, oVar2, i, z, null);
        return C12205a.m54871a((C5929l<T>) n1Var);
    }

    @C5935d
    @C5939h("none")
    @C5934c
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <K, V> C5929l<C12323b<K, V>> mo24350a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, boolean z, int i, C12339o<? super C12331g<Object>, ? extends Map<K, Object>> oVar3) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(oVar2, "valueSelector is null");
        C12390b.m55558a(i, "bufferSize");
        C12390b.m55563a(oVar3, "evictingMapFactory is null");
        C12728n1 n1Var = new C12728n1(this, oVar, oVar2, i, z, oVar3);
        return C12205a.m54871a((C5929l<T>) n1Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <TRight, TLeftEnd, TRightEnd, R> C5929l<R> mo24362a(C6007b<? extends TRight> bVar, C12339o<? super T, ? extends C6007b<TLeftEnd>> oVar, C12339o<? super TRight, ? extends C6007b<TRightEnd>> oVar2, C12327c<? super T, ? super C5929l<TRight>, ? extends R> cVar) {
        C12390b.m55563a(bVar, "other is null");
        C12390b.m55563a(oVar, "leftEnd is null");
        C12390b.m55563a(oVar2, "rightEnd is null");
        C12390b.m55563a(cVar, "resultSelector is null");
        C12745o1 o1Var = new C12745o1(this, bVar, oVar, oVar2, cVar);
        return C12205a.m54871a((C5929l<T>) o1Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24321a(C12295p<? extends R, ? super T> pVar) {
        C12390b.m55563a(pVar, "lifter is null");
        return C12205a.m54871a((C5929l<T>) new C12933z1<T>(this, pVar));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24316a(C12282j0 j0Var) {
        return mo24318a(j0Var, false, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24317a(C12282j0 j0Var, boolean z) {
        return mo24318a(j0Var, z, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24318a(C12282j0 j0Var, boolean z, int i) {
        C12390b.m55563a(j0Var, "scheduler is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12667j2<T>(this, j0Var, z, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5929l<T> mo24379a(boolean z) {
        return mo24289a(m26793R(), z, true);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<T> mo24288a(int i, boolean z) {
        return mo24289a(i, z, false);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final C5929l<T> mo24289a(int i, boolean z, boolean z2) {
        C12390b.m55558a(i, "bufferSize");
        C12682k2 k2Var = new C12682k2(this, i, z2, z, C12351a.f35503c);
        return C12205a.m54871a((C5929l<T>) k2Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final C5929l<T> mo24290a(int i, boolean z, boolean z2, C12325a aVar) {
        C12390b.m55563a(aVar, "onOverflow is null");
        C12390b.m55558a(i, "capacity");
        C12682k2 k2Var = new C12682k2(this, i, z2, z, aVar);
        return C12205a.m54871a((C5929l<T>) k2Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<T> mo24286a(int i, C12325a aVar) {
        return mo24290a(i, false, false, aVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final C5929l<T> mo24298a(long j, C12325a aVar, C12199a aVar2) {
        C12390b.m55563a(aVar2, "strategy is null");
        C12390b.m55561a(j, "capacity");
        C12695l2 l2Var = new C12695l2(this, j, aVar, aVar2);
        return C12205a.m54871a((C5929l<T>) l2Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5931s<T> mo24383a(C12327c<T, T, T> cVar) {
        C12390b.m55563a(cVar, "reducer is null");
        return C12205a.m54873a((C5931s<T>) new C12896w2<T>(this, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final <R> C5928k0<R> mo24280a(R r, C12327c<R, ? super T, R> cVar) {
        C12390b.m55563a(r, "seed is null");
        C12390b.m55563a(cVar, "reducer is null");
        return C12205a.m54870a((C5928k0<T>) new C12908x2<T>(this, r, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final <R> C5928k0<R> mo24283a(Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        C12390b.m55563a(callable, "seedSupplier is null");
        C12390b.m55563a(cVar, "reducer is null");
        return C12205a.m54870a((C5928k0<T>) new C12923y2<T>(this, callable, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24326a(C12329e eVar) {
        C12390b.m55563a(eVar, "stop is null");
        return C12205a.m54871a((C5929l<T>) new C12533b3<T>(this, eVar));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24332a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, int i, long j, TimeUnit timeUnit) {
        return mo24333a(oVar, i, j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24333a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55558a(i, "bufferSize");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55861a(C12808s1.m56525a(this, i, j, timeUnit, j0Var), oVar);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24334a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, int i, C12282j0 j0Var) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12390b.m55558a(i, "bufferSize");
        return C12559d3.m55861a(C12808s1.m56524a(this, i), C12808s1.m56521a(oVar, j0Var));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24336a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, long j, TimeUnit timeUnit) {
        return mo24337a(oVar, j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24337a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55861a(C12808s1.m56526a(this, j, timeUnit, j0Var), oVar);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <R> C5929l<R> mo24338a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, C12282j0 j0Var) {
        C12390b.m55563a(oVar, "selector is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55861a(C12808s1.m56523a(this), C12808s1.m56521a(oVar, j0Var));
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C12322a<T> mo24387a(int i, long j, TimeUnit timeUnit) {
        return mo24388a(i, j, timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C12322a<T> mo24388a(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        String str = "bufferSize";
        C12390b.m55558a(i, str);
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12390b.m55558a(i, str);
        return C12559d3.m55865a(this, j, timeUnit, j0Var, i);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C12322a<T> mo24389a(int i, C12282j0 j0Var) {
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12559d3.m55867a(mo24536h(i), j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24299a(long j, C12342r<? super Throwable> rVar) {
        if (j >= 0) {
            C12390b.m55563a(rVar, "predicate is null");
            return C12205a.m54871a((C5929l<T>) new C12607f3<T>(this, j, rVar));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <U> C5929l<T> mo24368a(C6007b<U> bVar, boolean z) {
        C12390b.m55563a(bVar, "sampler is null");
        return C12205a.m54871a((C5929l<T>) new C12638h3<T>(this, bVar, z));
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5929l<T> mo24312a(long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z, int i) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12390b.m55558a(i, "bufferSize");
        C12863u3 u3Var = new C12863u3(this, j, timeUnit, j0Var, i << 1, z);
        return C12205a.m54871a((C5929l<T>) u3Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24373a(Comparator<? super T> comparator) {
        C12390b.m55563a(comparator, "sortFunction");
        return mo24270O().mo24239n().mo24598u(C12351a.m55507a(comparator)).mo24590q(C12351a.m55521e());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24370a(Iterable<? extends T> iterable) {
        return m26868b((C6007b<? extends T>[]) new C6007b[]{m26898f(iterable), this});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24381a(T... tArr) {
        C5929l b = m26871b(tArr);
        if (b == m26794S()) {
            return C12205a.m54871a(this);
        }
        return m26868b((C6007b<? extends T>[]) new C6007b[]{b, this});
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final C12314c mo24384a(C12331g<? super T> gVar, C12331g<? super Throwable> gVar2, C12325a aVar, C12331g<? super C14063d> gVar3) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(gVar2, "onError is null");
        C12390b.m55563a(aVar, "onComplete is null");
        C12390b.m55563a(gVar3, "onSubscribe is null");
        C13723l lVar = new C13723l(gVar, gVar2, aVar, gVar3);
        mo24393a((C12297q<? super T>) lVar);
        return lVar;
    }

    @C5939h("none")
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final void mo24397a(C14062c<? super T> cVar) {
        if (cVar instanceof C12297q) {
            mo24393a((C12297q) cVar);
            return;
        }
        C12390b.m55563a(cVar, "s is null");
        mo24393a((C12297q<? super T>) new C13731t<Object>(cVar));
    }

    @C5939h("none")
    @C5934c
    @C5933b(C5932a.SPECIAL)
    /* renamed from: a */
    public final void mo24393a(C12297q<? super T> qVar) {
        C12390b.m55563a(qVar, "s is null");
        try {
            C14062c a = C12205a.m54878a(this, (C14062c<? super T>) qVar);
            C12390b.m55563a(a, "Plugin returned null Subscriber");
            mo24499e(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24297a(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, boolean z, int i) {
        long j3 = j;
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12390b.m55558a(i, "bufferSize");
        if (j3 >= 0) {
            C12575d4 d4Var = new C12575d4(this, j, j2, timeUnit, j0Var, i, z);
            return C12205a.m54871a((C5929l<T>) d4Var);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<C12241d<T>> mo24377a(TimeUnit timeUnit) {
        return mo24378a(timeUnit, C12228b.m55092a());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final C5929l<C12241d<T>> mo24378a(TimeUnit timeUnit, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "unit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        return C12205a.m54871a((C5929l<T>) new C12673j4<T>(this, timeUnit, j0Var));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <V> C5929l<T> mo24339a(C12339o<? super T, ? extends C6007b<V>> oVar, C5929l<? extends T> lVar) {
        C12390b.m55563a(lVar, "other is null");
        return m26850b(null, oVar, (C6007b<? extends T>) lVar);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24313a(long j, TimeUnit timeUnit, C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26802a(j, timeUnit, bVar, C12228b.m55092a());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo24310a(long j, TimeUnit timeUnit, C12282j0 j0Var, C6007b<? extends T> bVar) {
        C12390b.m55563a(bVar, "other is null");
        return m26802a(j, timeUnit, bVar, j0Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, V> C5929l<T> mo24363a(C6007b<U> bVar, C12339o<? super T, ? extends C6007b<V>> oVar, C6007b<? extends T> bVar2) {
        C12390b.m55563a(bVar, "firstTimeoutSelector is null");
        C12390b.m55563a(bVar2, "other is null");
        return m26850b(bVar, oVar, bVar2);
    }

    /* renamed from: a */
    private C5929l<T> m26802a(long j, TimeUnit timeUnit, C6007b<? extends T> bVar, C12282j0 j0Var) {
        C12390b.m55563a(timeUnit, "timeUnit is null");
        C12390b.m55563a(j0Var, "scheduler is null");
        C12700l4 l4Var = new C12700l4(this, j, timeUnit, j0Var, bVar);
        return C12205a.m54871a((C5929l<T>) l4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final <K, V> C5928k0<Map<K, Collection<V>>> mo24277a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, C12339o<? super K, ? extends Collection<? super V>> oVar3) {
        C12390b.m55563a(oVar, "keySelector is null");
        C12390b.m55563a(oVar2, "valueSelector is null");
        C12390b.m55563a(callable, "mapSupplier is null");
        C12390b.m55563a(oVar3, "collectionFactory is null");
        return mo24282a(callable, C12351a.m55496a(oVar, oVar2, oVar3));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.UNBOUNDED_IN)
    /* renamed from: a */
    public final C5928k0<List<T>> mo24281a(Comparator<? super T> comparator, int i) {
        C12390b.m55563a(comparator, "comparator is null");
        return mo24557k(i).mo24228h(C12351a.m55507a(comparator));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24291a(long j, long j2) {
        return mo24292a(j, j2, m26793R());
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24292a(long j, long j2, int i) {
        C12390b.m55561a(j2, "skip");
        C12390b.m55561a(j, "count");
        C12390b.m55558a(i, "bufferSize");
        C12800r4 r4Var = new C12800r4(this, j, j2, i);
        return C12205a.m54871a((C5929l<T>) r4Var);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24295a(long j, long j2, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        int i2 = i;
        C12390b.m55558a(i2, "bufferSize");
        long j3 = j;
        C12390b.m55561a(j, "timespan");
        long j4 = j2;
        C12390b.m55561a(j4, "timeskip");
        C12282j0 j0Var2 = j0Var;
        C12390b.m55563a(j0Var2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C12390b.m55563a(timeUnit2, "unit is null");
        C12879v4 v4Var = new C12879v4(this, j3, j4, timeUnit2, j0Var2, Long.MAX_VALUE, i2, false);
        return C12205a.m54871a((C5929l<T>) v4Var);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24302a(long j, TimeUnit timeUnit, long j2) {
        return mo24308a(j, timeUnit, C12228b.m55092a(), j2, false);
    }

    @C5935d
    @C5939h("io.reactivex:computation")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24303a(long j, TimeUnit timeUnit, long j2, boolean z) {
        return mo24308a(j, timeUnit, C12228b.m55092a(), j2, z);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24307a(long j, TimeUnit timeUnit, C12282j0 j0Var, long j2) {
        return mo24308a(j, timeUnit, j0Var, j2, false);
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24308a(long j, TimeUnit timeUnit, C12282j0 j0Var, long j2, boolean z) {
        return mo24309a(j, timeUnit, j0Var, j2, z, m26793R());
    }

    @C5935d
    @C5939h("custom")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final C5929l<C5929l<T>> mo24309a(long j, TimeUnit timeUnit, C12282j0 j0Var, long j2, boolean z, int i) {
        int i2 = i;
        C12390b.m55558a(i2, "bufferSize");
        C12282j0 j0Var2 = j0Var;
        C12390b.m55563a(j0Var2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C12390b.m55563a(timeUnit2, "unit is null");
        long j3 = j2;
        C12390b.m55561a(j3, "count");
        C12879v4 v4Var = new C12879v4(this, j, j, timeUnit2, j0Var2, j3, i2, z);
        return C12205a.m54871a((C5929l<T>) v4Var);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <U, V> C5929l<C5929l<T>> mo24361a(C6007b<U> bVar, C12339o<? super U, ? extends C6007b<V>> oVar, int i) {
        C12390b.m55563a(bVar, "openingIndicator is null");
        C12390b.m55563a(oVar, "closingIndicator is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12846t4<T>(this, bVar, oVar, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.ERROR)
    /* renamed from: a */
    public final <B> C5929l<C5929l<T>> mo24375a(Callable<? extends C6007b<B>> callable, int i) {
        C12390b.m55563a(callable, "boundaryIndicatorSupplier is null");
        C12390b.m55558a(i, "bufferSize");
        return C12205a.m54871a((C5929l<T>) new C12865u4<T>(this, callable, i));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24357a(C6007b<? extends U> bVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        C12390b.m55563a(bVar, "other is null");
        C12390b.m55563a(cVar, "combiner is null");
        return C12205a.m54871a((C5929l<T>) new C12900w4<T>(this, cVar, bVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <T1, T2, R> C5929l<R> mo24364a(C6007b<T1> bVar, C6007b<T2> bVar2, C12332h<? super T, ? super T1, ? super T2, R> hVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        return mo24380a((C6007b<?>[]) new C6007b[]{bVar, bVar2}, C12351a.m55499a(hVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <T1, T2, T3, R> C5929l<R> mo24365a(C6007b<T1> bVar, C6007b<T2> bVar2, C6007b<T3> bVar3, C12333i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        return mo24380a((C6007b<?>[]) new C6007b[]{bVar, bVar2, bVar3}, C12351a.m55500a(iVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <T1, T2, T3, T4, R> C5929l<R> mo24366a(C6007b<T1> bVar, C6007b<T2> bVar2, C6007b<T3> bVar3, C6007b<T4> bVar4, C12334j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        C12390b.m55563a(bVar, "source1 is null");
        C12390b.m55563a(bVar2, "source2 is null");
        C12390b.m55563a(bVar3, "source3 is null");
        C12390b.m55563a(bVar4, "source4 is null");
        return mo24380a((C6007b<?>[]) new C6007b[]{bVar, bVar2, bVar3, bVar4}, C12351a.m55501a(jVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <R> C5929l<R> mo24380a(C6007b<?>[] bVarArr, C12339o<? super Object[], R> oVar) {
        C12390b.m55563a(bVarArr, "others is null");
        C12390b.m55563a(oVar, "combiner is null");
        return C12205a.m54871a((C5929l<T>) new C12913x4<T>(this, bVarArr, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.PASS_THROUGH)
    /* renamed from: a */
    public final <R> C5929l<R> mo24372a(Iterable<? extends C6007b<?>> iterable, C12339o<? super Object[], R> oVar) {
        C12390b.m55563a(iterable, "others is null");
        C12390b.m55563a(oVar, "combiner is null");
        return C12205a.m54871a((C5929l<T>) new C12913x4<T>(this, iterable, oVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24371a(Iterable<U> iterable, C12327c<? super T, ? super U, ? extends R> cVar) {
        C12390b.m55563a(iterable, "other is null");
        C12390b.m55563a(cVar, "zipper is null");
        return C12205a.m54871a((C5929l<T>) new C12941z4<T>(this, iterable, cVar));
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24358a(C6007b<? extends U> bVar, C12327c<? super T, ? super U, ? extends R> cVar, boolean z) {
        return m26812a((C6007b<? extends T1>) this, bVar, cVar, z);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final <U, R> C5929l<R> mo24359a(C6007b<? extends U> bVar, C12327c<? super T, ? super U, ? extends R> cVar, boolean z, int i) {
        return m26813a((C6007b<? extends T1>) this, bVar, cVar, z, i);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C12275f<T> mo24275a(long j, boolean z) {
        C12275f<T> fVar = new C12275f<>(j);
        if (z) {
            fVar.cancel();
        }
        mo24393a((C12297q<? super T>) fVar);
        return fVar;
    }
}
