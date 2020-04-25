package kotlin.p220y0.p221a.p222n;

import kotlin.C14737p0;
import kotlin.C14743v;
import kotlin.C6049b;
import kotlin.C6093c;
import kotlin.C6094c0;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14427e0;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14461m1;
import kotlin.p220y0.p221a.C14884c;
import kotlin.p220y0.p221a.C14888e;
import kotlin.p220y0.p221a.p511o.p512a.C14905a;
import kotlin.p220y0.p221a.p511o.p512a.C14906b;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\f2\u0010\b\u0004\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\b\u001a5\u0010\u0012\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u001c\b\u0004\u0010\u0010\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013HHø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a5\u0010\u0015\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u001c\b\u0004\u0010\u0010\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013HHø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001aD\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f\"\u0004\b\u0000\u0010\u000e*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a]\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u000e*#\b\u0001\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019¢\u0006\u0002\b\u001a2\u0006\u0010\u001b\u001a\u0002H\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\fH\b\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\u00020\u00078Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\t¨\u0006\u001e"}, mo24990d2 = {"COROUTINE_SUSPENDED", "", "COROUTINE_SUSPENDED$annotations", "()V", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", "coroutineContext", "Lkotlin/coroutines/experimental/CoroutineContext;", "coroutineContext$annotations", "getCoroutineContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "buildContinuationByInvokeCall", "Lkotlin/coroutines/experimental/Continuation;", "", "T", "completion", "block", "Lkotlin/Function0;", "suspendCoroutineOrReturn", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "suspendCoroutineUninterceptedOrReturn", "createCoroutineUnchecked", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "intercepted", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "IntrinsicsKt")
/* renamed from: kotlin.y0.a.n.b */
/* compiled from: Intrinsics.kt */
public final class C6138b {
    @C6003d

    /* renamed from: a */
    private static final Object f17327a = new Object();

    /* renamed from: kotlin.y0.a.n.b$a */
    /* compiled from: Intrinsics.kt */
    public static final class C6139a implements C14884c<C14737p0> {

        /* renamed from: a */
        final /* synthetic */ C14884c f17328a;

        /* renamed from: b */
        final /* synthetic */ C6069a f17329b;

        public C6139a(C14884c cVar, C6069a aVar) {
            this.f17328a = cVar;
            this.f17329b = aVar;
        }

        /* renamed from: a */
        public void mo25005b(@C6003d C14737p0 p0Var) {
            C14445h0.m62478f(p0Var, "value");
            C14884c cVar = this.f17328a;
            try {
                Object p = this.f17329b.mo24947p();
                if (p == C6138b.m28215c()) {
                    return;
                }
                if (cVar != null) {
                    cVar.mo25005b(p);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
            } catch (Throwable th) {
                cVar.mo25003a(th);
            }
        }

        @C6003d
        /* renamed from: c */
        public C14888e mo25006c() {
            return this.f17328a.mo25006c();
        }

        /* renamed from: a */
        public void mo25003a(@C6003d Throwable th) {
            C14445h0.m62478f(th, "exception");
            this.f17328a.mo25003a(th);
        }
    }

    /* renamed from: kotlin.y0.a.n.b$b */
    /* compiled from: Intrinsics.kt */
    public static final class C6140b implements C14884c<C14737p0> {

        /* renamed from: N */
        final /* synthetic */ C14884c f17330N;

        /* renamed from: a */
        final /* synthetic */ C14884c f17331a;

        /* renamed from: b */
        final /* synthetic */ C6080l f17332b;

        public C6140b(C14884c cVar, C6080l lVar, C14884c cVar2) {
            this.f17331a = cVar;
            this.f17332b = lVar;
            this.f17330N = cVar2;
        }

        /* renamed from: a */
        public void mo25005b(@C6003d C14737p0 p0Var) {
            C14445h0.m62478f(p0Var, "value");
            C14884c cVar = this.f17331a;
            try {
                C6080l lVar = this.f17332b;
                if (lVar != null) {
                    Object invoke = ((C6080l) C14461m1.m62528a((Object) lVar, 1)).invoke(this.f17330N);
                    if (invoke == C6138b.m28215c()) {
                        return;
                    }
                    if (cVar != null) {
                        cVar.mo25005b(invoke);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th) {
                cVar.mo25003a(th);
            }
        }

        @C6003d
        /* renamed from: c */
        public C14888e mo25006c() {
            return this.f17331a.mo25006c();
        }

        /* renamed from: a */
        public void mo25003a(@C6003d Throwable th) {
            C14445h0.m62478f(th, "exception");
            this.f17331a.mo25003a(th);
        }
    }

    /* renamed from: kotlin.y0.a.n.b$c */
    /* compiled from: Intrinsics.kt */
    public static final class C6141c implements C14884c<C14737p0> {

        /* renamed from: N */
        final /* synthetic */ Object f17333N;

        /* renamed from: O */
        final /* synthetic */ C14884c f17334O;

        /* renamed from: a */
        final /* synthetic */ C14884c f17335a;

        /* renamed from: b */
        final /* synthetic */ C6084p f17336b;

        public C6141c(C14884c cVar, C6084p pVar, Object obj, C14884c cVar2) {
            this.f17335a = cVar;
            this.f17336b = pVar;
            this.f17333N = obj;
            this.f17334O = cVar2;
        }

        /* renamed from: a */
        public void mo25005b(@C6003d C14737p0 p0Var) {
            C14445h0.m62478f(p0Var, "value");
            C14884c cVar = this.f17335a;
            try {
                C6084p pVar = this.f17336b;
                if (pVar != null) {
                    Object d = ((C6084p) C14461m1.m62528a((Object) pVar, 2)).mo24962d(this.f17333N, this.f17334O);
                    if (d == C6138b.m28215c()) {
                        return;
                    }
                    if (cVar != null) {
                        cVar.mo25005b(d);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th) {
                cVar.mo25003a(th);
            }
        }

        @C6003d
        /* renamed from: c */
        public C14888e mo25006c() {
            return this.f17335a.mo25006c();
        }

        /* renamed from: a */
        public void mo25003a(@C6003d Throwable th) {
            C14445h0.m62478f(th, "exception");
            this.f17335a.mo25003a(th);
        }
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    private static final <T> C14884c<T> m28210a(@C6003d C14884c<? super T> cVar) {
        throw new C14743v("Implementation of intercepted is intrinsic");
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static /* synthetic */ void m28212a() {
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <T> Object m28213b(C6080l<? super C14884c<? super T>, ? extends Object> lVar, C14884c<? super T> cVar) {
        C14427e0.m62418c(0);
        Object invoke = lVar.invoke(C14906b.m66024a(cVar));
        C14427e0.m62418c(1);
        return invoke;
    }

    @C6096e0(version = "1.2")
    @C6049b(level = C6093c.ERROR, message = "Use kotlin.coroutines.experimental.coroutineContext instead", replaceWith = @C6094c0(expression = "kotlin.coroutines.experimental.coroutineContext", imports = {}))
    /* renamed from: b */
    public static /* synthetic */ void m28214b() {
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: c */
    private static final <T> Object m28216c(C6080l<? super C14884c<? super T>, ? extends Object> lVar, C14884c<? super T> cVar) {
        throw new C14743v("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }

    @C6003d
    /* renamed from: d */
    public static final C14888e m28217d() {
        throw new C14743v("Implemented as intrinsic");
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T> C14884c<C14737p0> m28208a(@C6003d C6080l<? super C14884c<? super T>, ? extends Object> lVar, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(lVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        if (!(lVar instanceof C14905a)) {
            return C14906b.m66025a(cVar.mo25006c(), new C6140b(cVar, lVar, cVar));
        }
        C14884c a = ((C14905a) lVar).mo46365a(cVar);
        if (a != null) {
            return ((C14905a) a).mo46364a();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl");
    }

    @C6003d
    /* renamed from: c */
    public static final Object m28215c() {
        return f17327a;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <R, T> C14884c<C14737p0> m28209a(@C6003d C6084p<? super R, ? super C14884c<? super T>, ? extends Object> pVar, R r, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(pVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        if (!(pVar instanceof C14905a)) {
            return C14906b.m66025a(cVar.mo25006c(), new C6141c(cVar, pVar, r, cVar));
        }
        C14884c a = ((C14905a) pVar).mo45824a((Object) r, cVar);
        if (a != null) {
            return ((C14905a) a).mo46364a();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl");
    }

    /* renamed from: a */
    private static final <T> C14884c<C14737p0> m28211a(C14884c<? super T> cVar, C6069a<? extends Object> aVar) {
        return C14906b.m66025a(cVar.mo25006c(), new C6139a(cVar, aVar));
    }
}
