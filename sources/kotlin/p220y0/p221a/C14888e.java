package kotlin.p220y0.p221a;

import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, mo24990d2 = {"Lkotlin/coroutines/experimental/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.y0.a.e */
/* compiled from: CoroutineContext.kt */
public interface C14888e {

    /* renamed from: kotlin.y0.a.e$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C14889a {

        /* renamed from: kotlin.y0.a.e$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C14890a extends C14448i0 implements C6084p<C14888e, C14891b, C14888e> {

            /* renamed from: a */
            public static final C14890a f43133a = new C14890a();

            C14890a() {
                super(2);
            }

            @C6003d
            /* renamed from: a */
            public final C14888e mo24962d(@C6003d C14888e eVar, @C6003d C14891b bVar) {
                C14445h0.m62478f(eVar, "acc");
                C14445h0.m62478f(bVar, "element");
                C14888e b = eVar.mo46340b(bVar.getKey());
                if (b == C14895g.f43134b) {
                    return bVar;
                }
                C14885d dVar = (C14885d) b.mo46338a((C14893c<E>) C14885d.f43131a);
                if (dVar == null) {
                    return new C14882b(b, bVar);
                }
                C14888e b2 = b.mo46340b(C14885d.f43131a);
                if (b2 == C14895g.f43134b) {
                    return new C14882b(bVar, dVar);
                }
                return new C14882b(new C14882b(b2, bVar), dVar);
            }
        }

        @C6003d
        /* renamed from: a */
        public static C14888e m65969a(C14888e eVar, @C6003d C14888e eVar2) {
            C14445h0.m62478f(eVar2, "context");
            return eVar2 == C14895g.f43134b ? eVar : (C14888e) eVar2.mo46337a(eVar, C14890a.f43133a);
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, mo24990d2 = {"Lkotlin/coroutines/experimental/CoroutineContext$Element;", "Lkotlin/coroutines/experimental/CoroutineContext;", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/experimental/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.y0.a.e$b */
    /* compiled from: CoroutineContext.kt */
    public interface C14891b extends C14888e {

        /* renamed from: kotlin.y0.a.e$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C14892a {
            @C6004e
            /* renamed from: a */
            public static <E extends C14891b> E m65976a(C14891b bVar, @C6003d C14893c<E> cVar) {
                C14445h0.m62478f(cVar, "key");
                if (bVar.getKey() != cVar) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            @C6003d
            /* renamed from: a */
            public static C14888e m65977a(C14891b bVar, @C6003d C14888e eVar) {
                C14445h0.m62478f(eVar, "context");
                return C14889a.m65969a(bVar, eVar);
            }

            @C6003d
            /* renamed from: b */
            public static C14888e m65978b(C14891b bVar, @C6003d C14893c<?> cVar) {
                C14445h0.m62478f(cVar, "key");
                return bVar.getKey() == cVar ? C14895g.f43134b : bVar;
            }

            /* renamed from: a */
            public static <R> R m65975a(C14891b bVar, R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar) {
                C14445h0.m62478f(pVar, "operation");
                return pVar.mo24962d(r, bVar);
            }
        }

        /* renamed from: a */
        <R> R mo46337a(R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar);

        @C6004e
        /* renamed from: a */
        <E extends C14891b> E mo46338a(@C6003d C14893c<E> cVar);

        @C6003d
        /* renamed from: b */
        C14888e mo46340b(@C6003d C14893c<?> cVar);

        @C6003d
        C14893c<?> getKey();
    }

    /* renamed from: kotlin.y0.a.e$c */
    /* compiled from: CoroutineContext.kt */
    public interface C14893c<E extends C14891b> {
    }

    /* renamed from: a */
    <R> R mo46337a(R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar);

    @C6004e
    /* renamed from: a */
    <E extends C14891b> E mo46338a(@C6003d C14893c<E> cVar);

    @C6003d
    /* renamed from: a */
    C14888e mo46339a(@C6003d C14888e eVar);

    @C6003d
    /* renamed from: b */
    C14888e mo46340b(@C6003d C14893c<?> cVar);
}
