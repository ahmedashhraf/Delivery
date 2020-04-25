package kotlin.p220y0.p221a.p511o.p512a;

import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.C14884c;
import kotlin.p220y0.p221a.C14885d;
import kotlin.p220y0.p221a.C14888e;
import kotlin.p220y0.p221a.C14888e.C14893c;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "CoroutineIntrinsics")
/* renamed from: kotlin.y0.a.o.a.b */
/* compiled from: CoroutineIntrinsics.kt */
public final class C14906b {
    @C6003d
    /* renamed from: a */
    public static final <T> C14884c<T> m66024a(@C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(cVar, "continuation");
        C14905a aVar = (C14905a) (!(cVar instanceof C14905a) ? null : cVar);
        if (aVar == null) {
            return cVar;
        }
        C14884c a = aVar.mo46364a();
        return a != null ? a : cVar;
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14884c<T> m66025a(@C6003d C14888e eVar, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(eVar, "context");
        C14445h0.m62478f(cVar, "continuation");
        C14885d dVar = (C14885d) eVar.mo46338a((C14893c<E>) C14885d.f43131a);
        if (dVar != null) {
            C14884c<T> a = dVar.mo46348a(cVar);
            if (a != null) {
                return a;
            }
        }
        return cVar;
    }
}
