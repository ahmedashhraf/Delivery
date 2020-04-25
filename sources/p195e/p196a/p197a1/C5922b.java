package p195e.p196a.p197a1;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p195e.p196a.C12282j0;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5932a;
import p195e.p196a.p198t0.C5933b;
import p195e.p196a.p198t0.C5934c;
import p195e.p196a.p198t0.C5935d;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5939h;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13759o;
import p195e.p196a.p199x0.p200j.C13760p;
import p195e.p196a.p199x0.p200j.C13770w;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p454e.p460f.C13510a;
import p195e.p196a.p199x0.p454e.p460f.C13512b;
import p195e.p196a.p199x0.p454e.p460f.C13513c;
import p195e.p196a.p199x0.p454e.p460f.C13517d;
import p195e.p196a.p199x0.p454e.p460f.C13521e;
import p195e.p196a.p199x0.p454e.p460f.C13526f;
import p195e.p196a.p199x0.p454e.p460f.C13527g;
import p195e.p196a.p199x0.p454e.p460f.C13528h;
import p195e.p196a.p199x0.p454e.p460f.C13531i;
import p195e.p196a.p199x0.p454e.p460f.C13536j;
import p195e.p196a.p199x0.p454e.p460f.C13539k;
import p195e.p196a.p199x0.p454e.p460f.C13543l;
import p195e.p196a.p199x0.p454e.p460f.C13545m;
import p195e.p196a.p199x0.p454e.p460f.C13547n;
import p195e.p196a.p199x0.p454e.p460f.C13551o;
import p195e.p196a.p199x0.p454e.p460f.C13556p;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12326b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p449w0.C12341q;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

@C5934c
/* renamed from: e.a.a1.b */
/* compiled from: ParallelFlowable */
public abstract class C5922b<T> {
    @C5935d
    /* renamed from: a */
    public static <T> C5922b<T> m26041a(@C5937f C6007b<? extends T> bVar) {
        return m26043a(bVar, Runtime.getRuntime().availableProcessors(), C5929l.m26793R());
    }

    /* renamed from: a */
    public abstract int mo23713a();

    /* renamed from: a */
    public abstract void mo23740a(@C5937f C14062c<? super T>[] cVarArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo23749b(@C5937f C14062c<?>[] cVarArr) {
        int a = mo23713a();
        if (cVarArr.length == a) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("parallelism = ");
        sb.append(a);
        sb.append(", subscribers = ");
        sb.append(cVarArr.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        for (C14062c<?> a2 : cVarArr) {
            C13739g.m58655a((Throwable) illegalArgumentException, a2);
        }
        return false;
    }

    @C5935d
    @C5937f
    /* renamed from: c */
    public final <R> C5922b<R> mo23752c(@C5937f C12339o<? super T, ? extends R> oVar) {
        C12390b.m55563a(oVar, "mapper");
        return C12205a.m54861a((C5922b<T>) new C13536j<T>(this, oVar));
    }

    @C5935d
    @C5937f
    /* renamed from: d */
    public final C5922b<T> mo23754d(@C5937f C12331g<? super C14063d> gVar) {
        C12390b.m55563a(gVar, "onSubscribe is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12331g d3 = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        C13543l lVar = new C13543l(this, d, d2, d3, aVar, aVar, gVar, C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    /* renamed from: a */
    public static <T> C5922b<T> m26042a(@C5937f C6007b<? extends T> bVar, int i) {
        return m26043a(bVar, i, C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C5922b<T> m26043a(@C5937f C6007b<? extends T> bVar, int i, int i2) {
        C12390b.m55563a(bVar, "source");
        C12390b.m55558a(i, "parallelism");
        C12390b.m55558a(i2, "prefetch");
        return C12205a.m54861a((C5922b<T>) new C13528h<T>(bVar, i, i2));
    }

    @C5936e
    @C5935d
    @C5937f
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: c */
    public final C5929l<T> mo23753c() {
        return mo23746b(C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: c */
    public final C5922b<T> mo23751c(@C5937f C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "onNext is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        C13543l lVar = new C13543l(this, gVar, d, d2, aVar, aVar, C12351a.m55520d(), C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo23745b() {
        return mo23735a(C5929l.m26793R());
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> R mo23739a(@C5937f C12202c<T, R> cVar) {
        return ((C12202c) C12390b.m55563a(cVar, "converter is null")).mo41780a(this);
    }

    @C5935d
    @C5937f
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: b */
    public final C5929l<T> mo23746b(int i) {
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13531i<T>(this, i, true));
    }

    @C5935d
    @C5937f
    /* renamed from: d */
    public final <U> U mo23755d(@C5937f C12339o<? super C5922b<T>, U> oVar) {
        try {
            return ((C12339o) C12390b.m55563a(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            throw C13754k.m58724c(th);
        }
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23724a(@C5937f C12339o<? super T, ? extends R> oVar, @C5937f C12201a aVar) {
        C12390b.m55563a(oVar, "mapper");
        C12390b.m55563a(aVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13539k<T>(this, oVar, aVar));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final C5929l<List<T>> mo23747b(@C5937f Comparator<? super T> comparator) {
        return mo23748b(comparator, 16);
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final C5929l<List<T>> mo23748b(@C5937f Comparator<? super T> comparator, int i) {
        C12390b.m55563a(comparator, "comparator is null");
        C12390b.m55558a(i, "capacityHint");
        return C12205a.m54871a(mo23734a(C12351a.m55512a((i / mo23713a()) + 1), C13759o.m58735d()).mo23752c((C12339o<? super T, ? extends R>) new C13770w<Object,Object>(comparator)).mo23736a((C12327c<T, T, T>) new C13760p<T,T,T>(comparator)));
    }

    @C5935d
    @C5937f
    /* renamed from: c */
    public final C5922b<T> mo23750c(@C5937f C12325a aVar) {
        C12390b.m55563a(aVar, "onComplete is null");
        C13543l lVar = new C13543l(this, C12351a.m55520d(), C12351a.m55520d(), C12351a.m55520d(), aVar, C12351a.f35503c, C12351a.m55520d(), C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23725a(@C5937f C12339o<? super T, ? extends R> oVar, @C5937f C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        C12390b.m55563a(oVar, "mapper");
        C12390b.m55563a(cVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13539k<T>(this, oVar, cVar));
    }

    @C5935d
    /* renamed from: a */
    public final C5922b<T> mo23730a(@C5937f C12342r<? super T> rVar) {
        C12390b.m55563a(rVar, "predicate");
        return C12205a.m54861a((C5922b<T>) new C13517d<T>(this, rVar));
    }

    @C5936e
    @C5935d
    /* renamed from: a */
    public final C5922b<T> mo23731a(@C5937f C12342r<? super T> rVar, @C5937f C12201a aVar) {
        C12390b.m55563a(rVar, "predicate");
        C12390b.m55563a(aVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13521e<T>(this, rVar, aVar));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final C5922b<T> mo23742b(@C5937f C12331g<Throwable> gVar) {
        C12390b.m55563a(gVar, "onError is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        C13543l lVar = new C13543l(this, d, d2, gVar, aVar, aVar, C12351a.m55520d(), C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5936e
    @C5935d
    /* renamed from: a */
    public final C5922b<T> mo23732a(@C5937f C12342r<? super T> rVar, @C5937f C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        C12390b.m55563a(rVar, "predicate");
        C12390b.m55563a(cVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13521e<T>(this, rVar, cVar));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23715a(@C5937f C12282j0 j0Var) {
        return mo23716a(j0Var, C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23716a(@C5937f C12282j0 j0Var, int i) {
        C12390b.m55563a(j0Var, "scheduler");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54861a((C5922b<T>) new C13551o<T>(this, j0Var, i));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final C5922b<T> mo23741b(@C5937f C12325a aVar) {
        C12390b.m55563a(aVar, "onCancel is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12331g d3 = C12351a.m55520d();
        C12325a aVar2 = C12351a.f35503c;
        C13543l lVar = new C13543l(this, d, d2, d3, aVar2, aVar2, C12351a.m55520d(), C12351a.f35507g, aVar);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5929l<T> mo23736a(@C5937f C12327c<T, T, T> cVar) {
        C12390b.m55563a(cVar, "reducer");
        return C12205a.m54871a((C5929l<T>) new C13547n<T>(this, cVar));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23734a(@C5937f Callable<R> callable, @C5937f C12327c<R, ? super T, R> cVar) {
        C12390b.m55563a(callable, "initialSupplier");
        C12390b.m55563a(cVar, "reducer");
        return C12205a.m54861a((C5922b<T>) new C13545m<T>(this, callable, cVar));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final <R> C5922b<R> mo23743b(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo23728a(oVar, false, Integer.MAX_VALUE, C5929l.m26793R());
    }

    @C5935d
    @C5937f
    @C5939h("none")
    @C5933b(C5932a.FULL)
    /* renamed from: a */
    public final C5929l<T> mo23735a(int i) {
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54871a((C5929l<T>) new C13531i<T>(this, i, false));
    }

    @C5935d
    @C5937f
    /* renamed from: b */
    public final <R> C5922b<R> mo23744b(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z) {
        return mo23728a(oVar, z, Integer.MAX_VALUE, C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5929l<T> mo23737a(@C5937f Comparator<? super T> comparator) {
        return mo23738a(comparator, 16);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5929l<T> mo23738a(@C5937f Comparator<? super T> comparator, int i) {
        C12390b.m55563a(comparator, "comparator is null");
        C12390b.m55558a(i, "capacityHint");
        return C12205a.m54871a((C5929l<T>) new C13556p<T>(mo23734a(C12351a.m55512a((i / mo23713a()) + 1), C13759o.m58735d()).mo23752c((C12339o<? super T, ? extends R>) new C13770w<Object,Object>(comparator)), comparator));
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23719a(@C5937f C12331g<? super T> gVar, @C5937f C12201a aVar) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(aVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13513c<T>(this, gVar, aVar));
    }

    @C5936e
    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23720a(@C5937f C12331g<? super T> gVar, @C5937f C12327c<? super Long, ? super Throwable, C12201a> cVar) {
        C12390b.m55563a(gVar, "onNext is null");
        C12390b.m55563a(cVar, "errorHandler is null");
        return C12205a.m54861a((C5922b<T>) new C13513c<T>(this, gVar, cVar));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23718a(@C5937f C12331g<? super T> gVar) {
        C12390b.m55563a(gVar, "onAfterNext is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        C13543l lVar = new C13543l(this, d, gVar, d2, aVar, aVar, C12351a.m55520d(), C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23717a(@C5937f C12325a aVar) {
        C12390b.m55563a(aVar, "onAfterTerminate is null");
        C13543l lVar = new C13543l(this, C12351a.m55520d(), C12351a.m55520d(), C12351a.m55520d(), C12351a.f35503c, aVar, C12351a.m55520d(), C12351a.f35507g, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final C5922b<T> mo23729a(@C5937f C12341q qVar) {
        C12390b.m55563a(qVar, "onRequest is null");
        C12331g d = C12351a.m55520d();
        C12331g d2 = C12351a.m55520d();
        C12331g d3 = C12351a.m55520d();
        C12325a aVar = C12351a.f35503c;
        C13543l lVar = new C13543l(this, d, d2, d3, aVar, aVar, C12351a.m55520d(), qVar, C12351a.f35503c);
        return C12205a.m54861a((C5922b<T>) lVar);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <C> C5922b<C> mo23733a(@C5937f Callable<? extends C> callable, @C5937f C12326b<? super C, ? super T> bVar) {
        C12390b.m55563a(callable, "collectionSupplier is null");
        C12390b.m55563a(bVar, "collector is null");
        return C12205a.m54861a((C5922b<T>) new C13510a<T>(this, callable, bVar));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public static <T> C5922b<T> m26044a(@C5937f C6007b<T>... bVarArr) {
        if (bVarArr.length != 0) {
            return C12205a.m54861a((C5922b<T>) new C13527g<T>(bVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <U> C5922b<U> mo23714a(@C5937f C12203d<T, U> dVar) {
        return C12205a.m54861a(((C12203d) C12390b.m55563a(dVar, "composer is null")).mo41781a(this));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23727a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z, int i) {
        return mo23728a(oVar, z, i, C5929l.m26793R());
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23728a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z, int i, int i2) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "maxConcurrency");
        C12390b.m55558a(i2, "prefetch");
        C13526f fVar = new C13526f(this, oVar, z, i, i2);
        return C12205a.m54861a((C5922b<T>) fVar);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23721a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar) {
        return mo23722a(oVar, 2);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23722a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54861a((C5922b<T>) new C13512b<T>(this, oVar, i, C13753j.IMMEDIATE));
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23726a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, boolean z) {
        return mo23723a(oVar, 2, z);
    }

    @C5935d
    @C5937f
    /* renamed from: a */
    public final <R> C5922b<R> mo23723a(@C5937f C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
        C12390b.m55563a(oVar, "mapper is null");
        C12390b.m55558a(i, "prefetch");
        return C12205a.m54861a((C5922b<T>) new C13512b<T>(this, oVar, i, z ? C13753j.END : C13753j.BOUNDARY));
    }
}
