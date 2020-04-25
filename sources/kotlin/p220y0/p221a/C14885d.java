package kotlin.p220y0.p221a;

import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.C14888e.C14891b;
import kotlin.p220y0.p221a.C14888e.C14891b.C14892a;
import kotlin.p220y0.p221a.C14888e.C14893c;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H&¨\u0006\u0007"}, mo24990d2 = {"Lkotlin/coroutines/experimental/ContinuationInterceptor;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/experimental/Continuation;", "T", "continuation", "Key", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.y0.a.d */
/* compiled from: ContinuationInterceptor.kt */
public interface C14885d extends C14891b {

    /* renamed from: a */
    public static final C14887b f43131a = C14887b.f43132a;

    /* renamed from: kotlin.y0.a.d$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C14886a {
        /* renamed from: a */
        public static <R> R m65961a(C14885d dVar, R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar) {
            C14445h0.m62478f(pVar, "operation");
            return C14892a.m65975a(dVar, r, pVar);
        }

        @C6004e
        /* renamed from: a */
        public static <E extends C14891b> E m65962a(C14885d dVar, @C6003d C14893c<E> cVar) {
            C14445h0.m62478f(cVar, "key");
            return C14892a.m65976a((C14891b) dVar, cVar);
        }

        @C6003d
        /* renamed from: a */
        public static C14888e m65963a(C14885d dVar, @C6003d C14888e eVar) {
            C14445h0.m62478f(eVar, "context");
            return C14892a.m65977a((C14891b) dVar, eVar);
        }

        @C6003d
        /* renamed from: b */
        public static C14888e m65964b(C14885d dVar, @C6003d C14893c<?> cVar) {
            C14445h0.m62478f(cVar, "key");
            return C14892a.m65978b(dVar, cVar);
        }
    }

    /* renamed from: kotlin.y0.a.d$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C14887b implements C14893c<C14885d> {

        /* renamed from: a */
        static final /* synthetic */ C14887b f43132a = new C14887b();

        private C14887b() {
        }
    }

    @C6003d
    /* renamed from: a */
    <T> C14884c<T> mo46348a(@C6003d C14884c<? super T> cVar);
}
