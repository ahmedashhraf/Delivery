package kotlin.p220y0.p221a;

import kotlin.C14737p0;
import kotlin.C14743v;
import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14427e0;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.p222n.C6138b;
import kotlin.p220y0.p221a.p511o.p512a.C14906b;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "CoroutinesKt")
/* renamed from: kotlin.y0.a.f */
/* compiled from: CoroutinesLibrary.kt */
public final class C14894f {
    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <R, T> C14884c<C14737p0> m65980a(@C6003d C6084p<? super R, ? super C14884c<? super T>, ? extends Object> pVar, R r, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(pVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        return new C14896i(C6138b.m28209a(pVar, r, cVar), C6138b.m28215c());
    }

    @C6041f
    @C6096e0(version = "1.2")
    /* renamed from: a */
    public static /* synthetic */ void m65981a() {
    }

    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <R, T> void m65985b(@C6003d C6084p<? super R, ? super C14884c<? super T>, ? extends Object> pVar, R r, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(pVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        C6138b.m28209a(pVar, r, cVar).mo25005b(C14737p0.f42983a);
    }

    @C6096e0(version = "1.1")
    /* renamed from: c */
    private static final <T> Object m65986c(C6080l<? super C14884c<? super T>, C14737p0> lVar, C14884c<? super T> cVar) {
        C14427e0.m62418c(0);
        C14896i iVar = new C14896i(C14906b.m66024a(cVar));
        lVar.invoke(iVar);
        Object a = iVar.mo46352a();
        C14427e0.m62418c(1);
        return a;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static final <T> C14884c<C14737p0> m65979a(@C6003d C6080l<? super C14884c<? super T>, ? extends Object> lVar, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(lVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        return new C14896i(C6138b.m28208a(lVar, cVar), C6138b.m28215c());
    }

    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static final <T> void m65984b(@C6003d C6080l<? super C14884c<? super T>, ? extends Object> lVar, @C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(lVar, "$receiver");
        C14445h0.m62478f(cVar, "completion");
        C6138b.m28208a(lVar, cVar).mo25005b(C14737p0.f42983a);
    }

    @C6041f
    /* renamed from: a */
    private static final void m65982a(C14884c<?> cVar, C6069a<? extends Object> aVar) {
        try {
            Object p = aVar.mo24947p();
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

    /* renamed from: b */
    private static final C14888e m65983b() {
        throw new C14743v("Implemented as intrinsic");
    }
}
